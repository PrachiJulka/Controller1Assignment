package com.ttn.linksharing
/*If user is not found then flash.error is set to 'User not found' and flash.error
 is rendered - Urlmapping is updated for / action to controller login action index
*/

class LoginController {

    def index() {

      }

    def logout() {
        session.invalidate()
        redirect(action:'login/index')
    }

    def loginHandler(String userName, String password) {
        println(userName)
        User user = User.findByUserNameAndPassword(userName, password)
        if(user!=null) {

            if(user.active) {
             session.user=user
                forward(controller: 'user', action: 'index')

            }
            else {
               flash.error = "Your account is not active"

            }
        }
        else
        {
            flash.error="User not found"
        }
        render(view:'index')


    }

}

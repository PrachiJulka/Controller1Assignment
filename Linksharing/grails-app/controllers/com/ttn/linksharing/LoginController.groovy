package com.ttn.linksharing
/*If Loginhandler action finds user with given username and
 password then it will check user active or
 not if active set session.user to user and redirect request to login index action
*/

class LoginController {

    def index() {

        if(session.user)
            forward(controller: 'user',action:'index')
        else
            render( 'failure')
    }

    def logout(){
        session.invalidate()
        redirect(action:'index')
    }

    def loginHandler(String userName,String password){
        println(userName)
        User user=User.findByUserNameAndPassword(userName,password)
        if(user!=null) {
            if(user.active) {
            session.user=user
            redirect(action: 'index')
            }
        }
        else
            redirect(action:'index')
    }
}

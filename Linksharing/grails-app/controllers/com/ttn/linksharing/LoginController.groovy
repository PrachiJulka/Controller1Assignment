package com.ttn.linksharing
/*
LoginController loginHandler action will take 2 argument username and password
*/

class LoginController {

    def index() {

        if(session.user)
            forward(controller: 'login',action:'index')
        else
            render( 'failure')
    }

    def logout(){
        session.invalidate()
        redirect(action:'index')
    }

    def loginHandler(String userName,String password){


        redirect(action:'index')
    }
}

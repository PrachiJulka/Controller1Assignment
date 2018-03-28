package com.ttn.linksharing
/*
Login Controller logout action will do session.invalidate
 and forward the request to login controller index action
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

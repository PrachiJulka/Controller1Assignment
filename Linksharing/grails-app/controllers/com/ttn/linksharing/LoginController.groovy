package com.ttn.linksharing
/*
LoginController index action will check if there is session.user exists or not if exist
forward to user controller index action else render failure
*/

class LoginController {

    def index() {

        if(session.user)
            forward(controller: 'login',action:'index')
        else
            render( 'failure')
    }

    def logout(){
        redirect(action:'/')
    }

    def loginHandler(){


        redirect(action:'index')
    }
}

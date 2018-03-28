package com.ttn.linksharing
/*
Add logincontroller with index,loginHandler and logout action
*/

class LoginController {

    def index() { }

    def logout(){
        redirect(action:'index')
    }

    def loginHandler(){
        redirect(action:'index')
    }
}

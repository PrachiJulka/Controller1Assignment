package com.ttn.linksharing
/*
If topic do not exist in database then user should redirected to
login index action and flash error should be set
*/
class UserController {

    def index() {
        render(session.user.userName)
    }

    def show(Integer id){

        if(Topic.findAllById(id).size()==0) {
            flash.error="No Topics Found"
            redirect(controller:"login",action:"index")
        }

        render("Topics Found")
    }
}

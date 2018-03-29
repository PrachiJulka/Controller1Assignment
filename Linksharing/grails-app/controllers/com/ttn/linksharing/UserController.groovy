package com.ttn.linksharing
/*
If topic found and its a public topic then it should render sucess
*/
class UserController {

    def index() {
        render(session.user.userName)
    }

    def show(Integer id){

        if(!Topic.findByIdAndVisibility(id,Visibility.PUBLIC)) {
            flash.error="No Topics Found"
            redirect(controller:"login",action:"index")
        }

            render("sucess")


    }
}

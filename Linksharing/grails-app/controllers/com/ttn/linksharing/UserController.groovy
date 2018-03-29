package com.ttn.linksharing
//Update test case for usercontroller index action
// Add show action for topic which will take id as a parameter
class UserController {

    def index() {
        render(session.user.userName)
    }

    def show(Integer id){

    }
}

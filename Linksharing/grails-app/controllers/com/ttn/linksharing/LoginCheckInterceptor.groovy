package com.ttn.linksharing

//Create loginCheck interceptor which will work all the controller except login
class LoginCheckInterceptor {

    LoginCheckInterceptor(){
        matchAll().excludes(controller: 'login', action: 'loginHandler')
    }

    boolean before() {
        if (!session.user) {
            flash.error= "NO ACTIVE SESSION"
            return false
        }

        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}

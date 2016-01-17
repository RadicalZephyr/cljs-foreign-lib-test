(ns foreign-lib-test.main
  (:require [closure.greetings :as cg]
            #_[es6.greetings :as es6g]))

(.log js/console (cg/hello "World!"))

#_(.log js/console (es6g/hello "World from ES6!"))

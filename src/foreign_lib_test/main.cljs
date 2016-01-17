(ns foreign-lib-test.main
  (:require [closure.greetings :as cg]
            [es6.greetings :as es6g]))

(.log js/console (cg/hello "World!"))

(.log js/console (es6g/hello "World from ES6!"))

(ns foreign-lib-test.core
  (:gen-class)
  (:require [compojure.core :as c]
            [compojure.route :as route]
            [hiccup.page :as page]))

(c/defroutes handler
  (c/GET "/" []
    (page/html5
     [:head]
     [:body
      [:div.row
       [:div#app.small-12.columns]]
      [:input#history_state {:type "hidden"}]
      (page/include-js "js/compiled/main.js")]))

  (route/resources "/"))

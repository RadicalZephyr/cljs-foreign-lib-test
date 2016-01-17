(defproject foreign-lib-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]

                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]

                 [org.clojure/clojurescript "1.7.170"]]
  :main ^:skip-aot foreign-lib-test.core
  :target-path "target/%s"

  :plugins [[lein-ring "0.9.7"]
            [lein-cljsbuild "1.1.2"]]

  :ring {:handler foreign-lib-test.core/handler}

  :cljsbuild {:builds
              {:client
               {:source-paths ["src"]
                :compiler
                {:main "foreign-lib-test.main"
                 :optimizations :none
                 :source-map true
                 :source-map-timestamp true
                 :output-to  "resources/public/js/compiled/main.js"
                 :output-dir "resources/public/js/compiled/out"
                 :foreign-libs [{:file "libs/greetings.js"
                                 :provides ["es6.greetings"]
                                 :module-type :es6}]
                 :libs ["libs/cgreetings.js"]
                 :asset-path "js/compiled/out"}}}}

  :profiles {:uberjar {:aot :all}})

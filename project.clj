(defproject gorilla-quickstart "0.1.0-SNAPSHOT"
  :description "A test project for Gorilla REPL."
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot gorilla-quickstart.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.4"]]
  :profiles {:uberjar {:aot :all}})

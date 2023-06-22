(defproject beholder "0.1.0"
  :dependencies
  [[org.clojure/clojure "1.11.1"]
   [prismatic/schema "1.4.1"]
   [jarohen/chime "0.3.3"]
   [nubank/k8s-api "0.1.2"]
   [io.fabric8/kubernetes-client "6.3.1"]
   [cc.qbits/spandex "0.7.10"]
   [jarohen/chime "0.3.3"]
   [etaoin "1.0.39"]
   [compojure "1.6.3"]
   [ring/ring-defaults "0.3.4"]
   [ring-json-response "0.2.0"]
   [metosin/ring-http-response "0.9.3"]
   [selmer "1.12.55"]
   [environ "1.2.0"]
   [clj-soup/clojure-soup "0.1.3"]
   [clj-http "3.12.3"]
   [org.clojure/data.json "2.4.0"]
   
   [clj-test-containers "0.7.4"]
   [ring/ring-mock "0.4.0"]
   
   [com.taoensso/timbre "6.1.0"]]

  :plugins
  [[lein-environ "1.2.0"]
   [lein-ring "0.12.6"]
   [lein-eftest "0.6.0"]
   [cider/cider-nrepl "0.30.0"]])

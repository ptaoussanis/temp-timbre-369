(ns beholder.handlers
  (:require
   [clj-http.client :as client]
   [clojure.string :refer [split]]
   [compojure.core :refer :all]
   [compojure.route :as route]
   [ring.middleware.defaults :refer [wrap-defaults]]
   [ring.util.http-response :refer :all]
   [taoensso.timbre :as log]))

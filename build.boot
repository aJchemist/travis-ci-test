(def +project+ 'ajchemist.travis-ci-test/dockerfiles)

(def +dependencies+
  '[
    [org.clojure/clojure "1.9.0"]
    [org.clojure/core.async "0.4.474"]
    [org.clojure/core.incubator "0.1.4"]

    [integrant "0.6.3"]

    [com.fzakaria/slf4j-timbre "0.3.8"]
    [org.slf4j/log4j-over-slf4j "1.7.22"]
    [org.slf4j/jul-to-slf4j "1.7.22"]
    [org.slf4j/jcl-over-slf4j "1.7.22"]

    [ring/ring-core "1.6.3"]
    [clj-http "3.7.0"]
    [cheshire "5.8.0"]
    [buddy "2.0.0"]

    [digest "1.4.6"]
    [clj-time "0.14.2"]

    [org.clojure/tools.nrepl "0.2.13"]
    ])

(set-env!
 :source-paths #{"src/main"}
 :dependencies +dependencies+)

(ns boot.user
  (:require
   [clojure.spec.alpha :as s]
   [clojure.core.strint :refer [<<]]
   [clojure.java.shell :as jsh]
   )
  (:import
   java.io.File
   java.util.Date
   java.text.SimpleDateFormat
   ))

;; Local Variables:
;; compile-command: ""
;; End:

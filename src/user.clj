(ns user
  (:require [clojure.pprint :as pprint]))

(defn exec []
  (eval (read)))

(defn slrp []
  (pprint/with-pprint-dispatch pprint/code-dispatch
    (pprint/pprint (concat (read) [(read)]))))

(ns quicksort
  (:require [clojure.string :as str]))

(defn qsort [xs]
  (if (apply < xs) xs (recur (shuffle xs))))

(ns exercise2)

(defn only-greater-than-five 
    "filter only grater than five"
    [l]
    (filter (fn [x] (> x 5)) l))
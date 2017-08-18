(ns exercise3)

(defn fibonacci
    [n]
    (cond
        (= n 0) 0
        (= n 1) 1
        (> n 1) (+ (fibonacci (- n 1)) (fibonacci (- n 2)))
        :else (throw (Exception. "undefined for negatives"))
    )
)
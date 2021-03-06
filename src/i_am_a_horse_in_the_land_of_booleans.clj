(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false ))


(defn abs [n] (if (< n 0) (* n -1) n))

(defn divides? [divisor n] (if (= (mod n divisor) 0) true false ))

(defn fizzbuzz [n] ( cond (= (mod n 15) 0) "gotcha!"
                          (= (mod n 5) 0) "buzz"
                          (= (mod n 3) 0) "fizz"
                         :else ""))


(defn teen? [age] (< 12 age 20))


(defn not-teen? [age] (if (teen? age) false true)  )

(defn generic-doublificate [x] (cond (number? x)  (* x 2)
                                     (empty? x) nil
                                     (list? x) (* (count x) 2)
                                     (vector? x) (* (count x) 2)
                                     :else true))

(defn leap-year? [year] (cond (= (mod year 400) 0) true
                              (= (mod year 100) 0) false
                              (= (mod year 4) 0) true
                              :else false
                              ))

; '_______'

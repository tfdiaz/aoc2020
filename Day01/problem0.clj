(ns clojure.examples.hello
   (:gen-class))

(defn find-pair
   [v]
   (loop [i 0
         j 1
         ]
      (if (= 2020 (+ (nth v i) (nth v j)))
         (* (nth v i) (nth v j))
         (if (= j (dec (count v)))
            (recur (inc i) (-> i inc inc))
            (recur i (inc j))))))

(defn Example []
   (let [file-contents (slurp "input.txt")
         nums-as-strings (clojure.string/split-lines file-contents)
         numbers (map read-string nums-as-strings)]

      (println (find-pair numbers))
   )
)
(Example)
(defn find-pair
	[v]
	(for [x1 v
			x2 (drop 1 v)
			x3 (drop 2 v)
			:let [y (* x1 x2 x3)]
			:when (= 2020 (+ x1 x2 x3))]
	y))


(defn Example []
   (let [file-contents (slurp "input.txt")
         nums-as-strings (clojure.string/split-lines file-contents)
         numbers (map read-string nums-as-strings)]

      (println (find-pair numbers))
   )
)
(Example)
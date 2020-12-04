(defn Main []
	(let [file-contents (slurp "input.txt")
		lines (clojure.string/split-lines file-contents)]
		(println lines)))

(Main)
(defn findTree [line index]
	(if (= (str "#") (str (nth line (mod index (count line)))))
		1
		0))

(defn parse
	[v]
	(for [i (range (count v))
		:let [index (* i 3)
			line (nth v i)
			treeHit (findTree line index) ]]
	treeHit))


(defn Main []
	(let [file-contents (slurp "input.txt")
		  lines (clojure.string/split-lines file-contents)
		  count (parse lines)]
 
	   (println (reduce + count))
	))
 (Main)
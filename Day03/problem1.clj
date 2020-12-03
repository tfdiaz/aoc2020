(defn findTree [line index]
	(let [i (mod index (count line))]
		(if (= (str "#") (str (nth line i)))
			1
			0)))

(defn parse
	[v right down]
	(reduce + 
		(for [i (range 0 (count v) down)
			:let [index (* (/ i down) right)
				line (nth v i)
				treeHit (findTree line index) ]]
		treeHit)))


(defn Main []
	(let [file-contents (slurp "input.txt")
		  lines (clojure.string/split-lines file-contents)
		  c1 (parse lines 1 1)
		  c2 (parse lines 3 1)
		  c3 (parse lines 5 1)
		  c4 (parse lines 7 1)
		  c5 (parse lines 1 2)]
 
	   (println (* c1 c2 c3 c4 c5))
	))
 (Main)
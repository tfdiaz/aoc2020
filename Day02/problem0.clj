(ns clojure.examples.hello
   (:gen-class))


(defn mySplit [string]
	(clojure.string/split string #" "))

(defn splitnum [string]
	(clojure.string/split string #"-"))

(defn removeColn [string]
	(first (clojure.string/split string #":")))

(defn myFilter [string letter]
	(filter (string (Character/isLetter string)) letter))

(defn myCheck [args]
	(let [ range (map read-string (splitnum (nth args 0)))
			letterFull (nth args 1)
			letter (removeColn letterFull)
			password (nth args 2)
			numOfLetter (count (filter (fn [x] (= (str letter) (str x))) password))]
		; (println numOfLetter)
		(if (<= (nth range 0) numOfLetter (nth range 1))
			1
			0)
			
			))

(defn Example []
   (let [file-contents (slurp "input.txt")
         aline (clojure.string/split-lines file-contents)
         args (map mySplit aline)]

      (println (reduce + (map myCheck args))))
   )
(Example)
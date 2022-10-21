;;RAFAEL BAUER SAMPAIO

;; 1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn ultimo
  "retorna o ultimo elemento de uma lista"
  [lista]
  (nth lista (- (count lista) 1)))

;; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn penultimo
  "retorna o penultimo elemento de uma lista"
  [lista]
  (nth lista (- (count lista) 2)))

;; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o elemento que está na posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn elementoN
  "retorna o elemento na posicao N de uma lista"
  [lista n]
  (nth lista n))

;; 4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade nalinguagem Clojure.
(defn inverso
  "inverte os elementos de uma lista"
  [lista]
  (if (empty? lista)
     ()
     (concat (inverso(rest lista)) (list (first lista)))))

;; 5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e devolve o máximo divisor comum entre eles. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn mdc
  "retorna o mdc entre dois inteiros"
  [x y]
  (if (zero? y)
  x
  (recur y, (mod x y))))


(print "1. Ultimo elemento, entrada: 16 25 36 49 64, saida: ")
(println(ultimo (list 16 25 36 49 64)))
(print "2. Penultimo elemento, entrada: 16 25 36 49 64, saida: ")
(println(penultimo (list 16 25 36 49 64)))
(print "3. Elemento na posicao N(index), entrada: 16 25 36 49 64, 2, saida: ")
(println(elementoN (list 16 25 36 49 64)2))
(print "4. Inverso de uma lista, entrada: 16 25 36 49 64, saida: ")
(println(inverso(list 16 25 36 49 64)))
(print "5. MDC entre dois numeros, entrada: 9 42, saida: ")
(println(mdc 9 42))

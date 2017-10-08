(ns mario-run.core
  (:require [quil.core :refer :all]
            [quil.middleware :as m]))

(defn setup []
  {:mario (load-image "resources/mario.png")
   :background (load-image "resources/background.jpg")
   :y-param 10})

; (defn update [state]
;   (if (<= (:y-param state) 300)
;     (update-in state [:y-param] inc)))


(defn draw []
  (background-image (:background)))
  ; (resize (:mario state) (* 36 2) (* 49 2))
  ; (image (:mario state) 10 (:y-param state)))

(defsketch example
  :title "Example"
  :setup setup
  ; :update update
  :draw draw
  :middleware [m/fun-mode]
  :size [800 499])

(defn -main [& args])

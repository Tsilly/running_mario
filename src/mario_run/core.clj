(ns mario-run.core
  (:require [quil.core :refer :all]
            [quil.middleware :as m]))

(defn setup []
  {:mario (load-image "resources/mario.png")
   :background (load-image "resources/background.jpg")
   :pos {:x 10 :y 10}})

(defn update_pos [state]
  (if (<= (:x (:pos state)) 300)
    (update-in state [:pos :x] inc)))    

(defn draw [state]
  (println (:pos state))
  (background-image (:background state))
  (resize (:mario state) 72 98)
  (image (:mario state) (:x (:pos state)) (:y (:pos state))))

(defsketch mario-run
  :title "Example"
  :setup setup
  :update update_pos
  :draw draw
  :middleware [m/fun-mode]
  :size [800 499])

(defn -main [& args])

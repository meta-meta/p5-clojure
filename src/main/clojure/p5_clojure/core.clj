(ns p5-clojure.core)

(gen-class
  :name p5-clojure.core.PAppClj
  :extends processing.core.PApplet
  :prefix "p5-")

(import processing.core.PApplet)

(defn p5-setup [this]
  (.size this 800 600))

(defn p5-draw [this]
  (.background this 0 0 (* 255 (Math/sin (/ (.millis this) 1000)))))

(defn start []
  (PApplet/main "p5-clojure.core.PAppClj"))
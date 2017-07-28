(ns shingle.styles.screen
  (:require [garden.units :as gu :refer [px em vh vw rem percent]]
            [garden.color :as color :refer [rgba]]
            [garden.stylesheet :refer [at-import at-media]]))

(defmacro defbreakpoint [name media-params]
  `(defn ~name [& rules#]
     (at-media ~media-params
               [:& rules#])))

(def portrait-orientation
  {:screen true
   :orientation :portrait})

(def small-screen
  {:screen true
   :max-width (px 720)})

(def html
  [:html {:box-sizing :border-box
          :cursor :default
          :line-height 1.5}])

(def base
  [:body {:background "#222"
          :color "#fff"
          :font "18px 'Montserrat', sans-serif"
          :margin 0
          :height (percent 100)
          :-webkit-font-smoothing :antialiased
          :-moz-osx-font-smoothing :grayscale
          :-webkit-text-size-adjust (percent 100)
          :-webkit-tap-highlight-color :transparent}])

(def main
  [:main {:height (percent 100)}])

(def links
  [:a {:color :inherit
       :outline :none
       :text-decoration :none}])

(def logo
  [:#logo {:margin 0
           :position :fixed
           :top (px 20)
           :left (px 20)
           :width (percent 100)
           :opacity 0.3
           :transition "opacity .5s"}])

(def sections
  [:section {:background-position :center
             :background-repeat :no-repeat
             :background-size :cover
             :height (vh 100)}])

(def content
  [:.content {:display :flex
              :align-items :center
              :justify-content :center
              :height (percent 100)
              :text-align :center
              :background-position :center
              :background-repeat :no-repeat
              :background-size "50% 50%"
              :background-color (rgba 0 0 0 0.3)
              :transition "background-color .5s"}
   [:h2 {:margin 0
         :text-transform :uppercase
         :font-size (px 38)
         :letter-spacing (px 2.8)
         :transition "letter-spacing 0.5s"}]
   [:h3 {:margin 0}]])

(def contact-form
  [:#contact {:height "auto !important"}
   [:form {:max-width (percent 60)
           :padding "100px 20px"}
    [:input
     :textarea
     :select {:width (percent 100)
              :color "#fff"
              :font :inherit
              :background :none
              :outline :none
              :border 0
              :border-radius :none
              :border-bottom "1px solid rgba(255, 255, 255, 0.3)"
              :padding "20px 0 10px 0"
              :transition "border-bottom-color 0.5s"
              :-webkit-appearance :none
              :-moz-appearance :none}]
    [:textarea {:height (px 150)
                :resize :none}]
    [:button {:cursor :pointer
              :background "#00c8c8"
              :border 0
              :padding 0
              :margin-top (px 10)
              :height (px 60)
              :font-size (px 21)
              :font-weight :bold
              :width (percent 100)
              :letter-spacing (px 3)}]]])

(def footer
  [:footer {:display :flex}
   [:h3 {:flex 1
         :margin 0
         :font-size (em 1.333)
         :letter-spacing (px 1)
         :line-height (px 100)
         :text-align :center}]
   [:a {:display :block}]])

(def styles
  [html
   base
   main
   links
   logo
   sections
   content
   contact-form
   footer
   (at-media small-screen
          [:footer {:display :block}])])

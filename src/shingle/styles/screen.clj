(ns shingle.styles.screen
  (:require [garden.units :as gu :refer [px em vh vw rem percent]]
            [garden.def :as gd :refer [defstylesheet defstyles]]
            [garden.color :as color :refer [rgba]]
            [garden.stylesheet :refer [at-import at-media]]))

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
         :letter-spacing (px 3.8)
         :transition "letter-spacing 0.5s"}]
   [:h3 {:margin 0}]])

(def footer
  [:footer {:display :flex}
   [:h3 {:flex 1
         :margin 0
         :font-size (px 24)
         :letter-spacing (px 1)
         :line-height (px 100)
         :text-align :center}]
   [:a {:display :block}]])

(def styles
  [base
   main
   links
   logo
   sections
   content
   footer])

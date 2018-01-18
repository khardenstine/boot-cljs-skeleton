(ns skeleton.main)


(enable-console-print!)

(defn init []
  (aset (.getElementById js/document "skeleton") "innerHTML" "<h5>hello world</h5>"))

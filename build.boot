(set-env!
  :source-paths #{"src"}
  :resource-paths #{"resources"}
  :dependencies '[[org.clojure/clojurescript "1.9.946"]
                  [adzerk/boot-cljs "2.1.4" :scope "test"]
                  [sparkfund/boot-lein-generate "0.3.0" :scope "test"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         'boot.lein)

(task-options!
  pom {:project 'skeleton
       :version "0.0.1-SNAPSHOT"})

(when (> (.lastModified (clojure.java.io/file "build.boot"))
         (.lastModified (clojure.java.io/file "project.clj")))
      (boot.lein/write-project-clj))

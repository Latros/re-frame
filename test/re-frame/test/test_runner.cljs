(ns re-frame.test.runner
  (:require [jx.reporter.karma :as karma :include-macros true]
            [re-frame.test.middleware]))


(defn ^:export run [karma]
  (karma/run-tests
    karma
    're-frame.test.middleware))

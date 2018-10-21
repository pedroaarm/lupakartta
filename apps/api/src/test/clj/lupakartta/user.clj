(ns lupakartta.user
  (:require [clojure.tools.namespace.repl :as tnr]
            [lupakartta.api.core :as core]
            [lupakartta.api.cli :as cli]
            [mount.core :as mount]))

; nothing special yet :-)

(defn start [args]
  (core/start args)
  :ready)

(defn reset []
  (mount/stop)
  (tnr/refresh :after 'lupakartta.user/start))

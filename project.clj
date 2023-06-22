(defproject beholder "0.1.0"
  :dependencies
  [[org.clojure/clojure "1.11.1"]

   ;; [com.taoensso/encore "3.59.0"] ; Works

   ;; [io.aviso/pretty     "1.1.1"] ;  Works
   ;; [io.aviso/pretty     "1.3"]   ; Broken
   [io.aviso/pretty        "1.4.4"] ; Broken

   ;; [com.taoensso/timbre "5.2.1"]  ; Works
   ;; [com.taoensso/timbre "6.2.0-alpha1"] ; Broken
   ;; [com.taoensso/timbre "6.2.0-SNAPSHOT"]
   ]

  ;; Eval in REPL:
  ;; (require '[beholder.handlers] :reload-all)

  :plugins
  [[cider/cider-nrepl "0.30.0"]])

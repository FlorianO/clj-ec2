(defproject clj-ec2 "0.0.1-SNAPSHOT"
  :description "Minimal wrapper around the ec2 part of the aws-sdk"
  :url "https://github.com/FlorianO/clj-ec2"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-time "0.4.4"]
                 [propertea "1.2.3"]
                 [com.amazonaws/aws-java-sdk "1.3.27"]]
  :warn-on-reflection true)

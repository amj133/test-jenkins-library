#!/usr/bin/groovy

def call(Map args) {
  println("Open the pod bay doors Hal...");

  env.TEST_VAR = "I can't do the Dave";

  println("Hal...open the pod bay doors...");

  println(env.TEST_VAR);
}

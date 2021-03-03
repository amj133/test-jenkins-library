#!/usr/bin/groovy

def call(Map args) {
  String new_var

  println("Open the pod bay doors Hal...");

  new_var = env.TEST_VAR;
  new_var = "I can't do the Dave";

  println("Hal...open the pod bay doors...");

  return new_var;
}

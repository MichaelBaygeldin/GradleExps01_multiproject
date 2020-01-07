package org.edu.gradleexps.impl;

import org.edu.gradleexps.api.MainApiInterface;

public class MainImplClass implements MainApiInterface {

  @Override
  public void verySuperFamousMethod(String verySuperFamousString) {
    System.out.println(verySuperFamousString);
  }

}

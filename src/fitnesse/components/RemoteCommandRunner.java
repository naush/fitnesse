// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.components;

import fitnesse.components.CommandRunner;
import fitnesse.slim.SlimClient;

import java.util.Map;

public class RemoteCommandRunner extends CommandRunner {
  private String command;
  private SlimClient client;

  public RemoteCommandRunner() {
    super("", "");
  }

  public RemoteCommandRunner(String command, int exitCode) {
    super(command, "");
    this.exitCode = exitCode;
  }

  public RemoteCommandRunner(String command, SlimClient client) {
    super(command, "");
    this.command = command;
    this.client = client;
  }

  public void run() throws Exception {
  }

  public void join() throws Exception {
  }

  public void kill() throws Exception {
  }

  public void asynchronousStart() throws Exception {
    client.sendCommandLine(command);
  }

  public void setOutput(String output) {
    outputBuffer = new StringBuffer(output);
  }

  public void setError(String error) {
    errorBuffer = new StringBuffer(error);
  }

  public void addException(Exception e) {
    exceptions.add(e);
  }

  public void setExitCode(int i) {
    exitCode = i;
  }
}

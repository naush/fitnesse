// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.components;

import fitnesse.slim.SlimClient;
import util.RegexTestCase;

public class RemoteCommandRunnerTest extends RegexTestCase {

  private final String sampleLaunchCommand = "C:\\Ruby19\\bin\\ruby.exe - Ku -I C:\\fixtures\\ C:\\RubySlim\\lib\\run_ruby_slim.rb";

  public void setUp() throws Exception {
  }

  public void tearDown() throws Exception {
  }

  public void testBasics() throws Exception {
    MockSlimClient mockSlimClient = new MockSlimClient();
    CommandRunner runner = new RemoteCommandRunner(sampleLaunchCommand, mockSlimClient);
    runner.asynchronousStart();
    assertEquals(sampleLaunchCommand, mockSlimClient.checkCommand());
  }

  private class MockSlimClient extends SlimClient {

      private String command;

      public MockSlimClient() {
          super("localhost", 8085);
      }

      public void sendCommandLine(String command) {
          this.command = command;
      }

      public String checkCommand() {
          return command;
      }

  }
}
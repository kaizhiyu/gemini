package com.a.eye.gemini.analysis.util

import org.apache.zookeeper.Watcher
import org.apache.zookeeper.WatchedEvent

class FakeWatcher extends Watcher {
  def process(event: WatchedEvent) {
    // nop
  }
}
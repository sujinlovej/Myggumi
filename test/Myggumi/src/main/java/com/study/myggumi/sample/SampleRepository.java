package com.study.myggumi.sample;

import java.util.List;
import java.util.Map;

public interface SampleRepository {
  List<Map<String, String>> getDBVersion();
  
}

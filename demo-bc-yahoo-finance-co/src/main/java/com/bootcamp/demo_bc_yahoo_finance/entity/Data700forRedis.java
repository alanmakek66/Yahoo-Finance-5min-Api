package com.bootcamp.demo_bc_yahoo_finance.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Builder
public class Data700forRedis {
  private List<DataforCache> dataforCaches;
  
}

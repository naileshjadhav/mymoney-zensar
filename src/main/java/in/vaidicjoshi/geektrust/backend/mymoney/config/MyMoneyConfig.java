package in.vaidicjoshi.geektrust.backend.mymoney.config;

import in.vaidicjoshi.geektrust.backend.mymoney.dao.DataStub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static in.vaidicjoshi.geektrust.backend.mymoney.enums.AssetClass.*;

/**
 * @author Nailesh Jadhav
 * @date 25/11/2022
 */
@Configuration
public class MyMoneyConfig {

  @Bean
  // Bean for DataStub with the initialized values
  public DataStub dataStub() {
    DataStub stub = new DataStub();
    stub.defaultAssetOrderForIO.add(ASSET_EQUITY);
    stub.defaultAssetOrderForIO.add(ASSET_DEBT);
    stub.defaultAssetOrderForIO.add(ASSET_GOLD);
    return stub;
  }
}

package in.vaidicjoshi.geektrust.backend.mymoney.entity;

import in.vaidicjoshi.geektrust.backend.mymoney.enums.AssetClass;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Nailesh Jadhav
 * @date 25/11/2022
 */
@Getter
@Setter
@RequiredArgsConstructor
public class FundEntity {
  @NonNull private AssetClass assetClass;
  @NonNull private Double amount;
}

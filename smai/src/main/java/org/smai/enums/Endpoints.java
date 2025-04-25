package org.smai.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Endpoints {

    GET_STORE_INVENTORY("/v2/store/inventory");

    public final String endpoint;

}

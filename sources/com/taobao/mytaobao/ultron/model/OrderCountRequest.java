package com.taobao.mytaobao.ultron.model;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OrderCountRequest implements IMTOPDataObject, Serializable {
    private static final String NEW_ORDER_INTERFACE = "mtop.order.taobao.countv2";
    public String API_NAME = NEW_ORDER_INTERFACE;
    public String VERSION = "1.0";
    public String scene = "mytao";
    public String tabCodes;

    static {
        t2o.a(745538146);
        t2o.a(589299906);
    }

    public static String fillAllTabCodes() {
        return "waitPay,waitSend,waitConfirm,waitRate,refunding";
    }
}

package com.taobao.android.detail.alicom.model.network;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class QueryContractPhoneNumberData implements IMTOPDataObject {
    public String error;
    public String errorMsg;
    public List<PhoneNumberList> module;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class PhoneNumberList implements Serializable {
        public String isp;
        public int minConsumeAmount;
        public String minConsumeMonth;
        public String phoneNum;
        public int preDepositAmount;

        static {
            t2o.a(703594520);
        }
    }

    static {
        t2o.a(703594519);
        t2o.a(589299906);
    }
}

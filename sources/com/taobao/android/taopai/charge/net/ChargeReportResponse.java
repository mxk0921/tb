package com.taobao.android.taopai.charge.net;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ChargeReportResponse extends BaseOutDo {
    private ChargeReportData data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ChargeReportData implements IMTOPDataObject {
        public String traceId;

        static {
            t2o.a(782237716);
            t2o.a(589299906);
        }
    }

    static {
        t2o.a(782237715);
    }

    public void setData(ChargeReportData chargeReportData) {
        this.data = chargeReportData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public ChargeReportData getData() {
        return this.data;
    }
}

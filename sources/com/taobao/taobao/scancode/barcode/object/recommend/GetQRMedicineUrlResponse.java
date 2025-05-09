package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetQRMedicineUrlResponse extends BaseOutDo {
    public GetMedicineUrlResponseDo data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class GetMedicineUrlResponseDo implements IMTOPDataObject {
        public String result;

        static {
            t2o.a(760217625);
            t2o.a(589299906);
        }

        public String getResult() {
            return this.result;
        }
    }

    static {
        t2o.a(760217624);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    public GetMedicineUrlResponseDo getData() {
        return this.data;
    }
}

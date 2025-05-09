package com.taobao.taobao.scancode.barcode.object.recommend;

import android.text.TextUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GetQRMedicineUrlRequest implements IMTOPDataObject {
    public String rowkey;
    public String API_NAME = "mtop.alihealth.trace.query.code.getScanCodeUrl";
    public String VERSION = "1.0";
    public String channel = "taobao";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        t2o.a(760217623);
        t2o.a(589299906);
    }

    public static boolean isQRMedicneCode(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("6") && str.length() == 20 && TextUtils.isDigitsOnly(str)) {
            return true;
        }
        return false;
    }
}

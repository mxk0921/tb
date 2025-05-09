package com.taobao.android.taopai.charge.api;

import com.taobao.android.taopai.charge.data.TpChargeBean;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.mj3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ChargeHelper implements IMTOPDataObject, Serializable {
    private static final String TAG = "ChargeHelper";

    static {
        t2o.a(782237697);
        t2o.a(589299906);
    }

    private static List<String> arrayToList(String[] strArr) {
        if (strArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(strArr);
    }

    private static Map<String, String> arrayToMap(String[] strArr) {
        HashMap hashMap = new HashMap();
        if (strArr == null) {
            return hashMap;
        }
        int length = strArr.length / 2;
        for (int i = 0; i < length; i += 2) {
            hashMap.put(strArr[i], strArr[1]);
        }
        return hashMap;
    }

    public static void commitBillingInfo(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        log(str, strArr, strArr2, strArr3);
        mj3.a().c(new TpChargeBean.b().f(arrayToList(strArr)).m(arrayToMap(strArr2)).n(str).h());
    }

    public static void commitBillingInfoWithBizLine(String str, String str2, String str3, String[] strArr, String[] strArr2, String[] strArr3) {
        log(str3 + " " + str + " " + str2, strArr, strArr2, strArr3);
        mj3.a().c(new TpChargeBean.b().f(arrayToList(strArr)).m(arrayToMap(strArr2)).n(str3).i(str).j(str2).n(str3).h());
    }

    private static void log(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            sb.append("materialId = ");
            for (String str2 : strArr) {
                sb.append(str2 + " ;");
            }
        }
        if (strArr2 != null) {
            sb.append("detail = ");
            for (String str3 : strArr2) {
                sb.append(str3 + " ;");
            }
        }
        if (strArr3 != null) {
            sb.append("extend = ");
            for (String str4 : strArr3) {
                sb.append(str4 + " ;");
            }
        }
        StringBuilder sb2 = new StringBuilder("commitBillingInfo ");
        sb2.append(str);
        sb2.append(", content = ");
        sb2.append(sb.toString());
    }
}

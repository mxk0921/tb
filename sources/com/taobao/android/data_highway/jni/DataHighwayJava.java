package com.taobao.android.data_highway.jni;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.gwc;
import tb.i5j;
import tb.t2o;
import tb.txa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DataHighwayJava implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile gwc MTOP = null;
    private static final String TAG = "DataHighwayJava";

    static {
        t2o.a(1034944513);
    }

    public static void setMTOP(gwc gwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30219aa", new Object[]{gwcVar});
        } else {
            MTOP = gwcVar;
        }
    }

    public static void requestCPP(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0fea8", new Object[]{new Integer(i), str, new Integer(i2), str2, str3, str4, new Integer(i3), str5, str6});
        } else if (i2 > 0 && !TextUtils.isEmpty(str2) && str4 != null) {
            try {
                ((i5j) MTOP).a(i, str, i2, str2, str3, str4, i3, str5, str6);
            } catch (Throwable th) {
                txa.a("requestError", th.getMessage());
                Log.e(TAG, "JSONArray error");
            }
        }
    }
}

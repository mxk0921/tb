package com.taobao.muniontaobaosdk.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TaoLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a sCopyLogger;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    static {
        t2o.a(1017118867);
    }

    public static void Logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ebbdb", new Object[]{str, str2});
        }
    }

    public static void Loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e833d92", new Object[]{str});
        } else {
            Loge("AlimamaSdk", str);
        }
    }

    public static void Logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7f92e0", new Object[]{str, str2});
        }
    }

    public static void Logd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1451a451", new Object[]{str});
        } else {
            Logd("AlimamaSdk", str);
        }
    }

    public static void Loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else {
            Log.e(str, str2);
        }
    }

    public static void Logi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8749a296", new Object[]{str});
        } else {
            Logi("AlimamaSdk", str);
        }
    }
}

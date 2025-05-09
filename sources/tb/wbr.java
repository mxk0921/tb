package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9581292b", new Object[]{application, str, str2, str3, str4, str5, map});
            return;
        }
        zur.a(application, str, str2, str3, str4, str5);
        try {
            if (o1r.a(application).b("OpenRestOptThread", false)) {
                bap.b(true);
            }
        } catch (Throwable th) {
            ehh.d(th);
        }
    }

    public static void b(Application application, String str, String str2, String str3, String str4, Map<String, Object> map) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78552c35", new Object[]{application, str, str2, str3, str4, map});
            return;
        }
        if (TextUtils.isEmpty(str) || "12278902".equals(str) || "21646297".equals(str)) {
            str6 = "12278902@android";
            str5 = "21646297";
        } else {
            str5 = str;
            str6 = "";
        }
        a(application, str6, str5, str2, str3, str4, map);
    }
}

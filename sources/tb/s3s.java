package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356517);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ecff08a", new Object[]{str});
        }
        return "http://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09b4e2", new Object[]{str});
        }
        return "https://h5.m.taobao.com/taolive/video.html?id=" + str;
    }

    public static String c(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b989da7e", new Object[]{context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || intent.getData() == null) {
            return "";
        }
        return intent.getDataString();
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95e3928", new Object[]{context, str});
        } else {
            g(context, str, false);
        }
    }

    public static void e(Context context, String str, Bundle bundle, int i, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc0afdd", new Object[]{context, str, bundle, new Integer(i), new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(itw.URL_SEPARATOR)) {
            str = "http:".concat(str);
        }
        if (v2s.o().v() != null) {
            v2s.o().v().c(context, str, bundle, i);
        }
        if (z) {
            if (giv.d() == null || giv.d().c() == null) {
                str2 = null;
            } else {
                str2 = giv.d().c().C();
            }
            sjr.g().c(uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, str2);
        }
    }

    public static void f(Context context, String str, Bundle bundle, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d937fda8", new Object[]{context, str, bundle, new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(itw.URL_SEPARATOR)) {
            str = "http:".concat(str);
        }
        if (v2s.o().v() != null) {
            v2s.o().v().b(context, str, bundle);
        }
        if (z) {
            if (giv.d() == null || giv.d().c() == null) {
                str2 = null;
            } else {
                str2 = giv.d().c().C();
            }
            sjr.g().c(uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, str2);
        }
    }

    public static void g(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62699eac", new Object[]{context, str, new Boolean(z)});
        } else {
            f(context, str, null, z);
        }
    }

    public static boolean h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10dbfde9", new Object[]{context, str})).booleanValue();
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            str = "http:".concat(str);
        }
        if (v2s.o().v() != null) {
            return v2s.o().v().a(context, str, null);
        }
        return false;
    }
}

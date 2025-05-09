package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31514a = "HImageViewUtils";
    public static boolean b = false;

    static {
        t2o.a(729809137);
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1acaa6", new Object[]{new Boolean(z)});
        } else if (!f4b.b("enableHomePageGlobalImageTag", true) || !z) {
            p2b.m(false);
        } else {
            p2b.m(true);
        }
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104b5a0f", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c1bcc2", new Object[0]);
        } else if (b && !p2b.j()) {
            p2b.s();
        }
    }

    public static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2db9382", new Object[0]);
        }
        if (!p2b.j()) {
            return null;
        }
        JSONObject b2 = p2b.b();
        p2b.t();
        return b2;
    }

    public static void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb2a7da", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        String str3 = f31514a;
        StringBuilder sb = new StringBuilder("onUpdateHomePageRefreshType, requestType:");
        String str4 = "null";
        sb.append(str != null ? str : str4);
        sb.append(" , changeType:");
        if (str2 != null) {
            str4 = str2;
        }
        sb.append(str4);
        sb.append(" , isFirstPage:");
        sb.append(z);
        bqa.d(str3, sb.toString());
        if (TextUtils.equals(str, s0j.MTS_SUB_STAGE_LOAD_CACHE)) {
            d();
            b(true);
            p2b.a();
            p2b.o("homepage-ads");
            p2b.p(p2b.IMAGE_FIRST_SCREEN_STRATEGY_CONFIG);
        } else if (!TextUtils.equals(str2, "base") || !z) {
            p2b.o(null);
            p2b.p(null);
        } else {
            d();
            p2b.a();
            p2b.o("homepage-ads");
            p2b.p(p2b.IMAGE_STRATEGY_CONFIG);
        }
    }
}

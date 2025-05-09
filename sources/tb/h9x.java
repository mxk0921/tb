package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h9x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20490a = false;

    static {
        t2o.a(745537659);
    }

    public static String a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eda48649", new Object[]{new Boolean(z), str});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("isLowDevice", String.valueOf(MtbGlobalEnv.v()));
        buildUpon.appendQueryParameter("source", "mytaobao_basement");
        String a2 = osh.a();
        if (!TextUtils.isEmpty(a2)) {
            buildUpon.appendQueryParameter("wx_js_min_version", a2);
        }
        String uri = buildUpon.build().toString();
        if (a.g()) {
            uri = cnv.a(uri, "isDowngradePrestrain", "true");
        }
        if (f20490a || l3j.INSTANCE.m() != 1) {
            return uri;
        }
        if (!z) {
            f20490a = true;
        }
        return cnv.a(uri, "firstInstallation", "true");
    }
}

package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.TBWXConfigManger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ztw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(85983302);
    }

    public static Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9949a44e", new Object[0]);
        }
        return d(TBWXConfigManger.WX_COMMON_CONFIG, "enableFoldAdapterFix", Boolean.TRUE);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd4614b4", new Object[0])).booleanValue();
        }
        return d(TBWXConfigManger.WX_COMMON_CONFIG, "enableSetDefaultHttps", Boolean.TRUE).booleanValue();
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de02735d", new Object[]{str})).booleanValue();
        }
        boolean booleanValue = d(TBWXConfigManger.WX_COMMON_CONFIG, "waitInitDefaultValue", Boolean.FALSE).booleanValue();
        return TextUtils.isEmpty(str) ? booleanValue : Uri.parse(str).getBooleanQueryParameter(u0o.s, booleanValue);
    }

    public static Boolean d(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f34368fb", new Object[]{str, str2, bool});
        }
        npb e = e();
        if (e == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(Boolean.parseBoolean(e.getConfig(str, str2, String.valueOf(bool))));
        } catch (Throwable unused) {
            return bool;
        }
    }

    public static npb e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npb) ipChange.ipc$dispatch("a601fb2", new Object[0]);
        }
        return kr0.e().b();
    }
}

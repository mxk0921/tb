package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.roman.BuiltinFallbackMatcher;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class p4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final p4p INSTANCE = new p4p();

    static {
        t2o.a(993001987);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30c1bffc", new Object[0])).booleanValue();
        }
        return qrl.a(OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "templatePreloadV2", "true"), true);
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("362dd52d", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "homePassParamsWhiteList", "");
    }

    @JvmStatic
    public static final List<String> c() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5f1283a2", new Object[0]);
        }
        String a2 = BuiltinFallbackMatcher.a();
        if (Localization.o()) {
            config = OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "RomanPreloadBizNameConfigI18N", a2);
        } else {
            config = OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "RomanPreloadBizNameConfig", a2);
        }
        try {
            ckf.d(config);
            return wsq.z0(config, new String[]{","}, false, 0, 6, null);
        } catch (Exception unused) {
            return new ArrayList(1);
        }
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f4866f", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "reportBxGesture", "true"));
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42efd328", new Object[0])).booleanValue();
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "disableLBSInfo", ""));
    }
}

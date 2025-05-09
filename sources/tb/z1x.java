package tb;

import android.taobao.windvane.extra.core.WVCore;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z1x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String H5_PRELOAD_FIRST_CHUNK = "h5PreloadFirstChunk";
    public static final String PARSE_MANIFEST_URL = "parseManifestUrl";
    public static final String PRELOAD_FIRST_CHUNK = "preloadFirstChunk";
    public static final String PRE_RENDER = "preRender";
    public static final String PRE_REQUEST = "preRequest";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32476a;

    static {
        t2o.a(490733611);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369a31d2", new Object[]{str, str2});
        } else if (f32476a == null) {
            Boolean valueOf = Boolean.valueOf(WVCore.getInstance().isUCSupport());
            f32476a = valueOf;
            if (!valueOf.booleanValue()) {
                mdv mdvVar = mdv.INSTANCE;
                mdvVar.b("ucNotSupport", "ucUnSupport", "uc没有初始化,当前阶段是" + str2, "campaign", str, "");
            }
        }
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff8a1296", new Object[]{str, str2})).booleanValue();
        }
        if (!mve.a("isNeedProcessUCSupport", false)) {
            a(str, str2);
            return true;
        }
        Boolean bool = f32476a;
        if (bool != null) {
            return bool.booleanValue();
        }
        a(str, str2);
        return f32476a.booleanValue();
    }
}

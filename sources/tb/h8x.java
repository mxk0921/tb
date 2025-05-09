package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h8x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DOM = "dom";
    public static final String KEY_MUS = "mus";
    public static final String KEY_WEEX_MODE = "weex_mode";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20478a = false;

    static {
        t2o.a(729809102);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c31d9c9a", new Object[0])).booleanValue();
        }
        return f20478a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("907e8700", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "second_floor_shake_open", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3dbc382", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "weex_textureView_change_open", "true"));
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b59480", new Object[]{new Boolean(z)});
        } else {
            f20478a = z;
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62ec0b93", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            bqa.d("WeexSecondFloorUtils", "targetUrl为空");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            bqa.d("WeexSecondFloorUtils", "uri == null");
            return false;
        }
        return parse.isHierarchical() && (TextUtils.equals(parse.getQueryParameter(KEY_WEEX_MODE), "dom") || TextUtils.equals(parse.getQueryParameter(KEY_WEEX_MODE), KEY_MUS));
    }
}

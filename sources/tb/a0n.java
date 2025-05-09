package tb;

import android.net.Uri;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f15467a;

    static {
        t2o.a(502268079);
    }

    public static String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("424d851e", new Object[0]);
        }
        if (TextUtils.isEmpty(f15467a)) {
            if (EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue()) {
                str = "https://web.m.taobao.com/app/tbvideo/profile/Home?wh_weex=true&weex_mode=dom&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&disableNav=YES";
            } else {
                str = "https://web.wapa.taobao.com/app/tbvideo/profile/Home?wh_weex=true&weex_mode=dom&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&disableNav=YES";
            }
            f15467a = akt.H2("weitao_switch.WeexNewProfilePageURL", str);
            tfs.e("ProfileWeexService", "getProfileWeexUrl:" + f15467a);
        }
        return f15467a;
    }

    public static Map<String, Object> b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96e4d4ab", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static Uri c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d859738b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        Map<String, Object> b = b(uri);
        StringBuilder sb = new StringBuilder(a());
        for (Map.Entry<String, Object> entry : b.entrySet()) {
            sb.append("&");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(Uri.encode(entry.getValue().toString()));
        }
        return Uri.parse(sb.toString());
    }
}

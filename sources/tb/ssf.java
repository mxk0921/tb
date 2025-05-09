package tb;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.rsf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ssf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593290);
    }

    public static Map<String, String> getArgsMap(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3ead722", new Object[]{str, uri}) : rsf.a.b(str, uri);
    }

    public static String getPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str});
        }
        return rsf.a.c(str);
    }

    public static Map<String, String> getArgsMap(Activity activity, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("65d0e09a", new Object[]{activity, uri}) : rsf.a.a(activity, uri);
    }
}

package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.cpm.CpmAdvertise;
import com.taobao.alimama.cpm.CpmAdvertiseBundle;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class aw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118782);
    }

    public static Pair<Long, Long> a(CpmAdvertiseBundle cpmAdvertiseBundle, String str) {
        Map<String, CpmAdvertise> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c5f95dcc", new Object[]{cpmAdvertiseBundle, str});
        }
        if (!(TextUtils.isEmpty(str) || cpmAdvertiseBundle == null || (map = cpmAdvertiseBundle.advertises) == null)) {
            for (CpmAdvertise cpmAdvertise : map.values()) {
                if (c(cpmAdvertise, false)) {
                    String queryParameter = Uri.parse(cpmAdvertise.clickUrl).getQueryParameter(js0.E_URL);
                    if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals(str)) {
                        return new Pair<>(Long.valueOf(cpmAdvertiseBundle.timeStamp), Long.valueOf(cpmAdvertise.cachetime * 1000));
                    }
                }
            }
        }
        return null;
    }

    public static Pair<Long, Long> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("61f38aa9", new Object[]{str});
        }
        return a(null, str);
    }

    public static boolean c(CpmAdvertise cpmAdvertise, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("290e6cd3", new Object[]{cpmAdvertise, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(cpmAdvertise.clickUrl) || TextUtils.isEmpty(cpmAdvertise.pid) || (z && cpmAdvertise.bitmap == null && cpmAdvertise.animatedDrawable == null)) {
            return false;
        }
        return true;
    }

    public static boolean d(CpmAdvertiseBundle cpmAdvertiseBundle, String str) {
        Map<String, CpmAdvertise> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dc82c3", new Object[]{cpmAdvertiseBundle, str})).booleanValue();
        }
        if (!(TextUtils.isEmpty(str) || cpmAdvertiseBundle == null || (map = cpmAdvertiseBundle.advertises) == null)) {
            for (CpmAdvertise cpmAdvertise : map.values()) {
                if (c(cpmAdvertise, false) && str.equals(cpmAdvertise.ifs)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17080786", new Object[]{str})).booleanValue();
        }
        return d(null, str);
    }
}

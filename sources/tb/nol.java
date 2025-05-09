package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nol extends cau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public nol(Context context) {
        super(context, "ut_page.csv");
    }

    public static /* synthetic */ Object ipc$super(nol nolVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1687038532) {
            return nolVar.e((Map) objArr[0]);
        }
        if (hashCode == -628643107) {
            return nolVar.f((Map) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ju/track/impl/PageTrackImpl");
    }

    public String j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62881df4", new Object[]{this, activity});
        }
        if (activity != null) {
            return k(activity.getClass().getSimpleName());
        }
        return null;
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32d4cd7c", new Object[]{this, str});
        }
        String b = b(str, "_args");
        if (b == null) {
            return b(n(str), "_args");
        }
        return b;
    }

    public Map<String, String> l(Activity activity, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("65d0e09a", new Object[]{this, activity, uri});
        }
        return i(xwf.a(j(activity)), uri);
    }

    public Map<String, String> m(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3ead722", new Object[]{this, str, uri});
        }
        return i(xwf.a(k(str)), uri);
    }

    public String n(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{this, str});
        }
        if (str != null) {
            str2 = c(str, "_key", str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return "NullActivity";
    }

    public nol(Context context, String str) {
        super(context, !uy4.a(str) ? "ut_page.csv" : str);
    }

    public final Map<String, String> i(Map<String, String> map, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54c28088", new Object[]{this, map, uri});
        }
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                String value = next.getValue();
                if (!TextUtils.isEmpty(value) && value.startsWith("${") && value.endsWith("}") && value.length() > 2) {
                    String a2 = nnv.a(uri, value.substring(2, value.length() - 1), "");
                    if (!TextUtils.isEmpty(a2)) {
                        map.put(key, a2);
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return map;
    }
}

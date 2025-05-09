package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26737a = false;

    static {
        t2o.a(283115581);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (f26737a) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{str, str2, th});
        } else if (f26737a) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
        }
    }

    public static void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3af0", new Object[]{str, map});
        } else if (f26737a) {
            new JSONObject(map);
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] ");
            sb.append(new JSONObject(map).toString());
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else if (f26737a) {
            e(str, strArr);
        }
    }

    public static String e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b64d1871", new Object[]{str, strArr});
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f123f59", new Object[]{new Boolean(z)});
        } else {
            f26737a = z;
        }
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile HashMap<String, JSONObject> f24012a;
    public static volatile ConcurrentHashMap<String, Integer> b = new ConcurrentHashMap<>();
    public static final Deque<String> c = new LinkedList();
    public static final Object d = new Object();

    static {
        t2o.a(774897728);
    }

    public static synchronized JSONObject a(String str) {
        boolean z = false;
        synchronized (mfi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("a3ce897d", new Object[]{str});
            } else if (f24012a == null) {
                return null;
            } else {
                JSONObject jSONObject = f24012a.get(str);
                StringBuilder sb = new StringBuilder("get the pcresult cache with videoid=");
                sb.append(str);
                sb.append(", result=");
                if (jSONObject != null) {
                    z = true;
                }
                sb.append(z);
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
                return jSONObject;
            }
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7f62ab8", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (d) {
            try {
                Integer num = b.get(str);
                if (num == null || num.intValue() <= 0) {
                    return 0;
                }
                Deque<String> deque = c;
                ((LinkedList) deque).remove(str);
                ((LinkedList) deque).addFirst(str);
                return num.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f3752", new Object[]{str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && i > 0) {
            synchronized (d) {
                try {
                    if (b.size() >= 15) {
                        b.remove((String) ((LinkedList) c).removeLast());
                    }
                    b.put(str, Integer.valueOf(i));
                    ((LinkedList) c).addFirst(str);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static synchronized void d(String str, JSONObject jSONObject) {
        synchronized (mfi.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb29873f", new Object[]{str, jSONObject});
                return;
            }
            try {
                if (f24012a == null) {
                    f24012a = new HashMap<>();
                }
                f24012a.put(str, jSONObject);
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "update the pcresult cache with videoid=" + str + ", size of cache=" + f24012a.size());
            } catch (Exception e) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "updatePlayControlInfo error:" + e.toString());
            }
        }
    }
}

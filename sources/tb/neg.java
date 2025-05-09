package tb;

import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class neg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEPERATER = "/";

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, ValueCallback<String>> f24679a = new ConcurrentHashMap<>();

    static {
        t2o.a(507510816);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edecafa", new Object[]{str});
        } else {
            f24679a.remove(str);
        }
    }

    public static ValueCallback<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueCallback) ipChange.ipc$dispatch("6c51e479", new Object[]{str});
        }
        return f24679a.get(str);
    }

    public static void c(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449e949f", new Object[]{str, valueCallback});
        } else {
            f24679a.put(str, valueCallback);
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class dtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Error f18056a;

    static {
        t2o.a(996147209);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public abstract String b(String str);

    public Map<String, String> c() {
        List<String> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9dad198", new Object[]{this});
        }
        Map<String, List<String>> e = e();
        if (e == null) {
            return null;
        }
        HashMap hashMap = new HashMap(e.size());
        for (Map.Entry<String, List<String>> entry : e.entrySet()) {
            String key = entry.getKey();
            if (!(key == null || (value = entry.getValue()) == null || value.size() == 0)) {
                hashMap.put(key, value.get(0));
            }
        }
        return hashMap;
    }

    public abstract InputStream d();

    public abstract Map<String, List<String>> e();

    public abstract int f();

    public void g(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b14b254", new Object[]{this, new Integer(i), th});
        } else if (th != null) {
            this.f18056a = new Error(i, th.toString());
        }
    }
}

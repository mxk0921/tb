package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l3x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<String, String> c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Long> f23100a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, JSONObject> d = new ConcurrentHashMap<>();

    static {
        t2o.a(980418619);
    }

    public ConcurrentHashMap<String, JSONObject> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("9982d474", new Object[]{this});
        }
        return this.d;
    }

    public HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cd2656fe", new Object[]{this});
        }
        return this.c;
    }

    public ConcurrentHashMap<String, Long> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("d32e1b7", new Object[]{this});
        }
        return this.f23100a;
    }

    public ConcurrentHashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b570d546", new Object[]{this});
        }
        return this.b;
    }

    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c383a784", new Object[]{this, hashMap});
        } else {
            this.c = hashMap;
        }
    }
}

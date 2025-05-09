package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class li7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f23354a;
    public Map<String, String> b;

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c6309c81", new Object[]{this});
        }
        Map<String, String> map = this.f23354a;
        if (map != null) {
            return map;
        }
        Map<String, String> b = b();
        this.f23354a = b;
        return b;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("289f184d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("memoryMaxSize", a2n.b());
        return hashMap;
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a466c4f", new Object[]{this});
        }
        Map<String, String> map = this.b;
        if (map != null) {
            return map;
        }
        Map<String, String> d = d();
        this.b = d;
        return d;
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9458f93f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("storageSize", a2n.c(o7o.e));
        return hashMap;
    }

    public Map<String, String> e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1130c450", new Object[]{this, new Integer(i)});
        }
        if (i == 2) {
            return a();
        }
        if (i != 6) {
            return Collections.emptyMap();
        }
        return c();
    }
}

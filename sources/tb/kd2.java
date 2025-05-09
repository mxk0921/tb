package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22578a;
    public Map<String, Object> b;
    public Map<String, Object> c;
    public Map<String, Object> d;

    public kd2(String str, Map<String, Object> map) {
        this.f22578a = str;
        this.b = map;
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f13b1c0f", new Object[]{this});
        }
        return this.c;
    }

    public kd2 b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd2) ipChange.ipc$dispatch("46d6e392", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.putAll(map);
        return this;
    }

    public kd2 c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd2) ipChange.ipc$dispatch("907a83f2", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.putAll(map);
        return this;
    }

    public kd2 d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd2) ipChange.ipc$dispatch("20f618db", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.putAll(map);
        return this;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0b4f24b", new Object[]{this});
        }
        return this.f22578a;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92db64ef", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("564c3871", new Object[]{this});
        }
        return this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f22578a;
    }
}

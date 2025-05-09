package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17095a;
    public final long b;
    public final Map<String, Object> c;

    public cj8(String str, Map<String, Object> map) {
        this(str, System.currentTimeMillis());
        this.c = map;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return this.f17095a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92db64ef", new Object[]{this});
        }
        return this.c;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d83291", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Event{name='" + this.f17095a + "', timestamp=" + this.b + '}';
    }

    public cj8(String str, long j) {
        this.f17095a = str;
        this.b = j;
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dck implements raq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f17726a;
    public final String b;
    public final String c;

    static {
        t2o.a(315621413);
        t2o.a(315621382);
    }

    public dck(String str, String str2, Map<String, String> map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        this.f17726a = hashMap;
        this.c = str;
        this.b = str2;
    }

    @Override // tb.raq
    public Iterable<Map.Entry<String, String>> a() {
        Set entrySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterable) ipChange.ipc$dispatch("f5447e98", new Object[]{this});
        }
        synchronized (this) {
            entrySet = new HashMap(this.f17726a).entrySet();
        }
        return entrySet;
    }

    @Override // tb.raq
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ce225d4", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.raq
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51d7e299", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> d() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dfa7d1bc", new Object[]{this});
        }
        synchronized (this) {
            hashMap = new HashMap(this.f17726a);
        }
        return hashMap;
    }

    public int e() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("382cfaa9", new Object[]{this})).intValue();
        }
        synchronized (this) {
            size = this.f17726a.size();
        }
        return size;
    }

    public String f(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f93a52", new Object[]{this, str});
        }
        synchronized (this) {
            str2 = this.f17726a.get(str);
        }
        return str2;
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3889cc", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        this.f17726a.remove(str);
                    } else {
                        this.f17726a.put(str, str2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "traceId:" + this.c + ", spanId:" + this.b;
    }
}

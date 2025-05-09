package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u67 implements q5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f29175a = new ConcurrentHashMap();

    static {
        t2o.a(676331523);
        t2o.a(676331537);
    }

    @Override // tb.q5c
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0a5205", new Object[]{this, str, str2});
        }
        if (((ConcurrentHashMap) this.f29175a).containsKey(str)) {
            return (String) ((ConcurrentHashMap) this.f29175a).get(str);
        }
        return str2;
    }

    @Override // tb.q5c
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f91a6f", new Object[]{this, str, str2});
        } else {
            ((ConcurrentHashMap) this.f29175a).put(str, str2);
        }
    }
}

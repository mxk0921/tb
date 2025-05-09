package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f18236a = new ConcurrentHashMap();
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        Map<String, List<String>> a();
    }

    static {
        t2o.a(301989920);
    }

    public e2s(Context context) {
        this.b = new i77(context);
        b();
    }

    public List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a471e538", new Object[]{this, str});
        }
        return (List) ((ConcurrentHashMap) this.f18236a).get(str);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee47bf5e", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null && aVar.a() != null) {
            this.f18236a.putAll(this.b.a());
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5683bbc3", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        b();
    }
}

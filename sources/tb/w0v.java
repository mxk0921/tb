package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w0v implements rbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30388a;
    public String b;
    public String c;
    public Map<String, String> d;

    static {
        t2o.a(962593042);
        t2o.a(962593059);
    }

    @Override // tb.rbo
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.f30388a = 0;
        this.b = null;
        this.c = null;
        Map<String, String> map = this.d;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    @Override // tb.rbo
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
        } else if (this.d == null) {
            this.d = new HashMap();
        }
    }
}

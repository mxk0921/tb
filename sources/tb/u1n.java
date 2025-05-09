package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public knm f29078a;
    public final y0o b;
    public boolean c = false;

    static {
        t2o.a(157286481);
    }

    public u1n(y0o y0oVar) {
        this.b = y0oVar;
        d();
    }

    public y0o a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0o) ipChange.ipc$dispatch("c05c687e", new Object[]{this});
        }
        return this.b;
    }

    public knm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (knm) ipChange.ipc$dispatch("9bdb3024", new Object[]{this});
        }
        return this.f29078a;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ad59b2", new Object[]{this});
        }
        return this.b.p();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f29078a = this.b.o();
        if (!this.b.n().isEmpty()) {
            this.c = true;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4fc7b7b", new Object[]{this})).booleanValue();
        }
        return this.c;
    }
}

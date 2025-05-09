package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class kv1<T extends bdd> implements r9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f22944a;
    public final T b = e();

    static {
        t2o.a(295699015);
        t2o.a(295698847);
    }

    public kv1(xea xeaVar) {
        this.f22944a = xeaVar;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed22211", new Object[]{this});
            return;
        }
        T t = this.b;
        if (t != null) {
            t.I(this);
        }
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f22944a.i();
    }

    public abstract T e();
}

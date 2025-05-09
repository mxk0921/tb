package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.d;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f22533a;
    public int b;
    public int c;
    public String d;
    public DXLongSparseArray<qub> e;
    public DXLongSparseArray<evb> f;
    public WeakReference<DXLongSparseArray<mvb>> g;
    public WeakReference<Context> h;
    public WeakReference<ph5> i;
    public WeakReference<m> j;
    public WeakReference<d> k;
    public av5 l;
    @Deprecated
    public Object m;
    public fl6 n;
    public vy8 o;
    public Map<String, String> p;
    public WeakReference<DXRootView> q;

    static {
        t2o.a(444596556);
    }

    public kb6(av5 av5Var) {
        this.l = av5Var;
        DXEngineConfig c = av5Var.c();
        if (c != null) {
            this.d = c.d();
        }
    }

    public kb6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kb6) ipChange.ipc$dispatch("40da56c", new Object[]{this});
        }
        kb6 kb6Var = new kb6(this.l);
        kb6Var.b = this.b;
        kb6Var.f22533a = this.f22533a;
        kb6Var.c = this.c;
        kb6Var.d = this.d;
        kb6Var.e = this.e;
        kb6Var.f = this.f;
        kb6Var.g = this.g;
        kb6Var.h = this.h;
        kb6Var.i = this.i;
        kb6Var.k = this.k;
        kb6Var.j = this.j;
        kb6Var.m = this.m;
        kb6Var.n = this.n;
        kb6Var.o = this.o;
        kb6Var.p = this.p;
        kb6Var.q = this.q;
        return kb6Var;
    }
}

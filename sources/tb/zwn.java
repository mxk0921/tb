package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zwn implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f33067a;
    public final d b;
    public final b7o c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ebo f33068a;
        public final /* synthetic */ z6o b;

        public a(zwn zwnVar, ebo eboVar, z6o z6oVar) {
            this.f33068a = eboVar;
            this.b = z6oVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
            } else {
                this.f33068a.a(new pan(this.b, a7oVar));
            }
        }
    }

    public zwn(cgd cgdVar, com.taobao.android.remoteso.index.d dVar, b7o b7oVar) {
        this.f33067a = cgdVar;
        this.b = dVar;
        this.c = b7oVar;
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        throw new UnsupportedOperationException("RemoAssetsPuller not support resolveAsync()");
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        throw new UnsupportedOperationException("RemoAssetsPuller not support resolve()");
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        z6o i = z6o.i(str, this.b.d(str), null);
        a7o h = this.c.h(i);
        if (h.j()) {
            return new pan(i, h);
        }
        ebo eboVar = new ebo();
        this.c.i(i, new a(this, eboVar, i));
        pan panVar = (pan) eboVar.b(oan.a(this.f33067a, i));
        return panVar == null ? new pan(i, j.f(i, RSoException.error(6304), "puller-error")) : panVar;
    }
}

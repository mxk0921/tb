package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.pzf;
import tb.qzf;
import tb.x3t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x3t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qzf f31124a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f31125a;
        public final /* synthetic */ d1a<xhv> b;

        public a(d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
            this.f31125a = d1aVar;
            this.b = d1aVar2;
        }

        public static final xhv c(d1a d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("b46253ac", new Object[]{d1aVar});
            }
            d1aVar.invoke();
            return xhv.INSTANCE;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            final d1a<xhv> d1aVar = this.f31125a;
            if (d1aVar != null) {
                cvs.Companion.e(new d1a() { // from class: tb.v3t
                    @Override // tb.d1a
                    public final Object invoke() {
                        xhv c;
                        c = x3t.a.c(d1a.this);
                        return c;
                    }
                });
            }
            d1a<xhv> d1aVar2 = this.b;
            if (d1aVar2 != null) {
                d1aVar2.invoke();
            }
        }

        @Override // tb.d1a
        public /* bridge */ /* synthetic */ xhv invoke() {
            b();
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827301);
    }

    public static /* synthetic */ void c(x3t x3tVar, String str, boolean z, long j, d1a d1aVar, d1a d1aVar2, int i, Object obj) {
        boolean z2;
        d1a d1aVar3;
        d1a d1aVar4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347869a5", new Object[]{x3tVar, str, new Boolean(z), new Long(j), d1aVar, d1aVar2, new Integer(i), obj});
            return;
        }
        if ((2 & i) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            d1aVar3 = null;
        } else {
            d1aVar3 = d1aVar;
        }
        if ((i & 16) != 0) {
            d1aVar4 = null;
        } else {
            d1aVar4 = d1aVar2;
        }
        x3tVar.b(str, z2, j, d1aVar3, d1aVar4);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qzf qzfVar = this.f31124a;
        if (qzfVar != null) {
            qzfVar.destroy();
        }
        this.f31124a = null;
    }

    public final void b(String str, boolean z, long j, d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58e3fb7", new Object[]{this, str, new Boolean(z), new Long(j), d1aVar, d1aVar2});
            return;
        }
        ckf.g(str, "identifier");
        pzf a2 = new re4().a();
        pzf.a.a(a2, str, null, 0, 6, null);
        qzf b = new re4().b();
        this.f31124a = b;
        if (b != null) {
            qzf.a.a(b, new a(d1aVar, d1aVar2), z, j, 0, a2, 8, null);
        }
    }
}

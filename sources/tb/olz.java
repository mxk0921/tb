package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class olz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final plz f25483a;
    public d1a<xhv> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737459);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final olz a(plz plzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (olz) ipChange.ipc$dispatch("a0209330", new Object[]{this, plzVar});
            }
            ckf.g(plzVar, "owner");
            return new olz(plzVar, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737458);
    }

    public /* synthetic */ olz(plz plzVar, a07 a07Var) {
        this(plzVar);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else {
            this.f25483a.a(this);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ab0dba", new Object[]{this});
            return;
        }
        d1a<xhv> d1aVar = this.b;
        if (d1aVar != null) {
            d1aVar.invoke();
        }
    }

    public final void c(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7acc379", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, pg1.ATOM_EXT_block);
        this.b = d1aVar;
    }

    public olz(plz plzVar) {
        this.f25483a = plzVar;
    }
}

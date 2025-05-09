package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kaz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface pdz extends kaz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.pdz$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class C1028a implements odz {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final int f26038a;
            public final int b;
            public final /* synthetic */ d1a<xhv> c;

            public C1028a(int i, int i2, d1a<xhv> d1aVar) {
                this.c = d1aVar;
                this.f26038a = i;
                this.b = i2;
            }

            @Override // tb.odz
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d2a5ad", new Object[]{this});
                } else {
                    this.c.invoke();
                }
            }

            @Override // tb.odz
            public int getHeight() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
                }
                return this.b;
            }

            @Override // tb.odz
            public int getWidth() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
                }
                return this.f26038a;
            }
        }

        static {
            t2o.a(598737028);
        }

        public static odz a(pdz pdzVar, int i, int i2, d1a<xhv> d1aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (odz) ipChange.ipc$dispatch("719d43a3", new Object[]{pdzVar, new Integer(i), new Integer(i2), d1aVar});
            }
            ckf.g(pdzVar, "this");
            ckf.g(d1aVar, "placementBlock");
            if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
                return new C1028a(i, i2, d1aVar);
            }
            throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public static int b(pdz pdzVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7358f8ed", new Object[]{pdzVar, new Float(f)})).intValue();
            }
            ckf.g(pdzVar, "this");
            return kaz.a.a(pdzVar, f);
        }

        public static float c(pdz pdzVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7874f3c", new Object[]{pdzVar, new Float(f)})).floatValue();
            }
            ckf.g(pdzVar, "this");
            return kaz.a.b(pdzVar, f);
        }
    }

    odz e(int i, int i2, d1a<xhv> d1aVar);
}

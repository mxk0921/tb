package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.rxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pxl implements rxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f26376a = c21.g().getBoolean("isApm", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements w11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f26377a;
        public final /* synthetic */ b b;
        public final /* synthetic */ long c;

        public a(pxl pxlVar, o oVar, b bVar, long j) {
            this.f26377a = oVar;
            this.b = bVar;
            this.c = j;
        }

        @Override // com.taobao.application.common.IPageListener
        public void onPageChanged(String str, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
                return;
            }
            try {
                o oVar = this.f26377a;
                if (oVar != null && oVar.W() != null) {
                    this.f26377a.W().getClass();
                    this.f26377a.W().getClass();
                    if (this.f26377a.W().getClass().getName().equals(str)) {
                        if (i == 0) {
                            this.b.b = j;
                        }
                        if (i == 2) {
                            b bVar = this.b;
                            long j2 = bVar.b;
                            if (j2 == 0) {
                                j2 = this.c;
                            }
                            bVar.a(this.f26377a, (int) (j - j2));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements rxl.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public w11 f26378a;
        public long b;

        static {
            t2o.a(502267921);
            t2o.a(503316568);
        }

        public b(pxl pxlVar) {
        }

        public void a(o oVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3c7d900", new Object[]{this, oVar, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(502267919);
        t2o.a(503316567);
    }

    @Override // tb.rxl
    public void a(rxl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf5d000", new Object[]{this, aVar});
        } else if (this.f26376a) {
            c21.m(((b) aVar).f26378a);
        }
    }

    @Override // tb.rxl
    public rxl.a b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxl.a) ipChange.ipc$dispatch("a404125e", new Object[]{this, oVar});
        }
        b bVar = new b(this);
        long nanoTime = System.nanoTime() / 1000000;
        if (this.f26376a) {
            bVar.f26378a = new a(this, oVar, bVar, nanoTime);
        }
        return bVar;
    }

    @Override // tb.rxl
    public void c(rxl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ba05b9", new Object[]{this, aVar});
        } else if (this.f26376a) {
            c21.e(((b) aVar).f26378a);
        }
    }
}

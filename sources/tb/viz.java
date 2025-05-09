package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutDirection;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import tb.pdz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class viz extends qjz implements ldz, pdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final waz f;
    public viz g;
    public viz h;
    public odz i;
    public nfz k;
    public final taz j = new taz(null, 1, null);
    public long l = eaz.Companion.a();

    static {
        t2o.a(598737407);
        t2o.a(598737023);
        t2o.a(598737027);
    }

    public viz(waz wazVar) {
        ckf.g(wazVar, "layoutNode");
        this.f = wazVar;
    }

    public static /* synthetic */ Object ipc$super(viz vizVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/node/NodeCoordinator");
    }

    public final nfz A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("f7367c0d", new Object[]{this});
        }
        return this.k;
    }

    public final viz B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("330d33ab", new Object[]{this});
        }
        return this.h;
    }

    public final viz C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viz) ipChange.ipc$dispatch("6bd2c62", new Object[]{this});
        }
        return this.g;
    }

    public void D(RenderContext renderContext, njz njzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5aefcd", new Object[]{this, renderContext, njzVar});
            return;
        }
        ckf.g(renderContext, "renderContext");
        ckf.g(njzVar, "parsingContext");
    }

    public void E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91fa873", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        t(iaz.a(i, i2));
        this.j.a().d(iaz.a(i, i2));
    }

    public final void G(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc11759", new Object[]{this, new Long(j)});
        } else if (!eaz.c(this.j.a().a(), j)) {
            this.j.a().c(j);
        }
    }

    public final void H(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7d59a5", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0 != r1.getHeight()) goto L_0x003a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(tb.odz r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.viz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "4dc2f381"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            if (r5 == 0) goto L_0x0048
            tb.odz r0 = r4.i
            if (r0 == 0) goto L_0x003a
            int r0 = r5.getWidth()
            tb.odz r1 = r4.i
            if (r1 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r1 = r1.getWidth()
            if (r0 != r1) goto L_0x003a
            int r0 = r5.getHeight()
            tb.odz r1 = r4.i
            if (r1 != 0) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            int r1 = r1.getHeight()
            if (r0 != r1) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r4.E(r0, r1)
        L_0x0045:
            r4.i = r5
            return
        L_0x0048:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "MeasureResult should not be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.viz.I(tb.odz):void");
    }

    public final void J(nfz nfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faea97d", new Object[]{this, nfzVar});
        } else {
            this.k = nfzVar;
        }
    }

    public final void K(viz vizVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31faa2db", new Object[]{this, vizVar});
        } else {
            this.h = vizVar;
        }
    }

    public final void L(viz vizVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71cdae04", new Object[]{this, vizVar});
        } else {
            this.g = vizVar;
        }
    }

    @Override // tb.jaz
    public ofz a() {
        mjz mjzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofz) ipChange.ipc$dispatch("2725aa5f", new Object[]{this});
        }
        if (!this.f.o().e(wiz.a(2))) {
            return null;
        }
        ofz ofzVar = null;
        for (nfz d = this.f.o().d(); d != null; d = d.h()) {
            if (wiz.b(d.g(), wiz.a(2))) {
                if (d instanceof mjz) {
                    mjzVar = (mjz) d;
                } else {
                    mjzVar = null;
                }
                if (mjzVar == null) {
                    ofzVar = null;
                } else {
                    ofzVar = mjzVar.n(ofzVar);
                }
            }
        }
        return ofzVar;
    }

    @Override // tb.v4z
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d3ac29", new Object[]{this})).floatValue();
        }
        return this.f.f().b();
    }

    @Override // tb.v4z
    public float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c83f406", new Object[]{this, new Float(f)})).floatValue();
        }
        return pdz.a.c(this, f);
    }

    @Override // tb.pdz
    public odz e(int i, int i2, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("a18df5bf", new Object[]{this, new Integer(i), new Integer(i2), d1aVar});
        }
        return pdz.a.a(this, i, i2, d1aVar);
    }

    @Override // tb.v4z
    public int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa51101b", new Object[]{this, new Float(f)})).intValue();
        }
        return pdz.a.b(this, f);
    }

    @Override // tb.kaz
    public LayoutDirection getLayoutDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutDirection) ipChange.ipc$dispatch("3d1d35d6", new Object[]{this});
        }
        return LayoutDirection.Ltr;
    }

    @Override // tb.qjz
    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acd6412", new Object[]{this, new Long(j)});
        } else {
            G(j);
        }
    }

    public final long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b8ee4fe", new Object[]{this})).longValue();
        }
        return this.l;
    }

    public final long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76637ba", new Object[]{this})).longValue();
        }
        return j();
    }

    public final taz x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (taz) ipChange.ipc$dispatch("908de154", new Object[]{this});
        }
        return this.j;
    }

    public final waz y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("96cd5d5e", new Object[]{this});
        }
        return this.f;
    }

    public final odz z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("974f660b", new Object[]{this});
        }
        return this.i;
    }

    public boolean F(RenderContext renderContext, njz njzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404797c3", new Object[]{this, renderContext, njzVar})).booleanValue();
        }
        ckf.g(renderContext, "renderContext");
        return false;
    }
}

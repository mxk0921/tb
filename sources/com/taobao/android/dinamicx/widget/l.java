package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import tb.cw6;
import tb.ji6;
import tb.la6;
import tb.qub;
import tb.t26;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l extends h implements ji6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLOOPVIEWLAYOUT_AUTOLOOP = 1174195018790483035L;
    public static final long DXLOOPVIEWLAYOUT_LAYERORDER = 2392273351067921955L;
    public static final int DXLOOPVIEWLAYOUT_LAYERORDER_NORMAL = 0;
    public static final int DXLOOPVIEWLAYOUT_LAYERORDER_REVERSE = 1;
    public static final long DXLOOPVIEWLAYOUT_LOOPBEGINTIME = 3376036431954601531L;
    public static final long DXLOOPVIEWLAYOUT_LOOPINTERVAL = 7318592948653306891L;
    public static final long DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT = -2740032205478963263L;
    public static final long DXLOOPVIEWLAYOUT_ONPAGEAPPEAR = -8975334121118753601L;
    public static final long DXLOOPVIEWLAYOUT_ONPAGEDISAPPEAR = -5201408949358043646L;
    public static final long DXLOOPVIEWLAYOUT_STARTPLAY = -7438709554197156915L;
    public ArrayList<DXWidgetNode> e;
    public o f;
    public int g;
    public d h;
    public e i;
    public f j;
    public boolean k;
    public boolean l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7438a = true;
    public int b = 0;
    public long c = 0;
    public long d = 0;
    public final DXNativeLoopViewLayout.b m = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends DXNativeLoopViewLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXLoopViewLayoutWidgetNode$1");
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fd8ccb", new Object[]{this});
            } else {
                l.u(l.this);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ebc1f1", new Object[]{this});
            } else {
                l.v(l.this);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            } else {
                l.t(l.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.dinamicx.widget.l.f.b
        public long a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("975a14aa", new Object[]{this, new Long(j)})).longValue();
            }
            if (l.w(l.this) == null) {
                return j;
            }
            return l.w(l.this).b(l.x(l.this), j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new l();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends DXNativeLoopViewLayout.a<DXNativeLoopViewLayout.d, DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final o f7441a;
        public final Context b;
        public ArrayList<DXWidgetNode> c;
        public final l d;

        public d(o oVar, Context context, l lVar) {
            this.f7441a = oVar;
            this.b = context;
            this.d = lVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXLoopViewLayoutWidgetNode$LoopItemAdapter");
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.c;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public int d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public void e(DXNativeLoopViewLayout.d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5357d53f", new Object[]{this, dVar, new Integer(i)});
                return;
            }
            DXWidgetNode g = g(i);
            if (g != null) {
                this.f7441a.k(g, null, dVar.f7374a, g.getDXRuntimeContext(), 2, 9, DXWidgetNode.DXMeasureSpec.c(this.d.getMeasuredWidth(), 1073741824), DXWidgetNode.DXMeasureSpec.c(this.d.getMeasuredHeight(), 1073741824), i);
                DXRuntimeContext dXRuntimeContext = g.getDXRuntimeContext();
                DinamicXEngine f = dXRuntimeContext.s().f();
                if (f != null && dXRuntimeContext.Y()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(dXRuntimeContext.m().c);
                    arrayList.add(new f.a("DXLoopViewLayout", "child_render_error", com.taobao.android.dinamicx.f.DX_ERROR_BIZ_CODE));
                    DinamicXEngine.n(f.c(), dXRuntimeContext.p(), arrayList);
                }
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public DXNativeLoopViewLayout.d f(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXNativeLoopViewLayout.d) ipChange.ipc$dispatch("7bbc9175", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new DXNativeLoopViewLayout.d(new DXNativeFrameLayout(this.b));
        }

        public DXWidgetNode g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
            }
            ArrayList<DXWidgetNode> arrayList = this.c;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<DXWidgetNode> arrayList2 = this.c;
            return arrayList2.get(i % arrayList2.size());
        }

        public void h(ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82fc4efc", new Object[]{this, arrayList});
            } else {
                this.c = arrayList;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final WeakHashMap<View, e> e = new WeakHashMap<>();

        /* renamed from: a  reason: collision with root package name */
        public long f7442a;
        public long b;
        public long c;
        public boolean d;

        public static e a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("6489e83e", new Object[]{dXRootView});
            }
            WeakHashMap<View, e> weakHashMap = e;
            e eVar = weakHashMap.get(dXRootView);
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e();
            weakHashMap.put(dXRootView, eVar2);
            return eVar2;
        }

        public long b(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("db96a0be", new Object[]{this, new Long(j), new Long(j2)})).longValue();
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f7442a) - this.c;
            if (elapsedRealtime <= j) {
                return j - elapsedRealtime;
            }
            long j3 = elapsedRealtime - j;
            return ((((j3 + j2) - 1) / j2) * j2) - j3;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f7442a = -1L;
            this.b = -1L;
            this.c = 0L;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59302a2", new Object[]{this});
                return;
            }
            if (this.f7442a == -1) {
                this.f7442a = SystemClock.elapsedRealtime();
            }
            if (this.d) {
                this.d = false;
                if (this.b != -1) {
                    this.c += SystemClock.elapsedRealtime() - this.b;
                    this.b = -1L;
                }
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3355d642", new Object[]{this});
            } else if (!this.d) {
                this.d = true;
                this.b = SystemClock.elapsedRealtime();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f implements ji6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f7443a = new Handler(Looper.getMainLooper());
        public final DinamicXEngine b;
        public long c;
        public b d;
        public ji6 e;
        public boolean f;
        public boolean g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                f.b(f.this, false);
                if (f.c(f.this)) {
                    f.d(f.this).p1(f.this);
                    long a2 = f.f(f.this).a(f.e(f.this));
                    if (a2 == 0) {
                        a2 = f.e(f.this);
                    }
                    f.d(f.this).b1(f.this, a2);
                    f.a(f.this).h();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public interface b {
            long a(long j);
        }

        public f(DinamicXEngine dinamicXEngine) {
            this.b = dinamicXEngine;
        }

        public static /* synthetic */ ji6 a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ji6) ipChange.ipc$dispatch("6f19107e", new Object[]{fVar});
            }
            return fVar.e;
        }

        public static /* synthetic */ boolean b(f fVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6202cb5b", new Object[]{fVar, new Boolean(z)})).booleanValue();
            }
            fVar.g = z;
            return z;
        }

        public static /* synthetic */ boolean c(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("81c8642", new Object[]{fVar})).booleanValue();
            }
            return fVar.f;
        }

        public static /* synthetic */ DinamicXEngine d(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DinamicXEngine) ipChange.ipc$dispatch("5e438c4a", new Object[]{fVar});
            }
            return fVar.b;
        }

        public static /* synthetic */ long e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8c4ae0f0", new Object[]{fVar})).longValue();
            }
            return fVar.c;
        }

        public static /* synthetic */ b f(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c1294d52", new Object[]{fVar});
            }
            return fVar.d;
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else if (this.f) {
                this.f = false;
                this.b.p1(this);
                this.d = null;
                this.e = null;
            }
        }

        @Override // tb.ji6
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdbf6212", new Object[]{this});
            } else if (!this.g) {
                this.g = true;
                this.f7443a.post(new a());
            }
        }

        public void i(long j, long j2, b bVar, ji6 ji6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4524259e", new Object[]{this, new Long(j), new Long(j2), bVar, ji6Var});
            } else if (!this.f) {
                this.f = true;
                this.c = j2;
                this.d = bVar;
                this.e = ji6Var;
                if (j <= 0) {
                    ji6Var.h();
                    this.b.b1(this, j2);
                    return;
                }
                this.b.b1(this, j);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1085610847:
                return new Long(super.getDefaultValueForLongAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXLoopViewLayoutWidgetNode");
        }
    }

    public static /* synthetic */ void t(l lVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347c46be", new Object[]{lVar, new Integer(i)});
        } else {
            lVar.F(i);
        }
    }

    public static /* synthetic */ void u(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0da984", new Object[]{lVar});
        } else {
            lVar.D();
        }
    }

    public static /* synthetic */ void v(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ee0a23", new Object[]{lVar});
        } else {
            lVar.E();
        }
    }

    public static /* synthetic */ e w(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c1ff54a2", new Object[]{lVar});
        }
        return lVar.i;
    }

    public static /* synthetic */ long x(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4aecb55", new Object[]{lVar})).longValue();
        }
        return lVar.c;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f317de67", new Object[]{this});
            return;
        }
        DXRootView L = getDXRuntimeContext().L();
        if (L == null) {
            this.i = null;
            return;
        }
        e a2 = e.a(L);
        this.i = a2;
        a2.c();
    }

    public final void B(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f9455d", new Object[]{this, dXEvent});
            return;
        }
        H(dXEvent);
        if (this.f7438a) {
            G();
            I();
        }
    }

    public final void C(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1be718d", new Object[]{this, dXEvent});
            return;
        }
        H(dXEvent);
        if (this.f7438a) {
            K();
            L();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fd8ccb", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onScreenOff");
        if (this.f7438a) {
            K();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebc1f1", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onScreenOn");
        if (this.f7438a) {
            I();
        }
    }

    public final void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onWindowVisibilityChanged ");
        sb.append(i);
        if (i == 0) {
            I();
        } else {
            K();
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f6cd1b", new Object[]{this});
        } else if (!this.l) {
            this.l = true;
            DXNativeLoopViewLayout y = y();
            if (y != null && z(y) == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" registerLoopViewLayoutLifecycle ");
                sb.append(y);
                y.setLifecycleListener(this.m);
            }
        }
    }

    public final void H(DXEvent dXEvent) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0118e8", new Object[]{this, dXEvent});
            return;
        }
        d dVar = this.h;
        if (dVar != null) {
            dXWidgetNode = dVar.g(this.g);
        } else {
            dXWidgetNode = null;
        }
        if (dXWidgetNode != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" broadcast event ");
            sb.append(dXEvent.getEventId());
            sb.append(" to child ");
            sb.append(dXWidgetNode);
            dXWidgetNode.sendBroadcastEvent(dXEvent);
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac98117c", new Object[]{this});
            return;
        }
        e eVar = this.i;
        if (eVar != null && this.j != null && this.d > 0 && !this.k) {
            this.k = true;
            eVar.d();
            this.j.i(this.i.b(this.c, this.d), this.d, new b(), this);
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777cfc3d", new Object[]{this});
        } else if (!this.f7438a) {
            h();
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5ae51c", new Object[]{this});
        } else if (this.k) {
            e eVar = this.i;
            if (eVar != null) {
                eVar.e();
            }
            f fVar = this.j;
            if (fVar != null) {
                fVar.g();
            }
            this.k = false;
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d4afe2", new Object[]{this});
        } else if (this.l) {
            this.l = false;
            DXNativeLoopViewLayout y = y();
            if (y != null && z(y) == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" unregisterLoopViewLayoutLifecycle ");
                sb.append(y);
                y.setLifecycleListener(null);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
            return;
        }
        super.bindRuntimeContext(dXRuntimeContext, z);
        if (dXRuntimeContext != null && (arrayList = this.e) != null) {
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().bindRuntimeContext(dXRuntimeContext, z);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new l();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXLOOPVIEWLAYOUT_AUTOLOOP) {
            return 1;
        }
        if (j == DXLOOPVIEWLAYOUT_LAYERORDER) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        if (j == DXLOOPVIEWLAYOUT_LOOPBEGINTIME || j == DXLOOPVIEWLAYOUT_LOOPINTERVAL) {
            return 0L;
        }
        return super.getDefaultValueForLongAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        L();
        K();
        if (this.e != null) {
            if (cw6.b()) {
                new RuntimeException();
            }
            la6.b("DXLoopViewLayout#onBeforeBindChildData#unexpected_change_item#" + xv5.a(new RuntimeException()));
        }
        this.g = 0;
        this.h = null;
        this.i = null;
        this.k = false;
        List<DXWidgetNode> children = getChildren();
        if (children == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>(children);
        }
        this.e = arrayList;
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof l) {
            super.onClone(dXWidgetNode, z);
            l lVar = (l) dXWidgetNode;
            if (this.e != null) {
                if (cw6.b()) {
                    new RuntimeException();
                }
                la6.b("DXLoopViewLayout#onClone#unexpected_change_item#" + xv5.a(new RuntimeException()));
            }
            this.f7438a = lVar.f7438a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
            this.f = lVar.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeLoopViewLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (!dXEvent.isPrepareBind()) {
            long eventId = dXEvent.getEventId();
            if (eventId == 5288671110273408574L) {
                B(dXEvent);
            } else if (eventId == 5388973340095122049L) {
                C(dXEvent);
            } else if (eventId == DXLOOPVIEWLAYOUT_STARTPLAY) {
                J();
            }
        }
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.f == null) {
            this.f = new o(getDXRuntimeContext().s(), 3, UUID.randomUUID().toString());
        }
        if (getChildrenCount() <= 0 || (getChildAt(0) instanceof j)) {
            removeAllChild();
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        removeAllChild();
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof DXNativeLoopViewLayout) {
            DXNativeLoopViewLayout dXNativeLoopViewLayout = (DXNativeLoopViewLayout) view;
            if (this.i == null) {
                A();
            }
            DinamicXEngine f2 = getDXRuntimeContext().s().f();
            ArrayList<DXWidgetNode> arrayList = this.e;
            if ((arrayList == null || arrayList.isEmpty()) && f2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new f.a("DXLoopViewLayout", "data_error", com.taobao.android.dinamicx.f.DX_ERROR_BIZ_CODE));
                DinamicXEngine.n(f2.c(), getDXRuntimeContext().p(), arrayList2);
            }
            if (this.h == null) {
                d dVar = new d(this.f, context, this);
                this.h = dVar;
                dVar.h(this.e);
            }
            if (this.j == null) {
                this.j = new f(f2);
            }
            dXNativeLoopViewLayout.bindData(getMeasuredWidth(), getMeasuredHeight(), this.h, this.g, this.b);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXLOOPVIEWLAYOUT_AUTOLOOP) {
            if (i == 0) {
                z = false;
            }
            this.f7438a = z;
        } else if (j == DXLOOPVIEWLAYOUT_LAYERORDER) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        if (t26.DX_PARSER_LISTDATA == j && jSONArray != null && jSONArray.size() == 2) {
            jSONArray.add(jSONArray.get(0));
            jSONArray.add(jSONArray.get(1));
        }
        super.onSetListAttribute(j, jSONArray);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXLOOPVIEWLAYOUT_LOOPBEGINTIME) {
            this.c = j2;
            if (j2 < 0) {
                this.c = getDefaultValueForLongAttr(j);
            }
        } else if (j == DXLOOPVIEWLAYOUT_LOOPINTERVAL) {
            this.d = j2;
            if (j2 < 0) {
                this.d = getDefaultValueForLongAttr(j);
            }
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    public final DXNativeLoopViewLayout y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeLoopViewLayout) ipChange.ipc$dispatch("cf6c7fb9", new Object[]{this});
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXNativeLoopViewLayout) {
            return (DXNativeLoopViewLayout) D;
        }
        return null;
    }

    public final DXWidgetNode z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("617b6bcc", new Object[]{this, view});
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (tag instanceof DXWidgetNode) {
            return ((DXWidgetNode) tag).getDXRuntimeContext().W();
        }
        return null;
    }

    @Override // tb.ji6
    public void h() {
        DXTemplateItem dXTemplateItem;
        DXNativeLoopViewLayout y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbf6212", new Object[]{this});
            return;
        }
        try {
            d dVar = this.h;
            if (dVar != null && dVar.c() >= 3 && (y = y()) != null) {
                if (z(y) == this) {
                    y.roll();
                    int i = this.g;
                    this.g = 1 + i;
                    DXWidgetNode g = this.h.g(i);
                    DXWidgetNode g2 = this.h.g(this.g);
                    g.sendBroadcastEvent(new DXViewEvent(-5201408949358043646L));
                    g2.sendBroadcastEvent(new DXViewEvent(-8975334121118753601L));
                    g.sendBroadcastEvent(new DXViewEvent(5388973340095122049L));
                    g2.sendBroadcastEvent(new DXViewEvent(5288671110273408574L));
                    if (cw6.b()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this);
                        sb.append(" broadcast event -5201408949358043646 to child ");
                        sb.append(g);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(" broadcast event -8975334121118753601 to child ");
                        sb2.append(g2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this);
                        sb3.append(" broadcast event 5388973340095122049 to child ");
                        sb3.append(g);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this);
                        sb4.append(" broadcast event 5288671110273408574 to child ");
                        sb4.append(g2);
                    }
                } else if (this.f7438a) {
                    L();
                    K();
                }
            }
        } catch (Throwable th) {
            Log.e("LoopViewLayout", "", th);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            String str = "unknown";
            if (dXRuntimeContext != null) {
                DinamicXEngine f2 = getDXRuntimeContext().s().f();
                if (f2 != null) {
                    str = f2.c();
                }
                dXTemplateItem = dXRuntimeContext.p();
            } else {
                dXTemplateItem = null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new f.a("DXLoopViewLayout", "catch_error", com.taobao.android.dinamicx.f.DX_ERROR_BIZ_CODE));
            DinamicXEngine.n(str, dXTemplateItem, arrayList);
        }
    }
}

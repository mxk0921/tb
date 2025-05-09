package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.HashMap;
import java.util.Map;
import tb.syo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xbu extends zr7 implements j, ScrollChangeListener, FlatViewGroup.f, FlatViewGroup.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_POST_TO_CHILD = "post-to-child";
    public static final String KEY_TRACK_TARGET = "trackTarget";

    /* renamed from: a  reason: collision with root package name */
    public djw f31284a;
    public long c;
    public boolean b = false;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public final Handler g = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlatViewGroup f31286a;

        public b(FlatViewGroup flatViewGroup) {
            this.f31286a = flatViewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f31286a.getVisibility() == 0) {
                xbu.j(xbu.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements syo.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bae f31287a;
        public final /* synthetic */ syo.a[] b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.this.f31287a.f().c(c.this.b[0]);
                }
            }
        }

        public c(bae baeVar, syo.a[] aVarArr) {
            this.f31287a = baeVar;
            this.b = aVarArr;
        }

        @Override // tb.syo.a
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                xbu.k(xbu.this);
                xbu.l(xbu.this).post(new a());
            }
        }
    }

    static {
        t2o.a(503316885);
        t2o.a(503317092);
        t2o.a(503317321);
        t2o.a(503317460);
        t2o.a(503317459);
    }

    public static /* synthetic */ View h(xbu xbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf26d54c", new Object[]{xbuVar});
        }
        return xbuVar.view;
    }

    public static /* synthetic */ int i(xbu xbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7a0554", new Object[]{xbuVar})).intValue();
        }
        int i = xbuVar.e;
        xbuVar.e = 1 + i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(xbu xbuVar, String str, Object... objArr) {
        if (str.hashCode() == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TrackerComponent");
    }

    public static /* synthetic */ void j(xbu xbuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f275a68c", new Object[]{xbuVar, new Boolean(z)});
        } else {
            xbuVar.t(z);
        }
    }

    public static /* synthetic */ void k(xbu xbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51373da3", new Object[]{xbuVar});
        } else {
            xbuVar.s();
        }
    }

    public static /* synthetic */ Handler l(xbu xbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f4875904", new Object[]{xbuVar});
        }
        return xbuVar.g;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        V v = this.view;
        if (v instanceof FlatViewGroup) {
            ((FlatViewGroup) v).removeVisibilityChangedCallback(this);
            ((FlatViewGroup) this.view).removeSizeChangedCallback(this);
        }
        djw djwVar = this.f31284a;
        if (djwVar != null) {
            djwVar.b();
        }
        super.detach(z);
        t(false);
        this.b = false;
        this.c = 0L;
        this.d = 0;
    }

    public final boolean m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae03327", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        djw djwVar = this.f31284a;
        if (djwVar != null) {
            return djwVar.m(z);
        }
        return false;
    }

    /* renamed from: n */
    public d generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1b88285e", new Object[]{this});
        }
        return new d();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e04cd72a", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(d.Q((d) this.viewParams));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            s();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!d.K((d) this.viewParams)) {
        } else {
            if (i == 0) {
                u();
            } else {
                q();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.e
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (i3 <= 0 || i4 <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i > 0 && i2 > 0) {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        if (z2) {
            r();
        } else {
            s();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.f
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
        } else if (view != this.view) {
        } else {
            if (i == 0) {
                s();
            } else {
                r();
            }
        }
    }

    /* renamed from: p */
    public FlatViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("58c6c4f2", new Object[]{this, context});
        }
        FlatViewGroup c2 = ut2.c(context);
        c2.bindComponent(this);
        if (akt.p2("enableFixTrackExpose", true)) {
            axk.a(c2, new b(c2));
        }
        this.f31284a = new djw(this.node, d.O((d) this.viewParams), d.P((d) this.viewParams), this, null);
        c2.addVisibilityChangedCallback(this);
        c2.addSizeChangedCallback(this);
        return c2;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7a4b76", new Object[]{this});
        } else {
            this.g.removeMessages(0);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb30dc1", new Object[]{this});
            return;
        }
        this.g.removeMessages(2);
        this.g.removeMessages(1);
        if ((this.node.P().W() instanceof anl) || !TextUtils.isEmpty(d.Q((d) this.viewParams))) {
            t(false);
        } else {
            this.g.sendEmptyMessage(2);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7be03bc", new Object[]{this});
            return;
        }
        this.g.removeMessages(2);
        this.g.removeMessages(1);
        this.g.sendEmptyMessage(1);
    }

    public final void u() {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d99344", new Object[]{this});
            return;
        }
        if (d.K((d) this.viewParams)) {
            djw djwVar = this.f31284a;
            if (djwVar != null) {
                i = djwVar.e();
            } else {
                i = 0;
            }
            if (i != 0) {
                z = false;
            }
        }
        if (this.b && this.e < d.L((d) this.viewParams) && d.M((d) this.viewParams) != null && !this.g.hasMessages(0) && z) {
            this.g.sendEmptyMessageDelayed(0, d.N((d) this.viewParams));
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ad9368", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22035b6", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(d.Q((d) this.viewParams))) {
            od0.D().d().h(this.node, d.Q((d) this.viewParams));
            od0.D().d().updatePageName(this.node, d.Q((d) this.viewParams));
        }
        if (d.R((d) this.viewParams) != null) {
            od0.D().d().updatePageProperties(this.node, d.R((d) this.viewParams));
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86e8650", new Object[]{this});
        } else if (!TextUtils.isEmpty(d.Q((d) this.viewParams))) {
            od0.D().d().pageDisAppear(this.node);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TrackerComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    xbu.j(xbu.this, true);
                } else if (i == 2) {
                    xbu.j(xbu.this, false);
                }
            } else if (xbu.h(xbu.this) != null) {
                xbu.i(xbu.this);
                xbu xbuVar = xbu.this;
                xbuVar.sendMessage(xbuVar.getNode(), "onidle", null, null, null);
            }
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462e19c3", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.b;
        boolean z3 = m(z2) && z;
        this.b = z3;
        if (z2 != z3) {
            HashMap hashMap = new HashMap();
            if (this.b) {
                this.c = System.currentTimeMillis();
                if (this.d < d.S((d) this.viewParams)) {
                    this.d++;
                    if (this.node.H("onviewappear") != null || d.I((d) this.viewParams)) {
                        hashMap.put("time", Long.valueOf(this.c));
                        hashMap.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(this.d));
                        hashMap.put("index", this.node.H("index"));
                        sendMessage(d.I((d) this.viewParams) ? 34 : 0, getNode(), "onviewappear", null, hashMap, null);
                    }
                }
                u();
                if (d.J((d) this.viewParams)) {
                    this.view.setBackgroundColor(-65536);
                }
                if (!this.f) {
                    w();
                    return;
                }
                return;
            }
            q();
            if (this.d <= d.S((d) this.viewParams)) {
                long currentTimeMillis = System.currentTimeMillis();
                hashMap.put("time", Long.valueOf(currentTimeMillis));
                hashMap.put("duration", Long.valueOf(currentTimeMillis - this.c));
                hashMap.put(UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(this.d));
                hashMap.put("index", this.node.H("index"));
                sendMessage(d.I((d) this.viewParams) ? 34 : 0, getNode(), "onviewdisappear", null, hashMap, null);
            }
            if (!this.f) {
                x();
            }
            if (d.J((d) this.viewParams)) {
                this.view.setBackgroundColor(tkt.DEFAULT_LINK_COLOR);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String C0;
        public boolean D0;
        public String E0;
        public Map F0;
        public boolean G0;
        public boolean z0;
        public int w0 = Integer.MAX_VALUE;
        public float x0 = 0.0f;
        public float y0 = 0.0f;
        public int A0 = 5000;
        public int B0 = 1;

        static {
            t2o.a(503316890);
        }

        public static /* synthetic */ boolean I(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5216aba5", new Object[]{dVar})).booleanValue();
            }
            return dVar.G0;
        }

        public static /* synthetic */ boolean J(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97b7ee44", new Object[]{dVar})).booleanValue();
            }
            return dVar.z0;
        }

        public static /* synthetic */ boolean K(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dd5930e3", new Object[]{dVar})).booleanValue();
            }
            return dVar.D0;
        }

        public static /* synthetic */ int L(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22fa7371", new Object[]{dVar})).intValue();
            }
            return dVar.B0;
        }

        public static /* synthetic */ String M(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c5479c23", new Object[]{dVar});
            }
            return dVar.C0;
        }

        public static /* synthetic */ int N(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae3cf8af", new Object[]{dVar})).intValue();
            }
            return dVar.A0;
        }

        public static /* synthetic */ float O(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c18f4c7d", new Object[]{dVar})).floatValue();
            }
            return dVar.x0;
        }

        public static /* synthetic */ float P(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7308f1c", new Object[]{dVar})).floatValue();
            }
            return dVar.y0;
        }

        public static /* synthetic */ String Q(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("11d29235", new Object[]{dVar});
            }
            return dVar.E0;
        }

        public static /* synthetic */ Map R(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("9c0c251f", new Object[]{dVar});
            }
            return dVar.F0;
        }

        public static /* synthetic */ int S(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6356dc3a", new Object[]{dVar})).intValue();
            }
            return dVar.w0;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TrackerComponent$TrackerParams");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
            if (r9.equals(tb.xbu.KEY_POST_TO_CHILD) == false) goto L_0x0027;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.xbu.d.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r4.equals("onwilldisappear") == false) goto L_0x002e;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r9) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xbu.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }
}

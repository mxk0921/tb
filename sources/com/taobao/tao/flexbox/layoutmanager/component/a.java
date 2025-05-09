package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.CustomRoundRectFeature;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.bqe;
import tb.cy0;
import tb.dgw;
import tb.gpe;
import tb.hk8;
import tb.igs;
import tb.jfw;
import tb.mx7;
import tb.nwv;
import tb.rbi;
import tb.rgo;
import tb.skg;
import tb.t2o;
import tb.ut2;
import tb.w2w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends com.taobao.tao.flexbox.layoutmanager.core.c<TNodeImageView, bqe, rgo> implements ImageLoader.d, skg, w2w, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f12135a;
    public int b;
    public int c;
    public boolean d;
    public ListViewComponent e;
    public ScrollViewComponent f;
    public MessageQueue.IdleHandler g;
    public ImageLoader.f h;
    public boolean i = false;
    public final com.taobao.tao.flexbox.layoutmanager.core.b j = new C0684a();
    public final ScrollChangeListener k = new d();
    public final ScrollChangeListener l = new e();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0684a extends b.b0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0684a() {
        }

        public static /* synthetic */ Object ipc$super(C0684a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ImageComponent$1");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, Object obj, jfw jfwVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1bb4e98", new Object[]{this, eVar, obj, jfwVar, fVar});
            } else {
                a.h(a.this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("805570d3", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public void j(n nVar, jfw jfwVar, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d67596e5", new Object[]{this, nVar, jfwVar, str, obj});
            } else if (TextUtils.equals(str, "tint-color") && (jfwVar instanceof bqe)) {
                ((bqe) jfwVar).J(nVar.N(), obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gpe.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gpe.b
        public void a(Object obj, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
            } else if (a.i(a.this) != null && ((TNodeImageView) a.k(a.this)).getDrawable() == null && nwv.i(obj, ((bqe) a.l(a.this)).D0)) {
                ((TNodeImageView) a.m(a.this)).setImageDrawable(drawable);
            }
        }

        @Override // tb.gpe.b
        public void b(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            if (!a.n(a.this)) {
                return true;
            }
            a.o(a.this);
            a.q(a.this, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                a.r(a.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
            } else if (a.s(a.this) && a.p(a.this) != null && a.j(a.this)) {
                Looper.myQueue().removeIdleHandler(a.p(a.this));
                a.q(a.this, null);
                a.o(a.this);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }
    }

    static {
        t2o.a(503316724);
        t2o.a(503316617);
        t2o.a(503317089);
        t2o.a(503317523);
        t2o.a(503317092);
    }

    public static /* synthetic */ void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854836ed", new Object[]{aVar});
        } else {
            aVar.E();
        }
    }

    public static /* synthetic */ View i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("257ce4ce", new Object[]{aVar});
        }
        return aVar.view;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1500175553:
                super.applyAttrForDrawable((Drawable) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/ImageComponent");
        }
    }

    public static /* synthetic */ boolean j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e195fe2", new Object[]{aVar})).booleanValue();
        }
        return aVar.y();
    }

    public static /* synthetic */ View k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("87d7fbad", new Object[]{aVar});
        }
        return aVar.view;
    }

    public static /* synthetic */ jfw l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("b43bebe9", new Object[]{aVar});
        }
        return aVar.viewParams;
    }

    public static /* synthetic */ View m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c8e296b", new Object[]{aVar});
        }
        return aVar.view;
    }

    public static /* synthetic */ boolean n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1aa1a0c", new Object[]{aVar})).booleanValue();
        }
        return aVar.attached;
    }

    public static /* synthetic */ void o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8a7aa7", new Object[]{aVar});
        } else {
            aVar.D();
        }
    }

    public static /* synthetic */ MessageQueue.IdleHandler p(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("3700e3b0", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ MessageQueue.IdleHandler q(a aVar, MessageQueue.IdleHandler idleHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("a9610e20", new Object[]{aVar, idleHandler});
        }
        aVar.g = idleHandler;
        return idleHandler;
    }

    public static /* synthetic */ void r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4b3be5", new Object[]{aVar});
        } else {
            aVar.B();
        }
    }

    public static /* synthetic */ boolean s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("852b9c88", new Object[]{aVar})).booleanValue();
        }
        return aVar.i;
    }

    public final void B() {
        Drawable drawable;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a061573c", new Object[]{this});
            return;
        }
        V v = this.view;
        if (v != 0) {
            TNodeImageView tNodeImageView = (TNodeImageView) v;
            ListViewComponent listViewComponent = this.e;
            if (listViewComponent != null) {
                z = listViewComponent.T1();
            }
            tNodeImageView.loadImageIfInSlowScroll(z);
            return;
        }
        Drawable[] drawableArr = this.drawable;
        if (drawableArr != null && (drawable = drawableArr[1]) != null) {
            rgo rgoVar = (rgo) drawable;
            ListViewComponent listViewComponent2 = this.e;
            if (listViewComponent2 != null) {
                z = listViewComponent2.T1();
            }
            rgoVar.f(z);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a6e047", new Object[]{this});
            return;
        }
        B();
        V v = this.view;
        if (!(v == 0 || ((TNodeImageView) v).getTransitionName() == null)) {
            float r = nwv.r(((TNodeImageView) this.view).getTag(R.id.layout_manager_share_element_original_alpha), 1);
            if (r > 0.0f && ((TNodeImageView) this.view).getAlpha() == 0.0f) {
                ((TNodeImageView) this.view).setAlpha(r);
            }
        }
        V v2 = this.view;
        if (v2 != 0) {
            Drawable drawable = ((TNodeImageView) v2).getDrawable();
            if (drawable instanceof cy0) {
                cy0 cy0Var = (cy0) drawable;
                if (!cy0Var.u()) {
                    cy0Var.C();
                }
            }
        }
    }

    public final void E() {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cceea32", new Object[]{this});
        } else if (((bqe) this.viewParams).w0 != 0 && (v = this.view) != 0 && ((TNodeImageView) v).getDrawable() != null) {
            DrawableCompat.setTint(((TNodeImageView) this.view).getDrawable(), ((bqe) this.viewParams).w0);
        }
    }

    public final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94940ca", new Object[]{this})).booleanValue();
        }
        ScrollViewComponent scrollViewComponent = this.f;
        if (scrollViewComponent != null) {
            scrollViewComponent.removeScrollChangedListener(this.l);
        }
        ScrollViewComponent scrollViewComponent2 = this.f;
        if (scrollViewComponent2 == null || scrollViewComponent2.getViewParams() == null || this.f.getViewParams().v != YogaFlexDirection.ROW) {
            return false;
        }
        this.f.addScrollChangedListener(this.l);
        return true;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51993f2", new Object[]{this});
            return;
        }
        this.i = true;
        if (!akt.M0() || y() || this.g != null || !G()) {
            D();
            return;
        }
        this.g = new c();
        Looper.myQueue().addIdleHandler(this.g);
    }

    @Override // tb.w2w
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bea48f", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.w2w
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d695bb4", new Object[]{this});
        } else {
            B();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.g != null) {
            Looper.myQueue().removeIdleHandler(this.g);
            this.g = null;
        }
        ListViewComponent listViewComponent = this.e;
        if (listViewComponent != null) {
            listViewComponent.removeScrollStateListener(this.k);
            this.e.Y1(this);
        }
        ScrollViewComponent scrollViewComponent = this.f;
        if (scrollViewComponent != null) {
            scrollViewComponent.removeScrollChangedListener(this.l);
        }
        V v = this.view;
        if (v != 0) {
            ((TNodeImageView) v).cancel();
            ((TNodeImageView) this.view).removeFeature(CustomRoundRectFeature.class);
            ut2.y((TNodeImageView) this.view);
            ((TNodeImageView) this.view).setImageLoadCallback(null);
            this.view = null;
        }
        ImageLoader.f fVar = this.h;
        if (fVar != null) {
            fVar.a();
        }
        this.f12135a = null;
        super.detach(z);
    }

    @Override // tb.w2w
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a47724", new Object[]{this, new Integer(i)});
        }
    }

    public Drawable getImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6f806710", new Object[]{this});
        }
        V v = this.view;
        if (v != 0) {
            return ((TNodeImageView) v).getDrawable();
        }
        Drawable[] drawableArr = this.drawable;
        if (drawableArr != null) {
            return drawableArr[1];
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public Component.k getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component.k) ipChange.ipc$dispatch("c0d56852", new Object[]{this});
        }
        V v = this.view;
        Bitmap bitmap = null;
        if (v != 0) {
            Drawable drawable = ((TNodeImageView) v).getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Component.k kVar = new Component.k();
                kVar.f12192a = ((bqe) this.viewParams).z0;
                kVar.b = nwv.x(this.view);
                if (drawable instanceof cy0) {
                    try {
                        bitmap = ((cy0) drawable).t();
                        ((cy0) drawable).y();
                    } catch (Throwable unused) {
                    }
                }
                if (bitmap == null) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
                kVar.c = bitmap;
                return kVar;
            }
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
    public void onImageLoadFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feabda6", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            return;
        }
        igs.a("onImageLoaded");
        if (bitmapDrawable != null) {
            P p = this.viewParams;
            if (((bqe) p).w0 != 0) {
                if (this.view != 0) {
                    DrawableCompat.setTint(bitmapDrawable, ((bqe) p).w0);
                } else {
                    Drawable[] drawableArr = this.drawable;
                    if (!(drawableArr == null || (drawable = drawableArr[1]) == null)) {
                        DrawableCompat.setTint(drawable, ((bqe) p).w0);
                    }
                }
            }
            if (getNode() != null && nwv.o(getNode().H("effect-view"), false)) {
                postMessage(34, getNode().Y(), "onBlurViewRefresh", null, null, null);
            }
        }
        updateAPMToken(this.view, dgw.APM_VIEW_VALID);
        igs.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        F();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<n> list) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        V v = this.view;
        if (!(v == 0 || !componentAlpha || (drawable = ((TNodeImageView) v).getDrawable()) == null)) {
            if (!z) {
                f *= ((bqe) this.viewParams).T;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        return componentAlpha;
    }

    /* renamed from: t */
    public void applyAttrForDrawable(rgo rgoVar, bqe bqeVar, Map map, boolean z) {
        Drawable[] drawableArr;
        Drawable drawable;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2824451", new Object[]{this, rgoVar, bqeVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForDrawable(rgoVar, bqeVar, map, z);
        int i2 = bqeVar.K;
        if (i2 > 0 || bqeVar.L > 0 || bqeVar.M > 0 || bqeVar.N > 0) {
            float f = i2;
            float f2 = bqeVar.L;
            float f3 = bqeVar.N;
            float f4 = bqeVar.M;
            rgoVar.k(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        } else {
            int i3 = bqeVar.J;
            if (i3 > 0) {
                rgoVar.l(i3);
            }
        }
        if (bqeVar.O > 0) {
            int i4 = bqeVar.P;
            if (i4 == 1) {
                i4 = bqeVar.E;
            }
            if (i4 != 1) {
                i = i4;
            }
            rgoVar.j(i);
            rgoVar.m(bqeVar.O);
        }
        int i5 = bqeVar.w0;
        if (!(i5 == 0 || (drawableArr = this.drawable) == null || (drawable = drawableArr[1]) == null)) {
            DrawableCompat.setTint(drawable, i5);
        }
        H();
    }

    /* renamed from: u */
    public void applyAttrForView(TNodeImageView tNodeImageView, bqe bqeVar, Map map, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0697", new Object[]{this, tNodeImageView, bqeVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(tNodeImageView, bqeVar, map, z);
        CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) ((TNodeImageView) this.view).findFeature(CustomRoundRectFeature.class);
        if (this.node.F0() || z) {
            igs.a("image update attr");
            this.f12135a = null;
            if (bqeVar.K > 0 || bqeVar.L > 0 || bqeVar.M > 0 || bqeVar.N > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                float f = bqeVar.K;
                float f2 = bqeVar.L;
                float f3 = bqeVar.N;
                float f4 = bqeVar.M;
                customRoundRectFeature.setRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
            } else if (bqeVar.J > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                customRoundRectFeature.setRadiusX(bqeVar.J);
                customRoundRectFeature.setRadiusY(bqeVar.J);
            }
            if (bqeVar.O > 0) {
                if (customRoundRectFeature == null) {
                    customRoundRectFeature = new CustomRoundRectFeature();
                }
                customRoundRectFeature.setStrokeWidth(bqeVar.O);
                int i2 = bqeVar.P;
                if (i2 == 1) {
                    i2 = bqeVar.E;
                }
                if (i2 != 1) {
                    i = i2;
                }
                customRoundRectFeature.setStrokeColor(i);
            }
            if (bqeVar.F != 1 && this.f12135a == null) {
                this.f12135a = mx7.f(null, bqeVar);
            }
            igs.c();
        }
        if (!bqeVar.i() && customRoundRectFeature != null) {
            customRoundRectFeature.setRadii(null);
            customRoundRectFeature.setRadiusX(0.0f);
            customRoundRectFeature.setRadiusY(0.0f);
        }
        if (customRoundRectFeature != null && ((TNodeImageView) this.view).findFeature(CustomRoundRectFeature.class) == null) {
            ((TNodeImageView) this.view).addFeature(customRoundRectFeature);
        }
        Drawable drawable = this.f12135a;
        if (drawable != null) {
            ((TNodeImageView) this.view).setForeground(drawable);
        }
        E();
        H();
    }

    /* renamed from: v */
    public bqe generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqe) ipChange.ipc$dispatch("635b819", new Object[]{this});
        }
        return new bqe();
    }

    public final int[] w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1ae475fc", new Object[]{this});
        }
        P p = this.viewParams;
        if (((bqe) p).A0 <= 0 || ((bqe) p).B0 <= 0) {
            this.d = false;
        } else {
            this.b = ((bqe) p).A0;
            this.c = ((bqe) p).B0;
            this.d = true;
        }
        rbi rbiVar = this.measureResult;
        int i = rbiVar.f27261a;
        int i2 = rbiVar.b;
        if (this.d) {
            i = this.b;
            i2 = this.c;
        }
        return new int[]{i, i2};
    }

    public final boolean x(Object obj) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3548cc7", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof String) {
            z = gpe.e((String) obj);
        } else {
            z = false;
        }
        if (z || "gif".equals(((bqe) this.viewParams).F0) || "apng".equals(((bqe) this.viewParams).F0)) {
            return true;
        }
        P p = this.viewParams;
        if (((bqe) p).g0 == null && (((bqe) p).H0 & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.component.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "74f3ae8a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            V extends android.view.View r2 = r8.view
            if (r2 != 0) goto L_0x001e
            return r0
        L_0x001e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            V extends android.view.View r3 = r8.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView r3 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView) r3
            boolean r2 = r3.getGlobalVisibleRect(r2)
            if (r2 != 0) goto L_0x0074
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r8.node
            android.content.Context r2 = r2.N()
            int r2 = tb.s6o.B(r2)
            com.taobao.tao.flexbox.layoutmanager.core.n r3 = r8.node
            tb.rbi r4 = r8.measureResult
            int r4 = r4.c
        L_0x003d:
            if (r4 >= r2) goto L_0x0070
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r3.Y()
            if (r5 == 0) goto L_0x0070
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r3.Y()
            tb.rbi r5 = r5.S()
            if (r5 == 0) goto L_0x0070
            com.taobao.tao.flexbox.layoutmanager.core.n r5 = r3.Y()
            tb.rbi r6 = r5.S()
            int r6 = r6.c
            android.view.View r7 = r5.w0()
            if (r7 == 0) goto L_0x0068
            android.view.View r5 = r5.w0()
            int r5 = r5.getScrollX()
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            int r6 = r6 - r5
            int r4 = r4 + r6
            com.taobao.tao.flexbox.layoutmanager.core.n r3 = r3.Y()
            goto L_0x003d
        L_0x0070:
            if (r4 >= r2) goto L_0x0073
            r0 = 1
        L_0x0073:
            return r0
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.a.y():boolean");
    }

    /* renamed from: z */
    public rgo onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgo) ipChange.ipc$dispatch("e4ea607", new Object[]{this, context});
        }
        n g = q.g(this.node);
        if (g != null) {
            ListViewComponent listViewComponent = (ListViewComponent) g.K();
            this.e = listViewComponent;
            listViewComponent.addScrollStateListener(this.k);
        }
        return ut2.a(context.getResources());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if (!akt.p2("enableOptImageAttr", true) || !TextUtils.equals(str, "tint-color")) {
            return super.getAttributeHandler(str);
        }
        return this.j;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar.d.equals("onwillappear")) {
            C();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            return;
        }
        onImageLoadFailed();
        n nVar = this.node;
        P p = this.viewParams;
        nwv.B0(nVar, false, ((bqe) p).y0, ((bqe) p).z0, null);
    }

    /* renamed from: A */
    public TNodeImageView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("2c5885d9", new Object[]{this, context});
        }
        TNodeImageView f = ut2.f(context);
        P p = this.viewParams;
        if (((bqe) p).E0 == null) {
            f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (((bqe) p).E0.equals("contain")) {
            f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (((bqe) this.viewParams).E0.equals("cover")) {
            f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (((bqe) this.viewParams).E0.equals("stretch")) {
            f.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        f.setReleaseDrawableOnDetach(false);
        n g = q.g(this.node);
        if (g != null) {
            ListViewComponent listViewComponent = (ListViewComponent) g.K();
            this.e = listViewComponent;
            listViewComponent.addScrollStateListener(this.k);
            this.e.v1(this);
        }
        n z = this.node.z(ScrollViewComponent.class, null, true);
        if (z != null) {
            this.f = (ScrollViewComponent) z.K();
        }
        updateAPMToken(f, dgw.APM_VIEW_INVALID);
        Drawable i = ut2.i(((bqe) this.viewParams).y0, true);
        if (i == null && !TextUtils.isEmpty(((bqe) this.viewParams).d0)) {
            i = ut2.i(((bqe) this.viewParams).d0, true);
        }
        if (i != null) {
            f.setImageDrawable(i);
            if ((this.node.P().W() instanceof anl) && !((anl) this.node.P().W()).isTransitionCompleted()) {
                f.postponedSetImageDrawable();
            }
        }
        return f;
    }

    public final void D() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ad4a1d", new Object[]{this});
            return;
        }
        igs.a("setImageUrl");
        this.i = false;
        F();
        V v = this.view;
        if (v != 0) {
            ((TNodeImageView) v).setImageLoadCallback(this);
            TNodeImageView tNodeImageView = (TNodeImageView) this.view;
            ListViewComponent listViewComponent = this.e;
            tNodeImageView.loadImageIfInSlowScroll(listViewComponent != null ? listViewComponent.T1() : true);
            if (!nwv.i(((bqe) this.viewParams).x0, ((TNodeImageView) this.view).getImageSrc())) {
                if (TextUtils.isEmpty(((bqe) this.viewParams).d0) || !this.node.P().u0()) {
                    if (((TNodeImageView) this.view).getDrawable() == null) {
                        bqe bqeVar = (bqe) this.viewParams;
                        if (bqeVar.C0 != 1) {
                            ((TNodeImageView) this.view).setImageDrawable(new ColorDrawable(((bqe) this.viewParams).C0));
                        } else if (bqeVar.D0 != null) {
                            o P = this.node.P();
                            Object obj = ((bqe) this.viewParams).D0;
                            rbi rbiVar = this.measureResult;
                            this.h = gpe.f(null, P, obj, rbiVar.f27261a, rbiVar.b, ImageLoader.b.e("background", this.node), null, false, new b());
                        }
                    }
                    ((TNodeImageView) this.view).setShowAnimation(((bqe) this.viewParams).G0);
                }
                bqe bqeVar2 = (bqe) this.viewParams;
                String str = !TextUtils.equals(bqeVar2.z0, bqeVar2.y0) ? ((bqe) this.viewParams).z0 : null;
                int[] w = w();
                o P2 = this.node.P();
                bqe bqeVar3 = (bqe) this.viewParams;
                Object obj2 = bqeVar3.x0;
                int i = w[0];
                int i2 = w[1];
                ImageLoader.b g = ImageLoader.b.g(bqeVar3, this.node);
                bqe bqeVar4 = (bqe) this.viewParams;
                ((TNodeImageView) this.view).setImageSrc(P2, obj2, str, i, i2, g, bqeVar4.g0, x(bqeVar4.x0));
            } else if (this.node.J0("src")) {
                Drawable drawable2 = ((TNodeImageView) this.view).getDrawable();
                if ((drawable2 instanceof cy0) && !TextUtils.equals(((bqe) this.viewParams).F0, "png")) {
                    ((cy0) drawable2).C();
                }
            }
        } else {
            Drawable[] drawableArr = this.drawable;
            if (!(drawableArr == null || (drawable = drawableArr[1]) == null)) {
                ((rgo) drawable).n(this);
                rgo rgoVar = (rgo) this.drawable[1];
                ListViewComponent listViewComponent2 = this.e;
                rgoVar.f(listViewComponent2 != null ? listViewComponent2.T1() : true);
                if (!TextUtils.equals(((bqe) this.viewParams).z0, ((rgo) this.drawable[1]).c())) {
                    int i3 = ((bqe) this.viewParams).C0;
                    if (i3 != 1) {
                        ((rgo) this.drawable[1]).i(i3);
                    }
                    ((rgo) this.drawable[1]).o(((bqe) this.viewParams).z0);
                }
            }
        }
        igs.c();
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731b0139", new Object[]{this});
            return;
        }
        int[] w = w();
        if (((bqe) this.viewParams).z0 == null || this.node.J0("src") || this.node.J0("image")) {
            igs.a("setupUrl");
            if (getNode() == null || getNode().u0() == null) {
                o P = this.node.P();
                Context N = this.node.N();
                bqe bqeVar = (bqe) this.viewParams;
                ((bqe) this.viewParams).z0 = gpe.i(P, N, bqeVar.y0, w[0], w[1], ImageLoader.b.g(bqeVar, this.node), x(((bqe) this.viewParams).y0));
            } else {
                String p = getNode().u0().p();
                String t = ut2.t(((bqe) this.viewParams).y0, p);
                if (!TextUtils.isEmpty(t)) {
                    ((bqe) this.viewParams).z0 = t;
                } else {
                    o P2 = this.node.P();
                    Context N2 = this.node.N();
                    bqe bqeVar2 = (bqe) this.viewParams;
                    ((bqe) this.viewParams).z0 = gpe.i(P2, N2, bqeVar2.y0, w[0], w[1], ImageLoader.b.g(bqeVar2, this.node), x(((bqe) this.viewParams).y0));
                    bqe bqeVar3 = (bqe) this.viewParams;
                    ut2.E(bqeVar3.y0, p, bqeVar3.z0);
                }
            }
            igs.c();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
            return;
        }
        onImageLoaded(bitmapDrawable);
        n nVar = this.node;
        P p = this.viewParams;
        nwv.B0(nVar, true, ((bqe) p).y0, ((bqe) p).z0, bitmapDrawable);
    }
}

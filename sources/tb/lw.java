package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.cyc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class lw extends kw implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public hij g;
    public boolean h;
    public int i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f23602a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: Taobao */
        /* renamed from: tb.lw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0985a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0985a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                lw.this.G(aVar.b, aVar.f23602a);
            }
        }

        public a(View view, ViewGroup viewGroup) {
            this.f23602a = view;
            this.b = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f23602a.post(new RunnableC0985a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURABottomSheetBehavior f23604a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ hij c;

        public b(AURABottomSheetBehavior aURABottomSheetBehavior, ViewGroup viewGroup, hij hijVar) {
            this.f23604a = aURABottomSheetBehavior;
            this.b = viewGroup;
            this.c = hijVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f23604a.setPeekHeight((int) (this.b.getHeight() * this.c.e()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends AURABottomSheetBehavior.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f23605a;
        public final /* synthetic */ hij b;

        public c(ViewGroup viewGroup, hij hijVar) {
            this.f23605a = viewGroup;
            this.b = hijVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/assembler/impl/draggable/AbsNUTFloatViewsDraggableAssembler$3");
        }

        @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.b
        public int a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cf2b7cb2", new Object[]{this, view})).intValue();
            }
            int height = (int) (this.f23605a.getHeight() * this.b.g());
            if (height <= 0) {
                return (int) (ai.d() * this.b.g());
            }
            return height;
        }

        @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.b
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea523843", new Object[]{this, coordinatorLayout, view, view2, new Integer(i), new Integer(i2), iArr, new Integer(i3)})).booleanValue();
            }
            if (lw.D(lw.this) || view.getTop() >= coordinatorLayout.getHeight()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            return z;
        }

        @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.b
        public void c(View view, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af574147", new Object[]{this, view, new Float(f)});
                return;
            }
            f(f);
            if (f >= 0.0f) {
                if (0.0f != f || lw.this.I().l()) {
                    ViewGroup F = lw.F(lw.this);
                    ViewGroup.LayoutParams layoutParams = F.getLayoutParams();
                    int height = (int) (this.f23605a.getHeight() * this.b.e());
                    layoutParams.height = (int) (height + ((((int) (this.f23605a.getHeight() * this.b.g())) - height) * f));
                    F.setLayoutParams(layoutParams);
                }
            }
        }

        @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.b
        public void d(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc8f5da", new Object[]{this, view, new Integer(i)});
            } else if (5 == i) {
                lw.E(lw.this, true);
            }
        }

        @Override // com.alibaba.android.umf.taobao.adapter.widget.behavior.AURABottomSheetBehavior.b
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da8b6a7c", new Object[]{this, coordinatorLayout, view, view2, new Integer(i)})).booleanValue();
            }
            if (lw.D(lw.this) || view.getTop() >= coordinatorLayout.getHeight()) {
                return true;
            }
            return false;
        }

        public final void f(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a6f62ed", new Object[]{this, new Float(f)});
                return;
            }
            View d = lw.this.d();
            if (d != null) {
                Drawable background = d.getBackground();
                background.mutate();
                if (f >= 0.0f) {
                    background.setAlpha(255);
                } else {
                    background.setAlpha(Math.min(255, Math.max(0, (int) ((1.0f - Math.abs(f)) * 255))));
                }
            }
        }
    }

    static {
        t2o.a(81789337);
    }

    public static /* synthetic */ boolean D(lw lwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c76a41c", new Object[]{lwVar})).booleanValue();
        }
        return lwVar.h;
    }

    public static /* synthetic */ void E(lw lwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da2927d", new Object[]{lwVar, new Boolean(z)});
        } else {
            lwVar.k(z);
        }
    }

    public static /* synthetic */ ViewGroup F(lw lwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("103c6eff", new Object[]{lwVar});
        }
        return lwVar.m();
    }

    public static /* synthetic */ Object ipc$super(lw lwVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1102902725) {
            super.f((View) objArr[0], (hij) objArr[1]);
            return null;
        } else if (hashCode == 1816468530) {
            super.b();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/assembler/impl/draggable/AbsNUTFloatViewsDraggableAssembler");
        }
    }

    public abstract void G(ViewGroup viewGroup, View view);

    public final void H(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd0318d", new Object[]{this, view, hijVar});
            return;
        }
        Boolean i = hijVar.i();
        if ((i == null || i.booleanValue()) && hijVar.j() == null) {
            ViewGroup m = m();
            m.post(new a(view, m));
        }
    }

    public final AURABottomSheetBehavior<View> I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABottomSheetBehavior) ipChange.ipc$dispatch("a4774753", new Object[]{this});
        }
        return AURABottomSheetBehavior.k((View) a());
    }

    public final int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f537a88", new Object[]{this})).intValue();
        }
        return I().getState();
    }

    public final boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ee25c5", new Object[]{this})).booleanValue();
        }
        cyc.a aVar = this.b;
        if (aVar != null && aVar.onClose()) {
            return true;
        }
        AURABottomSheetBehavior<View> I = I();
        if (5 == I.getState()) {
            return false;
        }
        I.setState(5);
        this.h = true;
        return true;
    }

    public final void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ecbf7", new Object[]{this, new Boolean(z)});
        } else {
            I().p(z);
        }
    }

    public void M(ViewGroup viewGroup, AURABottomSheetBehavior aURABottomSheetBehavior, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37fdbab", new Object[]{this, viewGroup, aURABottomSheetBehavior, hijVar});
            return;
        }
        Boolean i = hijVar.i();
        if (i != null) {
            aURABottomSheetBehavior.setDraggable(i.booleanValue());
        }
        aURABottomSheetBehavior.setSkipCollapsed(true);
        viewGroup.post(new b(aURABottomSheetBehavior, viewGroup, hijVar));
        aURABottomSheetBehavior.o(new c(viewGroup, hijVar));
    }

    @Override // tb.kw, tb.gyc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c451c32", new Object[]{this});
            return;
        }
        super.b();
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
        }
    }

    @Override // tb.gyc
    public void c(hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7c4307", new Object[]{this, hijVar});
        }
    }

    @Override // tb.kw, tb.gyc
    public void f(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bcf5c5", new Object[]{this, view, hijVar});
            return;
        }
        this.g = hijVar;
        super.f(view, hijVar);
        M(this.e, I(), hijVar);
        H(view, hijVar);
    }

    @Override // tb.gyc
    public ViewGroup h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9199c18e", new Object[]{this, context});
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.aura_float_view_draggable_layout, (ViewGroup) null);
            this.e = viewGroup2;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.e.addOnLayoutChangeListener(this);
        } else {
            x(viewGroup);
        }
        return this.e;
    }

    @Override // tb.kw
    public boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d88e71", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        K();
        return false;
    }

    @Override // tb.gyc
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return K();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(this.i == 0 || i9 == i10 || l() == null || this.g == null)) {
            f(l(), this.g);
        }
        this.i = i10;
    }

    @Override // tb.kw
    public void p(ViewGroup viewGroup, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200d3762", new Object[]{this, viewGroup, view, view2, marginLayoutParams, hijVar});
            return;
        }
        marginLayoutParams.height = (int) (viewGroup.getHeight() * hijVar.e());
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
    }

    @Override // tb.kw
    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d766db29", new Object[]{this})).intValue();
        }
        return R.id.auraFloatViewLayoutBackgroundMask;
    }

    @Override // tb.kw
    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34a8ba51", new Object[]{this})).intValue();
        }
        return R.id.auraFloatViewLayoutClose;
    }

    @Override // tb.kw
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9125bd2b", new Object[]{this})).intValue();
        }
        return R.id.auraFloatViewLayoutContentPlaceholder;
    }

    @Override // tb.kw
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a6234b", new Object[]{this})).intValue();
        }
        return R.id.auraFloatViewLayoutContentWrapper;
    }
}

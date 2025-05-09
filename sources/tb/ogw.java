package tb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ogw {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f25382a;

        public a(View view) {
            this.f25382a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f25382a.getContext().getSystemService("input_method")).showSoftInput(this.f25382a, 1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25383a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ e d;

        public b(boolean z, boolean z2, boolean z3, e eVar) {
            this.f25383a = z;
            this.b = z2;
            this.c = z3;
            this.d = eVar;
        }

        @Override // tb.ogw.e
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, f fVar) {
            if (this.f25383a) {
                fVar.d += windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean h = ogw.h(view);
            if (this.b) {
                if (h) {
                    fVar.c += windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    fVar.f25385a += windowInsetsCompat.getSystemWindowInsetLeft();
                }
            }
            if (this.c) {
                if (h) {
                    fVar.f25385a += windowInsetsCompat.getSystemWindowInsetRight();
                } else {
                    fVar.c += windowInsetsCompat.getSystemWindowInsetRight();
                }
            }
            fVar.a(view);
            e eVar = this.d;
            if (eVar != null) {
                return eVar.a(view, windowInsetsCompat, fVar);
            }
            return windowInsetsCompat;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f25384a;
        public final /* synthetic */ f b;

        public c(e eVar, f fVar) {
            this.f25384a = eVar;
            this.b = fVar;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f25384a.a(view, windowInsetsCompat, new f(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface e {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, f fVar);
    }

    public static void a(View view, AttributeSet attributeSet, int i, int i2, e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        b(view, new b(z, z2, z3, eVar));
    }

    public static void b(View view, e eVar) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new c(eVar, new f(ViewCompat.getPaddingStart(view), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ffw e(View view) {
        return f(d(view));
    }

    public static ffw f(View view) {
        if (view == null) {
            return null;
        }
        return new dfw(view);
    }

    public static float g(View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ViewCompat.getElevation((View) parent);
        }
        return f2;
    }

    public static boolean h(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void k(View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f25385a;
        public final int b;
        public int c;
        public int d;

        public f(int i, int i2, int i3, int i4) {
            this.f25385a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            ViewCompat.setPaddingRelative(view, this.f25385a, this.b, this.c, this.d);
        }

        public f(f fVar) {
            this.f25385a = fVar.f25385a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.d = fVar.d;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

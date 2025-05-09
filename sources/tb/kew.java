package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22621a;
        public final /* synthetic */ d1a<xhv> b;

        public a(View view, d1a<xhv> d1aVar) {
            this.f22621a = view;
            this.b = d1aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            try {
                this.b.invoke();
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.d(th2);
            }
            this.f22621a.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22622a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public b(View view, int i, int i2, int i3, int i4) {
            this.f22622a = view;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ViewExtKt$setCorner$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view != null && view.getWidth() > 0 && view.getHeight() > 0) {
                Path path = new Path();
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                float width = view.getWidth();
                float height = view.getHeight();
                float f = 2;
                float f2 = i * f;
                float f3 = i2 * f;
                float f4 = i3 * f;
                float f5 = f * i4;
                path.moveTo(0.0f, f2);
                path.arcTo(0.0f, 0.0f, f2, f2, 180.0f, 90.0f, false);
                float f6 = width - f3;
                path.lineTo(f6, 0.0f);
                path.arcTo(f6, 0.0f, width, f3, -90.0f, 90.0f, false);
                float f7 = height - f5;
                path.lineTo(width, f7);
                path.arcTo(width - f5, f7, width, height, 0.0f, 90.0f, false);
                path.lineTo(f4, height);
                path.arcTo(0.0f, height - f4, f4, height, 90.0f, 90.0f, false);
                path.close();
                if (path.isConvex()) {
                    if (outline != null) {
                        outline.setConvexPath(path);
                    }
                } else if (outline != null) {
                    outline.setRect(0, 0, this.f22622a.getWidth(), this.f22622a.getHeight());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22623a;

        public c(int i) {
            this.f22623a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ViewExtKt$setViewCorner$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f22623a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22624a;
        public final /* synthetic */ int b;

        public d(View view, int i) {
            this.f22624a = view;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ViewExtKt$setViewRightTopCorner$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else if (view != null && view.getWidth() > 0 && view.getHeight() > 0) {
                Path path = new Path();
                int i = this.b;
                float width = view.getWidth();
                float height = view.getHeight();
                float f = i * 2;
                path.moveTo(0.0f, 0.0f);
                float f2 = width - f;
                path.lineTo(f2, 0.0f);
                path.arcTo(f2, 0.0f, width, f, -90.0f, 90.0f, false);
                path.lineTo(width, height);
                path.lineTo(0.0f, height);
                path.close();
                if (path.isConvex()) {
                    if (outline != null) {
                        outline.setConvexPath(path);
                    }
                } else if (outline != null) {
                    outline.setRect(0, 0, this.f22624a.getWidth(), this.f22624a.getHeight());
                }
            }
        }
    }

    static {
        t2o.a(766509562);
    }

    public static final ViewGroup.LayoutParams A(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("50c525cf", new Object[]{view});
        }
        ckf.g(view, "<this>");
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public static final void B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee45887", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setVisibility(8);
    }

    public static final void C(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setVisibility(4);
    }

    public static final boolean D(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14e654fa", new Object[]{motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean E(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ab29d22", new Object[]{motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean F(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c713811", new Object[]{motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean G(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("967d155b", new Object[]{motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean H(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90afb68a", new Object[]{view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ckf.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i3;
        if (i2 > view.getMeasuredHeight() + i4 || i2 < i4 || i > measuredWidth || i < i3) {
            return false;
        }
        return true;
    }

    public static final boolean I(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ae32407", new Object[]{view})).booleanValue();
        }
        ckf.g(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final void J(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8890ee6d", new Object[]{imageView, str});
            return;
        }
        ckf.g(imageView, "<this>");
        if (str != null) {
            s0m.B().T(str).into(imageView);
        }
    }

    public static final View K(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd05998f", new Object[]{context, new Integer(i)});
        }
        ckf.g(context, "<this>");
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public static final void L(View view, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74420def", new Object[]{view, d1aVar});
            return;
        }
        ckf.g(view, "<this>");
        if (d1aVar != null) {
            view.addOnLayoutChangeListener(new a(view, d1aVar));
        }
    }

    public static final int M(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f98ad865", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        return O(Float.valueOf(number.floatValue() / 2));
    }

    public static final int N(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8f8502", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        return (int) ((number.floatValue() / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int O(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfd146dc", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        if (rop.INSTANCE.c()) {
            return (int) (number.floatValue() / (Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f));
        }
        return N(Float.valueOf(number.floatValue() * 2));
    }

    public static final int P(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4449cc", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        if (rop.INSTANCE.c()) {
            return (int) ((Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f) * number.floatValue());
        }
        return p(Float.valueOf(number.floatValue() / 2));
    }

    public static final int Q(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ec0a9ba", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        if (rop.INSTANCE.c()) {
            return iai.d((Resources.getSystem().getDisplayMetrics().widthPixels / 750.0f) * number.floatValue());
        }
        return p(Float.valueOf(number.floatValue() / 2));
    }

    public static final void S(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f6889d", new Object[]{view, drawable});
            return;
        }
        ckf.g(view, "<this>");
        if (drawable != null) {
            view.setBackground(drawable);
        }
    }

    public static final void T(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c792a9", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setBackgroundColor(0);
    }

    public static final void U(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81439bb3", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void V(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46269474", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(view, "<this>");
        view.setOutlineProvider(new b(view, i, i2, i3, i4));
        view.setClipToOutline(true);
    }

    public static /* synthetic */ void W(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9946ab08", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj});
            return;
        }
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        V(view, i, i2, i3, i4);
    }

    public static final void X(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba137ba", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void Y(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc3813e", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setLayoutParams(s(view));
    }

    public static final void Z(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af2b5d2", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f85632", new Object[]{viewGroup, view});
            return;
        }
        ckf.g(viewGroup, "<this>");
        ckf.g(view, "view");
        viewGroup.addView(view, s(view));
    }

    public static final void a0(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3236afe", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void b(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7884832", new Object[]{viewGroup, view});
            return;
        }
        ckf.g(viewGroup, "<this>");
        ckf.g(view, "view");
        viewGroup.addView(view, A(view));
    }

    public static final void b0(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50967dc4", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i);
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final int c(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e71f86b5", new Object[]{new Integer(i), new Float(f)})).intValue();
        }
        return i | (((int) (255 * f)) << 24);
    }

    public static final void c0(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cff9c7e", new Object[]{textView, new Integer(i)});
            return;
        }
        ckf.g(textView, "<this>");
        textView.setTextSize(0, i);
    }

    public static final int d(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4a46d37", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        return P(Float.valueOf(number.floatValue() * 2));
    }

    public static final void d0(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7960d99", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void e(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f107276f", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void e0(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7521bcfe", new Object[]{view, new Boolean(z), new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        if (z) {
            view.setOutlineProvider(new c(i));
            view.setClipToOutline(true);
            return;
        }
        view.setOutlineProvider(null);
        view.setClipToOutline(false);
    }

    public static final void f(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acb3fda", new Object[]{view, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void f0(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c04fcd", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        if (i > 0) {
            view.setOutlineProvider(new d(view, i));
            view.setClipToOutline(true);
            return;
        }
        view.setOutlineProvider(null);
        view.setClipToOutline(false);
    }

    public static final void g(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8fc56e", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void g0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setVisibility(0);
    }

    public static final void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438c512c", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static final void h0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a168986d", new Object[]{view});
            return;
        }
        ckf.g(view, "<this>");
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    public static final FrameLayout.LayoutParams i(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("5d1c94f6", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i7);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static /* synthetic */ FrameLayout.LayoutParams j(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("5ab8e278", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), obj});
        }
        if ((i8 & 1) != 0) {
            i = -1;
        }
        if ((i8 & 2) != 0) {
            i2 = -1;
        }
        if ((i8 & 4) != 0) {
            i3 = 0;
        }
        if ((i8 & 8) != 0) {
            i4 = 0;
        }
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        if ((i8 & 32) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = 0;
        }
        return i(i, i2, i3, i4, i5, i6, i7);
    }

    public static final FrameLayout.LayoutParams k(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("816386f6", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2, i7);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static /* synthetic */ FrameLayout.LayoutParams l(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("53aab078", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), obj});
        }
        if ((i8 & 1) != 0) {
            i = -1;
        }
        if ((i8 & 2) != 0) {
            i2 = -1;
        }
        if ((i8 & 4) != 0) {
            i3 = 0;
        }
        if ((i8 & 8) != 0) {
            i4 = 0;
        }
        if ((i8 & 16) != 0) {
            i5 = 0;
        }
        if ((i8 & 32) != 0) {
            i6 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = 0;
        }
        return k(i, i2, i3, i4, i5, i6, i7);
    }

    public static final LinearLayout.LayoutParams m(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("1c9c69c5", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.bottomMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i5;
        layoutParams.rightMargin = i6;
        return layoutParams;
    }

    public static /* synthetic */ LinearLayout.LayoutParams n(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("949402af", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), obj});
        }
        if ((i7 & 1) != 0) {
            i = -1;
        }
        if ((i7 & 2) != 0) {
            i8 = -2;
        } else {
            i8 = i2;
        }
        if ((i7 & 4) != 0) {
            i9 = 0;
        } else {
            i9 = i3;
        }
        if ((i7 & 8) != 0) {
            i10 = 0;
        } else {
            i10 = i4;
        }
        if ((i7 & 16) != 0) {
            i11 = 0;
        } else {
            i11 = i5;
        }
        if ((i7 & 32) != 0) {
            i12 = 0;
        } else {
            i12 = i6;
        }
        return m(i, i8, i9, i10, i11, i12);
    }

    public static final void o(View view, d1a<xhv> d1aVar) {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c245e118", new Object[]{view, d1aVar});
            return;
        }
        ckf.g(view, "<this>");
        if (d1aVar != null) {
            Context context = view.getContext();
            if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
                L(decorView, d1aVar);
            }
        }
    }

    public static final int p(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50979f7a", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        return (int) ((number.floatValue() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final RecyclerView q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c195bfb7", new Object[]{view});
        }
        ckf.g(view, "<this>");
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
        }
        return null;
    }

    public static final int r(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a7da9cf", new Object[]{view})).intValue();
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    public static final ViewGroup.LayoutParams s(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("736b33cf", new Object[]{view});
        }
        ckf.g(view, "<this>");
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static /* synthetic */ Drawable u(int i, GradientDrawable.Orientation orientation, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        int i10 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("4f318d1f", new Object[]{new Integer(i), orientation, iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), obj});
        }
        int i11 = i;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        int i16 = i6;
        int i17 = i7;
        if ((1 & i9) != 0) {
            i11 = 0;
        }
        GradientDrawable.Orientation orientation2 = (2 & i9) != 0 ? GradientDrawable.Orientation.LEFT_RIGHT : orientation;
        int[] iArr2 = (4 & i9) != 0 ? null : iArr;
        if ((8 & i9) != 0) {
            i12 = 0;
        }
        if ((i9 & 16) != 0) {
            i13 = 0;
        }
        if ((i9 & 32) != 0) {
            i14 = 0;
        }
        if ((i9 & 64) != 0) {
            i15 = 0;
        }
        if ((i9 & 128) != 0) {
            i16 = 0;
        }
        if ((i9 & 256) != 0) {
            i17 = 0;
        }
        if ((i9 & 512) == 0) {
            i10 = i8;
        }
        return t(i11, orientation2, iArr2, i12, i13, i14, i15, i16, i17, i10);
    }

    public static final int v(Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb719410", new Object[]{number})).intValue();
        }
        ckf.g(number, "<this>");
        return P(number);
    }

    public static final int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16bff2d7", new Object[0])).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f735d0dc", new Object[0])).intValue();
        }
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final int z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a78bd91", new Object[]{view})).intValue();
        }
        ckf.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }

    public static final void i0(Context context) {
        VibrationEffect createPredefined;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8404b73", new Object[]{context});
            return;
        }
        ckf.g(context, "<this>");
        try {
            Object systemService = context.getApplicationContext().getSystemService("vibrator");
            xhv xhvVar = null;
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    createPredefined = VibrationEffect.createPredefined(0);
                    vibrator.vibrate(createPredefined);
                } else {
                    vibrator.vibrate(10L);
                }
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public static final int y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        ckf.g(context, "<this>");
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final void R(View... viewArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7b66b2", new Object[]{viewArr});
            return;
        }
        ckf.g(viewArr, "view");
        int length = viewArr.length;
        while (i < length) {
            View view = viewArr[i];
            i++;
            if (view != null) {
                T(view);
            }
        }
    }

    public static final Drawable t(int i, GradientDrawable.Orientation orientation, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9df98753", new Object[]{new Integer(i), orientation, iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        }
        ckf.g(orientation, "orientation");
        if (i != 0) {
            gradientDrawable = new GradientDrawable();
        } else {
            gradientDrawable = new GradientDrawable(orientation, iArr);
        }
        gradientDrawable.setShape(0);
        if (i != 0) {
            gradientDrawable.setColor(i);
        }
        if (i2 > 0) {
            gradientDrawable.setCornerRadius(i2);
        } else {
            float f = i3;
            float f2 = i4;
            float f3 = i6;
            float f4 = i5;
            gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
        }
        if (i7 > 0) {
            gradientDrawable.setStroke(i7, i8);
        }
        return gradientDrawable;
    }
}

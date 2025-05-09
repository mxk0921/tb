package com.taobao.search.sf;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.sf.RpxConfigVM;
import com.taobao.taobao.R;
import java.util.HashSet;
import java.util.Iterator;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;
import tb.ytk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RpxConfigVM extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public volatile int d;
    public WindowType f;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11694a = new Handler(Looper.getMainLooper());
    public final HashSet<ytk> b = new HashSet<>();
    public final boolean c = true;
    public volatile float e = 1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.sf.RpxConfigVM$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class C0658a implements ytk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f11695a;

            public C0658a(View view) {
                this.f11695a = view;
            }

            @Override // tb.ytk
            public void f() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b567900f", new Object[]{this});
                } else {
                    a.a(RpxConfigVM.Companion, this.f11695a, null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class b implements ytk {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Activity f11696a;
            public final /* synthetic */ float b;
            public final /* synthetic */ TextView c;

            public b(Activity activity, float f, TextView textView) {
                this.f11696a = activity;
                this.b = f;
                this.c = textView;
            }

            @Override // tb.ytk
            public void f() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b567900f", new Object[]{this});
                } else {
                    this.c.setTextSize(0, RpxConfigVM.Companion.f(this.f11696a, this.b));
                }
            }
        }

        static {
            t2o.a(815793374);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ void a(a aVar, View view, ytk ytkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be42b7d3", new Object[]{aVar, view, ytkVar});
            } else {
                aVar.k(view, ytkVar);
            }
        }

        public final void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba4b3b19", new Object[]{this, view});
            } else if (view != null) {
                k(view, new C0658a(view));
            }
        }

        public final void c(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a3d1569", new Object[]{this, textView});
            } else {
                d(textView, true);
            }
        }

        public final void d(TextView textView, boolean z) {
            float f;
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d664a8b", new Object[]{this, textView, new Boolean(z)});
            } else if (textView != null) {
                try {
                    Context context = textView.getContext();
                    ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) context;
                    int i = R.dimen.tbsearch_text_size;
                    Object tag = textView.getTag(i);
                    if (tag == null) {
                        f = o1p.d(textView.getTextSize());
                        textView.setTag(i, Float.valueOf(o1p.d(textView.getTextSize())));
                    } else {
                        f = ((Float) tag).floatValue();
                    }
                    if (z) {
                        bVar = new b(activity, f, textView);
                    } else {
                        bVar = null;
                    }
                    textView.setTextSize(0, g(activity, f, bVar));
                } catch (Exception unused) {
                }
            }
        }

        public final RpxConfigVM e(Activity activity) {
            FragmentActivity fragmentActivity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpxConfigVM) ipChange.ipc$dispatch("7563cf2b", new Object[]{this, activity});
            }
            if (activity instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activity;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null) {
                return (RpxConfigVM) ViewModelProviders.of(fragmentActivity).get(RpxConfigVM.class);
            }
            return null;
        }

        public final int f(Activity activity, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("401f5363", new Object[]{this, activity, new Float(f)})).intValue();
            }
            ckf.g(activity, "activity");
            return g(activity, f, null);
        }

        public final int g(Activity activity, float f, ytk ytkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4156c700", new Object[]{this, activity, new Float(f), ytkVar})).intValue();
            }
            ckf.g(activity, "activity");
            RpxConfigVM e = e(activity);
            if (e == null) {
                return o1p.a(f);
            }
            RpxConfigVM.e(e, ytkVar);
            return e.i(f);
        }

        public final int h(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("401f5ea6", new Object[]{this, activity, new Integer(i)})).intValue();
            }
            ckf.g(activity, "activity");
            return g(activity, i, null);
        }

        public final void i(Context context, ytk ytkVar) {
            RpxConfigVM e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e0b7a7", new Object[]{this, context, ytkVar});
                return;
            }
            ckf.g(context, "context");
            if (ytkVar != null && (e = e((Activity) context)) != null) {
                RpxConfigVM.e(e, ytkVar);
            }
        }

        public final void j(Context context, ytk ytkVar) {
            RpxConfigVM e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae9243ae", new Object[]{this, context, ytkVar});
                return;
            }
            ckf.g(context, "context");
            if (ytkVar != null && (e = e((Activity) context)) != null) {
                RpxConfigVM.h(e, ytkVar);
            }
        }

        public final void k(View view, ytk ytkVar) {
            Integer num;
            int i;
            Integer num2;
            int i2;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60ede7af", new Object[]{this, view, ytkVar});
                return;
            }
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Context context = view.getContext();
                ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                if (layoutParams.width > 0) {
                    int i3 = R.dimen.tbsearch_rpx_width;
                    Object tag = view.getTag(i3);
                    if (tag instanceof Integer) {
                        num2 = (Integer) tag;
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        i2 = o1p.e(layoutParams.width);
                        view.setTag(i3, Integer.valueOf(i2));
                    } else {
                        i2 = num2.intValue();
                    }
                    layoutParams.width = g(activity, i2, ytkVar);
                } else {
                    z = false;
                }
                if (layoutParams.height > 0) {
                    int i4 = R.dimen.tbsearch_rpx_height;
                    Object tag2 = view.getTag(i4);
                    if (tag2 instanceof Integer) {
                        num = (Integer) tag2;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        i = o1p.e(layoutParams.height);
                        view.setTag(i4, Integer.valueOf(i));
                    } else {
                        i = num.intValue();
                    }
                    float f = i;
                    if (z) {
                        ytkVar = null;
                    }
                    layoutParams.height = g(activity, f, ytkVar);
                }
                view.requestLayout();
            } catch (Exception unused) {
            }
        }

        public final void l(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("127f298a", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            RpxConfigVM e = e(activity);
            if (e != null) {
                e.m(activity);
            }
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(815793377);
            int[] iArr = new int[WindowType.values().length];
            try {
                iArr[WindowType.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowType.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowType.MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(815793373);
    }

    public static final /* synthetic */ void e(RpxConfigVM rpxConfigVM, ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3aa33f", new Object[]{rpxConfigVM, ytkVar});
        } else {
            rpxConfigVM.k(ytkVar);
        }
    }

    public static final void f(RpxConfigVM rpxConfigVM) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f1ebf0", new Object[]{rpxConfigVM});
            return;
        }
        ckf.g(rpxConfigVM, "this$0");
        Iterator<ytk> it = rpxConfigVM.b.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public static final void g(RpxConfigVM rpxConfigVM, ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32306ae8", new Object[]{rpxConfigVM, ytkVar});
            return;
        }
        ckf.g(rpxConfigVM, "this$0");
        rpxConfigVM.b.add(ytkVar);
    }

    public static final /* synthetic */ void h(RpxConfigVM rpxConfigVM, ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f343df18", new Object[]{rpxConfigVM, ytkVar});
        } else {
            rpxConfigVM.l(ytkVar);
        }
    }

    public static /* synthetic */ Object ipc$super(RpxConfigVM rpxConfigVM, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/RpxConfigVM");
    }

    public static final void n(RpxConfigVM rpxConfigVM, ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecdc5b1", new Object[]{rpxConfigVM, ytkVar});
            return;
        }
        ckf.g(rpxConfigVM, "this$0");
        rpxConfigVM.b.remove(ytkVar);
    }

    public final int i(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a33ddf5", new Object[]{this, new Float(f2)})).intValue();
        }
        if (this.d == 0) {
            return o1p.a(f2);
        }
        if (!this.c || ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
            return o1p.a(f2);
        }
        return (int) (f2 * 2 * this.e);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd3967d", new Object[]{this});
        } else {
            this.f11694a.post(new Runnable() { // from class: tb.hmz
                @Override // java.lang.Runnable
                public final void run() {
                    RpxConfigVM.f(RpxConfigVM.this);
                }
            });
        }
    }

    public final void k(final ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50aa551b", new Object[]{this, ytkVar});
        } else if (ytkVar != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                this.b.add(ytkVar);
            } else {
                this.f11694a.post(new Runnable() { // from class: tb.gmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        RpxConfigVM.g(RpxConfigVM.this, ytkVar);
                    }
                });
            }
        }
    }

    public final void l(final ytk ytkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422734", new Object[]{this, ytkVar});
        } else if (ytkVar != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                this.b.remove(ytkVar);
            } else {
                this.f11694a.post(new Runnable() { // from class: tb.emz
                    @Override // java.lang.Runnable
                    public final void run() {
                        RpxConfigVM.n(RpxConfigVM.this, ytkVar);
                    }
                });
            }
        }
    }

    public final void m(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f298a", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "activity");
        this.f = TBAutoSizeConfig.x().M(activity);
        activity.getWindow().getDecorView().post(new Runnable() { // from class: tb.fmz
            @Override // java.lang.Runnable
            public final void run() {
                RpxConfigVM.o(RpxConfigVM.this, activity);
            }
        });
    }

    public static final void o(RpxConfigVM rpxConfigVM, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ade968", new Object[]{rpxConfigVM, activity});
            return;
        }
        ckf.g(rpxConfigVM, "this$0");
        ckf.g(activity, "$activity");
        int i = rpxConfigVM.d;
        rpxConfigVM.d = activity.getWindow().getDecorView().getMeasuredWidth();
        WindowType windowType = rpxConfigVM.f;
        int i2 = windowType == null ? -1 : f.$EnumSwitchMapping$0[windowType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            rpxConfigVM.d /= 2;
        }
        rpxConfigVM.e = rpxConfigVM.d / 750.0f;
        if (i != rpxConfigVM.d) {
            rpxConfigVM.j();
        }
    }
}

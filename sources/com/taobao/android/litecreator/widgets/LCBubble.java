package com.taobao.android.litecreator.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.b65;
import tb.bxo;
import tb.odg;
import tb.t2o;
import tb.vwo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LCBubble {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f8332a;
    public FrameLayout b;
    public View c;
    public boolean d;
    public final i e;
    public final Context f;
    public final Handler g;
    public final Runnable h;
    public final g i;
    public View.OnClickListener j;
    public final List<j> k;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Priority {
        public static final int HIGH = 100;
        public static final int LOW = 300;
        public static final int MID = 200;
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Type {
        public static final int Bottom = 0;
        public static final int Right = 1;
        public static final int Top = 2;
    }

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
            for (j jVar : LCBubble.a(LCBubble.this)) {
                jVar.b(LCBubble.this);
            }
            LCBubble.this.j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (LCBubble.b(LCBubble.this) != null) {
                LCBubble.b(LCBubble.this).onClick(view);
            } else {
                LCBubble.this.j();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/LCBubble$3");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84781bba", new Object[]{this, animator, new Boolean(z)});
                return;
            }
            LCBubble.c(LCBubble.this, null);
            for (j jVar : LCBubble.a(LCBubble.this)) {
                jVar.d(LCBubble.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            LCBubble.this.j();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                } else {
                    LCBubble.g(LCBubble.this).removeView(LCBubble.f(LCBubble.this));
                }
            }
        }

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/LCBubble$5");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            LCBubble.c(LCBubble.this, null);
            LCBubble.d(LCBubble.this, false);
            LCBubble.e(LCBubble.this).setVisibility(8);
            for (j jVar : LCBubble.a(LCBubble.this)) {
                jVar.c(LCBubble.this);
            }
            LCBubble.g(LCBubble.this).post(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(LCBubble lCBubble) {
        }

        public ObjectAnimator a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ObjectAnimator) ipChange.ipc$dispatch("78e476fb", new Object[]{this, view});
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(300L);
            return ofPropertyValuesHolder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public View d;
        public Point e;
        public View f;
        public int g;
        public long h;
        public int i;
        public int j;

        /* renamed from: a  reason: collision with root package name */
        public int f8339a = -1;
        public int b = 0;
        public int c = 300;
        public int k = 15;
        public boolean l = false;
        public boolean m = true;
        public boolean n = true;
        public boolean o = false;

        static {
            t2o.a(511705688);
        }

        public h a(Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("d884bb61", new Object[]{this, point});
            }
            this.e = point;
            return this;
        }

        public h b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("b8ccabb5", new Object[]{this, view});
            }
            this.d = view;
            return this;
        }

        public h c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("48d2e16a", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public h d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("d2a8e12a", new Object[]{this, new Long(j)});
            }
            this.h = j;
            return this;
        }

        public h e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("263925c8", new Object[]{this, new Integer(i)});
            }
            this.f8339a = i;
            return this;
        }

        public h f(@Type int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("a52e8590", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public h g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("32653dcc", new Object[]{this, view});
            }
            this.f = view;
            return this;
        }

        public h h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("3444b9dc", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public h i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("d31f3b71", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public h j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("915409c9", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public h k(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("74311159", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public h l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("229b0c4e", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public h m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("7b62cec5", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public h n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("7aa19034", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public h o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("2995ec4b", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
        boolean a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface j {
        void a(LCBubble lCBubble);

        void b(LCBubble lCBubble);

        void c(LCBubble lCBubble);

        void d(LCBubble lCBubble);
    }

    static {
        t2o.a(511705679);
    }

    public LCBubble(Context context) {
        this.g = new Handler(Looper.getMainLooper());
        this.h = new a();
        this.i = new f(this);
        this.k = new ArrayList();
        this.f = context;
        View findViewById = ((Activity) context).findViewById(16908290);
        if (findViewById instanceof FrameLayout) {
            this.f8332a = (FrameLayout) findViewById;
        }
    }

    public static /* synthetic */ List a(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("baff9ce4", new Object[]{lCBubble});
        }
        return lCBubble.k;
    }

    public static /* synthetic */ View.OnClickListener b(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("e181fccb", new Object[]{lCBubble});
        }
        return lCBubble.j;
    }

    public static /* synthetic */ Animator c(LCBubble lCBubble, Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("54cdf4d7", new Object[]{lCBubble, animator});
        }
        lCBubble.getClass();
        return animator;
    }

    public static /* synthetic */ boolean d(LCBubble lCBubble, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8e369ba", new Object[]{lCBubble, new Boolean(z)})).booleanValue();
        }
        lCBubble.getClass();
        return z;
    }

    public static /* synthetic */ View e(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b543d101", new Object[]{lCBubble});
        }
        return lCBubble.c;
    }

    public static /* synthetic */ FrameLayout f(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c75910bb", new Object[]{lCBubble});
        }
        return lCBubble.b;
    }

    public static /* synthetic */ FrameLayout g(LCBubble lCBubble) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6ed4ea7c", new Object[]{lCBubble});
        }
        return lCBubble.f8332a;
    }

    public void h(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea42a75e", new Object[]{this, jVar});
        } else if (jVar != null) {
            ((ArrayList) this.k).add(jVar);
        }
    }

    public final FrameLayout.LayoutParams i(h hVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("7d917206", new Object[]{this, hVar});
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.c.getMeasuredHeight();
        int measuredWidth = this.c.getMeasuredWidth();
        int[] iArr = new int[2];
        View view = hVar.d;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i3 = iArr[0];
            i4 = iArr[1];
            i2 = hVar.d.getWidth();
            i5 = hVar.d.getHeight();
        } else {
            Point point = hVar.e;
            if (point != null) {
                i3 = point.x - 1;
                i4 = point.y - 1;
                i5 = 2;
                i2 = 2;
            } else {
                i5 = 0;
                i4 = 0;
                i3 = 0;
                i2 = 0;
            }
        }
        ImageView imageView = (ImageView) this.c.findViewById(R.id.iv_triangle);
        imageView.setColorFilter(hVar.f8339a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        FrameLayout frameLayout = (FrameLayout) this.c.findViewById(R.id.fl_bubble);
        int b2 = bxo.b();
        boolean i11 = vwo.i((Activity) this.f);
        int i12 = hVar.b;
        if (i12 == 1) {
            int a2 = ((b2 - measuredWidth) - i2) + b65.a(hVar.j);
            int i13 = (i4 + (i5 / 2)) - (measuredHeight / 2);
            if (i11) {
                i10 = 0;
            } else {
                i10 = vwo.g(this.f);
            }
            int i14 = i13 - i10;
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i15 = hVar.g;
            gradientDrawable.setCornerRadii(new float[]{i15, i15, i15, i15, i15, i15, i15, i15});
            gradientDrawable.setColor(hVar.f8339a);
            frameLayout.setBackground(gradientDrawable);
            layoutParams.setMargins(a2, i14, 0, 0);
            i6 = b2;
        } else if (i12 == 0) {
            int i16 = i3 + (i2 / 2);
            int max = Math.max(i16 - (measuredWidth / 2), b65.a(hVar.k));
            int i17 = i4 - measuredHeight;
            if (i11) {
                i9 = 0;
            } else {
                i9 = vwo.g(this.f);
            }
            int a3 = (i17 - i9) + b65.a(hVar.i);
            int minimumHeight = frameLayout.getMinimumHeight() / 2;
            if (max + minimumHeight > i16 - b65.a(8.0f)) {
                max = 0;
            }
            i6 = b2;
            if (max + measuredWidth > i6) {
                max = Math.min(max, (i6 - measuredWidth) - b65.a(hVar.k));
            }
            int a4 = (i16 - max) - b65.a(8.0f);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.setMargins(a4, 0, 0, 0);
            imageView.setLayoutParams(layoutParams2);
            layoutParams.setMargins(max, a3, 0, 0);
            int min = Math.min(a4, minimumHeight);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            float f2 = minimumHeight;
            float f3 = min;
            gradientDrawable2.setCornerRadii(new float[]{f2, f2, f2, f2, f2, f2, f3, f3});
            gradientDrawable2.setColor(hVar.f8339a);
            frameLayout.setBackground(gradientDrawable2);
        } else {
            i6 = b2;
            if (i12 == 2) {
                int i18 = i3 + (i2 / 2);
                int max2 = Math.max(i18 - (measuredWidth / 2), b65.a(15.0f));
                int i19 = i4 + i5;
                if (i11) {
                    i7 = 0;
                } else {
                    i7 = vwo.g(this.f);
                }
                int a5 = (i19 - i7) + b65.a(hVar.i);
                int minimumHeight2 = frameLayout.getMinimumHeight() / 2;
                int i20 = max2 + minimumHeight2;
                if (i20 > i18 - b65.a(8.0f)) {
                    i8 = i20 - (i18 - b65.a(8.0f));
                    max2 = 0;
                } else {
                    i8 = minimumHeight2;
                }
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                float f4 = i8;
                float f5 = minimumHeight2;
                gradientDrawable3.setCornerRadii(new float[]{f4, f4, f5, f5, f5, f5, f5, f5});
                gradientDrawable3.setColor(hVar.f8339a);
                frameLayout.setBackground(gradientDrawable3);
                if (max2 + measuredWidth > i6) {
                    max2 = Math.min(max2, (i6 - measuredWidth) - b65.a(15.0f));
                }
                int a6 = (i18 - max2) - b65.a(8.0f);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams3.setMargins(a6, 0, 0, 0);
                imageView.setLayoutParams(layoutParams3);
                layoutParams.setMargins(max2, a5, 0, 0);
            }
        }
        if (hVar.o) {
            layoutParams.setMargins((i6 - measuredWidth) / 2, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        return layoutParams;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.d) {
            this.d = false;
            ObjectAnimator a2 = ((f) this.i).a(this.c);
            a2.start();
            a2.addListener(new e());
            this.g.removeCallbacksAndMessages(null);
        }
    }

    public void k(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1203ad", new Object[]{this, onClickListener});
        } else {
            this.j = onClickListener;
        }
    }

    public void l(h hVar) {
        i iVar;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0fada74", new Object[]{this, hVar});
        } else if (this.d || (((iVar = this.e) != null && iVar.a()) || this.f8332a == null || hVar == null || (hVar.d == null && hVar.e == null))) {
            Iterator it = ((ArrayList) this.k).iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(this);
            }
        } else {
            this.d = true;
            Context context = this.f;
            int i3 = hVar.b;
            if (i3 == 0) {
                i2 = R.layout.layout_bubble_common_container_bottom;
            } else if (i3 == 1) {
                i2 = R.layout.layout_bubble_common_container_right;
            } else if (i3 != 2) {
                i2 = R.layout.layout_bubble_common_container_bottom;
            } else {
                i2 = R.layout.layout_bubble_common_container_top;
            }
            try {
                this.c = LayoutInflater.from(context).inflate(i2, (ViewGroup) this.f8332a, false);
            } catch (Throwable th) {
                odg.c("LCBubble", Log.getStackTraceString(th));
            }
            View view = this.c;
            if (view != null) {
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_bubble);
                if (hVar.l) {
                    View findViewById = this.c.findViewById(R.id.ll_bubble);
                    int a2 = b65.a(12.0f);
                    findViewById.setPadding(0, a2, a2, 0);
                    View findViewById2 = this.c.findViewById(R.id.im_bubble_close);
                    findViewById2.setVisibility(0);
                    ViewProxy.setOnClickListener(findViewById2, new b());
                }
                if (!hVar.m) {
                    this.c.findViewById(R.id.iv_triangle).setVisibility(4);
                }
                frameLayout.setMinimumHeight(b65.a(hVar.g) * 2);
                frameLayout.addView(hVar.f, new FrameLayout.LayoutParams(-2, -2, 17));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.b = frameLayout2;
                frameLayout2.setClipChildren(false);
                this.b.addView(this.c, i(hVar));
                this.f8332a.setClipChildren(false);
                this.f8332a.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
                ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                ofPropertyValuesHolder.setDuration(300L);
                ofPropertyValuesHolder.addListener(new c());
                ofPropertyValuesHolder.start();
                if (hVar.n) {
                    this.b.setOnTouchListener(new d());
                }
                long j2 = hVar.h;
                if (j2 > 0 && j2 != Long.MAX_VALUE) {
                    this.g.postDelayed(this.h, j2);
                }
            }
        }
    }

    public LCBubble(Context context, i iVar) {
        this(context);
        this.e = iVar;
    }
}

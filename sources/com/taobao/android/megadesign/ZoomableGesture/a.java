package com.taobao.android.megadesign.ZoomableGesture;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.ZoomableGesture.MegaImageZoomableImageView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import tb.mxv;
import tb.tii;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WeakHashMap<Context, WeakReference<View>> j = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final tii f8909a;
    public final ScaleGestureDetector b;
    public ViewGroup e;
    public ImageView g;
    public MotionEvent h;
    public final Context i;
    public MegaImageZoomableImageView c = null;
    public View d = null;
    public boolean f = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.megadesign.ZoomableGesture.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class C0462a implements MegaImageZoomableImageView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0462a() {
        }

        public void a(Matrix matrix) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b977072c", new Object[]{this, matrix});
                return;
            }
            a.a(a.this).setVisibility(8);
            a.b(a.this).setVisibility(8);
            a.c(a.this).setVisibility(0);
            a.a(a.this).freshData();
            a.d(a.this).b(0);
            a.e(a.this).removeView(a.b(a.this));
            a.e(a.this).removeView(a.a(a.this));
            a.f(a.this, false);
            a.g(a.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(Context context, ImageView imageView) {
        tii tiiVar = new tii();
        this.f8909a = tiiVar;
        this.b = new ScaleGestureDetector(context, tiiVar);
        this.i = context;
        i(imageView, (FrameLayout) ((Activity) context).getWindow().getDecorView());
    }

    public static /* synthetic */ MegaImageZoomableImageView a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MegaImageZoomableImageView) ipChange.ipc$dispatch("46b1deae", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ View b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d1938e0f", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ ImageView c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("530702a4", new Object[]{aVar});
        }
        return aVar.g;
    }

    public static /* synthetic */ tii d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tii) ipChange.ipc$dispatch("a2fc6ed2", new Object[]{aVar});
        }
        return aVar.f8909a;
    }

    public static /* synthetic */ ViewGroup e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e3787dab", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ boolean f(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60bb58f1", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f = z;
        return z;
    }

    public static /* synthetic */ MotionEvent g(a aVar, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("150f4850", new Object[]{aVar, motionEvent});
        }
        aVar.h = motionEvent;
        return motionEvent;
    }

    public static synchronized View h(Context context) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("1b9025df", new Object[]{context});
            }
            View view = null;
            if (context == null) {
                return null;
            }
            WeakHashMap<Context, WeakReference<View>> weakHashMap = j;
            WeakReference<View> weakReference = weakHashMap.get(context);
            if (weakReference != null) {
                view = weakReference.get();
            }
            if (view == null) {
                view = new View(context);
                view.setBackgroundColor(-1727131367);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                ofFloat.start();
                weakHashMap.put(context, new WeakReference<>(view));
            }
            return view;
        }
    }

    public void i(ImageView imageView, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e557d0", new Object[]{this, imageView, viewGroup});
            return;
        }
        this.g = imageView;
        this.e = viewGroup;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9370041", new Object[]{this});
        } else if (this.g != null && this.e != null) {
            k();
            if (!this.f && this.d.getParent() == null && this.c.getParent() == null) {
                this.e.addView(this.d);
                this.e.addView(this.c);
                this.f = true;
            }
        }
    }

    public boolean l(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        this.b.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 0) {
            this.h = MotionEvent.obtain(motionEvent);
        }
        if (this.f8909a.a() == 1) {
            j();
            this.f8909a.b(2);
        }
        MegaImageZoomableImageView megaImageZoomableImageView = this.c;
        if (megaImageZoomableImageView != null && megaImageZoomableImageView.getVisibility() == 0) {
            this.c.onTouchEvent(motionEvent);
        }
        return true;
    }

    public Matrix m(int[] iArr) {
        float abs;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("e3cf2504", new Object[]{this, iArr});
        }
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        int intrinsicWidth = this.g.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = this.g.getDrawable().getIntrinsicHeight();
        ImageView.ScaleType scaleType = this.g.getScaleType();
        Matrix matrix = new Matrix();
        float f = iArr[0];
        float f2 = iArr[1];
        switch (b.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()]) {
            case 1:
                float f3 = width;
                float f4 = intrinsicWidth;
                float f5 = height;
                float f6 = intrinsicHeight;
                float max = Math.max(f3 / f4, f5 / f6);
                matrix.postScale(max, max);
                f = (Math.abs(f3 - (f4 * max)) / 2.0f) + iArr[0];
                abs = Math.abs(f5 - (max * f6)) / 2.0f;
                i = iArr[1];
                f2 = abs + i;
                break;
            case 2:
                float min = Math.min(Math.min(width / intrinsicWidth, height / intrinsicHeight), 1.0f);
                matrix.postScale(min, min);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                if (scaleType != ImageView.ScaleType.FIT_XY) {
                    float f7 = width;
                    float f8 = intrinsicWidth;
                    float f9 = height;
                    float f10 = intrinsicHeight;
                    float min2 = Math.min(f7 / f8, f9 / f10);
                    matrix.postScale(min2, min2);
                    f = (Math.abs(f7 - (f8 * min2)) / 2.0f) + iArr[0];
                    abs = Math.abs(f9 - (min2 * f10)) / 2.0f;
                    i = iArr[1];
                    f2 = abs + i;
                    break;
                } else {
                    matrix.postScale(width / intrinsicWidth, height / intrinsicHeight);
                    break;
                }
        }
        matrix.postTranslate(f, f2);
        return matrix;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4deba1", new Object[]{this});
        } else {
            this.c.setOnZoomEndListener(new C0462a());
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcad30d4", new Object[]{this});
            return;
        }
        if (this.g.getContext() == null) {
            this.c = MegaImageZoomableImageView.getInstance(this.i);
            this.d = h(this.i);
        } else {
            this.c = MegaImageZoomableImageView.getInstance(this.g.getContext());
            this.d = h(this.g.getContext());
        }
        MegaImageZoomableImageView megaImageZoomableImageView = this.c;
        if (megaImageZoomableImageView != null && this.d != null) {
            megaImageZoomableImageView.setOnDownMotionEvent(this.h);
            this.c.setImageDrawable(this.g.getDrawable());
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            n();
            int[] iArr = new int[2];
            this.g.getLocationInWindow(iArr);
            this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Matrix m = m(iArr);
            this.g.setVisibility(4);
            this.c.setImageMatrixAndPosition(iArr, m);
            mxv.INSTANCE.b("zoomableImageView", null);
        }
    }
}

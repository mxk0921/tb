package com.taobao.android.dressup.common.view.photo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dressup.common.view.photo.PinchImageView;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import tb.a07;
import tb.cec;
import tb.ckf;
import tb.gl4;
import tb.na3;
import tb.qle;
import tb.t2o;
import tb.tpu;
import tb.ud0;
import tb.uzq;
import tb.zk4;
import tb.zrt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\bJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u001fH\u0007¢\u0006\u0004\b,\u0010\"J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001f¢\u0006\u0004\b.\u0010\"J\u0017\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020'¢\u0006\u0004\b4\u0010*J\u0017\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u00105\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u0016\u0010I\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010J\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/taobao/android/dressup/common/view/photo/PhotoView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ltb/xhv;", "initialize", "()V", "Landroid/animation/Animator$AnimatorListener;", "animatorListener", "onPageClosed", "(Landroid/animation/Animator$AnimatorListener;)V", "Ltb/cec;", "imageLoader", "", "url", na3.sStageLoadImage, "(Ltb/cec;Ljava/lang/String;)V", "Landroid/graphics/drawable/BitmapDrawable;", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "getFinalDrawable", "(Landroid/graphics/drawable/BitmapDrawable;)Landroid/graphics/drawable/BitmapDrawable;", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;", DataReceiveMonitor.CB_LISTENER, "setZoomListener", "(Lcom/taobao/android/dressup/common/view/photo/PinchImageView$k;)V", "Ltb/uzq$a;", "setSwapListener", "(Ltb/uzq$a;)V", "closePage", "", "clickToDismiss", "setEnableClickToDismiss", "(Z)V", "imageUrl", "Landroid/graphics/drawable/Drawable;", "setImagePath", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "", "maxZoom", "setZoom", "(F)V", "enable", "enablePullDown", "autoClose", "setAutoClose", "Landroid/graphics/Rect;", "rect", "setSrcRect", "(Landroid/graphics/Rect;)V", "pullDownOffset", "setPullDownOffset", Constants.Name.IMAGE_QUALITY, "setImageQuality", "(Ljava/lang/String;)V", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView;", "mImageView", "Lcom/taobao/android/dressup/common/view/photo/PinchImageView;", "Ltb/uzq;", "mPullListener", "Ltb/uzq;", "mLastSwapProgress", UTConstant.Args.UT_SUCCESS_F, "mSrcRect", "Landroid/graphics/Rect;", "mAutoClose", "Z", "hasInitDrawable", "Ljava/lang/String;", "mSwipeListener", "Ltb/uzq$a;", gl4.CONFIG_START_CORNER_RADIUS, gl4.CONFIG_END_CORNER_RADIUS, "mSwipeCallback", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PhotoView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static Integer DEFAULT_NAVIGATION_COLOR = null;
    private static final int MAX_IMAGE_SIZE = 4000;
    private static final String TAG = "PhotoView";
    private boolean clickToDismiss;
    private float endCornerRadius;
    private boolean hasInitDrawable;
    private String imageQuality;
    private boolean mAutoClose;
    private PinchImageView mImageView;
    private float mLastSwapProgress;
    private uzq mPullListener;
    private final Rect mSrcRect = new Rect();
    private final uzq.a mSwipeCallback = new f();
    private uzq.a mSwipeListener;
    private float startCornerRadius;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552783);
        }

        public a() {
        }

        public static final /* synthetic */ int a(a aVar, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46b9b169", new Object[]{aVar, activity})).intValue();
            }
            return aVar.d(activity);
        }

        public static final /* synthetic */ void b(a aVar, Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c6b19c1", new Object[]{aVar, activity, new Integer(i)});
            } else {
                aVar.e(activity, i);
            }
        }

        public final int d(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5906ab46", new Object[]{this, activity})).intValue();
            }
            Window window = activity.getWindow();
            ckf.f(window, "activity.window");
            return window.getNavigationBarColor();
        }

        public final void e(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d4ec884", new Object[]{this, activity, new Integer(i)});
                return;
            }
            Window window = activity.getWindow();
            ckf.f(window, "activity.window");
            window.setNavigationBarColor(i);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.onDismiss();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f implements uzq.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ckf.g(animator, "animation");
                uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
                if (access$getMSwipeListener$p != null) {
                    access$getMSwipeListener$p.onDismiss();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }
        }

        public f() {
        }

        @Override // tb.uzq.a
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b042fc9", new Object[]{this, new Float(f)});
                return;
            }
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.a(f);
            }
        }

        @Override // tb.uzq.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ebd4ff7", new Object[]{this});
                return;
            }
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.c();
            }
        }

        @Override // tb.uzq.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1769484e", new Object[]{this});
                return;
            }
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.d();
            }
        }

        @Override // tb.uzq.a
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
                return;
            }
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.d();
            }
            PhotoView.access$onPageClosed(PhotoView.this, new a());
        }

        @Override // tb.uzq.a
        public void onReset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b89f37", new Object[]{this});
                return;
            }
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.onReset();
            }
        }

        @Override // tb.uzq.a
        public void b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddf5571a", new Object[]{this, new Float(f)});
                return;
            }
            PhotoView.access$setMLastSwapProgress$p(PhotoView.this, f);
            int argb = Color.argb((int) (255 * f), 0, 0, 0);
            Integer access$getDEFAULT_NAVIGATION_COLOR$cp = PhotoView.access$getDEFAULT_NAVIGATION_COLOR$cp();
            ckf.d(access$getDEFAULT_NAVIGATION_COLOR$cp);
            int compositeColors = ColorUtils.compositeColors(argb, access$getDEFAULT_NAVIGATION_COLOR$cp.intValue());
            a aVar = PhotoView.Companion;
            Context context = PhotoView.this.getContext();
            if (context != null) {
                a.b(aVar, (Activity) context, compositeColors);
                uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
                if (access$getMSwipeListener$p != null) {
                    access$getMSwipeListener$p.b(f);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PhotoView.access$getMSwipeCallback$p(PhotoView.this).onDismiss();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cec b;
        public final /* synthetic */ String c;

        public i(cec cecVar, String str) {
            this.b = cecVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PhotoView.access$loadImage(PhotoView.this, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class j implements cec.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.cec.a
        public void onImageLoadFailed(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.cec.a
        public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
                return;
            }
            ckf.g(str, "url");
            ckf.g(bitmapDrawable, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
            BitmapDrawable access$getFinalDrawable = PhotoView.access$getFinalDrawable(PhotoView.this, bitmapDrawable);
            if (PhotoView.access$getHasInitDrawable$p(PhotoView.this)) {
                PhotoView.access$getMImageView$p(PhotoView.this).setTargetImageDrawable(access$getFinalDrawable);
            } else {
                PhotoView.access$getMImageView$p(PhotoView.this).setImageDrawable(access$getFinalDrawable);
            }
        }
    }

    static {
        t2o.a(918552782);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoView(Context context) {
        super(context);
        ckf.g(context, "context");
        initialize();
    }

    public static final /* synthetic */ Integer access$getDEFAULT_NAVIGATION_COLOR$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("698a873", new Object[0]);
        }
        return DEFAULT_NAVIGATION_COLOR;
    }

    public static final /* synthetic */ BitmapDrawable access$getFinalDrawable(PhotoView photoView, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("d06a6e06", new Object[]{photoView, bitmapDrawable});
        }
        return photoView.getFinalDrawable(bitmapDrawable);
    }

    public static final /* synthetic */ boolean access$getHasInitDrawable$p(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36e7f354", new Object[]{photoView})).booleanValue();
        }
        return photoView.hasInitDrawable;
    }

    public static final /* synthetic */ PinchImageView access$getMImageView$p(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PinchImageView) ipChange.ipc$dispatch("856427df", new Object[]{photoView});
        }
        PinchImageView pinchImageView = photoView.mImageView;
        if (pinchImageView != null) {
            return pinchImageView;
        }
        ckf.y("mImageView");
        throw null;
    }

    public static final /* synthetic */ float access$getMLastSwapProgress$p(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c35b771b", new Object[]{photoView})).floatValue();
        }
        return photoView.mLastSwapProgress;
    }

    public static final /* synthetic */ uzq.a access$getMSwipeCallback$p(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzq.a) ipChange.ipc$dispatch("e38fb3d9", new Object[]{photoView});
        }
        return photoView.mSwipeCallback;
    }

    public static final /* synthetic */ uzq.a access$getMSwipeListener$p(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzq.a) ipChange.ipc$dispatch("6559aa48", new Object[]{photoView});
        }
        return photoView.mSwipeListener;
    }

    public static final /* synthetic */ void access$loadImage(PhotoView photoView, cec cecVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22a0adb", new Object[]{photoView, cecVar, str});
        } else {
            photoView.loadImage(cecVar, str);
        }
    }

    public static final /* synthetic */ void access$onPageClosed(PhotoView photoView, Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205e8e68", new Object[]{photoView, animatorListener});
        } else {
            photoView.onPageClosed(animatorListener);
        }
    }

    public static final /* synthetic */ void access$setDEFAULT_NAVIGATION_COLOR$cp(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a60cb7", new Object[]{num});
        } else {
            DEFAULT_NAVIGATION_COLOR = num;
        }
    }

    public static final /* synthetic */ void access$setHasInitDrawable$p(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc73190", new Object[]{photoView, new Boolean(z)});
        } else {
            photoView.hasInitDrawable = z;
        }
    }

    public static final /* synthetic */ void access$setMImageView$p(PhotoView photoView, PinchImageView pinchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d53fb5", new Object[]{photoView, pinchImageView});
        } else {
            photoView.mImageView = pinchImageView;
        }
    }

    public static final /* synthetic */ void access$setMLastSwapProgress$p(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e20b01", new Object[]{photoView, new Float(f2)});
        } else {
            photoView.mLastSwapProgress = f2;
        }
    }

    public static final /* synthetic */ void access$setMSwipeListener$p(PhotoView photoView, uzq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da3e082", new Object[]{photoView, aVar});
        } else {
            photoView.mSwipeListener = aVar;
        }
    }

    private final BitmapDrawable getFinalDrawable(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("3fa86e11", new Object[]{this, bitmapDrawable});
        }
        try {
            int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
            int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
            if (intrinsicHeight <= 4000 && intrinsicWidth <= 4000) {
                return bitmapDrawable;
            }
            Matrix matrix = new Matrix();
            float f2 = 4000;
            float min = (float) Math.min(f2 / intrinsicHeight, f2 / intrinsicWidth);
            matrix.setScale(min, min);
            return new BitmapDrawable(Bitmap.createBitmap(bitmapDrawable.getBitmap(), 0, 0, intrinsicWidth, intrinsicHeight, matrix, true));
        } catch (Exception unused) {
            return bitmapDrawable;
        } catch (OutOfMemoryError e) {
            tpu.Companion.a(TAG, "TNodePhotoView getFinalDrawable OOM", e);
            return bitmapDrawable;
        }
    }

    public static /* synthetic */ Object ipc$super(PhotoView photoView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/photo/PhotoView");
    }

    private final void loadImage(cec cecVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93ec026", new Object[]{this, cecVar, str});
            return;
        }
        PinchImageView pinchImageView = this.mImageView;
        if (pinchImageView != null) {
            Context context = pinchImageView.getContext();
            ckf.f(context, "mImageView.context");
            qle.b o = new qle.b(context, str).o("dressup", "dressup");
            String str2 = this.imageQuality;
            if (str2 != null) {
                o.m(str2);
            }
            cecVar.a(o.a(), new j());
            return;
        }
        ckf.y("mImageView");
        throw null;
    }

    public final void closePage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc6d1ae", new Object[]{this});
        } else {
            onPageClosed(new b());
        }
    }

    public final void enablePullDown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ed3643", new Object[]{this, new Boolean(z)});
        } else if (z) {
            uzq uzqVar = this.mPullListener;
            if (uzqVar == null) {
                uzq.b bVar = uzq.Companion;
                PinchImageView pinchImageView = this.mImageView;
                if (pinchImageView != null) {
                    uzqVar = bVar.a(pinchImageView, this.mSwipeCallback);
                } else {
                    ckf.y("mImageView");
                    throw null;
                }
            }
            this.mPullListener = uzqVar;
            PinchImageView pinchImageView2 = this.mImageView;
            if (pinchImageView2 != null) {
                ckf.d(uzqVar);
                pinchImageView2.setOnTouchListener(uzqVar);
                return;
            }
            ckf.y("mImageView");
            throw null;
        }
    }

    public final ImageView getImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("5c716d3f", new Object[]{this});
        }
        PinchImageView pinchImageView = this.mImageView;
        if (pinchImageView != null) {
            return pinchImageView;
        }
        ckf.y("mImageView");
        throw null;
    }

    public final void setAutoClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523dbc46", new Object[]{this, new Boolean(z)});
        } else {
            this.mAutoClose = z;
        }
    }

    public final void setEnableClickToDismiss(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ac03e1", new Object[]{this, new Boolean(z)});
            return;
        }
        this.clickToDismiss = z;
        if (z) {
            PinchImageView pinchImageView = this.mImageView;
            if (pinchImageView != null) {
                pinchImageView.setOnClickListener(new h());
            } else {
                ckf.y("mImageView");
                throw null;
            }
        }
    }

    public final void setImagePath(String str, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9990593", new Object[]{this, str, drawable});
            return;
        }
        PinchImageView pinchImageView = this.mImageView;
        if (pinchImageView != null) {
            pinchImageView.setTransitionName(str);
            if (drawable != null) {
                this.hasInitDrawable = true;
                PinchImageView pinchImageView2 = this.mImageView;
                if (pinchImageView2 != null) {
                    pinchImageView2.setImageDrawable(drawable);
                } else {
                    ckf.y("mImageView");
                    throw null;
                }
            }
            if (str != null) {
                cec c2 = ud0.Companion.c();
                if (drawable != null) {
                    zrt.Companion.d(new i(c2, str), 200L);
                } else {
                    loadImage(c2, str);
                }
            }
        } else {
            ckf.y("mImageView");
            throw null;
        }
    }

    public final void setImageQuality(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888daab7", new Object[]{this, str});
        } else {
            this.imageQuality = str;
        }
    }

    public final void setPullDownOffset(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5033509d", new Object[]{this, new Float(f2)});
            return;
        }
        uzq uzqVar = this.mPullListener;
        if (uzqVar != null && f2 > 0) {
            uzqVar.k(f2);
        }
    }

    public final void setSrcRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2f3b4c", new Object[]{this, rect});
        } else if (rect != null) {
            Rect rect2 = this.mSrcRect;
            int i2 = rect.left;
            int i3 = rect.top;
            rect2.set(i2, i3, rect.right + i2, rect.bottom + i3);
        }
    }

    public final void setSwapListener(uzq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9b093", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.mSwipeListener = aVar;
    }

    public final void setZoom(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6fede4", new Object[]{this, new Float(f2)});
            return;
        }
        PinchImageView pinchImageView = this.mImageView;
        if (pinchImageView != null) {
            pinchImageView.setMaxZoom(f2);
        } else {
            ckf.y("mImageView");
            throw null;
        }
    }

    public final void setZoomListener(PinchImageView.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c29e12d", new Object[]{this, kVar});
            return;
        }
        ckf.g(kVar, DataReceiveMonitor.CB_LISTENER);
        PinchImageView pinchImageView = this.mImageView;
        if (pinchImageView != null) {
            pinchImageView.setZoomListener(kVar);
        } else {
            ckf.y("mImageView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "animation", "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;

        public g(float f) {
            this.b = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.f(valueAnimator, "animation");
            float animatedFraction = 1 - valueAnimator.getAnimatedFraction();
            int argb = Color.argb((int) (255 * animatedFraction * this.b), 0, 0, 0);
            uzq.a access$getMSwipeListener$p = PhotoView.access$getMSwipeListener$p(PhotoView.this);
            if (access$getMSwipeListener$p != null) {
                access$getMSwipeListener$p.b(animatedFraction * this.b);
            }
            Integer access$getDEFAULT_NAVIGATION_COLOR$cp = PhotoView.access$getDEFAULT_NAVIGATION_COLOR$cp();
            ckf.d(access$getDEFAULT_NAVIGATION_COLOR$cp);
            int compositeColors = ColorUtils.compositeColors(argb, access$getDEFAULT_NAVIGATION_COLOR$cp.intValue());
            a aVar = PhotoView.Companion;
            Context context = PhotoView.this.getContext();
            if (context != null) {
                a.b(aVar, (Activity) context, compositeColors);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    private final void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        if (DEFAULT_NAVIGATION_COLOR == null) {
            a aVar = Companion;
            Context context = getContext();
            if (context != null) {
                DEFAULT_NAVIGATION_COLOR = Integer.valueOf(a.a(aVar, (Activity) context));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
        }
        a aVar2 = Companion;
        Context context2 = getContext();
        if (context2 != null) {
            a.b(aVar2, (Activity) context2, -16777216);
            PinchImageView pinchImageView = new PinchImageView(getContext());
            this.mImageView = pinchImageView;
            pinchImageView.setFitMode(0);
            PinchImageView pinchImageView2 = this.mImageView;
            if (pinchImageView2 != null) {
                pinchImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                PinchImageView pinchImageView3 = this.mImageView;
                if (pinchImageView3 != null) {
                    pinchImageView3.setTouchable(true);
                    PinchImageView pinchImageView4 = this.mImageView;
                    if (pinchImageView4 != null) {
                        pinchImageView4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        PinchImageView pinchImageView5 = this.mImageView;
                        if (pinchImageView5 != null) {
                            pinchImageView5.setOnLongClickListener(c.INSTANCE);
                            PinchImageView pinchImageView6 = this.mImageView;
                            if (pinchImageView6 != null) {
                                pinchImageView6.setOnDoubleClickListener(d.INSTANCE);
                                PinchImageView pinchImageView7 = this.mImageView;
                                if (pinchImageView7 != null) {
                                    addView(pinchImageView7);
                                } else {
                                    ckf.y("mImageView");
                                    throw null;
                                }
                            } else {
                                ckf.y("mImageView");
                                throw null;
                            }
                        } else {
                            ckf.y("mImageView");
                            throw null;
                        }
                    } else {
                        ckf.y("mImageView");
                        throw null;
                    }
                } else {
                    ckf.y("mImageView");
                    throw null;
                }
            } else {
                ckf.y("mImageView");
                throw null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onPageClosed(android.animation.Animator.AnimatorListener r22) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dressup.common.view.photo.PhotoView.onPageClosed(android.animation.Animator$AnimatorListener):void");
    }
}

package com.taobao.android.megadesign.anim.lottie;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.dmh;
import tb.jpu;
import tb.kkh;
import tb.mxv;
import tb.oie;
import tb.olh;
import tb.plh;
import tb.qlh;
import tb.snh;
import tb.ssq;
import tb.tkt;
import tb.ukh;
import tb.v3i;
import tb.v4s;
import tb.vkt;
import tb.wkh;
import tb.wnh;
import tb.wsq;
import tb.y7c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001ZB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010+J\u0019\u00101\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010?\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020=j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER*\u0010I\u001a\u0016\u0012\u0004\u0012\u00020G\u0018\u00010Fj\n\u0012\u0004\u0012\u00020G\u0018\u0001`H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010Y¨\u0006["}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/MALottieView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "init", "()V", "", v4s.PARAM_IS_DEBUG, "()Z", DataReceiveMonitor.CB_LISTENER, "addAnimatorListener", "(Landroid/animation/Animator$AnimatorListener;)V", "removeAllAnimatorListeners", "Ltb/wkh;", "config", "setUpWithConfig", "(Ltb/wkh;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Ltb/qlh;", "registerLoadTaskListener", "(Ltb/qlh;)V", "Lcom/taobao/android/megadesign/anim/lottie/MALottieView$a;", "setOnAreaClickEventListener", "(Lcom/taobao/android/megadesign/anim/lottie/MALottieView$a;)V", "Landroid/animation/Animator;", "animation", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Ltb/snh;", "fontAssetDelegate", "Ltb/snh;", "", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "listeners", "Ljava/util/HashSet;", "loadTaskListener", "Ltb/qlh;", "Lcom/alibaba/fastjson/JSONArray;", "tapAreas", "Lcom/alibaba/fastjson/JSONArray;", "Ljava/util/ArrayList;", "Landroid/graphics/Rect;", "Lkotlin/collections/ArrayList;", "tapRect", "Ljava/util/ArrayList;", "tapAreaDebuggable", "Z", "layoutWidth", TLogTracker.LEVEL_INFO, "layoutHeight", "areaClickListener", "Lcom/taobao/android/megadesign/anim/lottie/MALottieView$a;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "Ljava/lang/Boolean;", "a", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MALottieView extends LottieAnimationView implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a areaClickListener;
    private snh fontAssetDelegate;
    private Boolean isDebug;
    private int layoutHeight;
    private int layoutWidth;
    private qlh loadTaskListener;
    private boolean tapAreaDebuggable;
    private JSONArray tapAreas;
    private ArrayList<Rect> tapRect;
    private final String TAG = "MALottieView";
    private final HashSet<Animator.AnimatorListener> listeners = new HashSet<>();
    private Paint paint = new Paint();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements y7c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ wkh b;

        public b(wkh wkhVar) {
            this.b = wkhVar;
        }

        @Override // tb.y7c
        public Typeface a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("c0aebb70", new Object[]{this, str});
            }
            try {
                Context context = MALottieView.this.getContext();
                ckf.f(context, "context");
                return Typeface.createFromAsset(context.getAssets(), this.b.E());
            } catch (Throwable unused) {
                if (this.b.P()) {
                    return Typeface.DEFAULT_BOLD;
                }
                return null;
            }
        }

        @Override // tb.y7c
        public String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("20f14465", new Object[]{this, str});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c<T> implements plh<kkh> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ wkh b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a implements oie {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // tb.oie
            public final Bitmap fetchBitmap(olh olhVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Bitmap) ipChange.ipc$dispatch("e2a81f0e", new Object[]{this, olhVar});
                }
                ckf.f(olhVar, AdvanceSetting.NETWORK_TYPE);
                return olhVar.a();
            }
        }

        public c(wkh wkhVar) {
            this.b = wkhVar;
        }

        /* renamed from: a */
        public final void onResult(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
                return;
            }
            try {
                TLog.loge("MegaDesign", MALottieView.access$getTAG$p(MALottieView.this), "fetched lottie composition");
                ckf.f(kkhVar, "composition");
                Map<String, olh> j = kkhVar.j();
                ckf.f(j, "composition.images");
                if (!j.isEmpty()) {
                    Iterator<Map.Entry<String, olh>> it = j.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().getValue().f()) {
                                MALottieView.this.setImageAssetDelegate(a.INSTANCE);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                MALottieView.this.setComposition(kkhVar);
                if (this.b.B()) {
                    MALottieView.this.playAnimation();
                }
                qlh access$getLoadTaskListener$p = MALottieView.access$getLoadTaskListener$p(MALottieView.this);
                if (access$getLoadTaskListener$p != null) {
                    access$getLoadTaskListener$p.onCompositionLoaded(kkhVar);
                }
            } catch (Throwable th) {
                qlh access$getLoadTaskListener$p2 = MALottieView.access$getLoadTaskListener$p(MALottieView.this);
                if (access$getLoadTaskListener$p2 != null) {
                    access$getLoadTaskListener$p2.a(th);
                }
                AppMonitor.Counter.commit("MegaDesign", "LottieError", th.toString(), 1.0d);
                String access$getTAG$p = MALottieView.access$getTAG$p(MALottieView.this);
                TLog.loge("MegaDesign", access$getTAG$p, "init lottie error = " + th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d<T> implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public final void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            qlh access$getLoadTaskListener$p = MALottieView.access$getLoadTaskListener$p(MALottieView.this);
            if (access$getLoadTaskListener$p != null) {
                ckf.f(th, AdvanceSetting.NETWORK_TYPE);
                access$getLoadTaskListener$p.a(th);
            }
            String access$getTAG$p = MALottieView.access$getTAG$p(MALottieView.this);
            TLog.loge("MegaDesign", access$getTAG$p, "load error = " + th);
        }
    }

    public MALottieView(Context context) {
        super(context);
        init();
    }

    public static final /* synthetic */ qlh access$getLoadTaskListener$p(MALottieView mALottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlh) ipChange.ipc$dispatch("61862de8", new Object[]{mALottieView});
        }
        return mALottieView.loadTaskListener;
    }

    public static final /* synthetic */ String access$getTAG$p(MALottieView mALottieView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfa1e990", new Object[]{mALottieView});
        }
        return mALottieView.TAG;
    }

    public static final /* synthetic */ void access$setLoadTaskListener$p(MALottieView mALottieView, qlh qlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a00ca", new Object[]{mALottieView, qlhVar});
        } else {
            mALottieView.loadTaskListener = qlhVar;
        }
    }

    private final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        mxv.INSTANCE.b("DXMALottieViewWidgetNode", v3i.f(jpu.a("ctxName", getContext().getClass().getName())));
        Context context = getContext();
        ckf.f(context, "context");
        this.fontAssetDelegate = new snh(context);
        super.addAnimatorListener(this);
        setFontAssetDelegate(this.fontAssetDelegate);
    }

    public static /* synthetic */ Object ipc$super(MALottieView mALottieView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1314947985:
                super.addAnimatorListener((Animator.AnimatorListener) objArr[0]);
                return null;
            case 1955789090:
                super.removeAllAnimatorListeners();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/anim/lottie/MALottieView");
        }
    }

    private final boolean isDebug() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        if (this.isDebug == null) {
            Context context = getContext();
            ckf.f(context, "context");
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            this.isDebug = Boolean.valueOf(z);
        }
        return ckf.b(this.isDebug, Boolean.TRUE);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e608391", new Object[]{this, animatorListener});
        } else {
            this.listeners.add(animatorListener);
        }
    }

    public final Paint getPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("daa8bf5c", new Object[]{this});
        }
        return this.paint;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        for (Animator.AnimatorListener animatorListener : this.listeners) {
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.tapAreaDebuggable && isDebug()) {
            if (canvas != null) {
                canvas.save();
            }
            ArrayList<Rect> arrayList = this.tapRect;
            if (arrayList != null) {
                for (Rect rect : arrayList) {
                    this.paint.setColor(tkt.DEFAULT_LINK_COLOR);
                    this.paint.setStrokeWidth(10.0f);
                    if (canvas != null) {
                        canvas.drawRect(rect, this.paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            if ((this.layoutWidth != measuredWidth || this.layoutHeight != measuredHeight) && (jSONArray = this.tapAreas) != null) {
                ArrayList<Rect> arrayList = this.tapRect;
                if (arrayList == null) {
                    this.tapRect = new ArrayList<>();
                } else if (arrayList != null) {
                    arrayList.clear();
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        try {
                            float f = measuredWidth;
                            float f2 = measuredHeight;
                            Rect rect = new Rect((int) (((JSONObject) next).getFloatValue("left") * f), (int) (((JSONObject) next).getFloatValue("top") * f2), (int) (f * ((JSONObject) next).getFloatValue("right")), (int) (f2 * ((JSONObject) next).getFloatValue("bottom")));
                            ArrayList<Rect> arrayList2 = this.tapRect;
                            if (arrayList2 != null) {
                                arrayList2.add(rect);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Float f;
        Float f2;
        ArrayList<Rect> arrayList;
        a aVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        Integer num = null;
        if (motionEvent != null) {
            f = Float.valueOf(motionEvent.getX());
        } else {
            f = null;
        }
        if (motionEvent != null) {
            f2 = Float.valueOf(motionEvent.getY());
        } else {
            f2 = null;
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        if (!(num == null || num.intValue() != 1 || (arrayList = this.tapRect) == null)) {
            if (f == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (f2 == null) {
                return super.onTouchEvent(motionEvent);
            }
            for (Rect rect : arrayList) {
                if (rect.contains((int) f.floatValue(), (int) f2.floatValue()) && (aVar = this.areaClickListener) != null) {
                    aVar.a(i);
                }
                i++;
            }
        }
        return true;
    }

    public final void registerLoadTaskListener(qlh qlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec568ee", new Object[]{this, qlhVar});
        } else {
            this.loadTaskListener = qlhVar;
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void removeAllAnimatorListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7492f922", new Object[]{this});
            return;
        }
        super.removeAllAnimatorListeners();
        this.listeners.clear();
        super.addAnimatorListener(this);
    }

    public final void setOnAreaClickEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36cf9306", new Object[]{this, aVar});
        } else {
            this.areaClickListener = aVar;
        }
    }

    public final void setPaint(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8629deb8", new Object[]{this, paint});
            return;
        }
        ckf.g(paint, "<set-?>");
        this.paint = paint;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        ckf.g(animator, "animation");
        Object tag = getTag(R.string.tag_lottie_play_control);
        if (!(tag instanceof JSONArray)) {
            tag = null;
        }
        JSONArray jSONArray = (JSONArray) tag;
        if (jSONArray == null || jSONArray.isEmpty()) {
            for (Animator.AnimatorListener animatorListener : this.listeners) {
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                }
            }
            return;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("start");
                ckf.f(string, "config.getString(\"start\")");
                int parseInt = Integer.parseInt(string);
                String string2 = jSONObject.getString("end");
                ckf.f(string2, "config.getString(\"end\")");
                setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                String string3 = jSONObject.getString("loopCount");
                ckf.f(string3, "config.getString(\"loopCount\")");
                Integer m = ssq.m(string3);
                if (m != null) {
                    i = m.intValue();
                }
                setRepeatCount(i);
            } catch (NumberFormatException unused) {
            }
            jSONArray.remove(jSONObject);
            playAnimation();
            setTag(R.string.tag_lottie_play_control, jSONArray);
        }
    }

    public final void setUpWithConfig(wkh wkhVar) {
        dmh<kkh> dmhVar;
        RenderMode renderMode;
        snh snhVar;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3644f15c", new Object[]{this, wkhVar});
        } else if (wkhVar != null) {
            mxv mxvVar = mxv.INSTANCE;
            Context context = getContext();
            mxvVar.b("MALottieView", kotlin.collections.a.j(jpu.a("ctxName", context != null ? context.getClass().getName() : null), jpu.a("bizId", wkhVar.C())));
            Float N = wkhVar.N();
            if (N != null) {
                setSpeed(N.floatValue());
            }
            setRepeatCount(wkhVar.F());
            JSONArray L = wkhVar.L();
            if (L != null && !L.isEmpty()) {
                Context context2 = getContext();
                ckf.f(context2, "context");
                JSONArray L2 = wkhVar.L();
                ckf.d(L2);
                Drawable drawable = getDrawable();
                if (!(drawable instanceof LottieDrawable)) {
                    drawable = null;
                }
                setImageAssetDelegate(new wnh(context2, L2, (LottieDrawable) drawable));
            }
            String E = wkhVar.E();
            if (!(E == null || wsq.a0(E) || (snhVar = this.fontAssetDelegate) == null)) {
                snhVar.c(new b(wkhVar));
            }
            JSONArray I = wkhVar.I();
            if (I != null && !I.isEmpty()) {
                JSONArray I2 = wkhVar.I();
                ckf.d(I2);
                JSONObject jSONObject = I2.getJSONObject(0);
                if (jSONObject != null) {
                    try {
                        String string = jSONObject.getString("start");
                        ckf.f(string, "section.getString(\"start\")");
                        int parseInt = Integer.parseInt(string);
                        String string2 = jSONObject.getString("end");
                        ckf.f(string2, "section.getString(\"end\")");
                        setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                        String string3 = jSONObject.getString("loopCount");
                        ckf.f(string3, "section.getString(\"loopCount\")");
                        Integer m = ssq.m(string3);
                        if (m != null) {
                            i = m.intValue();
                        }
                        setRepeatCount(i);
                    } catch (NumberFormatException unused) {
                    }
                    JSONArray I3 = wkhVar.I();
                    ckf.d(I3);
                    I3.remove(jSONObject);
                    setTag(R.string.tag_lottie_play_control, wkhVar.I());
                }
            }
            String K = wkhVar.K();
            if (K != null && !wsq.a0(K)) {
                String K2 = wkhVar.K();
                if (K2 != null) {
                    int hashCode = K2.hashCode();
                    if (hashCode != 116909544) {
                        if (hashCode == 1319330215 && K2.equals("software")) {
                            renderMode = RenderMode.SOFTWARE;
                            setRenderMode(renderMode);
                        }
                    } else if (K2.equals(com.taobao.downgrade.a.HARDWARE)) {
                        renderMode = RenderMode.HARDWARE;
                        setRenderMode(renderMode);
                    }
                }
                renderMode = RenderMode.AUTOMATIC;
                setRenderMode(renderMode);
            }
            JSONArray M = wkhVar.M();
            if (M != null && !M.isEmpty()) {
                vkt vktVar = new vkt(this);
                JSONArray M2 = wkhVar.M();
                if (M2 != null) {
                    for (Object obj : M2) {
                        boolean z = obj instanceof JSONObject;
                        JSONObject jSONObject2 = (JSONObject) (!z ? null : obj);
                        String string4 = jSONObject2 != null ? jSONObject2.getString("key") : null;
                        if (!z) {
                            obj = null;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj;
                        vktVar.c(string4, jSONObject3 != null ? jSONObject3.getString("value") : null);
                    }
                }
                setTextDelegate(vktVar);
            }
            if (wkhVar.J() != null) {
                Float J = wkhVar.J();
                ckf.d(J);
                setProgress(J.floatValue());
            }
            String G = wkhVar.G();
            if (G == null || wsq.a0(G)) {
                String A = wkhVar.A();
                if (A == null || wsq.a0(A)) {
                    String D = wkhVar.D();
                    if (D != null && !wsq.a0(D)) {
                        dmhVar = ukh.o(new FileInputStream(wkhVar.D()), null);
                    } else {
                        return;
                    }
                } else {
                    dmhVar = ukh.l(getContext(), wkhVar.A(), null);
                }
            } else {
                dmhVar = ukh.y(getContext(), wkhVar.G(), wkhVar.G());
            }
            dmhVar.d(new c(wkhVar));
            dmhVar.c(new d());
            JSONArray H = wkhVar.H();
            if (H != null && !H.isEmpty()) {
                this.tapAreas = wkhVar.H();
            }
            this.tapAreaDebuggable = wkhVar.O();
        }
    }

    public MALottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MALottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

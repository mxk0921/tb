package com.taobao.android.detail.core.detail.ext.view.widget.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TouchImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK = 10;
    public static final long DOUBLE_PRESS_INTERVAL = 600;
    public static final int DRAG = 1;
    public static final float FRICTION = 1.0f;
    public static final long LONG_PRESS_MAX_MOVED_DISTANCE = 50;
    public static final int NONE = 0;
    public static final int ZOOM = 2;
    public float bmHeight;
    public float bmWidth;
    public float bottom;
    public float height;
    public float[] m;
    private Timer mClickTimer;
    private Context mContext;
    private View.OnClickListener mOnClickListener;
    private View.OnLongClickListener mOnSinglePointLongClickListener;
    private b mPendingCheckForLongPress;
    private Object mScaleDetector;
    public float matrixX;
    public float matrixY;
    public float origHeight;
    public float origWidth;
    public float redundantXSpace;
    public float redundantYSpace;
    public float right;
    public float width;
    public Matrix matrix = new Matrix();
    public Matrix savedMatrix = new Matrix();
    public int mode = 0;
    public PointF last = new PointF();
    public PointF mid = new PointF();
    public PointF start = new PointF();
    public float saveScale = 1.0f;
    public float minScale = 1.0f;
    public float maxScale = 3.0f;
    public float oldDist = 1.0f;
    public PointF lastDelta = new PointF(0.0f, 0.0f);
    public float velocity = 0.0f;
    public long lastPressTime = 0;
    public long lastDragTime = 0;
    public boolean allowInert = false;
    public boolean mIsActionMoving = false;
    private Handler mTimerHandler = null;
    private boolean zoomToOriginalSize = false;
    private boolean mHasPerformedLongPress = false;
    private int mDownPointCount = 0;
    private PointF mDragDistance = new PointF();
    public boolean onLeftSide = false;
    public boolean onTopSide = false;
    public boolean onRightSide = false;
    public boolean onBottomSide = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f6576a;

        static {
            t2o.a(438304783);
        }

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb696b4", new Object[]{this});
            } else {
                this.f6576a = TouchImageView.access$2100(TouchImageView.this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TouchImageView.this.isPressed() && TouchImageView.this.getParent() != null && this.f6576a == TouchImageView.access$1900(TouchImageView.this)) {
                TouchImageView.access$302(TouchImageView.this, true);
                if (TouchImageView.access$2000(TouchImageView.this) != null && TouchImageView.access$500(TouchImageView.this) == 1 && TouchImageView.access$400(TouchImageView.this).x < 50.0f && TouchImageView.access$400(TouchImageView.this).y < 50.0f) {
                    TouchImageView.access$2000(TouchImageView.this).onLongClick(TouchImageView.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(438304784);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/detail/ext/view/widget/base/TouchImageView$ScaleListener");
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onScale(android.view.ScaleGestureDetector r13) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.c.onScale(android.view.ScaleGestureDetector):boolean");
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            TouchImageView.this.mode = 2;
            return true;
        }

        public /* synthetic */ c(TouchImageView touchImageView, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Handler> f6578a;

        static {
            t2o.a(438304785);
        }

        public d(Handler handler) {
            this.f6578a = new WeakReference<>(handler);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/detail/ext/view/widget/base/TouchImageView$Task");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Handler handler = this.f6578a.get();
            if (handler != null) {
                handler.sendEmptyMessage(10);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TouchImageView> f6579a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TouchImageView f6580a;

            public a(TouchImageView touchImageView) {
                this.f6580a = touchImageView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.a(e.this, this.f6580a);
                }
            }
        }

        static {
            t2o.a(438304786);
        }

        public e(TouchImageView touchImageView) {
            this.f6579a = new WeakReference<>(touchImageView);
        }

        public static /* synthetic */ void a(e eVar, TouchImageView touchImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec6d0a26", new Object[]{eVar, touchImageView});
            } else {
                eVar.b(touchImageView);
            }
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/detail/ext/view/widget/base/TouchImageView$TimeHandler");
        }

        public final void b(TouchImageView touchImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73d3ee7b", new Object[]{this, touchImageView});
                return;
            }
            touchImageView.performClick();
            if (TouchImageView.access$1800(touchImageView) != null) {
                TouchImageView.access$1800(touchImageView).onClick(touchImageView);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TouchImageView touchImageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 10 || (touchImageView = this.f6579a.get()) == null) {
            } else {
                if (getLooper() == Looper.getMainLooper()) {
                    b(touchImageView);
                } else {
                    touchImageView.post(new a(touchImageView));
                }
            }
        }
    }

    static {
        t2o.a(438304781);
    }

    public TouchImageView(Context context) {
        super(context);
        super.setClickable(true);
        this.mContext = context;
        init();
    }

    public static /* synthetic */ Object access$100(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("68719b40", new Object[]{touchImageView});
        }
        return touchImageView.mScaleDetector;
    }

    public static /* synthetic */ void access$1000(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9194384", new Object[]{touchImageView});
        } else {
            touchImageView.calcPadding();
        }
    }

    public static /* synthetic */ void access$1100(TouchImageView touchImageView, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe2c8e3", new Object[]{touchImageView, new Float(f), new Float(f2)});
        } else {
            touchImageView.checkAndSetTranslate(f, f2);
        }
    }

    public static /* synthetic */ Handler access$1200(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("17beabc4", new Object[]{touchImageView});
        }
        return touchImageView.mTimerHandler;
    }

    public static /* synthetic */ void access$1300(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452d81e1", new Object[]{touchImageView});
        } else {
            touchImageView.scaleMatrixToBounds();
        }
    }

    public static /* synthetic */ double access$1400(TouchImageView touchImageView, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("faae99ce", new Object[]{touchImageView, pointF, pointF2})).doubleValue();
        }
        return touchImageView.distanceBetween(pointF, pointF2);
    }

    public static /* synthetic */ PointF access$1500(TouchImageView touchImageView, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("d6018fab", new Object[]{touchImageView, motionEvent});
        }
        return touchImageView.midPointF(motionEvent);
    }

    public static /* synthetic */ void access$1600(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d141c03e", new Object[]{touchImageView});
        } else {
            touchImageView.checkSiding();
        }
    }

    public static /* synthetic */ View.OnClickListener access$1800(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("f4bf28e5", new Object[]{touchImageView});
        }
        return touchImageView.mOnClickListener;
    }

    public static /* synthetic */ int access$1900(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d55fe8e", new Object[]{touchImageView})).intValue();
        }
        return touchImageView.getWindowAttachCount();
    }

    public static /* synthetic */ void access$200(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccdd051", new Object[]{touchImageView});
        } else {
            touchImageView.fillMatrixXY();
        }
    }

    public static /* synthetic */ View.OnLongClickListener access$2000(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("441298a", new Object[]{touchImageView});
        }
        return touchImageView.mOnSinglePointLongClickListener;
    }

    public static /* synthetic */ int access$2100(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f468757", new Object[]{touchImageView})).intValue();
        }
        return touchImageView.getWindowAttachCount();
    }

    public static /* synthetic */ boolean access$300(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b7f3a74", new Object[]{touchImageView})).booleanValue();
        }
        return touchImageView.mHasPerformedLongPress;
    }

    public static /* synthetic */ boolean access$302(TouchImageView touchImageView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55b726a", new Object[]{touchImageView, new Boolean(z)})).booleanValue();
        }
        touchImageView.mHasPerformedLongPress = z;
        return z;
    }

    public static /* synthetic */ PointF access$400(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("c7a5fbc6", new Object[]{touchImageView});
        }
        return touchImageView.mDragDistance;
    }

    public static /* synthetic */ int access$500(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8e20ea1", new Object[]{touchImageView})).intValue();
        }
        return touchImageView.mDownPointCount;
    }

    public static /* synthetic */ int access$502(TouchImageView touchImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3452e60a", new Object[]{touchImageView, new Integer(i)})).intValue();
        }
        touchImageView.mDownPointCount = i;
        return i;
    }

    public static /* synthetic */ void access$600(TouchImageView touchImageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adc13d6", new Object[]{touchImageView, new Integer(i)});
        } else {
            touchImageView.checkForLongClick(i);
        }
    }

    public static /* synthetic */ float access$700(TouchImageView touchImageView, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d954df1", new Object[]{touchImageView, motionEvent})).floatValue();
        }
        return touchImageView.spacing(motionEvent);
    }

    public static /* synthetic */ void access$800(TouchImageView touchImageView, PointF pointF, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56041b1", new Object[]{touchImageView, pointF, motionEvent});
        } else {
            touchImageView.midPoint(pointF, motionEvent);
        }
    }

    public static /* synthetic */ Timer access$900(TouchImageView touchImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("bd107316", new Object[]{touchImageView});
        }
        return touchImageView.mClickTimer;
    }

    public static /* synthetic */ Timer access$902(TouchImageView touchImageView, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("535c14c0", new Object[]{touchImageView, timer});
        }
        touchImageView.mClickTimer = timer;
        return timer;
    }

    private void calcPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7be2683", new Object[]{this});
            return;
        }
        float f = this.width;
        float f2 = this.saveScale;
        this.right = ((f * f2) - f) - ((this.redundantXSpace * 2.0f) * f2);
        float f3 = this.height;
        this.bottom = ((f3 * f2) - f3) - ((this.redundantYSpace * 2.0f) * f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkAndSetTranslate(float r6, float r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0022
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2 = 0
            r7[r2] = r5
            r2 = 1
            r7[r2] = r1
            r1 = 2
            r7[r1] = r6
            java.lang.String r6 = "b7c78ee2"
            r0.ipc$dispatch(r6, r7)
            return
        L_0x0022:
            float r0 = r5.origWidth
            float r1 = r5.saveScale
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r1 = r5.origHeight
            float r2 = r5.saveScale
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            r5.fillMatrixXY()
            float r2 = r5.width
            r3 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            float r6 = r5.matrixY
            float r0 = r6 + r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004d
        L_0x004a:
            float r7 = -r6
        L_0x004b:
            r6 = 0
            goto L_0x009e
        L_0x004d:
            float r0 = r6 + r7
            float r1 = r5.bottom
            float r2 = -r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            float r6 = r6 + r1
            goto L_0x004a
        L_0x0058:
            float r0 = r5.height
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            float r7 = r5.matrixX
            float r0 = r7 + r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
        L_0x0066:
            float r6 = -r7
        L_0x0067:
            r7 = 0
            goto L_0x009e
        L_0x0069:
            float r0 = r7 + r6
            float r1 = r5.right
            float r2 = -r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            float r7 = r7 + r1
            goto L_0x0066
        L_0x0074:
            float r0 = r5.matrixX
            float r1 = r0 + r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x007e
        L_0x007c:
            float r6 = -r0
            goto L_0x0089
        L_0x007e:
            float r1 = r0 + r6
            float r2 = r5.right
            float r4 = -r2
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0089
            float r0 = r0 + r2
            goto L_0x007c
        L_0x0089:
            float r0 = r5.matrixY
            float r1 = r0 + r7
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0093
        L_0x0091:
            float r7 = -r0
            goto L_0x009e
        L_0x0093:
            float r1 = r0 + r7
            float r2 = r5.bottom
            float r3 = -r2
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            float r0 = r0 + r2
            goto L_0x0091
        L_0x009e:
            android.graphics.Matrix r0 = r5.matrix
            r0.postTranslate(r6, r7)
            r5.checkSiding()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView.checkAndSetTranslate(float, float):void");
    }

    private void checkForLongClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77771", new Object[]{this, new Integer(i)});
            return;
        }
        this.mHasPerformedLongPress = false;
        if (this.mPendingCheckForLongPress == null) {
            this.mPendingCheckForLongPress = new b();
        }
        this.mPendingCheckForLongPress.a();
        postDelayed(this.mPendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - i);
    }

    private void checkSiding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaa5203", new Object[]{this});
            return;
        }
        fillMatrixXY();
        float round = Math.round(this.origWidth * this.saveScale);
        float round2 = Math.round(this.origHeight * this.saveScale);
        this.onBottomSide = false;
        this.onTopSide = false;
        this.onRightSide = false;
        this.onLeftSide = false;
        float f = this.matrixX;
        if ((-f) < 10.0f) {
            this.onLeftSide = true;
        }
        float f2 = this.width;
        if ((round >= f2 && (f + round) - f2 < 10.0f) || (round <= f2 && (-f) + round <= f2)) {
            this.onRightSide = true;
        }
        float f3 = this.matrixY;
        if ((-f3) < 10.0f) {
            this.onTopSide = true;
        }
        if (Math.abs(((-f3) + this.height) - round2) < 10.0f) {
            this.onBottomSide = true;
        }
    }

    private double distanceBetween(PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4eb310a8", new Object[]{this, pointF, pointF2})).doubleValue();
        }
        return Math.sqrt(Math.pow(pointF.x - pointF2.x, 2.0d) + Math.pow(pointF.y - pointF2.y, 2.0d));
    }

    private void fillMatrixXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1939472c", new Object[]{this});
            return;
        }
        this.matrix.getValues(this.m);
        float[] fArr = this.m;
        this.matrixX = fArr[2];
        this.matrixY = fArr[5];
    }

    private float getImageWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7f3f918", new Object[]{this})).floatValue();
        }
        return Math.round(this.width * this.saveScale);
    }

    public static /* synthetic */ Object ipc$super(TouchImageView touchImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -303694881:
                super.setImageBitmap((Bitmap) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2010225293:
                super.setClickable(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/detail/ext/view/widget/base/TouchImageView");
        }
    }

    private void midPoint(PointF pointF, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611b778d", new Object[]{this, pointF, motionEvent});
        } else {
            pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
        }
    }

    private PointF midPointF(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("1c57aab1", new Object[]{this, motionEvent});
        }
        return new PointF((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
    }

    private void scaleMatrixToBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d67ee2", new Object[]{this});
            return;
        }
        if (Math.abs(this.matrixX + (this.right / 2.0f)) > 0.5f) {
            this.matrix.postTranslate(-(this.matrixX + (this.right / 2.0f)), 0.0f);
        }
        if (Math.abs(this.matrixY + (this.bottom / 2.0f)) > 0.5f) {
            this.matrix.postTranslate(0.0f, -(this.matrixY + (this.bottom / 2.0f)));
        }
    }

    private float spacing(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a5a20cf", new Object[]{this, motionEvent})).floatValue();
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.matrix.getValues(this.m);
        float f = this.m[2];
        if (getImageWidth() < this.width) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + this.width + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Timer timer = this.mClickTimer;
        if (timer != null) {
            timer.cancel();
        }
        setOnLongClickListener(null);
        setOnClickListener(null);
        setOnTouchListener(null);
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
        }
        return this.mode;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTimerHandler = new e(this);
        this.matrix.setTranslate(1.0f, 1.0f);
        this.m = new float[9];
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.mScaleDetector = new ScaleGestureDetector(this.mContext, new c(this, null));
        setOnTouchListener(new a());
    }

    public boolean isActionMoving() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7802a1f9", new Object[]{this})).booleanValue();
        }
        return this.mIsActionMoving;
    }

    public boolean isScaled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f442e4af", new Object[]{this})).booleanValue();
        }
        if (Math.round(getImageWidth()) != Math.round(this.origWidth)) {
            return true;
        }
        return false;
    }

    public boolean isZoomState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3188ff", new Object[]{this})).booleanValue();
        }
        if (this.mode == 2) {
            return true;
        }
        return false;
    }

    public boolean isZoomToOriginalSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bfed495", new Object[]{this})).booleanValue();
        }
        return this.zoomToOriginalSize;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            drawable = getDrawable();
        } catch (Exception e2) {
            tgh.c("TouchImageView", "onDraw() : Canvas trying to use a recycled bitmap", e2);
        }
        if (drawable != null) {
            if (!(drawable instanceof BitmapDrawable) || !((BitmapDrawable) drawable).getBitmap().isRecycled()) {
                super.onDraw(canvas);
                if (this.allowInert) {
                    PointF pointF = this.lastDelta;
                    float f = pointF.x;
                    float f2 = this.velocity;
                    float f3 = f * f2;
                    float f4 = pointF.y * f2;
                    if (f3 <= this.width && f4 <= this.height) {
                        this.velocity = f2 * 1.0f;
                        if (Math.abs(f3) >= 0.1d || Math.abs(f4) >= 0.1d) {
                            checkAndSetTranslate(f3, f4);
                            setImageMatrix(this.matrix);
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.width = View.MeasureSpec.getSize(i);
        float size = View.MeasureSpec.getSize(i2);
        this.height = size;
        float f3 = this.bmWidth;
        if (f3 > 0.0f) {
            f = this.width / f3;
        } else {
            f = 1.0f;
        }
        float f4 = this.bmHeight;
        if (f4 > 0.0f) {
            f2 = size / f4;
        } else {
            f2 = 1.0f;
        }
        float min = Math.min(f, f2);
        this.matrix.setScale(min, min);
        setImageMatrix(this.matrix);
        this.saveScale = 1.0f;
        float f5 = (this.height - (this.bmHeight * min)) / 2.0f;
        this.redundantYSpace = f5;
        float f6 = (this.width - (min * this.bmWidth)) / 2.0f;
        this.redundantXSpace = f6;
        this.matrix.postTranslate(f6, f5);
        this.origWidth = this.width - (this.redundantXSpace * 2.0f);
        this.origHeight = this.height - (this.redundantYSpace * 2.0f);
        calcPadding();
        setImageMatrix(this.matrix);
    }

    public boolean pagerCanScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c749c5", new Object[]{this})).booleanValue();
        }
        if ((this.mode != 2 || !canScrollHorizontally(10) || !canScrollHorizontally(-10)) && this.saveScale == this.minScale) {
            return true;
        }
        return false;
    }

    public void resetScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a356442", new Object[]{this});
            return;
        }
        fillMatrixXY();
        Matrix matrix = this.matrix;
        float f = this.minScale;
        float f2 = this.saveScale;
        matrix.postScale(f / f2, f / f2, this.width / 2.0f, this.height / 2.0f);
        this.saveScale = this.minScale;
        calcPadding();
        checkAndSetTranslate(0.0f, 0.0f);
        scaleMatrixToBounds();
        setImageMatrix(this.matrix);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
            return;
        }
        super.setImageBitmap(bitmap);
        this.bmWidth = bitmap.getWidth();
        this.bmHeight = bitmap.getHeight();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable != null) {
            this.bmWidth = drawable.getIntrinsicWidth();
            this.bmHeight = drawable.getIntrinsicHeight();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.mOnClickListener = onClickListener;
        }
    }

    public void setOnSinglePointLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab195d5", new Object[]{this, onLongClickListener});
        } else {
            this.mOnSinglePointLongClickListener = onLongClickListener;
        }
    }

    public void setZoomToOriginalSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bd222b", new Object[]{this, new Boolean(z)});
        } else {
            this.zoomToOriginalSize = z;
        }
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setClickable(true);
        this.mContext = context;
        init();
    }
}

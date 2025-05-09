package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.card.cards.web.WebPenetrateFrameLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tb.b93;
import tb.ct7;
import tb.ir9;
import tb.s6o;
import tb.sj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FscrmidFavorFrameLayout extends WeexConsumeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEGREES_MAX = 30;
    private static final int DEGREES_MIN = -30;
    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final int MAX_ALPHA = 255;
    private static final int MAX_FAVOR_COUNT = 20;
    private static final int REFRESH_RATE = 16000000;
    private static final String TAG = "FscrmidFavorFrameLayout";
    private Bitmap bitmap;
    private int bitmapCenterX;
    private int bitmapCenterY;
    private ct7 doubleClickListener;
    private boolean interceptIsDouble;
    private long interceptSingleClickTime;
    private boolean isDouble;
    private boolean isLongPress;
    private boolean isWebCardPlayingGame;
    private boolean mDisableTouch;
    private float mDispatchDownX;
    private ViewGroup mNeedDispatchTouchEventView;
    private int mTouchSlop;
    private boolean mediaCardScaled;
    private RangeSeekBar rangeSeekBar;
    private long singleClickTime;
    private boolean touchInRangeSeekBar;
    private final Matrix matrix = new Matrix();
    private final List<c> list = new ArrayList();
    private final int INTERCEPT_TOUCH_WIDTH = 180;
    private final b mOnClickRunnable = new b(this, null);
    private boolean start = true;
    private boolean mEnableFavor = true;
    private boolean mEnableDoubleEvent = true;
    private boolean isScreenEdge = false;
    private boolean isEnableWeexUponSeekBar = b93.u();
    private final Runnable mOnLongClickRunnable = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this) != null) {
                StringBuilder sb = new StringBuilder("albumEvent fscr mOnLongClickRunnable isalbum = ");
                if (FscrmidFavorFrameLayout.this.getId() == R.id.favor_frame) {
                    z = true;
                }
                sb.append(z);
                ir9.b(FscrmidFavorFrameLayout.TAG, sb.toString());
                FscrmidFavorFrameLayout.access$202(FscrmidFavorFrameLayout.this, true);
                FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this).e(FscrmidFavorFrameLayout.access$300(FscrmidFavorFrameLayout.this));
                if (FscrmidFavorFrameLayout.this.getParent() != null) {
                    FscrmidFavorFrameLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f7748a;
        private float b;

        static {
            t2o.a(468713772);
        }

        private b() {
        }

        public static /* synthetic */ float a(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d2b4d96c", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f7748a = f;
            return f;
        }

        public static /* synthetic */ float b(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ab437cb", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this) != null) {
                FscrmidFavorFrameLayout.access$100(FscrmidFavorFrameLayout.this).h(this.f7748a, this.b);
            }
        }

        public /* synthetic */ b(FscrmidFavorFrameLayout fscrmidFavorFrameLayout, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f7749a = 0;
        public int b;
        public int c;
        public int d;
        public float e;
        public int f;
        public Paint g;
        public long h;

        static {
            t2o.a(468713773);
        }
    }

    static {
        t2o.a(468713770);
    }

    public FscrmidFavorFrameLayout(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ ct7 access$100(FscrmidFavorFrameLayout fscrmidFavorFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct7) ipChange.ipc$dispatch("d52bf773", new Object[]{fscrmidFavorFrameLayout});
        }
        return fscrmidFavorFrameLayout.doubleClickListener;
    }

    public static /* synthetic */ boolean access$202(FscrmidFavorFrameLayout fscrmidFavorFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb09fe15", new Object[]{fscrmidFavorFrameLayout, new Boolean(z)})).booleanValue();
        }
        fscrmidFavorFrameLayout.isLongPress = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(FscrmidFavorFrameLayout fscrmidFavorFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5007126", new Object[]{fscrmidFavorFrameLayout})).booleanValue();
        }
        return fscrmidFavorFrameLayout.isScreenEdge;
    }

    private void collectFavor(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281b5810", new Object[]{this, motionEvent});
        } else if (this.list != null) {
            c cVar = new c();
            cVar.e = 1.0f;
            cVar.b = 255;
            cVar.c = (int) motionEvent.getX();
            cVar.d = (int) motionEvent.getY();
            cVar.g = initPaint(cVar.b);
            cVar.f = degrees(DEGREES_MIN, 30);
            cVar.h = System.nanoTime();
            if (this.list.size() == 0) {
                this.start = true;
            }
            if (this.list.size() > 20) {
                this.list.remove(0);
            }
            this.list.add(cVar);
            if (this.start) {
                invalidate();
            }
        }
    }

    private int degrees(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74151101", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    private RangeSeekBar inRangeSeekBar(View view, int i, int i2) {
        int i3;
        int i4;
        RangeSeekBar inRangeSeekBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RangeSeekBar) ipChange.ipc$dispatch("a08b1e59", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null && (i3 = i + scrollX) >= childAt.getLeft() && i3 < childAt.getRight() * childAt.getScaleX() && (i4 = i2 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && (inRangeSeekBar = inRangeSeekBar(childAt, (int) ((i3 - childAt.getLeft()) / childAt.getScaleX()), i4 - childAt.getTop())) != null) {
                    return inRangeSeekBar;
                }
            }
            return null;
        } else if (view instanceof RangeSeekBar) {
            return (RangeSeekBar) view;
        } else {
            return null;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.fluid_sdk_double_click);
        this.bitmap = decodeResource;
        this.bitmapCenterX = decodeResource.getWidth() / 2;
        this.bitmapCenterY = this.bitmap.getHeight() / 2;
    }

    private Paint initPaint(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("478ec8bd", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(i);
        return paint;
    }

    public static /* synthetic */ Object ipc$super(FscrmidFavorFrameLayout fscrmidFavorFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/common/view/FscrmidFavorFrameLayout");
        }
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
            return;
        }
        int x = (int) motionEvent.getX();
        motionEvent.getY();
        int v = s6o.v(getContext());
        int S = s6o.S(getContext(), 180);
        if (x < S || x > v - S) {
            this.isScreenEdge = true;
        } else {
            this.isScreenEdge = false;
        }
        postDelayed(this.mOnLongClickRunnable, ViewConfiguration.getLongPressTimeout());
    }

    private void onLongPressCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4423029", new Object[]{this});
            return;
        }
        ct7 ct7Var = this.doubleClickListener;
        if (ct7Var != null) {
            ct7Var.c();
        }
    }

    private void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        int i = 0;
        while (i < this.list.size()) {
            c cVar = this.list.get(i);
            int i2 = (int) ((nanoTime - cVar.h) / 16000000);
            int i3 = cVar.f7749a + i2;
            cVar.f7749a = i3;
            if (i2 > 0) {
                cVar.h = nanoTime;
            }
            boolean z = this.start;
            if (z || cVar.b != 0) {
                if (z) {
                    this.start = false;
                }
                if (i3 <= 3) {
                    cVar.e += 0.2f;
                    cVar.d -= 10;
                } else if (i3 <= 6) {
                    cVar.e = (float) (cVar.e - 0.2d);
                    cVar.d -= 10;
                } else if (i3 <= 15) {
                    cVar.e = 1.0f;
                    cVar.d -= 10;
                } else {
                    cVar.e = (float) (cVar.e + 0.1d);
                    int i4 = cVar.b - 10;
                    cVar.b = i4;
                    if (i4 < 0) {
                        cVar.b = 0;
                    }
                    cVar.d -= 10;
                }
                cVar.g.setAlpha(cVar.b);
            } else {
                this.list.remove(i);
                i--;
                cVar.g = null;
            }
            i++;
        }
    }

    private MotionEvent transformedEvent(View view, View view2, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEvent) ipChange.ipc$dispatch("c4dde0e0", new Object[]{this, view, view2, motionEvent});
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(i, iArr[1] - iArr2[1]);
        return obtain;
    }

    @Override // com.taobao.android.fluid.common.view.WeexConsumeLayout
    public boolean canInterceptVertical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35c74f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void disableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e90c56", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableTouch = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        if (this.list != null) {
            for (int i = 0; i < this.list.size(); i++) {
                c cVar = this.list.get(i);
                this.matrix.reset();
                Matrix matrix = this.matrix;
                float f = cVar.e;
                matrix.postScale(f, f, cVar.c + this.bitmapCenterX, cVar.d + this.bitmapCenterY);
                this.matrix.postRotate(cVar.f, cVar.c + this.bitmapCenterX, cVar.d + this.bitmapCenterY);
                canvas.save();
                canvas.concat(this.matrix);
                canvas.drawBitmap(this.bitmap, cVar.c - this.bitmapCenterX, cVar.d - this.bitmapCenterY, cVar.g);
                canvas.restore();
            }
            if (!this.list.isEmpty()) {
                refresh();
                invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("albumEvent fscr dispatchTouchEvent isalbum = ");
        if (getId() == R.id.favor_frame) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(";ev=");
        sb.append(motionEvent.getAction());
        ir9.b(TAG, sb.toString());
        if (b93.f()) {
            if (this.mNeedDispatchTouchEventView == null) {
                int childCount = getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = getChildAt(i);
                        if (childAt != null && childAt.getId() == R.id.layout_album_list) {
                            this.mNeedDispatchTouchEventView = (ViewGroup) childAt;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (motionEvent.getAction() == 0) {
                this.mDispatchDownX = motionEvent.getX();
            }
            if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getX() - this.mDispatchDownX) <= this.mTouchSlop) {
                z2 = false;
            } else {
                z2 = true;
            }
            ViewGroup viewGroup = this.mNeedDispatchTouchEventView;
            if (viewGroup != null) {
                boolean dispatchTouchEvent = viewGroup.dispatchTouchEvent(motionEvent);
                StringBuilder sb2 = new StringBuilder("albumEvent fscr dispatchTouchEvent mNeedDispatchTouchEventView isalbum = ");
                int id = getId();
                int i2 = R.id.favor_frame;
                if (id == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sb2.append(z3);
                sb2.append(";result=");
                sb2.append(dispatchTouchEvent);
                sb2.append(";hasMove=");
                sb2.append(z2);
                ir9.b(TAG, sb2.toString());
                if (dispatchTouchEvent && z2) {
                    StringBuilder sb3 = new StringBuilder("albumEvent fscr dispatchTouchEvent isalbum = ");
                    if (getId() == i2) {
                        z4 = true;
                    }
                    sb3.append(z4);
                    sb3.append("; mNeedDispatchTouchEventView isConsumingEvent...");
                    ir9.b(TAG, sb3.toString());
                    removeCallbacks(this.mOnLongClickRunnable);
                    removeCallbacks(this.mOnClickRunnable);
                    clearPendingEvent();
                    onLongPressCancel();
                    this.singleClickTime = 0L;
                }
            }
        }
        if (this.isEnableWeexUponSeekBar) {
            return dispatchTouchEventWeexUponSeekBar(motionEvent);
        }
        return dispatchTouchEventWeexBelowSeekbar(motionEvent);
    }

    public boolean dispatchTouchEventWeexBelowSeekbar(MotionEvent motionEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da627080", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            this.touchInRangeSeekBar = false;
        }
        try {
            z = super.dispatchTouchEvent(motionEvent);
            if (this.touchInRangeSeekBar && motionEvent.getActionMasked() == 0) {
                if (this.rangeSeekBar == null) {
                    this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
                MotionEvent transformedEvent = transformedEvent(this, this.rangeSeekBar, motionEvent);
                this.rangeSeekBar.onInterceptTouchEventProxy(this, transformedEvent);
                this.rangeSeekBar.onTouchEventProxy(this, transformedEvent);
                transformedEvent.recycle();
                return true;
            }
        } catch (Exception e) {
            ir9.c(TAG, "dispatchTouchEvent error", e);
            e.printStackTrace();
        }
        return z;
    }

    public boolean dispatchTouchEventWeexUponSeekBar(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3564bcb", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.rangeSeekBar == null) {
            this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.rangeSeekBar != null && motionEvent.getActionMasked() == 0) {
            this.touchInRangeSeekBar = this.rangeSeekBar.isTouchInRangeSeekBar(motionEvent);
        }
        RangeSeekBar rangeSeekBar = this.rangeSeekBar;
        if (rangeSeekBar == null || !this.touchInRangeSeekBar) {
            return super.dispatchTouchEvent(motionEvent);
        }
        MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
        Pair<Boolean, Boolean> onTouchEventProxyWeexUponSeekBar = this.rangeSeekBar.onTouchEventProxyWeexUponSeekBar(transformedEvent);
        boolean booleanValue = ((Boolean) onTouchEventProxyWeexUponSeekBar.first).booleanValue();
        boolean booleanValue2 = ((Boolean) onTouchEventProxyWeexUponSeekBar.second).booleanValue();
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            touchInRangeSeekBar(false);
        }
        if (!booleanValue) {
            super.dispatchTouchEvent(motionEvent);
        } else if (booleanValue2) {
            removeCallbacks(this.mOnLongClickRunnable);
            removeCallbacks(this.mOnClickRunnable);
            clearPendingEvent();
            onLongPressCancel();
        }
        transformedEvent.recycle();
        return true;
    }

    public boolean isForbidClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94734e55", new Object[]{this})).booleanValue();
        }
        if (this.mediaCardScaled || this.isWebCardPlayingGame) {
            return true;
        }
        return false;
    }

    public boolean isTouchOnWebViewValidArea(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ccb0884", new Object[]{this, motionEvent})).booleanValue();
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof DWPenetrateFrameLayout) {
                return ((DWPenetrateFrameLayout) childAt).isTouchOnValidArea(motionEvent);
            }
            if (childAt instanceof WebPenetrateFrameLayout) {
                return ((WebPenetrateFrameLayout) childAt).isTouchOnValidArea(motionEvent);
            }
        }
        return false;
    }

    public void setBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61407cf6", new Object[]{this, bitmap});
            return;
        }
        this.bitmap = bitmap;
        this.bitmapCenterX = bitmap.getWidth() / 2;
        this.bitmapCenterY = bitmap.getHeight() / 2;
    }

    public void setEnableDoubleEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de67a29", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableDoubleEvent = z;
        }
    }

    public void setEnableFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ccee14", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableFavor = z;
        }
    }

    public void setMediaCardScaled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff058e1", new Object[]{this, new Boolean(z)});
        } else {
            this.mediaCardScaled = z;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else if (onClickListener instanceof ct7) {
            this.doubleClickListener = (ct7) onClickListener;
        }
    }

    public void setWebCardPlayingGame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dfb7cf", new Object[]{this, new Boolean(z)});
        } else {
            this.isWebCardPlayingGame = z;
        }
    }

    public void touchInRangeSeekBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38770b", new Object[]{this, new Boolean(z)});
        } else {
            this.touchInRangeSeekBar = z;
        }
    }

    @Override // com.taobao.android.fluid.common.view.WeexConsumeLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RangeSeekBar rangeSeekBar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("albumEvent fscr onInterceptTouchEvent isalbum = ");
        int id = getId();
        int i = R.id.favor_frame;
        sb.append(id == i);
        sb.append(";event=");
        sb.append(motionEvent.getAction());
        sb.append(";getWeexConsume()=");
        sb.append(getWeexConsume());
        ir9.b(TAG, sb.toString());
        if (!this.isEnableWeexUponSeekBar) {
            if (this.touchInRangeSeekBar && this.rangeSeekBar == null) {
                this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (this.touchInRangeSeekBar && (rangeSeekBar = this.rangeSeekBar) != null) {
                MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
                boolean onInterceptTouchEventProxy = this.rangeSeekBar.onInterceptTouchEventProxy(this, transformedEvent);
                transformedEvent.recycle();
                return onInterceptTouchEventProxy;
            }
        }
        if (this.mDisableTouch) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            StringBuilder sb2 = new StringBuilder("albumEvent fscr onInterceptTouchEvent isalbum = ");
            if (getId() != i) {
                z = false;
            }
            sb2.append(z);
            sb2.append(";result=");
            sb2.append(onInterceptTouchEvent);
            sb2.append(";isEnableWeexUponSeekBar=");
            sb2.append(this.isEnableWeexUponSeekBar);
            ir9.b(TAG, sb2.toString());
            return onInterceptTouchEvent;
        }
        addPendingEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.interceptSingleClickTime < DOUBLE_TAP_TIMEOUT) {
                this.interceptIsDouble = true;
            } else {
                this.interceptIsDouble = false;
            }
            this.interceptSingleClickTime = currentTimeMillis;
        } else if ((action == 1 || action == 3) && sj4.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume()) && !isForbidClick() && !isTouchOnWebViewValidArea(motionEvent)) {
            return onTouchEvent(motionEvent);
        }
        if (this.interceptIsDouble && !isForbidClick() && sj4.WEEX_STATE_NOT_CONSUME.equals(getWeexConsume())) {
            return true;
        }
        boolean onInterceptTouchEvent2 = super.onInterceptTouchEvent(motionEvent);
        StringBuilder sb3 = new StringBuilder("albumEvent fscr onInterceptTouchEvent isalbum = ");
        if (getId() != i) {
            z = false;
        }
        sb3.append(z);
        sb3.append("; result=");
        sb3.append(onInterceptTouchEvent2);
        ir9.b(TAG, sb3.toString());
        return onInterceptTouchEvent2;
    }

    @Override // com.taobao.android.fluid.common.view.WeexConsumeLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RangeSeekBar rangeSeekBar;
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("albumEvent fscr onTouchEvent isalbum = ");
        int id = getId();
        int i = R.id.favor_frame;
        sb.append(id == i);
        sb.append("; mDisableTouch = ");
        sb.append(this.mDisableTouch);
        sb.append("; event：");
        sb.append(motionEvent.getAction());
        ir9.b(TAG, sb.toString());
        if (!this.isEnableWeexUponSeekBar) {
            if (this.touchInRangeSeekBar && this.rangeSeekBar == null) {
                this.rangeSeekBar = inRangeSeekBar(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (this.touchInRangeSeekBar && (rangeSeekBar = this.rangeSeekBar) != null) {
                MotionEvent transformedEvent = transformedEvent(this, rangeSeekBar, motionEvent);
                try {
                    z = this.rangeSeekBar.onTouchEventProxy(this, transformedEvent);
                } catch (Exception e) {
                    ir9.c(TAG, "motionEvent error", e);
                    e.printStackTrace();
                    z = false;
                }
                transformedEvent.recycle();
                StringBuilder sb2 = new StringBuilder("albumEvent fscr onTouchEvent isalbum = ");
                if (getId() != R.id.favor_frame) {
                    z2 = false;
                }
                sb2.append(z2);
                sb2.append(";isMoved：");
                sb2.append(z);
                ir9.b(TAG, sb2.toString());
                return z;
            }
        }
        if (this.mDisableTouch) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isLongPress = false;
            removeCallbacks(this.mOnClickRunnable);
            removeCallbacks(this.mOnLongClickRunnable);
            long currentTimeMillis = System.currentTimeMillis();
            if (!isForbidClick() && this.mEnableDoubleEvent) {
                if (currentTimeMillis - this.singleClickTime < DOUBLE_TAP_TIMEOUT) {
                    if (!this.isDouble && this.doubleClickListener != null && !isTouchOnWebViewValidArea(motionEvent)) {
                        this.doubleClickListener.f(motionEvent.getX(), motionEvent.getY());
                    }
                    if (this.isDouble && this.doubleClickListener != null) {
                        ir9.b(TAG, "tripleClick ---" + motionEvent.getX() + " , " + motionEvent.getY());
                        this.doubleClickListener.g(motionEvent.getX(), motionEvent.getY());
                    }
                    this.isDouble = true;
                    if (this.mEnableFavor) {
                        collectFavor(motionEvent);
                    }
                    requestDisallowInterceptTouchEvent(true);
                } else {
                    this.isDouble = false;
                    if (!this.isEnableWeexUponSeekBar) {
                        longClickOnTouchEvent(motionEvent);
                    } else if (!this.touchInRangeSeekBar) {
                        longClickOnTouchEvent(motionEvent);
                    }
                }
            }
            this.singleClickTime = currentTimeMillis;
        } else if (action == 1) {
            removeCallbacks(this.mOnLongClickRunnable);
            removeCallbacks(this.mOnClickRunnable);
            if (!this.isDouble && !this.isLongPress && !isTouchOnWebViewValidArea(motionEvent)) {
                b.a(this.mOnClickRunnable, motionEvent.getX());
                b.b(this.mOnClickRunnable, motionEvent.getY());
                postDelayed(this.mOnClickRunnable, DOUBLE_TAP_TIMEOUT);
            }
            requestDisallowInterceptTouchEvent(false);
            clearPendingEvent();
            onLongPressCancel();
        } else if (action == 3) {
            removeCallbacks(this.mOnLongClickRunnable);
            requestDisallowInterceptTouchEvent(false);
            clearPendingEvent();
            onLongPressCancel();
        }
        StringBuilder sb3 = new StringBuilder("albumEvent fscr onTouchEvent isalbum = ");
        if (getId() == i) {
            z3 = true;
        }
        sb3.append(z3);
        sb3.append("; return true");
        ir9.b(TAG, sb3.toString());
        return true;
    }

    public FscrmidFavorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}

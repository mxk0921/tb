package com.alibaba.poplayer.factory.view.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.poplayer.norm.IModuleSwitchAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.jd0;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class PenetrateFrame extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_PENETRATE_ALPHA = 204;
    private boolean mBitmapCacheUpdated;
    private Rect mClickableFrame;
    private boolean mEnableClickArea;
    private boolean mInterruptOnlyDownAction;
    private boolean mUseTouchPointBitmap;
    private int mPenetrateAlpha = 204;
    private boolean mUseCacheMark = true;
    private boolean useTouchIntercept = true;
    private Boolean mIsInterceptHover = null;
    private boolean mFindTextureSurfaceViewRectWhenTouch = false;
    private List<WeakReference<View>> mFoundTextureSurfaceViews = new ArrayList();
    private final List<Rect> mClickableAreas = new ArrayList();

    static {
        t2o.a(625999911);
    }

    public PenetrateFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private List<WeakReference<View>> findTextureAndSurfaceView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3685ec99", new Object[]{this, view});
        }
        try {
            if (view == null) {
                return new ArrayList();
            }
            while (true) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    ArrayList arrayList = new ArrayList();
                    internalSelectTextureViewAndSurfaceView(view, arrayList);
                    return arrayList;
                }
                view = (ViewGroup) parent;
            }
        } catch (Throwable th) {
            wdm.h("findTextureAndSurfaceView error", th);
            return new ArrayList();
        }
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        IModuleSwitchAdapter a2 = jd0.c().a();
        if (a2 != null) {
            this.mInterruptOnlyDownAction = a2.interruptDownAction();
        }
    }

    public static /* synthetic */ Object ipc$super(PenetrateFrame penetrateFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -446122783) {
            return new Boolean(super.onInterceptHoverEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/poplayer/factory/view/base/PenetrateFrame");
    }

    private boolean isInterceptHover() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47bc9bef", new Object[]{this})).booleanValue();
        }
        if (this.mIsInterceptHover == null) {
            if (jd0.c().a() != null && jd0.c().a().isInterceptHover()) {
                z = true;
            }
            this.mIsInterceptHover = Boolean.valueOf(z);
        }
        return this.mIsInterceptHover.booleanValue();
    }

    public void addClickableArea(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b67204", new Object[]{this, rect});
        } else if (rect != null) {
            this.mClickableAreas.add(rect);
        }
    }

    public void clearClickableInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05ee86a", new Object[]{this});
            return;
        }
        this.mClickableFrame = null;
        this.mClickableAreas.clear();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            this.mBitmapCacheUpdated = true;
        } catch (Throwable th) {
            wdm.h("PenetrateFrame.dispatchDraw.error", th);
        }
    }

    public Pair<Bitmap, Float> getScaleSnapshotBitMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("280b7c78", new Object[]{this});
        }
        return new Pair<>(getDrawingCache(), Float.valueOf(1.0f));
    }

    public Bitmap getTouchPointBitMap(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("47d347fb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void setClickableAreaFrame(ClickableAreaParam clickableAreaParam) {
        char c;
        char c2 = 65535;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803816f5", new Object[]{this, clickableAreaParam});
        } else if (clickableAreaParam != null) {
            int width = getWidth();
            int height = getHeight();
            if (clickableAreaParam.isValid() && width > 0 && height > 0) {
                Rect rect = new Rect();
                String str = clickableAreaParam.layoutX;
                str.hashCode();
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        if (str.equals("right")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        rect.left = ((width - clickableAreaParam.width) / 2) + clickableAreaParam.left;
                        break;
                    case 1:
                        rect.left = clickableAreaParam.left;
                        break;
                    case 2:
                        rect.left = (width - clickableAreaParam.width) - clickableAreaParam.right;
                        break;
                }
                String str2 = clickableAreaParam.layoutY;
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1383228885:
                        if (str2.equals("bottom")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str2.equals("center")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 115029:
                        if (str2.equals("top")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        rect.top = (height - clickableAreaParam.height) - clickableAreaParam.bottom;
                        break;
                    case 1:
                        rect.top = ((height - clickableAreaParam.height) / 2) + clickableAreaParam.top;
                        break;
                    case 2:
                        rect.top = clickableAreaParam.top;
                        break;
                }
                rect.right = rect.left + clickableAreaParam.width;
                rect.bottom = rect.top + clickableAreaParam.height;
                this.mClickableFrame = rect;
            }
        }
    }

    public void setEnableClickArea(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e586cdfd", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableClickArea = z;
        }
    }

    public void setFindTextureSurfaceViewRectWhenTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5eaaa3e", new Object[]{this, new Boolean(z)});
        } else {
            this.mFindTextureSurfaceViewRectWhenTouch = z;
        }
    }

    public void setUseCacheMark(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656b2043", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseCacheMark = z;
        }
    }

    public void setUseTouchIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba65ac5", new Object[]{this, new Boolean(z)});
        } else {
            this.useTouchIntercept = z;
        }
    }

    public void setUseTouchPointBitmap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9aca048", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseTouchPointBitmap = z;
        }
    }

    public void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (!this.mUseCacheMark || this.mBitmapCacheUpdated) {
            destroyDrawingCache();
            buildDrawingCache();
            this.mBitmapCacheUpdated = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e568b4e1", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (isInterceptHover() && this.useTouchIntercept) {
                return onInterceptEvent(motionEvent, 9);
            }
            return super.onInterceptHoverEvent(motionEvent);
        } catch (Throwable th) {
            wdm.h("PenetrateFrame.onInterceptHoverEvent.error", th);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:6:0x0025, B:8:0x002b, B:10:0x002f, B:15:0x0038, B:16:0x003e, B:18:0x0046, B:19:0x004c, B:21:0x0052, B:23:0x0063), top: B:29:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean determineMotionOnTextureSurfaceViews(android.view.MotionEvent r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.poplayer.factory.view.base.PenetrateFrame.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0025
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r5
            r7[r0] = r6
            r6 = 2
            r7[r6] = r3
            java.lang.String r6 = "ed0ee477"
            java.lang.Object r6 = r2.ipc$dispatch(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0025:
            int r2 = r6.getAction()     // Catch: all -> 0x0036
            if (r2 == r7) goto L_0x0038
            java.util.List<java.lang.ref.WeakReference<android.view.View>> r7 = r5.mFoundTextureSurfaceViews     // Catch: all -> 0x0036
            if (r7 == 0) goto L_0x0038
            boolean r7 = r7.isEmpty()     // Catch: all -> 0x0036
            if (r7 == 0) goto L_0x003e
            goto L_0x0038
        L_0x0036:
            r6 = move-exception
            goto L_0x007e
        L_0x0038:
            java.util.List r7 = r5.findTextureAndSurfaceView(r5)     // Catch: all -> 0x0036
            r5.mFoundTextureSurfaceViews = r7     // Catch: all -> 0x0036
        L_0x003e:
            java.util.List<java.lang.ref.WeakReference<android.view.View>> r7 = r5.mFoundTextureSurfaceViews     // Catch: all -> 0x0036
            boolean r7 = r7.isEmpty()     // Catch: all -> 0x0036
            if (r7 != 0) goto L_0x007d
            java.util.List<java.lang.ref.WeakReference<android.view.View>> r7 = r5.mFoundTextureSurfaceViews     // Catch: all -> 0x0036
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x0036
        L_0x004c:
            boolean r2 = r7.hasNext()     // Catch: all -> 0x0036
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r7.next()     // Catch: all -> 0x0036
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: all -> 0x0036
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: all -> 0x0036
            r3.<init>()     // Catch: all -> 0x0036
            java.lang.Object r4 = r2.get()     // Catch: all -> 0x0036
            if (r4 == 0) goto L_0x004c
            java.lang.Object r2 = r2.get()     // Catch: all -> 0x0036
            android.view.View r2 = (android.view.View) r2     // Catch: all -> 0x0036
            r2.getGlobalVisibleRect(r3)     // Catch: all -> 0x0036
            float r2 = r6.getRawX()     // Catch: all -> 0x0036
            int r2 = (int) r2     // Catch: all -> 0x0036
            float r4 = r6.getRawY()     // Catch: all -> 0x0036
            int r4 = (int) r4     // Catch: all -> 0x0036
            boolean r2 = r3.contains(r2, r4)     // Catch: all -> 0x0036
            if (r2 == 0) goto L_0x004c
            return r1
        L_0x007d:
            return r0
        L_0x007e:
            java.lang.String r7 = "determineTouchActingOnTextureSurfaceViews error"
            tb.wdm.h(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.factory.view.base.PenetrateFrame.determineMotionOnTextureSurfaceViews(android.view.MotionEvent, int):boolean");
    }

    private void internalSelectTextureViewAndSurfaceView(View view, List<WeakReference<View>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc01309a", new Object[]{this, view, list});
            return;
        }
        if (list == null) {
            try {
                list = new ArrayList<>();
            } catch (Throwable th) {
                wdm.h("internalSelectTextureViewAndSurfaceView error", th);
                return;
            }
        }
        if (!(view instanceof TextureView) && !(view instanceof SurfaceView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    internalSelectTextureViewAndSurfaceView(viewGroup.getChildAt(i), list);
                }
                return;
            }
            return;
        }
        list.add(new WeakReference<>(view));
    }

    private boolean onInterceptEvent(MotionEvent motionEvent, int i) {
        int i2;
        Object obj;
        Rect rect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1515114", new Object[]{this, motionEvent, new Integer(i)})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (!this.mInterruptOnlyDownAction || action == 0 || action == 9) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < 0 || y < 0 || (this.mEnableClickArea && (rect = this.mClickableFrame) != null && !rect.contains(x, y))) {
                return true;
            }
            if (!this.mClickableAreas.isEmpty()) {
                for (Rect rect2 : this.mClickableAreas) {
                    if (rect2.contains(x, y)) {
                        return false;
                    }
                }
            }
            int i3 = this.mPenetrateAlpha;
            if (255 == i3) {
                return false;
            }
            if (i3 == 0) {
                return true;
            }
            wdm.d("onInterceptEvent.mUseTouchPointBitmap=%s", Boolean.valueOf(this.mUseTouchPointBitmap));
            if (this.mUseTouchPointBitmap) {
                Bitmap touchPointBitMap = getTouchPointBitMap(x, y);
                if (touchPointBitMap == null) {
                    wdm.d("onInterceptEvent.touchPointBitMap=null", new Object[0]);
                    return true;
                }
                i2 = touchPointBitMap.getPixel(0, 0);
                touchPointBitMap.recycle();
            } else {
                if (i == action) {
                    updateBitmapCacheIfNeed();
                }
                Pair<Bitmap, Float> scaleSnapshotBitMap = getScaleSnapshotBitMap();
                if (scaleSnapshotBitMap == null || (obj = scaleSnapshotBitMap.first) == null) {
                    wdm.d("onInterceptEvent.snapshotBitMap=null", new Object[0]);
                    return true;
                }
                Bitmap bitmap = (Bitmap) obj;
                float floatValue = ((Float) scaleSnapshotBitMap.second).floatValue();
                int i4 = (int) (x * floatValue);
                int i5 = (int) (y * floatValue);
                if (i4 > bitmap.getWidth() || i5 > bitmap.getHeight()) {
                    return true;
                }
                i2 = bitmap.getPixel(i4, i5);
            }
            if (255 - Color.alpha(i2) <= this.mPenetrateAlpha) {
                return false;
            }
            if (this.mFindTextureSurfaceViewRectWhenTouch) {
                return determineMotionOnTextureSurfaceViews(motionEvent, i);
            }
            return true;
        }
        wdm.d("onInterceptEvent.interruptOnlyDownAction.action=", MotionEvent.actionToString(action));
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (!this.useTouchIntercept) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return onInterceptEvent(motionEvent, 0);
        } catch (Throwable th) {
            wdm.h("PenetrateFrame.onInterceptTouchEvent.error", th);
            return true;
        }
    }

    public final void setPenetrateAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8583384", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = 255;
        if (i <= 255) {
            i2 = Math.max(i, 0);
        }
        this.mPenetrateAlpha = i2;
        wdm.d("PenetrateFrame.setPenetrateAlpha.penetrateAlpha{%s}", Integer.valueOf(i2));
    }

    public PenetrateFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public PenetrateFrame(Context context) {
        super(context);
        initialize(context);
    }
}

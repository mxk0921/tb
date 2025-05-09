package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import tb.cwd;
import tb.t2o;
import tb.tws;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DWPenetrateFrameLayout extends FrameLayout implements IInteractiveProxy.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Integer lastAlpha;
    private boolean mBitmapCacheUpdated;
    private boolean mForceBitmapCacheUpdated;
    private boolean mUseTempBitmap;
    private static final String TAG = DWPenetrateFrameLayout.class.getSimpleName();
    private static int DEFAULT_PENETRATE_ALPHA = 200;
    private int mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
    private boolean hasShowingComponent = false;

    static {
        t2o.a(295699959);
        t2o.a(806355274);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    public static int getAlphaAt(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b029ce3", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        this.mUseTempBitmap = tws.j();
    }

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/DWPenetrateFrameLayout");
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (tws.i()) {
        } else {
            if (this.mBitmapCacheUpdated || this.mForceBitmapCacheUpdated) {
                destroyDrawingCache();
                buildDrawingCache();
                this.mBitmapCacheUpdated = false;
            }
        }
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
            if (v2s.o().A() != null) {
                v2s.o().A().c("PenetrateFrame.dispatchDraw.error", th.getLocalizedMessage());
            }
        }
    }

    public final int getPenetrateAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec322946", new Object[]{this})).intValue();
        }
        return this.mPenetrateAlpha;
    }

    public Bitmap getViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f535cd5f", new Object[]{this, view});
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.DWPenetrateFrameLayout.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "e7b587fe"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            int r2 = r7.mPenetrateAlpha     // Catch: all -> 0x004c
            r3 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x00aa
            boolean r4 = r7.hasShowingComponent     // Catch: all -> 0x004c
            if (r4 == 0) goto L_0x0028
            goto L_0x00aa
        L_0x0028:
            if (r2 != 0) goto L_0x002b
            return r0
        L_0x002b:
            float r2 = r8.getX()     // Catch: all -> 0x004c
            int r2 = (int) r2     // Catch: all -> 0x004c
            float r4 = r8.getY()     // Catch: all -> 0x004c
            int r4 = (int) r4     // Catch: all -> 0x004c
            if (r2 < 0) goto L_0x00a9
            if (r4 >= 0) goto L_0x003b
            goto L_0x00a9
        L_0x003b:
            boolean r5 = tb.tws.k()     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x004e
            java.lang.Integer r5 = r7.lastAlpha     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x004e
            int r5 = r8.getAction()     // Catch: all -> 0x004c
            if (r5 != 0) goto L_0x009d
            goto L_0x004e
        L_0x004c:
            r8 = move-exception
            goto L_0x00ab
        L_0x004e:
            boolean r5 = tb.tws.i()     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x0060
            int r8 = getAlphaAt(r7, r2, r4)     // Catch: all -> 0x004c
            int r3 = r3 - r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x004c
            r7.lastAlpha = r8     // Catch: all -> 0x004c
            goto L_0x009d
        L_0x0060:
            int r8 = r8.getAction()     // Catch: all -> 0x004c
            if (r8 != 0) goto L_0x0069
            r7.updateBitmapCacheIfNeed()     // Catch: all -> 0x004c
        L_0x0069:
            android.graphics.Bitmap r8 = r7.getDrawingCache()     // Catch: all -> 0x004c
            if (r8 != 0) goto L_0x0079
            boolean r5 = r7.mUseTempBitmap     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x0079
            android.graphics.Bitmap r8 = r7.getViewBitmap(r7)     // Catch: all -> 0x004c
            r5 = r8
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            if (r8 == 0) goto L_0x00a9
            int r6 = r8.getWidth()     // Catch: all -> 0x004c
            if (r2 > r6) goto L_0x00a9
            int r6 = r8.getHeight()     // Catch: all -> 0x004c
            if (r4 <= r6) goto L_0x0089
            goto L_0x00a9
        L_0x0089:
            int r8 = r8.getPixel(r2, r4)     // Catch: all -> 0x004c
            if (r5 == 0) goto L_0x0092
            r5.recycle()     // Catch: all -> 0x004c
        L_0x0092:
            int r8 = android.graphics.Color.alpha(r8)     // Catch: all -> 0x004c
            int r3 = r3 - r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: all -> 0x004c
            r7.lastAlpha = r8     // Catch: all -> 0x004c
        L_0x009d:
            java.lang.Integer r8 = r7.lastAlpha     // Catch: all -> 0x004c
            int r8 = r8.intValue()     // Catch: all -> 0x004c
            int r2 = r7.mPenetrateAlpha     // Catch: all -> 0x004c
            if (r8 <= r2) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            return r0
        L_0x00aa:
            return r1
        L_0x00ab:
            tb.v2s r1 = tb.v2s.o()
            tb.cwd r1 = r1.A()
            if (r1 == 0) goto L_0x00c6
            tb.v2s r1 = tb.v2s.o()
            tb.cwd r1 = r1.A()
            java.lang.String r2 = "PenetrateFrame.onInterceptTouchEvent.error"
            java.lang.String r8 = r8.getLocalizedMessage()
            r1.c(r2, r8)
        L_0x00c6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.DWPenetrateFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHasShowingComponent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c420a37d", new Object[]{this, new Boolean(z)});
        } else {
            this.hasShowingComponent = z;
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.c
    public final void setPenetrateAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8583384", new Object[]{this, new Integer(i)});
            return;
        }
        if (i > 255) {
            i = 255;
        } else if (i < 0) {
            i = 0;
        }
        this.mPenetrateAlpha = i;
        cwd A = v2s.o().A();
        A.c("PenetrateFrame.setPenetrateAlpha.penetrateAlpha{%s}", this.mPenetrateAlpha + "");
    }

    public void updateDrawingCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2005e0", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceBitmapCacheUpdated = z;
        }
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context) {
        super(context);
        initialize(context);
    }
}

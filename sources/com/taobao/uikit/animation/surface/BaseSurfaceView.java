package com.taobao.uikit.animation.surface;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BaseSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FRAME_DURATION_MILLISECOND = 16;
    private static final String TAG = "uikit_animation.BaseSurfaceView";
    private boolean mIsAlive;
    public Handler mRenderHandler = new Handler(Coordinator.getWorkerLooper());
    public int mFrameDuration = 16;
    private long mLastFrameTime = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class DrawRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(929038348);
        }

        private DrawRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!BaseSurfaceView.this.shouldRender()) {
                TLog.loge(BaseSurfaceView.TAG, "run: should not render");
            } else if (!BaseSurfaceView.access$200(BaseSurfaceView.this)) {
                TLog.loge(BaseSurfaceView.TAG, "run: should not render");
            } else {
                BaseSurfaceView.this.drawOneFrameSync(new OneFrameRunnable() { // from class: com.taobao.uikit.animation.surface.BaseSurfaceView.DrawRunnable.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/animation/surface/BaseSurfaceView$DrawRunnable$1");
                    }

                    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView.OneFrameRunnable
                    public void onFrameDraw(Canvas canvas) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5747a6cc", new Object[]{this, canvas});
                        } else {
                            BaseSurfaceView.this.onFrameDraw(canvas);
                        }
                    }

                    @Override // com.taobao.uikit.animation.surface.BaseSurfaceView.OneFrameRunnable
                    public void onFrameDrawFinish() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e3b71e6c", new Object[]{this});
                        } else {
                            BaseSurfaceView.this.onFrameDrawFinish();
                        }
                    }
                });
                BaseSurfaceView.this.nextLoop(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class OneFrameRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(929038350);
        }

        public void onFrameDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5747a6cc", new Object[]{this, canvas});
            }
        }

        public void onFrameDrawFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3b71e6c", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(929038345);
    }

    public BaseSurfaceView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ void access$100(BaseSurfaceView baseSurfaceView, OneFrameRunnable oneFrameRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde504fa", new Object[]{baseSurfaceView, oneFrameRunnable});
        } else {
            baseSurfaceView.drawOneFrameInner(oneFrameRunnable);
        }
    }

    public static /* synthetic */ boolean access$200(BaseSurfaceView baseSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40588278", new Object[]{baseSurfaceView})).booleanValue();
        }
        return baseSurfaceView.mIsAlive;
    }

    private void drawOneFrameInner(OneFrameRunnable oneFrameRunnable) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7c9fb", new Object[]{this, oneFrameRunnable});
            return;
        }
        Canvas canvas = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas = getHolder().lockHardwareCanvas();
                } else {
                    canvas = getHolder().lockCanvas();
                }
                oneFrameRunnable.onFrameDraw(canvas);
                if (canvas != null) {
                    try {
                        getHolder().unlockCanvasAndPost(canvas);
                    } catch (Throwable th2) {
                        th = th2;
                        TLog.loge(TAG, "drawOneFrameInner error: ", th);
                        oneFrameRunnable.onFrameDrawFinish();
                    }
                }
            } catch (Exception e) {
                TLog.loge(TAG, "run: " + e.getMessage());
                if (canvas != null) {
                    try {
                        getHolder().unlockCanvasAndPost(canvas);
                    } catch (Throwable th3) {
                        th = th3;
                        TLog.loge(TAG, "drawOneFrameInner error: ", th);
                        oneFrameRunnable.onFrameDrawFinish();
                    }
                }
            }
            oneFrameRunnable.onFrameDrawFinish();
        } catch (Throwable th4) {
            if (canvas != null) {
                try {
                    getHolder().unlockCanvasAndPost(canvas);
                } catch (Throwable th5) {
                    TLog.loge(TAG, "drawOneFrameInner error: ", th5);
                }
            }
            oneFrameRunnable.onFrameDrawFinish();
            throw th4;
        }
    }

    public static /* synthetic */ Object ipc$super(BaseSurfaceView baseSurfaceView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/animation/surface/BaseSurfaceView");
    }

    private void setBackgroundTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16c7f89", new Object[]{this});
            return;
        }
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
    }

    public void doAtRenderThreadQuickly(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34cc361", new Object[]{this, runnable});
        } else {
            this.mRenderHandler.postAtFrontOfQueue(runnable);
        }
    }

    public void drawFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21447508", new Object[]{this});
        } else {
            this.mRenderHandler.post(new DrawRunnable());
        }
    }

    public void drawOneFrameAsync(final OneFrameRunnable oneFrameRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67659095", new Object[]{this, oneFrameRunnable});
        } else {
            this.mRenderHandler.post(new Runnable() { // from class: com.taobao.uikit.animation.surface.BaseSurfaceView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseSurfaceView.access$100(BaseSurfaceView.this, oneFrameRunnable);
                    }
                }
            });
        }
    }

    public void drawOneFrameSync(OneFrameRunnable oneFrameRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ad8020", new Object[]{this, oneFrameRunnable});
        } else {
            drawOneFrameInner(oneFrameRunnable);
        }
    }

    public abstract int getDefaultHeight();

    public abstract int getDefaultWidth();

    public int getFrameDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d177b165", new Object[]{this})).intValue();
        }
        return this.mFrameDuration;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        getHolder().addCallback(this);
        setBackgroundTransparent();
        TLog.loge(TAG, "init: " + this);
    }

    public void nextLoop(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58b84bc", new Object[]{this, runnable});
            return;
        }
        TLog.loge(TAG, "startLoop: ");
        if (runnable == null) {
            runnable = new DrawRunnable();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Choreographer.getInstance().postVsyncCallback(new Choreographer.VsyncCallback() { // from class: com.taobao.uikit.animation.surface.BaseSurfaceView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onVsync(Choreographer.FrameData frameData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a3f2a16", new Object[]{this, frameData});
                    } else {
                        BaseSurfaceView.this.mRenderHandler.post(runnable);
                    }
                }
            });
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long frameDuration = (getFrameDuration() - uptimeMillis) + this.mLastFrameTime;
        if (frameDuration < 0) {
            frameDuration = 0;
        }
        TLog.loge(TAG, "startLoop: " + frameDuration);
        this.mRenderHandler.postDelayed(runnable, frameDuration);
        this.mLastFrameTime = uptimeMillis;
    }

    public abstract void onFrameDraw(Canvas canvas);

    public abstract void onFrameDrawFinish();

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            measuredWidth = getDefaultWidth();
        }
        if (mode2 == Integer.MIN_VALUE) {
            measuredHeight = getDefaultHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public void setRenderFramePerSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52826120", new Object[]{this, new Integer(i)});
        } else {
            this.mFrameDuration = 1000 / i;
        }
    }

    public boolean shouldRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ece9b934", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        this.mIsAlive = true;
        TLog.loge(TAG, "surfaceCreated: " + this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        this.mIsAlive = false;
        TLog.loge(TAG, "surfaceDestroyed: " + this);
    }

    public BaseSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public BaseSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

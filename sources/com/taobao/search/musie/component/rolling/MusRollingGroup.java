package com.taobao.search.musie.component.rolling;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.component.rolling.MusRollingGroup;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MusRollingGroup extends UINodeGroup implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_ANIM_DURATION = "animDuration";
    private static final String ATTR_ROLLING_INTERVAL = "rollingInterval";
    private static final long DEFAULT_ANIMATION_DURATION = 500;
    private static final long DEFAULT_ROLLING_INTERVAL = 2000;
    private static final String NATIVE_STATE_VIDEO = "videostatus";
    private static final String NATIVE_STATE_VISIBILITY = "visibility";
    private static final String VIDEO_STATUS_PLAY = "play";
    private static final String VIDEO_STATUS_STOP = "stop";
    private Paint bottomFadingEdgePaint;
    private int currentIndex;
    private int currentOffset;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean rolling;
    private ValueAnimator rollingAnimator;
    private Paint topFadingEdgePaint;
    public static final a Companion = new a(null);
    private static final float FADING_EDGE_WIDTH = o1p.a(10.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792702);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/rolling/MusRollingGroup$startRolling$1$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                MusRollingGroup.access$startRolling(MusRollingGroup.this);
            }
        }
    }

    static {
        t2o.a(815792701);
        t2o.a(982516018);
    }

    public MusRollingGroup(int i) {
        super(i);
        Paint paint = new Paint();
        float f = FADING_EDGE_WIDTH;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, -1, 0, tileMode));
        this.topFadingEdgePaint = paint;
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, 0, -1, tileMode));
        this.bottomFadingEdgePaint = paint2;
    }

    public static final /* synthetic */ void access$startRolling(MusRollingGroup musRollingGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc25a0a", new Object[]{musRollingGroup});
        } else {
            musRollingGroup.startRolling();
        }
    }

    private final void drawFadingEdge(MUSNodeHost mUSNodeHost, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df8dac7", new Object[]{this, mUSNodeHost, canvas});
        } else if (this.currentOffset > 0) {
            float f = FADING_EDGE_WIDTH;
            canvas.drawRect(0.0f, 0.0f, getLayoutWidth(), f, this.topFadingEdgePaint);
            canvas.save();
            canvas.translate(0.0f, getLayoutHeight() - f);
            canvas.drawRect(0.0f, 0.0f, getLayoutWidth(), f, this.bottomFadingEdgePaint);
            canvas.restore();
        }
    }

    private final void drawRollingItem(MUSNodeHost mUSNodeHost, Canvas canvas) {
        MusRollingItem musRollingItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8246056d", new Object[]{this, mUSNodeHost, canvas});
            return;
        }
        UINode childAt = getChildAt(this.currentIndex);
        int layoutHeight = childAt.getLayoutHeight();
        int layoutHeight2 = getLayoutHeight();
        canvas.save();
        canvas.translate(0.0f, (layoutHeight2 - layoutHeight) / 2.0f);
        canvas.save();
        canvas.translate(0.0f, this.currentOffset);
        childAt.draw(mUSNodeHost, canvas, 0, 0, false, getOpacity());
        MusRollingItem musRollingItem2 = null;
        if (childAt instanceof MusRollingItem) {
            musRollingItem = (MusRollingItem) childAt;
        } else {
            musRollingItem = null;
        }
        if (musRollingItem != null) {
            musRollingItem.appear();
        }
        canvas.restore();
        if (this.currentOffset > 0) {
            UINode childAt2 = getChildAt(((this.currentIndex - 1) + getChildCount()) % getChildCount());
            canvas.save();
            canvas.translate(0.0f, (-layoutHeight) + this.currentOffset);
            childAt2.draw(mUSNodeHost, canvas, 0, 0, false, getOpacity());
            if (childAt2 instanceof MusRollingItem) {
                musRollingItem2 = (MusRollingItem) childAt2;
            }
            if (musRollingItem2 != null) {
                musRollingItem2.disappear();
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public static /* synthetic */ Object ipc$super(MusRollingGroup musRollingGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/component/rolling/MusRollingGroup");
        }
    }

    private final void startRolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4af768a", new Object[]{this});
            return;
        }
        final int childCount = getChildCount();
        if (this.rolling && childCount != 0) {
            Handler handler = this.handler;
            Runnable zfzVar = new Runnable() { // from class: tb.zfz
                @Override // java.lang.Runnable
                public final void run() {
                    MusRollingGroup.startRolling$lambda$4(MusRollingGroup.this, childCount);
                }
            };
            Long l = (Long) getAttribute(ATTR_ROLLING_INTERVAL);
            handler.postDelayed(zfzVar, l != null ? l.longValue() : 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRolling$lambda$4$lambda$3$lambda$2(MusRollingGroup musRollingGroup, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2a067e", new Object[]{musRollingGroup, valueAnimator});
            return;
        }
        ckf.g(musRollingGroup, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        musRollingGroup.currentOffset = ((Integer) animatedValue).intValue();
        musRollingGroup.invalidate();
    }

    private final void stopRolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef73aeea", new Object[]{this});
        } else {
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        ckf.g(canvas, "canvas");
        if (getChildCount() != 0) {
            drawRollingItem(mUSNodeHost, canvas);
            drawFadingEdge(mUSNodeHost, canvas);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.LAYOUT;
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        registerNativeStateListener("videostatus", this);
        registerNativeStateListener("visibility", this);
        boolean b2 = ckf.b(getNativeState("videostatus"), "play");
        this.rolling = b2;
        if (b2) {
            startRolling();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        stopRolling();
        unregisterNativeStateListener("videostatus", this);
        unregisterNativeStateListener("visibility", this);
        ValueAnimator valueAnimator = this.rollingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @MUSNodeProp(name = ATTR_ANIM_DURATION)
    public final void setAnimDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76e3375", new Object[]{this, new Integer(i)});
        } else {
            setAttribute(ATTR_ANIM_DURATION, Long.valueOf(i));
        }
    }

    @MUSNodeProp(name = ATTR_ROLLING_INTERVAL)
    public final void setRollingInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a5196f4", new Object[]{this, new Integer(i)});
        } else {
            setAttribute(ATTR_ROLLING_INTERVAL, Long.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRolling$lambda$4(final MusRollingGroup musRollingGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9033a60e", new Object[]{musRollingGroup, new Integer(i)});
            return;
        }
        ckf.g(musRollingGroup, "this$0");
        int i2 = ((musRollingGroup.currentIndex + i) + 1) % i;
        musRollingGroup.currentIndex = i2;
        int layoutHeight = musRollingGroup.getChildAt(i2).getLayoutHeight();
        musRollingGroup.currentOffset = layoutHeight;
        ValueAnimator ofInt = ValueAnimator.ofInt(layoutHeight, 0);
        Long l = (Long) musRollingGroup.getAttribute(ATTR_ANIM_DURATION);
        ofInt.setDuration(l != null ? l.longValue() : 500L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.agz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusRollingGroup.startRolling$lambda$4$lambda$3$lambda$2(MusRollingGroup.this, valueAnimator);
            }
        });
        ofInt.addListener(new b());
        ofInt.start();
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (ckf.b(str, "videostatus")) {
            if (ckf.b(str2, "play")) {
                this.rolling = true;
                startRolling();
                return;
            }
            this.rolling = false;
            stopRolling();
        } else if (ckf.b(str, "visibility") && ckf.b(str2, "disappear")) {
            this.currentOffset = 0;
            this.currentIndex = 0;
            this.rolling = false;
            ValueAnimator valueAnimator = this.rollingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }
}

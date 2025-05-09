package com.taobao.pexode.decoder;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;
import tb.ey0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GifFrame implements ey0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mFrameNumber;
    private long mNativeContext;

    static {
        t2o.a(618659867);
        t2o.a(618659856);
    }

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    private static AnimatedDrawableFrameInfo.DisposalMode fromGifDisposalMethod(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatedDrawableFrameInfo.DisposalMode) ipChange.ipc$dispatch("58ea33da", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS;
        }
        return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    @Override // tb.ey0
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            nativeDispose();
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            nativeFinalize();
        }
    }

    public int getDisposalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4135ce4", new Object[]{this})).intValue();
        }
        return nativeGetDisposalMode();
    }

    public int getDurationMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d397d6ca", new Object[]{this})).intValue();
        }
        return nativeGetDurationMs();
    }

    @Override // tb.ey0
    public AnimatedDrawableFrameInfo getFrameInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatedDrawableFrameInfo) ipChange.ipc$dispatch("a6e84b80", new Object[]{this});
        }
        return new AnimatedDrawableFrameInfo(this.mFrameNumber, getXOffset(), getYOffset(), getWidth(), getHeight(), AnimatedDrawableFrameInfo.BlendMode.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(getDisposalMode()));
    }

    @Override // tb.ey0
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return nativeGetHeight();
    }

    @Override // tb.ey0
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return nativeGetWidth();
    }

    @Override // tb.ey0
    public int getXOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4ee54ef", new Object[]{this})).intValue();
        }
        return nativeGetXOffset();
    }

    @Override // tb.ey0
    public int getYOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89d307b0", new Object[]{this})).intValue();
        }
        return nativeGetYOffset();
    }

    public boolean hasTransparency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f350c69d", new Object[]{this})).booleanValue();
        }
        return nativeHasTransparency();
    }

    @Override // tb.ey0
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12d090", new Object[]{this, new Integer(i), new Integer(i2), bitmap});
        } else {
            nativeRenderFrame(i, i2, bitmap);
        }
    }

    public void setFrameNumber(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8210e88", new Object[]{this, new Integer(i)});
        } else {
            this.mFrameNumber = i;
        }
    }
}

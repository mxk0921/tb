package com.uc.webview.export.extension;

import android.view.Surface;
import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class IEmbedViewContainer implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class EmbedViewContainerWrapper extends IEmbedViewContainer {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnParamChangedListener {
        void onParamChanged(String[] strArr, String[] strArr2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnStateChangedListener {
        void onAttachedToWebView();

        void onDestroy();

        void onDetachedFromWebView();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnVisibilityChangedListener {
        void onVisibilityChanged(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface SurfaceListener {
        void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback);

        boolean onSurfaceDestroyed(Surface surface);

        void onSurfaceSizeChanged(Surface surface, int i, int i2);
    }

    public abstract void changeViewSize(int i, int i2);

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public abstract void notifyEnterFullScreen();

    public abstract void notifyExitFullScreen();

    public abstract void sendViewData(String str);

    public abstract void setOnParamChangedListener(OnParamChangedListener onParamChangedListener);

    public abstract void setOnStateChangedListener(OnStateChangedListener onStateChangedListener);

    public abstract void setOnVisibilityChangedListener(OnVisibilityChangedListener onVisibilityChangedListener);

    public abstract void setPosterUrl(String str);

    public abstract void setSurfaceListener(SurfaceListener surfaceListener);
}

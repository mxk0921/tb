package com.taobao.android.fcanvas.integration;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FCanvasNativeInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FCanvasJNIBridge mJNIBridge;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface ImageLoadCallback {
        void onLoadComplete(String str, Bitmap bitmap, boolean z);
    }

    static {
        t2o.a(945815567);
    }

    public FCanvasNativeInterface(FCanvasJNIBridge fCanvasJNIBridge) {
        this.mJNIBridge = fCanvasJNIBridge;
    }

    public void createOffScreenCanvas(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723e3afb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            FCanvasJNIBridge.nCreateNativeFCanvas(str, i, i2, i3, true);
        }
    }

    public void createOnScreenCanvas(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8f1ad3", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            FCanvasJNIBridge.nCreateNativeFCanvas(str, i, i2, i3, false);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.mJNIBridge;
        if (fCanvasJNIBridge != null) {
            fCanvasJNIBridge.pause();
        }
    }

    public void resizeCanvas(String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb57afd", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            FCanvasJNIBridge.nResizeFCanvas(str, i, i2, i3, i4);
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.mJNIBridge;
        if (fCanvasJNIBridge != null) {
            fCanvasJNIBridge.resume();
        }
    }
}

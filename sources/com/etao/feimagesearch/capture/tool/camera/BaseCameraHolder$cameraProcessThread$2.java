package com.etao.feimagesearch.capture.tool.camera;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseCameraHolder$cameraProcessThread$2 extends Lambda implements d1a<HandlerThread> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BaseCameraHolder$cameraProcessThread$2 INSTANCE = new BaseCameraHolder$cameraProcessThread$2();

    public BaseCameraHolder$cameraProcessThread$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(BaseCameraHolder$cameraProcessThread$2 baseCameraHolder$cameraProcessThread$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/BaseCameraHolder$cameraProcessThread$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final HandlerThread invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("7fab257d", new Object[]{this});
        }
        HandlerThread handlerThread = new HandlerThread("PltCameraFrame");
        handlerThread.start();
        return handlerThread;
    }
}

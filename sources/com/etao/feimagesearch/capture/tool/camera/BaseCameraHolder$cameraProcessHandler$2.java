package com.etao.feimagesearch.capture.tool.camera;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseCameraHolder$cameraProcessHandler$2 extends Lambda implements d1a<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BaseCameraHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCameraHolder$cameraProcessHandler$2(BaseCameraHolder baseCameraHolder) {
        super(0);
        this.this$0 = baseCameraHolder;
    }

    public static /* synthetic */ Object ipc$super(BaseCameraHolder$cameraProcessHandler$2 baseCameraHolder$cameraProcessHandler$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/BaseCameraHolder$cameraProcessHandler$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Handler invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this}) : new Handler(this.this$0.e().getLooper());
    }
}

package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder;
import com.etao.feimagesearch.capture.tool.camera.CameraWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class w13 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CameraWidget c;

    public w13(CameraWidget cameraWidget) {
        this.c = cameraWidget;
    }

    public static /* synthetic */ Object ipc$super(w13 w13Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/CameraWidget$openCamera$1");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        agh.r("PltCamera", j53.TAG, "OnPermissionGranted");
        BaseCameraHolder h0 = CameraWidget.h0(this.c);
        if (h0 != null) {
            h0.o(true);
        } else {
            ckf.y("cameraHolder");
            throw null;
        }
    }
}

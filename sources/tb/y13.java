package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.camera.CameraWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y13 extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CameraWidget c;

    public y13(CameraWidget cameraWidget) {
        this.c = cameraWidget;
    }

    public static /* synthetic */ Object ipc$super(y13 y13Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/CameraWidget$openCamera$2");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        agh.r("PltCamera", j53.TAG, "OnPermissionDenied");
        CameraWidget.j0(this.c);
    }
}

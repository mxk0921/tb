package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.core.h5.WVInteractsdkCamera;
import com.taobao.interact.core.h5.WVInteractsdkUpload;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ivf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(495976452);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39467d3d", new Object[0]);
            return;
        }
        fsw.i("WVInteractsdkCamera", WVInteractsdkCamera.class, true);
        fsw.f("WVCamera", "takePhotoInteract", "WVInteractsdkCamera", "takePhotoInteract");
        fsw.i("WVInteractsdkUpload", WVInteractsdkUpload.class, true);
        zvf.a();
    }
}

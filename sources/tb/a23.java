package tb;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.camera.CameraWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a23 implements DialogInterface.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraWidget f15494a;

    public a23(CameraWidget cameraWidget) {
        this.f15494a = cameraWidget;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            return;
        }
        if (dialogInterface != null) {
            dialogInterface.cancel();
        }
        nmj.d(this.f15494a.E(), 0);
        agh.r("PltCamera", j53.TAG, "jump to permission guide page");
    }
}

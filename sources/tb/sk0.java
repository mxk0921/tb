package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class sk0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296541);
    }

    public static /* synthetic */ int a(sk0 sk0Var, Activity activity, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d4a22ac", new Object[]{sk0Var, activity, captureManager})).intValue();
        }
        throw null;
    }
}

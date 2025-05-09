package tb;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qc INSTANCE = new qc();

    public final void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f40163", new Object[]{this, fragment});
            return;
        }
        ckf.g(fragment, "fragment");
        vxm.b.j(fragment).j("rateListRenderEndTime", SystemClock.uptimeMillis());
    }
}

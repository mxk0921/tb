package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.android.agoo.honor.HonorNtfHelper;
import tb.hi0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(769654785);
    }

    public static void a(Activity activity, hi0.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ba3d36", new Object[]{activity, fVar});
            return;
        }
        try {
            HonorNtfHelper.enableNtfByVip(activity, fVar);
        } catch (Throwable th) {
            ALog.e("VendorNtfHelper", "NtfHelperActivity.enableNtfByVip err", th, new Object[0]);
        }
    }
}

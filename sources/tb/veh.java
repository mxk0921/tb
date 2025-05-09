package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class veh implements fdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(947912712);
        t2o.a(946864129);
    }

    @Override // tb.fdh
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
        }
    }

    @Override // tb.fdh
    public void error(String str, String str2, Throwable... thArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ebcfc63", new Object[]{this, str, str2, thArr});
        } else if (thArr == null || thArr.length <= 0) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2, thArr[0]);
        }
    }
}

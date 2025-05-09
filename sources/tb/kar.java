package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class kar implements orb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855755);
        t2o.a(989855837);
    }

    @Override // tb.orb
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(str, str2);
        }
    }
}

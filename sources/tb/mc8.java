package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.UncaughtCrashHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mc8 implements UncaughtCrashHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.tcrash.UncaughtCrashHeader
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
        }
    }
}

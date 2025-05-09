package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.UncaughtCrashHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ula implements UncaughtCrashHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UncaughtCrashHeader[] f29463a;

    public ula(UncaughtCrashHeader... uncaughtCrashHeaderArr) {
        this.f29463a = uncaughtCrashHeaderArr;
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashHeader
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            return;
        }
        UncaughtCrashHeader[] uncaughtCrashHeaderArr = this.f29463a;
        if (uncaughtCrashHeaderArr != null) {
            for (int i = 0; i < 2; i++) {
                UncaughtCrashHeader uncaughtCrashHeader = uncaughtCrashHeaderArr[i];
                if (uncaughtCrashHeader != null) {
                    uncaughtCrashHeader.addHeaderInfo(str, str2);
                }
            }
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class i1s implements j1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.j1s
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9263f21b", new Object[]{this, str, str2});
        } else {
            l1s.c().a("TCrashExit", str, str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc68366", new Object[]{this});
        }
    }
}

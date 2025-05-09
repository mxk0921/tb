package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jmv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592967);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            bmv.b().a(bmv.MSGTYPE_INTERVAL);
        }
    }
}

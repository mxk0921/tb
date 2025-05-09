package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j77 implements s5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557681);
        t2o.a(767557682);
    }

    @Override // tb.s5s
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a29350", new Object[]{this, str, str2, th});
        } else {
            TLog.loge("TLOG_MONITOR", "", d(str, str2, ""), th);
        }
    }

    @Override // tb.s5s
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821050f1", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge("TLOG_MONITOR", str, d(str, str2, str3));
        }
    }

    @Override // tb.s5s
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3597404f", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge("TLOG_MONITOR", str, d(str, str2, str3));
        }
    }

    public final String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6a6b25f", new Object[]{this, str, str2, str3});
        }
        return str + ":" + str2 + ":" + str3;
    }
}

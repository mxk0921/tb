package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import mtopsdk.common.log.LogAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class n4s implements LogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299790);
        t2o.a(589299788);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b10888a3", new Object[]{this});
        }
        return AdapterForTLog.getLogLevel();
    }

    public final void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
        } else if (th == null) {
            AdapterForTLog.loge(str, str2);
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    public void c(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f68329c", new Object[]{this, new Integer(i), str, str2, th});
        } else if (i == 1) {
            AdapterForTLog.logv(str, str2);
        } else if (i == 2) {
            AdapterForTLog.logd(str, str2);
        } else if (i == 4) {
            AdapterForTLog.logi(str, str2);
        } else if (i == 8) {
            AdapterForTLog.logw(str, str2, th);
        } else if (i == 16) {
            b(str, str2, th);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33b4eda", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.traceLog(str, str2);
        }
    }
}

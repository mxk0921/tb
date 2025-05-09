package anet.channel.log;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogAdapter implements ALog.ILog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(607125669);
        t2o.a(607125926);
    }

    @Override // anet.channel.util.ALog.ILog
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return AdapterForTLog.isValid();
    }

    @Override // anet.channel.util.ALog.ILog
    public void setLogLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addbd37a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
        } else {
            AdapterForTLog.logw(str, str2, th);
        }
    }

    @Override // anet.channel.util.ALog.ILog
    public boolean isPrintLog(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return i >= convertTLogLevel(AdapterForTLog.getLogLevel().charAt(0));
    }

    private int convertTLogLevel(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0379aa8", new Object[]{this, new Character(c)})).intValue();
        }
        if (c == 'D') {
            return 1;
        }
        if (c == 'E') {
            return 4;
        }
        if (c == 'I') {
            return 2;
        }
        if (c != 'V') {
            return c != 'W' ? 5 : 3;
        }
        return 0;
    }
}

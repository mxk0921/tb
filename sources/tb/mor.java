package tb;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class mor implements boc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mor INSTANCE = new mor();

    static {
        s4s.e().a("Megability/Internal", LogLevel.I);
    }

    @Override // tb.boc
    public void a(int i, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a426e5e1", new Object[]{this, new Integer(i), str, str2, str3, str4, map});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "eventName");
        lcn.a(d(i), str).k(str2, str3).m(str4).b(map).f();
    }

    @Override // tb.boc
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a819fe", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "tag");
        ckf.g(str3, "msg");
        TLog.logi(str, str2, str3);
    }

    @Override // tb.boc
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d0e6fa", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "p0");
        ckf.g(str2, p1.d);
        ckf.g(str3, "p2");
        TLog.loge(str, str2, str3);
    }

    public final RVLLevel d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("d65e43e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return RVLLevel.Off;
        }
        if (i == 1) {
            return RVLLevel.Error;
        }
        if (i == 2) {
            return RVLLevel.Warn;
        }
        if (i == 3) {
            return RVLLevel.Info;
        }
        if (i == 4) {
            return RVLLevel.Debug;
        }
        if (i != 5) {
            return RVLLevel.Off;
        }
        return RVLLevel.Verbose;
    }
}

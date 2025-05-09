package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ceh implements fob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557703);
        t2o.a(767557702);
    }

    @Override // tb.fob
    public fob a(z24 z24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fob) ipChange.ipc$dispatch("5320b9c", new Object[]{this, z24Var});
        }
        try {
            TLogEventHelper.e(v4s.UT_TLOG_CONFIG_RECEIVE);
            s5s s = j5s.j().s();
            String str = b6s.c;
            s.c(str, "TLOG.LogConfigRequestTask", "消息处理：请求修改日志配置消息");
            beh behVar = new beh();
            behVar.c(z24Var.h, z24Var);
            Boolean bool = behVar.f16345a;
            Boolean bool2 = behVar.b;
            String str2 = behVar.c;
            String str3 = behVar.d;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(j5s.j().h()).edit();
            edit.putString(EnvironmentSwitcher.TLOG_VERSION, j5s.j().e()).apply();
            if (bool2 == null || !bool2.booleanValue()) {
                edit.putBoolean("tlog_destroy", false).apply();
            } else {
                j5s.j().s().c(str, "TLOG.LogConfigRequestTask", "消息处理：销毁日志");
                s4s.e().d();
                n6s.b(b5s.j());
                edit.putBoolean("tlog_destroy", true).apply();
            }
            if (bool != null && !bool.booleanValue()) {
                s5s s2 = j5s.j().s();
                s2.c(str, "TLOG.LogConfigRequestTask", "消息处理：日志开关 " + bool);
                s4s.e().d();
                edit.putBoolean(r4s.REMOTE_TLOG_CONFIG, bool.booleanValue()).apply();
            }
            if (str2 != null) {
                j5s.j().s().c(str, "TLOG.LogConfigRequestTask", "消息处理：日志级别修改 ".concat(str2));
                LogLevel c = n6s.c(str2);
                edit.putString(EnvironmentSwitcher.TLOG_LEVEL, str2).apply();
                s4s.e().g(c);
                u5s.b(c);
                s5s s3 = j5s.j().s();
                s3.c(str, "TLOG.LogConfigRequestTask", "消息处理：日志级别修改完成:" + c.getName());
            }
            if ("off".equals(str3)) {
                j5s.j().s().c(str, "TLOG.LogConfigRequestTask", "消息处理：log model关闭");
                s4s.e().c();
                edit.remove("tlog_module").apply();
                u5s.c(str3);
            } else {
                s5s s4 = j5s.j().s();
                s4.c(str, "TLOG.LogConfigRequestTask", "消息处理：修改module信息: " + str3);
                Map<String, LogLevel> i = n6s.i(str3);
                if (i != null && i.size() > 0) {
                    s4s.e().b(i);
                    edit.putString("tlog_module", str3).apply();
                    u5s.c(str3);
                }
            }
            eeh.a(z24Var);
        } catch (Exception e) {
            Log.e("TLOG.LogConfigRequestTask", "execute error", e);
            TLogEventHelper.e(v4s.UT_TLOG_CONFIG_ERR);
            j5s.j().s().a(b6s.c, "TLOG.LogConfigRequestTask", e);
        }
        return this;
    }
}

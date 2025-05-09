package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.interceptor.RealTimeLogConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ewd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lkn implements gwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23385a;
    public final ewd b;
    public RealTimeLogConfig c;
    public final AtomicInteger d = new AtomicInteger(0);

    static {
        t2o.a(767557668);
        t2o.a(767557659);
    }

    public lkn(Context context, RealTimeLogConfig realTimeLogConfig, ewd ewdVar) {
        this.f23385a = context;
        this.b = ewdVar;
        this.c = realTimeLogConfig;
    }

    @Override // tb.gwd
    public void a(long j, long j2, long j3, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1840e5e9", new Object[]{this, new Long(j), new Long(j2), new Long(j3), logLevel, logCategory, str, str2, str3});
        } else if (c(logCategory, logLevel, str, str2)) {
            this.b.c(d(j, j2, j3, logLevel, logCategory, str, str2, str3));
        }
    }

    public final boolean c(LogCategory logCategory, LogLevel logLevel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f96bc4fe", new Object[]{this, logCategory, logLevel, str, str2})).booleanValue();
        }
        RealTimeLogConfig realTimeLogConfig = this.c;
        if (realTimeLogConfig != null) {
            long j = realTimeLogConfig.expireTime;
            if (j == -1 || j >= System.currentTimeMillis()) {
                if (this.b == null || !this.c.enable) {
                    return false;
                }
                if (logCategory == LogCategory.CodeLog && logLevel.ordinal() < this.c.level) {
                    return false;
                }
                List<String> list = this.c.moduleList;
                if (list != null && !list.contains(str)) {
                    return false;
                }
                List<String> list2 = this.c.tagList;
                if (list2 == null || list2.contains(str2)) {
                    return true;
                }
                return false;
            }
        }
        ckn.j(this.f23385a, 6);
        return false;
    }

    public final String d(long j, long j2, long j3, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fed9224", new Object[]{this, new Long(j), new Long(j2), new Long(j3), logLevel, logCategory, str, str2, str3});
        }
        return String.format("%s%s%d%s%s%s%d%s%d%s%d%s%s%s%s%s%s%s", logLevel.getName(), "\u0001", Long.valueOf(j), "\u0001", logCategory.getName(), "\u0001", Integer.valueOf(this.d.incrementAndGet()), "\u0001", Long.valueOf(j2), "\u0001", Long.valueOf(j3), "\u0001", str, "\u0001", str2, "\u0001", str3, "\u0003");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ewd ewdVar = this.b;
        if (ewdVar != null) {
            ewdVar.b(this.f23385a, this.c, new ewd.a() { // from class: tb.kkn
                @Override // tb.ewd.a
                public final void a(int i, String str) {
                    lkn.this.e(i, str);
                }
            });
            o5s.e(this.f23385a, this);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        o5s.p(this);
        ewd ewdVar = this.b;
        if (ewdVar != null) {
            ewdVar.destroy();
        }
    }

    public void h(RealTimeLogConfig realTimeLogConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521c8f5b", new Object[]{this, realTimeLogConfig});
            return;
        }
        this.c = realTimeLogConfig;
        ewd ewdVar = this.b;
        if (ewdVar != null) {
            ewdVar.a(realTimeLogConfig);
        }
    }

    public final /* synthetic */ void e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57795275", new Object[]{this, new Integer(i), str});
            return;
        }
        String.format("onUploadStop! reason: %d, errCode: %s", Integer.valueOf(i), str);
        ckn.j(this.f23385a, i);
    }
}

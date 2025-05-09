package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s4s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, LogLevel> f27795a;
    public LogLevel b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final s4s f27796a = new s4s();

        static {
            t2o.a(767557648);
        }

        public static /* synthetic */ s4s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s4s) ipChange.ipc$dispatch("68229492", new Object[0]);
            }
            return f27796a;
        }
    }

    static {
        t2o.a(767557646);
        t2o.a(767557639);
    }

    public static final s4s e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s4s) ipChange.ipc$dispatch("a8fc946c", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25473860", new Object[]{this, str, logLevel});
        } else if (str != null) {
            String name = logLevel.getName();
            TLog.loge("TLogController", "", "addModuleFilter: " + str + "-" + name);
            ((ConcurrentHashMap) this.f27795a).put(str, logLevel);
            if (j5s.j().i() == 2 && TLogNative.isSoOpen()) {
                try {
                    TLogNative.addModuleFilter(str, logLevel.getIndex());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void b(Map<String, LogLevel> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac70dfb9", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                e().a(str, map.get(str));
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb87f4", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.f27795a).clear();
        TLog.loge("TLogController", "", "cleanModuleFilter");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41f78b3", new Object[]{this});
        } else if (j5s.j().i() == 2 && TLogNative.isSoOpen()) {
            try {
                TLogNative.setLogLevel(LogLevel.L.getIndex());
                TLogNative.appenderClose();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public LogLevel f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("9752578d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.b;
        }
        LogLevel logLevel = (LogLevel) ((ConcurrentHashMap) this.f27795a).get(str);
        if (logLevel == null) {
            return this.b;
        }
        return logLevel;
    }

    public void g(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07db9ad", new Object[]{this, logLevel});
            return;
        }
        this.b = logLevel;
        if (j5s.j().i() == 2 && TLogNative.isSoOpen()) {
            try {
                TLogNative.setLogLevel(logLevel.getIndex());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b3e5c", new Object[]{this});
        } else if (this.f27795a != null && this.b != null && TLogNative.isSoOpen()) {
            try {
                TLogNative.setLogLevel(this.b.getIndex());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void i(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b31d26", new Object[]{this, logLevel});
        } else {
            this.b = logLevel;
        }
    }

    public s4s() {
        this.b = LogLevel.E;
        this.f27795a = new ConcurrentHashMap();
    }
}

package tb;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.adapter.a;
import com.taobao.android.tbuprofen.common.BigMemoryAllocException;
import com.taobao.android.tbuprofen.common.MainThreadWaitTimeoutException;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lur extends v67 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_LOAD = "LOAD";
    public static final String EVENT_LOAD_ERROR = "LOAD_ERROR";
    public static final String EVENT_LOAD_PLUGIN = "LOAD_PLUGIN";
    public static final String EVENT_LOAD_PLUGIN_ERROR = "LOAD_PLUGIN_ERROR";
    public static final String EVENT_LOAD_PLUGIN_SUCCESS = "LOAD_PLUGIN_SUCCESS";
    public static final String EVENT_LOAD_SUCCESS = "LOAD_SUCCESS";
    public static final String MONITOR_MODULE = "TBProf";

    /* renamed from: a  reason: collision with root package name */
    public final Context f23579a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        t2o.a(824180752);
    }

    public lur(Context context, a aVar) {
        this.f23579a = context;
        String str = Build.CPU_ABI;
        boolean d = asr.d(context);
        String str2 = Build.DISPLAY;
        boolean f = asr.f(context);
        this.b = "abi:" + str + ";isDebug:" + d + ";osVer:" + str2 + ";isVirtual:" + f;
        boolean j = j(aVar.f9613a);
        int nextInt = new Random().nextInt(10000);
        boolean z = true;
        boolean z2 = j && TBProfConfig.h() >= nextInt;
        this.c = z2;
        boolean z3 = j && TBProfConfig.b() >= nextInt;
        this.d = z3;
        z = (!j || TBProfConfig.g() < nextInt) ? false : z;
        this.e = z;
        urr.a("TBProfStatistic", "verEnable=" + j + ", isEnable=" + z2 + ",isBigMemEnable=" + z3 + ",isMainWaitEnable=" + z, new Object[0]);
    }

    public static /* synthetic */ Object ipc$super(lur lurVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/adapter/TBProfStatistic");
    }

    public static boolean j(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdd91d84", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            split = str.split("\\.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (split.length == 3) {
            return true;
        }
        if (split.length == 4) {
            if (split[3].length() <= 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // tb.v67, tb.osd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
        } else if (this.c) {
            String str = "event:LOAD;" + this.b;
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", str);
            TLog.logd("TBProfStatistic", str);
        }
    }

    @Override // tb.v67, tb.osd
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8641cbe", new Object[]{this, str, str2});
        } else if (this.c) {
            String str3 = "event:LOAD_ERROR;" + this.b;
            AppMonitor.Alarm.commitFail(MONITOR_MODULE, "load", str3, str, str2);
            TLog.loge("TBProfStatistic", str3 + ", err=" + str + f7l.BRACKET_START_STR + str2 + f7l.BRACKET_END_STR);
        }
    }

    @Override // tb.v67, tb.osd
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372eb89", new Object[]{this, str});
        } else if (this.c) {
            String str2 = "event:LOAD_PLUGIN;pluginName:" + str + ";" + this.b;
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", str2);
            TLog.logd("TBProfStatistic", str2);
        }
    }

    @Override // tb.v67, tb.osd
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640a3115", new Object[]{this, str, str2, str3});
        } else if (this.c) {
            String str4 = "event:LOAD_PLUGIN_ERROR;pluginName:" + str + ";" + this.b;
            AppMonitor.Alarm.commitFail(MONITOR_MODULE, "load", str4, str2, str3);
            TLog.loge("TBProfStatistic", str4 + ", err=" + str2 + f7l.BRACKET_START_STR + str3 + f7l.BRACKET_END_STR);
        }
    }

    @Override // tb.v67, tb.osd
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193e7e3c", new Object[]{this, str});
        } else if (this.c) {
            String str2 = "event:LOAD_PLUGIN_SUCCESS;pluginName:" + str + ";" + this.b;
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", str2);
            TLog.logd("TBProfStatistic", str2);
        }
    }

    @Override // tb.v67, tb.osd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6b5265", new Object[]{this});
        } else if (this.c) {
            String str = "event:LOAD_SUCCESS;" + this.b;
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "load", str);
            TLog.logd("TBProfStatistic", str);
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90017dbd", new Object[]{this, new Integer(i)});
            return;
        }
        urr.f("TBProfStatistic", "Dump type %d request.", Integer.valueOf(i));
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP;type:%d", Integer.valueOf(i)));
    }

    public void m(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843027a", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        urr.f("TBProfStatistic", "Dump type %d failed. code:%d, subcode:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP_ERR;type:%d;l1:%d;s1:%s", Integer.valueOf(i), Integer.valueOf(i2), str));
    }

    public void n(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce0a258", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
            return;
        }
        urr.f("TBProfStatistic", "Dump type %d successfully. FileSize: %dKB, Cost:%dms", Integer.valueOf(i), Long.valueOf(j2 >> 10), Long.valueOf(j));
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_DUMP_SUCC;type:%d;l1:%d;l2:%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)));
    }

    public void o(int i, long j, long j2, long j3, long j4, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448b469e", new Object[]{this, new Integer(i), new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)});
            return;
        }
        AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "dump_info", String.format("event:HEAP_HPROF_INFO;type:%d;l1:%d;l2:%d;l3:%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        urr.f("TBProfStatistic", String.format("Dump heap info. Type: %d, dump: %dM, strip: %dM, zip:%dM", Integer.valueOf(i), Long.valueOf(j >> 20), Long.valueOf(j2 >> 20), Long.valueOf(j3 >> 20)), new Object[0]);
    }

    public final void q(String str, Map<String, Object> map, Throwable th, Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f441e536", new Object[]{this, str, map, th, thread});
            return;
        }
        ud2 ud2Var = new ud2();
        ud2Var.b = AggregationType.STACK;
        ud2Var.f29301a = str;
        ud2Var.k = th;
        ud2Var.l = thread;
        if (map == null) {
            map = new HashMap<>();
        }
        PageInfo a2 = nzb.b().a();
        if (a2 != null) {
            map.put(Dispatchers.TYPE_ACTIVITY, a2.getPageName());
            map.put("Fragment", a2.getPageFragment());
            map.put("Url", a2.getPageUrl());
        }
        ud2Var.i = map;
        vd2.a().c(this.f23579a, ud2Var);
    }

    public void p(String str, int i, StackTraceElement[] stackTraceElementArr, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a3cb32", new Object[]{this, str, new Integer(i), stackTraceElementArr, str2});
        } else if (this.e) {
            MainThreadWaitTimeoutException mainThreadWaitTimeoutException = new MainThreadWaitTimeoutException(stackTraceElementArr, str, i);
            String stackTraceString = Log.getStackTraceString(mainThreadWaitTimeoutException);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "runtime_info", String.format("type=MAIN_WAIT;str1=%s;l1=%d", str, Integer.valueOf(i)));
            urr.a("TBProfStatistic", String.format("onMainThreadBlock: BlockType=%s,BlockTime=%d,StackInfo:\r\n%s ", str, Integer.valueOf(i), stackTraceString), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("BlockType", str);
            hashMap.put("BlockTime", Integer.valueOf(i));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("HeldThread", str2);
            }
            q("HA_MAIN_LONG_WAIT", hashMap, mainThreadWaitTimeoutException, Looper.getMainLooper().getThread());
        }
    }

    public void k(String str, String str2, String str3, long j, StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15bd7bf", new Object[]{this, str, str2, str3, new Long(j), stackTraceElementArr});
        } else if (this.d) {
            BigMemoryAllocException bigMemoryAllocException = new BigMemoryAllocException(stackTraceElementArr, str3, j);
            String stackTraceString = Log.getStackTraceString(bigMemoryAllocException);
            AppMonitor.Alarm.commitSuccess(MONITOR_MODULE, "runtime_info", String.format("type=BIG_MEM;str1=%s;str2=%s;str3=%s;l1=%d", str3, str, stackTraceString, Long.valueOf(j)));
            urr.a("TBProfStatistic", String.format("onBigMemAlloc: AllocType=%s,AllocSize=%d byte,Thread=%s(%s),StackInfo:\r\n%s ", str3, Long.valueOf(j), str, str2, stackTraceString), new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("AllocType", str3);
            hashMap.put("AllocSize", Long.valueOf(j));
            hashMap.put("ThreadID", str2);
            q("HA_BIG_MALLOC", hashMap, bigMemoryAllocException, new Thread(str));
        }
    }
}

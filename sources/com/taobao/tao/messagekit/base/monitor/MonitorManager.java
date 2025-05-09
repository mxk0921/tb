package com.taobao.tao.messagekit.base.monitor;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.a0j;
import tb.c0j;
import tb.fy1;
import tb.lkd;
import tb.lzc;
import tb.p2j;
import tb.svc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MonitorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONF_DEFAULT_TIME = "monitor_report_default_time";
    public static final int MONITOR_REPORT_DEFAULT_TIME = 2;
    public static final String TAG = "MonitorManager";

    /* renamed from: a  reason: collision with root package name */
    public final e f12528a = new e(0, null, null);
    public final ArrayMap<Integer, e> b = new ArrayMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12529a;

        public a(int i) {
            this.f12529a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MsgRouter.e().f().i(this.f12529a, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097090);
            t2o.a(628097092);
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public boolean a(List<svc> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec0fbcec", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public boolean b(List<svc> list, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("adf4fe9", new Object[]{this, list, new Long(j)})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.tao.messagekit.base.monitor.MonitorManager.d
        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84f6d9e8", new Object[]{this})).longValue();
            }
            return 1000L;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends fy1 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097091);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/MonitorManager$DefaultDAO");
        }

        @Override // tb.fy1
        public boolean e(List<svc> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6f366c23", new Object[]{this, list})).booleanValue();
            }
            return false;
        }

        @Override // tb.fy1
        public svc g(long j, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (svc) ipChange.ipc$dispatch("80c1fb1e", new Object[]{this, new Long(j), str, str2});
            }
            return null;
        }

        @Override // tb.fy1
        public int m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("323dd7de", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // tb.fy1
        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6c7df93b", new Object[]{this});
            }
            return "";
        }

        @Override // tb.fy1
        public List<svc> q(Cursor cursor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("c2dc3c41", new Object[]{this, cursor});
            }
            return new ArrayList();
        }

        @Override // tb.lzc
        public int sysCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // tb.fy1
        public void v(String str, List<svc> list, lkd lkdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9e69530", new Object[]{this, str, list, lkdVar});
            }
        }

        @Override // tb.fy1
        public String x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32f3b120", new Object[]{this});
            }
            return "";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        boolean a(List<svc> list, long j);

        boolean b(List<svc> list, long j);

        long c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements lzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int d;

        /* renamed from: a  reason: collision with root package name */
        public fy1 f12530a = new c();
        public d b = new b();
        public boolean e = true;
        public final c0j c = new c0j();

        static {
            t2o.a(628097093);
            t2o.a(628097084);
        }

        public e(int i, fy1 fy1Var, d dVar) {
            this.d = i;
            h(fy1Var);
            g(dVar);
        }

        public void c(long j, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e156416", new Object[]{this, new Long(j), runnable});
                return;
            }
            c0j c0jVar = this.c;
            if (c0jVar != null) {
                c0jVar.b(j, runnable);
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7db7f37", new Object[]{this});
            } else if (this.e) {
                this.e = false;
                MsgLog.g("MonitorManager", Integer.valueOf(this.d), "init");
                MsgRouter.e().f().f(sysCode());
                if (MsgRouter.e().f().d(this.d).e().b(null, p2j.f)) {
                    MsgRouter.e().f().i(sysCode(), true);
                }
            }
        }

        public d e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ad54fd35", new Object[]{this});
            }
            return this.b;
        }

        public fy1 f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fy1) ipChange.ipc$dispatch("c1ff60f8", new Object[]{this});
            }
            return this.f12530a;
        }

        public int g(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c67f8bc", new Object[]{this, dVar})).intValue();
            }
            if (dVar == null) {
                return 0;
            }
            this.b = dVar;
            return 1;
        }

        public int h(fy1 fy1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6b085261", new Object[]{this, fy1Var})).intValue();
            }
            if (fy1Var == null) {
                return 0;
            }
            this.f12530a = fy1Var;
            return 1;
        }

        @Override // tb.lzc
        public int sysCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
            }
            return this.d;
        }
    }

    static {
        t2o.a(628097087);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd0c39c5", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "nodid" + System.currentTimeMillis();
    }

    public static String e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d24ce71", new Object[]{str, new Long(j)});
        }
        if (str != null) {
            return str;
        }
        return "" + j;
    }

    public static void k(svc svcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbe597", new Object[]{svcVar});
        } else {
            l(svcVar, MsgRouter.e().f().d(svcVar.sysCode()).e().c(), false);
        }
    }

    public fy1 b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fy1) ipChange.ipc$dispatch("46e062d5", new Object[]{this, new Integer(i)});
        }
        return d(i).f();
    }

    public Collection<e> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("93c632e9", new Object[]{this});
        }
        return new ArrayList(this.b.values());
    }

    public e d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("fed44db9", new Object[]{this, new Integer(i)});
        }
        e eVar = this.b.get(Integer.valueOf(i));
        if (eVar == null) {
            return this.f12528a;
        }
        return eVar;
    }

    public synchronized void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        for (e eVar : MsgRouter.e().f().c()) {
            eVar.d();
        }
        if (com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().getState() == Thread.State.NEW) {
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().start();
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6034a03c", new Object[]{this, new Integer(i)});
            return;
        }
        MsgLog.g("MonitorManager", Integer.valueOf(i), "putMonitorInitTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().d(a0j.a(1, i, null), false, true);
    }

    public void h(int i, List<svc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241362f9", new Object[]{this, new Integer(i), list});
            return;
        }
        MsgLog.e("MonitorManager", Integer.valueOf(i), "putMonitorRemoveTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().c(a0j.a(4, i, list), false);
    }

    public void j(int i, List<svc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158877cd", new Object[]{this, new Integer(i), list});
            return;
        }
        MsgLog.e("MonitorManager", Integer.valueOf(i), "putMonitorAddTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().c(a0j.a(5, i, list), false);
    }

    public synchronized int m(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fa0210c", new Object[]{this, eVar})).intValue();
        } else if (eVar == null) {
            return -1;
        } else {
            MsgLog.g("MonitorManager", "registerGuardian", Integer.valueOf(eVar.sysCode()));
            this.b.put(Integer.valueOf(eVar.sysCode()), eVar);
            return 0;
        }
    }

    public static void l(svc svcVar, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca7f067", new Object[]{svcVar, new Long(j), new Boolean(z)});
            return;
        }
        ArrayList<svc> arrayList = new ArrayList<svc>() { // from class: com.taobao.tao.messagekit.base.monitor.MonitorManager.1
            {
                add(svc.this);
            }
        };
        MsgLog.e("MonitorManager", "putMonitorRecordTask, key=", Long.valueOf(svcVar.key()), "ID=", svcVar.a(), "sysCode=", Integer.valueOf(svcVar.sysCode()), "typeID=", Integer.valueOf(svcVar.b()), "time=", Long.valueOf(j));
        MsgRouter.e().f().g(svcVar.sysCode(), j, z, arrayList);
    }

    public void i(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414ce7c", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        MsgLog.g("MonitorManager", Integer.valueOf(i), "putMessageReportTask");
        com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().d(a0j.a(3, i, null), false, z);
    }

    public void g(int i, long j, boolean z, List<svc> list) {
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae01899c", new Object[]{this, new Integer(i), new Long(j2), new Boolean(z), list});
            return;
        }
        if (z || MsgRouter.e().f().d(i).e().a(list, p2j.f)) {
            MsgLog.g("MonitorManager", Integer.valueOf(i), "record", "size=", Integer.valueOf(list == null ? 0 : list.size()), "time=", Long.valueOf(j));
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().c(a0j.a(2, i, list), false);
        }
        if (z || MsgRouter.e().f().d(i).e().b(list, p2j.f)) {
            if (j2 < 0) {
                j2 = -1;
            }
            MsgRouter.e().f().d(i).c(j2, new a(i));
            if (MsgRouter.e().f().b(i).w() >= 500) {
                MsgLog.g("MonitorManager", Integer.valueOf(i), "trigger max report");
                MsgRouter.e().f().i(i, false);
            }
        }
    }
}

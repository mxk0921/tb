package com.taobao.adaemon.power;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean j = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6164a;
        public final int b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;

        static {
            t2o.a(349175935);
        }

        public b(String str, int i) {
            this.f6164a = str;
            this.b = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PowerStat{type='" + this.f6164a + "', subType='null', daysApart=" + this.b + ", uTimeMain=" + this.c + ", sTimeMain=" + this.d + ", uTimeChannel=" + this.e + ", sTimeChannel=" + this.f + ", rxBytes=" + this.g + ", txBytes=" + this.h + ", sensorDuration=" + this.i + ", wifiscan=0, wifiquery=0, wlockTime=0, wlockTimes=0, alarmTimes=0, dumpInfo='null'}";
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (a.b() && b()) {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("type", this.f6164a);
                    create.setValue("subType", null);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("daysApart", this.b);
                    create2.setValue("uTimeMain", this.c);
                    create2.setValue("sTimeMain", this.d);
                    create2.setValue("uTimeChannel", this.e);
                    create2.setValue("sTimeChannel", this.f);
                    create2.setValue("rxBytes", this.g);
                    create2.setValue("txBytes", this.h);
                    create2.setValue("sensorDuration", this.i);
                    double d = 0;
                    create2.setValue("wifiscan", d);
                    create2.setValue("wifiquery", d);
                    create2.setValue("wlockTime", 0L);
                    create2.setValue("wlockTimes", d);
                    create2.setValue("alarmTimes", d);
                    AppMonitor.Stat.commit(e.MODULE_NAME, "PowerStat", create, create2);
                } catch (Exception e) {
                    s55.h("PowerStatMonitor", "[PowerStat]commit fail.", e, new Object[0]);
                }
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!a.a()) {
                return false;
            }
            synchronized (this) {
                if (j) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("type");
                    create.addDimension("subType");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("daysApart");
                    create2.addMeasure("uTimeMain");
                    create2.addMeasure("sTimeMain");
                    create2.addMeasure("uTimeChannel");
                    create2.addMeasure("sTimeChannel");
                    create2.addMeasure("rxBytes");
                    create2.addMeasure("txBytes");
                    create2.addMeasure("sensorDuration");
                    create2.addMeasure("wifiscan");
                    create2.addMeasure("wifiquery");
                    create2.addMeasure("wlockTime");
                    create2.addMeasure("wlockTimes");
                    create2.addMeasure("alarmTimes");
                    AppMonitor.register(e.MODULE_NAME, "PowerStat", create2, create, true);
                    j = true;
                } catch (Exception unused) {
                }
                return j;
            }
        }
    }

    static {
        t2o.a(349175933);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return e.f6147a;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return e.f6147a;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return e.f6147a;
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return e.f6147a;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/power/PowerStatMonitor");
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.adaemon.power.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0318a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean d = false;

        /* renamed from: a  reason: collision with root package name */
        public String f6163a;
        public String b;
        public String c;

        static {
            t2o.a(349175934);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (a.d() && b() && g.F(g.l(), "power", "bad_day", "bad_times", null) <= 0) {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("type", this.f6163a);
                    create.setValue(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, null);
                    create.setValue("snapshot_cpu", this.b);
                    create.setValue("dumpInfo", this.c);
                    AppMonitor.Stat.commit(e.MODULE_NAME, "PowerBadCase", create, MeasureValueSet.create());
                    g.J(g.l(), "bad_day", "bad_times", null);
                    s55.i("PowerStatMonitor", "[BadCaseReport]", "commit", "type", this.f6163a, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, null, "cpuSnapshot", this.b, "dump", this.c);
                } catch (Exception e) {
                    s55.h("PowerStatMonitor", "[BadCaseReport]commit fail.", e, new Object[0]);
                }
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!a.c()) {
                return false;
            }
            synchronized (this) {
                if (d) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
                    create.addDimension("type");
                    create.addDimension("snapshot_cpu");
                    create.addDimension("snapshot_net");
                    create.addDimension("snapshot_wlock");
                    create.addDimension("snapshot_sensor");
                    create.addDimension("snapshot_scan");
                    create.addDimension("dumpInfo");
                    AppMonitor.register(e.MODULE_NAME, "PowerBadCase", MeasureSet.create(), create, true);
                    d = true;
                } catch (Exception unused) {
                }
                return d;
            }
        }
    }
}

package com.taobao.accs.asp;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.kf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f6017a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean d = false;

        /* renamed from: a  reason: collision with root package name */
        public final int f6018a;
        public int b;
        public long c;

        static {
            t2o.a(343932991);
        }

        public a(int i) {
            this.f6018a = i;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("51dcf7d5", new Object[]{aVar})).booleanValue();
            }
            return aVar.c();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (d.a()) {
                kf.f(new RunnableC0310a());
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[IpcStat]type=" + this.f6018a + ",result=" + this.b + ",costTime=" + this.c;
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.accs.asp.d$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0310a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0310a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this)) {
                    ALog.i("StatMonitor", "[commit]", "IpcStat", a.this.toString());
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue("type", String.valueOf(a.this.f6018a));
                        create.setValue("result", String.valueOf(a.this.b));
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("costTime", a.this.c);
                        AppMonitor.Stat.commit("APreferences", "ipcStat", create, create2);
                    } catch (Exception e) {
                        ALog.e("StatMonitor", "[IpcStat][commit]commit fail.", e, new Object[0]);
                    }
                }
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!d.a()) {
                return false;
            }
            synchronized (this) {
                if (d) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("type");
                    create.addDimension("result");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("costTime");
                    AppMonitor.register("APreferences", "ipcStat", create2, create, true);
                    d = true;
                } catch (Exception e) {
                    ALog.e("StatMonitor", "[IpcStat][register]register fail.", e, new Object[0]);
                }
                return d;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static boolean e = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6020a;
        public final int b;
        public long c;
        public int d;

        static {
            t2o.a(343932993);
        }

        public b(String str, int i) {
            this.f6020a = str;
            this.b = i;
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74c85956", new Object[]{bVar})).booleanValue();
            }
            return bVar.c();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (d.a()) {
                kf.f(new a());
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[Performance]name=" + this.f6020a + ",type=" + this.b + ",result=" + this.d + ",costTime=" + this.c;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.a(b.this)) {
                    ALog.i("StatMonitor", "[commit]", "Performance", b.this.toString());
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue("name", b.this.f6020a);
                        create.setValue("type", String.valueOf(b.this.b));
                        create.setValue("result", String.valueOf(b.this.d));
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("costTime", b.this.c);
                        AppMonitor.Stat.commit("APreferences", "performance", create, create2);
                    } catch (Exception e) {
                        ALog.e("StatMonitor", "[Performance][commit]commit fail.", e, new Object[0]);
                    }
                }
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!d.a()) {
                return false;
            }
            synchronized (this) {
                if (e) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("name");
                    create.addDimension("type");
                    create.addDimension("result");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("costTime");
                    AppMonitor.register("APreferences", "performance", create2, create, true);
                    e = true;
                } catch (Exception e2) {
                    ALog.e("StatMonitor", "[Performance][register]register fail.", e2, new Object[0]);
                }
                return e;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long ALARM_SIZE = 5120;
        public static boolean f = false;

        /* renamed from: a  reason: collision with root package name */
        public final String f6022a;
        public String b;
        public String c;
        public long d;
        public long e;

        static {
            t2o.a(343932995);
        }

        public c(String str) {
            this.f6022a = str;
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("51029574", new Object[]{cVar})).booleanValue();
            }
            return cVar.c();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else if (d.a()) {
                kf.f(new a());
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[SizeAlarm]name=" + this.f6022a + ",key=" + this.b + ",value=" + this.c + ",keySize=" + this.d + ",valueSize=" + this.e;
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.a(c.this)) {
                    ALog.i("StatMonitor", "[commit]", "SizeAlarm", c.this.toString());
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        create.setValue("name", c.this.f6022a);
                        create.setValue("key", c.this.b);
                        create.setValue("value", c.this.c);
                        MeasureValueSet create2 = MeasureValueSet.create();
                        create2.setValue("keySize", c.this.d);
                        create2.setValue("valueSize", c.this.e);
                        AppMonitor.Stat.commit("APreferences", "sizeAlarm", create, create2);
                    } catch (Exception e) {
                        ALog.e("StatMonitor", "[IpcStat][commit]commit fail.", e, new Object[0]);
                    }
                }
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
            }
            if (!d.a()) {
                return false;
            }
            synchronized (this) {
                if (f) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("name");
                    create.addDimension("key");
                    create.addDimension("value");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("keySize");
                    create2.addMeasure("valueSize");
                    AppMonitor.register("APreferences", "sizeAlarm", create2, create, true);
                    f = true;
                } catch (Exception e) {
                    ALog.e("StatMonitor", "[IpcStat][register]register fail.", e, new Object[0]);
                }
                return f;
            }
        }
    }

    static {
        t2o.a(343932990);
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f6017a = true;
        } catch (Exception unused) {
            f6017a = false;
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f6017a;
    }
}

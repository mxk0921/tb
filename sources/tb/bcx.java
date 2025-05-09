package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bcx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "DesktopWidget";

    /* renamed from: a  reason: collision with root package name */
    public static volatile bcx f16325a;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Integer f16326a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public long j;
        public long k;
        public Integer l;

        static {
            t2o.a(437256279);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ae645ea9", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8eddb4aa", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8139307c", new Object[]{aVar})).longValue();
            }
            return aVar.j;
        }

        public static /* synthetic */ long d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff9a345b", new Object[]{aVar})).longValue();
            }
            return aVar.k;
        }

        public static /* synthetic */ Integer e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("32874a7c", new Object[]{aVar});
            }
            return aVar.f16326a;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4fd060ac", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3049b6ad", new Object[]{aVar});
            }
            return aVar.h;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("10c30cae", new Object[]{aVar});
            }
            return aVar.i;
        }

        public static /* synthetic */ Integer i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("ed4cf2f8", new Object[]{aVar});
            }
            return aVar.l;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d1b5b8b0", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b22f0eb1", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ String l(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92a864b2", new Object[]{aVar});
            }
            return aVar.g;
        }

        public a m(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5abff3a4", new Object[]{this, num});
            }
            this.l = num;
            return this;
        }

        public a n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b6a3944", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a643e4cc", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a p(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("807a2e8d", new Object[]{this, num});
            }
            this.f16326a = num;
            return this;
        }

        public a q(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8014b6b8", new Object[]{this, new Long(j)});
            }
            this.j = j;
            return this;
        }

        public a r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dfc7c344", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4635a9b", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9b2ae164", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a u(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5dc66c72", new Object[]{this, new Long(j)});
            }
            this.k = j;
            return this;
        }

        public a v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c3fa2d8e", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a w(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("122e3a5a", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a x(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e2beda4a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(437256278);
    }

    public static bcx e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bcx) ipChange.ipc$dispatch("99fbcbb1", new Object[0]);
        }
        if (f16325a == null) {
            synchronized (bcx.class) {
                try {
                    if (f16325a == null) {
                        f16325a = new bcx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16325a;
    }

    public final void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6498de39", new Object[]{this, str, aVar});
            return;
        }
        try {
            h(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", a.a(aVar));
            create.setValue(MonitorType.WIDGET_ADD_TYPE, a.j(aVar));
            create.setValue("widgetChannel", a.k(aVar));
            f(str, create, MeasureValueSet.create());
        } catch (Exception e) {
            hgh.d("WidgetMonitor WidgetAddInfo commit error" + e);
        }
    }

    public final void c(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdd3999", new Object[]{this, str, aVar});
            return;
        }
        try {
            i(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", a.a(aVar));
            create.setValue("widgetChannel", a.k(aVar));
            create.setValue(MonitorType.WIDGET_RENDER_STATE, a.l(aVar));
            create.setValue("widgetRenderError", a.g(aVar));
            MeasureValueSet create2 = MeasureValueSet.create();
            create2.setValue("widgetInitTime", a.c(aVar));
            create2.setValue("widgetRenderTime", a.d(aVar));
            f(str, create, create2);
        } catch (Exception e) {
            hgh.d("WidgetMonitor WidgetRenderInfo commit error" + e);
        }
    }

    public final void d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c6b695", new Object[]{this, str, aVar});
            return;
        }
        try {
            j(str);
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("widgetTypeId", a.a(aVar));
            create.setValue(MonitorType.WIDGET_STATE, a.b(aVar));
            create.setValue("widgetId", String.valueOf(a.e(aVar)));
            create.setValue("widgetReceiver", a.f(aVar));
            create.setValue("widgetRenderError", a.g(aVar));
            create.setValue("widgetRequestError", a.h(aVar));
            create.setValue("vivoVersion", String.valueOf(a.i(aVar)));
            f(str, create, MeasureValueSet.create());
        } catch (Exception e) {
            hgh.d("WidgetMonitor WidgetStateInfo commit error" + e);
        }
    }

    public final void f(String str, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f50fe9c", new Object[]{this, str, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit(MODULE_NAME, str, dimensionValueSet, measureValueSet);
        }
    }

    public final void g(String str, DimensionSet dimensionSet, MeasureSet measureSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8352066", new Object[]{this, str, dimensionSet, measureSet});
        } else {
            AppMonitor.register(MODULE_NAME, str, measureSet, dimensionSet);
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414527e9", new Object[]{this, str});
            return;
        }
        AtomicBoolean atomicBoolean = c;
        if (!atomicBoolean.get()) {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("widgetTypeId");
                create.addDimension(MonitorType.WIDGET_ADD_TYPE);
                create.addDimension("widgetChannel");
                g(str, create, MeasureSet.create());
                atomicBoolean.set(true);
            } catch (Exception e) {
                hgh.d("WidgetMonitor WidgetAddInfo register error" + e);
            }
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7831689", new Object[]{this, str});
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (!atomicBoolean.get()) {
                DimensionSet create = DimensionSet.create();
                create.addDimension("widgetTypeId");
                create.addDimension(MonitorType.WIDGET_RENDER_STATE);
                create.addDimension("widgetRenderError");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("widgetInitTime");
                create2.addMeasure("widgetRenderTime");
                g(str, create, create2);
                atomicBoolean.set(true);
            }
        } catch (Exception e) {
            hgh.d("WidgetMonitor WidgetRenderInfo register error" + e);
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73b5b0d", new Object[]{this, str});
            return;
        }
        try {
            AtomicBoolean atomicBoolean = b;
            if (!atomicBoolean.get()) {
                DimensionSet create = DimensionSet.create();
                create.addDimension("widgetTypeId");
                create.addDimension(MonitorType.WIDGET_STATE);
                create.addDimension("widgetId");
                create.addDimension("widgetReceiver");
                create.addDimension("vivoVersion");
                g(str, create, MeasureSet.create());
                atomicBoolean.set(true);
            }
        } catch (Exception e) {
            hgh.d("WidgetMonitor WidgetStateInfo register error" + e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r7.equals(com.taobao.desktop.widget.monitor.MonitorType.WIDGET_ADD_TYPE) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r7, tb.bcx.a r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.bcx.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "10a55ee6"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1784013897: goto L_0x003b;
                case -934132563: goto L_0x002f;
                case 695348375: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0046
        L_0x0025:
            java.lang.String r1 = "widgetAddType"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0046
            goto L_0x0023
        L_0x002f:
            java.lang.String r0 = "widgetState"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0023
        L_0x0039:
            r0 = 1
            goto L_0x0046
        L_0x003b:
            java.lang.String r0 = "widgetRenderState"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x0023
        L_0x0045:
            r0 = 0
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x0052;
                case 1: goto L_0x004e;
                case 2: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0055
        L_0x004a:
            r6.b(r7, r8)
            goto L_0x0055
        L_0x004e:
            r6.d(r7, r8)
            goto L_0x0055
        L_0x0052:
            r6.c(r7, r8)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bcx.a(java.lang.String, tb.bcx$a):void");
    }
}

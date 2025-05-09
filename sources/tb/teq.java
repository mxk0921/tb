package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class teq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DEGRADE_STRATEGY = "degradeStrategy";
    public static final String DIMEN_XSEARCH_TYPE = "xsearch_type";
    public static final String FALLBACK = "isFallback";
    public static final String MEASURE_MTOP = "mtop-request";
    public static final String MODULE_NAME = "TBSearchPerformance";
    public static final String PARSE_DATA = "parse-data";
    public static final String POINT_NAME = "SrpEnter";
    public static final String RENDER_UI = "render-ui";
    public static final String SERVER_VERSION = "sVersion";
    public static final String TEMPLATE_REQUEST = "template-request";
    public static final String TEMPLATE_TYPE = "tItemType";
    public static final String TEMPLATE_URL = "template-url";
    public static boolean f;
    public final DimensionValueSet b;
    public volatile boolean e;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final boolean d = o4p.j1();

    /* renamed from: a  reason: collision with root package name */
    public final MeasureValueSet f28666a = MeasureValueSet.create();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792255);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
            } else if (!teq.a()) {
                teq.b(true);
                MeasureSet create = MeasureSet.create();
                create.addMeasure("mtop-request");
                create.addMeasure(teq.PARSE_DATA);
                create.addMeasure(teq.TEMPLATE_REQUEST);
                create.addMeasure(teq.RENDER_UI);
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension(teq.FALLBACK);
                create2.addDimension(teq.SERVER_VERSION);
                create2.addDimension(teq.DIMEN_XSEARCH_TYPE);
                AppMonitor.register(teq.MODULE_NAME, teq.POINT_NAME, create, create2);
            }
        }
    }

    static {
        t2o.a(815792254);
    }

    public teq() {
        Companion.a();
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(SERVER_VERSION, r4p.SERVER_VERSION_VALUE);
        create.setValue(FALLBACK, "false");
        create.setValue(DEGRADE_STRATEGY, Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance());
        this.b = create;
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55f3164", new Object[0])).booleanValue();
        }
        return f;
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db32f80", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    public static /* synthetic */ void d(teq teqVar, String str, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e71a932", new Object[]{teqVar, str, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        teqVar.c(str, j);
    }

    public final void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1078678a", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, "measureName");
        if (!this.c.get() && this.d) {
            this.f28666a.setValue(str, MeasureValue.create(j));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.d && this.c.compareAndSet(false, true)) {
            this.e = true;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, str});
            return;
        }
        ckf.g(str, "measureName");
        if (!this.c.get() && this.d) {
            MeasureValueSet measureValueSet = this.f28666a;
            if (measureValueSet.containValue(str)) {
                measureValueSet.setValue(str, System.currentTimeMillis() - measureValueSet.getValue(str).getValue());
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (!this.e && this.d && this.c.compareAndSet(false, true)) {
            AppMonitor.Stat.commit(MODULE_NAME, POINT_NAME, this.b, this.f28666a);
        }
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e55c9e5", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "name");
        ckf.g(str2, "value");
        this.b.setValue(str, str2);
    }
}

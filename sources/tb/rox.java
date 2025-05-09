package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class rox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean n;

    /* renamed from: a  reason: collision with root package name */
    public String f27519a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(993002026);
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
            } else if (!rox.a()) {
                rox.b(true);
                AppMonitor.register("tbsearch", "xslStats", MeasureSet.create().addMeasure("onCreate").addMeasure("init").addMeasure("downloadPage").addMeasure("render").addMeasure("dataCost").addMeasure("downloadTemplate").addMeasure(iiz.PERF_STAG_TOTAL), DimensionSet.create().addDimension("pageName").addDimension("preload").addDimension(ICallService.KEY_NEED_INIT));
            }
        }
    }

    static {
        t2o.a(993002025);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55f3164", new Object[0])).booleanValue();
        }
        return n;
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db32f80", new Object[]{new Boolean(z)});
        } else {
            n = z;
        }
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78916f9e", new Object[]{this, new Long(j)});
        } else if (this.k <= 0) {
            this.k = j;
            c();
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8500def6", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public final void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abbe78", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public final void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c888e2d", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c506e5", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a4387f", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c03618", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.f27519a = str;
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c33c46", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e060692", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49459f7", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279f1ab2", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947af813", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "onCreate to dataFinish:" + (this.k - this.b) + "\n -onCreate cost:" + (this.e - this.b) + "\n  --init cost:" + (this.c - this.b) + "\n -onCreateEnd to renderFinish:" + (this.g - this.e) + "\n  -- downloadPage cost:" + this.i + "\n  -- render cost:" + this.f + "\n -renderFinish to dataFinish:" + (this.k - this.g) + "\n  --renderFinish to receiveData:" + (this.h - this.g) + "\n  --receiveData to dataFinish:" + (this.k - this.h) + "\n    ---template cost:" + this.j + '\n';
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4257462f", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.f27519a)) {
            Companion.a();
            AppMonitor.Stat.commit("tbsearch", "xslStats", DimensionValueSet.create().setValue("pageName", this.f27519a).setValue("preload", String.valueOf(this.l)).setValue(ICallService.KEY_NEED_INIT, String.valueOf(this.m)), MeasureValueSet.create().setValue("onCreate", this.e - this.b).setValue("init", this.c - this.d).setValue("downloadPage", this.i).setValue("render", this.f).setValue("dataCost", this.k - this.g).setValue("downloadTemplate", this.j).setValue(iiz.PERF_STAG_TOTAL, this.k - this.b));
            c4p.D("xslStats", toString(), new Object[0]);
        }
    }
}

package com.taobao.falco;

import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.crt;
import tb.hz8;
import tb.oz8;
import tb.tz8;
import tb.uz8;
import tb.vu3;
import tb.z61;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoEnvironmentImpl implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_MODULE = "falco";
    public static final String REPORT_SCENE_NETWORK = "network";
    public static final String REPORT_SCENE_SYSLOAD = "sysload";
    public static final String REPORT_SCENE_VISIT = "visit";
    public static final String TAG = "falco.env";
    public static volatile FalcoEnvironmentImpl j;
    public final SharedPreferences d;
    public volatile boolean g;
    public oz8 h;
    public boolean i;

    /* renamed from: a  reason: collision with root package name */
    public final v f10427a = new v(this);
    public final x b = new x(this);
    public final w c = new w(this);
    public final List<f.b> e = new ArrayList(1);
    public volatile b f = new b("", "", "");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Category {
        SYSTEM_LOAD,
        FLOW_LINE,
        NETWORK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Category category, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoEnvironmentImpl$Category");
        }

        public static Category valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Category) ipChange.ipc$dispatch("47cadbe5", new Object[]{str});
            }
            return (Category) Enum.valueOf(Category.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$falco$FalcoEnvironmentImpl$Category;

        static {
            int[] iArr = new int[Category.values().length];
            $SwitchMap$com$taobao$falco$FalcoEnvironmentImpl$Category = iArr;
            try {
                iArr[Category.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$falco$FalcoEnvironmentImpl$Category[Category.FLOW_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$falco$FalcoEnvironmentImpl$Category[Category.SYSTEM_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f10428a = uz8.a();
        public final String b;
        public final String c;
        public final String d;

        public b(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "falcoId=" + this.f10428a + ", visitFalcoId=" + this.b + ", networkFalcoId=" + this.c + ", sysLoadFalcoId=" + this.d;
        }
    }

    public FalcoEnvironmentImpl(SharedPreferences sharedPreferences) {
        this.d = sharedPreferences;
    }

    public static /* synthetic */ List j(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("debecc98", new Object[]{falcoEnvironmentImpl});
        }
        return falcoEnvironmentImpl.e;
    }

    public static FalcoEnvironmentImpl m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoEnvironmentImpl) ipChange.ipc$dispatch("a1a09d2b", new Object[0]);
        }
        return j;
    }

    public static void t(FalcoEnvironmentImpl falcoEnvironmentImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df92c25", new Object[]{falcoEnvironmentImpl});
        } else {
            j = falcoEnvironmentImpl;
        }
    }

    @Override // com.taobao.falco.f
    public l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("a496d050", new Object[]{this});
        }
        return this.f10427a.n();
    }

    @Override // com.taobao.falco.f
    public o b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("7ae9a728", new Object[]{this});
        }
        return this.b.r();
    }

    @Override // com.taobao.falco.f
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41b6dcc1", new Object[]{this});
        }
        if (this.i) {
            return this.f.f10428a;
        }
        return "";
    }

    @Override // com.taobao.falco.f
    public c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6be95670", new Object[]{this});
        }
        return this.b.h();
    }

    @Override // com.taobao.falco.f
    public d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("bf26f10", new Object[]{this});
        }
        return this.b.j();
    }

    @Override // com.taobao.falco.f
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3fa50b2", new Object[]{this});
        }
        return SceneIdentifier.getCurrentPageUrl();
    }

    @Override // com.taobao.falco.f
    public p g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("5e3d09d0", new Object[]{this});
        }
        return this.c.n();
    }

    @Override // com.taobao.falco.f
    public r h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("d63f81b0", new Object[]{this});
        }
        return this.b.z();
    }

    @Override // com.taobao.falco.f
    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5407e686", new Object[]{this});
        }
        return SceneIdentifier.getCurrentPageNameWithFragment();
    }

    public e k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("20a13e24", new Object[]{this});
        }
        return this.f10427a.h();
    }

    public k l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("d6fa3250", new Object[]{this});
        }
        return this.f10427a.l();
    }

    public long n(String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb46da26", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str) || (sharedPreferences = this.d) == null) {
            return -1L;
        }
        return sharedPreferences.getLong(str, -1L);
    }

    public void o(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc45c29d", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
            return;
        }
        if (!z2 && !z3 && !z4) {
            z6 = false;
        }
        this.i = z6;
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            this.h = tz8Var.d("falco_env", "env").g(System.currentTimeMillis()).a("MobileService");
        } else {
            ALog.e(TAG, "[init] tracer is null", null, new Object[0]);
        }
        this.f10427a.m(z2);
        this.c.l(z3);
        this.b.p(z4, z5);
        if (z) {
            new i(this).k();
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.h != null && !TextUtils.isEmpty(str)) {
            this.h.A(str);
        }
    }

    public hz8 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hz8) ipChange.ipc$dispatch("30a64ddc", new Object[]{this});
        }
        return this.c.o();
    }

    public void r(f.a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76704d38", new Object[]{this, aVarArr});
            return;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            try {
                ((f.b) it.next()).a(aVarArr);
            } catch (Exception e) {
                ALog.e(TAG, "[notify] error", null, e, new Object[0]);
            }
        }
    }

    public q s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("e620ff8e", new Object[]{this});
        }
        return this.f10427a.r();
    }

    public void v(String str, long j2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96076f85", new Object[]{this, str, new Long(j2)});
        } else if (!TextUtils.isEmpty(str) && (sharedPreferences = this.d) != null) {
            sharedPreferences.edit().putLong(str, j2).apply();
        }
    }

    public void w(f.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795d06cd", new Object[]{this, bVar});
        } else if (bVar != null) {
            crt.d(new g(this, bVar));
        }
    }

    public void x(f.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83630a", new Object[]{this, bVar});
        } else if (bVar != null) {
            crt.d(new h(this, bVar));
        }
    }

    public void u(Category category, String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba34c242", new Object[]{this, category, str});
            return;
        }
        b bVar2 = this.f;
        int i = a.$SwitchMap$com$taobao$falco$FalcoEnvironmentImpl$Category[category.ordinal()];
        if (i == 1) {
            bVar = new b(bVar2.b, str, bVar2.d);
        } else if (i == 2) {
            bVar = new b(str, bVar2.c, bVar2.d);
        } else if (i == 3) {
            bVar = new b(bVar2.b, bVar2.c, str);
        } else {
            return;
        }
        this.f = bVar;
        if (this.i) {
            if (!this.g) {
                this.g = true;
                DimensionSet create = DimensionSet.create();
                create.addDimension("falcoId");
                create.addDimension("visitFalcoId");
                create.addDimension("networkFalcoId");
                create.addDimension("sysLoadFalcoId");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("value");
                z61.i(MONITOR_MODULE, "falco_global", create2, create, true);
            }
            DimensionValueSet create3 = DimensionValueSet.create();
            create3.setValue("falcoId", bVar.f10428a);
            create3.setValue("visitFalcoId", bVar.b);
            create3.setValue("networkFalcoId", bVar.c);
            create3.setValue("sysLoadFalcoId", bVar.d);
            MeasureValueSet create4 = MeasureValueSet.create();
            create4.setValue("value", vu3.b.GEO_NOT_SUPPORT);
            z61.f(MONITOR_MODULE, "falco_global", create3, create4);
        }
        p("GlobalID Update|" + bVar);
    }
}

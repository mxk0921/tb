package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.falco.c;
import com.taobao.falco.d;
import com.taobao.falco.f;
import com.taobao.falco.l;
import com.taobao.falco.o;
import com.taobao.falco.p;
import com.taobao.falco.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ka8 implements b2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final int a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b0cd7b7", new Object[]{this, fVar})).intValue();
        }
        c d = fVar.d();
        if (d == null) {
            return -1;
        }
        return d.c;
    }

    public final int b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25eaf13c", new Object[]{this, fVar})).intValue();
        }
        d e = fVar.e();
        if (e == null) {
            return -1;
        }
        float f = e.b;
        if (f < 0.0f) {
            return -1;
        }
        if (f > 0.9d) {
            return 1;
        }
        return 0;
    }

    public Map<String, Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27dfff3", new Object[]{this});
        }
        if (!pxn.d().k()) {
            la8.c("elastic.ScheduleGrade", "getL2Environment disable.", new Object[0]);
            return Collections.emptyMap();
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            return Collections.emptyMap();
        }
        f environment = tz8Var.getEnvironment();
        if (environment == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("STO", Integer.valueOf(h(environment)));
        hashMap.put("MEM", Integer.valueOf(f(environment)));
        hashMap.put("CPU", Integer.valueOf(b(environment)));
        hashMap.put("TEMP", Integer.valueOf(i(environment)));
        hashMap.put("BP", Integer.valueOf(a(environment)));
        hashMap.put("CLE", Integer.valueOf(e(environment)));
        hashMap.put("ICL", Integer.valueOf(d(environment)));
        hashMap.put("PN", Integer.valueOf(g(environment)));
        return hashMap;
    }

    public final int d(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b3e7369", new Object[]{this, fVar})).intValue();
        }
        l a2 = fVar.a();
        if (a2 == null || TextUtils.isEmpty(a2.d)) {
            return -1;
        }
        if ("NEW".equals(a2.d)) {
            return 1;
        }
        if ("UPDATE".equals(a2.d)) {
            return 2;
        }
        return 0;
    }

    public final int e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c28a9651", new Object[]{this, fVar})).intValue();
        }
        l a2 = fVar.a();
        if (a2 == null || a2.b <= 0) {
            return -1;
        }
        if (System.currentTimeMillis() - a2.b < 5000) {
            return 1;
        }
        return 0;
    }

    public final int f(f fVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8037843", new Object[]{this, fVar})).intValue();
        }
        o b = fVar.b();
        if (b == null) {
            return -1;
        }
        long j = b.b;
        if (j < 0) {
            return -1;
        }
        long j2 = b.f10474a;
        if (j2 < 0 || (i = b.h) < 0) {
            return -1;
        }
        if (j / j2 < 0.1d || i == 1) {
            return 1;
        }
        return 0;
    }

    public final int g(f fVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e35340f6", new Object[]{this, fVar})).intValue();
        }
        p g = fVar.g();
        if (g == null || (i = g.k) < 0) {
            return -1;
        }
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    public final int h(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f609063", new Object[]{this, fVar})).intValue();
        }
        r h = fVar.h();
        if (h == null) {
            return -1;
        }
        long j = h.b;
        if (j < 0) {
            return -1;
        }
        if (j < 600) {
            return 1;
        }
        return 0;
    }

    public final int i(f fVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d7c5f0", new Object[]{this, fVar})).intValue();
        }
        c d = fVar.d();
        if (d == null || (i = d.d) < 0) {
            return -1;
        }
        if (i < 370) {
            return 0;
        }
        if (i < 400) {
            return 1;
        }
        if (i < 430) {
            return 2;
        }
        return 3;
    }
}

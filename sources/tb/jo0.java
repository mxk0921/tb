package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jo0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float EXCEPTION_SAMPLING = 1.0f;
    public static final float PERF_SAMPLING = 0.01f;

    static {
        t2o.a(301990014);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd46eefe", new Object[0]);
            return;
        }
        vm0.d(vm0.a.a("streamDataSuccessRate").tag("mainStreamData").branchEntry(true).sampling(0.01f));
        e("mainStreamData_pv", 0.01f);
    }

    public static void b(String str, long j, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ba4dee", new Object[]{str, new Long(j), new Long(j2), str2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        long j3 = j2 - j;
        HashMap hashMap = new HashMap();
        hashMap.put("cost", Long.valueOf(j3));
        vm0.h("steamDataCostMonitor", hashMap, arrayList, str2, 0.01f);
        rbb g = ck.g();
        g.f("stream请求二段包 耗时 = " + j3, ck.b.b().i("AURA/performance").d("start", j).d("end", j2).a());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6fa737", new Object[0]);
            return;
        }
        vm0.d(vm0.a.a("streamDataSuccessRate").tag("streamData").branchEntry(false).branch(1).sampling(0.01f));
        e("streamData_pv", 0.01f);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f5f401", new Object[]{str});
        } else {
            e(str, 1.0f);
        }
    }

    public static void e(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4570465e", new Object[]{str, new Float(f)});
        } else {
            vm0.d(vm0.a.a("streamDataTracker").message(str).sampling(f));
        }
    }
}

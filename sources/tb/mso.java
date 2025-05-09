package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mso {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mso INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final aso f24277a;

    static {
        aso asoVar;
        t2o.a(481296732);
        mso msoVar = new mso();
        INSTANCE = msoVar;
        if (lg4.i1()) {
            asoVar = new aso();
        } else {
            asoVar = null;
        }
        f24277a = asoVar;
        msoVar.b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c2f501", new Object[]{this});
            return;
        }
        jzu.m("pltScan", "scanMonitor", yz3.l("loadCostTime", "detectTime", "decodeTime"), yz3.l("detectResult", "decodeResult"));
        jzu.m("pltScan", "frameMonitor", xz3.e("frameDetectTime"), xz3.e("deviceLevel"));
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6051711", new Object[]{this, new Long(j)});
            return;
        }
        aso asoVar = f24277a;
        if (asoVar != null) {
            asoVar.c(j);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d98785", new Object[]{this});
            return;
        }
        aso asoVar = f24277a;
        if (asoVar != null) {
            long a2 = asoVar.a();
            asoVar.b();
            if (a2 > 0) {
                jzu.d("pltScan", "frameMonitor", a.k(jpu.a("frameDetectTime", Double.valueOf(a2))), a.k(jpu.a("deviceLevel", ri7.a())));
            }
        }
    }
}

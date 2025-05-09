package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static suh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suh) ipChange.ipc$dispatch("ee4b0975", new Object[0]);
        }
        return new tuh();
    }

    public static suh c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suh) ipChange.ipc$dispatch("58f7e0f", new Object[]{new Long(j)});
        }
        tuh tuhVar = new tuh();
        tuhVar.e(j);
        return tuhVar;
    }

    public static ith a(fvh fvhVar) {
        mth mthVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ith) ipChange.ipc$dispatch("45b8b021", new Object[]{fvhVar});
        }
        ArrayList arrayList = new ArrayList();
        if (fvhVar == null || !fvhVar.d("output_disable_tlog", false)) {
            arrayList.add(nth.h());
        } else {
            guh.a(guh.TAG, "降级:不输出 tlog ");
        }
        boolean z2 = fvhVar != null && fvhVar.d("output_disable_dp2", false);
        if (!cw6.b() && (fvhVar == null || !fvhVar.d("dp2_enable_detail_log", false))) {
            z = false;
        }
        if (z2) {
            guh.a(guh.TAG, "降级:不输出 dp2 ");
        } else {
            if (fvhVar == null || !fvhVar.d("output_disable_dp2_v2", false)) {
                mthVar = kth.i();
            } else {
                mthVar = jth.g();
            }
            mthVar.d(z);
            arrayList.add(mthVar);
        }
        return new ith(fvhVar, arrayList);
    }
}

package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t0s implements yyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public t0s() {
        AppMonitor.register("crash_life", "crash_life", MeasureSet.create(), DimensionSet.create().addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("type").addDimension("content"));
    }

    @Override // tb.yyi
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4511219c", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            AppMonitor.Stat.commit("crash_life", "crash_life", DimensionValueSet.create().setValue(v4s.PARAM_UPLOAD_STAGE, str).setValue("type", str2).setValue("content", str3), MeasureValueSet.create());
        } catch (Throwable th) {
            ehh.d(th);
        }
    }
}

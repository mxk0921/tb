package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vr6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final irs f30196a;

    static {
        t2o.a(487587921);
    }

    public vr6(xs6 xs6Var) {
        this.f30196a = new irs(xs6Var);
    }

    public void a(AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672a892", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData != null && awesomeGetData.getContainers() != null && !awesomeGetData.getContainers().isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f30196a.g(awesomeGetData);
            i65.c("DataPreProcess", "DataPreProcess TabProtocolProcess use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        }
    }
}

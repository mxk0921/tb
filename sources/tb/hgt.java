package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hgt implements ffc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782154);
        t2o.a(486539305);
    }

    @Override // tb.ffc
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4d6487", new Object[]{this, str, str2, map});
            return;
        }
        try {
            wri.d().b(str, str2, map);
        } catch (Exception e) {
            fve.e("HomeInfoFlowMessiah", "commitMonitor error: " + e);
        }
    }

    @Override // tb.ffc
    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b447c2dd", new Object[]{this, str, str2, map});
            return;
        }
        try {
            wri.d().a(str, str2, map);
        } catch (Exception e) {
            fve.e("HomeInfoFlowMessiah", "commitLog error: " + e);
        }
    }
}

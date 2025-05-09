package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ak7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15785a = new AtomicBoolean(false);

    static {
        t2o.a(989855819);
    }

    public static void a(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597f3436", new Object[]{file, new Boolean(z)});
        } else if (file != null && f15785a.compareAndSet(false, true)) {
            JSONObject a2 = new zj7(file).a();
            a2.put("oatSuccess", (Object) Boolean.valueOf(z));
            y71.commitSuccess("wv_oat_status", a2);
            v7t.i("DexOptimizer", "reportOatStatus: " + a2.toJSONString());
        }
    }
}

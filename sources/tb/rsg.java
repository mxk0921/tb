package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27582a;

    static {
        t2o.a(736100454);
        TimeUnit.HOURS.toSeconds(1L);
    }

    public rsg(JSONObject jSONObject) {
        this.f27582a = jSONObject;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7dac100", new Object[]{this})).intValue();
        }
        try {
            JSONObject jSONObject = this.f27582a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.getIntValue(oh2.BACK_GROUND_WAIT_SECONDS);
        } catch (Throwable th) {
            tm1.b("LinkedSplashDataExt", "getBackgroundWaitSeconds error", th);
            return 0;
        }
    }
}

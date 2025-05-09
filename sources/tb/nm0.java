package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nm0 implements ra6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989917);
        t2o.a(444596535);
    }

    @Override // tb.ra6
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("403ecf43", new Object[]{this})).longValue();
        }
        return SDKUtils.getCorrectionTimeMillis();
    }
}

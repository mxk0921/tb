package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.api.IABTestInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l0 implements IABTestInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23032a;

    static {
        t2o.a(456130656);
        t2o.a(456130603);
    }

    public l0(String str) {
        this.f23032a = str;
    }

    @Override // com.taobao.android.editionswitcher.api.IABTestInfo
    public String getNewBarVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c37f5f0a", new Object[]{this});
        }
        return this.f23032a;
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f31880a;
    public long b;
    public long c;
    public NetResponse d;
    public NetBaseOutDo e;

    static {
        t2o.a(806355986);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MtopResult{responseReceiveTS=" + this.f31880a + ", dataParseBegin=" + this.b + ", dataParseEnd=" + this.c + '}';
    }
}

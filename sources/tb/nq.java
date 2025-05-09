package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nq implements fjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809807);
        t2o.a(729808960);
    }

    @Override // tb.fjb
    public String build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5d594b", new Object[]{this});
        }
        return new mq().a(new exl()).a(new m7p()).b();
    }

    @Override // tb.fjb
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return "abTestInfo";
    }
}

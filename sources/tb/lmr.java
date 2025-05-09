package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lmr implements xmd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092378);
        t2o.a(806354977);
    }

    @Override // tb.xmd
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83c0f289", new Object[]{this, str});
        }
        return uuo.q(str);
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSUTCommitAction;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ivs implements zhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ivs INSTANCE = new ivs();

    static {
        t2o.a(1003487252);
        t2o.a(1002438830);
    }

    @Override // tb.zhc
    public void K(String str, String str2, String str3, String str4, Map<String, String> map, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c4c5d", new Object[]{this, str, str2, str3, str4, map, num});
            return;
        }
        ckf.g(str2, "arg1");
        mhr.h0().K(str, str2, str3, str4, map, num);
    }

    @Override // tb.zhc
    public void track4Click(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str2, "arg1");
        mhr.h0().track4Click(str, "Button-".concat(str2), map);
    }

    @Override // tb.zhc
    public void u(KSUTCommitAction kSUTCommitAction, g1a<? super c1g, xhv> g1aVar, g1a<? super Boolean, xhv> g1aVar2, g1a<? super n0g, xhv> g1aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c121ba88", new Object[]{this, kSUTCommitAction, g1aVar, g1aVar2, g1aVar3});
            return;
        }
        ckf.g(kSUTCommitAction, "action");
        mhr.h0().u(kSUTCommitAction, g1aVar, g1aVar2, g1aVar3);
    }
}

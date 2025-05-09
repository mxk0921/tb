package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.ai.AISearchWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class m6 implements hk4<ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISearchWidget f23805a;

    public m6(AISearchWidget aISearchWidget) {
        this.f23805a = aISearchWidget;
    }

    /* renamed from: a */
    public void accept(ja0 ja0Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
        } else {
            AISearchWidget.x2(this.f23805a, ja0Var);
        }
    }
}

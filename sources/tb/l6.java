package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.c;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.ai.AISearchWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l6 implements hk4<ja0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISearchWidget f23128a;

    public l6(AISearchWidget aISearchWidget) {
        this.f23128a = aISearchWidget;
    }

    /* renamed from: a */
    public void accept(ja0 ja0Var) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870eba5f", new Object[]{this, ja0Var});
        } else if (ja0Var != null) {
            c cVar = new c();
            Intent intent = this.f23128a.getActivity().getIntent();
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (data == null || (str = data.toString()) == null) {
                    str = "";
                }
                cVar.q(str);
            }
            cVar.r(SearchDoorActivity.PAGE_NAME);
            xjt.c(cVar, ja0Var.j, yak.f31939a, ja0Var.n);
        }
    }
}

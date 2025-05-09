package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q6t implements dkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092310);
        t2o.a(806354961);
    }

    @Override // tb.dkd
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91c55325", new Object[]{this})).intValue();
        }
        return R.style.tb_impl_dialog;
    }
}

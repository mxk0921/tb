package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.recommend.TTDetailRecommendComponent;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent;
import com.taobao.android.detail.ttdetail.utils.DataUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qg7 implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "guessyoulike";

    static {
        t2o.a(354418769);
        t2o.a(912261471);
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("b77b1e89", new Object[]{this, context, ze7Var, nb4Var, dataEntryArr});
        }
        if (!vbl.Z() || !DataUtils.T(ze7Var) || (nj7.h() && !vbl.f0())) {
            return new TTDetailRecommendComponent(context, ze7Var, nb4Var, dataEntryArr);
        }
        return new NewTTDetailRecommendComponent(context, ze7Var, nb4Var, dataEntryArr);
    }
}

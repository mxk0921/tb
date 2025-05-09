package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.LivePhotoComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nkj implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "headerlivephoto";

    static {
        t2o.a(912261386);
        t2o.a(912261471);
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("b77b1e89", new Object[]{this, context, ze7Var, nb4Var, dataEntryArr});
        }
        if (yc4.o(dataEntryArr)) {
            return new i2h(context, ze7Var, nb4Var, dataEntryArr);
        }
        return new LivePhotoComponent(context, ze7Var, nb4Var, dataEntryArr);
    }
}

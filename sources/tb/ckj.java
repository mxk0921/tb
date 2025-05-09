package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ckj implements uob<tx9> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "_tt_detail_header_frame_";

    static {
        t2o.a(912261383);
        t2o.a(912261471);
    }

    /* renamed from: b */
    public oa4<tx9> a(Context context, ze7 ze7Var, tx9 tx9Var, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("a60ae46e", new Object[]{this, context, ze7Var, tx9Var, dataEntryArr});
        }
        if (yc4.o(dataEntryArr)) {
            return new cy9(context, ze7Var, tx9Var, dataEntryArr);
        }
        return new sx9(context, ze7Var, tx9Var, dataEntryArr);
    }
}

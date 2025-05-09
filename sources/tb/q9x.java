package tb;

import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q9x implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "：）";

    static {
        t2o.a(912261390);
        t2o.a(912261471);
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        JSONObject f;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("b77b1e89", new Object[]{this, context, ze7Var, nb4Var, dataEntryArr});
        }
        if (!vbl.e1() || (f = nb4Var.f()) == null || (string = f.getString(UltronWeex2DialogFragment.WEEX2_URL)) == null) {
            return new r9x(context, ze7Var, nb4Var, dataEntryArr);
        }
        if (!string.contains(h8x.KEY_WEEX_MODE)) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", DataUtils.v((Item) ze7Var.e().f(Item.class)));
            bw7.b(hashMap, -600009, "weex2Url下发错误");
        }
        return new m2k(context, ze7Var, nb4Var, dataEntryArr);
    }
}

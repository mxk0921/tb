package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.nwb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class va6 implements nwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093325);
        t2o.a(806355668);
    }

    @Override // tb.nwb
    public void a(Context context, String str, nwb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62dd6388", new Object[]{this, context, str, aVar});
            return;
        }
        DXRootView a2 = w36.k().a(context, str);
        if (aVar != null) {
            aVar.a(a2);
        }
    }

    @Override // tb.nwb
    public DinamicXEngine getDynamicXEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("954c806f", new Object[]{this});
        }
        return w36.k().j();
    }

    @Override // tb.nwb
    public void renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e594c7e", new Object[]{this, dXRootView, jSONObject});
        } else {
            w36.k().h(dXRootView, jSONObject);
        }
    }
}

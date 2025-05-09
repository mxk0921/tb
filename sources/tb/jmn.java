package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jmn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f22081a;

    static {
        t2o.a(729809669);
        t2o.a(475004944);
    }

    public jmn(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f22081a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        List list;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.e("gateway2.expireTabs", "start action:", jSONObject.toJSONString());
        try {
            list = (List) jSONObject.get("containerIds");
            str = (String) jSONObject.get("expireType");
        } catch (Throwable th) {
            bqa.i("gateway2.expireTabs", th, new String[0]);
        }
        if (!(list == null || list.isEmpty() || TextUtils.isEmpty(str))) {
            for (Object obj : list) {
                if (obj != null) {
                    this.f22081a.a(obj.toString(), str);
                }
            }
            bqa.e("gateway2.expireTabs", "end action");
        }
    }
}

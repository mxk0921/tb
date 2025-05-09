package tb;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ve0 extends hu<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150677);
    }

    public ve0(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(ve0 ve0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/broadcast/cartRefresh/AddOnRefreshProcessor");
    }

    public final void d(String str) {
        List<gsb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9126638e", new Object[]{this, str});
            return;
        }
        IDMComponent u = this.f20898a.d().u("submit");
        if (u != null) {
            Map<String, List<gsb>> eventMap = u.getEventMap();
            boolean c = c();
            if (!(eventMap == null || (list = eventMap.get("updateCartAfterAdd")) == null)) {
                for (gsb gsbVar : list) {
                    if (TextUtils.equals(gsbVar.getType(), "updateCartAfterAdd")) {
                        gsbVar.writeFields("cartId", str);
                        lcu d = this.f20898a.g().d();
                        d.q("updateCartAfterAdd");
                        d.l(gsbVar.getType());
                        d.k(gsbVar);
                        d.i(u);
                        d.m("rebuildArea", Integer.valueOf(c ? 127 : 5));
                        this.f20898a.k0(u, d, true, null, null);
                    }
                }
            }
            if (!c) {
                return;
            }
            if (this.f20898a.d().L()) {
                imb h0 = this.f20898a.e().h0();
                if (h0 != null) {
                    h0.scrollToTop();
                    return;
                }
                return;
            }
            f8e f8eVar = (f8e) this.f20898a.T();
            if (f8eVar != null) {
                f8eVar.g().T().scrollToTop();
            }
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ceaca2", new Object[]{this})).booleanValue();
        }
        JSONObject f = sca.f(this.f20898a.d());
        if (f == null || f.getBoolean("needScrollToTop") == null) {
            return true;
        }
        return f.getBooleanValue("needScrollToTop");
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e77f0ae7", new Object[]{this, str})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("addBagExParamFromCartFeedFlow");
            if (string == null) {
                return false;
            }
            JSONObject jSONObject = (JSONObject) JSON.parse(Base64.decode(string, 0), new Feature[0]);
            boolean equals = this.f20898a.O().equals(jSONObject.getString("cartInstanceId"));
            if (equals && (jSONObject.get("popId") instanceof String)) {
                return true;
            }
            String string2 = parseObject.getString("cartId");
            if (equals) {
                d(string2);
            }
            return equals;
        } catch (Throwable th) {
            hav.a("AddOnRefreshProcessor", th.getMessage());
            return false;
        }
    }

    /* renamed from: e */
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b26344da", new Object[]{this, intent})).booleanValue();
        }
        String stringExtra = intent.getStringExtra("stringifyAddCartResult");
        return !TextUtils.isEmpty(stringExtra) && b(stringExtra);
    }
}

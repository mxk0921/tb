package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.QuerySimpleRightsInfoRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.QuerySimpleRightsInfoResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j8n extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean l = true;

    static {
        t2o.a(295698901);
    }

    public j8n(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(j8n j8nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/QueryRightListBusiness");
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f84640", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a7408c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void L(xea xeaVar, ItemCategory itemCategory, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61d43b9", new Object[]{this, xeaVar, itemCategory, new Boolean(z)});
            return;
        }
        QuerySimpleRightsInfoRequest querySimpleRightsInfoRequest = new QuerySimpleRightsInfoRequest();
        if (z) {
            querySimpleRightsInfoRequest.VERSION = "2.0";
        }
        querySimpleRightsInfoRequest.liveId = xeaVar.u();
        if (yga.N()) {
            querySimpleRightsInfoRequest.anchorId = xeaVar.g();
            if (xeaVar.n.g() != null) {
                querySimpleRightsInfoRequest.interactTypes = fkx.i(xeaVar.n.g());
            }
        }
        querySimpleRightsInfoRequest.liveSource = xeaVar.v();
        querySimpleRightsInfoRequest.entryLiveSource = xeaVar.m();
        querySimpleRightsInfoRequest.spm = xeaVar.z();
        if (itemCategory != null) {
            JSONObject jSONObject = (JSONObject) JSON.toJSON(itemCategory);
            querySimpleRightsInfoRequest.transParams = jSONObject;
            jSONObject.put("transType", (Object) "liveItemTab");
            querySimpleRightsInfoRequest.transParams.put("enableCountdown", (Object) "1");
        }
        querySimpleRightsInfoRequest.isNewPrivilege = true;
        C(1, querySimpleRightsInfoRequest, QuerySimpleRightsInfoResponse.class);
    }
}

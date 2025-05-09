package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wea extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GoodListSearchRequest l;

    static {
        t2o.a(295698859);
    }

    public wea(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(wea weaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/GoodListSearchBusiness");
    }

    public void K(xea xeaVar, String str, String str2, int i, int i2, List<ItemIdentifier> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad2a7f9", new Object[]{this, xeaVar, str, str2, new Integer(i), new Integer(i2), list, jSONObject});
            return;
        }
        GoodListSearchRequest goodListSearchRequest = new GoodListSearchRequest();
        this.l = goodListSearchRequest;
        goodListSearchRequest.anchorId = xeaVar.g();
        this.l.liveId = xeaVar.u();
        GoodListSearchRequest goodListSearchRequest2 = this.l;
        goodListSearchRequest2.n = i;
        goodListSearchRequest2.groupNum = i2;
        goodListSearchRequest2.searchWord = str;
        goodListSearchRequest2.searchType = str2;
        goodListSearchRequest2.transParams = xeaVar.B();
        this.l.liveSource = xeaVar.v();
        this.l.entryLiveSource = xeaVar.m();
        GoodListSearchRequest goodListSearchRequest3 = this.l;
        goodListSearchRequest3.matchNewVersion = "1";
        goodListSearchRequest3.itemIndexIdList = list;
        goodListSearchRequest3.searchTransferInfo = jSONObject;
        goodListSearchRequest3.isHighlight = xeaVar.Q();
        E(1, this.l, GoodListSearchResponse.class, false, true);
    }
}

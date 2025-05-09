package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterLiveItemResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodsItemCardQueryRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qga extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698864);
    }

    public qga(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(qga qgaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/GoodsItemCardQueryBusiness");
    }

    public void K(xea xeaVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6c1c80", new Object[]{this, xeaVar, str, str2});
            return;
        }
        GoodsItemCardQueryRequest goodsItemCardQueryRequest = new GoodsItemCardQueryRequest();
        goodsItemCardQueryRequest.liveId = xeaVar.n.f();
        goodsItemCardQueryRequest.itemIdList = str;
        goodsItemCardQueryRequest.liveSource = xeaVar.v();
        goodsItemCardQueryRequest.entryLiveSource = xeaVar.m();
        goodsItemCardQueryRequest.smallCardItemType = str2;
        E(1, goodsItemCardQueryRequest, EnterLiveItemResponse.class, false, true);
    }
}

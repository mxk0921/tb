package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qnf extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698866);
    }

    public qnf(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(qnf qnfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/ItemActionQueryBusiness");
    }

    public void K(xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6852d55", new Object[]{this, xeaVar, liveItem});
            return;
        }
        ItemActionQueryRequest itemActionQueryRequest = new ItemActionQueryRequest();
        itemActionQueryRequest.itemId = String.valueOf(liveItem.itemId);
        itemActionQueryRequest.recordId = liveItem.extendVal.secKillRecordId;
        itemActionQueryRequest.itemActionData = liveItem.itemActionData;
        if (!TextUtils.isEmpty(liveItem.asac)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", liveItem.asac);
            itemActionQueryRequest.asac = liveItem.asac;
            A(hashMap);
        }
        if (xeaVar != null) {
            itemActionQueryRequest.anchorId = xeaVar.n.b();
            itemActionQueryRequest.liveId = xeaVar.n.f();
            itemActionQueryRequest.entryLiveSource = xeaVar.m();
            itemActionQueryRequest.liveSource = xeaVar.v();
        }
        C(1, itemActionQueryRequest, ItemActionQueryResponse.class);
    }
}

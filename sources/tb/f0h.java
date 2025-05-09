package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f0h extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698880);
    }

    public f0h(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(f0h f0hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/LiveItemCategoriesBusiness");
    }

    public void K(xea xeaVar, List<String> list, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a970e6", new Object[]{this, xeaVar, list, new Boolean(z)});
            return;
        }
        LiveItemCategoriesRequest liveItemCategoriesRequest = new LiveItemCategoriesRequest();
        if (xeaVar != null) {
            liveItemCategoriesRequest.liveId = xeaVar.u();
            liveItemCategoriesRequest.anchorId = xeaVar.g();
            liveItemCategoriesRequest.userId = xeaVar.G();
            long j = xeaVar.m.b;
            if (j > 0) {
                str = Long.toString(j);
            } else {
                str = null;
            }
            liveItemCategoriesRequest.holdItemIds = str;
            if (!z) {
                liveItemCategoriesRequest.defaultCategoryId = xeaVar.m.f20663a;
            }
            liveItemCategoriesRequest.needPcg = xeaVar.c();
            if (xeaVar.H() == null || xeaVar.H().itemTransferInfo == null) {
                str2 = "";
            } else {
                str2 = xeaVar.H().itemTransferInfo.toJSONString();
            }
            liveItemCategoriesRequest.itemTransferInfo = str2;
            liveItemCategoriesRequest.liveSource = xeaVar.v();
            liveItemCategoriesRequest.entryLiveSource = xeaVar.m();
        }
        if (!(xeaVar == null || xeaVar.k == null)) {
            z2 = true;
        }
        liveItemCategoriesRequest.isFirst = !z2;
        liveItemCategoriesRequest.clientDefaultCategoryIds = list;
        liveItemCategoriesRequest.matchNewVersion = "1";
        C(1, liveItemCategoriesRequest, LiveItemCategoriesResponse.class);
    }
}

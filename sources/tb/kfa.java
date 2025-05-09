package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.PreSaleSubscribeRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kfa extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698863);
    }

    public kfa(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(kfa kfaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/GoodSubscribeBusiness");
    }

    public void K(long j, long j2, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4208c948", new Object[]{this, new Long(j), new Long(j2), new Boolean(z), str});
            return;
        }
        PreSaleSubscribeRequest preSaleSubscribeRequest = new PreSaleSubscribeRequest();
        preSaleSubscribeRequest.liveId = j;
        preSaleSubscribeRequest.itemId = j2;
        preSaleSubscribeRequest.source = str;
        if (z) {
            str2 = "add";
        } else {
            str2 = "cancel";
        }
        preSaleSubscribeRequest.ctl = str2;
        C(1, preSaleSubscribeRequest, TemplateListResponse.class);
    }
}

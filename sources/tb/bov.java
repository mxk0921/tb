package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.media.request.UrlListRequest;
import com.taobao.taolive.sdk.business.media.request.UrlListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bov extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356027);
    }

    public bov(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(bov bovVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/media/request/UrlListBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa9cdc8", new Object[]{this, str});
            return;
        }
        UrlListRequest urlListRequest = new UrlListRequest();
        urlListRequest.liveId = str;
        C(0, urlListRequest, UrlListResponse.class);
    }
}

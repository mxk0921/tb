package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.cdn.mtopget.CDNMessageGetRequest;
import com.taobao.taolive.message_sdk.cdn.mtopget.CDNMessageGetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vp2 extends mt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public vp2(b0d b0dVar, int i) {
        super(b0dVar, i, true);
    }

    public static /* synthetic */ Object ipc$super(vp2 vp2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/cdn/mtopget/CDNMessageGetBusiness");
    }

    public void r(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b9fe01", new Object[]{this, str, str2, str3});
            return;
        }
        CDNMessageGetRequest cDNMessageGetRequest = new CDNMessageGetRequest();
        cDNMessageGetRequest.setELiveId(str);
        cDNMessageGetRequest.setLastPullTime(Long.parseLong(str2));
        cDNMessageGetRequest.setCurrentTime(Long.parseLong(str3));
        n(1, cDNMessageGetRequest, CDNMessageGetResponse.class);
    }
}

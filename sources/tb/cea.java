package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.goodcard.GoodItemSubscribeRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cea extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092803);
    }

    public cea(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(cea ceaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/goodcard/GoodItemSubscribeBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f439aa", new Object[]{this, str, str2});
            return;
        }
        GoodItemSubscribeRequest goodItemSubscribeRequest = new GoodItemSubscribeRequest();
        goodItemSubscribeRequest.activityDetailId = str;
        goodItemSubscribeRequest.userId = str2;
        C(1, goodItemSubscribeRequest, TemplateListResponse.class);
    }
}

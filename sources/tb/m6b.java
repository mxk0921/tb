package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.hotItemSubscribe.HotItemSubscribeRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m6b extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698917);
    }

    public m6b(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(m6b m6bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/hotItemSubscribe/HotItemSubscribeBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f439aa", new Object[]{this, str, str2});
            return;
        }
        HotItemSubscribeRequest hotItemSubscribeRequest = new HotItemSubscribeRequest();
        hotItemSubscribeRequest.activityDetailId = str;
        hotItemSubscribeRequest.userId = str2;
        C(1, hotItemSubscribeRequest, TemplateListResponse.class);
    }
}

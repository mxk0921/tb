package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taolive.uikit.mtop.MtopTaobaoSocialFollowGuangAddRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nat extends ot1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093641);
    }

    public nat(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public static /* synthetic */ Object ipc$super(nat natVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/mtop/TaoliveFollowBusiness");
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b84796", new Object[]{this, str, str2, str3});
            return;
        }
        MtopTaobaoSocialFollowGuangAddRequest mtopTaobaoSocialFollowGuangAddRequest = new MtopTaobaoSocialFollowGuangAddRequest();
        mtopTaobaoSocialFollowGuangAddRequest.setTargetUserIdStr(str);
        mtopTaobaoSocialFollowGuangAddRequest.setOriginBiz("taobaozhibo");
        mtopTaobaoSocialFollowGuangAddRequest.setOriginPage(str3);
        a(0, mtopTaobaoSocialFollowGuangAddRequest, null);
    }
}

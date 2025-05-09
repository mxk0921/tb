package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendModel;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g44 extends dzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ITaoLiveKtCommentSend d;

    static {
        t2o.a(295699498);
        t2o.a(295699499);
    }

    public g44(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        ITaoLiveKtComponentOpenService iTaoLiveKtComponentOpenService = this.c;
        if (iTaoLiveKtComponentOpenService != null) {
            this.d = iTaoLiveKtComponentOpenService.getCommentSender();
        }
    }

    public static /* synthetic */ Object ipc$super(g44 g44Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/kmp/comment/send/CommentSendAdapter");
    }

    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e757d", new Object[]{this, str, map});
            return;
        }
        TaoLiveKtCommentSendModel taoLiveKtCommentSendModel = new TaoLiveKtCommentSendModel();
        taoLiveKtCommentSendModel.setContent(str);
        taoLiveKtCommentSendModel.setRenders(map);
        h(taoLiveKtCommentSendModel);
    }

    public void g(String str) {
        TaoLiveKtCommentSendModel fetchCommentActionSend;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2586259e", new Object[]{this, str});
            return;
        }
        ITaoLiveKtCommentSend iTaoLiveKtCommentSend = this.d;
        if (iTaoLiveKtCommentSend != null && (fetchCommentActionSend = iTaoLiveKtCommentSend.fetchCommentActionSend(str)) != null) {
            h(fetchCommentActionSend);
        }
    }

    public final void h(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3388d53", new Object[]{this, taoLiveKtCommentSendModel});
        } else if (this.d != null) {
            taoLiveKtCommentSendModel.setUserToken(cpr.J);
            taoLiveKtCommentSendModel.setFanLevel(m09.e().c());
            taoLiveKtCommentSendModel.setExtraFlag(fqu.d(giv.f().j(this.f18173a)));
            this.d.sendComment(taoLiveKtCommentSendModel, null);
        }
    }
}

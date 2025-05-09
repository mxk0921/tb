package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698667);
    }

    public static fzf a(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzf) ipChange.ipc$dispatch("41fe463", new Object[]{taoLiveKtCommentEntity});
        }
        fzf fzfVar = new fzf();
        fzfVar.f19644a = taoLiveKtCommentEntity;
        return fzfVar;
    }
}

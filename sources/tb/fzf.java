package tb;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentType;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TaoLiveKtCommentEntity f19644a;
    public List<SpannableString> b;
    public List<SpannableString> c;

    static {
        t2o.a(295698686);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4a7a23", new Object[]{this})).booleanValue();
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = this.f19644a;
        if (taoLiveKtCommentEntity == null || taoLiveKtCommentEntity.getCriticalModel() == null) {
            return false;
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da78a39c", new Object[]{this})).booleanValue();
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = this.f19644a;
        if (taoLiveKtCommentEntity == null || !taoLiveKtCommentEntity.enhancedTypeValue().equals("follow")) {
            return false;
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b0ec2d", new Object[]{this})).booleanValue();
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = this.f19644a;
        if (taoLiveKtCommentEntity == null || taoLiveKtCommentEntity.getCommentType() == null || !this.f19644a.getCommentType().equals(TaoLiveKtCommentType.Notice)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ad15622", new Object[]{this})).booleanValue();
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = this.f19644a;
        if (taoLiveKtCommentEntity == null || taoLiveKtCommentEntity.getCommentType() != TaoLiveKtCommentType.TopWelcome) {
            return false;
        }
        return true;
    }
}

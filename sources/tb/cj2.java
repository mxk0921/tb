package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.CommentBottomAnimateView;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cj2 extends os1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CommentBottomAnimateView j;
    public boolean k;
    public long l = 2000;
    public final Handler m = new jyw(this);

    static {
        t2o.a(295698627);
        t2o.a(806356161);
    }

    public cj2(Context context, View view, ux9 ux9Var) {
        super(context, view, ux9Var);
        g();
    }

    public static /* synthetic */ Object ipc$super(cj2 cj2Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1761213999:
                super.c((TaoLiveKtCommentEntity) objArr[0]);
                return null;
            case -962057402:
                super.e((TBLiveDataModel) objArr[0]);
                return null;
            case 550684522:
                super.b(((Number) objArr[0]).intValue());
                return null;
            case 668633093:
                super.a();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/AtBottom/BottomComponent");
        }
    }

    @Override // tb.os1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da8805", new Object[]{this});
            return;
        }
        super.a();
        f();
        this.m.removeCallbacksAndMessages(null);
    }

    @Override // tb.os1
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d2c76a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        CommentBottomAnimateView commentBottomAnimateView = this.j;
        if (commentBottomAnimateView != null) {
            commentBottomAnimateView.setVisibility(i);
        }
    }

    @Override // tb.os1
    public void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970601d1", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity == null) {
            o3s.b("BottomComponent", "entity is null");
        } else if (this.k) {
            this.m.removeCallbacksAndMessages(null);
            f();
        } else {
            super.c(taoLiveKtCommentEntity);
            this.l = taoLiveKtCommentEntity.getDisappearTime();
            this.j.setVisibility(0);
            this.j.doAnimation(R.id.message_follow_share_animate, this.e, this.f, this.c, this.d);
            j();
        }
    }

    @Override // tb.os1
    public void e(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a82b46", new Object[]{this, tBLiveDataModel});
        } else {
            super.e(tBLiveDataModel);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67eca014", new Object[]{this});
            return;
        }
        this.j.removeAllViews();
        this.j.setVisibility(8);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        CommentBottomAnimateView commentBottomAnimateView = (CommentBottomAnimateView) this.f25609a.findViewById(R.id.message_follow_share_animate);
        this.j = commentBottomAnimateView;
        ViewGroup.LayoutParams layoutParams = commentBottomAnimateView.getLayoutParams();
        Context context = this.b;
        layoutParams.width = hw0.b(context, hw0.t(context, liv.a(context)));
        this.j.setLayoutParams(layoutParams);
    }

    public final void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b620e3f0", new Object[]{this});
            return;
        }
        f3c h = this.c.h();
        fzf fzfVar = this.f;
        ux9 ux9Var = this.c;
        if (ux9Var != null) {
            str = ux9Var.C();
        } else {
            str = "";
        }
        h.c(uyg.EVENT_KMP_COMMENT_INSERT_COMMON, fzfVar, str);
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 2024) {
            f();
            h();
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec4276b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d81c31e", new Object[]{this});
            return;
        }
        this.m.removeMessages(yj4.MSG_AUTO_RECOMMEND);
        this.m.sendEmptyMessageDelayed(yj4.MSG_AUTO_RECOMMEND, this.l);
    }
}

package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jv0 extends os1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout j;
    public final Handler k = new jyw(this);
    public final ITaoLiveKtCommentShowPriority l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                jv0.f(jv0.this);
            }
        }
    }

    static {
        t2o.a(295698625);
        t2o.a(806356161);
    }

    public jv0(Context context, View view, ux9 ux9Var, ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        super(context, view, ux9Var);
        g();
        this.l = iTaoLiveKtCommentShowPriority;
    }

    public static /* synthetic */ void f(jv0 jv0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8af9d22", new Object[]{jv0Var});
        } else {
            jv0Var.h();
        }
    }

    public static /* synthetic */ Object ipc$super(jv0 jv0Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/AnchorResponse/AnchorResponseComponent");
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
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // tb.os1
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d2c76a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    @Override // tb.os1
    public void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970601d1", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity == null) {
            o3s.b("AnchorResponseComponent", "timerDriveToReloadData return");
        } else {
            super.c(taoLiveKtCommentEntity);
            this.k.post(new a());
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

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.j = (FrameLayout) this.f25609a.findViewById(R.id.message_anchor_response_container);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbc99b3", new Object[]{this});
        } else if (this.g.getDxData() != null) {
            BaseItemViewHolder a2 = this.e.a(this.f, this.j, this.c);
            a2.b0(this.f, this.d);
            this.j.removeAllViews();
            this.j.addView(a2.itemView);
            this.j.setVisibility(0);
            this.l.postAnchorResponseShow(true);
            if (TextUtils.equals(this.g.getDxBizType(), "liveCopilot")) {
                p44.g(this.g);
            }
            this.k.sendEmptyMessageDelayed(103, 10000L);
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 103) {
            i();
        }
    }

    public final void i() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebf2013", new Object[]{this});
            return;
        }
        this.j.setVisibility(8);
        f3c h = this.c.h();
        fzf fzfVar = this.f;
        ux9 ux9Var = this.c;
        if (ux9Var != null) {
            str = ux9Var.C();
        } else {
            str = "";
        }
        h.c(uyg.EVENT_KMP_COMMENT_INSERT_COMMON, fzfVar, str);
        this.l.postAnchorResponseShow(false);
    }
}

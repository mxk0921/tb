package tb;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.CommentBottomAnimateView;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import com.taobao.taobao.R;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q6b extends os1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CommentBottomAnimateView j;
    public final ITaoLiveKtCommentShowPriority m;
    public boolean n;
    public long l = 5000;
    public final jyw k = new jyw(this);

    static {
        t2o.a(295698642);
        t2o.a(806356161);
    }

    public q6b(Context context, View view, ux9 ux9Var, ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        super(context, view, ux9Var);
        g();
        this.m = iTaoLiveKtCommentShowPriority;
    }

    public static /* synthetic */ Object ipc$super(q6b q6bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1761213999) {
            super.c((TaoLiveKtCommentEntity) objArr[0]);
            return null;
        } else if (hashCode == 550684522) {
            super.b(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 668633093) {
            super.a();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/HotSale/HotSaleComponent");
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
        this.k.removeCallbacksAndMessages(null);
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
        } else if (taoLiveKtCommentEntity != null) {
            if (this.n) {
                f();
                this.k.removeCallbacksAndMessages(null);
                return;
            }
            super.c(taoLiveKtCommentEntity);
            this.l = taoLiveKtCommentEntity.getDisappearTime();
            this.j.setVisibility(0);
            this.j.doAnimation(R.id.message_bottom_hot_sale_animate, this.e, this.f, this.c, this.d);
            this.m.postHotSaleHidden(false);
            j(taoLiveKtCommentEntity);
            i();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbba7219", new Object[]{this});
            return;
        }
        this.j.removeAllViews();
        this.j.setVisibility(8);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e03fd0", new Object[]{this});
        } else {
            this.j = (CommentBottomAnimateView) this.f25609a.findViewById(R.id.message_bottom_hot_sale_animate);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec4276b", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 2024) {
            f();
            this.m.postHotSaleHidden(true);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d81c31e", new Object[]{this});
            return;
        }
        this.k.removeMessages(yj4.MSG_AUTO_RECOMMEND);
        this.k.sendEmptyMessageDelayed(yj4.MSG_AUTO_RECOMMEND, this.l);
    }

    public final void j(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a16574", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (taoLiveKtCommentEntity != null) {
            hashMap.put("item_id", String.valueOf(taoLiveKtCommentEntity.getItemId()));
            if (taoLiveKtCommentEntity.getDxData() != null) {
                hashMap.put("recom_reason", (String) taoLiveKtCommentEntity.getDxData().get("desc"));
            }
        }
        if (kkr.i().o() != null) {
            kkr.i().o().b("Show-commentBuyAtmosphere", hashMap);
        }
    }
}

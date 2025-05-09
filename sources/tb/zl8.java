package tb;

import android.content.Context;
import android.graphics.Paint;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.CommentBottomAnimateView;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zl8 extends os1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LinearLayout j;
    public CommentBottomAnimateView k;
    public final ITaoLiveKtCommentShowPriority l;
    public final jzf n;
    public TextView p;
    public boolean q;
    public long o = 5000;
    public final jyw m = new jyw(this);

    static {
        t2o.a(295698641);
        t2o.a(806356161);
    }

    public zl8(Context context, View view, ux9 ux9Var, ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        super(context, view, ux9Var);
        i();
        this.l = iTaoLiveKtCommentShowPriority;
        this.n = new jzf(ux9Var, context);
    }

    public static /* synthetic */ Object ipc$super(zl8 zl8Var, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/EveryBodySay/EveryBodySayComponent");
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
        if (this.j.getVisibility() == 0) {
            h();
        }
        this.m.removeCallbacksAndMessages(null);
        jzf jzfVar = this.n;
        if (jzfVar != null) {
            jzfVar.a();
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
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    @Override // tb.os1
    public void c(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970601d1", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity != null && !this.q && this.j != null && this.k != null && this.p != null) {
            super.c(taoLiveKtCommentEntity);
            this.o = taoLiveKtCommentEntity.getDisappearTime();
            if (this.j.getChildCount() == 0) {
                this.j.addView(this.k);
                this.j.addView(this.p);
            }
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            this.l.postEveryBodySayHidden(false);
            l(taoLiveKtCommentEntity);
            k();
            n();
        }
    }

    @Override // tb.os1
    public void e(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a82b46", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.e(tBLiveDataModel);
        this.n.b();
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5df2b198", new Object[]{this})).intValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(this.p.getTextSize());
        float measureText = paint.measureText(this.p.getText().toString());
        Context context = this.b;
        return (hw0.b(context, hw0.t(context, liv.a(context))) - hw0.b(this.b, 50.0f)) - ((int) measureText);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31f867c", new Object[]{this});
            return;
        }
        this.j.removeAllViews();
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 2024) {
            h();
            this.l.postEveryBodySayHidden(true);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.j = (LinearLayout) this.f25609a.findViewById(R.id.message_says_cluster_container);
        this.k = (CommentBottomAnimateView) this.f25609a.findViewById(R.id.taolive_everybody_says_animate_view);
        this.p = (TextView) this.f25609a.findViewById(R.id.taolive_chat_says_cluster_count);
    }

    public final /* synthetic */ void j(List list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642922ed", new Object[]{this, list, new Long(j)});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fzf fzfVar = (fzf) it.next();
            this.k.setMaxWidth(g());
            this.k.doAnimation(R.id.taolive_everybody_says_animate_view, this.e, fzfVar, this.c, this.d);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67878853", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f);
        this.n.d(arrayList, this.h, new yne() { // from class: tb.xl8
            @Override // tb.yne
            public final void a(List list, long j) {
                zl8.this.j(list, j);
            }
        });
    }

    public final void l(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc74b7b", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity.getCriticalModel() != null) {
            String countShow = taoLiveKtCommentEntity.getCriticalModel().getCountShow();
            this.p.setText("×" + countShow + " ");
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec4276b", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0942e0", new Object[]{this});
            return;
        }
        this.m.removeMessages(yj4.MSG_AUTO_RECOMMEND);
        this.m.sendEmptyMessageDelayed(yj4.MSG_AUTO_RECOMMEND, this.o);
    }
}

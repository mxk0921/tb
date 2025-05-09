package tb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qf1 extends os1 implements mde, ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LinearLayout j;
    public final jyw k = new jyw(this);
    public DXRootView l;

    static {
        t2o.a(295698628);
        t2o.a(295698645);
        t2o.a(806356161);
    }

    public qf1(Context context, View view, ux9 ux9Var) {
        super(context, view, ux9Var);
        j();
    }

    public static /* synthetic */ void g(qf1 qf1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53142a8", new Object[]{qf1Var});
        } else {
            qf1Var.n();
        }
    }

    public static /* synthetic */ DXRootView h(qf1 qf1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("c84f5070", new Object[]{qf1Var});
        }
        return qf1Var.l;
    }

    public static /* synthetic */ Object ipc$super(qf1 qf1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -962057402) {
            super.e((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == 668633093) {
            super.a();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/AtTop/AtTopComponent");
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
        DXRootView dXRootView = this.l;
        if (dXRootView != null) {
            dXRootView.setVisibility(8);
        }
        m();
        this.k.removeCallbacksAndMessages(null);
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

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 200) {
            i();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356070fb", new Object[]{this});
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(this.l.getHeight(), 0).setDuration(500L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.mf1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                qf1.this.k(valueAnimator);
            }
        });
        duration.addListener(new of1(this));
        duration.start();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.j = (LinearLayout) this.f25609a.findViewById(R.id.message_list_container);
        }
    }

    public final /* synthetic */ void k(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd0e8f7", new Object[]{this, valueAnimator});
            return;
        }
        DXRootView dXRootView = this.l;
        if (dXRootView != null) {
            ViewGroup.LayoutParams layoutParams = dXRootView.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.l.setLayoutParams(layoutParams);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36885e0", new Object[]{this});
            return;
        }
        this.j.removeView(this.l);
        if (this.c.j() != null && this.c.j().j() != null) {
            this.c.j().j().c(new xm6(this.l));
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e936ffbd", new Object[]{this});
            return;
        }
        this.k.post(new pf1(this));
        m();
    }

    public void o(fzf fzfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4759b", new Object[]{this, fzfVar});
        } else if (fzfVar != null) {
            l(fzfVar);
        }
    }

    public final void l(fzf fzfVar) {
        String templateName;
        Map<String, Object> dxData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcdf06d9", new Object[]{this, fzfVar});
            return;
        }
        TaoLiveKtCommentEntity taoLiveKtCommentEntity = fzfVar.f19644a;
        if (taoLiveKtCommentEntity != null && (templateName = taoLiveKtCommentEntity.getTemplateName()) != null && !templateName.isEmpty() && (dxData = fzfVar.f19644a.getDxData()) != null) {
            DinamicXEngine e = ikr.f().e();
            Context context = this.b;
            dxData.put("maxWidth", Integer.valueOf(pb6.A(e, context, liv.a(context))));
            if (!(this.c.j() == null || this.c.j().j() == null)) {
                xm6 a2 = this.c.j().j().a(templateName.hashCode());
                if (a2 != null) {
                    this.l = a2.a();
                } else {
                    this.l = d9m.n().createDX(this.b, templateName);
                }
            }
            if (this.l != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.l.getWidth(), this.l.getHeight());
                marginLayoutParams.setMargins(hw0.b(this.b, 12.0f), 0, hw0.b(this.b, 12.0f), 0);
                this.j.removeView(this.l);
                if (this.l.getParent() instanceof ViewGroup) {
                    o3s.b("AtTopComponent", "mDXRootView getParent: " + this.l.getParent() + ", mDXRootView getParent isAttachedToWindow: " + ((ViewGroup) this.l.getParent()).isAttachedToWindow());
                    ((ViewGroup) this.l.getParent()).removeView(this.l);
                }
                this.j.addView(this.l, 0, marginLayoutParams);
                d9m.n().renderDX(this.l, fqu.b(dxData));
                this.k.sendEmptyMessageDelayed(200, fzfVar.f19644a.getDisappearTime());
            }
        }
    }
}

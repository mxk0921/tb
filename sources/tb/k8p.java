package tb;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.view.BaseItemViewHolder;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.weex.common.Constants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k8p extends os1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout j;
    public boolean k;
    public jyw l;
    public Map<String, Object> m;

    static {
        t2o.a(295698662);
        t2o.a(806356161);
    }

    public k8p(Context context, View view, ux9 ux9Var) {
        super(context, view, ux9Var);
        h();
    }

    public static /* synthetic */ boolean f(k8p k8pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc17febe", new Object[]{k8pVar, new Boolean(z)})).booleanValue();
        }
        k8pVar.k = z;
        return z;
    }

    public static /* synthetic */ FrameLayout g(k8p k8pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("eba95f7e", new Object[]{k8pVar});
        }
        return k8pVar.j;
    }

    public static /* synthetic */ Object ipc$super(k8p k8pVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/component/SecurityWarning/SecurityWarningComponent");
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
        jyw jywVar = this.l;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        this.k = false;
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
            o3s.b("SecurityWarningComponent", "entity is null");
        } else if (!this.k) {
            super.c(taoLiveKtCommentEntity);
            Map<String, Object> dxData = taoLiveKtCommentEntity.getDxData();
            if (dxData == null) {
                o3s.b("SecurityWarningComponent", "dxData is null");
                return;
            }
            Object obj = dxData.get("permanent");
            if (!(obj instanceof String)) {
                return;
            }
            if (TextUtils.equals((String) obj, "true")) {
                l();
            } else {
                k(dxData);
            }
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

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.j = (FrameLayout) this.f25609a.findViewById(R.id.message_secure_warning);
        this.l = new jyw(this);
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        Map<String, Object> map = this.m;
        if (map != null) {
            long h = zqq.h((String) map.get("duration"));
            long h2 = zqq.h((String) this.m.get(Constants.Name.INTERVAL));
            int i = message.what;
            if (i == 100) {
                i();
                this.j.setVisibility(0);
                this.l.sendEmptyMessageDelayed(200, h * 1000);
            } else if (i == 200) {
                j();
                this.l.sendEmptyMessageDelayed(100, h2 * 1000);
            }
        }
    }

    public final void k(Map<String, Object> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbdec17", new Object[]{this, map});
            return;
        }
        Object obj = map.get("initDuration");
        if (obj instanceof String) {
            j = zqq.h((String) obj);
        } else {
            j = 0;
        }
        l();
        this.m = map;
        this.l.sendEmptyMessageDelayed(200, j * 1000);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc12dfd", new Object[]{this});
            return;
        }
        BaseItemViewHolder a2 = this.e.a(this.f, this.j, this.c);
        a2.b0(this.f, this.d);
        this.j.addView(a2.itemView);
        this.j.setVisibility(0);
        i();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777426e1", new Object[]{this});
            return;
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(this.j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.j.getMeasuredHeight(), Integer.MIN_VALUE));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, "translationY", this.j.getMeasuredHeight(), 0.0f).setDuration(300L);
        duration.addListener(new i8p(this));
        duration.start();
        this.k = true;
        this.j.requestLayout();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db333965", new Object[]{this});
            return;
        }
        this.j.measure(View.MeasureSpec.makeMeasureSpec(this.j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.j.getMeasuredHeight(), Integer.MIN_VALUE));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.j, "translationY", 0.0f, this.j.getMeasuredHeight()).setDuration(300L);
        duration.addListener(new j8p(this));
        duration.start();
        this.k = true;
        this.j.requestLayout();
    }
}

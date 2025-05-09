package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.view.systemcomponent.IntimacyParams;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ogf implements aeb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f25374a;
    public final BaseFrame b;
    public final String c;

    static {
        t2o.a(779092966);
        t2o.a(806356572);
    }

    public ogf(ux9 ux9Var, BaseFrame baseFrame) {
        this.c = null;
        this.f25374a = ux9Var;
        this.b = baseFrame;
        if (ux9Var != null) {
            this.c = ux9Var.C();
        }
    }

    @Override // tb.aeb
    public ViewGroup A(Context context) {
        ATaoLiveOpenEntity A;
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9040c0b3", new Object[]{this, context});
        }
        ux9 ux9Var = this.f25374a;
        if (!(ux9Var == null || ((air) ux9Var).A() == null || (A = ((air) this.f25374a).A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
            View m = ((rbt) A.uiCompontent).b().m();
            if (m instanceof ViewGroup) {
                return (ViewGroup) m;
            }
        }
        return iba.c(context, vx9.f(this.f25374a));
    }

    @Override // tb.aeb
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{this, context})).booleanValue();
        }
        return vc.i(context);
    }

    @Override // tb.aeb
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{this, context})).booleanValue();
        }
        return vc.e(context);
    }

    /* renamed from: c */
    public IntimacyParams r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntimacyParams) ipChange.ipc$dispatch("ffde9303", new Object[]{this});
        }
        IntimacyParams intimacyParams = new IntimacyParams();
        VideoInfo c0 = up6.c0(this.f25374a);
        FandomInfo B = up6.B(this.f25374a);
        if (c0 != null) {
            intimacyParams.isFandom = false;
            intimacyParams.liveId = c0.liveId;
            intimacyParams.roomType = c0.roomType;
            intimacyParams.shopHasVip = c0.shopHasVip;
            intimacyParams.shopVip = c0.shopVip;
            AccountInfo accountInfo = c0.broadCaster;
            if (accountInfo != null) {
                intimacyParams.follow = accountInfo.follow;
                intimacyParams.accountId = accountInfo.accountId;
            }
        } else if (B != null) {
            intimacyParams.isFandom = true;
            intimacyParams.liveId = B.id;
            AccountInfo accountInfo2 = B.broadCaster;
            if (accountInfo2 != null) {
                intimacyParams.follow = accountInfo2.follow;
                intimacyParams.accountId = accountInfo2.accountId;
            }
        }
        intimacyParams.liveSource = iba.B(vx9.f(this.f25374a));
        ux9 ux9Var = this.f25374a;
        if (ux9Var instanceof air) {
            intimacyParams.spm = ((air) ux9Var).j().k().q().E();
        }
        return intimacyParams;
    }

    @Override // tb.aeb
    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57a00234", new Object[]{this});
        }
        return up6.J(this.f25374a);
    }

    @Override // tb.aeb
    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4deeec16", new Object[]{this});
        }
        if (this.f25374a.x() != null) {
            return this.f25374a.x().b();
        }
        return null;
    }

    @Override // tb.aeb
    public View q(String str) {
        BaseFrame baseFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("96633c31", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (baseFrame = this.b) == null) {
            return null;
        }
        return baseFrame.getViewByName(str);
    }

    @Override // tb.aeb
    public void s(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23752b1a", new Object[]{this, context, str, new Boolean(z)});
        } else {
            eba.b(context, str, z);
        }
    }

    @Override // tb.aeb
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e850742", new Object[]{this})).booleanValue();
        }
        return sj9.s();
    }

    @Override // tb.aeb
    public int u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4907c1ea", new Object[]{this, context})).intValue();
        }
        return vc.b(context);
    }

    @Override // tb.aeb
    public void v(b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6592023", new Object[]{this, b3dVar});
        } else if (this.f25374a.x() != null) {
            this.f25374a.x().h(this.f25374a, b3dVar);
        }
    }

    @Override // tb.aeb
    public void w(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eec5e7", new Object[]{this, jSONObject});
        } else {
            sjr.g().c(uyg.EVENT_RANK_LIVE_ENTRANCE_DATA, jSONObject, this.c);
        }
    }

    @Override // tb.aeb
    public void x(b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb2a90a", new Object[]{this, b3dVar});
        } else if (this.f25374a.x() != null) {
            this.f25374a.x().E(this.f25374a, b3dVar);
        }
    }

    @Override // tb.aeb
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af106d7e", new Object[]{this, str});
        } else {
            m09.e().g(str);
        }
    }

    @Override // tb.aeb
    public void z(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe99981", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", str);
        intent.putExtra("param", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}

package tb;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Atmosphere.AtmosphereView;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xf1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f31343a;
    public final Context b;
    public boolean c = true;
    public jyw d;
    public AtmosphereView e;
    public AtmosphereView f;
    public AtmosphereView g;

    static {
        t2o.a(295698631);
        t2o.a(806356161);
    }

    public xf1(Context context, View view) {
        this.b = context;
        this.f31343a = view;
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da8805", new Object[]{this});
        } else {
            b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e1e70e", new Object[]{this});
            return;
        }
        AtmosphereView atmosphereView = this.e;
        if (atmosphereView != null) {
            atmosphereView.hideWithAnimation();
            this.e.releaseAnimation();
        }
        AtmosphereView atmosphereView2 = this.f;
        if (atmosphereView2 != null) {
            atmosphereView2.hideWithAnimation();
            this.f.releaseAnimation();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.e = (AtmosphereView) this.f31343a.findViewById(R.id.enter_room_message_view0_atmosphere);
        this.f = (AtmosphereView) this.f31343a.findViewById(R.id.enter_room_message_view1_atmosphere);
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d2c76a", new Object[]{this, new Integer(i)});
            return;
        }
        AtmosphereView atmosphereView = this.g;
        if (atmosphereView != null) {
            atmosphereView.setVisibility(i);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d16f242", new Object[]{this});
        } else if (this.g.equals(this.e)) {
            this.e.showWithAnimation();
            this.f.hideWithAnimation();
            this.g = this.f;
        } else {
            this.f.showWithAnimation();
            this.e.hideWithAnimation();
            this.g = this.e;
        }
    }

    public void f(ITaoLiveKtEnterAtmosphereEntity iTaoLiveKtEnterAtmosphereEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e3c94c", new Object[]{this, iTaoLiveKtEnterAtmosphereEntity});
        } else if (this.c) {
            this.c = iTaoLiveKtEnterAtmosphereEntity.getCanInterrupt();
            this.d.removeMessages(2025);
            this.d.sendEmptyMessageDelayed(2025, iTaoLiveKtEnterAtmosphereEntity.getDisappearTime());
            this.g.setAtmosphereModel(new ig1(this.b, iTaoLiveKtEnterAtmosphereEntity));
            e();
        }
    }

    public void g(hp3 hp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0059bb", new Object[]{this, hp3Var});
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f31d38d", new Object[]{this});
            return;
        }
        this.d = new jyw(this);
        AtmosphereView atmosphereView = this.e;
        if (atmosphereView != null) {
            atmosphereView.setVisibility(4);
        }
        AtmosphereView atmosphereView2 = this.f;
        if (atmosphereView2 != null) {
            atmosphereView2.setVisibility(4);
        }
        this.g = this.e;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 2025) {
            this.c = !this.c;
        }
    }
}

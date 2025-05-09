package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.lat;
import tb.t4l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pat extends lat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092920);
    }

    public pat(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, ux9 ux9Var, lat.a aVar) {
        super(baseFrame, viewGroup, k0eVar, context, tBLiveDataModel, z, ux9Var, aVar);
    }

    public static /* synthetic */ Object ipc$super(pat patVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/player/screenstyle/TaoliveFullRoomScreen");
    }

    @Override // tb.lat
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46110dd0", new Object[]{this});
        } else if (this.f23215a != null && this.h != null) {
            up6.O0(this.g, this.i);
            ((t4l.a) this.h).f(false);
            VideoInfo e = cxg.e(this.f);
            if (this.d != null) {
                if (!hw0.r(this.e) || this.g) {
                    this.d.y();
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((hw0.f() * 9) / 16, -1);
                    layoutParams.gravity = 17;
                    this.d.v(layoutParams);
                    if (e != null) {
                        ((t4l.a) this.h).d(e.backgroundImageURL);
                    }
                }
                BaseFrame baseFrame = this.f23215a;
                if (baseFrame instanceof m8c) {
                    ((m8c) baseFrame).setBackView(this.d.getContentView());
                }
            }
            if (!pvs.a3()) {
                c(this.g);
            }
            ((t4l.a) this.h).e(this.f23215a);
            up6.O0(this.g, this.i);
        }
    }

    public final /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845c310b", new Object[]{this});
            return;
        }
        k0e k0eVar = this.d;
        PlayerController2 g = k0eVar != null ? k0eVar.g() : null;
        if (g != null) {
            o3s.b(PlayerController2.TAG, "setDefaultControllerHolder前 ");
            g.setDefaultControllerHolder(this.i);
            g.hideController();
        }
    }

    public lat i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lat) ipChange.ipc$dispatch("d608f62c", new Object[]{this});
        }
        BaseFrame a2 = ((t4l.a) this.h).a();
        this.f23215a = a2;
        if (a2 != null && (!d9m.l().isInstanceOfFullScreenReplayFrame2(this.f23215a) || this.f23215a.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f23215a);
            this.f23215a.onDestroy();
            this.f23215a = null;
            try {
                this.c.removeAllViews();
            } catch (Exception e) {
                x5t.j("TaoliveFullRoomScreen", "setupReplayRoomScreen EXP: " + e.getMessage());
            }
        }
        if (this.f23215a == null) {
            BaseFrame createFullScreenReplayFrame2 = d9m.l().createFullScreenReplayFrame2(this.e, this.g, this.f, this.i);
            this.f23215a = createFullScreenReplayFrame2;
            if (createFullScreenReplayFrame2 != null) {
                createFullScreenReplayFrame2.onCreateView2(this.c);
                this.b.addComponent(this.f23215a);
            }
        }
        ((t4l.a) this.h).e(this.f23215a);
        return this;
    }

    public lat h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lat) ipChange.ipc$dispatch("25601ec7", new Object[]{this});
        }
        BaseFrame a2 = ((t4l.a) this.h).a();
        this.f23215a = a2;
        if (a2 != null && (!d9m.l().isInstanceOfFullScreenLiveFrame2(this.f23215a) || this.f23215a.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f23215a);
            this.f23215a.onDestroy();
            this.f23215a = null;
            try {
                this.c.removeAllViews();
            } catch (Exception e) {
                x5t.j("TaoliveFullRoomScreen", "setupLiveRoomScreen EXP: " + e.getMessage());
            }
        }
        if (this.f23215a == null) {
            BaseFrame createFullScreenLiveFrame2 = d9m.l().createFullScreenLiveFrame2(this.e, this.g, this.f, this.i);
            this.f23215a = createFullScreenLiveFrame2;
            if (createFullScreenLiveFrame2 != null) {
                createFullScreenLiveFrame2.onCreateView2(this.c);
                this.b.addComponent(this.f23215a);
            }
        }
        ((t4l.a) this.h).e(this.f23215a);
        o3s.b(PlayerController2.TAG, "setupLiveRoomScreen ");
        ADaemon.postMainLooper(new Runnable() { // from class: tb.oat
            @Override // java.lang.Runnable
            public final void run() {
                pat.this.g();
            }
        }, new long[0]);
        return this;
    }
}

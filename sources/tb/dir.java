package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17852a;
    public Context b;
    public air c;
    public final View d;
    public RoomPlayerObserver e;
    public bgl f;
    public l3h g;
    public fgv h;

    static {
        t2o.a(779092929);
    }

    public dir(String str, air airVar, Context context, View view) {
        this.f17852a = str;
        this.c = airVar;
        this.b = context;
        this.d = view;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        RoomPlayerObserver roomPlayerObserver = this.e;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.e();
        }
        bgl bglVar = this.f;
        if (bglVar != null) {
            bglVar.c();
            this.f = null;
        }
        l3h l3hVar = this.g;
        if (l3hVar != null) {
            l3hVar.C();
        }
        fgv fgvVar = this.h;
        if (fgvVar != null) {
            fgvVar.m();
            this.h = null;
            air airVar = this.c;
            if (airVar != null) {
                airVar.u0(null);
            }
        }
        this.b = null;
        this.c = null;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ae4c66", new Object[]{this});
            return;
        }
        air airVar = this.c;
        if (!(airVar == null || airVar.A() == null || this.c.A().bizCode == null)) {
            TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(this.c.A().bizCode);
        }
        if (this.g == null) {
            this.g = new l3h(this.b, this.d, this.c);
        }
        air airVar2 = this.c;
        if (airVar2 instanceof cdr) {
            ((cdr) airVar2).h0 = this.g;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75cb5cc", new Object[]{this});
        } else if (this.c != null) {
            air airVar = this.c;
            airVar.i0(new mqr(airVar));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36be349", new Object[]{this});
            return;
        }
        RoomPlayerObserver roomPlayerObserver = new RoomPlayerObserver(this.f17852a);
        this.e = roomPlayerObserver;
        air airVar = this.c;
        if (airVar != null) {
            airVar.P0(roomPlayerObserver);
            if (this.c.w0() != null) {
                this.e.B(this.c.w0().liveId);
                if (this.c.w0().initParams != null) {
                    this.e.D(this.c.w0().initParams.get("livesource"));
                }
            }
        }
        this.e.z(up6.r(this.c));
        this.e.C("LiveRoom");
        this.e.A(up6.w(this.c));
        this.e.d();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac762589", new Object[]{this});
        } else if (this.c != null) {
            fgv fgvVar = new fgv();
            this.h = fgvVar;
            fgvVar.f(this.b, this.c);
            this.c.u0(this.h);
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue();
        }
        if (this.f17852a == null || this.c == null || this.b == null || this.d == null) {
            return false;
        }
        return true;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (f()) {
            a();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else if (f()) {
            v2s.o().A().a("TBLiveRoomEngine", "onDidAppear");
            RoomPlayerObserver roomPlayerObserver = this.e;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.M(RoomPlayerObserver.CommonRoomEventType.COMPONENT_DID_APPEAR);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
        } else if (f()) {
            RoomPlayerObserver roomPlayerObserver = this.e;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.M(RoomPlayerObserver.CommonRoomEventType.COMPONENT_DID_DISAPPEAR);
            }
            a();
        }
    }

    public void j() {
        RoomPlayerObserver roomPlayerObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
        } else if (f()) {
            if (!(this.c == null || (roomPlayerObserver = this.e) == null)) {
                roomPlayerObserver.q();
                if (this.c.x() != null) {
                    this.e.I(this.c.x().w());
                }
            }
            if (ejr.h()) {
                k6m b = l6m.c().b(this.f17852a);
                air airVar = this.c;
                if (!(airVar == null || airVar.x() == null || b == null)) {
                    b.g = this.c.x().w();
                }
                l6m.c().h(this.f17852a);
            }
        }
    }

    public void k() {
        RoomPlayerObserver roomPlayerObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcab476", new Object[]{this});
        } else if (f() && (roomPlayerObserver = this.e) != null) {
            roomPlayerObserver.j();
        }
    }

    public void l(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5520b5", new Object[]{this, videoInfo});
        } else if (f()) {
            q(videoInfo);
            if (this.c.j() != null) {
                this.c.j().g0(videoInfo);
            }
            RoomPlayerObserver roomPlayerObserver = this.e;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.J(videoInfo.roomStatus);
                this.e.K(videoInfo.streamStatus);
                this.e.y(videoInfo.dataSource);
                this.e.k();
            }
            bgl bglVar = new bgl(this.c);
            this.f = bglVar;
            bglVar.d(videoInfo);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (f()) {
            e7w.o(this.c);
            RoomPlayerObserver roomPlayerObserver = this.e;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.g();
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (f()) {
            e7w.p(this.c);
            RoomPlayerObserver roomPlayerObserver = this.e;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.f();
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        } else if (f()) {
            d();
            r();
            b();
            c();
            e();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
        } else if (f()) {
            a();
        }
    }

    public final void q(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f926b33a", new Object[]{this, videoInfo});
        } else {
            qmh.f().f.a("liveRoom", smh.switchModel, videoInfo);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8067679", new Object[]{this});
        } else {
            qmh.f().f.a("liveRoom", smh.switchModel, this.c.w0());
        }
    }
}

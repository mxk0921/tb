package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.sdk.core.SingleRoomManageEngine;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cdr extends air {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecModel g0;
    public l3h h0;
    public xtt k0;
    public q1o l0;
    public RedPacketRainResponse.RedPacketInfo m0;
    public JSONObject n0;
    public boolean o0;
    public boolean p0;
    public v73 u0;
    public IMediaPlayer.AspectRatio i0 = null;
    public boolean j0 = false;
    public boolean q0 = false;
    public boolean r0 = false;
    public boolean s0 = false;
    public int t0 = -1;

    static {
        t2o.a(779092869);
    }

    public cdr() {
        this.l = new SingleRoomManageEngine(this);
    }

    public static /* synthetic */ Object ipc$super(cdr cdrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 419200429) {
            return super.q();
        }
        if (hashCode == 1453041639) {
            return super.h();
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/controller2/TBFrameContext");
    }

    @Override // tb.ux9
    public n9e E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9e) ipChange.ipc$dispatch("527b8c5c", new Object[]{this});
        }
        return K0();
    }

    public void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49f0285", new Object[]{this});
            return;
        }
        this.m0 = null;
        this.n0 = null;
    }

    public v73 S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v73) ipChange.ipc$dispatch("1600a606", new Object[]{this});
        }
        return this.u0;
    }

    public int T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d6c1814", new Object[]{this})).intValue();
        }
        return this.t0;
    }

    public IMediaPlayer.AspectRatio U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer.AspectRatio) ipChange.ipc$dispatch("ef0c2062", new Object[]{this});
        }
        return this.i0;
    }

    /* renamed from: V0 */
    public RecModel w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("733b4e04", new Object[]{this});
        }
        return this.g0;
    }

    public RedPacketRainResponse.RedPacketInfo W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedPacketRainResponse.RedPacketInfo) ipChange.ipc$dispatch("1b9f71e7", new Object[]{this});
        }
        return this.m0;
    }

    public JSONObject X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61d7128e", new Object[]{this});
        }
        return this.n0;
    }

    public boolean Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1146f844", new Object[]{this})).booleanValue();
        }
        return this.o0;
    }

    public boolean Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cd118be", new Object[]{this})).booleanValue();
        }
        return this.r0;
    }

    public boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478d0cb6", new Object[]{this})).booleanValue();
        }
        return this.s0;
    }

    public boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13c754b0", new Object[]{this})).booleanValue();
        }
        return this.q0;
    }

    @Override // tb.ux9
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b15fa0", new Object[]{this})).booleanValue();
        }
        cba cbaVar = this.Z;
        if (!(cbaVar instanceof dba) || !((dba) cbaVar).r0()) {
            return false;
        }
        return true;
    }

    public boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3691f2b", new Object[]{this})).booleanValue();
        }
        return this.j0;
    }

    public void d1(v73 v73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642333ae", new Object[]{this, v73Var});
        } else {
            this.u0 = v73Var;
        }
    }

    public void e1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e62a5cc", new Object[]{this, new Boolean(z)});
        } else {
            this.o0 = z;
        }
    }

    public void f1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa098092", new Object[]{this, new Boolean(z)});
        } else {
            this.r0 = z;
        }
    }

    public void g1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9688362a", new Object[]{this, new Boolean(z)});
        } else {
            this.s0 = z;
        }
    }

    @Override // tb.ux9
    public f3c h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3c) ipChange.ipc$dispatch("569ba7e7", new Object[]{this});
        }
        f3c h = super.h();
        if (h != null) {
            return h;
        }
        return sjr.g();
    }

    public void h1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f254cf", new Object[]{this, str});
        }
    }

    public void i1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2504a570", new Object[]{this, new Boolean(z)});
        } else {
            this.q0 = z;
        }
    }

    public void j1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5c1e76", new Object[]{this, new Integer(i)});
        } else {
            this.t0 = i;
        }
    }

    public void k1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a88890", new Object[]{this, new Boolean(z)});
        } else {
            this.j0 = z;
        }
    }

    public void l1(IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53bcfee", new Object[]{this, aspectRatio});
        } else {
            this.i0 = aspectRatio;
        }
    }

    public void m1(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f073126", new Object[]{this, recModel});
        } else {
            this.g0 = recModel;
        }
    }

    public void n1(RedPacketRainResponse.RedPacketInfo redPacketInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c6e93", new Object[]{this, redPacketInfo});
        } else {
            this.m0 = redPacketInfo;
        }
    }

    public void o1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d9e22a", new Object[]{this, jSONObject});
        } else {
            this.n0 = jSONObject;
        }
    }

    @Override // tb.ux9
    public jlc q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlc) ipChange.ipc$dispatch("18fc7dad", new Object[]{this});
        }
        return super.q();
    }

    @Override // tb.ux9
    public hmc t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmc) ipChange.ipc$dispatch("825cd674", new Object[]{this});
        }
        return this.l;
    }
}

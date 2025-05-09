package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cba extends cv1 implements be7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map C;
    public String D;
    public Map<String, String> E;
    public String F;
    public Context G;
    public int H = -1;
    public boolean I = true;
    public Object J = null;
    public boolean K = false;
    public final HashMap<String, String> L = new HashMap<>();
    public boolean M;
    public boolean N;
    public boolean O;
    public String P;
    public Map<String, String> Q;
    public VideoInfo R;
    public boolean S;
    public boolean T;
    public boolean U;
    public String V;
    public boolean W;
    public boolean X;

    static {
        t2o.a(779093429);
        t2o.a(779093428);
    }

    public cba(Context context) {
        this.G = context;
    }

    public static /* synthetic */ Object ipc$super(cba cbaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/controller/GlobalContext");
    }

    public boolean L() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800ca6", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish);
    }

    public boolean M() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd2f1c54", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams);
    }

    public boolean N() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b91706", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return true;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer);
    }

    public boolean O() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a1c8e2", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event);
    }

    public boolean P() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("513d9a3d", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible);
    }

    public boolean Q() {
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93f266a1", new Object[]{this})).booleanValue();
        }
        if (!this.K || (aTaoliveOpenLiveRoomEntity = this.z) == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd);
    }

    public boolean R() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e8a8b40", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd);
    }

    public Context S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.G;
    }

    public VideoInfo T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("a03221e3", new Object[]{this});
        }
        return this.R;
    }

    public Map U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fabbe4d", new Object[]{this});
        }
        return this.C;
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4155f921", new Object[]{this});
        }
        return this.D;
    }

    public Map<String, String> W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3f3c9ed7", new Object[]{this});
        }
        if (this.E == null) {
            this.E = new HashMap();
        }
        return this.E;
    }

    public azg X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (azg) ipChange.ipc$dispatch("8be4909c", new Object[]{this});
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (!(aTaoliveOpenLiveRoomEntity instanceof ATaoLiveOpenEntity) || ((ATaoLiveOpenEntity) aTaoliveOpenLiveRoomEntity).taoliveOpenContext == null) {
            return null;
        }
        return ((ATaoLiveOpenEntity) aTaoliveOpenLiveRoomEntity).taoliveOpenContext.b();
    }

    public String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2134d6ad", new Object[]{this});
        }
        return this.V;
    }

    public HashMap<String, String> Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e54f9697", new Object[]{this});
        }
        return this.L;
    }

    public void a0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.G = context;
        }
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f045d8e1", new Object[]{this})).booleanValue();
        }
        return this.S;
    }

    public boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e636dec", new Object[]{this})).booleanValue();
        }
        return this.T;
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecdb171e", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    @Override // tb.be7
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.G = null;
        for (Object obj : ((ConcurrentHashMap) this.h).values()) {
            if (obj instanceof be7) {
                ((be7) obj).destroy();
            }
        }
        this.A.clear();
        nkr nkrVar = this.w;
        if (nkrVar != null) {
            nkrVar.a();
            this.w = null;
        }
    }

    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ef3bc75", new Object[]{this})).booleanValue();
        }
        return this.W;
    }

    public boolean f0() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8332f3af", new Object[]{this})).booleanValue();
        }
        ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity = this.z;
        if (aTaoliveOpenLiveRoomEntity == null || (azdVar = aTaoliveOpenLiveRoomEntity.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF);
    }

    public void g0(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b0069b", new Object[]{this, videoInfo});
        } else {
            this.R = videoInfo;
        }
    }

    public void h0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750fb679", new Object[]{this, map});
        } else {
            this.C = map;
        }
    }

    public void i0(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        jbt jbtVar;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d92f4f", new Object[]{this, aTaoliveOpenLiveRoomEntity});
        } else if ((aTaoliveOpenLiveRoomEntity instanceof TaoliveOpenLiveRoom) && (jbtVar = ((TaoliveOpenLiveRoom) aTaoliveOpenLiveRoomEntity).taoliveOpenContext) != null && (map = jbtVar.f) != null) {
            Object obj = map.get("enableReplayStatusShowLiveEnd");
            if (obj instanceof String) {
                this.K = arq.c((String) obj);
            }
        }
    }

    public void j0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc6cb5f", new Object[]{this, new Boolean(z)});
        } else {
            this.S = z;
        }
    }

    public void k0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8af1a75", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public void l0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e8f724", new Object[]{this, new Boolean(z)});
        } else {
            this.T = z;
        }
    }

    public void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5074be32", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public void n0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b202c4b", new Object[]{this, new Boolean(z)});
        } else {
            o0(z, false);
        }
    }

    public void p0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8dd3d1", new Object[]{this, str});
        } else {
            this.V = str;
        }
    }

    public void q0(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153bfcb8", new Object[]{this, aTaoliveOpenLiveRoomEntity});
        } else {
            this.z = aTaoliveOpenLiveRoomEntity;
        }
    }

    @Override // tb.cv1
    public ATaoliveOpenLiveRoomEntity r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoliveOpenLiveRoomEntity) ipChange.ipc$dispatch("ac42f3a", new Object[]{this});
        }
        return this.z;
    }

    public void o0(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e60fe9", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.W = z;
        if (!z2) {
            if (this.A != null) {
                for (int i = 0; i < this.A.size(); i++) {
                    if (this.A.get(i) != null) {
                        this.A.get(i).m(z);
                    }
                }
            }
            if (this.z != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isMuted", z + "");
                this.z.accessListener(AccessListenerEnum.onLiveRoomMuteAction, hashMap);
            }
        }
    }
}

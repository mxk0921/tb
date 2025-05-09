package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093362);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dee6a26", new Object[0])).booleanValue();
        }
        boolean E = hjr.E("disableMiniWindowViewNull", false);
        o3s.b("SampleConfigUtil", "disableMiniWindowViewNull, ret:" + E);
        return E;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e628940d", new Object[0])).booleanValue();
        }
        return hjr.E("enableAddOpenAbility", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e7cd10", new Object[0])).booleanValue();
        }
        return hjr.E("enableCheckWarmLimitSwitch", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4387da4e", new Object[0])).booleanValue();
        }
        return hjr.E("enableControlScreenLightOpt", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cfd2d29", new Object[0])).booleanValue();
        }
        return hjr.E("enableCustomerImplPageUTManager", true);
    }

    public static boolean f(cba cbaVar) {
        ATaoliveOpenLiveRoomEntity r;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c64a09", new Object[]{cbaVar})).booleanValue();
        }
        if (hjr.E("enableGuangGuangSecondLivePage", true) && (r = cbaVar.r()) != null && (azdVar = r.abilityCompontent) != null && ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedMoreLive)) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5179b626", new Object[0])).booleanValue();
        }
        return hjr.E("enableDestroyRecyclerMediaPlayerByInstance", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("741c24e6", new Object[0])).booleanValue();
        }
        return hjr.E("enableJumpUpdatePageUTProperties", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7bb97b", new Object[0])).booleanValue();
        }
        return hjr.E("enableLiveEndRemove", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77f5645", new Object[0])).booleanValue();
        }
        if (!qvs.P()) {
            return false;
        }
        return hjr.E("enableOpenRemoveDupCheck", false);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fbbbc30", new Object[0])).booleanValue();
        }
        return m() && yqq.h(hjr.K("enableP2ff2", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("192c06fe", new Object[0])).booleanValue();
        }
        return qvs.X0();
    }

    public static int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c812efa0", new Object[0])).intValue();
        }
        return yqq.l(hjr.A("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "partLength", "5"), 5);
    }

    public static boolean l(cba cbaVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e38ed22", new Object[]{cbaVar, new Long(j)})).booleanValue();
        }
        if (!hjr.E("enableRefreshOrRemoveLiveRoomWhenVisible", true) || cbaVar == null || !cbaVar.P() || !cbaVar.K || System.currentTimeMillis() - j <= yqq.l(hjr.A("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "checkInterval", "600"), 600) * 1000) {
            return false;
        }
        String A = hjr.A("taolive", "enableRefreshOrRemoveLiveRoomWhenVisible", "enable", "");
        o3s.b("SampleConfigUtil", "enableRefreshOrRemoveLiveRoomWhenVisible, ret:" + A);
        return yqq.i(A, false);
    }
}

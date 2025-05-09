package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093357);
    }

    public static boolean a(ux9 ux9Var) {
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("591591db", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var == null || (aTaoLiveOpenEntity = ux9Var.P) == null) {
            return false;
        }
        azd azdVar = aTaoLiveOpenEntity.abilityCompontent;
        if (azdVar != null) {
            return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume);
        }
        return true;
    }
}

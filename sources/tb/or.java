package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class or {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356460);
    }

    public static boolean a(ux9 ux9Var, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae2e7d67", new Object[]{ux9Var, openAbilityCompontentTypeEnum})).booleanValue();
        }
        if (ux9Var == null || ux9Var.A() == null || ux9Var.A().abilityCompontent == null || !((ibt) ux9Var.A().abilityCompontent).d(openAbilityCompontentTypeEnum)) {
            return false;
        }
        return true;
    }
}

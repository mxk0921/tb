package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUTE_SETTING_MODULE_BIZ_NAME = "TaoliveRoom";

    /* renamed from: a  reason: collision with root package name */
    public static final String f16611a = bte.class.getSimpleName();

    static {
        t2o.a(806355766);
    }

    public static boolean a(ux9 ux9Var) {
        cv1 j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87787797", new Object[]{ux9Var})).booleanValue();
        }
        if (!d() || ux9Var == null || (j = ux9Var.j()) == null) {
            return false;
        }
        return j.u();
    }

    public static boolean b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74e8a951", new Object[]{ux9Var})).booleanValue();
        }
        if (a(ux9Var) && ux9Var != null && ux9Var.u() != null && !ux9Var.u().a() && !or.a(ux9Var, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            return ux9Var.u().j();
        }
        return false;
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ea6d", new Object[0])).longValue();
        }
        return v2s.o().f().getApplication().getSharedPreferences("taolive", 0).getLong("StrongMuteViewShowTimeMS", 0L);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36d8b3ff", new Object[0])).booleanValue();
        }
        return j9t.e(v2s.o().f().getApplication(), MUTE_SETTING_MODULE_BIZ_NAME).b().h("tbGlobalMuteSetting");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74936bb6", new Object[0])).booleanValue();
        }
        if (System.currentTimeMillis() - c() > qvs.H0() * 1000) {
            return true;
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa56575c", new Object[0])).booleanValue();
        }
        if (v2s.o().f() == null || v2s.o().f().getApplication() == null) {
            o3s.b(f16611a, "isGlobalMuteSettingOpen context == null");
            return false;
        }
        Boolean bool = (Boolean) j9t.e(v2s.o().f().getApplication(), MUTE_SETTING_MODULE_BIZ_NAME).b().d(MUTE_SETTING_MODULE_BIZ_NAME, r0k.KEY_LIVE_MUTE, Boolean.FALSE, null);
        String str = f16611a;
        o3s.b(str, "isGlobalMuteSettingOpen state:" + bool);
        return bool.booleanValue();
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d99bc9", new Object[0]);
        } else {
            h(System.currentTimeMillis());
        }
    }

    public static void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608e9bdf", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putLong("StrongMuteViewShowTimeMS", j);
        edit.apply();
    }
}

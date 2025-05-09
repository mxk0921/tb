package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.IMuteService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class jfj implements vxc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUTE_FLAG = "mute_flag";
    public static final String MUTE_VALUE = "mute";
    public static final String SHOP_VIDEO_MUTE_FLAG = "shop_video_mute_flag";
    public static final String XIAOMI_B1_TAB3_MUTE_FLAG = "xiaomi_b1_tab3_mute_flag";

    /* renamed from: a  reason: collision with root package name */
    public final String f21969a;
    public String b;
    public final String c;
    public final String d;
    public final String e;
    public String f = "guangguang";

    static {
        t2o.a(468714571);
        t2o.a(468714570);
    }

    public jfj(String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        if (str4 == null) {
            this.f21969a = MUTE_FLAG;
        } else {
            this.f21969a = str4;
        }
    }

    @Override // tb.vxc
    public void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecb2401", new Object[]{this, fluidContext});
            return;
        }
        ono.h(p91.a(), this.d, ono.b(p91.a(), this.d, 0) + 1);
        ono.i(p91.a(), this.c, System.currentTimeMillis());
    }

    @Override // tb.vxc
    public boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de2969a0", new Object[]{this, fluidContext})).booleanValue();
        }
        if (fluidContext != null) {
            return !TextUtils.isEmpty(this.b);
        }
        return false;
    }

    @Override // tb.vxc
    public Map<String, Object> f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eeeabacd", new Object[]{this, fluidContext});
        }
        return mfj.m(this.f, fluidContext);
    }

    public void h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52420fcb", new Object[]{this, fluidContext});
            return;
        }
        this.b = null;
        ((IMuteService) fluidContext.getService(IMuteService.class)).onMuteFlagChanged(fluidContext, this.f21969a, this.b);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c00498d", new Object[]{this});
        }
        String f = ono.f(p91.a(), this.e, null);
        ir9.b("MuteBase", "1.静音getMuteStorage key：" + this.e + "-result:" + f);
        return TextUtils.isEmpty(f) ? "none" : f;
    }

    public void j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca896fd4", new Object[]{this, fluidContext});
            return;
        }
        String j = mfj.j(fluidContext);
        this.f = j;
        if (mfj.k(fluidContext, j)) {
            l(fluidContext);
        } else {
            k(fluidContext);
        }
    }

    public final void k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0b1547", new Object[]{this, fluidContext});
        } else if (TextUtils.equals(i(), "true")) {
            q(fluidContext);
        } else if (o(fluidContext)) {
            ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            String str = j.x;
            ir9.b("MuteBase", "1.静音逻升级初始化-native，疲劳度满足，音量正常，commonShowMuteTips：" + str);
            int i = j.y;
            if (TextUtils.equals(str, "true") && i >= 0) {
                q(fluidContext);
            }
        }
    }

    public final boolean m(Context context, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77eb5768", new Object[]{this, context, fluidContext})).booleanValue();
        }
        int b = ono.b(context, this.d, 0);
        ir9.b("MuteBase", "1.静音isLessThanMaxCount key：" + this.d);
        if (b < fluidContext.getInstanceConfig().getMuteTipCount()) {
            return true;
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bd6bd4", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.b);
    }

    public void q(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f8d2e0", new Object[]{this, fluidContext});
            return;
        }
        this.b = "mute";
        ((IMuteService) fluidContext.getService(IMuteService.class)).onMuteFlagChanged(fluidContext, this.f21969a, this.b);
    }

    public void r(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40304aa", new Object[]{this, fluidContext, str});
            return;
        }
        this.b = str;
        ((IMuteService) fluidContext.getService(IMuteService.class)).onMuteFlagChanged(fluidContext, this.f21969a, this.b);
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16dd16cd", new Object[]{this, new Boolean(z)});
        } else {
            ono.j(p91.a(), this.e, String.valueOf(z));
        }
    }

    public final void l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4117b0", new Object[]{this, fluidContext});
            return;
        }
        boolean booleanValue = ((Boolean) j9t.e(p91.a(), this.f).b().b(this.f, "mute", Boolean.FALSE, null)).booleanValue();
        boolean c = j9t.e(p91.a(), this.f).b().c("muteCountDown", false);
        if (booleanValue || c) {
            q(fluidContext);
        }
    }

    public final boolean o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c981dc8", new Object[]{this, fluidContext})).booleanValue();
        }
        if (!"none".equals(i())) {
            return false;
        }
        long c = ono.c(p91.a(), this.c);
        ir9.b("MuteBase", "1.静音needShowTips key：" + this.c);
        return p(p91.a(), fluidContext, System.currentTimeMillis(), c);
    }

    public void t(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b23d18", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        ir9.b("MuteBase", "走了降级的策略");
        if (TextUtils.equals(i(), "true")) {
            q(fluidContext);
        } else if (o(fluidContext)) {
            ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            String str = j.x;
            ir9.b("MuteBase", "1.静音逻升级初始化-native，疲劳度满足，音量正常，commonShowMuteTips：" + str);
            int i = j.y;
            if (TextUtils.equals(str, "true") && i >= 0) {
                q(fluidContext);
            }
        }
    }

    @Override // tb.vxc
    public void c(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4370712c", new Object[]{this, fluidContext, map});
        } else if (map != null) {
            Object obj = map.get("muted");
            if ("true".equals(obj)) {
                q(fluidContext);
            } else if ("false".equals(obj)) {
                h(fluidContext);
            }
            if (nwv.o(map.get("global"), true)) {
                if (mfj.k(fluidContext, this.f)) {
                    j9t.e(p91.a(), this.f).c().a(this.f, "mute", Boolean.valueOf("true".equals(obj)), null);
                }
                ir9.b("MuteBase", "Tnode 发送静音状态改变的消息" + obj);
                Object obj2 = map.get("muteStorage");
                if ("true".equals(obj2)) {
                    s(true);
                } else if ("false".equals(obj2)) {
                    s(false);
                }
            }
        }
    }

    @Override // tb.vxc
    public Map<String, Object> g(FluidContext fluidContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96bdb70", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        if (!o(fluidContext) || !wi1.b(p91.a())) {
            z = false;
        }
        ir9.b("MuteBase", "走了getMuteState， needshowtips值" + z);
        String str = "false";
        hashMap.put("muted", n() ? "true" : str);
        if (z) {
            str = "true";
        }
        hashMap.put("needShowTips", str);
        hashMap.put("muteStorage", i());
        ir9.b("MuteBase", "3.静音逻升级初始化-native，gteMuteState muted：" + hashMap.get("muted") + "_needShowTips:" + hashMap.get("needShowTips") + "_muteStorage:" + hashMap.get("muteStorage"));
        return hashMap;
    }

    public final boolean p(Context context, FluidContext fluidContext, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e341eb0", new Object[]{this, context, fluidContext, new Long(j), new Long(j2)})).booleanValue();
        }
        ncp j3 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        int i = j3 != null ? j3.y : -1;
        ir9.b("MuteBase", "2.tab3静音逻升级初始化-native needShowTipsForTab3MuteUpgrade，服务端疲劳度：" + i);
        if (i == 0) {
            return m(context, fluidContext);
        }
        boolean a2 = uut.a(j2, j, i);
        boolean b = uut.b(j2, j);
        ir9.b("MuteBase", "2.tab3静音逻升级初始化-native needShowTipsForTab3MuteUpgrade，isMoreThanDays：" + a2 + "——isSameDay：" + b);
        return i > 0 && a2 && !b;
    }
}

package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tnx extends jfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final tnx f28832a = new tnx();

        static {
            t2o.a(468714588);
        }

        public static /* synthetic */ tnx a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tnx) ipChange.ipc$dispatch("3e9ebf47", new Object[0]);
            }
            return f28832a;
        }
    }

    static {
        t2o.a(468714586);
        t2o.a(468714570);
    }

    public static /* synthetic */ Object ipc$super(tnx tnxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/XiaomiTab3VideoMuteImpl");
    }

    public static tnx u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnx) ipChange.ipc$dispatch("4c2d14c", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.vxc
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cb8f4", new Object[]{this, fluidContext});
        } else {
            q(fluidContext);
        }
    }

    @Override // tb.vxc
    public void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879e135", new Object[]{this, fluidContext});
        }
    }

    @Override // tb.jfj, tb.vxc
    public Map<String, Object> g(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a96bdb70", new Object[]{this, fluidContext});
        }
        HashMap hashMap = new HashMap();
        if (n()) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("muted", str);
        hashMap.put("needShowTips", "false");
        hashMap.put("muteStorage", i());
        ir9.b("XiaomiTab3VideoMuteImpl", "XiaomiB1，3.静音逻升级初始化-native，gteMuteState muted：" + hashMap.get("muted") + "_muteStorage:" + hashMap.get("muteStorage"));
        return hashMap;
    }

    public void v(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab5f1b", new Object[]{this, fluidContext, str});
        } else {
            r(fluidContext, str);
        }
    }

    public tnx() {
        super("xiaomi_tab3_last_show_mute_tips_time", "xiaomi_tab3_has_show_mute_tips_count", "xiaomi_tab3_mute_storage", jfj.XIAOMI_B1_TAB3_MUTE_FLAG);
    }
}

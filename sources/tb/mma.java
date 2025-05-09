package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.IMuteService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mma extends jfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mma f24134a = new mma();

        static {
            t2o.a(468714566);
        }

        public static /* synthetic */ mma a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mma) ipChange.ipc$dispatch("5c089bce", new Object[0]);
            }
            return f24134a;
        }
    }

    static {
        t2o.a(468714564);
        t2o.a(468714570);
    }

    public static /* synthetic */ Object ipc$super(mma mmaVar, String str, Object... objArr) {
        if (str.hashCode() == -896962604) {
            mmaVar.j((FluidContext) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/mute/helper/GuangGuangVideoMuteImpl");
    }

    public static mma u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mma) ipChange.ipc$dispatch("222cadd3", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.vxc
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cb8f4", new Object[]{this, fluidContext});
        } else {
            j(fluidContext);
        }
    }

    public mma() {
        super("guangguang_last_show_mute_tips_time", "guangguang_has_show_mute_tips_count", "guangguang_mute_storage", jfj.MUTE_FLAG);
    }

    @Override // tb.vxc
    public void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879e135", new Object[]{this, fluidContext});
            return;
        }
        ((IMuteService) fluidContext.getService(IMuteService.class)).setMuteABTestForSettings(false);
        h(fluidContext);
        ir9.b("GuangGuangVideoMuteImpl", "降级打开静音");
    }
}

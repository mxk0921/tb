package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nma extends jfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nma f24824a = new nma();

        static {
            t2o.a(468714569);
        }

        public static /* synthetic */ nma a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nma) ipChange.ipc$dispatch("d1a1572d", new Object[0]);
            }
            return f24824a;
        }
    }

    static {
        t2o.a(468714567);
        t2o.a(468714570);
    }

    public static /* synthetic */ Object ipc$super(nma nmaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -896962604) {
            nmaVar.j((FluidContext) objArr[0]);
            return null;
        } else if (hashCode == -223199976) {
            nmaVar.t((FluidContext) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/mute/helper/GuangPickVideoMuteImpl");
        }
    }

    public static nma u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nma) ipChange.ipc$dispatch("43607088", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.vxc
    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cb8f4", new Object[]{this, fluidContext});
            return;
        }
        FluidInstanceConfig instanceConfig = fluidContext.getInstanceConfig();
        String tabId = instanceConfig.getTabId();
        if (instanceConfig.isTab3FromLauncher() && !mfj.k(fluidContext, mfj.j(fluidContext))) {
            ir9.b("tab3MuteUpgrade", "原有逻辑，拉端进入默认静音");
            q(fluidContext);
        } else if (!TextUtils.equals(tabId, sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE)) {
            j(fluidContext);
        }
    }

    @Override // tb.vxc
    public void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e879e135", new Object[]{this, fluidContext});
        } else {
            t(fluidContext);
        }
    }

    public nma() {
        super("last_show_mute_tips_time", "has_show_mute_tips_count", "tab3_mute_storage", jfj.MUTE_FLAG);
    }
}

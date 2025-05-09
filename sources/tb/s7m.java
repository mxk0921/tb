package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.module.CameraMuiseModule;
import com.etao.feimagesearch.capture.dynamic.module.PltToolModule;
import com.taobao.android.weex_framework.MUSEngine;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class s7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s7m INSTANCE = new s7m();

    static {
        t2o.a(481297322);
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b3095e", new Object[0]);
            return;
        }
        MUSEngine.registerModule(CameraMuiseModule.MODULE_NAME, CameraMuiseModule.class);
        MUSEngine.registerModule(PltToolModule.MODULE_NAME, PltToolModule.class);
    }
}

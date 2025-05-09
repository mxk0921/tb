package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rpn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714376);
    }

    public static void a(FluidContext fluidContext, a.d dVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf853c9", new Object[]{fluidContext, dVar});
            return;
        }
        ir9.b("RecordDisableHelper", "changeRecordFlags");
        if (dVar == null || dVar.g() == null || dVar.g().config == null || !dVar.g().config.disableRecord) {
            z = false;
        }
        c(fluidContext, z);
    }

    public static void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da9e362", new Object[]{fluidContext});
            return;
        }
        ir9.b("RecordDisableHelper", "clearRecordFlags");
        c(fluidContext, false);
    }

    public static void c(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae51df73", new Object[]{fluidContext, new Boolean(z)});
        } else if (d()) {
            Context context = fluidContext.getContext();
            if (!(context instanceof Activity)) {
                return;
            }
            if (z) {
                ir9.b("RecordDisableHelper", "禁止录屏");
                ((Activity) context).getWindow().addFlags(8192);
                return;
            }
            ir9.b("RecordDisableHelper", "允许录屏");
            ((Activity) context).getWindow().clearFlags(8192);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a206c1", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enablePrivacyRecord", true);
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714354);
    }

    public static void b(FluidContext fluidContext, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3beadd", new Object[]{fluidContext, uq9Var});
        } else {
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_longPress", uq9Var.Y().c, null));
        }
    }

    public static void d(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bef", new Object[]{uq9Var});
        } else {
            yre.b(uq9Var.U(), uq9Var.M(), hxf.d(uq9Var.Y().g()), false, uq9Var.Y().g().hasExposed);
        }
    }

    public static void e(k5h k5hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fe3ba1", new Object[]{k5hVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        if (k5hVar.l1() != null && k5hVar.l1().f7800a != null && !TextUtils.isEmpty(k5hVar.l1().f7800a.c)) {
            ((IMessageService) k5hVar.U().getService(IMessageService.class)).sendMessage(new vrp("VSMSG_liveModeGotoLiveRoom", k5hVar.l1().f7800a.c, hashMap));
        }
    }

    public static void f(k5h k5hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1730f285", new Object[]{k5hVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("focus_mode", "0");
        ((IMessageService) k5hVar.U().getService(IMessageService.class)).sendMessage(new vrp(csp.VIDEO_STATE_CHANGE_NAME, k5hVar.b0(), hashMap));
        String a2 = tri.a(str);
        if (a2 != null) {
            ((IMessageService) k5hVar.U().getService(IMessageService.class)).sendMessage(new vrp(a2, k5hVar.b0(), hashMap));
        }
    }

    public static void a(FluidContext fluidContext, uq9 uq9Var, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a9a172", new Object[]{fluidContext, uq9Var, new Float(f), new Float(f2)});
        } else if (uq9Var.J() != 2) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("x", Float.valueOf(f));
            hashMap.put("y", Float.valueOf(f2));
            ir9.b("sendCardDoubleClickMessage", "onDoubleClick，x=" + f + " y=" + f2);
            vrp vrpVar = new vrp("VSMSG_doubleClickFavor", uq9Var.Y().c, hashMap);
            vrp vrpVar2 = new vrp("VSMSG_requestFavor", uq9Var.Y().c, null);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(vrpVar);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(vrpVar2);
        }
    }

    public static void c(FluidContext fluidContext, uq9 uq9Var, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90aeb07f", new Object[]{fluidContext, uq9Var, new Float(f), new Float(f2)});
        } else if (uq9Var.J() != 2) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("x", Float.valueOf(f));
            hashMap.put("y", Float.valueOf(f2));
            ir9.b("sendCardTripleClickMessage", "onTripleClick，x=" + f + " y=" + f2);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_tripleClick", uq9Var.Y().c, hashMap));
        }
    }
}

package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093356);
    }

    public static zrk a(ux9 ux9Var, cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zrk) ipChange.ipc$dispatch("95421246", new Object[]{ux9Var, cbaVar});
        }
        if (!nqo.e()) {
            return null;
        }
        if (ux9Var != null) {
            return b(ux9Var.A());
        }
        if (cbaVar != null) {
            return b(cbaVar.r());
        }
        return null;
    }

    public static zrk b(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        cf cfVar;
        yrk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zrk) ipChange.ipc$dispatch("3aeadc18", new Object[]{aTaoliveOpenLiveRoomEntity});
        }
        if (aTaoliveOpenLiveRoomEntity == null || (cfVar = aTaoliveOpenLiveRoomEntity.eventCompontent) == null || cfVar.a() == null || (a2 = aTaoliveOpenLiveRoomEntity.eventCompontent.a().a()) == null) {
            return null;
        }
        zrk f = a2.f();
        x5t.h("LiveRoomBizPageUTUtil", "getOnLiveRoomBizPageUT，OnLiveRoomBizPageUT：" + f);
        return f;
    }

    public static Map<String, String> c(ux9 ux9Var, cba cbaVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("246aafe8", new Object[]{ux9Var, cbaVar, activity});
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            return a2.a(activity);
        }
        if (v2s.o().E() != null) {
            return v2s.o().E().getPageAllProperties(activity);
        }
        return null;
    }

    public static Map<String, String> d(ux9 ux9Var, cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5747aa9", new Object[]{ux9Var, cbaVar, obj});
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            return a2.b(obj);
        }
        if (v2s.o().E() != null) {
            return v2s.o().E().c(obj);
        }
        return null;
    }

    public static void e(ux9 ux9Var, cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94617308", new Object[]{ux9Var, cbaVar, obj});
            return;
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            a2.d(obj);
        } else if (v2s.o().E() != null) {
            v2s.o().E().pageAppear(obj);
        }
    }

    public static void f(ux9 ux9Var, cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44de4cc9", new Object[]{ux9Var, cbaVar, obj});
            return;
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            a2.e(obj);
        } else if (v2s.o().E() != null) {
            v2s.o().E().a(obj);
        }
    }

    public static void g(ux9 ux9Var, cba cbaVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52aa8018", new Object[]{ux9Var, cbaVar, obj});
            return;
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            a2.f(obj);
        } else if (v2s.o().E() != null) {
            v2s.o().E().pageDisAppear(obj);
        }
    }

    public static void h(ux9 ux9Var, cba cbaVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8bcc13", new Object[]{ux9Var, cbaVar, obj, str});
            return;
        }
        zrk a2 = a(ux9Var, cbaVar);
        if (a2 != null) {
            a2.g(obj, str);
        } else if (v2s.o().E() != null) {
            v2s.o().E().updatePageName(obj, str);
        }
    }
}

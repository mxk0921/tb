package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class du4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356056);
    }

    public static zrk a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zrk) ipChange.ipc$dispatch("2981c82f", new Object[]{ux9Var});
        }
        if (ux9Var != null) {
            return b(ux9Var.A());
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
        return a2.f();
    }

    public static void c(ux9 ux9Var, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97be44ef", new Object[]{ux9Var, obj, map});
            return;
        }
        if (ux9Var != null) {
            ux9Var.u.putAll(map);
        }
        d(ux9Var, obj, map);
    }

    public static void d(ux9 ux9Var, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7048632", new Object[]{ux9Var, obj, map});
            return;
        }
        zrk a2 = a(ux9Var);
        if (a2 != null) {
            a2.h(obj, map);
        } else if (obj != null && v2s.o().E() != null) {
            v2s.o().E().updatePageProperties(obj, map);
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class j3a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699248);
    }

    public static void a(xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f0f6", new Object[]{xeaVar, liveItem});
            return;
        }
        sjr.g().c("com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem, xea.E(xeaVar));
        if (xeaVar != null && xeaVar.j() != null) {
            xeaVar.j().b0(liveItem);
        }
    }

    public static void b(xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eee219a", new Object[]{xeaVar, liveItem});
            return;
        }
        sjr.g().c("com.taobao.taolive.hide.member.identification.inner", null, xea.E(xeaVar));
        if (xeaVar != null && xeaVar.j() != null) {
            xeaVar.j().b0(liveItem);
        }
    }

    public static void c(xea xeaVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ff7f02", new Object[]{xeaVar, liveItem});
            return;
        }
        sjr.g().c("com.taobao.taolive.room.goodlist.all.refresh.item.inner", liveItem, xea.E(xeaVar));
        if (xeaVar != null && xeaVar.j() != null) {
            xeaVar.j().b0(liveItem);
        }
    }
}

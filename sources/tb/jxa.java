package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092560);
    }

    public static void a(Context context, ux9 ux9Var) {
        cba G0;
        cba G02;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07a7", new Object[]{context, ux9Var});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("business_id", "zhibo_corner");
        if (nwa.a(ux9Var).c() != null) {
            nwa.a(ux9Var).c().showShare((Activity) context, false, hashMap);
        }
        HashMap hashMap2 = new HashMap();
        if (!giv.c().b() && (ux9Var instanceof air) && (G02 = ((air) ux9Var).j()) != null) {
            hashMap2.put("spm-url", G02.k().q().E());
        }
        hashMap2.put("spm-cnt", sbu.c(ux9Var));
        if (!giv.c().b() && (ux9Var instanceof air) && (G0 = ((air) ux9Var).j()) != null) {
            haa q = G0.k().q();
            q.E();
            hashMap2.put("entrySpm", q.n());
            hashMap2.put("livesource", q.L());
            hashMap2.put("entryLiveSource", q.g());
            hashMap2.put("entrySpmPre", q.o());
        }
        hashMap2.put("client", "taobao");
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_TaobaoLive", "Button-Button-DownShare");
        uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_PAGE, "Page_TaobaoLiveWatch");
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        ux9Var.h().d("com.taobao.taolive.room.start_share_from_btns");
    }
}

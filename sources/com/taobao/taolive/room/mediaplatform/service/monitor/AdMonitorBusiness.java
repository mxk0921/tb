package com.taobao.taolive.room.mediaplatform.service.monitor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashSet;
import java.util.Set;
import tb.b0d;
import tb.gf0;
import tb.nt1;
import tb.pvs;
import tb.t2o;
import tb.to8;
import tb.ux9;
import tb.v2s;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AdMonitorBusiness extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> l = new HashSet<String>() { // from class: com.taobao.taolive.room.mediaplatform.service.monitor.AdMonitorBusiness.1
        {
            add(to8.GOTO_DETAIL);
            add("follow");
            add(to8.ADD_CART);
            add("addFavor");
            add(to8.COMMENT);
            add("share");
        }
    };

    static {
        t2o.a(779092984);
    }

    public AdMonitorBusiness(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(AdMonitorBusiness adMonitorBusiness, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/mediaplatform/service/monitor/AdMonitorBusiness");
    }

    public void K(String str, String str2, String str3) {
        ux9 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6ec41c", new Object[]{this, str, str2, str3});
        } else if (pvs.l() && (d = vx9.d()) != null) {
            String str4 = "";
            String str5 = d.D() != null ? d.D().get("livesource") : str4;
            if (d.D() != null) {
                str4 = d.D().get(gf0.K_DELIVERY_ID);
            }
            M(str, str2, str3, str5, str4);
        }
    }

    public void L(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1b30", new Object[]{this, str, str2, str3, str4, str5});
        } else if (pvs.l()) {
            M(str, str2, str3, str4, str5);
        }
    }

    public final void M(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a198a91", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        AdMonitorRequest adMonitorRequest = new AdMonitorRequest();
        adMonitorRequest.adImpId = "";
        adMonitorRequest.userId = v2s.o().u().getUserId();
        adMonitorRequest.platform = "android";
        adMonitorRequest.version = Globals.getVersionName();
        adMonitorRequest.adType = "live";
        adMonitorRequest.pid = str;
        adMonitorRequest.type = str2;
        if (!((HashSet) l).contains(str3)) {
            str3 = "";
        }
        adMonitorRequest.action = str3;
        adMonitorRequest.livesource = str4;
        adMonitorRequest.taskId = str5;
        C(0, adMonitorRequest, null);
    }
}

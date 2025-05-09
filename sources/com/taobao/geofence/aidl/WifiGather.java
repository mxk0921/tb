package com.taobao.geofence.aidl;

import android.net.wifi.WifiManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.fence.common.ResultEnums;
import java.util.HashMap;
import tb.aob;
import tb.bda;
import tb.ltn;
import tb.mdh;
import tb.sa0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WifiGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_WifiGather";
    private static aob collectionManager = ltn.a();
    private GatherManager gatherManager;

    static {
        t2o.a(789577817);
    }

    public WifiGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "WifiGather", 1.0d);
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        if (((WifiManager) bda.a().getSystemService("wifi")).isWifiEnabled()) {
            return null;
        }
        mdh.a(LOG, "wifi disable");
        return ResultEnums.WIFI_NOT_OPEN;
    }

    public void startGather() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b047b04", new Object[]{this});
            return;
        }
        GatherManager gatherManager = this.gatherManager;
        SwitchOption.CollectionType collectionType = SwitchOption.CollectionType.WIFI;
        sa0 sa0Var = new sa0(gatherManager, collectionType);
        int a2 = collectionManager.a(sa0Var);
        sa0Var.b(a2);
        Code code = new Code();
        code.setModuleToken(a2);
        SwitchOption switchOption = new SwitchOption(collectionType, true);
        switchOption.setInterval(0);
        HashMap hashMap = new HashMap();
        hashMap.put("active_scan", Boolean.TRUE);
        switchOption.setFeature(hashMap);
        mdh.a(LOG, "[startGather] " + code + ";" + switchOption);
        collectionManager.modifiy(code, switchOption);
    }
}

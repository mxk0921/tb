package com.taobao.geofence.aidl;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.ResultEnums;
import java.util.HashMap;
import java.util.HashSet;
import tb.aob;
import tb.ltn;
import tb.mdh;
import tb.na0;
import tb.rg8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IBeaconGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long IBEACON_TIME_RANGE = 2000;
    private static final String LOG = "lbs_sdk.fence_IBeaconGather";
    private static aob collectionManager = ltn.a();
    private GatherManager gatherManager;

    static {
        t2o.a(789577812);
    }

    public IBeaconGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "IBeaconGather", 1.0d);
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        if (!rg8.a()) {
            return ResultEnums.NOT_SUPPORT_IBEACON;
        }
        if (!rg8.b()) {
            return ResultEnums.IBEACON_NOT_OPEN;
        }
        return null;
    }

    public void startGather(String str) {
        int scanTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886a6bce", new Object[]{this, str});
            return;
        }
        GatherManager gatherManager = this.gatherManager;
        SwitchOption.CollectionType collectionType = SwitchOption.CollectionType.BEACON;
        na0 na0Var = new na0(gatherManager, collectionType);
        int a2 = collectionManager.a(na0Var);
        na0Var.b(a2);
        HashSet hashSet = new HashSet(JSON.parseArray(str, String.class));
        Code code = new Code();
        code.setModuleToken(a2);
        SwitchOption switchOption = new SwitchOption(collectionType, true);
        HashMap hashMap = new HashMap();
        hashMap.put("uuid", hashSet);
        hashMap.put("active_scan", Boolean.TRUE);
        switchOption.setFeature(hashMap);
        switchOption.setInterval(0);
        switchOption.setTimeRange(2000L);
        if (TBFenceClient.getFenceClient() != null && (scanTime = TBFenceClient.getFenceClient().getScanTime()) > 0) {
            switchOption.setTimeRange(scanTime);
        }
        mdh.a(LOG, "[startGather] " + code + ";" + switchOption);
        collectionManager.modifiy(code, switchOption);
    }
}

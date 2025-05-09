package com.taobao.geofence.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.fence.aidl.ITBFenceService;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.FenceDataDTO;
import com.taobao.geofence.aidl.GatherManager;
import java.util.HashMap;
import java.util.Map;
import tb.mdh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FenceServiceImpl extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_FenceServiceImpl";
    private static Map<TBFenceClient.TypeEnum, GatherManager.CacheData> cache = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class FecneServiceBinder extends ITBFenceService.Stub {
        static {
            t2o.a(789577809);
        }

        public FecneServiceBinder() {
        }

        @Override // com.taobao.fence.aidl.ITBFenceService
        public void gatherData(int i, String str) throws RemoteException {
            mdh.b(FenceServiceImpl.LOG, "[gatherData] start type=" + i + ";uuid=" + str);
            new GatherManager(i, 0L, JSON.parseArray(str, String.class), FenceServiceImpl.access$000()).gather();
        }

        @Override // com.taobao.fence.aidl.ITBFenceService
        public FenceDataDTO getData(int i, long j, String str) throws RemoteException {
            mdh.a(FenceServiceImpl.LOG, "[getData] start type=" + i + ";uuid=" + str);
            return new GatherManager(i, j, JSON.parseArray(str, String.class), FenceServiceImpl.access$000()).getGatherData();
        }
    }

    static {
        t2o.a(789577808);
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return cache;
    }

    public static /* synthetic */ Object ipc$super(FenceServiceImpl fenceServiceImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/geofence/aidl/FenceServiceImpl");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        AppMonitor.Counter.commit("passivelocation", "FenceServiceImpl", 1.0d);
        return new FecneServiceBinder();
    }
}

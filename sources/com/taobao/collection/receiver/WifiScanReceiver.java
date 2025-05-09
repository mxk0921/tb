package com.taobao.collection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.aex;
import tb.cyv;
import tb.fz3;
import tb.mdh;
import tb.t2o;
import tb.y0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WifiScanReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Code> f10308a;
    public final y0d b;
    public final aex c;
    public final Map<Integer, SwitchOption> d;

    static {
        t2o.a(789577806);
    }

    public WifiScanReceiver(Set<Code> set, y0d y0dVar, aex aexVar, Map<Integer, SwitchOption> map) {
        this.f10308a = set;
        this.b = y0dVar;
        this.c = aexVar;
        this.d = map;
    }

    public static /* synthetic */ Object ipc$super(WifiScanReceiver wifiScanReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/collection/receiver/WifiScanReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "WifiScanReceiver", 1.0d);
            mdh.d("lbs_sdk.coll_WifiScanRcv", "receive wifi scan! codes = " + JSON.toJSONString(this.f10308a));
            List<ScanResult> g = cyv.g();
            this.c.d(System.currentTimeMillis());
            this.c.c(g);
            fz3 d = fz3.d();
            for (Code code : this.f10308a) {
                c cVar = new c();
                cVar.f(SwitchOption.CollectionType.WIFI);
                cVar.d(code);
                cVar.e(this.c);
                ((fz3) this.b).g(cVar);
                SwitchOption switchOption = this.d.get(Integer.valueOf(code.getModuleToken()));
                if (switchOption != null && switchOption.getInterval() > 0) {
                    d.modifiy(code, switchOption);
                }
            }
        } catch (Exception e) {
            mdh.c("lbs_sdk.coll_WifiScanRcv", "Wifi receiver process error!", e);
        }
    }
}

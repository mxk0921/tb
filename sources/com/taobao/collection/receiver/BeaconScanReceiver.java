package com.taobao.collection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.c;
import com.taobao.collection.dto.BeaconRecord;
import java.util.List;
import java.util.Set;
import tb.b62;
import tb.fz3;
import tb.mdh;
import tb.t2o;
import tb.y0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BeaconScanReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Code> f10307a;
    public final y0d b;
    public BeaconRecord c;

    static {
        t2o.a(789577805);
    }

    public BeaconScanReceiver(Set<Code> set, y0d y0dVar, BeaconRecord beaconRecord) {
        this.f10307a = set;
        this.b = y0dVar;
        this.c = beaconRecord;
    }

    public static /* synthetic */ Object ipc$super(BeaconScanReceiver beaconScanReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/collection/receiver/BeaconScanReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "BeaconScanReceiver", 1.0d);
            mdh.d("lbs_sdk.coll_BeaconScanReceiver", "receive ibeacon scan! codes = " + JSON.toJSONString(this.f10307a));
            List<BeaconRecord.IBeacon> parseArray = JSON.parseArray(intent.getStringExtra(b62.BROAD_CAST_IBEACON_KEY), BeaconRecord.IBeacon.class);
            if (this.c == null) {
                this.c = new BeaconRecord();
            }
            this.c.d(parseArray);
            this.c.e(System.currentTimeMillis());
            for (Code code : this.f10307a) {
                c cVar = new c();
                cVar.f(SwitchOption.CollectionType.BEACON);
                cVar.d(code);
                cVar.e(this.c);
                ((fz3) this.b).g(cVar);
            }
        } catch (Exception e) {
            mdh.c("lbs_sdk.coll_BeaconScanReceiver", "ibeacon receiver process error!", e);
        }
    }
}

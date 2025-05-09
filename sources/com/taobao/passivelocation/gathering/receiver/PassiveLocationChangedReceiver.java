package com.taobao.passivelocation.gathering.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;
import tb.cyv;
import tb.ich;
import tb.mdh;
import tb.t2o;
import tb.tbj;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PassiveLocationChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577855);
    }

    public static /* synthetic */ Object ipc$super(PassiveLocationChangedReceiver passiveLocationChangedReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/gathering/receiver/PassiveLocationChangedReceiver");
    }

    public final void a(Context context, Location location, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2cbdcb", new Object[]{this, context, location, str});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ich ichVar = new ich(applicationContext);
        mdh.a("lbs_passive.loc_PASSLCRE", "config.canSampling()=" + ichVar.a() + ",LocationConstants.sFirstStart=" + yah.c);
        if (ichVar.a() || (yah.c && !cyv.j(yah.f31937a, LocationGatheringService.class.getName()))) {
            mdh.a("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService begin");
            Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
            intent.putExtra(yah.EXTRA_KEY_LOCATION, location);
            intent.putExtra("location_source_key", str);
            intent.setPackage(applicationContext.getPackageName());
            applicationContext.startService(intent);
            mdh.a("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService end");
            return;
        }
        mdh.a("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService end");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        mdh.d("lbs_passive.loc_PASSLCRE", "[onReceive] begin");
        AppMonitor.Counter.commit("passivelocation", "PassiveLocationChangedReceiver", 1.0d);
        if (intent != null) {
            if (intent.hasExtra(tbj.REQUEST_PASSIVE)) {
                str = intent.getStringExtra(tbj.REQUEST_PASSIVE);
                mdh.d("lbs_passive.loc_PASSLCRE", "[onReceive] location source: " + str);
            } else {
                str = null;
            }
            if (intent.hasExtra("location")) {
                a(context, (Location) intent.getExtras().get("location"), str);
            } else {
                mdh.d("lbs_passive.loc_PASSLCRE", "intent has not location, cannot to fatch location data from passive provider");
            }
        } else {
            mdh.d("lbs_passive.loc_PASSLCRE", "intent is null");
        }
    }
}

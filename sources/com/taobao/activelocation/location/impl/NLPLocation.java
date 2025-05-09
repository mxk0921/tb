package com.taobao.activelocation.location.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import tb.awv;
import tb.e20;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NLPLocation extends e20 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PL_SINGLE_LOCATION_UPDATE_ACTION = "com.taobao.passivelocation.business.PL_SINGLE_LOCATION_UPDATE_ACTION";
    public LocationManager g;
    public PendingIntent h;
    public BroadcastReceiver i;

    static {
        t2o.a(789577737);
    }

    public NLPLocation(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.NLPLOCATION, hashMap);
    }

    public static /* synthetic */ void i(NLPLocation nLPLocation, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d2c96", new Object[]{nLPLocation, intent});
        } else {
            nLPLocation.j(intent);
        }
    }

    public static /* synthetic */ Object ipc$super(NLPLocation nLPLocation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/location/impl/NLPLocation");
    }

    @Override // tb.e20
    public LocationTypeEnum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("4d2b50ed", new Object[]{this});
        }
        return null;
    }

    public final void j(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125bda61", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        TBLocationDTO d = extras != null ? awv.d((Location) extras.get("location")) : null;
        if (d == null) {
            f();
        } else {
            h(d);
            AppMonitor.Counter.commit("passivelocation", "NLPLocationSuccess", 1.0d);
        }
        try {
            this.g.removeUpdates(this.h);
            Globals.getApplication().unregisterReceiver(this.i);
        } catch (Exception e) {
            new StringBuilder("释放定位资源错误： ").append(e.getMessage());
        }
    }

    @Override // tb.e20
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb229e7", new Object[]{this});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "nlpLocation", "off"))) {
            f();
        } else {
            AppMonitor.Counter.commit("passivelocation", "NLPLocation", 1.0d);
            try {
                if (!awv.c(this.e.getApplicationContext())) {
                    f();
                    return;
                }
            } catch (Exception unused) {
            }
            this.g = (LocationManager) this.e.getSystemService("location");
            Criteria criteria = new Criteria();
            criteria.setPowerRequirement(1);
            List<String> providers = this.g.getProviders(criteria, true);
            if (providers == null || providers.size() == 0) {
                f();
                return;
            }
            this.i = new BroadcastReceiver() { // from class: com.taobao.activelocation.location.impl.NLPLocation.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/location/impl/NLPLocation$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        NLPLocation.i(NLPLocation.this, intent);
                    }
                }
            };
            try {
                Globals.getApplication().registerReceiver(this.i, new IntentFilter(PL_SINGLE_LOCATION_UPDATE_ACTION));
                PendingIntent e = ya.e(this.e, 0, new Intent(PL_SINGLE_LOCATION_UPDATE_ACTION), 134217728);
                this.h = e;
                this.g.requestSingleUpdate("network", e);
            } catch (Exception unused2) {
                f();
            }
        }
    }
}

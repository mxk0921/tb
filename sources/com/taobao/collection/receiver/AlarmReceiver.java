package com.taobao.collection.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.tao.Globals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import tb.aex;
import tb.aob;
import tb.b62;
import tb.fz3;
import tb.mdh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AlarmReceiver extends WakefulBroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final aob f10306a = fz3.d();

    static {
        t2o.a(789577799);
    }

    public static /* synthetic */ Object ipc$super(AlarmReceiver alarmReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/collection/receiver/AlarmReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "collectionAlarmReceiver", 1.0d);
            Code code = (Code) JSON.parseObject(intent.getStringExtra("com.taobao.collection.common.Code"), Code.class);
            SwitchOption switchOption = (SwitchOption) JSON.parseObject(intent.getStringExtra("com.taobao.collection.common.SwitchOption"), SwitchOption.class);
            long longExtra = intent.getLongExtra("com.taobao.collection.common.timestamp", 0L);
            mdh.d("lbs_sdk.coll_AlarmReceiver", "Receiver alarm successful ***********************! Code = " + code + "; SO = " + switchOption + ";timstamp=" + longExtra);
            if (!((fz3) this.f10306a).f(code.getModuleToken())) {
                mdh.a("lbs_sdk.coll_AlarmReceiver", "moduleToken=" + code.getModuleToken() + " not exsit listener");
                return;
            }
            mdh.a("lbs_sdk.coll_AlarmReceiver", "CollectionManager listener=" + ((fz3) this.f10306a).e());
            String action = intent.getAction();
            SwitchOption.CollectionType collectionType = SwitchOption.CollectionType.WIFI;
            if (action.equals(collectionType.name())) {
                WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                switchOption.setType(collectionType);
                if (!wifiManager.isWifiEnabled()) {
                    mdh.d("lbs_sdk.coll_AlarmReceiver", "Ignore wifi alarm receiver!\u3000wifiEnable = " + wifiManager.isWifiEnabled());
                    return;
                }
                aex aexVar = (aex) ((fz3) this.f10306a).c(collectionType).b();
                if (aexVar == null || (System.currentTimeMillis() - aexVar.b()) + 10000 >= switchOption.getInterval() * 1000) {
                    StringBuilder sb = new StringBuilder("Wifi start scan! LRT = ");
                    if (aexVar == null) {
                        str = "NULL";
                    } else {
                        str = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(aexVar.b()));
                    }
                    sb.append(str);
                    mdh.d("lbs_sdk.coll_AlarmReceiver", sb.toString());
                    wifiManager.startScan();
                } else {
                    mdh.d("lbs_sdk.coll_AlarmReceiver", "Wifi do nothing! LRT = " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(aexVar.b())));
                }
                ((fz3) this.f10306a).modifiy(code, switchOption);
            } else if (intent.getAction().equals(SwitchOption.CollectionType.BEACON.name())) {
                Object obj = switchOption.getFeature().get("uuid");
                if (obj instanceof JSONArray) {
                    String[] strArr = new String[((JSONArray) obj).size()];
                    Iterator<Object> it = ((JSONArray) obj).iterator();
                    HashSet hashSet = new HashSet();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            hashSet.add((String) next);
                        }
                    }
                    ((JSONArray) obj).toArray(strArr);
                    new b62(Globals.getApplication(), hashSet).p(switchOption.getTimeRange());
                }
                ((fz3) this.f10306a).modifiy(code, switchOption);
            }
        } catch (Exception unused) {
            mdh.b("lbs_sdk.coll_AlarmReceiver", "Receiver alarm, but process error!");
        }
    }
}

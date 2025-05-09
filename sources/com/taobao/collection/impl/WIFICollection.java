package com.taobao.collection.impl;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.a;
import com.taobao.collection.common.b;
import com.taobao.collection.common.c;
import com.taobao.collection.receiver.WifiScanReceiver;
import com.taobao.tao.Globals;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.aex;
import tb.mdh;
import tb.t2o;
import tb.y0d;
import tb.znb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WIFICollection implements znb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_SCAN = "active_scan";
    private static final String TAG = "lbs_sdk.coll_WFIColl";
    private y0d in;
    private BroadcastReceiver receiver;
    private Set<Code> codes = new CopyOnWriteArraySet();
    private Map<Integer, SwitchOption> options = new HashMap();
    private boolean isValid = false;
    private aex wr = new aex();

    static {
        t2o.a(789577794);
        t2o.a(789577780);
    }

    public WIFICollection(y0d y0dVar) {
        this.in = y0dVar;
        AppMonitor.Counter.commit("passivelocation", "WIFICollection", 1.0d);
    }

    private List<Code> find(Code code) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a0506d59", new Object[]{this, code});
        }
        ArrayList arrayList = new ArrayList();
        for (Code code2 : this.codes) {
            if (code2.getModuleToken() == code.getModuleToken()) {
                arrayList.add(code2);
            }
        }
        return arrayList;
    }

    @Override // tb.znb
    public c collect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b6690b20", new Object[]{this});
        }
        c cVar = new c();
        cVar.f(SwitchOption.CollectionType.WIFI);
        cVar.e(this.wr);
        return cVar;
    }

    @Override // tb.znb
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return this.isValid;
    }

    @Override // tb.znb
    public void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        for (Code code : this.codes) {
            if (code.getModuleToken() == i) {
                this.codes.remove(code);
            }
        }
    }

    @Override // tb.znb
    public synchronized void modifiy(Code code, SwitchOption switchOption) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7548037a", new Object[]{this, code, switchOption});
            return;
        }
        if (switchOption.getIsOpen()) {
            for (Code code2 : find(code)) {
                this.codes.remove(code2);
            }
            this.codes.add(code);
            this.options.put(Integer.valueOf(code.getModuleToken()), switchOption);
            if (switchOption.getInterval() > 0) {
                mdh.d(TAG, "********** wifi set alarm " + b.a(code, switchOption) + " **********");
                a.a(0, switchOption.getInterval(), code, switchOption);
            }
        } else {
            for (Code code3 : find(code)) {
                this.codes.remove(code3);
            }
        }
        mdh.a(TAG, "modifiy codes" + this.codes);
        if (this.codes.size() == 0) {
            if (this.receiver != null) {
                Globals.getApplication().unregisterReceiver(this.receiver);
                mdh.d(TAG, "unRegister Wifi !" + JSON.toJSONString(code));
                this.isValid = false;
                this.receiver = null;
            } else {
                mdh.d(TAG, "receiver null");
            }
        } else if (this.receiver == null) {
            mdh.d(TAG, "Register Wifi !" + JSON.toJSONString(code));
            this.isValid = true;
            this.receiver = new WifiScanReceiver(this.codes, this.in, this.wr, this.options);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            Globals.getApplication().registerReceiver(this.receiver, intentFilter);
        }
        if (switchOption.getIsOpen()) {
            Map<String, Object> feature = switchOption.getFeature();
            if (feature != null) {
                Object obj = feature.get("active_scan");
                if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                    mdh.d(TAG, "scan not set Boolean");
                } else {
                    WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                    if (!wifiManager.isWifiEnabled()) {
                        mdh.d(TAG, "Ignore wifi alarm receiver!\u3000wifiEnable = " + wifiManager.isWifiEnabled());
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Wifi start scan! LRT = ");
                    if (this.wr == null) {
                        str = "NULL";
                    } else {
                        str = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(this.wr.b()));
                    }
                    sb.append(str);
                    mdh.d(TAG, sb.toString());
                    try {
                        wifiManager.startScan();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}

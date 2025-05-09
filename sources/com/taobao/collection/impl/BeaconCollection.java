package com.taobao.collection.impl;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.a;
import com.taobao.collection.common.c;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.collection.receiver.BeaconScanReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.b62;
import tb.bda;
import tb.mdh;
import tb.t2o;
import tb.y0d;
import tb.znb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BeaconCollection implements znb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_SCAN = "active_scan";
    private static final String TAG = "lbs_sdk.coll_BeaconCollection";
    private y0d in;
    private BroadcastReceiver receiver;
    private Set<Code> codes = new CopyOnWriteArraySet();
    private boolean isValid = false;
    private BeaconRecord br = new BeaconRecord();

    static {
        t2o.a(789577793);
        t2o.a(789577780);
    }

    public BeaconCollection(y0d y0dVar) {
        this.in = y0dVar;
        AppMonitor.Counter.commit("passivelocation", "BeaconCollection", 1.0d);
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
        cVar.f(SwitchOption.CollectionType.BEACON);
        cVar.e(this.br);
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
    public void modifiy(Code code, SwitchOption switchOption) {
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
            if (switchOption.getInterval() > 0) {
                mdh.d(TAG, "**********  set alarm " + code + ":" + switchOption + " **********");
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
                bda.a().unregisterReceiver(this.receiver);
                this.isValid = false;
                this.receiver = null;
                mdh.d(TAG, "unRegister beacon !" + JSON.toJSONString(code));
            } else {
                mdh.d(TAG, "receiver null");
            }
        } else if (this.receiver == null) {
            this.isValid = true;
            mdh.d(TAG, "Register beacon !" + JSON.toJSONString(code));
            this.receiver = new BeaconScanReceiver(this.codes, this.in, this.br);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b62.BROAD_CAST_ACTION);
            bda.a().registerReceiver(this.receiver, intentFilter);
        } else {
            mdh.d(TAG, "receiver not null");
        }
        if (switchOption.getIsOpen()) {
            Map<String, Object> feature = switchOption.getFeature();
            if (feature == null) {
                mdh.d(TAG, "feature null");
                return;
            }
            Object obj = feature.get("active_scan");
            if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                mdh.d(TAG, "scan not set Boolean");
                return;
            }
            Object obj2 = feature.get("uuid");
            if (obj2 instanceof Set) {
                new b62(bda.a(), (Set) obj2).p(switchOption.getTimeRange());
            } else {
                mdh.d(TAG, "uuid not set object");
            }
        }
    }
}

package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog;
import com.taobao.weex.common.Constants;
import tb.o3s;
import tb.t2o;
import tb.v2s;
import tb.xs2;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b extends MemoryLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = b.class.getSimpleName();
    public final String c;

    static {
        t2o.a(295699740);
    }

    public b(String str, String str2) {
        super(str2);
        this.c = str;
        g();
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1965108420) {
            super.e();
            return null;
        } else if (hashCode == 1524122898) {
            super.a((SmartLandingTask) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/strategy/PersistentLog");
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog, tb.nib
    public void a(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad84512", new Object[]{this, smartLandingTask});
            return;
        }
        super.a(smartLandingTask);
        h();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy.MemoryLog
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        super.e();
        try {
            xs2.b(v2s.o().f().getApplication(), this.c, "");
        } catch (Exception e) {
            o3s.c(d, "clearCache exp", e);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
            return;
        }
        try {
            String a2 = xs2.a(v2s.o().f().getApplication(), this.c);
            if (!zqq.a(a2)) {
                JSONObject parseObject = JSON.parseObject(a2);
                for (String str : parseObject.keySet()) {
                    JSONObject jSONObject = parseObject.getJSONObject(str);
                    if (jSONObject != null) {
                        MemoryLog.LogItem logItem = new MemoryLog.LogItem();
                        logItem.times = jSONObject.getIntValue(Constants.KEY_TIMES);
                        logItem.interval = jSONObject.getLongValue(Constants.Name.INTERVAL);
                        this.b.put(str, logItem);
                    }
                }
            }
        } catch (Exception e) {
            o3s.c(d, "loadData exp", e);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        try {
            xs2.b(v2s.o().f().getApplication(), this.c, JSON.toJSONString(this.b));
        } catch (Exception e) {
            o3s.c(d, "saveData exp.", e);
        }
    }
}

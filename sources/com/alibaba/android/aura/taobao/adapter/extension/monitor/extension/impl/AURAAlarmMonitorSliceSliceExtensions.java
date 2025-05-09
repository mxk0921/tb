package com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.monitor.model.AURABlockDataModel;
import com.alibaba.security.realidentity.f3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.bh;
import tb.ks;
import tb.mi;
import tb.t2o;
import tb.tj;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.error.alarm.monitor.slice")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAAlarmMonitorSliceSliceExtensions extends ks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789170);
    }

    public static /* synthetic */ Object ipc$super(AURAAlarmMonitorSliceSliceExtensions aURAAlarmMonitorSliceSliceExtensions, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/monitor/extension/impl/AURAAlarmMonitorSliceSliceExtensions");
    }

    @Override // tb.vab
    public AURABlockDataModel G(mi miVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("6f0c9a02", new Object[]{this, miVar});
        }
        Map<String, Object> d = miVar.d();
        if (bh.b(d) || (obj = d.get("requestParams")) == null) {
            return null;
        }
        AURABlockDataModel r = r(new HashMap<String, Object>(obj) { // from class: com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl.AURAAlarmMonitorSliceSliceExtensions.1
            public final /* synthetic */ Object val$blockData;

            {
                this.val$blockData = obj;
                put("requestParams", obj);
            }
        });
        if (r != null) {
            d.remove("requestParams");
        }
        return r;
    }

    public final AURABlockDataModel r(Map<String, Object> map) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("50cc1609", new Object[]{this, map});
        }
        String c = tj.c(map);
        if (TextUtils.isEmpty(c)) {
            i = 0;
        } else {
            i = c.length();
        }
        if (i <= 153600) {
            return null;
        }
        String valueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + f3.c;
            arrayList.add(new AURABlockDataModel.AURASliceDataModel(valueOf, String.valueOf(i3), c.substring(i2, Math.min(i4, i))));
            i3++;
            i2 = i4;
        }
        return new AURABlockDataModel(valueOf, arrayList);
    }
}

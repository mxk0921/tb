package com.taobao.tbpoplayer;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.tbpoplayer.AccsPopLayerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.hst;
import tb.t2o;
import tb.t4f;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AccsPopLayerService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<JSONObject> f13394a = new ArrayList();

    static {
        t2o.a(790626329);
    }

    public static /* synthetic */ Object ipc$super(AccsPopLayerService accsPopLayerService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/AccsPopLayerService");
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e670e2", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("event");
            String string2 = jSONObject.getString("param");
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "BroadcastTrigger.ACCS.onData.event:{" + string + "},param:{" + string2 + "}.");
            if (PopLayer.isSetup() && t4f.a().d()) {
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", string);
                intent.putExtra("param", string2);
                intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "accs");
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
                return;
            }
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "BroadcastTrigger.ACCS.onData.PopLayer is not setup. event:{" + string + "},param:{" + string2 + "}.");
            ((ArrayList) f13394a).add(jSONObject);
        } catch (Throwable th) {
            wdm.h("accs handleAccsMsg fail.", th);
        }
    }

    public final /* synthetic */ void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c28407", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject == null) {
                    wdm.a("UpdateAccsConfigDataTask.AccsActionData is null");
                } else {
                    b(parseObject);
                }
            } catch (Throwable th) {
                wdm.h("UpdateAccsConfigDataTask.parseObject.fail.", th);
            }
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            wdm.d("ACCS onBind: serviceId:{%s},errorCode:{%s}.", str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        try {
            wdm.d("BroadcastTrigger.ACCS.onData: serviceId:{%s},userId:{%s},dataId:{%s}.data：{%s}.", str, str2, str3, new String(bArr));
            final String str4 = new String(bArr);
            if (!TextUtils.isEmpty(str4)) {
                hst.b(new Runnable() { // from class: tb.h70
                    @Override // java.lang.Runnable
                    public final void run() {
                        AccsPopLayerService.this.i(str4);
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("accs onData fail.", th);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else {
            wdm.d("ACCS onResponse: serviceId:{%s},dataId：{%s},errorCode:{%s}.", str, str2, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        } else {
            wdm.d("ACCS onSendData: serviceId:{%s},dataId：{%s},errorCode:{%s}.", str, str2, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            wdm.d("ACCS onUnbind: serviceId:{%s},errorCode:{%s}.", str, Integer.valueOf(i));
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c459b6af", new Object[]{context});
            return;
        }
        try {
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "BroadcastTrigger.ACCS.onData.sendAccsCacheData");
            if (!PopLayer.isSetup()) {
                wdm.d("ACCS sendAccsCacheData PopLayer is not setup.", new Object[0]);
                return;
            }
            Iterator it = ((ArrayList) f13394a).iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String string = jSONObject.getString("event");
                String string2 = jSONObject.getString("param");
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "BroadcastTrigger.ACCS.onData.sendAccsCacheData.event:{" + string + "},param:{" + string2 + "}.");
                if (!TextUtils.isEmpty(string)) {
                    Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                    intent.putExtra("event", string);
                    intent.putExtra("param", string2);
                    intent.putExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS, "waitForSetUp");
                    intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "accs");
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                }
            }
            ((ArrayList) f13394a).clear();
        } catch (Throwable th) {
            wdm.h("accs fail.", th);
        }
    }
}

package com.taobao.android.jarviswe.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gtf;
import tb.htf;
import tb.ru1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BehaviXIPVReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944534);
    }

    public static /* synthetic */ Object ipc$super(BehaviXIPVReceiver behaviXIPVReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/jarviswe/receiver/BehaviXIPVReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundleExtra;
        Bundle bundleExtra2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if ("com.taobao.taobao".equals(intent.getPackage()) && (bundleExtra = intent.getBundleExtra(ru1.TRIGGER_CONTENT)) != null && (bundleExtra2 = intent.getBundleExtra(ru1.FEATURE_CONTENT)) != null && (string = bundleExtra2.getString(ru1.FEATURE_JSON)) != null) {
                String string2 = bundleExtra.getString("scene");
                if (!TextUtils.isEmpty(string2) && string2.equals("Page_NewDetail")) {
                    htf.b().f(string, bundleExtra);
                } else if (!TextUtils.isEmpty(string2) && string2.equals("Page_Detail")) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : bundleExtra.keySet()) {
                        jSONObject.put(str, bundleExtra.get(str));
                    }
                    gtf.i().o("Page_Detail_Reserve", "TriggerUseBX", jSONObject, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

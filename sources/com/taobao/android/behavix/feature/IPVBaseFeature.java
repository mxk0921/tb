package com.taobao.android.behavix.feature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.statistic.TBS;
import tb.f82;
import tb.n82;
import tb.o82;
import tb.ru1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IPVBaseFeature extends ru1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class IPVGenReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750524);
        }

        public static /* synthetic */ Object ipc$super(IPVGenReceiver iPVGenReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/feature/IPVBaseFeature$IPVGenReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            JSONObject jSONObject = (JSONObject) intent.getSerializableExtra("feature");
            JSONObject jSONObject2 = (JSONObject) intent.getSerializableExtra("event");
            if (jSONObject != null && jSONObject2 != null) {
                if (jSONObject.get("bizArgs") instanceof JSONObject) {
                    jSONObject.put("bizArgs", (Object) ((JSONObject) jSONObject.get("bizArgs")).toJSONString());
                }
                if (jSONObject2.get("destroy") instanceof Boolean) {
                    jSONObject2.put("destroy", (Object) Integer.valueOf(jSONObject2.getBooleanValue("destroy") ? 1 : 0));
                }
                new IPVBaseFeature(null).b(jSONObject2, jSONObject);
                BHXCXXInnerBridge.transferFeatureToBUFS(jSONObject, "ipv");
            }
        }
    }

    static {
        t2o.a(404750523);
    }

    public IPVBaseFeature(JSONObject jSONObject) {
        super(jSONObject);
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new IPVGenReceiver(), new IntentFilter("BehaviX_ipv_gen"));
        }
    }

    public static /* synthetic */ Object ipc$super(IPVBaseFeature iPVBaseFeature, String str, Object... objArr) {
        if (str.hashCode() == -1015615488) {
            return new Boolean(super.b((JSONObject) objArr[0], (JSONObject) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/feature/IPVBaseFeature");
    }

    @Override // tb.ru1
    public JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("669a4348", new Object[]{this, jSONObject});
        }
        return null;
    }

    @Override // tb.ru1
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "IPV";
    }

    @Override // tb.ru1
    public boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c376f000", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || jSONObject2.size() == 0) {
            return false;
        }
        if (super.b(jSONObject, jSONObject2)) {
            TBS.Ext.commitEvent("BehaviX", UtUtils.CHANGED_UPP_EVENT_ID, "ipv_broadcast", null, null, "ipvFeatures=" + jSONObject2.toJSONString());
        }
        n82 n82Var = new n82();
        n82Var.b = jSONObject2.getLongValue("createTime");
        n82Var.f24567a = "IPV";
        n82Var.c = jSONObject2.getString("fromScene");
        o82.c().a(n82Var);
        return true;
    }
}

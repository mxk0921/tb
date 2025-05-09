package com.taobao.android.tbsku.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ag0;
import tb.b8v;
import tb.cjz;
import tb.n4v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuBizBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9576a;
    public final TBXSkuCore b;

    static {
        t2o.a(785383480);
    }

    public SkuBizBroadcastReceiver(TBXSkuCore tBXSkuCore, String str) {
        this.b = tBXSkuCore;
        this.f9576a = str;
    }

    public static /* synthetic */ Object ipc$super(SkuBizBroadcastReceiver skuBizBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/channel/SkuBizBroadcastReceiver");
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c913643", new Object[]{this, jSONObject});
        } else if (cjz.a()) {
            SkuLogUtils.x("SkuBizBroadcastReceiver.dealWithMacColor");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject parseObject = JSON.parseObject(jSONObject.getString("params"));
                if (parseObject != null) {
                    jSONObject2.putAll(parseObject);
                }
            } catch (Throwable unused) {
            }
            b8v e = this.b.q().K().getEventHandler().e();
            e.t(ag0.EVENT_TYPE);
            e.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver.1
                {
                    put("subType", "change_prop");
                }
            }, null));
            e.u("extraParams", new ArrayList<Object>(jSONObject2) { // from class: com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver.2
                public final /* synthetic */ JSONObject val$params;

                {
                    this.val$params = jSONObject2;
                    add("propChangeFromMacColor");
                    add(jSONObject2);
                }
            }.toArray());
            this.b.q().K().getEventHandler().k(e);
        }
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f0ae545", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(str2)) {
            return true;
        }
        if (str.equals(URLDecoder.decode(str2, "UTF-8"))) {
            return true;
        }
        return false;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43a234", new Object[]{this, jSONObject});
        } else {
            this.b.q().Z(jSONObject);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!TextUtils.isEmpty(this.f9576a)) {
            try {
                JSONObject parseObject = JSON.parseObject(intent.getStringExtra("stringifyData"));
                if (parseObject != null && b(this.f9576a, parseObject.getString("skuToken"))) {
                    String string = parseObject.getString("action");
                    if ("biz_maccolor".equalsIgnoreCase(string)) {
                        a(parseObject);
                    } else if (!TextUtils.isEmpty(string)) {
                        c(parseObject);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("json", JSON.toJSONString(parseObject));
                    hashMap.put("codePath", "SkuBizBroadcastReceiver_onReceive");
                    n4v.b(19999, "Sku_Code_Track", hashMap);
                }
            } catch (Throwable unused) {
            }
        }
    }
}

package com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arm;
import tb.t2o;
import tb.uqa;
import tb.xqm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class OrderFinishedBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ORDER_DID_FINISHED = "tb_info_flow_preload";

    /* renamed from: a  reason: collision with root package name */
    public xqm f12647a;

    static {
        t2o.a(729809715);
    }

    public static /* synthetic */ Object ipc$super(OrderFinishedBroadcastReceiver orderFinishedBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/gateway/prefetch/notify/paysuccess/OrderFinishedBroadcastReceiver");
    }

    public final String a(Intent intent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecd91f2", new Object[]{this, intent});
        }
        try {
            jSONObject = JSON.parseObject(intent.getStringExtra("params"));
        } catch (Exception e) {
            uqa.b("recmdPrefetch", "OrderFinishedBroadcastReceiver", "解析上行参数出现异常: " + e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString("backUrl");
        }
        uqa.b("recmdPrefetch", "OrderFinishedBroadcastReceiver", "jsonObject == null");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (this.f12647a == null) {
            this.f12647a = new xqm();
        }
        String a2 = a(intent);
        arm.f("order");
        this.f12647a.g(a2);
        uqa.b("recmdPrefetch", "OrderFinishedBroadcastReceiver", "收到通知了");
    }
}

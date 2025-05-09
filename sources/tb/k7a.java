package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k7a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f22445a;
        public final /* synthetic */ Context b;

        public a(JSONObject jSONObject, Context context) {
            this.f22445a = jSONObject;
            this.b = context;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                k7a.a(this.b, netResponse);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            JSONObject jSONObject2 = this.f22445a;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("detailInfo")) == null) {
                str = "领取成功";
            } else {
                str = jSONObject.getString("couponThresholdTip");
            }
            a1u.a(this.b, str);
            hha.c("GetCouponHelper", "onSuccess | toastString=" + str);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                k7a.a(this.b, netResponse);
            }
        }
    }

    static {
        t2o.a(295698910);
    }

    public static /* synthetic */ void a(Context context, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc8cb0c", new Object[]{context, netResponse});
        } else {
            c(context, netResponse);
        }
    }

    public static void b(xea xeaVar, Context context, JSONObject jSONObject, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37db2d54", new Object[]{xeaVar, context, jSONObject, liveItem, str});
            return;
        }
        new i7a(new a(jSONObject, context)).K(jSONObject);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("service_mark", "officialCoupon");
        hashMap.putAll(zha.e(xeaVar, liveItem));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("clickSource", str);
        }
        if (kkr.i().o() != null) {
            kkr.i().o().c("ServiceMark", hashMap);
        }
    }

    public static void c(Context context, NetResponse netResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ba9a9d", new Object[]{context, netResponse});
            return;
        }
        String str2 = "活动太火爆了，请稍后再试";
        if (yga.a() && netResponse != null && !TextUtils.isEmpty(netResponse.getRetCode()) && netResponse.getRetCode().startsWith("FAIL_BIZ_") && !TextUtils.isEmpty(netResponse.getRetMsg())) {
            str2 = netResponse.getRetMsg();
        }
        a1u.a(context, str2);
        StringBuilder sb = new StringBuilder("onError | code=");
        if (netResponse == null) {
            str = "";
        } else {
            str = netResponse.getRetCode();
        }
        sb.append(str);
        sb.append("  toastMsg=");
        sb.append(str2);
        hha.c("GetCouponHelper", sb.toString());
    }
}

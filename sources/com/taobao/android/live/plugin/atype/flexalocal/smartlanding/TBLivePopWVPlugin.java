package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import tb.ajr;
import tb.b0d;
import tb.brq;
import tb.f6q;
import tb.kpw;
import tb.nkr;
import tb.t2o;
import tb.t7q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLivePopWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8659a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f8659a = str;
            this.b = str2;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                TBLivePopWVPlugin.access$000(TBLivePopWVPlugin.this, this.b, "error", this.f8659a);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            Log.e("TBLivePopWVPlugin", "popShowCallBack onSuccess " + this.f8659a);
            TBLivePopWVPlugin.access$000(TBLivePopWVPlugin.this, this.b, "success", this.f8659a);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295699716);
    }

    public static /* synthetic */ void access$000(TBLivePopWVPlugin tBLivePopWVPlugin, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f722a90", new Object[]{tBLivePopWVPlugin, str, str2, str3});
        } else {
            tBLivePopWVPlugin.trackUploadSmartLandingTask(str, str2, str3);
        }
    }

    public static /* synthetic */ Object ipc$super(TBLivePopWVPlugin tBLivePopWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/TBLivePopWVPlugin");
    }

    private void trackUploadSmartLandingTask(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cddac64", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene_code", str);
        hashMap.put("link_node_key", "smartlanding_pop_show_callback");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str2);
        jSONObject.put("data", (Object) str3);
        hashMap.put("link_content", jSONObject.toJSONString());
        t7q.x(nkr.PAGE_TAOBAOLIVECONTAINER, "full_link_monitoring", hashMap);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ajr ajrVar = new ajr(str, str2, wVCallBackContext);
        str.hashCode();
        if (str.equals("popCloseCallBack")) {
            Log.e("TBLivePopWVPlugin", "popCloseCallBack " + str2);
            ajrVar.c();
            return true;
        } else if (!str.equals("popShowCallBack")) {
            ajrVar.b(NO_FUNCTION);
            return false;
        } else {
            Log.e("TBLivePopWVPlugin", "popShowCallBack " + str2);
            JSONObject e = brq.e(str2);
            JSONObject jSONObject = e != null ? e.getJSONObject("pop") : null;
            String str3 = "";
            String string = jSONObject != null ? jSONObject.getString("popId") : str3;
            String string2 = jSONObject != null ? jSONObject.getString("scene") : str3;
            if (jSONObject != null) {
                str3 = jSONObject.getString("exParams");
            }
            if (!TextUtils.isEmpty(string)) {
                new f6q(new a(str2, string)).K(string, string2, str3);
            }
            ajrVar.c();
            return true;
        }
    }
}

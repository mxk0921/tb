package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xuw implements ksc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AbilityHubAdapter f31619a;
    public zq b;
    public WXSDKInstance c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f31620a;
        public final /* synthetic */ JSCallback b;
        public final /* synthetic */ JSCallback c;

        public a(xuw xuwVar, JSCallback jSCallback, JSCallback jSCallback2, JSCallback jSCallback3) {
            this.f31620a = jSCallback;
            this.b = jSCallback2;
            this.c = jSCallback3;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            JSCallback jSCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult.getStatusCode() == 0) {
                JSCallback jSCallback2 = this.f31620a;
                if (jSCallback2 != null) {
                    jSCallback2.invoke(executeResult.toFormattedData());
                }
            } else if (executeResult.getStatusCode() == 1) {
                JSCallback jSCallback3 = this.b;
                if (jSCallback3 != null) {
                    jSCallback3.invokeAndKeepAlive(executeResult.toFormattedData());
                }
            } else if (executeResult.getStatusCode() == 99) {
                JSCallback jSCallback4 = this.b;
                if (jSCallback4 != null) {
                    jSCallback4.invoke(executeResult.toFormattedData());
                }
            } else if (executeResult.getStatusCode() > 99 && (jSCallback = this.c) != null) {
                jSCallback.invoke(executeResult.toFormattedData());
            }
        }
    }

    static {
        t2o.a(85983248);
        t2o.a(85983238);
    }

    @Override // tb.ksc
    public void a(WXSDKInstance wXSDKInstance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35873577", new Object[]{this, wXSDKInstance});
            return;
        }
        this.c = wXSDKInstance;
        if (!TextUtils.isEmpty(wXSDKInstance.getBundleUrl())) {
            str = Uri.parse(this.c.getBundleUrl()).buildUpon().clearQuery().build().toString();
        } else {
            str = "default";
        }
        this.b = new zq(str, "Weex1");
        this.f31619a = new AbilityHubAdapter(this.b);
        this.b.d(new WeakReference<>(this.c.getContext()));
    }

    @Override // tb.ksc
    public Object b(String str, String str2, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2, JSCallback jSCallback3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57d2ef81", new Object[]{this, str, str2, jSONObject, jSCallback, jSCallback2, jSCallback3});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MUSMonitor.MODULE_DIM_ABILITY, (Object) str);
        jSONObject2.put("api", (Object) str2);
        AppMonitor.Counter.commit("weex", "WXMegBridgeCall", jSONObject2.toJSONString(), 1.0d);
        HashMap hashMap = new HashMap();
        hashMap.put("wxInstance", this.c);
        new xq(this.b).e(hashMap);
        this.f31619a.j(str, str2, new xq().p(this.c.getContainerView()), jSONObject, new a(this, jSCallback, jSCallback3, jSCallback2));
        return null;
    }
}

package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.module.builtin.WXNavigatorModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dvw implements cbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String MUS = "com.taobao.android.intent.category.MUS";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(dvw dvwVar) {
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            }
        }
    }

    static {
        t2o.a(980418668);
        t2o.a(982516046);
    }

    @Override // tb.cbe
    public void a(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ec83c0", new Object[]{this, weexInstance, str});
        } else if (weexInstance != null) {
            String bundleUrl = weexInstance.getBundleUrl();
            if (!TextUtils.isEmpty(bundleUrl) && bundleUrl.contains("wx_popId")) {
                c(weexInstance.getContext(), bundleUrl);
            }
        }
    }

    @Override // tb.cbe
    public void b(WeexInstance weexInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2495a3", new Object[]{this, weexInstance, str});
            return;
        }
        if (weexInstance != null) {
            String bundleUrl = weexInstance.getBundleUrl();
            if (!TextUtils.isEmpty(bundleUrl) && bundleUrl.contains("wx_popId")) {
                c(weexInstance.getContext(), bundleUrl);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (uvh.f().a() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) str);
                if (uvh.f().a().a(weexInstance.getContext(), ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance(), jSONObject.toJSONString())) {
                    if (weexInstance.getContext() instanceof Activity) {
                        ((Activity) weexInstance.getContext()).finish();
                        return;
                    }
                    return;
                }
            }
            try {
                String string = JSON.parseObject(str).getString("url");
                if (!TextUtils.isEmpty(string)) {
                    Uri parse = Uri.parse(string);
                    String scheme = parse.getScheme();
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (TextUtils.isEmpty(scheme)) {
                        buildUpon.scheme("http");
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                    intent.addCategory("com.taobao.android.intent.category.MUS");
                    intent.putExtra("instanceId", weexInstance.getInstanceId());
                    weexInstance.getContext().startActivity(intent);
                    if (weexInstance.getContext() instanceof Activity) {
                        ((Activity) weexInstance.getContext()).finish();
                    }
                }
            } catch (Exception e) {
                wvh.a().b("MUSNativeApiModel.push", e);
                dwh.h(WXNavigatorModule.LOG_TAG, e);
            }
        } else {
            dwh.f(WXNavigatorModule.LOG_TAG, "param is empty");
        }
    }

    public final void c(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f069f9", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null || !parse.isHierarchical() || parse.getQueryParameter("wx_popId") == null) {
                str2 = "";
            } else {
                str2 = parse.getQueryParameter("wx_popId");
            }
            if (!TextUtils.isEmpty(str2)) {
                n9 n9Var = new n9();
                n9Var.i(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "dismissStdPop");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("popId", (Object) str2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("animation", (Object) "fadeInOut");
                jSONObject3.put("tapEnable", (Object) Boolean.TRUE);
                jSONObject3.put("pushType", (Object) "outterJump");
                jSONObject3.put("originHeight", (Object) 1);
                jSONObject3.put("maxHeight", (Object) 1);
                jSONObject2.put(h9.KEY_POP_CONFIG, (Object) jSONObject3);
                jSONObject.put("params", (Object) jSONObject2);
                new y7().b(new n8(jSONObject), n9Var, new a(this));
            }
        }
    }
}

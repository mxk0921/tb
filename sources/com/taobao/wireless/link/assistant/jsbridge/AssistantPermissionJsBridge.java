package com.taobao.wireless.link.assistant.jsbridge;

import android.app.Application;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import tb.irg;
import tb.jsg;
import tb.kpw;
import tb.lh8;
import tb.md1;
import tb.mr4;
import tb.nsw;
import tb.qd1;
import tb.qgf;
import tb.t2o;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantPermissionJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_PERMISSION = "assistant_permission";
    public static final String CLASSNAME_ASSISTANT_PERMISSION = "AssistantPermissionJsBridge";
    private String id;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f14168a;
        public final /* synthetic */ WVCallBackContext b;
        public final /* synthetic */ String c;

        public a(Application application, WVCallBackContext wVCallBackContext, String str) {
            this.f14168a = application;
            this.b = wVCallBackContext;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!qd1.r(this.f14168a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("supportAssistant", false);
                    jSONObject.put("buttonTitle", "当前设备不支持小助手，奖励稍候发放");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject);
                this.b.success(nswVar);
                irg.a("link_tag", "AssistantPermissionJsBridge === getMsgData === 不支持小助手：" + jSONObject);
                Map<String, String> h = qd1.h(this.f14168a);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                lh8.c(this.f14168a, arrayList, h, null);
            } else if (jsg.a(this.f14168a)) {
                AssistantPermissionJsBridge.access$000(AssistantPermissionJsBridge.this, this.f14168a, this.b);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("hasPermission", false);
                    jSONObject2.put("buttonTitle", "开启失败，请重新尝试");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                nsw nswVar2 = new nsw();
                nswVar2.d("data", jSONObject2);
                this.b.success(nswVar2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements qgf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f14169a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f14169a = wVCallBackContext;
        }

        public void a(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b39fe04b", new Object[]{this, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("hasPermission", true);
                if (!z) {
                    String str = (String) map.get("local");
                    if (TextUtils.isEmpty(str) || !TextUtils.equals("true", str)) {
                        jSONObject.put("buttonTitle", "当前网络繁忙，奖励稍后发放");
                    } else {
                        jSONObject.put("buttonTitle", "恭喜你领取成功");
                    }
                } else if (!TextUtils.equals("false", (String) map.get(AssistantPermissionJsBridge.access$100(AssistantPermissionJsBridge.this)))) {
                    jSONObject.put("buttonTitle", "当前网络繁忙，奖励稍后发放");
                } else if (!TextUtils.isEmpty(ypg.e().c.f15934a)) {
                    jSONObject.put("buttonTitle", ypg.e().c.f15934a);
                } else {
                    jSONObject.put("buttonTitle", "恭喜你领取成功");
                }
            } catch (Exception e) {
                irg.a("link_tag", "AssistantPermissionJsBridge === execute === 小助手jsbridge调用，获取权限：" + e.getMessage());
            }
            nsw nswVar = new nsw();
            nswVar.d("data", jSONObject);
            this.f14169a.success(nswVar);
            irg.a("link_tag", "AssistantPermissionJsBridge === execute === 小助手jsbridge调用，获取权限数据=" + jSONObject);
        }
    }

    static {
        t2o.a(1030750247);
    }

    public static /* synthetic */ void access$000(AssistantPermissionJsBridge assistantPermissionJsBridge, Application application, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a34cbc", new Object[]{assistantPermissionJsBridge, application, wVCallBackContext});
        } else {
            assistantPermissionJsBridge.getCallBackFromServer(application, wVCallBackContext);
        }
    }

    public static /* synthetic */ String access$100(AssistantPermissionJsBridge assistantPermissionJsBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9a8c8c1", new Object[]{assistantPermissionJsBridge});
        }
        return assistantPermissionJsBridge.id;
    }

    private void getCallBackFromServer(Application application, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ad48ad", new Object[]{this, application, wVCallBackContext});
        } else {
            md1.h().b(application, qd1.h(application), new b(wVCallBackContext));
        }
    }

    private void getMsgData(Application application, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c645534a", new Object[]{this, application, wVCallBackContext, str});
        } else {
            mr4.b().a().postDelayed(new a(application, wVCallBackContext, str), 800L);
        }
    }

    public static /* synthetic */ Object ipc$super(AssistantPermissionJsBridge assistantPermissionJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/jsbridge/AssistantPermissionJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, ACTION_ASSISTANT_PERMISSION)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("id")) {
                    this.id = (String) jSONObject.get("id");
                }
            } catch (Exception e) {
                irg.a("link_tag", "AssistantPermissionJsBridge === execute === 获取id异常：" + e.getMessage());
            }
            if (TextUtils.isEmpty(this.id)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("supportAssistant", qd1.r(ypg.e().f32260a));
                    jSONObject2.put("buttonTitle", "活动异常");
                } catch (Exception unused) {
                    irg.a("link_tag", "AssistantPermissionJsBridge === execute === 获取id异常：" + jSONObject2);
                }
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject2);
                wVCallBackContext.success(nswVar);
                return false;
            } else if (wVCallBackContext != null) {
                getMsgData(ypg.e().f32260a, wVCallBackContext, this.id);
                return true;
            }
        }
        return false;
    }
}

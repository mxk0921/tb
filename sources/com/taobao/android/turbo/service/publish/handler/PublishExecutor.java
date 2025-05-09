package com.taobao.android.turbo.service.publish.handler;

import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.dov;
import tb.j5o;
import tb.jpu;
import tb.kee;
import tb.qpu;
import tb.r4c;
import tb.rb;
import tb.t2o;
import tb.tpu;
import tb.ud0;
import tb.v3i;
import tb.vaj;
import tb.xwc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PublishExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f9768a;
    public final qpu b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455605);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public final void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            PublishExecutor publishExecutor = PublishExecutor.this;
            ckf.f(str, "error");
            PublishExecutor.d(publishExecutor, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        public c(JSONObject jSONObject, String str) {
            this.b = jSONObject;
            this.c = str;
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            } else {
                ckf.g(str, rb.RESULT_KEY);
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
                return;
            }
            ckf.g(str, "retString");
            PublishExecutor.e(PublishExecutor.this, str, this.b, this.c);
        }
    }

    static {
        t2o.a(916455604);
    }

    public PublishExecutor(qpu qpuVar) {
        ckf.g(qpuVar, "turboEngineContext");
        this.b = qpuVar;
        this.f9768a = qpuVar.getContext();
    }

    public static final /* synthetic */ void a(PublishExecutor publishExecutor, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af113629", new Object[]{publishExecutor, jSONObject, jSONObject2, str});
        } else {
            publishExecutor.f(jSONObject, jSONObject2, str);
        }
    }

    public static final /* synthetic */ Context b(PublishExecutor publishExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4e5786f4", new Object[]{publishExecutor});
        }
        return publishExecutor.f9768a;
    }

    public static final /* synthetic */ qpu c(PublishExecutor publishExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("70edb0a2", new Object[]{publishExecutor});
        }
        return publishExecutor.b;
    }

    public static final /* synthetic */ void d(PublishExecutor publishExecutor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d451828", new Object[]{publishExecutor, str});
        } else {
            publishExecutor.h(str);
        }
    }

    public static final /* synthetic */ void e(PublishExecutor publishExecutor, String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0fce0", new Object[]{publishExecutor, str, jSONObject, str2});
        } else {
            publishExecutor.i(str, jSONObject, str2);
        }
    }

    public final void f(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e49fcf9", new Object[]{this, jSONObject, jSONObject2, str});
            return;
        }
        try {
            String str2 = UmiWvPlugin.PLUGIN_NAME;
            String str3 = "openRecord";
            if (ckf.b(jSONObject.get(BehavorID.OPENPAGE), "2")) {
                str3 = "openPublish";
            }
            Object obj = jSONObject.get("plugin_name");
            Object obj2 = jSONObject.get("method_name");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                str2 = (String) obj;
                str3 = (String) obj2;
            }
            if (ckf.b(str3, "quickPreview")) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("data", (Object) jSONObject2);
                jSONObject4.put("publishParams", (Object) jSONObject);
                jSONObject3 = jSONObject4;
            } else {
                jSONObject3 = jSONObject;
            }
            ((kee) this.b.getService(kee.class)).Q0(str2, str3, jSONObject3, new c(jSONObject3, str), new b());
        } catch (Exception e) {
            tpu.Companion.a("PublishExecutor", "调用Windvane异常", e);
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d14c1eb8", new Object[]{this, str});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "PublishExecutor", "Windvane失败回调的时机，error=" + str, null, 4, null);
    }

    public final void i(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f150", new Object[]{this, str, jSONObject, str2});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            Object obj = jSONObject.get(dov.KEY_BACK_PARAMS);
            if (obj != null) {
                ckf.f(parseObject, rb.RESULT_KEY);
                parseObject.put((JSONObject) "backParams", (String) obj);
            }
            if (ckf.b(parseObject.get("async_publish"), "1")) {
                j(parseObject, str2);
            }
        } catch (Exception e) {
            tpu.Companion.a("PublishExecutor", "Windvane成功回调的时机，处理返回结果异常", e);
        }
    }

    public final void j(JSONObject jSONObject, String str) {
        int E1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ec67ba", new Object[]{this, jSONObject, str});
            return;
        }
        xwc xwcVar = (xwc) this.b.getService(xwc.class);
        int E12 = xwcVar.E1(str);
        Object obj = jSONObject.get("backParams");
        if (obj instanceof JSONObject) {
            Object obj2 = ((JSONObject) obj).get(vaj.KEY_TAB_ID);
            if ((obj2 instanceof String) && (E1 = xwcVar.E1((String) obj2)) >= 0) {
                E12 = E1;
            }
        }
        xwcVar.selectTab(E12);
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45c256", new Object[]{this, jSONObject});
            return;
        }
        ud0.a aVar = ud0.Companion;
        if (!aVar.d().isLogin()) {
            tpu.a.b(tpu.Companion, "PublishExecutor", "执行发布，用户未登录", null, 4, null);
            return;
        }
        xwc xwcVar = (xwc) this.b.getService(xwc.class);
        TabModel d0 = xwcVar.d0(xwcVar.getCurrentIndex());
        Object obj = null;
        String id = d0 != null ? d0.getId() : null;
        JSONObject jSONObject2 = jSONObject != null ? jSONObject : new JSONObject();
        if (jSONObject != null) {
            obj = jSONObject.get("activityDetail");
        }
        if (obj instanceof JSONObject) {
            Object obj2 = ((JSONObject) obj).get("taskAndPublishInfoJSONObjectList");
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                if (jSONArray.size() > 0) {
                    Object obj3 = jSONArray.get(0);
                    if (obj3 instanceof JSONObject) {
                        jSONObject2 = (JSONObject) obj3;
                    }
                }
            }
        }
        jSONObject2.put((JSONObject) dov.KEY_ONIOLN_FITTING_ROOM_SCENE, "GG");
        Map<String, String> f = v3i.f(jpu.a("params", JSON.toJSONString(jSONObject2)));
        j5o.a aVar2 = new j5o.a("mtop.taobao.media.guang.publish.publishConfig");
        aVar2.i(0).g(true).b(f);
        aVar.e().a(aVar2.a(), new PublishExecutor$executor$1(this, jSONObject, id), new PublishExecutor$executor$2(this));
    }
}

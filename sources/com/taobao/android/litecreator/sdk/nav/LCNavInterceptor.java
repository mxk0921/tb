package com.taobao.android.litecreator.sdk.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.ckf;
import tb.dov;
import tb.e9g;
import tb.ebg;
import tb.kdp;
import tb.l4n;
import tb.lvc;
import tb.pid;
import tb.t2o;
import tb.vic;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class LCNavInterceptor implements vic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8318a = new ArrayList();
    public final lvc b = (lvc) kdp.a(lvc.class, new Object[0]);
    public String c;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/taobao/android/litecreator/sdk/nav/LCNavInterceptor$PublishConfigRequest;", "Lmtopsdk/mtop/domain/IMTOPDataObject;", "params", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", "API_NAME", "", "getAPI_NAME", "()Ljava/lang/String;", "NEED_ECODE", "", "getNEED_ECODE", "()Z", "setNEED_ECODE", "(Z)V", "NEED_SESSION", "getNEED_SESSION", "setNEED_SESSION", "VERSION", "getVERSION", "setVERSION", "(Ljava/lang/String;)V", "getParams", "()Lcom/alibaba/fastjson/JSONObject;", "setParams", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class PublishConfigRequest implements IMTOPDataObject {
        private JSONObject params;
        private final String API_NAME = "mtop.taobao.media.guang.publish.publishConfig";
        private String VERSION = "1.0";
        private boolean NEED_ECODE = true;
        private boolean NEED_SESSION = true;

        static {
            t2o.a(511705547);
            t2o.a(589299906);
        }

        public PublishConfigRequest(JSONObject jSONObject) {
            ckf.g(jSONObject, "params");
            this.params = jSONObject;
        }

        public final String getAPI_NAME() {
            return this.API_NAME;
        }

        public final boolean getNEED_ECODE() {
            return this.NEED_ECODE;
        }

        public final boolean getNEED_SESSION() {
            return this.NEED_SESSION;
        }

        public final JSONObject getParams() {
            return this.params;
        }

        public final String getVERSION() {
            return this.VERSION;
        }

        public final void setNEED_ECODE(boolean z) {
            this.NEED_ECODE = z;
        }

        public final void setNEED_SESSION(boolean z) {
            this.NEED_SESSION = z;
        }

        public final void setParams(JSONObject jSONObject) {
            ckf.g(jSONObject, "<set-?>");
            this.params = jSONObject;
        }

        public final void setVERSION(String str) {
            ckf.g(str, "<set-?>");
            this.VERSION = str;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lvc e = LCNavInterceptor.this.e();
            if (e != null) {
                lvc.a.b(e, "short_chain_failed", "remote_module_error", LCNavInterceptor.this.f(), null, LCNavInterceptor.this.f(), null, 40, null);
            }
        }
    }

    static {
        t2o.a(511705546);
        t2o.a(511705545);
    }

    public static final /* synthetic */ String a(LCNavInterceptor lCNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a71587cb", new Object[]{lCNavInterceptor});
        }
        lCNavInterceptor.getClass();
        return "_rqd";
    }

    public static final /* synthetic */ List b(LCNavInterceptor lCNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("82f6d17d", new Object[]{lCNavInterceptor});
        }
        return lCNavInterceptor.f8318a;
    }

    public final String c(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba86ff3c", new Object[]{this, jSONObject});
        }
        ckf.g(jSONObject, "urlParamsJSON");
        String uuid = UUID.randomUUID().toString();
        ckf.f(uuid, "UUID.randomUUID().toString()");
        dov.a aVar = new dov.a();
        aVar.t(jSONObject);
        Map<String, String> o = aVar.o();
        ckf.f(o, "urlParams.urlParams");
        o.put(l4n.f23108a, uuid);
        dov.d(uuid, aVar);
        return uuid;
    }

    public abstract void d(org.json.JSONObject jSONObject, Context context);

    public final lvc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lvc) ipChange.ipc$dispatch("ea00208d", new Object[]{this});
        }
        return this.b;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81132dc7", new Object[]{this, context});
            return;
        }
        ckf.g(context, "navContext");
        if (context instanceof FragmentActivity) {
            e9g.c((FragmentActivity) context);
        }
    }

    public abstract String h();

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b52a02", new Object[]{this, context});
            return;
        }
        ckf.g(context, "navContext");
        if (context instanceof FragmentActivity) {
            e9g.h((FragmentActivity) context);
        }
    }

    @Override // tb.vic
    public boolean intercept(Intent intent, Context context) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("debaad86", new Object[]{this, intent, context})).booleanValue();
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(context, "context");
        String h = h();
        if (TextUtils.isEmpty(h) || (data = intent.getData()) == null || (path = data.getPath()) == null) {
            return false;
        }
        return wsq.O(path, h, false, 2, null);
    }

    public final void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{this, context, str});
            return;
        }
        ckf.g(context, "navContext");
        ckf.g(str, "msg");
        ebg.l(context.getApplicationContext(), str);
    }

    @Override // tb.vic
    public void nav(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7d1fc1", new Object[]{this, intent, context});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(context, "context");
        Uri data = intent.getData();
        String uri = data != null ? data.toString() : null;
        this.c = uri;
        lvc lvcVar = this.b;
        if (lvcVar != null) {
            lvc.a.a(lvcVar, "short_chain_start", uri, null, 4, null);
        }
        ((pid) kdp.a(pid.class, new Object[0])).initRemoteModules(new LCNavInterceptor$nav$1(this, intent, context), new a());
    }
}

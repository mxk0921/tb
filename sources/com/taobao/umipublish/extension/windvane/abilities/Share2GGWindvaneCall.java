package com.taobao.umipublish.extension.windvane.abilities;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.a;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import com.taobao.umipublish.extension.windvane.abilities.AbilityChain;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.dov;
import tb.e9g;
import tb.ebg;
import tb.nei;
import tb.nsw;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.xhv;
import tb.yg;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \b2\u00020\u0001:\u0006\t\b\n\u000b\f\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall;", "", "Landroidx/fragment/app/FragmentActivity;", "context", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "callback", "<init>", "(Landroid/support/v4/app/FragmentActivity;Landroid/taobao/windvane/jsbridge/WVCallBackContext;)V", "Companion", "BaseHandler", "Data", "DownloadFileHandler", "DownloadMaterialHandler", "TemplateExportHandler", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Share2GGWindvaneCall {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    public final Data f14068a = new Data();
    public final Share2GGWindvaneCall$processListener$1 b = new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall$processListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            odg.c("Share2GGWindvaneCall", "onFailed " + str + ' ' + str2);
            String jSONString = Share2GGWindvaneCall.a(Share2GGWindvaneCall.this).b().toJSONString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("shareModel", (Object) jSONString);
            jSONObject.put("errCode", (Object) str);
            jSONObject.put("errMsg", (Object) str2);
            UmiPublishMonitor.w().c("Share2GGWindvaneCall", str, "share_content_to_gg_error", jSONObject.toJSONString());
            e9g.c(Share2GGWindvaneCall.this.e());
            ebg.l(Share2GGWindvaneCall.this.e().getApplicationContext(), Localization.q(R.string.gg_pub_composition_failed_retry));
            WVCallBackContext d = Share2GGWindvaneCall.this.d();
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.b("errorCode", str);
            nswVar.b("errorMsg", str2);
            xhv xhvVar = xhv.INSTANCE;
            d.error(nswVar);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            odg.d("Share2GGWindvaneCall", "onSuccess " + jSONObject);
            e9g.c(Share2GGWindvaneCall.this.e());
            Share2GGWindvaneCall share2GGWindvaneCall = Share2GGWindvaneCall.this;
            String m = qrf.m(jSONObject, "path", "");
            ckf.f(m, "JSONUtil.getString(result, \"path\", \"\")");
            Share2GGWindvaneCall.b(share2GGWindvaneCall, m);
            Share2GGWindvaneCall.this.d().success(nsw.RET_SUCCESS);
        }
    };
    public final FragmentActivity c;
    public final WVCallBackContext d;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/AbilityChain$InputAndOutputHandler;", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BaseHandler extends AbilityChain.InputAndOutputHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Data f14069a;

        static {
            t2o.a(944767188);
        }

        public BaseHandler(Data data) {
            ckf.g(data, "data");
            this.f14069a = data;
        }

        public static /* synthetic */ Object ipc$super(BaseHandler baseHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler");
        }

        public final Data d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Data) ipChange.ipc$dispatch("783171a9", new Object[]{this});
            }
            return this.f14069a;
        }
    }

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        static {
            t2o.a(944767189);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$Data;", "", "<init>", "()V", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Data {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f14070a = new JSONObject();
        public final JSONArray b = new JSONArray();
        public JSONObject c = new JSONObject();

        static {
            t2o.a(944767190);
        }

        public final JSONArray a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("80fc16b2", new Object[]{this});
            }
            return this.b;
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("65c92963", new Object[]{this});
            }
            return this.f14070a;
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("ac6bb765", new Object[]{this});
            }
            return this.c;
        }

        public final void d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("342d5019", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "<set-?>");
            this.f14070a = jSONObject;
        }

        public final void e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6649f3bf", new Object[]{this, jSONObject});
            } else {
                this.c = jSONObject;
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadFileHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class DownloadFileHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(944767191);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadFileHandler(Data data) {
            super(data);
            ckf.g(data, "data");
        }

        public static /* synthetic */ Object ipc$super(DownloadFileHandler downloadFileHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadFileHandler");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public void c(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            } else if (jSONObject != null && (jSONArray = jSONObject.getJSONArray("fileList")) != null) {
                d().a().addAll(jSONArray);
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
            }
            JSONArray a2 = qrf.a(d().b(), nei.MEDIA_INFO_MEDIA_DATA);
            JSONObject jSONObject2 = a2 != null ? a2.getJSONObject(0) : null;
            JSONArray<Object> a3 = qrf.a(jSONObject2, "templateFillData", "materialList");
            JSONObject l = qrf.l(jSONObject2, "templateFillData", "imageMappings");
            ckf.f(l, "JSONUtil.getObject(media…llData\", \"imageMappings\")");
            ArrayList<Object> arrayList = new ArrayList(l.size());
            for (Map.Entry<String, Object> entry : l.entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("tag", (Object) entry.getKey());
                jSONObject3.put("url", entry.getValue());
                jSONObject3.put("type", (Object) "pic");
                arrayList.add(jSONObject3);
            }
            JSONArray jSONArray = new JSONArray();
            Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1 = new Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1(jSONArray);
            ckf.f(a3, "materialList");
            for (Object obj : a3) {
                share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1.invoke((Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1) obj);
            }
            for (Object obj2 : arrayList) {
                share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1.invoke((Share2GGWindvaneCall$DownloadFileHandler$in$forEachAction$1) obj2);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("downloadList", (Object) jSONArray);
            return jSONObject4;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadMaterialHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class DownloadMaterialHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(944767193);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadMaterialHandler(Data data) {
            super(data);
            ckf.g(data, "data");
        }

        public static /* synthetic */ Object ipc$super(DownloadMaterialHandler downloadMaterialHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$DownloadMaterialHandler");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
            }
            try {
                JSONArray a2 = qrf.a(d().b(), nei.MEDIA_INFO_MEDIA_DATA);
                String n = qrf.n("0", a2 != null ? a2.getJSONObject(0) : null, "templateId");
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(n);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("materialIds", (Object) jSONArray);
                return jSONObject2;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public void c(JSONObject jSONObject) {
            JSONArray jSONArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def50cbb", new Object[]{this, jSONObject});
            } else {
                d().e((jSONObject == null || (jSONArray = jSONObject.getJSONArray("materialList")) == null) ? null : jSONArray.getJSONObject(0));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$TemplateExportHandler;", "Lcom/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$BaseHandler;", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class TemplateExportHandler extends BaseHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(944767194);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TemplateExportHandler(Data data) {
            super(data);
            ckf.g(data, "data");
        }

        public static /* synthetic */ Object ipc$super(TemplateExportHandler templateExportHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/Share2GGWindvaneCall$TemplateExportHandler");
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("52e6f464", new Object[]{this, jSONObject});
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.add("image");
                JSONArray a2 = qrf.a(d().b(), nei.MEDIA_INFO_MEDIA_DATA);
                JSONObject l = qrf.l(a2 != null ? a2.getJSONObject(0) : null, "templateFillData", "textMappings");
                JSONObject jSONObject3 = new JSONObject();
                for (Object obj : d().a()) {
                    if (obj != null) {
                        JSONObject jSONObject4 = (JSONObject) obj;
                        String m = qrf.m((JSONObject) obj, "tag", "");
                        String m2 = qrf.m((JSONObject) obj, "path", "");
                        if (!TextUtils.isEmpty(m) && !TextUtils.isEmpty(m2)) {
                            jSONObject3.put(m, (Object) m2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                }
                JSONObject c = d().c();
                if (c != null) {
                    c.put(AbilityConst.Server.e, (Object) l);
                }
                JSONObject c2 = d().c();
                if (c2 != null) {
                    c2.put(AbilityConst.Server.f, (Object) jSONObject3);
                }
                jSONObject2.put("templateType", (Object) "image");
                jSONObject2.put("outputType", (Object) jSONArray);
                jSONObject2.put("materialList", (Object) d().a());
                jSONObject2.put(yg.CACHE_KEY_TEMPLATE_INFO, (Object) d().c());
                return jSONObject2;
            } catch (Throwable unused) {
                return new JSONObject();
            }
        }
    }

    static {
        t2o.a(944767187);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.taobao.umipublish.extension.windvane.abilities.Share2GGWindvaneCall$processListener$1] */
    public Share2GGWindvaneCall(FragmentActivity fragmentActivity, WVCallBackContext wVCallBackContext) {
        ckf.g(fragmentActivity, "context");
        ckf.g(wVCallBackContext, "callback");
        this.c = fragmentActivity;
        this.d = wVCallBackContext;
    }

    public static final /* synthetic */ Data a(Share2GGWindvaneCall share2GGWindvaneCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("cbbef99b", new Object[]{share2GGWindvaneCall});
        }
        return share2GGWindvaneCall.f14068a;
    }

    public static final /* synthetic */ void b(Share2GGWindvaneCall share2GGWindvaneCall, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83cb8bf", new Object[]{share2GGWindvaneCall, str});
        } else {
            share2GGWindvaneCall.f(str);
        }
    }

    public final WVCallBackContext d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("d7f8ea11", new Object[]{this});
        }
        return this.d;
    }

    public final FragmentActivity e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("28f6ec3f", new Object[]{this});
        }
        return this.c;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bccffbd", new Object[]{this, str});
            return;
        }
        String m = qrf.m(this.f14068a.b(), "ugcScene", null);
        JSONObject l = qrf.l(this.f14068a.b(), "formData", "topic");
        JSONArray a2 = qrf.a(this.f14068a.b(), "formData", "items");
        String n = qrf.n(null, this.f14068a.b(), "formData", "titleHint");
        JSONObject l2 = qrf.l(this.f14068a.b(), "formData", "contentText");
        String n2 = qrf.n(null, this.f14068a.b(), "formData", "defaultText");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        JSONObject l3 = qrf.l(this.f14068a.b(), "publishParams");
        String n3 = qrf.n(null, this.f14068a.b(), "bizData", "rateData", "rateId");
        Uri.Builder appendQueryParameter = Uri.parse("https://web.m.taobao.com/app/mtb-guang/production/litecreator/publish").buildUpon().appendQueryParameter(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, m).appendQueryParameter(UmiWvPlugin.KEY_IMPORT_PICS, jSONArray.toJSONString());
        if (l != null) {
            for (Map.Entry<String, Object> entry : l.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    appendQueryParameter.appendQueryParameter(key, (String) value);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
        }
        if (l2 != null) {
            appendQueryParameter.appendQueryParameter("dft_rich_text", l2.toJSONString());
        }
        if (n != null) {
            appendQueryParameter.appendQueryParameter("title_tips", n);
        }
        if (a2 != null) {
            appendQueryParameter.appendQueryParameter("taopai_select_goods", a2.toJSONString());
        }
        if (n2 != null) {
            appendQueryParameter.appendQueryParameter("default_text", n2);
        }
        if (n3 != null) {
            appendQueryParameter.appendQueryParameter("gg_rate_id", n3);
        }
        if (l3 != null) {
            for (Map.Entry<String, Object> entry2 : l3.entrySet()) {
                if (!TextUtils.isEmpty(entry2.getKey()) && entry2.getValue() != null) {
                    appendQueryParameter.appendQueryParameter(entry2.getKey(), entry2.getValue().toString());
                }
            }
        }
        Nav.from(this.c).toUri(appendQueryParameter.build());
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a4ebab", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        e9g.i(this.c, new a.b().l(Localization.q(R.string.gg_pub_loading_1)).k(0.5f).i(false).j(false).h());
        this.f14068a.d(jSONObject);
        try {
            BaseAbility a2 = AbilityUtils.a(ITemplateExportAbility.class);
            if (a2 == null) {
                e9g.c(this.c);
                odg.c("Share2GGWindvaneCall", "createAbility error.");
                UmiPublishMonitor.w().o("Share2GGWindvaneCall", "-1", "createAbility call error", null);
                return;
            }
            AbilityChain weight = new AbilityChain(new DownloadFilesAbility(), this.c).weight(0.4f);
            int i = R.string.gg_pub_resource_download;
            AbilityChain name = weight.name(Localization.q(i));
            int i2 = R.string.gg_pub_resource_downloading;
            AbilityChain inputAndOutputHandler = name.loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadFileHandler(this.f14068a));
            AbilityChain inputAndOutputHandler2 = new AbilityChain(new DownloadMaterialAbility(), this.c).weight(0.4f).name(Localization.q(i)).loadingText(Localization.q(i2)).inputAndOutputHandler(new DownloadMaterialHandler(this.f14068a));
            AbilityChain weight2 = new AbilityChain(a2, this.c).weight(0.2f);
            int i3 = R.string.gg_pub_video_preparation;
            AbilityChain inputAndOutputHandler3 = weight2.name(Localization.q(i3)).loadingText(Localization.q(i3)).inputAndOutputHandler(new TemplateExportHandler(this.f14068a));
            inputAndOutputHandler.setListener(this.b);
            inputAndOutputHandler.next(inputAndOutputHandler2).next(inputAndOutputHandler3);
            inputAndOutputHandler.execute(jSONObject);
        } catch (Throwable th) {
            e9g.c(this.c);
            odg.c("Share2GGWindvaneCall", Log.getStackTraceString(th));
        }
    }
}

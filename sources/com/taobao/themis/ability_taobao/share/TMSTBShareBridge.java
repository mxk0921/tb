package com.taobao.themis.ability_taobao.share;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.j8s;
import tb.p8s;
import tb.q9s;
import tb.t2o;
import tb.t8s;
import tb.xhv;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003JÙ\u0001\u0010\u001d\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/taobao/themis/ability_taobao/share/TMSTBShareBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "", "title", "desc", "imageUrl", "path", "content", "bgImgUrl", "url", "Lcom/alibaba/fastjson/JSONArray;", "targets", "Lcom/alibaba/fastjson/JSONObject;", "extraParams", "type", "from", "pageParam", UploadConstants.BIZ_CODE, "shareMode", DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, "shareTinyAppMsg", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONArray;Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "Companion", "a", "themis_ability_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBShareBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(832569382);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements IShareAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }
    }

    static {
        t2o.a(832569381);
        t2o.a(839909427);
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IDLE)
    @APIMethod
    public final void shareTinyAppMsg(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"title"}) String str, @BindingParam({"desc"}) String str2, @BindingParam({"imageUrl"}) String str3, @BindingParam({"path"}) String str4, @BindingParam({"content"}) String str5, @BindingParam({"bgImgUrl"}) String str6, @BindingParam({"url"}) String str7, @BindingParam({"targets"}) JSONArray jSONArray, @BindingParam({"extraParams"}) JSONObject jSONObject, @BindingParam({"type"}) String str8, @BindingParam({"from"}) String str9, @BindingParam({"page"}) String str10, @BindingParam({"bizcode"}) String str11, @BindingParam({"shareMode"}) String str12, @BindingParam({"urlParams"}) JSONObject jSONObject2) {
        String str13;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f35f115", new Object[]{this, apiContext, bridgeCallback, str, str2, str3, str4, str5, str6, str7, jSONArray, jSONObject, str8, str9, str10, str11, str12, jSONObject2});
            return;
        }
        ckf.g(bridgeCallback, "bridgeCallback");
        if (apiContext == null || apiContext.a() == null || apiContext.c() == null || apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        ITMSPage c = apiContext.c();
        bbs b2 = apiContext.b();
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String str14 = (str11 == null || str11.length() == 0) ? "1115_snipcode" : str11;
        if (!q9s.k()) {
            str13 = t8s.c(c, b2, str4, jSONObject).toString();
            ckf.f(str13, "{\n                TMSApp….toString()\n            }");
        } else if (!TextUtils.isEmpty(str7)) {
            ckf.d(str7);
            str13 = str7;
        } else {
            str13 = t8s.c(c, b2, str4, jSONObject).toString();
            ckf.f(str13, "getSharedUrl(\n          …             ).toString()");
        }
        String str15 = (str2 == null || str2.length() == 0) ? "我分享给你了一个淘宝页面，快来看看吧" : str2;
        HashMap hashMap = new HashMap();
        hashMap.put("path", str4);
        xhv xhvVar = xhv.INSTANCE;
        if (jSONArray != null) {
            ArrayList arrayList2 = new ArrayList(zz3.q(jSONArray, 10));
            for (Object obj : jSONArray) {
                arrayList2.add(obj.toString());
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        IShareAdapter.b bVar = new IShareAdapter.b(str14, str13, str, str15, str3, hashMap, null, arrayList, 64, null);
        Activity a2 = apiContext.a();
        ckf.f(a2, "apiContext.activity");
        ((IShareAdapter) p8s.g(IShareAdapter.class)).share(a2, c, bVar, new b());
    }
}

package com.taobao.themis.ability_taobao;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.bac;
import tb.ckf;
import tb.j8s;
import tb.qec;
import tb.t2o;
import tb.tll;
import tb.w2n;
import tb.xcs;
import tb.xhb;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ=\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJm\u0010#\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010\u0003¨\u0006*"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSTitleBarBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "", "animationType", "animation", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "hideNavigatorBar", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "showNavigatorBar", "showBackButton", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "hideBackButton", "scaleIndexBadge", "resetIndexBadge", "icon", "event", "", "hidden", "setRightItem", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "Lcom/alibaba/fastjson/JSONObject;", "itemConfig", "showGlobalMenu", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/fastjson/JSONObject;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "backgroundColor", "backgroundBg", "barTextStyle", "title", "image", "borderBottomColor", DMComponent.RESET, "setNavigationBarStyle", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "Ltb/xhv;", "onInitialized", "onFinalized", "Companion", "a", "themis_ability_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTitleBarBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(832569373);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13463a;
        public final /* synthetic */ ITMSPage b;

        public b(String str, ITMSPage iTMSPage) {
            this.f13463a = str;
            this.b = iTMSPage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str = this.f13463a;
            if (str != null) {
                this.b.y(str, new JSONObject());
            }
        }
    }

    static {
        t2o.a(832569372);
        t2o.a(839909427);
    }

    public static final /* synthetic */ JSONObject access$getActionLocationAndSize(TMSTitleBarBridge tMSTitleBarBridge, y0e y0eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e0a719f", new Object[]{tMSTitleBarBridge, y0eVar, view});
        }
        return tMSTitleBarBridge.a(y0eVar, view);
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideNavigatorBar(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"animationType"}) String str, @BindingParam(name = {"animation"}) String str2) {
        NavigatorBarAnimType navigatorBarAnimType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("94072526", new Object[]{this, apiContext, str, str2});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        if (!ckf.b("true", str2)) {
            navigatorBarAnimType = NavigatorBarAnimType.NULL;
        } else if (ckf.b(str, "alpha")) {
            navigatorBarAnimType = NavigatorBarAnimType.ALPHA;
        } else if (ckf.b(str, "translate")) {
            navigatorBarAnimType = NavigatorBarAnimType.TRANS;
        } else {
            navigatorBarAnimType = NavigatorBarAnimType.OTHER;
        }
        if (titleBar.hideTitleBar(navigatorBarAnimType)) {
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "{\n            BridgeResponse.SUCCESS\n        }");
            return bridgeResponse3;
        }
        BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
        ckf.f(bridgeResponse4, "{\n            BridgeResp…FORBIDDEN_ERROR\n        }");
        return bridgeResponse4;
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

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse resetIndexBadge(@BindingApiContext ApiContext apiContext) {
        y0e y0eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("4a4d8b14", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        if (pageContext == null) {
            y0eVar = null;
        } else {
            y0eVar = pageContext.getTitleBar();
        }
        if (y0eVar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qec qecVar = (qec) y0eVar.getAction(qec.class);
        if (qecVar == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse3, "FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        qecVar.a();
        BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse4, "SUCCESS");
        return bridgeResponse4;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse scaleIndexBadge(@BindingApiContext ApiContext apiContext) {
        y0e y0eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("d6a489cf", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        if (pageContext == null) {
            y0eVar = null;
        } else {
            y0eVar = pageContext.getTitleBar();
        }
        if (y0eVar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qec qecVar = (qec) y0eVar.getAction(qec.class);
        if (qecVar == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse3, "FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        qecVar.d();
        BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse4, "SUCCESS");
        return bridgeResponse4;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showGlobalMenu(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"itemConfig"}) JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("d5a1fa3d", new Object[]{this, apiContext, jSONObject});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        bac bacVar = (bac) c.getExtension(bac.class);
        if (bacVar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        bacVar.show();
        BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse3, "SUCCESS");
        return bridgeResponse3;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showNavigatorBar(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"animationType"}) String str, @BindingParam(name = {"animation"}) String str2) {
        NavigatorBarAnimType navigatorBarAnimType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("7aea7161", new Object[]{this, apiContext, str, str2});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        if (!ckf.b("true", str2)) {
            navigatorBarAnimType = NavigatorBarAnimType.NULL;
        } else if (ckf.b(str, "alpha")) {
            navigatorBarAnimType = NavigatorBarAnimType.ALPHA;
        } else if (ckf.b(str, "translate")) {
            navigatorBarAnimType = NavigatorBarAnimType.TRANS;
        } else {
            navigatorBarAnimType = NavigatorBarAnimType.OTHER;
        }
        if (titleBar.showTitleBar(navigatorBarAnimType)) {
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "{\n            BridgeResponse.SUCCESS\n        }");
            return bridgeResponse3;
        }
        BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
        ckf.f(bridgeResponse4, "{\n            BridgeResp…FORBIDDEN_ERROR\n        }");
        return bridgeResponse4;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideBackButton(@BindingApiContext ApiContext apiContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fa8a0cf", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        xhb xhbVar = (xhb) titleBar.getAction(xhb.class);
        if (xhbVar != null) {
            z = xhbVar.hideBackButton();
        }
        if (z) {
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "{\n            BridgeResponse.SUCCESS\n        }");
            return bridgeResponse3;
        }
        BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
        ckf.f(bridgeResponse4, "{\n            BridgeResp…FORBIDDEN_ERROR\n        }");
        return bridgeResponse4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
        if (r8.equals(tb.pg1.ATOM_EXT_white) == false) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
        if (r8.equals("light") == false) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
        r2 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
        if (r8.equals(tb.pg1.ATOM_EXT_black) == false) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
        if (r8.equals(com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils.COLOR_SCHEME_DARK) == false) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
        r2 = com.taobao.themis.kernel.container.Window.Theme.DARK;
     */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.UI)
    @com.taobao.themis.kernel.ability.base.annotation.AutoCallback
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse setNavigationBarStyle(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r5, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"backgroundColor"}) java.lang.String r6, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"backgroundBg"}) java.lang.String r7, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"barTextStyle"}) java.lang.String r8, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"title"}, stringDefault = "notSetTitle") java.lang.String r9, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"image"}) java.lang.String r10, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"borderBottomColor"}) java.lang.String r11, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"reset"}) java.lang.Boolean r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSTitleBarBridge.setNavigationBarStyle(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse");
    }

    @ThreadType(ExecutorType.IO)
    @AutoCallback
    @APIMethod
    public final BridgeResponse setRightItem(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"icon"}) String str, @BindingParam(name = {"event"}) String str2, @BindingParam(name = {"hidden"}) Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("15beac38", new Object[]{this, apiContext, str, str2, bool});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        w2n w2nVar = (w2n) titleBar.getAction(w2n.class);
        if (ckf.b(bool, Boolean.TRUE)) {
            if (w2nVar == null) {
                BridgeResponse bridgeResponse3 = BridgeResponse.INVALID_PARAM;
                ckf.f(bridgeResponse3, "INVALID_PARAM");
                return bridgeResponse3;
            }
            CommonExtKt.o(new TMSTitleBarBridge$setRightItem$1(w2nVar));
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse4, "SUCCESS");
            return bridgeResponse4;
        } else if (w2nVar != null || !TextUtils.isEmpty(str)) {
            CommonExtKt.o(new TMSTitleBarBridge$setRightItem$2(w2nVar));
            b bVar = new b(str2, c);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            try {
                CommonExtKt.o(new TMSTitleBarBridge$setRightItem$3(titleBar, str, bVar, c, countDownLatch, ref$ObjectRef, this));
            } catch (Throwable th) {
                TMSLogger.c("TMSTitleBarBridge", th.getMessage(), th);
                countDownLatch.countDown();
            }
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                TMSLogger.c("TMSTitleBarBridge", th2.getMessage(), th2);
            }
            T t = ref$ObjectRef.element;
            if (t == 0) {
                BridgeResponse bridgeResponse5 = BridgeResponse.SUCCESS;
                ckf.f(bridgeResponse5, "{\n            BridgeResponse.SUCCESS\n        }");
                return bridgeResponse5;
            }
            BridgeResponse.NamedValue newValue = BridgeResponse.newValue("frame", t);
            ckf.f(newValue, "{\n            BridgeResp…\"frame\", frame)\n        }");
            return newValue;
        } else {
            BridgeResponse bridgeResponse6 = BridgeResponse.INVALID_PARAM;
            ckf.f(bridgeResponse6, "INVALID_PARAM");
            return bridgeResponse6;
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showBackButton(@BindingApiContext ApiContext apiContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("e075214a", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        xhb xhbVar = (xhb) titleBar.getAction(xhb.class);
        if (xhbVar != null) {
            z = xhbVar.showBackButton();
        }
        if (z) {
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "{\n            BridgeResponse.SUCCESS\n        }");
            return bridgeResponse3;
        }
        BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
        ckf.f(bridgeResponse4, "{\n            BridgeResp…FORBIDDEN_ERROR\n        }");
        return bridgeResponse4;
    }

    public final JSONObject a(y0e y0eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5dd23f26", new Object[]{this, y0eVar, view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (!y0eVar.mo332isTranslucent()) {
            int i = iArr[1];
            View contentView = y0eVar.getContentView();
            iArr[1] = i - (contentView == null ? 0 : contentView.getHeight());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "x", (String) Integer.valueOf(xcs.f(view.getContext(), iArr[0])));
        jSONObject.put((JSONObject) "y", (String) Integer.valueOf(xcs.f(view.getContext(), iArr[1])));
        jSONObject.put((JSONObject) "width", (String) Integer.valueOf(xcs.f(view.getContext(), view.getWidth())));
        jSONObject.put((JSONObject) "height", (String) Integer.valueOf(xcs.f(view.getContext(), view.getHeight())));
        return jSONObject;
    }
}

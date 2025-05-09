package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub.titlebar.action.PubAddIconAction;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.fbs;
import tb.i3n;
import tb.j8s;
import tb.p8s;
import tb.qml;
import tb.t2o;
import tb.t3n;
import tb.tll;
import tb.wds;
import tb.xhv;
import tb.y0e;
import tb.y2n;
import tb.z54;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\u0011J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0003¨\u0006#"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSPubBridge;", "Ltb/j8s;", "<init>", "()V", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "callback", "", "guideType", "", "strongGuidePopTitle", "strongGuidePopDesc", "Ltb/xhv;", "showICONChangeGuide", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "followMiniProgram", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "unFollowMiniProgram", "checkMiniProgramFollowStatus", "apiName", "checkTinyAppPermission", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "title", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "showAddIconGuideTips", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "hideAddIconButton", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "checkAddIconButton", "bridgeCallback", "showActiveReplacePopup", "onInitialized", "onFinalized", "themis_ability_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPubBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements z54<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13458a;
        public final /* synthetic */ BridgeCallback b;

        public a(bbs bbsVar, BridgeCallback bridgeCallback) {
            this.f13458a = bbsVar;
            this.b = bridgeCallback;
        }

        /* renamed from: a */
        public void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30ae4fc7", new Object[]{this, str, str2, bool});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            try {
                this.b.sendBridgeResponse(BridgeResponse.newError(Integer.parseInt(str), str2));
            } catch (NumberFormatException unused) {
                this.b.sendBridgeResponse(BridgeResponse.newError(5, str2));
            }
        }

        /* renamed from: b */
        public void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc8f8dc2", new Object[]{this, bool});
                return;
            }
            com.taobao.themis.pub_kit.favor.a.g(this.f13458a.L(), Boolean.TRUE, this.f13458a.I());
            this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13459a;
        public final /* synthetic */ BridgeCallback b;

        public b(ITMSPage iTMSPage, BridgeCallback bridgeCallback) {
            this.f13459a = iTMSPage;
            this.b = bridgeCallback;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            xhv xhvVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                return;
            }
            if (pubUserGuideModule == null) {
                xhvVar = null;
            } else {
                ITMSPage iTMSPage = this.f13459a;
                BridgeCallback bridgeCallback = this.b;
                Activity I = iTMSPage.getInstance().I();
                ckf.f(I, "page.getInstance().activity");
                new t3n(I, pubUserGuideModule, null, 4, null).a();
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                this.b.sendBridgeResponse(BridgeResponse.newError(100, "不支持添加到首页"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements z54<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bbs f13460a;
        public final /* synthetic */ BridgeCallback b;

        public c(bbs bbsVar, BridgeCallback bridgeCallback) {
            this.f13460a = bbsVar;
            this.b = bridgeCallback;
        }

        /* renamed from: a */
        public void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30ae4fc7", new Object[]{this, str, str2, bool});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            try {
                this.b.sendBridgeResponse(BridgeResponse.newError(Integer.parseInt(str), str2));
            } catch (NumberFormatException unused) {
                this.b.sendBridgeResponse(BridgeResponse.newError(5, str2));
            }
        }

        /* renamed from: b */
        public void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc8f8dc2", new Object[]{this, bool});
                return;
            }
            com.taobao.themis.pub_kit.favor.a.g(this.f13460a.L(), Boolean.FALSE, this.f13460a.I());
            this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    static {
        t2o.a(832569364);
        t2o.a(839909427);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse checkAddIconButton(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3f4680d8", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c2.getPageContext();
        BridgeResponse.NamedValue namedValue = null;
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        } else if (((IAccountAdapter) p8s.g(IAccountAdapter.class)).getUserId(c2.getInstance()) == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(101, "用户未登录");
            ckf.f(newError, "newError(101, \"用户未登录\")");
            return newError;
        } else {
            if (((PubAddIconAction) titleBar.getAction(PubAddIconAction.class)) != null) {
                namedValue = BridgeResponse.newValue("isShowing", Boolean.TRUE);
            }
            if (namedValue != null) {
                return namedValue;
            }
            BridgeResponse.NamedValue newValue = BridgeResponse.newValue("isShowing", Boolean.FALSE);
            ckf.f(newValue, "newValue(\"isShowing\", false)");
            return newValue;
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void checkMiniProgramFollowStatus(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00cfd0", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (com.taobao.themis.pub_kit.favor.a.d(b2.L())) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("isFollowed", Boolean.TRUE));
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newValue("isFollowed", Boolean.FALSE));
        }
    }

    @ThreadType(ExecutorType.IDLE)
    @APIMethod
    public final void checkTinyAppPermission(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apiName"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6cfe6", new Object[]{this, apiContext, str, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (str == null || str.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            i3n.c(b2, bridgeCallback, str);
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void followMiniProgram(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1506a23c", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            com.taobao.themis.pub_kit.favor.a.a(b2.L(), wds.a(b2.I(), b2.e0()), false, new a(b2, bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideAddIconButton(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fce22fde", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        } else if (qml.z(c2)) {
            BridgeResponse.Error newError = BridgeResponse.newError(103, "首页不支持隐藏添加上Icon按钮");
            ckf.f(newError, "newError(103, \"首页不支持隐藏添加上Icon按钮\")");
            return newError;
        } else {
            tll pageContext = c2.getPageContext();
            y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
            if (titleBar == null) {
                BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
                ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
                return bridgeResponse2;
            }
            PubAddIconAction pubAddIconAction = (PubAddIconAction) titleBar.getAction(PubAddIconAction.class);
            if (pubAddIconAction == null) {
                BridgeResponse.Error newError2 = BridgeResponse.newError(100, "无添加上Icon按钮");
                ckf.f(newError2, "newError(100, \"无添加上Icon按钮\")");
                return newError2;
            }
            titleBar.removeAction(pubAddIconAction);
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "SUCCESS");
            return bridgeResponse3;
        }
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        } else {
            i3n.d();
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        } else {
            i3n.d();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showActiveReplacePopup(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f100eafd", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        tll pageContext = c2.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (((PubAddIconAction) titleBar.getAction(PubAddIconAction.class)) == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(100, "不支持添加到首页"));
        } else {
            fbs.c(c2.getInstance(), new b(c2, bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showICONChangeGuide(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"guideType"}) Integer num, @BindingParam(name = {"strongGuidePopTitle"}) String str, @BindingParam(name = {"strongGuidePopDesc"}) String str2) {
        tll pageContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e423e9", new Object[]{this, apiContext, bridgeCallback, num, str, str2});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (num == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(2, "guideType null"));
        } else {
            ITMSPage topPage = b2.W().getTopPage();
            y0e y0eVar = null;
            if (!(topPage == null || (pageContext = topPage.getPageContext()) == null)) {
                y0eVar = pageContext.getTitleBar();
            }
            if (!(y0eVar instanceof PubTitleBar)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            }
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void unFollowMiniProgram(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c9f635", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "callback");
        bbs b2 = apiContext.b();
        if (b2 == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            com.taobao.themis.pub_kit.favor.a.e(b2.L(), wds.a(b2.I(), b2.e0()), false, new c(b2, bridgeCallback));
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showAddIconGuideTips(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"subTitle"}) String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("80453f5f", new Object[]{this, apiContext, str, str2});
        }
        ckf.g(apiContext, "apiContext");
        ITMSPage c2 = apiContext.c();
        if (c2 == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        tll pageContext = c2.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        PubAddIconAction pubAddIconAction = (PubAddIconAction) titleBar.getAction(PubAddIconAction.class);
        if (pubAddIconAction == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(100, "无添加上Icon按钮");
            ckf.f(newError, "newError(100, \"无添加上Icon按钮\")");
            return newError;
        }
        PubContainerContext pubContainerContext = (PubContainerContext) c2.getInstance().g(PubContainerContext.class);
        if (pubContainerContext == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.UNKNOWN_ERROR;
            ckf.f(bridgeResponse3, "UNKNOWN_ERROR");
            return bridgeResponse3;
        }
        PubAddIconGuide pubAddIconGuide = pubContainerContext.getPubAddIconGuide();
        if (pubAddIconGuide == null) {
            BridgeResponse.Error newError2 = BridgeResponse.newError(102, "无法展示添加上Icon引导");
            ckf.f(newError2, "newError(102, \"无法展示添加上Icon引导\")");
            return newError2;
        }
        String userId = ((IAccountAdapter) p8s.g(IAccountAdapter.class)).getUserId(c2.getInstance());
        if (userId == null) {
            BridgeResponse.Error newError3 = BridgeResponse.newError(101, "用户未登录");
            ckf.f(newError3, "newError(101, \"用户未登录\")");
            return newError3;
        }
        String L = c2.getInstance().L();
        ckf.f(L, "page.getInstance().appId");
        if (!pubAddIconGuide.f(L, userId)) {
            BridgeResponse.Error newError4 = BridgeResponse.newError(102, "无法展示添加上Icon引导");
            ckf.f(newError4, "newError(102, \"无法展示添加上Icon引导\")");
            return newError4;
        }
        Activity I = c2.getInstance().I();
        ckf.f(I, "page.getInstance().activity");
        View l = pubAddIconAction.l(I);
        PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType = PubAddIconGuide.PubAddIconGuideType.DETAIL_FAVOR_TIPS;
        String L2 = c2.getInstance().L();
        ckf.f(L2, "page.getInstance().appId");
        if (pubAddIconGuide.l(l, pubAddIconGuideType, L2, userId, str, str2)) {
            PubContainerContext pubContainerContext2 = (PubContainerContext) c2.getInstance().g(PubContainerContext.class);
            if (pubContainerContext2 != null) {
                pubContainerContext2.setAddIconGuideIsShowing(true);
            }
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse4, "{\n            page.getIn…esponse.SUCCESS\n        }");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.UNKNOWN_ERROR;
        ckf.f(bridgeResponse5, "{\n            BridgeResp…e.UNKNOWN_ERROR\n        }");
        return bridgeResponse5;
    }
}

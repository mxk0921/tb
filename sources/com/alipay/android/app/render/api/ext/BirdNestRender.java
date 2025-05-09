package com.alipay.android.app.render.api.ext;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.app.cctemplate.DynResResourceClient;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.cctemplate.transport.TemplateManager;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback3;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.render.birdnest.BirdNestBuilder;
import com.alipay.android.app.render.birdnest.RenderCallbackProxy;
import com.alipay.android.app.render.birdnest.service.BirdNestManager;
import com.alipay.android.app.render.birdnest.service.BirdNestService;
import com.alipay.android.app.render.birdnest.utils.Compatibility;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.LegacySupport;
import com.flybird.session.standalone.model.CreateEngineOptions;
import com.flybird.session.standalone.model.PrepareResult;
import com.flybird.session.standalone.model.PrerenderOptions;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.f7l;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BirdNestRender implements ICashierRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FBContext.JsExecOptions k = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0).setBlockTimeoutMs(60000);
    public static final FBContext.JsExecOptions l = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(1).setBlockTimeoutMs(60000);
    public TemplateService b;
    public TemplateKeyboardService c;
    public FBPluginFactory d;
    public ITplTransport e;
    public ITemplateClickCallback f;
    public ICashierProvider g;
    public ITplProvider h;
    public String j;

    /* renamed from: a  reason: collision with root package name */
    public final Map<View, FBContext> f3484a = new ConcurrentHashMap();
    public boolean i = false;

    public BirdNestRender() {
        LogUtils.record(2, "BirdNestRender::BirdNestRender", "this:" + this);
    }

    public static /* synthetic */ ITemplateClickCallback access$000(BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITemplateClickCallback) ipChange.ipc$dispatch("362f0dc3", new Object[]{birdNestRender});
        }
        return birdNestRender.f;
    }

    public static /* synthetic */ ITemplateClickCallback access$002(BirdNestRender birdNestRender, ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITemplateClickCallback) ipChange.ipc$dispatch("d343246c", new Object[]{birdNestRender, iTemplateClickCallback});
        }
        birdNestRender.f = iTemplateClickCallback;
        return iTemplateClickCallback;
    }

    public static /* synthetic */ String access$100(BirdNestRender birdNestRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0d23ab7", new Object[]{birdNestRender});
        }
        return birdNestRender.j;
    }

    public static PrerenderOptions getPrerenderOptions(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrerenderOptions) ipChange.ipc$dispatch("efa8f8ec", new Object[]{context});
        }
        return BirdNestService.getPrerenderOptions(context);
    }

    public final JSONObject b(String str, JSONObject jSONObject, Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("753b273a", new Object[]{this, str, jSONObject, template});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3 = new JSONObject(str);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        if (template != null) {
            try {
                String template2 = template.toString();
                if (!TextUtils.isEmpty(template2)) {
                    jSONObject.put("tplInfo", template2);
                }
            } catch (Throwable th2) {
                LogUtils.printExceptionStackTrace(th2);
            }
        }
        try {
            jSONObject2.put("rpcData", jSONObject3);
            jSONObject2.put("local", jSONObject);
        } catch (Throwable th3) {
            LogUtils.printExceptionStackTrace(th3);
        }
        return jSONObject2;
    }

    public final boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf4c59d9", new Object[]{this, context, str})).booleanValue();
        }
        com.alibaba.fastjson.JSONObject drmValueFromKey = DrmUtil.getDrmValueFromKey(context, "asyncLayoutTpl", null);
        if (drmValueFromKey == null) {
            return false;
        }
        try {
            if (!str.startsWith("QUICKPAY@")) {
                return false;
            }
            String string = drmValueFromKey.getString(str.substring(9));
            if (!TextUtils.isEmpty(string)) {
                return DrmUtil.procGraySwitchWithRate(context, Integer.parseInt(string), false);
            }
            return false;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return false;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public int callExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94e37b08", new Object[]{this, view, str})).intValue();
        }
        if (view == null) {
            return -1;
        }
        try {
            FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
            if (fBContext != null) {
                return fBContext.executeJs(str);
            }
            return -1;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return -1;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void callOnreload(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0ec775", new Object[]{this, view});
        } else if (view != null) {
            try {
                FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
                if (fBContext != null) {
                    fBContext.reloadData("{}");
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    public final RenderCallbackProxy d(ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderCallbackProxy) ipChange.ipc$dispatch("71bd32b", new Object[]{this, iCashierRenderCallback});
        }
        return new RenderCallbackProxy(iCashierRenderCallback) { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/render/api/ext/BirdNestRender$1");
            }

            @Override // com.alipay.android.app.render.birdnest.RenderCallbackProxy
            public void onTemplateCallbackChanged(ITemplateClickCallback iTemplateClickCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67e55472", new Object[]{this, iTemplateClickCallback});
                    return;
                }
                LogUtils.record(2, "BirdNestRender:onTemplateCallbackChanged", "callback=" + iTemplateClickCallback + " mCallback=" + BirdNestRender.access$000(BirdNestRender.this) + " tplId=" + BirdNestRender.access$100(BirdNestRender.this) + ", this:" + this);
                BirdNestRender.access$002(BirdNestRender.this, iTemplateClickCallback);
            }
        };
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void destroy(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a2a87c", new Object[]{this, context, new Integer(i)});
            return;
        }
        try {
            if (ResUtils.getContext() == null) {
                ResUtils.setUiContext(context);
            }
            List<JSONObject> releaseResource = e().releaseResource(i);
            if (releaseResource != null) {
                for (int i2 = 0; i2 < releaseResource.size(); i2++) {
                    JSONObject jSONObject = releaseResource.get(i2);
                    if (jSONObject.has("exception")) {
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "flybird", "BirdNestEx", jSONObject.optString("exception"));
                    }
                }
            }
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        try {
            f().triggerTemplateUpdate();
        } catch (Throwable th2) {
            LogUtils.printExceptionStackTrace(th2);
        }
        this.f = null;
        LogUtils.record(2, "BirdNestRender:destroy", "context=" + context + " hashcode=" + i + ", this:" + this);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void destroyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e93784c", new Object[]{this, view});
        } else if (view != null) {
            try {
                FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
                LogUtils.record(2, "BirdNestRender::destroyView", String.valueOf(fBContext));
                if (fBContext != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(FBContext.OPTION_DEFER_DOWNLOAD, Boolean.TRUE);
                    hashMap.put(FBContext.OPTION_DEFER_DOWNLOAD_FILTER, new BirdNestEngine.TemplateFilter() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.birdnest.api.BirdNestEngine.TemplateFilter
                        public boolean accept(String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("6c174f27", new Object[]{this, str, str2})).booleanValue();
                            }
                            if (str == null || !str.contains("QUICKPAY")) {
                                return false;
                            }
                            return true;
                        }
                    });
                    fBContext.destroy(hashMap);
                    ((ConcurrentHashMap) this.f3484a).remove(view);
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
    }

    public final BirdNestService e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestService) ipChange.ipc$dispatch("3e90a501", new Object[]{this});
        }
        return BirdNestManager.create(this.g);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public String executeJsWithResult(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c35cd2cc", new Object[]{this, view, str});
        }
        if (view == null) {
            return null;
        }
        try {
            FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
            if (fBContext != null) {
                return fBContext.executeJsWithResult(str);
            }
            return null;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return null;
        }
    }

    public final TemplateService f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateService) ipChange.ipc$dispatch("c67d13dd", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new TemplateService(this.h);
        }
        return this.b;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f00b90d", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback}) : generateView(preloadView(context, str, str2, str3, map, iCashierRenderCallback));
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateViewWithPrepareResult(MspPrepareResult mspPrepareResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bd1de855", new Object[]{this, mspPrepareResult});
        }
        final FBContext fbContext = mspPrepareResult.getPrepareResult().getFbContext();
        ICashierProvider iCashierProvider = this.g;
        if (iCashierProvider != null) {
            Context context = iCashierProvider.getContext();
            if (fbContext == null && context != null && !DrmUtil.isDrmDegraded(context, DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, false)) {
                return null;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FBFocusable autoFocusable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBContext fBContext = fbContext;
                if (fBContext != null && (autoFocusable = fBContext.getAutoFocusable()) != null) {
                    autoFocusable.requestFocus();
                }
            }
        }, 700L);
        if (!mspPrepareResult.isAsyncLayout()) {
            Compatibility.adapter(fbContext);
        }
        View contentView = LegacySupport.unsafeRenderPageForCashier(mspPrepareResult.getPrepareResult()).getFbContext().getContentView();
        LogUtils.record(2, "BirdNestRender::generateViewWithPrepareResult", "contentView=" + contentView + ", fbContext" + fbContext);
        if (contentView != null) {
            ((ConcurrentHashMap) this.f3484a).put(contentView, fbContext);
        }
        return contentView;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public String getEngineParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1c3ccdb", new Object[]{this});
        }
        String engineVersion = getEngineVersion();
        String str = "(a" + engineVersion.replace(".", "") + f7l.BRACKET_END_STR;
        LogUtils.record(2, "BirdNestRender::getBirdParamsVersion", "birdParamsVer:" + str);
        return str;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public String getEngineVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a61fb679", new Object[]{this});
        }
        return TemplateService.getBirdNestVersion();
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public FBContext getFBContext(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("2819827c", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        return (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public FBPluginFactory getFBPluginFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPluginFactory) ipChange.ipc$dispatch("4890f832", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public TemplateKeyboardService getKeyBoardService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateKeyboardService) ipChange.ipc$dispatch("308cd6cc", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template getLocalTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("24a01415", new Object[]{this, str});
        }
        TemplateService f = f();
        if (f != null) {
            return f.getLocalTemplate(str);
        }
        return null;
    }

    public ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this});
        }
        return this.g;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template getServerTemplate(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("7be17b87", new Object[]{this, str, str2});
        }
        TemplateService f = f();
        if (f != null) {
            return f.getServerTemplate(str, str2);
        }
        return null;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public ITplProvider getTplProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITplProvider) ipChange.ipc$dispatch("46322b6", new Object[]{this});
        }
        return this.h;
    }

    public ITplTransport getTplTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITplTransport) ipChange.ipc$dispatch("e48f352a", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template notifyTplUpdate(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("15e8eea", new Object[]{this, str, str2}) : notifyTplUpdate(str, str2, false, LogItem.TemplateUpdateScene.Unset);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    @Deprecated
    public PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreparedResult) ipChange.ipc$dispatch("7061df85", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback}) : preloadView(context, str, str2, str3, map, iCashierRenderCallback, new ICashierRender.RenderParams(false), null);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e499d7e", new Object[]{this, preRenderResultClearHandler});
        } else {
            f().registerPreRenderResultClearHandler(preRenderResultClearHandler);
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean safeCallExecuteJs(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f71b06", new Object[]{this, view, str})).booleanValue();
        }
        if (view != null) {
            try {
                FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
                if (fBContext != null) {
                    fBContext.safeExecuteJs(str, k, null);
                    return true;
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void safeCallExecuteJsWithResult(View view, String str, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6542788e", new Object[]{this, view, str, jsExecCallback});
            return;
        }
        if (view != null) {
            try {
                FBContext fBContext = (FBContext) ((ConcurrentHashMap) this.f3484a).get(view);
                if (fBContext != null) {
                    fBContext.safeExecuteJs(str, l, jsExecCallback);
                    return;
                }
            } catch (Exception e) {
                LogUtils.printExceptionStackTrace(e);
            }
        }
        if (jsExecCallback != null) {
            jsExecCallback.onJsExecuted(100, null);
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void sendRenderEventReportForDecider(Template template, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788fb8c7", new Object[]{this, template, new Boolean(z), new Long(j)});
        } else {
            f().sendRenderEventReportForDecider(template, z, j);
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setFBPluginFactory(FBPluginFactory fBPluginFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff736", new Object[]{this, fBPluginFactory});
        } else {
            this.d = fBPluginFactory;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setIsGenContextDelay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6852d875", new Object[]{this, new Boolean(z)});
            return;
        }
        LogUtils.record(2, "BirdNestRender::setIsGenContextDelay", "delay:" + z);
        this.i = z;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setKeyBoardService(TemplateKeyboardService templateKeyboardService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d0ecca", new Object[]{this, templateKeyboardService});
        } else {
            this.c = templateKeyboardService;
        }
    }

    public void setProvider(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b28db5", new Object[]{this, iCashierProvider});
        } else {
            this.g = iCashierProvider;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void setTplProvider(ITplProvider iTplProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fa78f8", new Object[]{this, iTplProvider});
        } else {
            this.h = iTplProvider;
        }
    }

    public void setTplTransport(ITplTransport iTplTransport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3895d82", new Object[]{this, iTplTransport});
        } else {
            this.e = iTplTransport;
        }
    }

    public final String a(String str, Map<String, Object> map, boolean z, Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0f71b21", new Object[]{this, str, map, new Boolean(z), template});
        }
        String str2 = "var flybird = flybird || {};flybird.rpcData=" + str + ";";
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("isPrerender", true);
            } catch (Throwable th) {
                LogUtils.printExceptionStackTrace(th);
            }
        }
        if (template != null) {
            JSONObject jSONObject2 = template.expInfo;
            if (jSONObject2 != null) {
                jSONObject.put("expInfo", jSONObject2);
            }
            JSONObject jSONObject3 = template.expLog;
            if (jSONObject3 != null) {
                jSONObject.put("expLog", jSONObject3);
            }
            if (!TextUtils.isEmpty(template.expId)) {
                jSONObject.put("expId", template.expId);
            }
            String template2 = template.toString();
            if (!TextUtils.isEmpty(template2)) {
                jSONObject.put("tplInfo", template2);
            }
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
            }
        }
        jSONObject.put("birdNestVer", TemplateService.getBirdNestVersion());
        return str2 + "flybird.local=" + jSONObject.toString() + ";";
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public Template notifyTplUpdate(String str, String str2, boolean z, LogItem.TemplateUpdateScene templateUpdateScene) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("6d9a27e3", new Object[]{this, str, str2, new Boolean(z), templateUpdateScene}) : f().loadTemplate(str, str2, "{}", StatisticCollector.GLOBAL_AGENT, new ICashierRender.RenderParams(false, z, templateUpdateScene));
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback, ICashierRender.RenderParams renderParams, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("c8183db0", new Object[]{this, context, str, str2, str3, map, iCashierRenderCallback, renderParams, map2});
        }
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        this.j = str;
        BirdNestManager.initFBGlobalConfig(this.g);
        TemplateService f = f();
        Object obj = StatisticCollector.GLOBAL_AGENT;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            obj = ((ICashierRenderCallback3) iCashierRenderCallback).getStatisticAgent();
        }
        Template loadTemplate = f.loadTemplate(str, str2, str3, obj, renderParams);
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        return getPreparedResultUsingDeployedModel(context, str, str3, map, iCashierRenderCallback, renderParams, map2, loadTemplate);
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public View generateView(PreparedResult preparedResult) {
        final FBContext fBContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dba2413f", new Object[]{this, preparedResult});
        }
        if (this.i) {
            fBContext = ((BirdNestBuilder) preparedResult.mResult).create();
        } else {
            fBContext = (FBContext) preparedResult.mResult;
        }
        ICashierProvider iCashierProvider = this.g;
        if (iCashierProvider != null) {
            Context context = iCashierProvider.getContext();
            if (fBContext == null && context != null && !DrmUtil.isDrmDegraded(context, DrmKey.DEGRADE_RENDER_GEN_FAIL_NOISE, false, false)) {
                return null;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.android.app.render.api.ext.BirdNestRender.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                FBFocusable autoFocusable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBContext fBContext2 = fBContext;
                if (fBContext2 != null && (autoFocusable = fBContext2.getAutoFocusable()) != null) {
                    autoFocusable.requestFocus();
                }
            }
        }, 700L);
        if (!preparedResult.mIsAsyncLayout) {
            Compatibility.adapter(fBContext);
        }
        View contentView = fBContext.getContentView();
        LogUtils.record(2, "BirdNestRender::generateView", "contentView=" + contentView + ", fbContext" + fBContext);
        if (contentView != null) {
            ((ConcurrentHashMap) this.f3484a).put(contentView, fBContext);
        }
        return contentView;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean needUpdateLocalTpl(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51d0d0ad", new Object[]{this, template, template2})).booleanValue();
        }
        if (template2 == null) {
            return false;
        }
        if ((TextUtils.isEmpty(template2.expId) || template2.expId.toLowerCase().equals("null")) && template2.expInfo == null && template2.expLog == null) {
            boolean needRollback = TemplateManager.needRollback(template2, template);
            TemplateService f = f();
            if (!needRollback && (f == null || !f.needUpdateLocalTpl(template, template2))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public boolean onBackPressed(View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53902393", new Object[]{this, view})).booleanValue();
        }
        try {
            BirdNestService e = e();
            z = e.onBackPressed(view);
            LogUtils.record(2, "BirdNestRender::onBackPressed", "service: " + e);
            return z;
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return z;
        }
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public void callRender(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c927fd25", new Object[]{this, str});
            return;
        }
        LogUtils.record(2, "BirdNestRender::callRender", "result:" + str);
        if (this.f == null || str == null) {
            LogUtils.record(2, "BirdNestRender::callRender", "callRenderFail: result=" + str + " callback=" + this.f + " tpl=" + this.j + ", this:" + this);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LogUtils.record(2, "BirdNestRender::callRender", "resultJson 001:" + jSONObject.toString());
            this.f.onClickCallback(jSONObject.toString());
        } catch (Exception e) {
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : str.split(",")) {
                String[] split2 = str2.substring(1, str2.length() - 1).split("=");
                if (split2.length >= 2) {
                    try {
                        jSONObject2.put(split2[0], split2[1]);
                    } catch (Throwable unused) {
                        LogUtils.printExceptionStackTrace(e);
                    }
                }
            }
            LogUtils.record(2, "BirdNestRender::callRender", "resultJson 002:" + jSONObject2.toString());
            this.f.onClickCallback(jSONObject2.toString());
        }
    }

    public PreparedResult getPreparedResultUsingDeployedModel(Context context, String str, String str2, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback, ICashierRender.RenderParams renderParams, Map<String, String> map2, Template template) {
        long j;
        Object obj;
        PreparedResult preparedResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("870a2244", new Object[]{this, context, str, str2, map, iCashierRenderCallback, renderParams, map2, template});
        }
        ICashierRender.RenderParams renderParams2 = renderParams == null ? new ICashierRender.RenderParams(false) : renderParams;
        if (template != null) {
            String str3 = template.data;
            SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String a2 = a(str2, map, renderParams2.isPreRender, template);
            ResUtils.setUiContext(context);
            boolean c = c(context, str);
            if (c) {
                j = elapsedRealtime;
                LogUtils.record(2, "BirdNestRender:isAsyncLayout", "tplId:" + str);
            } else {
                j = elapsedRealtime;
            }
            SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
            boolean z = renderParams2.onPadAdaptMode;
            int i = renderParams2.displayHeight;
            int i2 = renderParams2.displayWidth;
            if (map == null || !map.containsKey("bizId")) {
                obj = -1;
            } else {
                obj = map.get("bizId");
            }
            BirdNestBuilder bizId = new BirdNestBuilder(context).setPluginFactory(this.d).setTemplateId(str).setDataContent(a2).setmKeyboardService(this.c).setTemplateJson(str3).setUseQuickPayTemplateManager(true).setCashierProvider(this.g).setAsyncLayout(c).setResourceClient(new DynResResourceClient()).setCallbackProxy(d(iCashierRenderCallback)).setAppParams(map2).setBizId(obj);
            if (z && i > 0 && i2 > 0) {
                bizId.setDisplayHeight(i);
                bizId.setDisplayWidth(i2);
            }
            if (this.i) {
                preparedResult = PreparedResult.build(bizId, c, template);
            } else {
                SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
                FBContext create = bizId.create();
                SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
                preparedResult = PreparedResult.build(create, c, template);
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            renderParams2.getRenderStatistic().setRenderTime(elapsedRealtime2);
            f().sendRenderEventReportForDecider(template, true, elapsedRealtime2);
            return preparedResult;
        }
        throw new IllegalArgumentException("missing template, expected model");
    }

    @Override // com.alipay.android.app.render.api.ICashierRender
    public MspPrepareResult preloadViewNew(Context context, String str, String str2, String str3, JSONObject jSONObject, ICashierRenderCallback iCashierRenderCallback, ICashierRender.RenderParams renderParams, Map<String, String> map, CreateEngineOptions createEngineOptions) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPrepareResult) ipChange.ipc$dispatch("3ba285c8", new Object[]{this, context, str, str2, str3, jSONObject, iCashierRenderCallback, renderParams, map, createEngineOptions});
        }
        LogUtils.record(2, "BirdNestRender:preloadViewNew", "tplId:" + str);
        SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        this.j = str;
        BirdNestManager.initFBGlobalConfig(this.g);
        TemplateService f = f();
        Object obj2 = StatisticCollector.GLOBAL_AGENT;
        if (iCashierRenderCallback instanceof ICashierRenderCallback3) {
            obj2 = ((ICashierRenderCallback3) iCashierRenderCallback).getStatisticAgent();
        }
        Template loadTemplate = f.loadTemplate(str, str2, str3, obj2, renderParams);
        SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "LOAD_TEMPLATE");
        ICashierRender.RenderParams renderParams2 = renderParams == null ? new ICashierRender.RenderParams(false) : renderParams;
        if (loadTemplate != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean c = c(context, str);
            if (c) {
                LogUtils.record(2, "BirdNestRender:isAsyncLayout", "tplId:" + str);
            }
            boolean z = renderParams2.onPadAdaptMode;
            int i = renderParams2.displayHeight;
            int i2 = renderParams2.displayWidth;
            if (jSONObject == null || !jSONObject.has("bizId")) {
                obj = -1;
            } else {
                obj = jSONObject.get("bizId");
            }
            SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
            JSONObject b = b(str3, jSONObject, loadTemplate);
            SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_RPC_JS");
            ResUtils.setUiContext(context);
            BirdNestBuilder createEngineOptions2 = new BirdNestBuilder(context).setPluginFactory(this.d).setTemplateId(str).setDataContent(b.toString()).setmKeyboardService(this.c).setTemplateJson(loadTemplate.getAttachedFBTemplateContent()).setUseQuickPayTemplateManager(true).setCashierProvider(this.g).setAsyncLayout(c).setResourceClient(new DynResResourceClient()).setCallbackProxy(d(iCashierRenderCallback)).setAppParams(map).setBizId(obj).setCreateEngineOptions(createEngineOptions);
            if (z && i > 0 && i2 > 0) {
                createEngineOptions2.setDisplayHeight(i);
                createEngineOptions2.setDisplayWidth(i2);
            }
            SpOuterUtil.startSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
            PrepareResult createResult = createEngineOptions2.createResult();
            SpOuterUtil.endSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "BUILD_FBCONTEXT");
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            renderParams2.getRenderStatistic().setRenderTime(elapsedRealtime2);
            f().sendRenderEventReportForDecider(loadTemplate, true, elapsedRealtime2);
            return new MspPrepareResult(createResult, c);
        }
        throw new IllegalArgumentException("missing template, expected model");
    }
}

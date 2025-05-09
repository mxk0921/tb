package com.taobao.tbpoplayer.view;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.utils.ConsoleLogger$Level;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.Map;
import tb.kww;
import tb.lyv;
import tb.t2o;
import tb.wdm;
import tb.xem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerTrackingEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PopLayerJsBridgeAction mJsBridgeAction;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends PopLayerJsBridgeAction.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f13412a;
        public final /* synthetic */ JSCallback b;

        public a(PopLayerTrackingEventModule popLayerTrackingEventModule, JSCallback jSCallback, JSCallback jSCallback2) {
            this.f13412a = jSCallback;
            this.b = jSCallback2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1358295029) {
                super.b((Map) objArr[0]);
                return null;
            } else if (hashCode == 1885098766) {
                super.c((String) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/view/PopLayerTrackingEventModule$1");
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.d, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
                return;
            }
            super.b(map);
            if (this.f13412a != null) {
                this.f13412a.invoke(new JSONObject(map).toJSONString());
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.d, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
                return;
            }
            super.c(str);
            JSCallback jSCallback = this.b;
            if (jSCallback != null) {
                jSCallback.invoke(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends PopLayerJsBridgeAction.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f13413a;
        public final /* synthetic */ JSCallback b;

        public b(PopLayerTrackingEventModule popLayerTrackingEventModule, JSCallback jSCallback, JSCallback jSCallback2) {
            this.f13413a = jSCallback;
            this.b = jSCallback2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1358295029) {
                super.b((Map) objArr[0]);
                return null;
            } else if (hashCode == 1885098766) {
                super.c((String) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/view/PopLayerTrackingEventModule$2");
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.d, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
                return;
            }
            super.b(map);
            if (this.f13413a != null) {
                this.f13413a.invoke(new JSONObject(map).toJSONString());
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.d, com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
                return;
            }
            super.c(str);
            JSCallback jSCallback = this.b;
            if (jSCallback != null) {
                jSCallback.invoke(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements PopLayerJsBridgeAction.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f13414a;
        public final /* synthetic */ JSCallback b;

        public c(PopLayerTrackingEventModule popLayerTrackingEventModule, JSCallback jSCallback, JSCallback jSCallback2) {
            this.f13414a = jSCallback;
            this.b = jSCallback2;
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
                return;
            }
            JSCallback jSCallback = this.f13414a;
            if (jSCallback != null) {
                jSCallback.invoke(str);
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
                return;
            }
            JSCallback jSCallback = this.f13414a;
            if (jSCallback != null) {
                jSCallback.invoke(map);
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
                return;
            }
            JSCallback jSCallback = this.b;
            if (jSCallback != null) {
                jSCallback.invoke(str);
            }
        }
    }

    static {
        t2o.a(790626515);
    }

    private void dealException(Throwable th, String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88b3173", new Object[]{this, th, str, jSCallback});
            return;
        }
        try {
            wdm.h(str, th);
            if (jSCallback != null) {
                jSCallback.invoke(null);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private PopLayerWeexView findRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerWeexView) ipChange.ipc$dispatch("be5435d6", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && (wXSDKInstance instanceof xem)) {
            return (PopLayerWeexView) lyv.c(((xem) wXSDKInstance).m0);
        }
        return null;
    }

    private PopLayerJsBridgeAction.c generateCallBack(JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerJsBridgeAction.c) ipChange.ipc$dispatch("574dee91", new Object[]{this, jSCallback, jSCallback2});
        }
        return new c(this, jSCallback, jSCallback2);
    }

    private PopLayerJsBridgeAction getJsBridgeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerJsBridgeAction) ipChange.ipc$dispatch("49c99c37", new Object[]{this});
        }
        if (this.mJsBridgeAction == null) {
            this.mJsBridgeAction = new PopLayerJsBridgeAction(findRootView());
        }
        return this.mJsBridgeAction;
    }

    public static /* synthetic */ Object ipc$super(PopLayerTrackingEventModule popLayerTrackingEventModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerTrackingEventModule");
    }

    @WXModuleAnno
    public void addPageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf699ad", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().c(map.get("sourceName"), map.get("events"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "addPageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void bindValueToNative(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae41998", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().d(map.get("value"), new a(this, jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "bindValueToNative.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void consoleLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c13ad3e", new Object[]{this, str});
            return;
        }
        PopLayerWeexView findRootView = findRootView();
        if (findRootView != null) {
            findRootView.consoleLog(str, ConsoleLogger$Level.I);
        }
    }

    @WXModuleAnno
    public void display(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e70c21c", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().f(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "display.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void finishPop(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc86da0", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().g(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "finishPop.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void fireEvent(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4efb1a", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 != null) {
            try {
                jSCallback2.invoke(null);
            } catch (Throwable th) {
                wdm.h("fireEvent error", th);
            }
        }
    }

    @WXModuleAnno
    public void getFrequencyInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99318aaa", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().h(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getFrequencyInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getLocalCrowdReturn(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6081256", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().i(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getLocalCrowdReturn.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopCheckReturn(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d97c501", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().k(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopCheckReturn.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopConfigInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebc0273", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().l(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopConfigInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopLayerVersion(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8849dc", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().m(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getPopLayerVersion.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getPopTemplatePageConfig(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851ae618", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 != null) {
            try {
                jSCallback2.invoke("notSupport");
            } catch (Throwable th) {
                dealException(th, "getPopTemplatePageConfig.error", jSCallback2);
            }
        }
    }

    @WXModuleAnno
    public void getTimeTravelSec(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3556c4a", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().o(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getTimeTravelSec.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void getTriggerEventInfo(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a64058", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().p(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "getTriggerEventInfo.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void increaseReadTimes(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d13530", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().q(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "increaseReadTimes.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void operateTrackingView(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2900efe", new Object[]{this, map, jSCallback, jSCallback2});
        } else if (jSCallback2 != null) {
            try {
                jSCallback2.invoke(null);
            } catch (Throwable th) {
                wdm.h("operateTrackingView error", th);
            }
        }
    }

    @WXModuleAnno
    public void preRenderUrl(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19ce0c8", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().w(map.get("bizName"), JSON.parseObject(map.get("task")), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "preRenderUrl.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void putOnePopExtras(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ba6241", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().x(map.get("onePopExtras"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "putOnePopExtras.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void readValueFromNative(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba67e2", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().y(map.get("key"), new b(this, jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "readValueFromNative.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void recordUserBehavior(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeb1630", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().z(map.get("userResult"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "recordUserBehavior.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void removeAllPageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b473f89", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().A(generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "removeAllPageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void removePageEventListen(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a62a290", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().B(map.get("sourceName"), map.get("events"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "removePageEventListen.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void selectAndOperate(String str, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc7131a", new Object[]{this, str, jSCallback, jSCallback2});
        } else if (jSCallback2 != null) {
            try {
                jSCallback2.invoke("notSupported");
            } catch (Throwable th) {
                dealException(th, "selectAndOperate.error", jSCallback2);
            }
        }
    }

    @WXModuleAnno
    public void setClickableArea(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4d7f1", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            this.mJsBridgeAction.C(map.get("enable"), map.get("width"), map.get("height"), map.get("layout"), map.get("left"), map.get("right"), map.get("top"), map.get("bottom"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setClickableArea.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void setModalThreshold(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81bbc35e", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().D(Double.parseDouble(map.get("modalThreshold")), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setModalThreshold.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void setPopContentId(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c891e99", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            getJsBridgeAction().E(map.get("contentId"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "setPopContentId.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void updateMetaConfig(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eb0b4e", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(map);
            getJsBridgeAction().G(jSONObject.optString("modalThreshold"), jSONObject.optString(WXBasicComponentType.EMBED), jSONObject.optString("showCloseBtn"), generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "updateMetaConfig.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void navToUrl(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80647c2d", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            PopLayerWeexView findRootView = findRootView();
            if (findRootView == null) {
                if (jSCallback2 != null) {
                    jSCallback2.invoke(null);
                }
            } else if (map != null) {
                String str = map.get("url");
                boolean parseBoolean = Boolean.parseBoolean(map.get("openNewPage"));
                findRootView.setUserResultInTrack(map.get("userResult"), false, null);
                PopLayerJsBridgeAction.c generateCallBack = generateCallBack(jSCallback, jSCallback2);
                if (getJsBridgeAction().r(str, map.get("jumpMode"), generateCallBack)) {
                    return;
                }
                if (parseBoolean) {
                    getJsBridgeAction().v(JSON.toJSONString(map), new kww(this.mWXSDKInstance), str, generateCallBack);
                } else {
                    getJsBridgeAction().s(str, generateCallBack);
                }
            } else if (jSCallback2 != null) {
                jSCallback2.invoke("urlEmpty");
            }
        } catch (Throwable th) {
            dealException(th, "navToUrl.error", jSCallback2);
        }
    }

    @WXModuleAnno
    public void close(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddd5a6", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        if (map != null) {
            try {
                str = map.get("reason");
                str2 = map.get("errorMessage");
                str3 = map.get("errorInfo");
                str4 = map.get("prepareCostTime");
                str5 = map.get("requestCostTime");
                str6 = map.get("loadMaterialCostTime");
                str7 = map.get("mtopCostTime");
                str8 = map.get("userResult");
                str9 = map.get("contentId");
                str10 = map.get("onePopExtras");
            } catch (Throwable th) {
                dealException(th, "close.error", jSCallback2);
                return;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str10 = null;
            str8 = null;
            str9 = null;
        }
        String str11 = TextUtils.isEmpty(str) ? "commonJsClose" : str;
        String str12 = TextUtils.isEmpty(str2) ? null : str2;
        String str13 = TextUtils.isEmpty(str3) ? null : str3;
        long j = 0;
        long parseLong = !TextUtils.isEmpty(str4) ? Long.parseLong(str4) : 0L;
        long parseLong2 = !TextUtils.isEmpty(str5) ? Long.parseLong(str5) : 0L;
        long parseLong3 = !TextUtils.isEmpty(str6) ? Long.parseLong(str6) : 0L;
        if (!TextUtils.isEmpty(str7)) {
            j = Long.parseLong(str7);
        }
        getJsBridgeAction().e(str11, str12, str13, str10, str8, str9, parseLong, parseLong2, parseLong3, j, generateCallBack(jSCallback, jSCallback2));
    }

    @WXModuleAnno
    public void trackTimeLineCostTime(Map<String, String> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1515f038", new Object[]{this, map, jSCallback, jSCallback2});
            return;
        }
        try {
            String str = map.get("prepareCostTime");
            String str2 = map.get("requestCostTime");
            String str3 = map.get("loadMaterialCostTime");
            String str4 = map.get("mtopCostTime");
            long j = 0;
            long parseLong = !TextUtils.isEmpty(str) ? Long.parseLong(str) : 0L;
            long parseLong2 = !TextUtils.isEmpty(str2) ? Long.parseLong(str2) : 0L;
            long parseLong3 = !TextUtils.isEmpty(str3) ? Long.parseLong(str3) : 0L;
            if (!TextUtils.isEmpty(str4)) {
                j = Long.parseLong(str4);
            }
            getJsBridgeAction().F(parseLong, parseLong2, parseLong3, j, generateCallBack(jSCallback, jSCallback2));
        } catch (Throwable th) {
            dealException(th, "trackTimeLineCostTime.error", jSCallback2);
        }
    }
}

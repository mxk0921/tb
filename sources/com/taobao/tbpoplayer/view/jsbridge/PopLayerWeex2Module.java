package com.taobao.tbpoplayer.view.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tbpoplayer.view.PopLayerWeex2View;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.HashMap;
import java.util.Map;
import tb.hmj;
import tb.pvh;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWeex2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PopLayerJsBridgeAction mJsBridgeAction = new PopLayerJsBridgeAction((PopLayerWeex2View) getInstance().getTag(PopLayerWeex2View.WEEX_TAG_KEY));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends PopLayerJsBridgeAction.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f13422a;
        public final /* synthetic */ pvh b;

        public a(PopLayerWeex2Module popLayerWeex2Module, pvh pvhVar, pvh pvhVar2) {
            this.f13422a = pvhVar;
            this.b = pvhVar2;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/view/jsbridge/PopLayerWeex2Module$1");
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
            if (this.f13422a != null) {
                this.f13422a.b(new JSONObject(map).toJSONString());
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
            pvh pvhVar = this.b;
            if (pvhVar != null) {
                pvhVar.b(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends PopLayerJsBridgeAction.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f13423a;
        public final /* synthetic */ pvh b;

        public b(PopLayerWeex2Module popLayerWeex2Module, pvh pvhVar, pvh pvhVar2) {
            this.f13423a = pvhVar;
            this.b = pvhVar2;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tbpoplayer/view/jsbridge/PopLayerWeex2Module$2");
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
            if (this.f13423a != null) {
                this.f13423a.b(new JSONObject(map).toJSONString());
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
            pvh pvhVar = this.b;
            if (pvhVar != null) {
                pvhVar.b(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements PopLayerJsBridgeAction.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f13424a;
        public final /* synthetic */ pvh b;

        public c(PopLayerWeex2Module popLayerWeex2Module, pvh pvhVar, pvh pvhVar2) {
            this.f13424a = pvhVar;
            this.b = pvhVar2;
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
                return;
            }
            pvh pvhVar = this.f13424a;
            if (pvhVar != null) {
                pvhVar.b(str);
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
                return;
            }
            pvh pvhVar = this.f13424a;
            if (pvhVar != null) {
                pvhVar.b(map);
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
                return;
            }
            pvh pvhVar = this.b;
            if (pvhVar != null) {
                pvhVar.b(str);
            }
        }
    }

    static {
        t2o.a(790626544);
    }

    public PopLayerWeex2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void dealException(Throwable th, String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92edd49e", new Object[]{this, th, str, pvhVar});
            return;
        }
        try {
            wdm.h(str, th);
            if (pvhVar != null) {
                pvhVar.b(new Object[0]);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private PopLayerJsBridgeAction.c generateCallBack(pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerJsBridgeAction.c) ipChange.ipc$dispatch("f3401f7f", new Object[]{this, pvhVar, pvhVar2});
        }
        return new c(this, pvhVar, pvhVar2);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWeex2Module popLayerWeex2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/jsbridge/PopLayerWeex2Module");
    }

    @MUSMethod(uiThread = true)
    public void addPageEventListen(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb1af3ea", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.c(jSONObject.getString("sourceName"), jSONObject.getString("events"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "addPageEventListen.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void bindValueToNative(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce63b6d5", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.d(jSONObject.getString("value"), new a(this, pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "bindValueToNative.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void display(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542d0359", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.f(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "display.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void finishPop(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22dc52dd", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.g(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "finishPop.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getFrequencyInfo(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee12c9e7", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.h(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getFrequencyInfo.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getLocalCrowdReturn(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111e5d93", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.i(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getLocalCrowdReturn.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopCheckReturn(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d2133e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.k(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getPopCheckReturn.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopConfigInfo(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0752b0", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.l(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getPopConfigInfo.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getPopLayerVersion(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0a4b19", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.m(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getPopLayerVersion.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getTimeTravelSec(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba54b87", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.o(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getTimeTravelSec.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void getTriggerEventInfo(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f829d95", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.p(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "getTriggerEventInfo.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void increaseReadTimes(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef292a6d", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.q(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "increaseReadTimes.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void preRenderUrl(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdd2e05", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.w(jSONObject.getString("bizName"), jSONObject.getJSONObject("task"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "preRenderUrl.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void putOnePopExtras(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917bf07e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.x(jSONObject.getString("onePopExtras"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "putOnePopExtras.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void readValueFromNative(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c29f1f", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.y(jSONObject.getString("key"), new b(this, pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "readValueFromNative.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void recordUserBehavior(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c0b6d", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.z(jSONObject.getString("userResult"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "recordUserBehavior.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void removeAllPageEventListen(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7055c6", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.A(generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "removeAllPageEventListen.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void removePageEventListen(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6812f7cd", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.B(jSONObject.getString("sourceName"), jSONObject.getString("events"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "removePageEventListen.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setClickableArea(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1769962e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.C(jSONObject.getString("enable"), jSONObject.getString("width"), jSONObject.getString("height"), jSONObject.getString("layout"), jSONObject.getString("left"), jSONObject.getString("right"), jSONObject.getString("top"), jSONObject.getString("bottom"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "setClickableArea.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setModalThreshold(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eab569b", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.D(Double.parseDouble(jSONObject.getString("modalThreshold")), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "setModalThreshold.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void setPopContentId(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c9c4d6", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.E(jSONObject.getString("contentId"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "setPopContentId.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void updateMetaConfig(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62220e8b", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            this.mJsBridgeAction.G(jSONObject.getString("modalThreshold"), jSONObject.getString(WXBasicComponentType.EMBED), jSONObject.getString("showCloseBtn"), generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "updateMetaConfig.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void navToUrl(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7f566a", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            PopLayerWeex2View popLayerWeex2View = (PopLayerWeex2View) getInstance().getTag(PopLayerWeex2View.WEEX_TAG_KEY);
            if (popLayerWeex2View == null) {
                if (pvhVar2 != null) {
                    pvhVar2.b(new Object[0]);
                }
            } else if (jSONObject != null) {
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("jumpMode");
                boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("openNewPage"));
                popLayerWeex2View.setUserResultInTrack(jSONObject.getString("userResult"), false, null);
                PopLayerJsBridgeAction.c generateCallBack = generateCallBack(pvhVar, pvhVar2);
                if (this.mJsBridgeAction.r(string, string2, generateCallBack)) {
                    return;
                }
                if (parseBoolean) {
                    this.mJsBridgeAction.v(JSON.toJSONString(jSONObject), new hmj(getInstance().getUIContext(), popLayerWeex2View, new HashMap(), ""), string, generateCallBack);
                } else {
                    this.mJsBridgeAction.s(string, generateCallBack);
                }
            } else if (pvhVar2 != null) {
                pvhVar2.b("urlEmpty");
            }
        } catch (Throwable th) {
            dealException(th, "navToUrl.error", pvhVar2);
        }
    }

    @MUSMethod(uiThread = true)
    public void close(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b11f0e3", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("reason");
                string2 = jSONObject.getString("errorMessage");
                string3 = jSONObject.getString("errorInfo");
                String string9 = jSONObject.getString("contentId");
                string4 = jSONObject.getString("prepareCostTime");
                string5 = jSONObject.getString("requestCostTime");
                string6 = jSONObject.getString("loadMaterialCostTime");
                string7 = jSONObject.getString("mtopCostTime");
                String string10 = jSONObject.getString("onePopExtras");
                string8 = jSONObject.getString("userResult");
                str = string9;
                str2 = string10;
            } catch (Throwable th) {
                dealException(th, "close.error", pvhVar2);
                return;
            }
        } else {
            string = null;
            string2 = null;
            string3 = null;
            string4 = null;
            string5 = null;
            string6 = null;
            string7 = null;
            str2 = null;
            string8 = null;
            str = null;
        }
        String str3 = TextUtils.isEmpty(string) ? "commonJsClose" : string;
        String str4 = TextUtils.isEmpty(string2) ? null : string2;
        String str5 = TextUtils.isEmpty(string3) ? null : string3;
        long j = 0;
        long parseLong = !TextUtils.isEmpty(string4) ? Long.parseLong(string4) : 0L;
        long parseLong2 = !TextUtils.isEmpty(string5) ? Long.parseLong(string5) : 0L;
        long parseLong3 = !TextUtils.isEmpty(string6) ? Long.parseLong(string6) : 0L;
        if (!TextUtils.isEmpty(string7)) {
            j = Long.parseLong(string7);
        }
        this.mJsBridgeAction.e(str3, str4, str5, str2, string8, str, parseLong, parseLong2, parseLong3, j, generateCallBack(pvhVar, pvhVar2));
    }

    @MUSMethod(uiThread = true)
    public void trackTimeLineCostTime(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada12d75", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        try {
            String string = jSONObject.getString("prepareCostTime");
            String string2 = jSONObject.getString("requestCostTime");
            String string3 = jSONObject.getString("loadMaterialCostTime");
            String string4 = jSONObject.getString("mtopCostTime");
            long j = 0;
            long parseLong = !TextUtils.isEmpty(string) ? Long.parseLong(string) : 0L;
            long parseLong2 = !TextUtils.isEmpty(string2) ? Long.parseLong(string2) : 0L;
            long parseLong3 = !TextUtils.isEmpty(string3) ? Long.parseLong(string3) : 0L;
            if (!TextUtils.isEmpty(string4)) {
                j = Long.parseLong(string4);
            }
            this.mJsBridgeAction.F(parseLong, parseLong2, parseLong3, j, generateCallBack(pvhVar, pvhVar2));
        } catch (Throwable th) {
            dealException(th, "trackTimeLineCostTime.error", pvhVar2);
        }
    }
}

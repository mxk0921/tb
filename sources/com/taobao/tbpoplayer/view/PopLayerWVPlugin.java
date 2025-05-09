package com.taobao.tbpoplayer.view;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopLayerWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PopLayerJsBridgeAction mJsBridgeAction;
    private final WeakReference<PopLayerBaseView> viewWeakReference;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements PopLayerJsBridgeAction.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f13415a;

        public a(PopLayerWVPlugin popLayerWVPlugin, WVCallBackContext wVCallBackContext) {
            this.f13415a = wVCallBackContext;
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
                return;
            }
            try {
                if (this.f13415a != null) {
                    if (TextUtils.isEmpty(str)) {
                        this.f13415a.success();
                    } else {
                        this.f13415a.success(str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0a100b", new Object[]{this, map});
                return;
            }
            try {
                if (this.f13415a != null) {
                    nsw nswVar = new nsw();
                    nswVar.h(new JSONObject(map));
                    this.f13415a.success(nswVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("705c530e", new Object[]{this, str});
                return;
            }
            try {
                if (this.f13415a != null) {
                    if (TextUtils.isEmpty(str)) {
                        this.f13415a.error();
                    } else {
                        this.f13415a.error(str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(790626519);
    }

    public PopLayerWVPlugin(PopLayerBaseView popLayerBaseView) {
        this.viewWeakReference = new WeakReference<>(popLayerBaseView);
        this.mJsBridgeAction = new PopLayerJsBridgeAction(popLayerBaseView);
    }

    private PopLayerJsBridgeAction.c generateCallBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerJsBridgeAction.c) ipChange.ipc$dispatch("2ee2ca34", new Object[]{this, wVCallBackContext});
        }
        return new a(this, wVCallBackContext);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWVPlugin popLayerWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/view/PopLayerWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        long j;
        Throwable th;
        String str3;
        String str4;
        String str5;
        long j2;
        String str6;
        long j3;
        String str7;
        long j4;
        long longValue;
        String str8 = "commonJsClose";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            PopLayerBaseView popLayerBaseView = this.viewWeakReference.get();
            if (popLayerBaseView == null) {
                return false;
            }
            if ("close".equals(str)) {
                try {
                    com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str2);
                    String string = parseObject.getString("reason");
                    try {
                        str3 = parseObject.getString("errorMessage");
                        try {
                            str6 = parseObject.getString("errorInfo");
                            try {
                                str7 = parseObject.getString("userResult");
                                try {
                                    if (!TextUtils.isEmpty(string)) {
                                        str8 = string;
                                    }
                                    try {
                                        if (TextUtils.isEmpty(str3)) {
                                            str3 = null;
                                        }
                                        if (TextUtils.isEmpty(str6)) {
                                            str6 = null;
                                        }
                                        str4 = parseObject.getString("contentId");
                                        try {
                                            longValue = parseObject.getLongValue("prepareCostTime");
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j2 = 0;
                                            j3 = 0;
                                            j4 = 0;
                                            j = 0;
                                            wdm.h("PopLayerWVPlugin.close.parseParam.error.", th);
                                            str5 = null;
                                            this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                                            return true;
                                        }
                                        try {
                                            j = parseObject.getLongValue("requestCostTime");
                                            try {
                                                j3 = parseObject.getLongValue("loadMaterialCostTime");
                                                try {
                                                    long longValue2 = parseObject.getLongValue("mtopCostTime");
                                                    try {
                                                        str4 = str4;
                                                        str5 = parseObject.getString("onePopExtras");
                                                        str8 = str8;
                                                        str3 = str3;
                                                        str6 = str6;
                                                        j3 = j3;
                                                        j4 = longValue;
                                                        str7 = str7;
                                                        j2 = longValue2;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        str3 = str3;
                                                        str6 = str6;
                                                        j2 = longValue2;
                                                        j4 = longValue;
                                                        wdm.h("PopLayerWVPlugin.close.parseParam.error.", th);
                                                        str5 = null;
                                                        this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                                                        return true;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    str3 = str3;
                                                    str6 = str6;
                                                    j4 = longValue;
                                                    j2 = 0;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                str3 = str3;
                                                str6 = str6;
                                                j4 = longValue;
                                                j2 = 0;
                                                j3 = 0;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            str3 = str3;
                                            str6 = str6;
                                            j4 = longValue;
                                            j2 = 0;
                                            j3 = 0;
                                            j = 0;
                                            wdm.h("PopLayerWVPlugin.close.parseParam.error.", th);
                                            str5 = null;
                                            this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                                            return true;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        str4 = null;
                                        j2 = 0;
                                        j3 = 0;
                                        j4 = 0;
                                        j = 0;
                                        wdm.h("PopLayerWVPlugin.close.parseParam.error.", th);
                                        str5 = null;
                                        this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                                        return true;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    str8 = string;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                str8 = string;
                                str4 = null;
                                str7 = null;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            str8 = string;
                            str4 = null;
                            str6 = null;
                            str7 = null;
                            str3 = str3;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        str8 = string;
                        str3 = null;
                        str4 = null;
                        str6 = null;
                        str7 = null;
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                        j = 0;
                        wdm.h("PopLayerWVPlugin.close.parseParam.error.", th);
                        str5 = null;
                        this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                        return true;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
                this.mJsBridgeAction.e(str8, str3, str6, str5, str7, str4, j4, j, j3, j2, generateCallBack(wVCallBackContext));
                return true;
            } else if ("navToUrl".equals(str)) {
                wdm.d("PopLayerWVPlugin.jsNavToUrl?params=%s", str2);
                com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(str2);
                String string2 = parseObject2.getString("url");
                String string3 = parseObject2.getString("jumpMode");
                boolean booleanValue = parseObject2.getBooleanValue("openNewPage");
                popLayerBaseView.setUserResultInTrack(parseObject2.getString("userResult"), false, null);
                PopLayerJsBridgeAction.c generateCallBack = generateCallBack(wVCallBackContext);
                if (!this.mJsBridgeAction.r(string2, string3, generateCallBack)) {
                    if (!booleanValue) {
                        this.mJsBridgeAction.s(string2, generateCallBack);
                    } else if (popLayerBaseView instanceof PopLayerWebView) {
                        this.mJsBridgeAction.v(parseObject2.toJSONString(), ((PopLayerWebView) popLayerBaseView).getWebView(), string2, generateCallBack);
                    }
                }
                return true;
            } else if ("increaseReadTimes".equals(str)) {
                this.mJsBridgeAction.q(generateCallBack(wVCallBackContext));
                return true;
            } else if ("finishPop".equals(str)) {
                this.mJsBridgeAction.g(generateCallBack(wVCallBackContext));
                return true;
            } else if ("setModalThreshold".equals(str)) {
                this.mJsBridgeAction.D(((JSONObject) new JSONTokener(str2).nextValue()).getDouble("modalThreshold"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("display".equals(str)) {
                this.mJsBridgeAction.f(generateCallBack(wVCallBackContext));
                return true;
            } else if ("updateMetaConfig".equals(str)) {
                JSONObject jSONObject = new JSONObject(str2);
                this.mJsBridgeAction.G(jSONObject.optString("modalThreshold"), jSONObject.optString(WXBasicComponentType.EMBED), jSONObject.optString("showCloseBtn"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("getTriggerEventInfo".equals(str)) {
                this.mJsBridgeAction.p(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopLayerVersion".equals(str)) {
                this.mJsBridgeAction.m(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getTimeTravelSec".equals(str)) {
                this.mJsBridgeAction.o(generateCallBack(wVCallBackContext));
                return true;
            } else if ("bindValueToNative".equals(str)) {
                this.mJsBridgeAction.d(new JSONObject(str2).optString("value"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("readValueFromNative".equals(str)) {
                this.mJsBridgeAction.y(new JSONObject(str2).optString("key"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopCheckReturn".equals(str)) {
                this.mJsBridgeAction.k(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getPopConfigInfo".equals(str)) {
                this.mJsBridgeAction.l(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getFrequencyInfo".equals(str)) {
                this.mJsBridgeAction.h(generateCallBack(wVCallBackContext));
                return true;
            } else if ("getLocalCrowdReturn".equals(str)) {
                this.mJsBridgeAction.i(generateCallBack(wVCallBackContext));
                return true;
            } else if ("trackTimeLineCostTime".equals(str)) {
                JSONObject jSONObject2 = new JSONObject(str2);
                this.mJsBridgeAction.F(jSONObject2.optLong("prepareCostTime"), jSONObject2.optLong("requestCostTime"), jSONObject2.optLong("loadMaterialCostTime"), jSONObject2.optLong("mtopCostTime"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("setPopContentId".equals(str)) {
                this.mJsBridgeAction.E(new JSONObject(str2).optString("contentId"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("putOnePopExtras".equals(str)) {
                this.mJsBridgeAction.x(new JSONObject(str2).optString("onePopExtras"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("recordUserBehavior".equals(str)) {
                this.mJsBridgeAction.z(JSON.parseObject(str2).getString("userResult"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("addPageEventListen".equals(str)) {
                com.alibaba.fastjson.JSONObject parseObject3 = JSON.parseObject(str2);
                this.mJsBridgeAction.c(parseObject3.getString("sourceName"), parseObject3.getString("events"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("removePageEventListen".equals(str)) {
                com.alibaba.fastjson.JSONObject parseObject4 = JSON.parseObject(str2);
                this.mJsBridgeAction.B(parseObject4.getString("sourceName"), parseObject4.getString("events"), generateCallBack(wVCallBackContext));
                return true;
            } else if ("removeAllPageEventListen".equals(str)) {
                this.mJsBridgeAction.A(generateCallBack(wVCallBackContext));
                return true;
            } else if ("preRenderUrl".equals(str)) {
                com.alibaba.fastjson.JSONObject parseObject5 = JSON.parseObject(str2);
                this.mJsBridgeAction.w(parseObject5.getString("bizName"), parseObject5.getJSONObject("task"), generateCallBack(wVCallBackContext));
                return true;
            } else if (!"setClickableArea".equals(str)) {
                return false;
            } else {
                com.alibaba.fastjson.JSONObject parseObject6 = JSON.parseObject(str2);
                this.mJsBridgeAction.C(parseObject6.getString("enable"), parseObject6.getString("width"), parseObject6.getString("height"), parseObject6.getString("layout"), parseObject6.getString("left"), parseObject6.getString("right"), parseObject6.getString("top"), parseObject6.getString("bottom"), generateCallBack(wVCallBackContext));
                return true;
            }
        } catch (Throwable th13) {
            wdm.h("PopLayerWVPlugin.error", th13);
            return false;
        }
    }
}

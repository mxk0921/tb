package com.taobao.android.editionswitcher.api;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.LocalizationManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.d;
import com.taobao.android.editionswitcher.request.HomeLocationRet;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.f4w;
import tb.t2o;
import tb.tza;
import tb.x4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f7610a = "I18N_BOARDING_COMPENSATION";
    public static final String b = "I18N_BOARDING_API_COMPENSATION";
    public static final long c = 300000;
    public static final String d = "Page_LocalBoarding";
    public static long e = 0;
    public static Handler f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f7612a;
        public final /* synthetic */ long b;
        public final /* synthetic */ x4d c;

        public a(AtomicBoolean atomicBoolean, long j, x4d x4dVar) {
            this.f7612a = atomicBoolean;
            this.b = j;
            this.c = x4dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f7612a.getAndSet(false)) {
                TLog.loge("EditionSwitcher", "i18nboarding request force timeout ");
                String str = EditionApi.d;
                TBS.Ext.commitEvent(str, 2101, "investigate", "TimeOut-" + this.b + "ms");
                this.c.a(false);
            }
        }
    }

    static {
        t2o.a(456130595);
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return e;
    }

    public static /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("172e410e", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ Handler c(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3958829c", new Object[]{handler});
        }
        f = handler;
        return handler;
    }

    public void d(x4d x4dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7446a3", new Object[]{this, x4dVar, new Long(j)});
        } else {
            e(x4dVar, j, "");
        }
    }

    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b616bb", new Object[]{str, str2, str3});
            return;
        }
        try {
            TLog.loge("EditionSwitcher", "reportSwitchEdition request");
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.tmw.site.change.notify");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currRegion", (Object) str);
            jSONObject.put("originRegion", (Object) str2);
            jSONObject.put("currLang", (Object) Localization.h().getLanguage());
            jSONObject.put("originLang", (Object) Localization.h().getLanguage());
            jSONObject.put(ParamsConstants.Key.PARAM_SCENE_CODE, (Object) str3);
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).reqMethod(MethodEnum.POST).startRequest(BaseOutDo.class);
        } catch (Exception unused) {
        }
    }

    public void f(Map<String, String> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0a1f8", new Object[]{this, map, iRemoteBaseListener});
        } else if (iRemoteBaseListener != null) {
            try {
                TLog.loge("EditionSwitcher", "i18nboarding request checkBlack");
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.taobao.wireless.home.location");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedSession(false);
                mtopRequest.setNeedEcode(false);
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (String str : map.keySet()) {
                        jSONObject.put(str, (Object) map.get(str));
                    }
                }
                mtopRequest.setData(jSONObject.toJSONString());
                MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) iRemoteBaseListener).useWua().reqMethod(MethodEnum.POST).startRequest(HomeLocationRet.class);
            } catch (Exception unused) {
            }
        }
    }

    public void e(final x4d x4dVar, final long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6702dad", new Object[]{this, x4dVar, new Long(j), str});
        } else if (x4dVar != null) {
            try {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                MtopRequest mtopRequest = new MtopRequest();
                mtopRequest.setApiName("mtop.ovs.setting.country.lang.get");
                mtopRequest.setVersion("1.0");
                mtopRequest.setNeedSession(false);
                mtopRequest.setNeedEcode(false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scenario", (Object) "onboarding");
                Locale d2 = LocalizationManager.INSTANCE.d();
                jSONObject.put("system-lang", (Object) (d2.getLanguage() + "-" + d2.getCountry()));
                jSONObject.put("localBoardingSite", (Object) str);
                mtopRequest.setData(jSONObject.toJSONString());
                HandlerThread handlerThread = new HandlerThread("I18nBoardingReq");
                handlerThread.start();
                f = new Handler(handlerThread.getLooper());
                MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.editionswitcher.api.EditionApi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* compiled from: Taobao */
                    /* renamed from: com.taobao.android.editionswitcher.api.EditionApi$1$a */
                    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                    public class a implements Runnable {
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ boolean f7611a;

                        public a(boolean z) {
                            this.f7611a = z;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                x4dVar.a(this.f7611a);
                            }
                        }
                    }

                    private void callback(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("53320208", new Object[]{this, new Boolean(z)});
                        } else {
                            new Handler(Looper.getMainLooper()).post(new a(z));
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        TLog.loge("EditionSwitcher", "i18nboarding request onSystemError" + mtopResponse.getRetMsg());
                        TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onError", mtopResponse.getRetMsg(), "spm=a2141.29233349");
                        if (atomicBoolean.getAndSet(false)) {
                            callback(false);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        if (atomicBoolean.getAndSet(false)) {
                            TLog.loge("EditionSwitcher", "i18nboarding request onSystemError" + mtopResponse.getRetMsg());
                            callback(false);
                        } else {
                            TLog.loge("EditionSwitcher", "i18nboarding timeout and onSystemError");
                        }
                        String str2 = EditionApi.d;
                        TBS.Ext.commitEvent(str2, 2101, "boardingRequestFail", "", "", "spm=a2141.29233349,enableI18n=true");
                        TBS.Ext.commitEvent(str2, 2101, "investigate", "onError", mtopResponse.getRetMsg(), "spm=a2141.29233349");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        String str2;
                        LocaleModel.SiteLangModel siteLangModel;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        boolean andSet = atomicBoolean.getAndSet(false);
                        String str3 = EditionApi.d;
                        TBS.Ext.commitEvent(str3, 2101, "investigate", "onSuccess", (System.currentTimeMillis() - EditionApi.a()) + "");
                        try {
                            StringBuilder sb = new StringBuilder("i18nboarding requst time: ");
                            str2 = "noMark";
                            try {
                                sb.append(System.currentTimeMillis() - EditionApi.a());
                                sb.append(" MTOP total Time: ");
                                sb.append(mtopResponse.getMtopStat().totalTime);
                                TLog.loge("EditionSwitcher", sb.toString());
                                TBS.Ext.commitEvent(str3, 2101, "investigate", "onSuccess-Mtop", Long.valueOf(mtopResponse.getMtopStat().totalTime));
                                if (EditionApi.b() != null) {
                                    EditionApi.b().getLooper().quitSafely();
                                    EditionApi.c(null);
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            str2 = "noMark";
                        }
                        try {
                            LocaleModel localeModel = (LocaleModel) JSON.parseObject(mtopResponse.getDataJsonObject().toString(), LocaleModel.class);
                            if (!(localeModel == null || (siteLangModel = localeModel.currentCountryInfo) == null)) {
                                d.h = localeModel;
                                boolean z = !siteLangModel.i18nBlackIp && siteLangModel.i18nEnable;
                                TLog.loge("EditionSwitcher", "i18nboarding request i18nBlackIp : " + siteLangModel.i18nBlackIp + " ,i18nEnable :" + siteLangModel.i18nEnable);
                                if (andSet) {
                                    TLog.loge("EditionSwitcher", "i18nboarding request success should enter boarding : " + z);
                                    TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onSuccess-In" + j, z + "", "spm=a2141.29233349");
                                    callback(z);
                                    return;
                                } else if (z) {
                                    TLog.loge("EditionSwitcher", "i18nboarding request success and timeout need mark");
                                    tza.f(EditionApi.f7610a, String.valueOf(System.currentTimeMillis()));
                                    String d3 = tza.d(EditionApi.b, str2);
                                    TLog.loge("EditionSwitcher", "i18nboarding request finish read I18N_BOARDING_API_COMPENSATION : " + d3);
                                    if (!str2.equals(d3)) {
                                        TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "showI18nGuildDialog-2", z + "");
                                        com.taobao.android.editionswitcher.boarding.a.e(d3);
                                    }
                                    TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onSuccess-Out" + j, z + "");
                                    return;
                                } else {
                                    TLog.loge("EditionSwitcher", "i18nboarding request success and timeout need not mark");
                                    TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onSuccess-Out" + j, z + "");
                                    return;
                                }
                            }
                            TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onSuccess-datacheck", f4w.LOAD_DATA_NULL);
                            if (andSet) {
                                TLog.loge("EditionSwitcher", "i18nboarding request success data is null");
                                callback(false);
                            }
                        } catch (Exception e2) {
                            TLog.loge("EditionSwitcher", "i18nboarding request success but parse error : " + e2);
                            TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "onSuccess-exception", "exception", e2.toString());
                            if (andSet) {
                                callback(false);
                            }
                        }
                    }
                }).handler(f).startRequest(BaseOutDo.class);
                TLog.loge("EditionSwitcher", "i18nboarding start request...");
                TBS.Ext.commitEvent(d, 2101, "investigate", "Request");
                e = System.currentTimeMillis();
                new Handler().postDelayed(new a(atomicBoolean, j, x4dVar), j);
            } catch (Exception e2) {
                TLog.loge("EditionSwitcher", "i18nboarding request Exception : " + e2);
                TBS.Ext.commitEvent(d, 2101, "investigate", "CheckBoardingException");
                x4dVar.a(false);
            }
        }
    }
}

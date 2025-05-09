package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vqx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HUMMER_FOUNDATION_ADD = "add";
    public static final String HUMMER_FOUNDATION_DELETE = "delete";
    public static final String HUMMER_FOUNDATION_GET_INTPUT_PARAMS = "getInputParams";
    public static final String HUMMER_FOUNDATION_GET_LANGUAGE = "getLanguage";
    public static final String HUMMER_FOUNDATION_GET_OUTPUT_PARAMS = "getOutputParams";
    public static final String HUMMER_FOUNDATION_HIDE_LOADING_DIALOG = "hideLoadingDialog";
    public static final String HUMMER_FOUNDATION_LOGGING = "logging";
    public static final String HUMMER_FOUNDATION_LOG_MESS = "logMessage";
    public static final String HUMMER_FOUNDATION_LOG_SEED_ID = "logSeedID";
    public static final String HUMMER_FOUNDATION_MESSAGE = "message";
    public static final String HUMMER_FOUNDATION_NEED_RPC = "needRpc";
    public static final String HUMMER_FOUNDATION_NEGATIVE = "negative";
    public static final String HUMMER_FOUNDATION_POSITIVE = "positive";
    public static final String HUMMER_FOUNDATION_QUERY = "query";
    public static final String HUMMER_FOUNDATION_SEND_RPC = "sendRpc";
    public static final String HUMMER_FOUNDATION_SHOW_ALERT = "showAlert";
    public static final String HUMMER_FOUNDATION_SHOW_LOADING_DIALOG = "showLoadingDialog";
    public static final String HUMMER_FOUNDATION_TITLE = "title";
    public static final String TAG = "ZolozEkycH5Handler";
    public static final String ZIM_IDENTIFY_ACTION = "action";
    public static final String ZIM_IDENTIFY_BIZCONFIG = "bizParam";
    public static final String ZIM_IDENTIFY_EKYCID = "ekycId";
    public static final String ZIM_IDENTIFY_EKYCONFIG = "ekycConfig";
    public static final String ZIM_IDENTIFY_FINISH_WEB_TASK = "finishWebTask";
    public static final String ZIM_IDENTIFY_NEXTINDEX = "nextIndex";
    public static final String ZIM_IDENTIFY_START_EKYC = "startEkyc";
    public static final String ZIM_IDENTIFY_STATUS = "status";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements y1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ubc f30189a;

        public a(vqx vqxVar, ubc ubcVar) {
            this.f30189a = ubcVar;
        }

        @Override // tb.y1c
        public void a(ga8 ga8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d76c595", new Object[]{this, ga8Var});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) Integer.valueOf(ga8Var.f19831a));
            jSONObject.put("subCode", (Object) ga8Var.b);
            jSONObject.put("result", (Object) ga8Var.c);
            BioLog.i(vqx.TAG, " Ekyc response " + jSONObject.toString());
            this.f30189a.a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements bfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ubc f30191a;

        public c(vqx vqxVar, ubc ubcVar) {
            this.f30191a = ubcVar;
        }

        @Override // tb.bfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cc3f9bb", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(vqx.HUMMER_FOUNDATION_POSITIVE, (Object) Boolean.FALSE);
            this.f30191a.a(jSONObject);
        }

        @Override // tb.bfb
        public void onPositive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82ab057f", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(vqx.HUMMER_FOUNDATION_POSITIVE, (Object) Boolean.TRUE);
            this.f30191a.a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(vqx vqxVar) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            }
        }
    }

    static {
        t2o.a(245366859);
    }

    public final Locale a(Context context) {
        LocaleList locales;
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("367bf429", new Object[]{this, context});
        }
        if (Build.VERSION.SDK_INT < 24) {
            return context.getResources().getConfiguration().locale;
        }
        locales = context.getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        return locale;
    }

    public final void c(Context context, String str) {
        Locale locale;
        LocaleList locales;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2fdc8", new Object[]{this, context, str});
        } else if (str != null) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locales = context.getResources().getConfiguration().getLocales();
                        locale = locales.get(0);
                    } else {
                        locale = context.getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                configuration.setLocale(locale);
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            } catch (Exception e) {
                BioLog.e(e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements bld {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ubc f30190a;

        public b(vqx vqxVar, ubc ubcVar) {
            this.f30190a = ubcVar;
        }

        @Override // tb.bld
        public void a(sho shoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
                return;
            }
            f9b n = ea8.o().n();
            if (shoVar == null || "network_exception".equals(shoVar.b)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", (Object) Boolean.FALSE);
                this.f30190a.a(jSONObject);
                return;
            }
            n.m(shoVar.f28058a.zStack);
            FactorNextResponse factorNextResponse = shoVar.f28058a;
            String str = factorNextResponse.versionToken;
            if (!StringUtil.isNullorEmpty(str)) {
                n.a("versionToken", "context", str);
            }
            for (int i = 0; i < factorNextResponse.response.size(); i++) {
                for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i).outParams.entrySet()) {
                    n.a(entry.getKey(), "serverResponse", entry.getValue());
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", (Object) Boolean.TRUE);
            jSONObject2.put("nextResponse", (Object) factorNextResponse);
            BioLog.i("ZolozEkycH5Handler sendBridgeResult " + jSONObject2.toString());
            this.f30190a.a(jSONObject2);
        }
    }

    public void b(JSONObject jSONObject, Context context, ubc ubcVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf39731", new Object[]{this, jSONObject, context, ubcVar});
        } else if (jSONObject != null && context != null) {
            BioLog.i(TAG, " jsapi" + jSONObject.toJSONString());
            String string = jSONObject.getString("action");
            if (!StringUtil.isNullorEmpty(string)) {
                ea8 o = ea8.o();
                o.e(context);
                if (ZIM_IDENTIFY_START_EKYC.equals(string)) {
                    String string2 = jSONObject.getString(ZIM_IDENTIFY_EKYCID);
                    fa8 fa8Var = new fa8();
                    fa8Var.f19139a = string2;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
                    Map hashMap = new HashMap();
                    if (jSONObject2 == null || jSONObject2.size() <= 0) {
                        String string3 = jSONObject.getString("bizParam");
                        if (!StringUtil.isNullorEmpty(string3)) {
                            hashMap = (Map) JSON.parseObject(string3, Map.class);
                        }
                    } else {
                        hashMap = (Map) JSON.toJavaObject(jSONObject2, Map.class);
                    }
                    ((HashMap) fa8Var.c).putAll(hashMap);
                    fa8Var.d = jSONObject.getString(ZIM_IDENTIFY_EKYCONFIG);
                    o.r(fa8Var, new a(this, ubcVar));
                } else if (ZIM_IDENTIFY_FINISH_WEB_TASK.equals(string)) {
                    if (jSONObject.getInteger(ZIM_IDENTIFY_NEXTINDEX) != null) {
                        i = jSONObject.getInteger(ZIM_IDENTIFY_NEXTINDEX).intValue();
                    }
                    ea8.o().l(i, jSONObject.getString("status"));
                    ubcVar.a(new JSONObject());
                } else if (HUMMER_FOUNDATION_LOGGING.equals(string)) {
                    jqn.a().c(jSONObject.getString(HUMMER_FOUNDATION_LOG_SEED_ID), (Map) JSON.toJavaObject(jSONObject.getJSONObject(HUMMER_FOUNDATION_LOG_MESS), Map.class));
                } else if (HUMMER_FOUNDATION_SEND_RPC.equals(string)) {
                    String string4 = jSONObject.getString("type");
                    ea8.o().n().t();
                    jho.d().h(new b(this, ubcVar), jho.d().c(ea8.o().n(), ea8.o().n().h(string4), false));
                } else if (HUMMER_FOUNDATION_SHOW_ALERT.equals(string)) {
                    vk0.e().a(jSONObject.getString("title"), jSONObject.getString("message"), jSONObject.getString(HUMMER_FOUNDATION_POSITIVE), jSONObject.getString(HUMMER_FOUNDATION_NEGATIVE), new c(this, ubcVar));
                } else if (HUMMER_FOUNDATION_SHOW_LOADING_DIALOG.equals(string)) {
                    vk0.e().h("", false, new d(this), true);
                } else if (HUMMER_FOUNDATION_HIDE_LOADING_DIALOG.equals(string)) {
                    vk0.e().d();
                } else if ("add".equals(string)) {
                    ea8.o().n().a(jSONObject.getString("key"), jSONObject.getString("pipeType"), jSONObject.getObject("value", Object.class));
                    ubcVar.a(new JSONObject());
                } else if ("query".equals(string)) {
                    String string5 = jSONObject.getString("key");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", ea8.o().n().o(string5));
                    ubcVar.a(jSONObject3);
                } else if ("delete".equals(string)) {
                    ea8.o().n().b(jSONObject.getString("key"));
                    ubcVar.a(new JSONObject());
                } else if (HUMMER_FOUNDATION_NEED_RPC.equals(string)) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(HUMMER_FOUNDATION_NEED_RPC, (Object) Boolean.valueOf(ea8.o().n().l(jSONObject.getString("type"))));
                    ubcVar.a(jSONObject4);
                } else if (HUMMER_FOUNDATION_GET_INTPUT_PARAMS.equals(string)) {
                    JSONObject jSONObject5 = new JSONObject();
                    Map<String, Object> f = ea8.o().n().f();
                    if (f != null) {
                        jSONObject5.putAll(f);
                    }
                    ubcVar.a(jSONObject5);
                } else if (HUMMER_FOUNDATION_GET_OUTPUT_PARAMS.equals(string)) {
                    JSONObject jSONObject6 = new JSONObject();
                    JSONObject i2 = ea8.o().n().i(jSONObject.getString("type"));
                    if (i2 != null) {
                        jSONObject6 = i2;
                    }
                    ubcVar.a(jSONObject6);
                } else if (HUMMER_FOUNDATION_GET_LANGUAGE.equals(string)) {
                    String str = (String) ea8.o().n().o("hummerLocale");
                    if (!StringUtil.isNullorEmpty(str)) {
                        c(context, str);
                    } else {
                        Locale a2 = a(context);
                        str = a2.getLanguage() + "-" + a2.getCountry();
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put(LoggingSPCache.STORAGE_LANGUAGE, (Object) str);
                    ubcVar.a(jSONObject7);
                }
            }
        }
    }
}

package com.taobao.android.msoa;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.taobao.windvane.connect.HttpConnector;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.msoa.ServerSKUUtils;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b8b;
import tb.bzl;
import tb.kpw;
import tb.nsw;
import tb.rrh;
import tb.urh;
import tb.v7b;
import tb.vrh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MSOAWVService extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "MSOAWVService";
    public static final String SP_NAME = "msoa_debug_data";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends AsyncTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8999a;
        public final /* synthetic */ WVCallBackContext b;

        public a(String str, WVCallBackContext wVCallBackContext) {
            this.f8999a = str;
            this.b = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/msoa/MSOAWVService$1");
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            b8b d = new HttpConnector().d(new v7b(this.f8999a));
            if (d == null || d.d() != 200) {
                return null;
            }
            try {
                String str = new String(d.b(), "utf-8");
                PreferenceManager.getDefaultSharedPreferences(MSOAWVService.access$000(MSOAWVService.this)).edit().putString(MSOAWVService.SP_NAME, str).apply();
                return str;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            WVCallBackContext wVCallBackContext;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
                return;
            }
            super.onPostExecute(obj);
            if (obj != null && (wVCallBackContext = this.b) != null) {
                wVCallBackContext.success(obj.toString());
                bzl.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9000a;

        public b(WVCallBackContext wVCallBackContext) {
            this.f9000a = wVCallBackContext;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", str);
                jSONObject.put("errorMsg", str2);
                jSONObject.put("isMSOAFail", z);
                MSOAWVService.access$100(MSOAWVService.this, jSONObject, map);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.h(jSONObject);
            this.f9000a.error(nswVar);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            String jSONString = new com.alibaba.fastjson.JSONObject(map).toJSONString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", jSONString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.h(jSONObject);
            this.f9000a.success(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9001a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f9001a = wVCallBackContext;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", str);
                jSONObject.put("errorMsg", str2);
                jSONObject.put("isMSOAFail", z);
                MSOAWVService.access$100(MSOAWVService.this, jSONObject, map);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nsw nswVar = new nsw("HY_FAILED");
            nswVar.h(jSONObject);
            this.f9001a.error(nswVar);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            String jSONString = new com.alibaba.fastjson.JSONObject(map).toJSONString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", jSONString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nsw nswVar = new nsw("HY_SUCCESS");
            nswVar.h(jSONObject);
            this.f9001a.success(nswVar);
        }
    }

    public static /* synthetic */ Context access$000(MSOAWVService mSOAWVService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75aef648", new Object[]{mSOAWVService});
        }
        return mSOAWVService.mContext;
    }

    public static /* synthetic */ void access$100(MSOAWVService mSOAWVService, JSONObject jSONObject, Map map) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e364bf76", new Object[]{mSOAWVService, jSONObject, map});
        } else {
            mSOAWVService.setUserInfoToResultJson(jSONObject, map);
        }
    }

    public static /* synthetic */ Object ipc$super(MSOAWVService mSOAWVService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/msoa/MSOAWVService");
    }

    private void setUserInfoToResultJson(JSONObject jSONObject, Map<String, Object> map) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f114c9", new Object[]{this, jSONObject, map});
        } else if (map instanceof com.alibaba.fastjson.JSONObject) {
            try {
                com.alibaba.fastjson.JSONObject jSONObject2 = ((com.alibaba.fastjson.JSONObject) map).getJSONObject(Constants.KEY_USER_ID);
                if (jSONObject2 != null && jSONObject2.getBooleanValue("MSOAErrorWVUserInfo")) {
                    jSONObject.put(Constants.KEY_USER_ID, new JSONObject(jSONObject2));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        HashMap hashMap;
        HashMap hashMap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("debugSwitch".equals(str)) {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject != null) {
                String string = parseObject.getString("configUrl");
                if (!TextUtils.isEmpty(string)) {
                    new a(string, wVCallBackContext).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                }
            }
            return true;
        } else if ("exitDebugSwitch".equals(str)) {
            PreferenceManager.getDefaultSharedPreferences(this.mContext).edit().remove(SP_NAME).apply();
            bzl.b();
            return true;
        } else if ("requestService".equals(str)) {
            com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(str2);
            if (parseObject2 != null) {
                String string2 = parseObject2.getString("serviceId");
                String string3 = parseObject2.getString("version");
                String string4 = parseObject2.getString("sceneName");
                com.alibaba.fastjson.JSONObject parseObject3 = JSON.parseObject(parseObject2.getString("params"));
                if (parseObject3 != null) {
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry<String, Object> entry : parseObject3.entrySet()) {
                        hashMap3.put(entry.getKey(), entry.getValue());
                    }
                    if (!hashMap3.containsKey("context")) {
                        hashMap3.put("context", this.mContext);
                    }
                    hashMap2 = hashMap3;
                } else {
                    hashMap2 = null;
                }
                ServerSKUUtils.a e = ServerSKUUtils.e(string2, string3, hashMap2);
                String str3 = e.f9004a;
                Map<String, Object> a2 = ServerSKUUtils.a(e.b, parseObject2);
                ServerSKUUtils.b(string2, a2, this.mWebView);
                rrh.e().n(new urh(string2, str3, "msoa.taobao.privilege.windvane", string4, a2, MSOAServiceDefinition.Platform.WINDVANE.value()), new b(wVCallBackContext));
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("errorCode", "msoa_error_invalid_param");
                hashMap4.put("errorMsg", "invalid parameter");
                hashMap4.put("isMSOAFail", Boolean.TRUE);
                wVCallBackContext.error(hashMap4.toString());
            }
            return true;
        } else if (!"requestServiceV2".equals(str)) {
            return false;
        } else {
            com.alibaba.fastjson.JSONObject parseObject4 = JSON.parseObject(str2);
            if (parseObject4 != null) {
                String string5 = parseObject4.getString("serviceId");
                String string6 = parseObject4.getString("version");
                String string7 = parseObject4.getString("invokePageUrl");
                String string8 = parseObject4.getString("sceneName");
                com.alibaba.fastjson.JSONObject parseObject5 = JSON.parseObject(parseObject4.getString("params"));
                if (parseObject5 != null) {
                    HashMap hashMap5 = new HashMap();
                    for (Map.Entry<String, Object> entry2 : parseObject5.entrySet()) {
                        hashMap5.put(entry2.getKey(), entry2.getValue());
                    }
                    if (!hashMap5.containsKey("context")) {
                        hashMap5.put("context", this.mContext);
                    }
                    hashMap = hashMap5;
                } else {
                    hashMap = null;
                }
                if (TextUtils.isEmpty(string5) || TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string8)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errorCode", "msoa_error_invalid_param");
                        jSONObject.put("errorMsg", "params serviceId version invokePageUrl sceneName all can not be null or empty");
                        jSONObject.put("isMSOAFail", false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    nsw nswVar = new nsw("HY_FAILED");
                    nswVar.h(jSONObject);
                    wVCallBackContext.error(nswVar);
                    return true;
                }
                ServerSKUUtils.a e3 = ServerSKUUtils.e(string5, string6, hashMap);
                String str4 = e3.f9004a;
                Map<String, Object> a3 = ServerSKUUtils.a(e3.b, parseObject4);
                ServerSKUUtils.b(string5, a3, this.mWebView);
                rrh.e().o(new vrh("msoa.taobao.privilege.windvane", string5, str4, string7, string8, a3, MSOAServiceDefinition.Platform.WINDVANE.value()), new c(wVCallBackContext));
            } else {
                HashMap hashMap6 = new HashMap();
                hashMap6.put("errorCode", "msoa_error_invalid_param");
                hashMap6.put("errorMsg", "invalid parameter");
                hashMap6.put("isMSOAFail", Boolean.TRUE);
                wVCallBackContext.error(hashMap6.toString());
            }
            return true;
        }
    }
}

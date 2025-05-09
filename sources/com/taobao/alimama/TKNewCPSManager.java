package com.taobao.alimama;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.utils.Global;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.t2o;
import tb.wll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TKNewCPSManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long[] f6175a = {-2, -2};
    public final String[] b = new String[2];
    public final String[] c = {"alimama_tksid", "alimama_tksid2"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TKNewCPSManager f6176a = new TKNewCPSManager();

        static {
            t2o.a(1017118727);
        }

        public static /* synthetic */ TKNewCPSManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TKNewCPSManager) ipChange.ipc$dispatch("cd911f5a", new Object[0]);
            }
            return f6176a;
        }
    }

    static {
        t2o.a(1017118725);
    }

    public static /* synthetic */ String[] a(TKNewCPSManager tKNewCPSManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("51e745a2", new Object[]{tKNewCPSManager});
        }
        return tKNewCPSManager.b;
    }

    public static /* synthetic */ String[] b(TKNewCPSManager tKNewCPSManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c5ce623", new Object[]{tKNewCPSManager});
        }
        return tKNewCPSManager.c;
    }

    public static TKNewCPSManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TKNewCPSManager) ipChange.ipc$dispatch("af5c4fdf", new Object[0]);
        }
        return a.a();
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f494786", new Object[]{this, str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14615e77", new Object[]{this, new Integer(i)});
        }
        long j = this.f6175a[i];
        if (j == -2) {
            j = h(SharedPreferencesUtils.getString(this.c[i], ""));
        }
        if (j == -2) {
            return "";
        }
        if (j == 0) {
            return this.b[i];
        }
        if (j == -1) {
            this.b[i] = SharedPreferencesUtils.getString(this.c[i], "");
            return this.b[i];
        }
        if (System.currentTimeMillis() / 1000 < j) {
            this.b[i] = SharedPreferencesUtils.getString(this.c[i], "");
        } else {
            SharedPreferencesUtils.putString(this.c[i], "");
            this.b[i] = "";
        }
        return this.b[i];
    }

    public final long h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62fdb8e4", new Object[]{this, str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -2L;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return -2L;
            }
            return Long.parseLong(split[1]);
        } catch (Throwable unused) {
            return -2L;
        }
    }

    public final void i(final String str, final JSONObject jSONObject, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fb428a", new Object[]{this, str, jSONObject, str2});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            mtopRequest.setData(jSONObject.toJSONString());
            Application application = Global.getApplication();
            if (application != null) {
                MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, application.getApplicationContext()), mtopRequest);
                build.setConnectionTimeoutMilliSecond(3000);
                build.setSocketTimeoutMilliSecond(5000);
                build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.alimama.TKNewCPSManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    private void reportResult(boolean z, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8a6d626", new Object[]{this, new Boolean(z), str3});
                            return;
                        }
                        try {
                            jSONObject.put("isSuccess", (Object) Boolean.valueOf(z));
                            if (!z) {
                                jSONObject.put("url", (Object) str3);
                            }
                            HashMap hashMap = new HashMap();
                            for (String str4 : jSONObject.keySet()) {
                                hashMap.put(str4, String.valueOf(jSONObject.get(str4)));
                            }
                            if ("mtop.alimama.union.trace".equals(str)) {
                                UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Upload_TkSid", "", "", hashMap);
                            } else if ("mtop.alimama.union.trace2".equals(str)) {
                                UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Upload_TkSid2", "", "", hashMap);
                            }
                        } catch (Throwable th) {
                            new StringBuilder("reportResult: ").append(th);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (mtopResponse != null) {
                            StringBuilder sb = new StringBuilder("onError: i ");
                            sb.append(i);
                            sb.append(" mtopResponse ");
                            sb.append(mtopResponse.getDataJsonObject());
                            reportResult(false, str2);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else if (mtopResponse != null) {
                            StringBuilder sb = new StringBuilder("onSystemError: i ");
                            sb.append(i);
                            sb.append(" o ");
                            sb.append(obj);
                            sb.append("mtopResponse");
                            sb.append(mtopResponse.getDataJsonObject());
                            reportResult(false, str2);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        char c = 0;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        } else if (mtopResponse != null) {
                            try {
                                if ("true".equals(mtopResponse.getDataJsonObject().getString("clearSession"))) {
                                    if (!"mtop.alimama.union.trace".equals(str)) {
                                        c = "mtop.alimama.union.trace2".equals(str) ? (char) 1 : (char) 65535;
                                    }
                                    if (c != 65535) {
                                        TKNewCPSManager.a(TKNewCPSManager.this)[c] = "";
                                        SharedPreferencesUtils.putString(TKNewCPSManager.b(TKNewCPSManager.this)[c], "");
                                    }
                                }
                                reportResult(true, str2);
                            } catch (JSONException e) {
                                e.toString();
                            }
                        }
                    }
                });
                build.startRequest();
            }
        }
    }

    public String j(String str, String str2, String str3, boolean z, String str4) {
        String str5;
        String str6;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb1e734d", new Object[]{this, str, str2, str3, new Boolean(z), str4});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
                str7 = str;
                str6 = str7;
                str5 = str6;
            } else {
                Uri parse = Uri.parse(str);
                str6 = c(parse.getQueryParameter("tkSid"));
                str5 = c(parse.getQueryParameter("tkSid2"));
                str7 = c(parse.getQueryParameter(wll.ALI_TRACK_ID));
            }
            String c = c(f("tkSid"));
            String c2 = c(f("tkSid2"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemid", (Object) str3);
            jSONObject.put("sellerid", (Object) str2);
            jSONObject.put("ismall", (Object) Integer.valueOf(z ? 1 : 0));
            jSONObject.put("alitrackid", (Object) str7);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("ext", (Object) str4);
            }
            if (!TextUtils.isEmpty(c) || !TextUtils.isEmpty(str6)) {
                jSONObject.put("tkSidInUrl", (Object) str6);
                jSONObject.put("tkSidInSDK", (Object) c);
                i("mtop.alimama.union.trace", jSONObject, str);
            }
            if (!TextUtils.isEmpty(c2) || !TextUtils.isEmpty(str5)) {
                jSONObject.put("tkSid2InUrl", (Object) str5);
                jSONObject.put("tkSid2InSDK", (Object) c2);
                i("mtop.alimama.union.trace2", jSONObject, str);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9eaee46", new Object[]{this, str});
        }
        if ("tkSid".equals(str)) {
            return d(0);
        }
        if ("tkSid2".equals(str)) {
            return d(1);
        }
        return "";
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888dee0", new Object[]{this, str});
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            String c = c(parse.getQueryParameter("tkSid"));
            String c2 = c(parse.getQueryParameter("tkSid2"));
            String c3 = c(parse.getQueryParameter(wll.ALI_TRACK_ID));
            if (!TextUtils.isEmpty(c)) {
                this.b[0] = c;
                this.f6175a[0] = h(c);
                if (this.f6175a[0] != 0) {
                    SharedPreferencesUtils.putString(this.c[0], c);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("alitrackid", c3);
                hashMap.put("tkSidInSDK", c);
                UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Handle_TkSid", "", "", hashMap);
            }
            if (!TextUtils.isEmpty(c2)) {
                this.b[1] = c2;
                this.f6175a[1] = h(c2);
                if (this.f6175a[1] != 0) {
                    SharedPreferencesUtils.putString(this.c[1], c2);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("alitrackid", c3);
                hashMap2.put("tkSid2InSDK", c2);
                UserTrackLogs.commitJavaUTEvent(UserTrackLogs.UT_PAGE_NAME, ConnectionResult.SERVICE_UPDATING, "Munion_Url_Handle_TkSid2", "", "", hashMap2);
            }
        } catch (Throwable th) {
            new StringBuilder("handleTkSid: meet error ").append(th);
        }
    }
}

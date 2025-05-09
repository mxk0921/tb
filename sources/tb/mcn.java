package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(649068554);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c138de5", new Object[0]);
        } else {
            ti3.b("user close");
        }
    }

    public static void c(String str, String str2, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c80cde7", new Object[]{str, str2, rVLRemoteConnectCallback});
        } else if (str2 != null && str2.length() != 0) {
            ti3.e(str, str2, true, rVLRemoteConnectCallback);
        } else if (rVLRemoteConnectCallback != null) {
            rVLRemoteConnectCallback.finish(false, "Invalid sessionId");
        }
    }

    public static void d(String str, String str2, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f68e68f", new Object[]{str, str2, rVLRemoteConnectCallback});
        } else if (str2 != null && str2.length() != 0) {
            ti3.e(str, str2, false, rVLRemoteConnectCallback);
        } else if (rVLRemoteConnectCallback != null) {
            rVLRemoteConnectCallback.finish(false, "Invalid connectId");
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c228169", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                RVLLevel parse = RVLLevel.parse(jSONObject.opt(m09.TASK_TYPE_LEVEL));
                if (parse.value <= lcn.e().value) {
                    String optString = jSONObject.optString("event");
                    if (!TextUtils.isEmpty(optString)) {
                        kcn kcnVar = new kcn(parse, str, System.currentTimeMillis());
                        kcnVar.j = true;
                        kcnVar.b(optString);
                        kcnVar.d(jSONObject.optString("id"));
                        String optString2 = jSONObject.optString("parentId");
                        if (TextUtils.isEmpty(optString2)) {
                            kcnVar.c(str2);
                        } else {
                            kcnVar.c(optString2);
                        }
                        if (kcnVar.e(jSONObject.opt("errorCode"))) {
                            String optString3 = jSONObject.optString("errorMsg");
                            if (!TextUtils.isEmpty(optString3)) {
                                kcnVar.g = optString3;
                            }
                        }
                        Object opt = jSONObject.opt("ext");
                        if (opt != null) {
                            JSONStringer jSONStringer = new JSONStringer();
                            try {
                                jSONStringer.array();
                                jSONStringer.value(opt);
                                jSONStringer.endArray();
                                String jSONStringer2 = jSONStringer.toString();
                                kcnVar.i = jSONStringer2.substring(1, jSONStringer2.length() - 1);
                            } catch (JSONException unused) {
                            }
                        }
                        lcn.h(kcnVar);
                    }
                }
            } catch (JSONException unused2) {
                kcn kcnVar2 = new kcn(RVLLevel.Info, str, System.currentTimeMillis());
                kcnVar2.i = str3;
                lcn.h(kcnVar2);
            }
        }
    }
}

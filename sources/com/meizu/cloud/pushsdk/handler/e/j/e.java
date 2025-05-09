package com.meizu.cloud.pushsdk.handler.e.j;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import org.json.JSONException;
import org.json.JSONObject;
import tb.gat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private int f5897a;
    private String b = String.valueOf(-1);
    private String c = "";
    private String d = "";
    private int e = -1;
    private String f = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5898a;
        public String b;
        String c;

        public a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.isNull("code")) {
                        a(jSONObject.getString("code"));
                    }
                    if (!jSONObject.isNull("message")) {
                        b(jSONObject.getString("message"));
                    }
                    if (!jSONObject.isNull("value")) {
                        c(jSONObject.getString("value"));
                    }
                } catch (JSONException e) {
                    DebugLogger.e("SecurityMessage", "covert json error " + e.getMessage());
                }
            }
        }

        public String a() {
            return this.c;
        }

        public void b(String str) {
            this.b = str;
        }

        public void c(String str) {
            this.c = str;
        }

        public String toString() {
            return "PublicKeyStatus{code='" + this.f5898a + "', message='" + this.b + "', publicKey='" + this.c + "'}";
        }

        public void a(String str) {
            this.f5898a = str;
        }
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.f5897a;
    }

    public String f() {
        return this.c;
    }

    public String toString() {
        return "SecurityMessage{timestamp=" + this.f5897a + ", taskId='" + this.b + "', title='" + this.c + "', content='" + this.d + "', clickType=" + this.e + ", params='" + this.f + "'}";
    }

    private static e a(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP)) {
                eVar.b(jSONObject.getInt(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP));
            }
            if (!jSONObject.isNull("ti")) {
                eVar.d(jSONObject.getString("ti"));
            }
            if (!jSONObject.isNull("tl")) {
                eVar.e(jSONObject.getString("tl"));
            }
            if (!jSONObject.isNull("cont")) {
                eVar.b(jSONObject.getString("cont"));
            }
            if (!jSONObject.isNull(gat.CT)) {
                eVar.a(jSONObject.getInt(gat.CT));
            }
            if (!jSONObject.isNull("pm")) {
                eVar.c(jSONObject.getString("pm"));
            }
        } catch (Exception e) {
            DebugLogger.e("SecurityMessage", "parse decryptSign error " + e.getMessage());
        }
        return eVar;
    }

    public void b(int i) {
        this.f5897a = i;
    }

    public void c(String str) {
        this.f = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(String str) {
        this.c = str;
    }

    /* JADX WARN: Finally extract failed */
    public static String a(MessageV3 messageV3) {
        JSONObject jSONObject;
        String notificationMessage = messageV3.getNotificationMessage();
        String str = null;
        try {
            try {
                if (!TextUtils.isEmpty(notificationMessage)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(notificationMessage).getJSONObject("data");
                        if (!jSONObject2.isNull("extra")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("extra");
                            if (!jSONObject3.isNull("se")) {
                                str = jSONObject3.getString("se");
                            }
                        }
                    } catch (JSONException e) {
                        DebugLogger.e("SecurityMessage", "parse notification message error " + e.getMessage());
                        if (TextUtils.isEmpty(null)) {
                            jSONObject = new JSONObject(notificationMessage);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        jSONObject = new JSONObject(notificationMessage);
                        jSONObject.getString("se");
                    }
                }
            } catch (Throwable th) {
                if (TextUtils.isEmpty(null)) {
                    try {
                        new JSONObject(notificationMessage).getString("se");
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        }
        DebugLogger.i("SecurityMessage", "encrypt message " + str);
        return str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void a(int i) {
        this.e = i;
    }

    public static boolean a(String str, MessageV3 messageV3) {
        String str2;
        e a2 = a(str);
        DebugLogger.e("SecurityMessage", "securityMessage " + a2);
        if (System.currentTimeMillis() / 1000 > a2.e()) {
            str2 = "message expire";
        } else if (!messageV3.getTitle().contains(a2.f())) {
            str2 = "invalid title";
        } else if (!messageV3.getContent().contains(a2.b())) {
            str2 = "invalid content";
        } else if (!String.valueOf(-1).equals(a2.d()) && !a2.d().equals(messageV3.getTaskId())) {
            str2 = "invalid taskId";
        } else if (a2.a() != -1) {
            int a3 = a2.a();
            if (a3 == 1) {
                if (!messageV3.getActivity().contains(a2.c())) {
                    str2 = "invalid click activity";
                }
                return true;
            } else if (a3 != 2) {
                if (a3 == 3 && !MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString().contains(a2.c())) {
                    str2 = "invalid self define";
                }
                return true;
            } else {
                if (!messageV3.getWebUrl().contains(a2.c())) {
                    str2 = "invalid web url";
                }
                return true;
            }
        } else {
            str2 = "invalid click type";
        }
        DebugLogger.e("SecurityMessage", str2);
        return false;
    }
}

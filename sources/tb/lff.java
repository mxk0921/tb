package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(758120566);
        }

        public a() {
        }

        @JvmStatic
        public final long a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d7069465", new Object[]{this, intent})).longValue();
            }
            if (intent == null) {
                return System.currentTimeMillis();
            }
            long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
            long longExtra2 = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
            if (longExtra > 0) {
                return longExtra;
            }
            if (longExtra2 > 0) {
                return longExtra2;
            }
            return System.currentTimeMillis();
        }

        @JvmStatic
        public final JSONObject b(Intent intent, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("2c23c07f", new Object[]{this, intent, str, jSONObject});
            }
            ckf.g(str, "key");
            return qrf.r(c(intent, str, null));
        }

        @JvmStatic
        public final String c(Intent intent, String str, String str2) {
            String queryParameter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c90d1b9b", new Object[]{this, intent, str, str2});
            }
            ckf.g(str, "key");
            if (intent == null) {
                return str2;
            }
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString(str) : null;
            if (string != null) {
                return string;
            }
            Uri data = intent.getData();
            return (data == null || (queryParameter = data.getQueryParameter(str)) == null) ? str2 : queryParameter;
        }

        @JvmStatic
        public final String d(Intent intent, List<String> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8d5786d4", new Object[]{this, intent, list, str});
            }
            ckf.g(list, "keys");
            if (intent == null) {
                return str;
            }
            for (String str2 : list) {
                String c = c(intent, str2, null);
                if (!(c == null || c.length() == 0)) {
                    return c;
                }
            }
            return str;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(758120565);
    }

    @JvmStatic
    public static final long a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7069465", new Object[]{intent})).longValue();
        }
        return Companion.a(intent);
    }

    @JvmStatic
    public static final JSONObject b(Intent intent, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2c23c07f", new Object[]{intent, str, jSONObject});
        }
        return Companion.b(intent, str, jSONObject);
    }

    @JvmStatic
    public static final String c(Intent intent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c90d1b9b", new Object[]{intent, str, str2});
        }
        return Companion.c(intent, str, str2);
    }

    @JvmStatic
    public static final String d(Intent intent, List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d5786d4", new Object[]{intent, list, str});
        }
        return Companion.d(intent, list, str);
    }
}

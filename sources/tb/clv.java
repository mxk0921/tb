package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class clv implements z6e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE64_KEY = "base64";
    public static final String i = clv.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f17144a;
    public String b;
    public String c;
    public Map<String, String> d;
    public boolean e;
    public String f;
    public String g;
    public String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final clv f17145a;

        static {
            t2o.a(396361814);
        }

        public b(String str, String str2) {
            clv clvVar = new clv();
            this.f17145a = clvVar;
            if (!TextUtils.isEmpty(str)) {
                clv.a(clvVar, str);
                clv.b(clvVar, str2);
                return;
            }
            throw new IllegalArgumentException("the bisType of the upload file task must not be null...");
        }

        public b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9fb9b0ab", new Object[]{this, str, str2});
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (clv.d(this.f17145a) == null) {
                    clv.e(this.f17145a, new HashMap());
                }
                clv.d(this.f17145a).put(str, str2);
            }
            return this;
        }

        public clv b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (clv) ipChange.ipc$dispatch("3ef0d3a5", new Object[]{this});
            }
            return this.f17145a;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dfc69ef", new Object[]{this, str});
            }
            clv.c(this.f17145a, str);
            return this;
        }
    }

    static {
        t2o.a(396361812);
    }

    public static /* synthetic */ String a(clv clvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9adcbe78", new Object[]{clvVar, str});
        }
        clvVar.b = str;
        return str;
    }

    public static /* synthetic */ String b(clv clvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a034dd7", new Object[]{clvVar, str});
        }
        clvVar.f17144a = str;
        return str;
    }

    public static /* synthetic */ String c(clv clvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9929dd36", new Object[]{clvVar, str});
        }
        clvVar.c = str;
        return str;
    }

    public static /* synthetic */ Map d(clv clvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e2393d6", new Object[]{clvVar});
        }
        return clvVar.d;
    }

    public static /* synthetic */ Map e(clv clvVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d41e85f7", new Object[]{clvVar, map});
        }
        clvVar.d = map;
        return map;
    }

    public static JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83750fbb", new Object[0]);
        }
        return new clv().l();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("562582df", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.z6e
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.z6e
    public String getFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.z6e
    public String getFileType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
        }
        return null;
    }

    @Override // tb.z6e
    public Map<String, String> getMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
        }
        return null;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd935af3", new Object[]{this});
        }
        return this.h;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d51043", new Object[]{this});
        }
        return this.f;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return this.f17144a;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71267643", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public clv() {
    }

    public JSONObject l() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.e && dxv.j(this.f)) {
            z = true;
        }
        try {
            jSONObject.put(upx.UPLOAD_RESULT, (Object) Boolean.valueOf(z));
        } catch (Throwable unused) {
            String str = i;
            Log.e(str, "failed to put %s, which value is " + z + upx.UPLOAD_RESULT);
        }
        if (z) {
            try {
                jSONObject.put("ossUrl", (Object) this.f);
                new StringBuilder(" the upload url is ").append(this.f);
            } catch (Throwable th) {
                String str2 = i;
                Log.e(str2, "failed to put %s, which value is  throwable " + th + " oss url ossUrl throwable " + this.f);
            }
        }
        if (!dxv.i(this.d) && this.d.containsKey("base64")) {
            jSONObject.put("base64", (Object) this.d.get("base64"));
        }
        return jSONObject;
    }
}

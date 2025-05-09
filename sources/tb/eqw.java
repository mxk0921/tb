package tb;

import android.taobao.windvane.config.WVConfigManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class eqw implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile eqw c = null;

    /* renamed from: a  reason: collision with root package name */
    public String f18769a = "";
    public final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(989855791);
        t2o.a(989855775);
    }

    public static eqw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eqw) ipChange.ipc$dispatch("2da48e35", new Object[0]);
        }
        if (c == null) {
            synchronized (eqw.class) {
                try {
                    if (c == null) {
                        c = new eqw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.ipb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d449d5", new Object[]{this, str});
            return;
        }
        f(str);
        xg4.m(WVConfigManager.SPNAME_CONFIG, "domainwv-data", str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("763f78ed", new Object[]{this});
        }
        return this.f18769a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563df8f4", new Object[]{this})).booleanValue();
        }
        return this.b.get();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.b.compareAndSet(false, true)) {
            f(xg4.i(WVConfigManager.SPNAME_CONFIG, "domainwv-data"));
        }
    }

    public final boolean f(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f758f4aa", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("v") && !TextUtils.equals(yaa.f().b(), jSONObject.optString("appVersion"))) {
            return false;
        }
        v7t.i("WVConfig", "当前更新orange配置，是否有v=[" + jSONObject.has("v") + "]");
        String optString = jSONObject.optString("aliDomain", "");
        String optString2 = jSONObject.optString("thirdPartyDomain", "");
        String optString3 = jSONObject.optString("supportDownloadDomain", "");
        String optString4 = jSONObject.optString("forbiddenDomain", "");
        String optString5 = jSONObject.optString("allowAccessDomain", "");
        String optString6 = jSONObject.optString("embedDomain", "");
        this.f18769a = jSONObject.optString("forbiddenDomainRedirectURL", "");
        if (!TextUtils.isEmpty(optString)) {
            ssw.f28255a = optString;
            try {
                ssw.b = Pattern.compile(optString, 2);
                v7t.a("WVDomainConfig", "compile pattern domainPat rule, " + optString);
            } catch (PatternSyntaxException e) {
                v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString2)) {
            ssw.e = optString2;
            try {
                ssw.f = Pattern.compile(optString2, 2);
                v7t.a("WVDomainConfig", "compile pattern thirdPartyDomain rule, " + optString2);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString3)) {
            ssw.g = optString3;
            try {
                ssw.h = Pattern.compile(optString3, 2);
                v7t.a("WVDomainConfig", "compile pattern supportDownloadDomain rule, " + optString3);
            } catch (PatternSyntaxException e3) {
                v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e3.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString5)) {
            ssw.i = optString5;
            try {
                ssw.j = Pattern.compile(optString5, 2);
                v7t.a("WVDomainConfig", "compile pattern allowAccessDomain rule, " + optString5);
            } catch (PatternSyntaxException e4) {
                v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e4.getMessage());
            }
        }
        if (!TextUtils.isEmpty(optString6)) {
            IpChange ipChange2 = ssw.$ipChange;
            try {
                ssw.j = Pattern.compile(optString6, 2);
                v7t.a("WVDomainConfig", "compile pattern allowAccessDomain rule, " + optString5);
            } catch (PatternSyntaxException e5) {
                v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e5.getMessage());
            }
        }
        if (TextUtils.isEmpty(optString4)) {
            return true;
        }
        ssw.c = optString4;
        try {
            ssw.d = Pattern.compile(optString4, 2);
            v7t.a("WVDomainConfig", "compile pattern blackDomain rule, " + optString4);
        } catch (PatternSyntaxException e6) {
            v7t.d("WVDomainConfig", " PatternSyntaxException pattern:" + e6.getMessage());
        }
        if (TextUtils.isEmpty(this.f18769a) || !ssw.b(this.f18769a)) {
            return true;
        }
        this.f18769a = "";
        return true;
    }
}

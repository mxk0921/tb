package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23083a;
    public long b;
    public String c;

    static {
        t2o.a(912261745);
    }

    public l38() {
        this.b = -1L;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f23083a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c62d2fa", new Object[]{this});
        }
        return this.c;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1d", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public l38 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("a6b59058", new Object[]{this, str});
        }
        this.f23083a = str;
        return this;
    }

    public l38 e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("bb11de52", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public l38 f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("6e23cf6f", new Object[]{this, str});
        }
        try {
            this.b = Long.parseLong(str);
        } catch (Throwable th) {
            tgh.c("DxTemplateInfo", "constructor error: ", th);
        }
        return this;
    }

    public l38(JSONObject jSONObject) {
        this.b = -1L;
        this.f23083a = jSONObject.getString("name");
        f(jSONObject.getString("version"));
        this.c = jSONObject.getString("url");
    }

    public l38(String str, long j, String str2) {
        this.f23083a = str;
        this.b = j;
        this.c = str2;
    }
}

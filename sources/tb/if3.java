package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class if3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21282a;
    public final g1p b;
    public final String c;
    public final JSONObject d;
    public final k6z e;

    public if3(String str, g1p g1pVar, String str2, JSONObject jSONObject, k6z k6zVar) {
        this.f21282a = str;
        this.b = g1pVar;
        this.c = str2;
        this.d = jSONObject;
        this.e = k6zVar;
    }

    public final k6z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6z) ipChange.ipc$dispatch("581af530", new Object[]{this});
        }
        return this.e;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfead86", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb146aad", new Object[]{this});
        }
        return this.f21282a;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("320bc88a", new Object[]{this});
        }
        return this.d;
    }

    public final g1p e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1p) ipChange.ipc$dispatch("1f1b5830", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof if3) {
                if3 if3Var = (if3) obj;
                if (!ckf.b(this.f21282a, if3Var.f21282a) || !ckf.b(this.b, if3Var.b) || !ckf.b(this.c, if3Var.c) || !ckf.b(this.d, if3Var.d) || !ckf.b(this.e, if3Var.e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f21282a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        g1p g1pVar = this.b;
        if (g1pVar != null) {
            i2 = g1pVar.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            i4 = jSONObject.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        k6z k6zVar = this.e;
        if (k6zVar != null) {
            i5 = k6zVar.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CashierParam(payType=" + this.f21282a + ", searchConfig=" + this.b + ", loadingText=" + this.c + ", sdkExtParams=" + this.d + ", extStr=" + this.e + f7l.BRACKET_END_STR;
    }
}

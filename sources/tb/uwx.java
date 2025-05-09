package tb;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.lwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uwx implements r2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f29651a;
    public final Context b;
    public final String c;
    public final p2 d;
    public final sg4 e;
    public final w5y f;
    public final Map<String, String> g;
    public final List<ddp> h;
    public final Map<String, String> i = new HashMap();

    public uwx(Context context, String str, p2 p2Var, InputStream inputStream, Map<String, String> map, List<ddp> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        str = str == null ? context.getPackageName() : str;
        this.c = str;
        if (inputStream != null) {
            this.e = new d9y(inputStream, str);
            zyv.a(inputStream);
        } else {
            this.e = new way(context, str);
        }
        sg4 sg4Var = this.e;
        this.f = new w5y(sg4Var);
        p2 p2Var2 = p2.UNKNOWN;
        if (p2Var == p2Var2 || !"1.0".equals(sg4Var.getString("/configuration_version", null))) {
            this.d = (p2Var == null || p2Var == p2Var2) ? zyv.f(this.e.getString("/region", null), this.e.getString("/agcgw/url", null)) : p2Var;
            this.g = zyv.d(map);
            this.h = list;
            this.f29651a = str2 == null ? d() : str2;
            return;
        }
        throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
    }

    @Override // tb.r2
    public p2 a() {
        p2 p2Var = this.d;
        if (p2Var == null) {
            return p2.UNKNOWN;
        }
        return p2Var;
    }

    public final String b(String str) {
        HashMap hashMap = (HashMap) lwf.a();
        if (!hashMap.containsKey(str)) {
            return null;
        }
        HashMap hashMap2 = (HashMap) this.i;
        if (hashMap2.containsKey(str)) {
            return (String) hashMap2.get(str);
        }
        lwf.a aVar = (lwf.a) hashMap.get(str);
        if (aVar == null) {
            return null;
        }
        String a2 = aVar.a(this);
        hashMap2.put(str, a2);
        return a2;
    }

    public List<ddp> c() {
        return this.h;
    }

    public final String d() {
        return String.valueOf(("{packageName='" + this.c + "', routePolicy=" + this.d + ", reader=" + this.e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.g).toString().hashCode() + '}').hashCode());
    }

    public String e(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String e = zyv.e(str);
        String str3 = (String) ((HashMap) this.g).get(e);
        if (str3 != null) {
            return str3;
        }
        String b = b(e);
        if (b != null) {
            return b;
        }
        String string = this.e.getString(e, str2);
        if (w5y.b(string)) {
            return this.f.d(string, str2);
        }
        return string;
    }

    @Override // tb.r2
    public Context getContext() {
        return this.b;
    }

    @Override // tb.r2
    public String getIdentifier() {
        return this.f29651a;
    }

    @Override // tb.r2
    public String getString(String str) {
        return e(str, null);
    }
}

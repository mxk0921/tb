package tb;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class way implements sg4 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f30574a = new ConcurrentHashMap();
    public final aay b;

    public way(Context context, String str) {
        this.b = new aay(context, str);
    }

    @Override // tb.sg4
    public String getString(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f30574a;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 != null) {
            return str3;
        }
        String b = this.b.b(str, str2);
        if (b == null) {
            return str2;
        }
        concurrentHashMap.put(str, b);
        return b;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}

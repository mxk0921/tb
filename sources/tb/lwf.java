package tb;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lwf {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f23612a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        String a(r2 r2Var);
    }

    public static Map<String, a> a() {
        return f23612a;
    }

    public static void b(String str, a aVar) {
        ((HashMap) f23612a).put(str, aVar);
    }
}

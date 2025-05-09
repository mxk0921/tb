package tb;

import io.unicorn.embedding.engine.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bs9 {
    public static bs9 c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f16598a = new HashMap();
    public final Queue<a> b = new LinkedList();

    static {
        t2o.a(945815682);
    }

    public static bs9 b() {
        if (c == null) {
            c = new bs9();
        }
        return c;
    }

    public a a(String str) {
        return (a) ((HashMap) this.f16598a).get(str);
    }

    public a c() {
        Queue<a> queue = this.b;
        if (queue.isEmpty()) {
            return null;
        }
        a aVar = (a) ((LinkedList) queue).remove();
        hdh.d("FlutterEngineCache", "reuse engine: " + aVar);
        return aVar;
    }

    public void d(String str, a aVar) {
        Map<String, a> map = this.f16598a;
        if (aVar != null) {
            ((HashMap) map).put(str, aVar);
        } else {
            ((HashMap) map).remove(str);
        }
    }

    public boolean e(a aVar) {
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList.size() >= 3) {
            return false;
        }
        aVar.o();
        linkedList.add(aVar);
        hdh.d("FlutterEngineCache", "recycle engine: " + aVar);
        return true;
    }

    public void f(String str) {
        d(str, null);
    }
}

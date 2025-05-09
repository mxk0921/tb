package tb;

import androidx.collection.LruCache;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lkh {
    public static final lkh b = new lkh();

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, kkh> f23382a = new LruCache<>(20);

    public static lkh b() {
        return b;
    }

    public kkh a(String str) {
        if (str == null) {
            return null;
        }
        return this.f23382a.get(str);
    }

    public void c(String str, kkh kkhVar) {
        if (str != null) {
            this.f23382a.put(str, kkhVar);
        }
    }
}

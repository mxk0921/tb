package tb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class bf1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16350a;
    public final int b = c.addAndGet(1);
    public static final AtomicInteger c = new AtomicInteger(506911);
    public static final bf1 LOAD_DEX = new bf1("loadDex");
    public static final bf1 LOAD_NATIVE = new bf1("loadNative");
    public static final bf1 CORE_INIT = new bf1("coreInit");
    public static final bf1 FETCH_UC_SO = new bf1("fetchSo");

    public bf1(String str) {
        this.f16350a = "WindVane#" + str;
    }

    static {
        t2o.a(989856416);
    }
}

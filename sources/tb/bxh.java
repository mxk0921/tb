package tb;

import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bxh {
    public static final int DEFAULT_TIMEOUT_MS = 3000;
    public static final AtomicInteger j = new AtomicInteger(0);
    public String c;
    public String d;
    public String e;
    public a g;
    public double h;
    public double i;
    public final Map<String, String> b = new ConcurrentHashMap();
    public int f = 3000;

    /* renamed from: a  reason: collision with root package name */
    public final String f16702a = "WX_Req_" + j.incrementAndGet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16703a;
        public final NetworkResourceType b;

        static {
            t2o.a(982516069);
        }

        public a(NetworkResourceType networkResourceType, int i) {
            this.f16703a = i;
            this.b = networkResourceType;
        }
    }

    static {
        t2o.a(982516068);
    }
}

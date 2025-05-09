package tb;

import com.alibaba.android.ultron.vfw.storage.TradeCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bbv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MARK_STORAGE_STATE = "$NEED_REFRESH";
    public static final String SPLIT_SAVE_TIME = "_SPLIT_SAVE_TIME_";
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Long> f16308a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(157286827);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(157286826);
    }

    public static /* synthetic */ void f(bbv bbvVar, String str, String str2, String str3, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b3102a", new Object[]{bbvVar, str, str2, str3, l, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        bbvVar.e(str, str2, str3, l);
    }

    public final boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b025250", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        String a2 = a(str, str2);
        if (a2 == null || a2.length() == 0 || b(str, str2)) {
            return true;
        }
        return false;
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bee472", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        try {
            TradeCache.INSTANCE.j(str, str2);
        } catch (Throwable unused) {
        }
    }

    public final void g(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5e917e", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        TradeCache.INSTANCE.k(str + MARK_STORAGE_STATE, String.valueOf(z), str2);
    }

    public final void e(String str, String str2, String str3, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536179dd", new Object[]{this, str, str2, str3, l});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "data");
        ckf.g(str3, "bizCode");
        hav.d("UltronTradeHybrid", "setStorage: " + str + ", " + str3);
        if (l != null) {
            f16308a.put(str3, Long.valueOf(l.longValue()));
        }
        TradeCache.INSTANCE.k(str, String.valueOf(System.currentTimeMillis()) + SPLIT_SAVE_TIME + str2, str3);
        g(str, false, str3);
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19ad4940", new Object[]{this, str, str2});
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        TradeCache tradeCache = TradeCache.INSTANCE;
        String g = tradeCache.g(str, str2);
        if (g == null || g.length() == 0 || !wsq.O(g, SPLIT_SAVE_TIME, false, 2, null)) {
            return null;
        }
        int Y = wsq.Y(g, SPLIT_SAVE_TIME, 0, false, 6, null);
        if (g != null) {
            String substring = g.substring(0, Y);
            ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Long l = f16308a.get(str2);
            if (l == null || System.currentTimeMillis() - Long.parseLong(substring) <= l.longValue()) {
                String substring2 = g.substring(wsq.Y(g, SPLIT_SAVE_TIME, 0, false, 6, null) + 17);
                ckf.f(substring2, "(this as java.lang.String).substring(startIndex)");
                return substring2;
            }
            tradeCache.j(str, str2);
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb4ff07a", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        String g = TradeCache.INSTANCE.g(str.concat(MARK_STORAGE_STATE), str2);
        return g != null && ckf.b(g, "true");
    }
}

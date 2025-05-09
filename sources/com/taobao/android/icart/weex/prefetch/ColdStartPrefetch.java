package com.taobao.android.icart.weex.prefetch;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.engine.CartVEngineFactory;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.tao.Globals;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import tb.c9x;
import tb.ckf;
import tb.gd4;
import tb.hav;
import tb.ine;
import tb.m9u;
import tb.nb3;
import tb.pav;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ColdStartPrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static StartType b;
    public static volatile JSONObject d;
    public static volatile JSONObject e;
    public static volatile JSONObject f;
    public static volatile long g;
    public static volatile long h;
    public static final ColdStartPrefetch INSTANCE = new ColdStartPrefetch();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f8070a = new AtomicBoolean();
    public static long c = -1;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/icart/weex/prefetch/ColdStartPrefetch$StartType;", "", "(Ljava/lang/String;I)V", "TOUCH_DOWN", "FRAGMENT_INIT", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum StartType {
        TOUCH_DOWN,
        FRAGMENT_INIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StartType startType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/prefetch/ColdStartPrefetch$StartType");
        }

        public static StartType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("408cc462", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(StartType.class, str);
            }
            return (StartType) valueOf;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ColdStartPrefetch coldStartPrefetch = ColdStartPrefetch.INSTANCE;
            ColdStartPrefetch.b(coldStartPrefetch, System.currentTimeMillis());
            com.taobao.android.weex.b.d().a(WeexInstanceMode.DOM, Globals.getApplication());
            ColdStartPrefetch.a(coldStartPrefetch, System.currentTimeMillis());
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ColdStartPrefetch.c(ColdStartPrefetch.INSTANCE);
            }
        }
    }

    static {
        t2o.a(478151029);
    }

    public static final /* synthetic */ void a(ColdStartPrefetch coldStartPrefetch, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c756357a", new Object[]{coldStartPrefetch, new Long(j)});
        } else {
            h = j;
        }
    }

    public static final /* synthetic */ void b(ColdStartPrefetch coldStartPrefetch, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a29ad3", new Object[]{coldStartPrefetch, new Long(j)});
        } else {
            g = j;
        }
    }

    public static final /* synthetic */ void c(ColdStartPrefetch coldStartPrefetch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7951c538", new Object[]{coldStartPrefetch});
        } else {
            coldStartPrefetch.n();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        d = null;
        e = null;
        f = null;
        b = null;
        g = 0L;
        h = 0L;
        c = 0L;
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("43da2519", new Object[]{this});
        }
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        return new JSONObject();
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97e5c612", new Object[]{this});
        }
        return e;
    }

    public final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afc7848f", new Object[]{this});
        }
        return f;
    }

    public final StartType h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StartType) ipChange.ipc$dispatch("5102ca0e", new Object[]{this});
        }
        return b;
    }

    public final long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("638e43b3", new Object[]{this})).longValue();
        }
        return c;
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfce8b00", new Object[]{this})).longValue();
        }
        return h;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e043447", new Object[]{this})).longValue();
        }
        return g;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("921f8104", new Object[]{this})).booleanValue();
        }
        return f8070a.get();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb56e19b", new Object[]{this});
            return;
        }
        d = gd4.INSTANCE.c();
        f = nb3.INSTANCE.b();
        e = CartMegaManager.h(CartMegaManager.INSTANCE, null, 1, null);
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#Cold#preloadImagesFromKV");
        ine.INSTANCE.d("coldStartNoInstance");
        aVar.b("Cart#Cold#preloadImagesFromKV");
    }

    public final boolean m(StartType startType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddd1f52", new Object[]{this, startType})).booleanValue();
        }
        ckf.g(startType, "type");
        if (f8070a.getAndSet(true) || CartVEngineFactory.isRunIdleTask()) {
            return false;
        }
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#ColdStartPrefetch#" + startType);
        b = startType;
        if (startType == StartType.TOUCH_DOWN) {
            c = System.currentTimeMillis();
        }
        hav.d(c9x.TAG, "ColdStartPrefetch start, type=" + startType);
        if (!com.taobao.android.weex.b.d().k(WeexInstanceMode.DOM)) {
            pav.k(a.INSTANCE);
        }
        pav.m(true, b.INSTANCE);
        aVar.b("Cart#ColdStartPrefetch#" + startType);
        return true;
    }
}

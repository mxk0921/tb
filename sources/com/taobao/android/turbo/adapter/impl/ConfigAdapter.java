package com.taobao.android.turbo.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.a07;
import tb.ckf;
import tb.lpb;
import tb.mqu;
import tb.njg;
import tb.spu;
import tb.t2o;
import tb.tpu;
import tb.val;
import tb.wsq;
import tb.x0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ConfigAdapter implements lpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final njg d = kotlin.a.b(ConfigAdapter$Companion$instance$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f9722a = new ConcurrentHashMap();
    public final Map<String, Object> b = new ConcurrentHashMap();
    public final Map<String, Boolean> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601187);
        }

        public a() {
        }

        public final ConfigAdapter a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("1a4ee981", new Object[]{this});
            } else {
                value = ConfigAdapter.d().getValue();
            }
            return (ConfigAdapter) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601186);
        t2o.a(919601164);
    }

    public static final /* synthetic */ njg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("fb99327c", new Object[0]);
        }
        return d;
    }

    @Override // tb.lpb
    public <T> T a(String str, T t, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3c2557d1", new Object[]{this, str, t, new Boolean(z)});
        }
        ckf.g(str, "key");
        List<String> h = h(str);
        return h != null ? (T) e(g(str, h, t, z), t) : t;
    }

    @Override // tb.lpb
    public <T> T b(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("84c9cac", new Object[]{this, str, t});
        }
        ckf.g(str, "key");
        if (t != null) {
            return (T) e(f(str, t), t);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    public final <T> T e(Object obj, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9e04d621", new Object[]{this, obj, t});
        }
        if (t instanceof Integer) {
            return (T) Integer.valueOf(mqu.Companion.d(obj, ((Number) t).intValue()));
        }
        if (t instanceof String) {
            return (T) mqu.Companion.i(obj, (String) t);
        }
        if (t instanceof Boolean) {
            return (T) Boolean.valueOf(mqu.Companion.b(obj, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Float) {
            return (T) Float.valueOf(mqu.Companion.c(obj, ((Number) t).floatValue()));
        }
        if (t instanceof Long) {
            return (T) Long.valueOf(mqu.Companion.g(obj, ((Number) t).longValue()));
        }
        return t;
    }

    public final Object f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("82aa922b", new Object[]{this, str, obj});
        }
        Object obj2 = ((ConcurrentHashMap) this.b).get(str);
        if (obj2 == null && (obj2 = x0.Companion.a(str, obj)) != null) {
            ((ConcurrentHashMap) this.b).put(str, obj2);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "ConfigAdapter", "getABValue, " + str + ", " + obj2, null, 4, null);
        return obj2;
    }

    public final Object g(String str, List<String> list, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3c7356a9", new Object[]{this, str, list, obj, new Boolean(z)});
        }
        if (!z) {
            String f = val.Companion.a().f(list.get(0), list.get(1), String.valueOf(obj));
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "ConfigAdapter", "getOrangeValue no needCache, " + str + ", " + f, null, 4, null);
            return f;
        }
        Object obj2 = ((ConcurrentHashMap) this.f9722a).get(str);
        if (obj2 == null && (obj2 = val.Companion.a().f(list.get(0), list.get(1), String.valueOf(obj))) != null) {
            ((ConcurrentHashMap) this.f9722a).put(str, obj2);
        }
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, "ConfigAdapter", "getOrangeValue, " + str + ", " + obj2, null, 4, null);
        return obj2;
    }

    @Override // tb.lpb
    public <T> T c(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f0b63bdf", new Object[]{this, str, t});
        }
        ckf.g(str, "key");
        return (T) a(str, t, true);
    }

    public final List<String> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e1aae78", new Object[]{this, str});
        }
        if (str.length() == 0) {
            return null;
        }
        List<String> z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
        if (z0.size() == 2) {
            return z0;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "ConfigAdapter", "key is not valid, " + str, null, 4, null);
        return null;
    }

    @Override // tb.lpb
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f0a036", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "key");
        Boolean bool = (Boolean) ((ConcurrentHashMap) this.c).get(str);
        if (bool == null) {
            bool = Boolean.valueOf(ABGlobal.isFeatureOpened(spu.Companion.d(), str));
            ((ConcurrentHashMap) this.c).put(str, bool);
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "ConfigAdapter", "getFeatureEnabled, " + str + ", " + bool, null, 4, null);
        }
        return bool.booleanValue();
    }
}

package com.taobao.android.dinamicx;

import android.text.TextUtils;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.k;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.av5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, LruCache<String, k.a>> f7307a = new ConcurrentHashMap();
    public final ReferenceQueue<DinamicXEngine> b = new ReferenceQueue<>();

    static {
        t2o.a(444596477);
    }

    public static e e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a5383f0c", new Object[0]);
        }
        return c;
    }

    public void a(av5 av5Var) {
        LruCache<String, k.a> d;
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d054c70a", new Object[]{this, av5Var});
            return;
        }
        b();
        if (av5Var != null && (d = d(av5Var, false)) != null) {
            Iterator<Map.Entry<String, k.a>> it = d.snapshot().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, k.a> next = it.next();
                String key = next.getKey();
                k.a value = next.getValue();
                if (key != null) {
                    if (value == null || (dXWidgetNode = value.f7315a) == null) {
                        it.remove();
                    } else {
                        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
                        if (dXRuntimeContext == null) {
                            it.remove();
                        } else {
                            av5 s = dXRuntimeContext.s();
                            if (s == null || s.f() == av5Var.f()) {
                                value.f7315a = null;
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    public void b() {
        k.a aVar;
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe11fe1", new Object[]{this});
            return;
        }
        while (true) {
            Reference<? extends DinamicXEngine> poll = this.b.poll();
            if (poll == null) {
                return;
            }
            if (!(!(poll instanceof k.a) || (dXWidgetNode = (aVar = (k.a) poll).f7315a) == null || dXWidgetNode.getDXRuntimeContext() == null)) {
                DXRuntimeContext dXRuntimeContext = aVar.f7315a.getDXRuntimeContext();
                LruCache<String, k.a> d = d(dXRuntimeContext.s(), false);
                if (d != null) {
                    String d2 = dXRuntimeContext.d();
                    if (!TextUtils.isEmpty(d2)) {
                        d.remove(d2);
                    }
                }
            }
        }
    }

    public LruCache<String, k.a> c(av5 av5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("2442946b", new Object[]{this, av5Var, new Boolean(z)});
        }
        b();
        return d(av5Var, z);
    }

    public LruCache<String, k.a> d(av5 av5Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("ffb837ee", new Object[]{this, av5Var, new Boolean(z)});
        }
        if (av5Var == null) {
            return null;
        }
        String g = av5Var.g();
        LruCache<String, k.a> lruCache = (LruCache) ((ConcurrentHashMap) this.f7307a).get(g);
        if (lruCache != null || !z) {
            return lruCache;
        }
        LruCache<String, k.a> lruCache2 = new LruCache<>(av5Var.j());
        ((ConcurrentHashMap) this.f7307a).put(g, lruCache2);
        return lruCache2;
    }

    public ReferenceQueue<DinamicXEngine> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReferenceQueue) ipChange.ipc$dispatch("d4d73260", new Object[]{this});
        }
        return this.b;
    }
}

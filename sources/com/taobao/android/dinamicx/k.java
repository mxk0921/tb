package com.taobao.android.dinamicx;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.ad5;
import tb.av5;
import tb.h36;
import tb.ic5;
import tb.kl6;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LruCache<String, a> c = new LruCache<>(d().m());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends WeakReference<DinamicXEngine> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXWidgetNode f7315a;
        public int b;
        public f c;

        static {
            t2o.a(444596520);
        }

        public a(DinamicXEngine dinamicXEngine) {
            super(dinamicXEngine);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXPipelineCacheManager$DXPipelineCacheObj");
        }

        public boolean a() {
            List<f.a> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
            }
            f fVar = this.c;
            if (fVar == null || (list = fVar.c) == null || list.size() <= 0) {
                return false;
            }
            return true;
        }

        public a(DinamicXEngine dinamicXEngine, ReferenceQueue<? super DinamicXEngine> referenceQueue) {
            super(dinamicXEngine, referenceQueue);
        }
    }

    static {
        t2o.a(444596519);
    }

    public k(av5 av5Var) {
        super(av5Var);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXPipelineCacheManager");
    }

    public a g(DXWidgetNode dXWidgetNode, int i, f fVar) {
        DinamicXEngine dinamicXEngine;
        a aVar;
        DXRuntimeContext dXRuntimeContext;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1fc6eb96", new Object[]{this, dXWidgetNode, new Integer(i), fVar});
        }
        if (dXWidgetNode == null || (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) == null || dXRuntimeContext.s() == null) {
            dinamicXEngine = null;
        } else {
            z = dXRuntimeContext.s().m();
            dinamicXEngine = dXRuntimeContext.s().f();
        }
        if (z) {
            aVar = new a(dinamicXEngine, e.e().f());
        } else {
            aVar = new a(dinamicXEngine);
        }
        aVar.f7315a = dXWidgetNode;
        aVar.b = i;
        aVar.c = fVar;
        return aVar;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        LruCache<String, a> i = i(false);
        if (i != null) {
            i.evictAll();
        }
        av5 f = f();
        if (f != null && f.m()) {
            e.e().a(f);
        }
    }

    public a j(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dbcada95", new Object[]{this, dXRuntimeContext});
        }
        String d = dXRuntimeContext.d();
        DXEngineConfig d2 = d();
        LruCache<String, a> i = i(false);
        if (d2 == null || !d2.H() || TextUtils.isEmpty(d) || i == null) {
            return null;
        }
        return i.get(d);
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        LruCache<String, a> i = i(false);
        if (i == null) {
            return 0;
        }
        return i.size();
    }

    public boolean l(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89e6e807", new Object[]{this, dXWidgetNode, dXRenderOptions})).booleanValue();
        }
        DXEngineConfig d = d();
        if (d == null || !d.H() || dXRenderOptions.k() || ((dXWidgetNode != null && dXWidgetNode.getParentWidget() != null) || dXRenderOptions.f() == 1 || !dXRenderOptions.m())) {
            return false;
        }
        return true;
    }

    public void m(DXRuntimeContext dXRuntimeContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105bcbae", new Object[]{this, dXRuntimeContext, aVar});
            return;
        }
        String d = dXRuntimeContext.d();
        DXEngineConfig d2 = d();
        LruCache<String, a> i = i(true);
        if (d2 != null && d2.H() && !TextUtils.isEmpty(d) && aVar != null && i != null) {
            i.put(d, aVar);
        }
    }

    public Pair<DXWidgetNode, Integer> n(DXRuntimeContext dXRuntimeContext, View view) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c974ee0f", new Object[]{this, dXRuntimeContext, view});
        }
        try {
            a j = j(dXRuntimeContext);
            if (j == null || (dXWidgetNode = j.f7315a) == null || dXRuntimeContext.i() != dXWidgetNode.getDXRuntimeContext().i()) {
                return null;
            }
            if (j.a()) {
                ((ArrayList) dXRuntimeContext.i.c).addAll(j.c.c);
            }
            dXWidgetNode.bindRuntimeContext(dXRuntimeContext, true);
            if (view != null) {
                kl6.c(view, dXWidgetNode);
            }
            return new Pair<>(dXWidgetNode, Integer.valueOf(j.b));
        } catch (Exception e) {
            ic5.s(this.f15675a, dXRuntimeContext.p(), "Render", "Render_Get_Expand_Tree_Crash", f.GET_EXPAND_TREE_CRASH, xv5.a(e));
            return null;
        }
    }

    public void o(String str) {
        LruCache<String, a> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ae396f", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (i = i(false)) != null) {
            i.remove(str);
        }
    }

    public LruCache<String, a> i(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("e6657bc3", new Object[]{this, new Boolean(z)});
        }
        av5 f = f();
        if (f.c() == null || !f.m()) {
            if (DinamicXEngine.j0() && z) {
                h36.g("DXNewPipelineCache", "优化关，使用旧PipelineCache: " + this.c + " size: " + this.c.size());
            }
            return this.c;
        }
        LruCache<String, a> c = e.e().c(f, z);
        if (DinamicXEngine.j0() && z) {
            StringBuilder sb = new StringBuilder("优化开，使用新的PipelineCache -> ");
            sb.append(f.g());
            sb.append(": ");
            sb.append(c);
            sb.append(" size: ");
            if (c != null) {
                i = c.size();
            }
            sb.append(i);
            h36.g("DXNewPipelineCache", sb.toString());
        }
        return c;
    }
}

package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import java.util.ArrayDeque;
import tb.w0o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final l5k f26430a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!q0o.a(q0o.this).isEmpty() && (bVar = (b) q0o.a(q0o.this).pollFirst()) != null) {
                q0o.this.d(bVar);
                if (q0o.a(q0o.this).isEmpty()) {
                    ffg.e(bVar.f);
                    ffg.b(bVar.f, true, System.nanoTime());
                    return;
                }
                q0o.this.e();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f26432a = System.nanoTime();
        public LVView b;
        public peg c;
        public DXRootView d;
        public JSONObject e;
        public w0o f;
        public w0o.a g;

        static {
            t2o.a(295699239);
        }
    }

    static {
        t2o.a(295699237);
    }

    public q0o(l5k l5kVar) {
        this.f26430a = l5kVar;
    }

    public static /* synthetic */ ArrayDeque a(q0o q0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayDeque) ipChange.ipc$dispatch("9b246da0", new Object[]{q0oVar});
        }
        return q0oVar.b;
    }

    public void b(LVView lVView, peg pegVar, DXRootView dXRootView, JSONObject jSONObject, w0o w0oVar, w0o.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2aebc45", new Object[]{this, lVView, pegVar, dXRootView, jSONObject, w0oVar, aVar});
        } else if (lVView == null || pegVar == null || dXRootView == null || jSONObject == null || w0oVar == null || aVar == null) {
            hha.b("RenderPipeline", "addTask | error.");
        } else if (this.f26430a == null) {
            hha.b("RenderPipeline", "addTask | mViewManager null.");
        } else {
            b bVar = new b();
            bVar.b = lVView;
            bVar.c = pegVar;
            bVar.d = dXRootView;
            bVar.e = jSONObject;
            bVar.f = w0oVar;
            bVar.g = aVar;
            if (!lVView.isEnableRenderPipeline()) {
                d(bVar);
            } else {
                this.b.add(bVar);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public void d(b bVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf1f8a9", new Object[]{this, bVar});
        } else if (bVar != null) {
            long nanoTime = System.nanoTime();
            DXRenderOptions q = new DXRenderOptions.b().E(new beg(bVar.c, bVar.b.getRenderOptions())).q();
            DinamicXEngine d = this.f26430a.d();
            Context context = bVar.b.getContext();
            DXRootView dXRootView = bVar.d;
            DXResult<DXRootView> i1 = d.i1(context, dXRootView, dXRootView.getDxTemplateItem(), bVar.e, -1, q);
            if (i1 != null) {
                this.f26430a.e(i1.f7291a);
            }
            bVar.g.c(i1);
            bVar.f.a(bVar.g);
            bVar.g.d = System.nanoTime() - nanoTime;
            StringBuilder sb = new StringBuilder("renderView | renderView, node=");
            sb.append(bVar.c);
            sb.append(" hasError=");
            if (i1 == null) {
                obj = "null";
            } else {
                obj = Boolean.valueOf(i1.d());
            }
            sb.append(obj);
            sb.append(" delayTime=");
            sb.append(System.nanoTime() - bVar.f26432a);
            sb.append("    renderTime=");
            sb.append(bVar.g.d);
            hha.d("RenderPipeline", sb.toString());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0f160e", new Object[]{this});
        } else if (!this.b.isEmpty()) {
            ADaemon.postMainLooper(new a(), new long[0]);
        }
    }
}

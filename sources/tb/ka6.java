package tb;

import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.p;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ka6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ThreadLocal<Boolean> needNotifyMap = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends ThreadLocal<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXRemoteChildTemplateManager$1");
        }

        /* renamed from: a */
        public Boolean initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("6a31bf11", new Object[]{this});
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTemplateItem f22510a;
        public final /* synthetic */ p b;
        public final /* synthetic */ DXRuntimeContext c;
        public final /* synthetic */ bi6 d;
        public final /* synthetic */ int e;

        public b(DXTemplateItem dXTemplateItem, p pVar, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, int i) {
            this.f22510a = dXTemplateItem;
            this.b = pVar;
            this.c = dXRuntimeContext;
            this.d = bi6Var;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (DinamicXEngine.j0()) {
                h36.b("DXRemoteChildLoadTask", "开始在子线程处理的remote模版" + this.f22510a.d() + " threadId " + Thread.currentThread().getName());
            }
            ka6.this.m(this.b, this.f22510a, this.c, this.d, this.e);
            h36.b("DXRemoteChildLoadTask", "处理完所有的remote模版，准备回调");
            ThreadLocal<Boolean> threadLocal = ka6.needNotifyMap;
            if (threadLocal.get().booleanValue()) {
                h36.a("通知外层进行刷新");
                threadLocal.set(Boolean.FALSE);
                ka6.a(ka6.this, this.c);
                return;
            }
            h36.a("不需要通知外层进行刷新");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements gvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f22511a;
        public final /* synthetic */ DXRuntimeContext b;
        public final /* synthetic */ bi6 c;
        public final /* synthetic */ int d;

        public c(p pVar, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, int i) {
            this.f22511a = pVar;
            this.b = dXRuntimeContext;
            this.c = bi6Var;
            this.d = i;
        }

        public void a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f70ebcf5", new Object[]{this, dXTemplateItem});
                return;
            }
            DXTemplateItem o = this.f22511a.o(dXTemplateItem);
            if (DinamicXEngine.j0()) {
                h36.b("DXRemoteChildTemplateManager", "模版" + o.d() + "下载完成，开始构建  thread " + Thread.currentThread().getName());
            }
            if (o.d().equals(dXTemplateItem.d())) {
                ka6.needNotifyMap.set(Boolean.TRUE);
                ka6.b(ka6.this, this.f22511a, o, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(444596531);
    }

    public static /* synthetic */ void a(ka6 ka6Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451df293", new Object[]{ka6Var, dXRuntimeContext});
        } else {
            ka6Var.l(dXRuntimeContext);
        }
    }

    public static /* synthetic */ boolean b(ka6 ka6Var, p pVar, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2bd577e", new Object[]{ka6Var, pVar, dXTemplateItem, dXRuntimeContext, bi6Var, new Integer(i)})).booleanValue();
        }
        return ka6Var.d(pVar, dXTemplateItem, dXRuntimeContext, bi6Var, i);
    }

    public final void c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd358cf3", new Object[]{this, dXWidgetNode});
            return;
        }
        if (dXWidgetNode != null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        if ((dXWidgetNode instanceof j) && dXWidgetNode.getChildrenCount() > 0) {
            if (zg5.y4()) {
                if (dXWidgetNode.isV4Node()) {
                    if (dXWidgetNode.getDxv4Properties().g() != null && dXWidgetNode.getDxv4Properties().g().indexOfKey(t26.DX_PARSER_LISTDATA) > -1) {
                        return;
                    }
                } else if (dXWidgetNode.getDataParsersExprNode() != null && dXWidgetNode.getDataParsersExprNode().indexOfKey(t26.DX_PARSER_LISTDATA) > -1) {
                    return;
                }
            }
            for (DXWidgetNode dXWidgetNode2 : ((j) dXWidgetNode).getChildren()) {
                c(dXWidgetNode2);
            }
        }
    }

    public final synchronized boolean d(p pVar, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3983ff04", new Object[]{this, pVar, dXTemplateItem, dXRuntimeContext, bi6Var, new Integer(i)})).booleanValue();
        }
        DXWidgetNode e = e(dXTemplateItem, dXRuntimeContext, pVar, i);
        if (e == null || bi6Var == null) {
            la6.b("createAndBindTree 失败");
            return false;
        }
        bi6Var.addChild(e, false);
        bi6Var.a(e.getDXRuntimeContext().i());
        new r().e(e, null);
        return true;
    }

    public DXWidgetNode e(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, p pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1b12bc3c", new Object[]{this, dXTemplateItem, dXRuntimeContext, pVar, new Integer(i)});
        }
        if (pVar == null || dXTemplateItem == null || dXRuntimeContext == null) {
            return null;
        }
        DXRuntimeContext b2 = dXRuntimeContext.b(null);
        if (dXRuntimeContext.O() instanceof JSONObject) {
            b2.f0((JSONObject) dXRuntimeContext.O());
        } else if (dXRuntimeContext.w0() && (dXRuntimeContext.O() instanceof Object)) {
            DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
            dXJSONObjectForVM.setData(dXRuntimeContext.O());
            b2.f0(dXJSONObjectForVM);
        }
        b2.i0(dXTemplateItem);
        DXWidgetNode r = pVar.r(b2);
        if (r == null) {
            la6.b("DXRemoteChildTemplateManager createExpandWtSync manager.getTemplateWT(cloneRtx) == null");
            return null;
        }
        if (r.getDXRuntimeContext() != null && r.getDXRuntimeContext().Y()) {
            b2.i.c.addAll(r.getDXRuntimeContext().i.c);
        }
        DXWidgetNode deepClone = r.deepClone(b2);
        if (i == 1) {
            c(deepClone);
        }
        return deepClone;
    }

    public boolean f(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94811eed", new Object[]{this, dXTemplateItem, dXRuntimeContext, bi6Var, pVar})).booleanValue();
        }
        if (!(pVar == null || dXTemplateItem == null)) {
            ArrayList arrayList = new ArrayList();
            dXTemplateItem.m(1);
            arrayList.add(dXTemplateItem);
            if (DinamicXEngine.j0()) {
                h36.a("DXRemoteChildTemplateManager 准备下载模版 " + dXTemplateItem.d());
            }
            if (dXRuntimeContext != null) {
                pVar.l(arrayList, dXRuntimeContext.c());
            } else {
                pVar.l(arrayList, h36.TAG);
            }
        }
        return false;
    }

    public DXTemplateItem g(p pVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("b569464f", new Object[]{this, pVar, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        return pVar.o(dXTemplateItem);
    }

    public p h(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("1b0f4387", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.s() == null || dXRuntimeContext.s().f() == null) {
            return null;
        }
        return dXRuntimeContext.s().f().E();
    }

    public boolean i(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63ff0f30", new Object[]{this, dXTemplateItem, dXTemplateItem2})).booleanValue();
        }
        if (dXTemplateItem == null || dXTemplateItem2 == null || dXTemplateItem.b != dXTemplateItem2.b || !dXTemplateItem.f7343a.equals(dXTemplateItem2.f7343a)) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6dcc5b", new Object[]{this})).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public final void l(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238dbf81", new Object[]{this, dXRuntimeContext});
            return;
        }
        j66 j66Var = dXRuntimeContext.s().f().n;
        if (j66Var != null) {
            zh6 zh6Var = new zh6();
            zh6Var.f32770a = dXRuntimeContext.p();
            zh6Var.d = dXRuntimeContext.q();
            zh6Var.b = dXRuntimeContext.i();
            zh6Var.c = 1004;
            j66Var.i(zh6Var);
        }
    }

    public boolean j(DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, p pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea0cf40", new Object[]{this, dXTemplateItem, dXRuntimeContext, bi6Var, pVar, new Integer(i)})).booleanValue();
        }
        boolean k = k();
        if (dXTemplateItem == null) {
            return false;
        }
        if (k) {
            jb6.r(new b(dXTemplateItem, pVar, dXRuntimeContext, bi6Var, i));
        } else {
            if (DinamicXEngine.j0()) {
                h36.b("DXRemoteChildLoadTask", "开始在当前线程处理的remote模版" + dXTemplateItem.d());
            }
            m(pVar, dXTemplateItem, dXRuntimeContext, bi6Var, i);
        }
        return true;
    }

    public DXWidgetNode m(p pVar, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext, bi6 bi6Var, int i) {
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6a79b885", new Object[]{this, pVar, dXTemplateItem, dXRuntimeContext, bi6Var, new Integer(i)});
        }
        DXTemplateItem o = pVar.o(dXTemplateItem);
        if (o == null || !o.d().equals(dXTemplateItem.d())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            if (DinamicXEngine.j0()) {
                h36.b("DXRemoteChildTemplateManager", "模版" + dXTemplateItem.d() + "不存在，开始下载");
            }
            if (dXRuntimeContext == null) {
                c2 = h36.TAG;
            } else {
                c2 = dXRuntimeContext.c();
            }
            pVar.m(arrayList, c2, new c(pVar, dXRuntimeContext, bi6Var, i), false);
            return null;
        }
        d(pVar, o, dXRuntimeContext, bi6Var, i);
        if (DinamicXEngine.j0()) {
            h36.b("DXRemoteChildTemplateManager", "模版" + o.d() + "已经存在，直接构建构建完成");
        }
        return null;
    }
}

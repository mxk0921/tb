package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class whr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static whr c;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f30702a;
    public b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTemplateItem f30703a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ FrameLayout d;

        public a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
            this.f30703a = dXTemplateItem;
            this.b = jSONObject;
            this.c = context;
            this.d = frameLayout;
        }

        @Override // tb.whr.b
        public void callBack(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ef34536", new Object[]{this, str});
            } else if (this.f30703a.f7343a.equals(str) && whr.a(whr.this).u(this.f30703a) != null) {
                whr.b(whr.this, this.f30703a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void callBack(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(779092472);
            t2o.a(444596939);
        }

        public c() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null) {
                for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                    if (dXTemplateItem != null) {
                        whr.c(whr.this).callBack(dXTemplateItem.f7343a);
                    }
                }
            }
        }
    }

    static {
        t2o.a(779092469);
    }

    public whr() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig("live"));
        this.f30702a = dinamicXEngine;
        dinamicXEngine.W0(pg6.DX_EVENT_TBLFOLLOWCONTENTHANDLER, new pg6());
        dinamicXEngine.a1(new c());
    }

    public static /* synthetic */ DinamicXEngine a(whr whrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("71e0995d", new Object[]{whrVar});
        }
        return whrVar.f30702a;
    }

    public static /* synthetic */ void b(whr whrVar, DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0db710d", new Object[]{whrVar, dXTemplateItem, jSONObject, context, frameLayout});
        } else {
            whrVar.g(dXTemplateItem, jSONObject, context, frameLayout);
        }
    }

    public static /* synthetic */ b c(whr whrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7a99ff8c", new Object[]{whrVar});
        }
        return whrVar.b;
    }

    public static whr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whr) ipChange.ipc$dispatch("8733883", new Object[0]);
        }
        if (c == null) {
            synchronized (whr.class) {
                try {
                    if (c == null) {
                        c = new whr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void d(DXTemplateItem dXTemplateItem, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd79e1f0", new Object[]{this, dXTemplateItem, bVar});
        } else if (dXTemplateItem != null) {
            this.b = bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            this.f30702a.p(arrayList);
        }
    }

    public void f(DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a25d97", new Object[]{this, dXTemplateItem, jSONObject, context, frameLayout});
        } else if (dXTemplateItem != null && !TextUtils.isEmpty(dXTemplateItem.f7343a) && (dinamicXEngine = this.f30702a) != null) {
            if (dinamicXEngine.u(dXTemplateItem) != null) {
                g(dXTemplateItem, jSONObject, context, frameLayout);
            } else {
                d(dXTemplateItem, new a(dXTemplateItem, jSONObject, context, frameLayout));
            }
        }
    }

    public final void g(DXTemplateItem dXTemplateItem, JSONObject jSONObject, Context context, FrameLayout frameLayout) {
        DXResult<DXRootView> o;
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed95887b", new Object[]{this, dXTemplateItem, jSONObject, context, frameLayout});
            return;
        }
        DinamicXEngine dinamicXEngine = this.f30702a;
        if (dinamicXEngine != null && (o = dinamicXEngine.o(context, dXTemplateItem)) != null && (dXRootView = o.f7291a) != null) {
            DXRootView dXRootView2 = dXRootView;
            frameLayout.addView(dXRootView2);
            this.f30702a.j1(dXRootView2, (JSONObject) jSONObject.clone());
        }
    }
}

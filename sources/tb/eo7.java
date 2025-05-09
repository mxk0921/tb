package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eo7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_BIZ_NAME = "tt_new_detail";
    public static final int DINAMIC_IMG_BIZ_ID = 15;
    public static final String DINAMIC_IMG_BIZ_TYPE = "detail";

    /* renamed from: a  reason: collision with root package name */
    public final Context f18709a;
    public final Handler b;
    public final ze7 c;
    public final com.taobao.android.dinamicx.s d;
    public final DinamicXEngine e;
    public final Map<String, List<s>> f;
    public final iwb g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f18710a;

        public a(t tVar) {
            this.f18710a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t tVar = this.f18710a;
            if (tVar != null) {
                tVar.a("renderView() the parameter data should not be null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f18711a;

        public b(t tVar) {
            this.f18711a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t tVar = this.f18711a;
            if (tVar != null) {
                tVar.a("renderView() dxViewResult is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f18712a;
        public final /* synthetic */ DXResult b;

        public c(t tVar, DXResult dXResult) {
            this.f18712a = tVar;
            this.b = dXResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t tVar = this.f18712a;
            if (tVar != null) {
                tVar.a("renderView() " + this.b.a().toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f18713a;
        public final /* synthetic */ DXResult b;

        public d(t tVar, DXResult dXResult) {
            this.f18713a = tVar;
            this.b = dXResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t tVar = this.f18713a;
            if (tVar != null) {
                tVar.b((ViewGroup) this.b.f7291a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f18714a;

        public e(s sVar) {
            this.f18714a = sVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s sVar = this.f18714a;
            if (sVar != null) {
                sVar.b(null, "DxTemplateInfo is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f18715a;
        public final /* synthetic */ l38 b;

        public f(s sVar, l38 l38Var) {
            this.f18715a = sVar;
            this.b = l38Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s sVar = this.f18715a;
            if (sVar != null) {
                sVar.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f18716a;
        public final /* synthetic */ l38 b;

        public g(s sVar, l38 l38Var) {
            this.f18716a = sVar;
            this.b = l38Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s sVar = this.f18716a;
            if (sVar != null) {
                sVar.b(this.b, "DxTemplateInfo is invalid");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else {
                eo7.a(eo7.this, k66Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f18718a;
        public final /* synthetic */ l38 b;

        public i(s sVar, l38 l38Var) {
            this.f18718a = sVar;
            this.b = l38Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18718a.b(this.b, "unknown error");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f18719a;
        public final /* synthetic */ l38 b;

        public j(s sVar, l38 l38Var) {
            this.f18719a = sVar;
            this.b = l38Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18719a.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18720a;
        public final /* synthetic */ r b;

        public k(ViewGroup viewGroup, r rVar) {
            this.f18720a = viewGroup;
            this.b = rVar;
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            eo7 eo7Var = eo7.this;
            DXResult b = eo7.b(eo7Var, eo7.c(eo7Var, l38Var), this.f18720a);
            if (b == null) {
                this.b.a("after download createView() dxViewResult is null");
            } else if (b.d()) {
                r rVar = this.b;
                rVar.a("after download createView() has error: " + b.a().toString());
            } else {
                T t = b.f7291a;
                if (t == 0) {
                    this.b.a("after download createView() dxViewResult.result is null");
                } else {
                    this.b.b((ViewGroup) t);
                }
            }
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
            } else {
                this.b.a(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f18721a;

        public l(r rVar) {
            this.f18721a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r rVar = this.f18721a;
            if (rVar != null) {
                rVar.a("createView() dxViewResult is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f18722a;
        public final /* synthetic */ DXResult b;

        public m(r rVar, DXResult dXResult) {
            this.f18722a = rVar;
            this.b = dXResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r rVar = this.f18722a;
            if (rVar != null) {
                rVar.a("createView() has error: " + this.b.a().toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f18723a;

        public n(r rVar) {
            this.f18723a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r rVar = this.f18723a;
            if (rVar != null) {
                rVar.a("createView() dxViewResult.result is null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f18724a;
        public final /* synthetic */ DXResult b;

        public o(r rVar, DXResult dXResult) {
            this.f18724a = rVar;
            this.b = dXResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r rVar = this.f18724a;
            if (rVar != null) {
                rVar.b((ViewGroup) this.b.f7291a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f18725a;

        public p(t tVar) {
            this.f18725a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            t tVar = this.f18725a;
            if (tVar != null) {
                tVar.a("renderView() the parameter dxRootView should be DinamicXEngine createView()");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface r {
        void a(String str);

        void b(ViewGroup viewGroup);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface s {
        void a(l38 l38Var);

        void b(l38 l38Var, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface t {
        void a(String str);

        void b(ViewGroup viewGroup);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class u implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final s f18727a;

        static {
            t2o.a(912261744);
            t2o.a(912261742);
        }

        public u(s sVar) {
            this.f18727a = sVar;
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            s sVar = this.f18727a;
            if (sVar != null) {
                sVar.a(l38Var);
            }
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                return;
            }
            s sVar = this.f18727a;
            if (sVar != null) {
                sVar.b(l38Var, str);
            }
        }
    }

    static {
        t2o.a(912261720);
    }

    public /* synthetic */ eo7(q qVar, h hVar) {
        this(qVar);
    }

    public static /* synthetic */ void a(eo7 eo7Var, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45aaf0ac", new Object[]{eo7Var, k66Var});
        } else {
            eo7Var.r(k66Var);
        }
    }

    public static /* synthetic */ DXResult b(eo7 eo7Var, DXTemplateItem dXTemplateItem, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("7428b582", new Object[]{eo7Var, dXTemplateItem, viewGroup});
        }
        return eo7Var.u(dXTemplateItem, viewGroup);
    }

    public static /* synthetic */ DXTemplateItem c(eo7 eo7Var, l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("641fa64e", new Object[]{eo7Var, l38Var});
        }
        return eo7Var.p(l38Var);
    }

    public static l38 t(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("736b82ca", new Object[]{dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        l38 l38Var = new l38();
        l38Var.d(dXTemplateItem.f7343a);
        l38Var.f(String.valueOf(dXTemplateItem.b));
        l38Var.e(dXTemplateItem.c);
        return l38Var;
    }

    public void A(long j2, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae8852", new Object[]{this, new Long(j2), w8Var});
        } else {
            this.e.J0(j2, w8Var);
        }
    }

    public void B(String str, String str2, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b51db9", new Object[]{this, str, str2, w8Var});
        } else {
            this.e.N0(str, str2, w8Var);
        }
    }

    public void C(long j2, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2c3e96", new Object[]{this, new Long(j2), evbVar});
        } else {
            this.d.r(j2, evbVar);
        }
    }

    public void D(long j2, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f9307d", new Object[]{this, new Long(j2), mvbVar});
        } else {
            this.d.s(j2, mvbVar);
        }
    }

    public void E(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fbd62d", new Object[]{this, iwbVar});
        } else {
            this.e.a1(iwbVar);
        }
    }

    public void F(long j2, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e964cf", new Object[]{this, new Long(j2), qubVar});
        } else {
            this.d.u(j2, qubVar);
        }
    }

    @Deprecated
    public DXResult<DXRootView> G(DXRootView dXRootView, JSONObject jSONObject, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("8a8acdc9", new Object[]{this, dXRootView, jSONObject, new Integer(i2), new Integer(i3)});
        }
        return this.e.h1(this.f18709a, jSONObject, dXRootView, i2, i3, null);
    }

    public ViewGroup H(ViewGroup viewGroup, int i2, int i3, JSONObject jSONObject, t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f1cbe3f8", new Object[]{this, viewGroup, new Integer(i2), new Integer(i3), jSONObject, tVar});
        }
        return I(viewGroup, i2, i3, jSONObject, tVar, true);
    }

    public ViewGroup I(ViewGroup viewGroup, int i2, int i3, JSONObject jSONObject, t tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8498eb3e", new Object[]{this, viewGroup, new Integer(i2), new Integer(i3), jSONObject, tVar, new Boolean(z)});
        }
        return J(viewGroup, i2, i3, jSONObject, tVar, z, null);
    }

    public ViewGroup J(ViewGroup viewGroup, int i2, int i3, JSONObject jSONObject, t tVar, boolean z, fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a9c50ea8", new Object[]{this, viewGroup, new Integer(i2), new Integer(i3), jSONObject, tVar, new Boolean(z), fl6Var});
        }
        if (!(viewGroup instanceof DXRootView)) {
            L(new p(tVar), z);
            return viewGroup;
        } else if (jSONObject == null) {
            L(new a(tVar), z);
            return viewGroup;
        } else {
            DXResult<DXRootView> x = x((DXRootView) viewGroup, i2, i3, jSONObject, fl6Var);
            if (x == null) {
                L(new b(tVar), z);
                return null;
            }
            if (x.d()) {
                L(new c(tVar, x), z);
            } else {
                L(new d(tVar, x), z);
            }
            return x.f7291a;
        }
    }

    public final void K(l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c3be98", new Object[]{this, l38Var});
        } else if (l38Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) l38Var.a());
            jSONObject.put("version", (Object) Long.valueOf(l38Var.c()));
            jSONObject.put("bucketId", (Object) hl6.c());
            UtUtils.f(19999, "Page_Detail_MissExpectedDxTemplate", jSONObject);
        }
    }

    public final void L(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf63d3f", new Object[]{this, runnable, new Boolean(z)});
        } else if (!z) {
            ze7 ze7Var = this.c;
            if (ze7Var != null) {
                ze7Var.h().g(runnable);
            } else {
                this.b.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public void M(iwb iwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6a32a6", new Object[]{this, iwbVar});
        } else {
            this.e.o1(iwbVar);
        }
    }

    public final String d(l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b221af4", new Object[]{this, l38Var});
        }
        if (l38Var == null || TextUtils.isEmpty(l38Var.a()) || l38Var.c() < 0) {
            return null;
        }
        return l38Var.a() + " | " + l38Var.c();
    }

    public final String e(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6c0df86", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null || TextUtils.isEmpty(dXTemplateItem.e()) || dXTemplateItem.h() < 0) {
            return null;
        }
        return dXTemplateItem.e() + " | " + dXTemplateItem.h();
    }

    public final boolean f(l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95267ed2", new Object[]{this, l38Var})).booleanValue();
        }
        return s(m(l38Var), l38Var);
    }

    public ViewGroup g(l38 l38Var, ViewGroup viewGroup, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5a72d6f6", new Object[]{this, l38Var, viewGroup, rVar});
        }
        return h(l38Var, viewGroup, rVar, true);
    }

    public ViewGroup h(l38 l38Var, ViewGroup viewGroup, r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("30d05800", new Object[]{this, l38Var, viewGroup, rVar, new Boolean(z)});
        }
        l38 m2 = m(l38Var);
        boolean s2 = s(m2, l38Var);
        DXResult<DXRootView> u2 = u(p(m2), viewGroup);
        if (!s2 && rVar != null) {
            l(l38Var, new k(viewGroup, rVar), true);
            K(l38Var);
        }
        if (u2 == null) {
            L(new l(rVar), z);
        } else if (u2.d()) {
            L(new m(rVar, u2), z);
        } else if (u2.f7291a == null) {
            L(new n(rVar), z);
        } else {
            L(new o(rVar, u2), z);
        }
        return u2.f7291a;
    }

    public ViewGroup i(l38 l38Var, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("49f78e37", new Object[]{this, l38Var, rVar});
        }
        return g(l38Var, null, rVar);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ((ConcurrentHashMap) this.f).clear();
        this.d.B(this.g);
        this.e.q0();
    }

    public synchronized boolean k(l38 l38Var, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d735b1a6", new Object[]{this, l38Var, sVar})).booleanValue();
        }
        return l(l38Var, sVar, false);
    }

    public synchronized boolean l(l38 l38Var, s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f813576", new Object[]{this, l38Var, sVar, new Boolean(z)})).booleanValue();
        } else if (l38Var == null) {
            L(new e(sVar), !z);
            return false;
        } else if (f(l38Var)) {
            L(new f(sVar, l38Var), !z);
            return true;
        } else {
            String d2 = d(l38Var);
            if (d2 == null) {
                L(new g(sVar, l38Var), !z);
            } else {
                if (sVar != null) {
                    List list = (List) ((ConcurrentHashMap) this.f).get(d2);
                    if (list == null) {
                        list = new ArrayList(1);
                        ((ConcurrentHashMap) this.f).put(d2, list);
                    }
                    if (z) {
                        sVar = new u(sVar);
                    }
                    list.add(sVar);
                }
                v(Collections.singletonList(p(l38Var)));
            }
            return false;
        }
    }

    public synchronized l38 m(l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l38) ipChange.ipc$dispatch("2381965b", new Object[]{this, l38Var});
        }
        DXTemplateItem p2 = p(l38Var);
        if (p2 == null) {
            return null;
        }
        return t(w(p2));
    }

    public ze7 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.c;
    }

    public DinamicXEngine o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("7090b081", new Object[]{this});
        }
        return this.e;
    }

    public final DXTemplateItem p(l38 l38Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("43932ebc", new Object[]{this, l38Var});
        }
        if (l38Var == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = l38Var.a();
        dXTemplateItem.b = l38Var.c();
        dXTemplateItem.c = l38Var.b();
        return dXTemplateItem;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public final synchronized void r(k66 k66Var) {
        List<s> list;
        List<s> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda25ba", new Object[]{this, k66Var});
            return;
        }
        List<DXTemplateItem> list3 = k66Var.b;
        if (list3 != null && !list3.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : k66Var.b) {
                tgh.b("DinamicXEngine", "failedTemplateItem: " + dXTemplateItem.toString());
                String e2 = e(dXTemplateItem);
                if (!TextUtils.isEmpty(e2) && (list2 = (List) ((ConcurrentHashMap) this.f).get(e2)) != null) {
                    for (s sVar : list2) {
                        L(new i(sVar, t(dXTemplateItem)), !(sVar instanceof u));
                    }
                    list2.clear();
                }
            }
        }
        List<DXTemplateItem> list4 = k66Var.f22428a;
        if (list4 != null && !list4.isEmpty()) {
            for (DXTemplateItem dXTemplateItem2 : k66Var.f22428a) {
                String e3 = e(dXTemplateItem2);
                if (!TextUtils.isEmpty(e3) && (list = (List) ((ConcurrentHashMap) this.f).get(e3)) != null) {
                    for (s sVar2 : list) {
                        L(new j(sVar2, t(dXTemplateItem2)), !(sVar2 instanceof u));
                    }
                    list.clear();
                }
            }
        }
    }

    public final boolean s(l38 l38Var, l38 l38Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16735d95", new Object[]{this, l38Var, l38Var2})).booleanValue();
        }
        if (l38Var == null || l38Var2 == null || !TextUtils.equals(l38Var.a(), l38Var2.a()) || l38Var.c() != l38Var2.c()) {
            return false;
        }
        return true;
    }

    public final DXResult<DXRootView> u(DXTemplateItem dXTemplateItem, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("5c37aa12", new Object[]{this, dXTemplateItem, viewGroup});
        }
        return this.d.g(this.f18709a, viewGroup, dXTemplateItem);
    }

    public final void v(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72f75ca", new Object[]{this, list});
        } else {
            this.d.h(list);
        }
    }

    public final DXTemplateItem w(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1015357a", new Object[]{this, dXTemplateItem});
        }
        return this.d.i(dXTemplateItem);
    }

    public final DXResult<DXRootView> x(DXRootView dXRootView, int i2, int i3, JSONObject jSONObject, fl6 fl6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("3d5636eb", new Object[]{this, dXRootView, new Integer(i2), new Integer(i3), jSONObject, fl6Var});
        }
        return this.e.i1(this.f18709a, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.b().G(i2).t(i3).E(fl6Var).q());
    }

    public void y(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f64163", new Object[]{this, dXRootView});
        } else {
            this.e.t0(dXRootView);
        }
    }

    public void z(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db36825", new Object[]{this, dXRootView});
        } else {
            this.e.u0(dXRootView);
        }
    }

    public eo7() {
        this.f = new ConcurrentHashMap(0);
        this.g = new h();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f18726a;
        public final ze7 b;
        public final String c;
        public int d;
        public String e;

        static {
            t2o.a(912261740);
        }

        public q(Context context, String str) {
            this.f18726a = context;
            this.c = str;
        }

        public static /* synthetic */ Context a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("261464ea", new Object[]{qVar});
            }
            return qVar.f18726a;
        }

        public static /* synthetic */ ze7 b(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ze7) ipChange.ipc$dispatch("9aefbda7", new Object[]{qVar});
            }
            return qVar.b;
        }

        public static /* synthetic */ boolean c(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("75fc9178", new Object[]{qVar})).booleanValue();
            }
            qVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean d(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9aabc39", new Object[]{qVar})).booleanValue();
            }
            qVar.getClass();
            return false;
        }

        public static /* synthetic */ int e(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd58e6e9", new Object[]{qVar})).intValue();
            }
            qVar.getClass();
            return 2;
        }

        public static /* synthetic */ String f(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bb5fa7c9", new Object[]{qVar});
            }
            return qVar.e;
        }

        public static /* synthetic */ int g(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44b53c6b", new Object[]{qVar})).intValue();
            }
            return qVar.d;
        }

        public static /* synthetic */ String h(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9acc687", new Object[]{qVar});
            }
            return qVar.c;
        }

        public eo7 i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eo7) ipChange.ipc$dispatch("20b44432", new Object[]{this});
            }
            return new eo7(this, null);
        }

        public q j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("e650a1cd", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public q k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("3cebcf27", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public q(Context context, ze7 ze7Var, String str) {
            this.f18726a = context;
            this.b = ze7Var;
            this.c = str;
        }
    }

    public eo7(q qVar) {
        this.f = new ConcurrentHashMap(0);
        this.g = new h();
        this.f18709a = q.a(qVar);
        ze7 b2 = q.b(qVar);
        this.c = b2;
        this.b = b2 == null ? new Handler(Looper.getMainLooper()) : null;
        DXVideoControlConfig<iew> n2 = DXVideoControlConfig.n();
        try {
            IpChange ipChange = DXVideoViewWidgetNode.$ipChange;
            n2.l(DXVideoViewWidgetNode.class);
            n2.c(true);
        } catch (Throwable th) {
            tgh.c("DinamicXEngine", "find DXVideoViewWidgetNode error", th);
        }
        com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s(new DXEngineConfig.b(q.h(qVar)).X(q.g(qVar)).Y(q.f(qVar)).Q(q.e(qVar)).P(q.d(qVar)).g0(q.c(qVar)).W(true).i0(n2).H(true, true).F());
        this.d = sVar;
        this.e = sVar.k();
        sVar.t(this.g);
        q();
    }
}

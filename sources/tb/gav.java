package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.event.CommonRequestSubscriber;
import com.alibaba.android.ultron.event.ext.MtopV2Subscriber;
import com.alibaba.android.ultron.event.ext.UltronPopV2Subscriber;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.megadesign.dx.view.DXMarqueeTextViewWidgetNode;
import com.taobao.android.megadesign.dx.view.DXTBScrollerLayoutPlus;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;
import com.taobao.android.order.core.dinamicX.parser.TDApplyRichCssParser;
import com.taobao.android.order.core.dinamicX.view.DXBBOrderDatePickerViewWidgetNode;
import com.taobao.android.order.core.performance.OrderUltronInstanceFactory;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taobao.R;
import com.ut.share.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.gdl;
import tb.idl;
import tb.j10;
import tb.k6v;
import tb.lht;
import tb.ojv;
import tb.vcu;
import tb.w9v;
import tb.yun;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gav implements wqb, czb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronProxy";

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.a f19842a;
    public Context b;
    public OrderConfigs c;
    public k4d d;
    public s3o e;
    public u55 f;
    public u3o g;
    public pqb h;
    public boolean i;
    public boolean j;
    public eji k;
    public boolean l;
    public boolean m;
    public to7 n;
    public qcl o;
    public final Map<String, rtd> s;
    public final Map<Long, ob5> t;
    public final Map<Long, DXWidgetNode> u;
    public final Map<Long, nb5> w;
    public long p = 0;
    public boolean q = false;
    public final Map<String, z9e> r = new HashMap();
    public final lt5 v = new lt5();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements jc4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.android.ultron.vfw.instance.a f19843a;

        /* compiled from: Taobao */
        /* renamed from: tb.gav$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0933a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IDMComponent f19844a;
            public final /* synthetic */ Map b;

            public RunnableC0933a(IDMComponent iDMComponent, Map map) {
                this.f19844a = iDMComponent;
                this.b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.c(a.this, this.f19844a, this.b);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IDMComponent f19845a;
            public final /* synthetic */ Map b;

            public b(IDMComponent iDMComponent, Map map) {
                this.f19845a = iDMComponent;
                this.b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.c(a.this, this.f19845a, this.b);
                }
            }
        }

        public a(com.alibaba.android.ultron.vfw.instance.a aVar) {
            this.f19843a = aVar;
        }

        public static /* synthetic */ void c(a aVar, IDMComponent iDMComponent, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50596722", new Object[]{aVar, iDMComponent, map});
            } else {
                aVar.d(iDMComponent, map);
            }
        }

        @Override // tb.jc4
        public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3caeab4", new Object[]{this, viewGroup, new Integer(i), map});
            }
        }

        @Override // tb.jc4
        public void b(RecyclerViewHolder recyclerViewHolder, IDMComponent iDMComponent, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e613c21", new Object[]{this, recyclerViewHolder, iDMComponent, map});
            } else if (gav.r(gav.this)) {
                gav.t(gav.this).g(new RunnableC0933a(iDMComponent, map));
            } else if (gav.u(gav.this)) {
                jb6.n(new b(iDMComponent, map));
            } else {
                d(iDMComponent, map);
            }
        }

        public final void d(IDMComponent iDMComponent, Map<String, Object> map) {
            Map<String, List<gsb>> eventMap;
            List<gsb> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6beca7e5", new Object[]{this, iDMComponent, map});
            } else if (iDMComponent != null && (eventMap = iDMComponent.getEventMap()) != null && (list = eventMap.get("exposureItemV2")) != null) {
                oml.c(this.f19843a, "exposureItemV2", iDMComponent);
                for (int i = 0; i < list.size(); i++) {
                    gsb gsbVar = list.get(i);
                    if (gsbVar != null) {
                        String type = gsbVar.getType();
                        if (!TextUtils.isEmpty(type)) {
                            b8v t = this.f19843a.getEventHandler().e().t(type);
                            t.p(iDMComponent);
                            if (map != null) {
                                t.v(map);
                            }
                            t.A("exposureItemV2");
                            t.r(gsbVar);
                            UnifyLog.e(gav.TAG, "component exposure item:" + type + ", " + iDMComponent.getKey());
                            this.f19843a.getEventHandler().k(t);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends lmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(gav gavVar, String str, ppi ppiVar) {
            super(str, ppiVar);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1467730997) {
                super.c(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/container/ultron/UltronProxy$2");
        }

        @Override // tb.lmi
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else {
                super.c(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements yun.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(b8v b8vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("135f40e7", new Object[]{this, b8vVar});
            } else {
                gav.this.Y(b8vVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements p5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends n6v {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/container/ultron/UltronProxy$4$1");
            }

            @Override // tb.n6v
            public void I(b8v b8vVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
                } else {
                    gav.this.Y(b8vVar);
                }
            }
        }

        public d() {
        }

        public void a(com.alibaba.android.ultron.vfw.instance.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27b4496", new Object[]{this, aVar});
                return;
            }
            aVar.getEventHandler().q("refreshOrder", new a());
            gav.this.V(aVar);
            gav.v(gav.this);
            gav.w(gav.this).g(gav.this.c);
            gav.x(gav.this, aVar);
            gav.y(gav.this, aVar);
            for (String str : gav.z(gav.this).keySet()) {
                aVar.a0(str, (z9e) gav.z(gav.this).get(str));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f19848a;
        public final /* synthetic */ int b;

        public e(View view, int i) {
            this.f19848a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ((RecyclerView) this.f19848a).smoothScrollToPosition(this.b);
            } catch (Exception e) {
                ldv.e(gav.this.f19842a.getContext(), e.toString(), "SCROLL_BY_KEY_ERROR", null);
                kor.d(gav.TAG, "SCROLL_BY_KEY_ERROR", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f19849a = false;
        public final /* synthetic */ String b;
        public final /* synthetic */ ojd c;
        public final /* synthetic */ j10.a d;
        public final /* synthetic */ k4d e;
        public final /* synthetic */ a.h f;
        public final /* synthetic */ long g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f19851a = 0;
            public final /* synthetic */ MtopResponse b;
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;
            public final /* synthetic */ Map e;
            public final /* synthetic */ fsb f;

            public b(MtopResponse mtopResponse, int i, Object obj, Map map, fsb fsbVar) {
                this.b = mtopResponse;
                this.c = i;
                this.d = obj;
                this.e = map;
                this.f = fsbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gav gavVar = gav.this;
                if (!(gavVar instanceof UltronListProxy) || !gavVar.c.y() || !gav.this.c.w() || gav.this.c.a() || (i = this.f19851a) >= 3) {
                    f fVar = f.this;
                    fVar.f19849a = true;
                    gav.v(gav.this);
                    idl.e(idl.b.o(f.this.b, this.b.getApi(), true).m(System.currentTimeMillis() - f.this.g).message(f.this.b).n(r9v.a(this.b)).sampling(0.001f));
                    gav.this.c.W("");
                    if (c2u.j(gav.this.f19842a.w())) {
                        this.b.setRetCode("ReturnH5");
                        this.b.setRetMsg(Localization.q(R.string.order_biz_server_error));
                        f.this.c.a(this.c, this.b, this.d, false, this.e);
                        f.this.d.f("code", "ReturnH5");
                        f.this.d.b();
                        return;
                    }
                    gav.this.f19842a.getEventHandler().h(gav.this.f19842a.w().getComponents(), lur.EVENT_LOAD_SUCCESS);
                    f.this.d.a(null);
                    vel k = gav.this.c.k();
                    if (k != null) {
                        if (gav.this.l) {
                            k.k();
                        }
                        k.f().put("response_render_start_time", Long.valueOf(System.currentTimeMillis()));
                    }
                    f fVar2 = f.this;
                    gav.this.f19842a.T(fVar2.f);
                    f.this.d.h(null);
                    gav gavVar2 = gav.this;
                    gavVar2.T(gavVar2.b);
                    if (k != null) {
                        k.f().put("response_render_end_time", Long.valueOf(System.currentTimeMillis()));
                    }
                    ojd ojdVar = f.this.c;
                    if (ojdVar != null) {
                        ojdVar.b(this.c, this.b, this.d, this.f, this.e);
                    }
                    f.this.d.g(null).b();
                    return;
                }
                this.f19851a = i + 1;
                pav.i(this, 40L);
            }
        }

        public f(String str, ojd ojdVar, j10.a aVar, k4d k4dVar, a.h hVar, long j) {
            this.b = str;
            this.c = ojdVar;
            this.d = aVar;
            this.e = k4dVar;
            this.f = hVar;
            this.g = j;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            if (str.hashCode() == -624279674) {
                super.c((List) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/container/ultron/UltronProxy$6");
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                pav.i(new b(mtopResponse, i, obj, map, fsbVar), 0L);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f19850a = 0;
            public final /* synthetic */ List b;

            public a(List list) {
                this.b = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hav.d("orderAttachedResponses", "主响应：" + f.this.f19849a);
                f fVar = f.this;
                if (!fVar.f19849a && (i = this.f19850a) <= 3) {
                    this.f19850a = i + 1;
                    hav.d("orderAttachedResponses", "retry count: " + this.f19850a);
                    pav.i(this, 50L);
                } else if (c2u.m(this.b, gav.this.f19842a.w())) {
                    gav.this.f19842a.getEventHandler().h(gav.this.f19842a.w().getComponents(), null);
                    f fVar2 = f.this;
                    gav.this.f19842a.T(fVar2.f);
                    gav.this.f19842a.V(127);
                    f.this.f19849a = false;
                    hav.d("orderAttachedResponses", "doRebuild");
                }
            }
        }

        @Override // tb.ux
        public void c(List<JSONObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daca3f86", new Object[]{this, list});
                return;
            }
            super.c(list);
            k4d k4dVar = this.e;
            if (!(k4dVar instanceof qho) && !(k4dVar instanceof zpq)) {
                return;
            }
            if (uel.l("verifyViceResponse", true)) {
                pav.i(new a(list), 0L);
            } else if (c2u.m(list, gav.this.f19842a.w())) {
                gav.this.f19842a.getEventHandler().h(gav.this.f19842a.w().getComponents(), null);
                gav.this.f19842a.T(this.f);
                gav.this.f19842a.V(127);
            }
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            idl.e(idl.b.o(this.b, mtopResponse.getApi(), false).message(mtopResponse.getRetMsg()).n(r9v.a(mtopResponse)).sampling(1.0f));
            gav.v(gav.this);
            vel k = gav.this.c.k();
            if (k != null) {
                k.e(true, false, "网络请求错误");
            }
            if (gav.A(gav.this, mtopResponse)) {
                mtopResponse.setRetCode(ncl.CODE_REDIRECT_302);
                mtopResponse.setRetMsg(ncl.CODE_REDIRECT_ERROR_MSG);
            }
            ojd ojdVar = this.c;
            if (ojdVar != null) {
                ojdVar.a(i, mtopResponse, obj, z, map);
            }
            gav.this.c.W("");
            j10.a aVar = this.d;
            aVar.e("onError-" + mtopResponse.getRetMsg());
            this.d.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g implements a.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f19852a;
        public final boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f19853a;
            public boolean b;

            static {
                t2o.a(614465649);
            }

            public static /* synthetic */ boolean a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("30e5ac20", new Object[]{aVar})).booleanValue();
                }
                return aVar.f19853a;
            }

            public static /* synthetic */ boolean b(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f71034e1", new Object[]{aVar})).booleanValue();
                }
                return aVar.b;
            }

            public g c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (g) ipChange.ipc$dispatch("ad2e0e6d", new Object[]{this});
                }
                return new g(this, null);
            }

            public a d(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("14e58015", new Object[]{this, new Boolean(z)});
                }
                this.f19853a = z;
                return this;
            }

            public a e(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("b8589c32", new Object[]{this, new Boolean(z)});
                }
                this.b = z;
                return this;
            }
        }

        static {
            t2o.a(614465648);
            t2o.a(157286653);
        }

        public /* synthetic */ g(a aVar, a aVar2) {
            this(aVar);
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.h
        public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
            JSONObject containerInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            } else if (u55Var != null && list != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        JSONObject fields = iDMComponent.getFields();
                        if (!b(fields)) {
                            if (c(fields)) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(iDMComponent);
                            } else {
                                String h = ParseModule.h(iDMComponent);
                                if ("footer".equals(h)) {
                                    arrayList3.add(iDMComponent);
                                } else if ("header".equals(h)) {
                                    if (!this.b || (containerInfo = iDMComponent.getContainerInfo()) == null || (!"new_ol3_orderlisttabs".equals(containerInfo.getString("name")) && !"ol3_orderlisttabs".equals(containerInfo.getString("name")))) {
                                        arrayList2.add(iDMComponent);
                                    } else {
                                        arrayList.addAll(arrayList2);
                                        arrayList2.clear();
                                    }
                                } else if ("background".equalsIgnoreCase(h)) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(iDMComponent);
                                }
                            }
                        }
                    }
                    arrayList4.add(iDMComponent);
                }
                et6Var.s(arrayList);
                et6Var.q(arrayList2);
                et6Var.o(arrayList3);
                et6Var.l(arrayList4);
                et6Var.p(arrayList5);
                et6Var.k(arrayList6);
            }
        }

        public final boolean c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7cd2bf2f", new Object[]{this, jSONObject})).booleanValue();
            }
            if (jSONObject != null && jSONObject.containsKey("globalFloatFlag") && jSONObject.getBoolean("globalFloatFlag").booleanValue()) {
                return true;
            }
            return false;
        }

        public g(a aVar) {
            this.f19852a = a.a(aVar);
            this.b = a.b(aVar);
        }

        public final boolean b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7478ee74", new Object[]{this, jSONObject})).booleanValue();
            }
            return this.f19852a && jSONObject != null && jSONObject.containsKey("isAsyncComponent") && jSONObject.getBoolean("isAsyncComponent").booleanValue();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h implements ojd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<pqb> f19854a;
        public final WeakReference<gav> b;

        static {
            t2o.a(614465650);
            t2o.a(83886128);
        }

        public h(gav gavVar, pqb pqbVar) {
            this.f19854a = new WeakReference<>(pqbVar);
            this.b = new WeakReference<>(gavVar);
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            gav gavVar;
            PageStatus pageStatus;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            pqb pqbVar = this.f19854a.get();
            if (pqbVar != null && (gavVar = this.b.get()) != null) {
                if (gavVar.K() == null) {
                    pageStatus = PageStatus.FIRST_PAGE;
                } else {
                    pageStatus = PageStatus.NEXT_PAGE;
                }
                pqbVar.X("", mtopResponse, DataStatus.ERROR_DATA, pageStatus);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            gav gavVar;
            DataStatus dataStatus;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            pqb pqbVar = this.f19854a.get();
            if (pqbVar != null && (gavVar = this.b.get()) != null) {
                if ((fsbVar instanceof u55) && !db4.a((u55) fsbVar)) {
                    z = jr6.a(fsbVar);
                }
                PageStatus s = gav.s(gavVar.K(), "1".equals(gavVar.I().j().get("page")));
                if (z) {
                    dataStatus = DataStatus.EMPTY_DATA;
                } else {
                    dataStatus = DataStatus.NORMAL_DATA;
                }
                pqbVar.h2(mtopResponse, dataStatus, s);
                gavVar.b0((u55) fsbVar);
            }
        }
    }

    static {
        t2o.a(614465636);
        t2o.a(297795604);
        t2o.a(297795641);
    }

    public gav() {
        HashMap hashMap = new HashMap();
        this.s = hashMap;
        hashMap.put("request", new CommonRequestSubscriber().F("UNIT_TRADE"));
        hashMap.put("toastV2", new j1u());
        hashMap.put("alertV2", new zk0());
        hashMap.put("alertWithOpenUrlV2", new el0());
        hashMap.put("refreshMtopV2", new c8j());
        hashMap.put("closePageV2", new fw3());
        hashMap.put("refreshPageV2", new yun(new c()));
        hashMap.put("updateAsyncStatusV2", new cjv());
        hashMap.put("asyncRefreshV2", new se1());
        hashMap.put("updateComponentV2", new fjv());
        hashMap.put("refreshComponentV2", new jun());
        hashMap.put("batchUpdateComponentV2", new i52());
        hashMap.put("remoteUltronPopV2", new gzn());
        hashMap.put("alertWithRefreshMtopV2", new cl0());
        hashMap.put("mtopWithOpenUrlV2", new e8j());
        hashMap.put("userTrackV2", new uuv());
        hashMap.put("asyncUserTrackV2", new cf1());
        hashMap.put("copyV2", new rt4());
        hashMap.put("removeComponentV2", new ozn());
        hashMap.put("sendMsgV2", new vap());
        hashMap.put("inSimpleConditionV2", new vse());
        hashMap.put("foldComponentV2", new ss9());
        hashMap.put("weexPopV2", new q7x());
        hashMap.put("addBagAgainV2", new be0());
        hashMap.put("delOrderV2", new ca7());
        hashMap.put("openUrlV2", new tel());
        hashMap.put(njh.SUBSCRIBER_ID, new njh());
        hashMap.put(qvp.SUBSCRIBER_ID, new qvp());
        hashMap.put(mc1.SUBSCRIBER_ID, new mc1());
        hashMap.put("doBatchPayCheckV2", new js7());
        hashMap.put("addCartV2", new qe0());
        hashMap.put(gd3.TAG, new gd3());
        hashMap.put("receiveMsgV2", new xln());
        hashMap.put("dismissPopV2", new y7v());
        hashMap.put("scrollComponentV2", new mvy());
        hashMap.put(jdl.SUBSCRIBER_ID, new jdl());
        hashMap.put(ks7.SUBSCRIBER_ID, new ks7());
        hashMap.put(vhv.SUBSCRIBER_ID, new vhv());
        hashMap.put(uhv.SUBSCRIBER_ID, new uhv());
        hashMap.put("ultronUpdateUTPageProperties", new ocv());
        hashMap.put("ultronPopV2", new UltronPopV2Subscriber().J(new d()));
        HashMap hashMap2 = new HashMap();
        this.t = hashMap2;
        HashMap hashMap3 = new HashMap();
        this.u = hashMap3;
        HashMap hashMap4 = new HashMap();
        this.w = hashMap4;
        hashMap3.put(-7827222248633552986L, new n36());
        if (!cdl.c()) {
            hashMap3.put(Long.valueOf((long) q86.DX_PRICE_VIEW), new q86());
        }
        hashMap3.put(Long.valueOf((long) db6.DX_WIDGET_ID), new db6());
        DXWidgetNode dXWidgetNode = (DXWidgetNode) mcl.b("com.taobao.android.order.core.dinamicX.view.DXAMapViewWidgetNode");
        if (dXWidgetNode != null) {
            hashMap3.put(-8295092662641575934L, dXWidgetNode);
        }
        hashMap3.put(Long.valueOf((long) x86.DXQRCODEIMAGEVIEW_QRCODEIMAGEVIEW), new x86());
        hashMap3.put(Long.valueOf((long) x36.DXMAPIMAGEVIEW_MAPIMAGEVIEW), new x36());
        hashMap3.put(Long.valueOf((long) DXTBScrollerLayoutPlus.DXTBORDERSCROLLERLAYOUT_TBORDERSCROLLERLAYOUT), new rd6());
        hashMap3.put(Long.valueOf((long) DXMarqueeTextViewWidgetNode.DXORDERMARQUEETEXTVIEW_ORDERMARQUEETEXTVIEW), new DXMarqueeTextViewWidgetNode());
        hashMap3.put(Long.valueOf((long) DXBBOrderDatePickerViewWidgetNode.DXBBORDERDATEPICKERVIEW_BBORDERDATEPICKERVIEW), new DXBBOrderDatePickerViewWidgetNode());
        hashMap2.put(Long.valueOf((long) kg5.DX_EVENT_CLOSE_ACTIVITY), new kg5());
        hashMap2.put(Long.valueOf((long) lf6.DX_EVENT_TABCHANGE), new lf6());
        hashMap4.put(Long.valueOf((long) TDApplyRichCssParser.DX_PARSER_ID), new TDApplyRichCssParser());
        hashMap4.put(Long.valueOf((long) v1s.DX_PARSER_ID), new v1s());
        hashMap4.put(Long.valueOf((long) tk5.DX_PARSER_GETCURRENTINDEX), new tk5());
        hashMap4.put(Long.valueOf((long) ihy.DX_PARSER_CHARSEQUENCETOSTRING), new ihy());
        hashMap4.put(Long.valueOf((long) mt5.DX_PARSER_ULTRONLOCALDATA), new mt5());
        hashMap4.put(Long.valueOf((long) a7j.MTOP_RETMSGDATA_PARSER), new a7j());
        hashMap4.put(Long.valueOf((long) dw9.FORMAT_MTOPDATA_PARSER), new dw9());
        hashMap4.put(Long.valueOf((long) qq5.DX_PARSER_STRTOJSONOBJECT), new qq5());
        hashMap4.put(Long.valueOf((long) uo5.DX_PARSER_OBJECTTOJSONSTR), new uo5());
        hashMap4.put(Long.valueOf((long) iq5.DX_PARSER_SPLITSTRING), new iq5());
        hashMap4.put(Long.valueOf((long) vs5.DX_PARSER_TOFLEXLAYOUTARRAY), new vs5());
        hashMap4.put(Long.valueOf((long) ap5.DX_PARSER_ORDERNAVBARHEIGHT), new ap5());
        hashMap4.put(Long.valueOf((long) cl5.DX_PARSER_GETMAPKEYLIST), new cl5());
        hashMap4.put(Long.valueOf((long) bl5.DX_PARSER_GETINDEXBYID), new bl5());
        hashMap4.put(Long.valueOf((long) bp5.DX_PARSER_ORDERURLENCODE), new bp5());
        hashMap4.put(Long.valueOf((long) el5.DX_PARSER_GETPAGEURL), new el5());
        hashMap4.put(Long.valueOf((long) jp5.DX_PARSER_RNOTIFICATIONSENABLED), new jp5());
        hashMap4.put(Long.valueOf((long) n76.DX_PARSER_ORDERISINTERNALNETWORK), new n76());
        hashMap4.put(Long.valueOf((long) yp5.DX_PARSER_RESOLVE_WIDTH), new yp5());
        hashMap4.put(Long.valueOf((long) al5.DX_GETIMAGEBIZINFO), new al5());
        hashMap3.put(e76.DX_ORDER_MORE_BUTTON, new e76());
        hashMap4.put(Long.valueOf((long) gl5.DX_PARSER_GETSCREENHEIGHT), new gl5());
        hashMap4.put(Long.valueOf((long) cp5.DX_PARSER_PARAMINPAGEURL), new cp5());
        hashMap4.put(Long.valueOf((long) zo5.DX_PARSER_ORDERLISTGETBODYHEIGHT), new zo5());
        hashMap4.put(Long.valueOf((long) rt5.DX_PARSER_ULTRONTBVERSIONGREATEREQUAL), new rt5());
    }

    public static /* synthetic */ boolean A(gav gavVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7296236f", new Object[]{gavVar, mtopResponse})).booleanValue();
        }
        return gavVar.R(mtopResponse);
    }

    public static PageStatus J(u55 u55Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStatus) ipChange.ipc$dispatch("2b98d96d", new Object[]{u55Var, new Boolean(z)});
        }
        if (z) {
            return PageStatus.FIRST_PAGE;
        }
        if (!db4.a(u55Var)) {
            return PageStatus.LAST_PAGE;
        }
        return PageStatus.NEXT_PAGE;
    }

    public static /* synthetic */ boolean r(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a5c1761", new Object[]{gavVar})).booleanValue();
        }
        return gavVar.i;
    }

    public static /* synthetic */ PageStatus s(u55 u55Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStatus) ipChange.ipc$dispatch("de6f3544", new Object[]{u55Var, new Boolean(z)});
        }
        return J(u55Var, z);
    }

    public static /* synthetic */ eji t(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("597b1cb4", new Object[]{gavVar});
        }
        return gavVar.k;
    }

    public static /* synthetic */ boolean u(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dda08aa4", new Object[]{gavVar})).booleanValue();
        }
        return gavVar.j;
    }

    public static /* synthetic */ void v(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9620661", new Object[]{gavVar});
        } else {
            gavVar.G();
        }
    }

    public static /* synthetic */ to7 w(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (to7) ipChange.ipc$dispatch("d40bb134", new Object[]{gavVar});
        }
        return gavVar.n;
    }

    public static /* synthetic */ void x(gav gavVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1d17d1", new Object[]{gavVar, aVar});
        } else {
            gavVar.X(aVar);
        }
    }

    public static /* synthetic */ void y(gav gavVar, com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93cc5c92", new Object[]{gavVar, aVar});
        } else {
            gavVar.M(aVar);
        }
    }

    public static /* synthetic */ Map z(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce1a32da", new Object[]{gavVar});
        }
        return gavVar.r;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67d8e858", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final bx6 D() {
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bx6) ipChange.ipc$dispatch("a5d120a1", new Object[]{this});
        }
        if (wbl.d()) {
            g.a aVar = new g.a();
            if (this.c.r() == null) {
                z2 = false;
            }
            return new rn2(aVar.e(z2).d(false).c());
        }
        g.a d2 = new g.a().d(false);
        if (this.c.r() != null) {
            z = true;
        }
        return new jcl(d2.e(z).c(), this.c.d());
    }

    public final void F(Context context) {
        z7v z7vVar;
        DXEngineConfig.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e65467c", new Object[]{this, context});
            return;
        }
        UltronInstanceConfig B = new UltronInstanceConfig().z(this.c.c().getBizName()).B(2);
        B.F(this.c.s());
        B.D(this.c.t());
        OrderConfigs.BizNameType c2 = this.c.c();
        OrderConfigs.BizNameType bizNameType = OrderConfigs.BizNameType.ORDER_LIST;
        if (c2 == bizNameType && wbl.h()) {
            B.C(true);
        } else if (this.c.c() == OrderConfigs.BizNameType.ORDER_DETAIL && wbl.g()) {
            B.C(true);
        }
        if (bizNameType.equals(this.c.c())) {
            bVar = new DXEngineConfig.b(bizNameType.getBizName());
            bVar.U(cdl.c());
            bVar.K(cdl.b());
            z7vVar = new z7v.b().m(wbl.t()).o(wbl.q()).l(bVar).i();
            B.E(wbl.w());
        } else {
            bVar = new DXEngineConfig.b(OrderConfigs.BizNameType.ORDER_DETAIL.getBizName());
            z7vVar = new z7v.b().l(bVar).i();
        }
        if (ykl.a()) {
            bVar.H(true, true);
        }
        B.G(z7vVar);
        this.f19842a = com.alibaba.android.ultron.vfw.instance.a.q(B, context);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee01a92", new Object[]{this});
            return;
        }
        qcl qclVar = this.o;
        if (qclVar != null) {
            qclVar.i(false);
        }
        to7 to7Var = this.n;
        if (to7Var != null) {
            to7Var.h(false);
        }
        Q();
    }

    public final String H(OrderConfigs.BizNameType bizNameType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e21ae8d", new Object[]{this, bizNameType});
        }
        if (bizNameType != OrderConfigs.BizNameType.ORDER_DETAIL) {
            return OrderBizCode.orderList;
        }
        u3o u3oVar = this.g;
        if (u3oVar == null || !u3oVar.q()) {
            return OrderBizCode.orderDetail;
        }
        return OrderBizCode.logisticsDetail;
    }

    public u3o I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("930f067e", new Object[]{this});
        }
        return this.g;
    }

    public u55 K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("4b62b487", new Object[]{this});
        }
        return this.f;
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace60d81", new Object[]{this});
        } else {
            h(ojv.UPDATEDXROOTHEIGHT, new ojv.a());
        }
    }

    public final void M(com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a098674", new Object[]{this, aVar});
        } else {
            aVar.o0(new a(aVar));
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63367cc", new Object[]{this});
            return;
        }
        if (this.f19842a.G() != null) {
            this.f19842a.G().t1(false);
        }
        if (!this.q) {
            V(this.f19842a);
            X(this.f19842a);
            O(this.f19842a);
            L();
            this.q = true;
        }
    }

    public final void O(com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f288b77", new Object[]{this, aVar});
        } else {
            aVar.g().b(new b(this, "postUltronEvent", aVar.g()));
        }
    }

    public void T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13aefce", new Object[]{this, context});
        }
    }

    public void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103d1c82", new Object[]{this, jSONObject});
        }
    }

    public void V(com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f4b6df", new Object[]{this, aVar});
            return;
        }
        for (Long l : ((HashMap) this.u).keySet()) {
            aVar.C0(l.longValue(), (qub) ((HashMap) this.u).get(l));
            d48.INSTANCE.d(String.valueOf(l), "NAME_SPACE_BABEL_ORDER", ((HashMap) this.u).get(l));
        }
        if (cdl.c()) {
            DinamicXEngine k = aVar.G().Q().b().k();
            k.P0(ce5.u(), new ce5(this.b));
            k.Q0(q86.DX_PRICE_VIEW, new q86());
            k.P0(7700670404894374791L, new be5());
            k.Q0(7700670404894374791L, new we6());
        }
        for (Long l2 : ((HashMap) this.t).keySet()) {
            aVar.A0(l2.longValue(), (mvb) ((HashMap) this.t).get(l2));
            c28.INSTANCE.d(String.valueOf(l2), "NAME_SPACE_BABEL_ORDER", ((HashMap) this.t).get(l2));
        }
        for (Long l3 : ((HashMap) this.w).keySet()) {
            aVar.B0(l3.longValue(), (evb) ((HashMap) this.w).get(l3));
            y28.INSTANCE.d(String.valueOf(l3), "NAME_SPACE_BABEL_ORDER", ((HashMap) this.w).get(l3));
        }
        y28.INSTANCE.d(String.valueOf((long) lt5.DX_PARSER_ULTRONGLOBALDATA), "NAME_SPACE_BABEL_ORDER", this.v);
        aVar.A0(bdl.DX_EVENT_DXCUSTOMEVENT, new bdl());
        to7 to7Var = new to7(aVar, null);
        this.n = to7Var;
        aVar.A0(to7.DX_EVENT_HANDLEDINAMICXPAGEEVENT, to7Var);
        if (wbl.s()) {
            qcl qclVar = new qcl();
            this.o = qclVar;
            aVar.A0(mv5.DX_EVENT_EVENTCHAIN, qclVar);
        }
        kor.a(TAG, "registerDX3Info", "----");
    }

    public final void X(com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fea6e5", new Object[]{this, aVar});
            return;
        }
        for (String str : ((HashMap) this.s).keySet()) {
            aVar.getEventHandler().q(str, (rtd) ((HashMap) this.s).get(str));
            if (((HashMap) this.s).get(str) instanceof n6v) {
                aVar.A().b().k().v().i(((n6v) ((HashMap) this.s).get(str)).B(), new k6v.a(aVar, str));
                if (!"refreshPageV2".equals(str) && !"ultronPopV2".equals(str)) {
                    g8v.INSTANCE.d(str, "NAME_SPACE_BABEL_ORDER", (n6v) ((HashMap) this.s).get(str));
                }
            }
        }
        boolean A = wbl.A();
        DinamicXEngine k = aVar.A().b().k();
        hd0 d2 = id0.a().a(k).b(k).d(k, aVar.getEventHandler());
        if (A) {
            d2.c(aVar.getEventHandler());
        } else {
            aVar.getEventHandler().t(new s07());
        }
        W(aVar);
        kor.a(TAG, "registerUltronEvents", "----");
    }

    public void Y(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95786aa", new Object[]{this, b8vVar});
        } else if (this.f19842a != null) {
            kor.a(TAG, "reload", "----");
            pqb pqbVar = this.h;
            if (pqbVar != null) {
                pqbVar.B1(E(b8vVar));
            } else {
                g(this.g, pqbVar);
            }
        }
    }

    @Override // tb.wqb
    public void a(Long l, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1e30ed", new Object[]{this, l, dXWidgetNode});
        } else if (this.f19842a != null) {
            kor.a(TAG, "registerDXView", l.toString(), "", null);
            this.f19842a.C0(l.longValue(), dXWidgetNode);
            ((HashMap) this.u).put(l, dXWidgetNode);
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215c1379", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar != null) {
            aVar.l0();
            this.f19842a.w().m0();
            k4d k4dVar = this.d;
            if (k4dVar != null) {
                k4dVar.cancel();
            }
        }
    }

    @Override // tb.wqb
    public void b(String str, rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e963b7", new Object[]{this, str, rtdVar});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar != null && aVar.getEventHandler() != null) {
            kor.a(TAG, "registerEvent", str.toString(), "", null);
            this.f19842a.getEventHandler().q(str, rtdVar);
            if (rtdVar instanceof n6v) {
                n6v n6vVar = (n6v) rtdVar;
                this.f19842a.getEventHandler().q(n6vVar.B(), n6vVar);
                h(n6vVar.B(), new k6v.a(this.f19842a, str));
            }
            ((HashMap) this.s).put(str, rtdVar);
        }
    }

    public void b0(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317258a9", new Object[]{this, u55Var});
        } else {
            this.f = u55Var;
        }
    }

    @Override // tb.wqb
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76b821", new Object[]{this, new Integer(i)});
        } else if (this.f19842a != null) {
            kor.a(TAG, "rebuild", "----");
            this.f19842a.V(i);
        }
    }

    @Override // tb.wqb
    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e4c18", new Object[]{this, str, jSONObject});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar != null) {
            try {
                aVar.A().b().k().v().d().b(str, jSONObject);
            } catch (NullPointerException e2) {
                kor.d(TAG, "postToAbilityMsgCenter", e2);
            }
        }
    }

    @Override // tb.wqb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        s3o s3oVar = this.e;
        if (s3oVar != null) {
            s3oVar.b();
            this.e = null;
        }
        if (this.f19842a != null) {
            kor.a(TAG, "destroy", "----");
            this.f19842a.r();
        }
    }

    @Override // tb.wqb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116c1b7e", new Object[]{this});
            return;
        }
        this.f19842a.l0();
        this.f19842a.w().m0();
    }

    @Override // tb.wqb
    public void f(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d965d39d", new Object[]{this, str, z9eVar});
        } else if (this.f19842a != null) {
            kor.a(TAG, "registerNativeViewHolder", str.toString(), "", null);
            this.f19842a.a0(str, z9eVar);
            ((HashMap) this.r).put(str, z9eVar);
        }
    }

    @Override // tb.wqb
    public void g(u3o u3oVar, pqb pqbVar) {
        PageStatus pageStatus;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107667dc", new Object[]{this, u3oVar, pqbVar});
        } else if (u3oVar != null && this.f19842a != null) {
            kor.a(TAG, "loadData", u3oVar.c() + "-" + u3oVar.n(), "", "开始请求");
            this.g = u3oVar;
            this.h = pqbVar;
            u3oVar.E(null);
            j10.a aVar = new j10.a(this.g.l());
            if (u3oVar.j() == null || u3oVar.j().get("tabCode") == null || !u3oVar.j().get("tabCode").equals("reFund")) {
                try {
                    u3oVar.F(this.c.s());
                    if (this.e == null) {
                        this.e = new s3o();
                    }
                    k4d a2 = this.e.a(this.b, this.c.c(), u3oVar.c());
                    this.d = a2;
                    aVar.f("isNextRPC", String.valueOf(a2 instanceof qho));
                    Z(this.d, null, new h(this, pqbVar), D(), aVar, false);
                } catch (Throwable th) {
                    if (pqbVar != null) {
                        if (this.f == null) {
                            pageStatus = PageStatus.FIRST_PAGE;
                        } else {
                            pageStatus = PageStatus.NEXT_PAGE;
                        }
                        pqbVar.X(th.toString(), null, DataStatus.ERROR_DATA, pageStatus);
                    }
                    aVar.c("failed");
                }
            } else {
                Z(null, null, new h(this, pqbVar), D(), aVar, true);
            }
        }
    }

    @Override // tb.czb
    public com.alibaba.android.ultron.vfw.instance.a getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("2b1c7b32", new Object[]{this});
        }
        return this.f19842a;
    }

    @Override // tb.wqb
    public void h(String str, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492d64eb", new Object[]{this, str, w8Var});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar != null) {
            aVar.A().b().k().v().i(str, w8Var);
        }
    }

    @Override // tb.wqb
    public void i(JSONObject jSONObject, pqb pqbVar) {
        PageStatus pageStatus;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5def80", new Object[]{this, jSONObject, pqbVar});
        } else if (this.f19842a != null) {
            try {
                boolean f2 = this.c.f();
                this.l = f2;
                if (!f2) {
                    G();
                }
                com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
                g.a aVar2 = new g.a();
                if (this.c.r() == null) {
                    z = false;
                }
                aVar.e0(jSONObject, new rn2(aVar2.e(z).d(this.l).c()));
                if (pqbVar != null) {
                    pqbVar.U1(jSONObject, DataStatus.NORMAL_DATA, PageStatus.LAST_PAGE);
                }
            } catch (Throwable th) {
                if (pqbVar != null) {
                    if (this.f == null) {
                        pageStatus = PageStatus.FIRST_PAGE;
                    } else {
                        pageStatus = PageStatus.NEXT_PAGE;
                    }
                    pqbVar.X(th.toString(), null, DataStatus.ERROR_DATA, pageStatus);
                }
            }
        }
    }

    @Override // tb.wqb
    public void j(Map<String, ViewGroup> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448ec85c", new Object[]{this, map});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) map.get(OrderConfigs.RECYCLERVIEW);
        this.f19842a.O((LinearLayout) map.get("header"), recyclerView, (LinearLayout) map.get("bottom"));
        this.f19842a.G().t(map.get("top"), null);
        ViewGroup viewGroup = map.get("foreground");
        if (viewGroup != null) {
            this.f19842a.s0(viewGroup);
        }
        ViewGroup viewGroup2 = map.get("background");
        if (viewGroup2 != null) {
            this.f19842a.n0(viewGroup2);
        }
        qcl qclVar = this.o;
        if (qclVar != null) {
            qclVar.h(recyclerView);
        }
    }

    @Override // tb.wqb
    public o58 l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o58) ipChange.ipc$dispatch("14692f05", new Object[]{this, str});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar == null) {
            return null;
        }
        return Util.i(str, aVar.w());
    }

    @Override // tb.wqb
    public void m(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa46f6", new Object[]{this, dXRootView, jSONObject});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar != null) {
            try {
                aVar.A().b().k().y0(dXRootView, jSONObject);
            } catch (NullPointerException e2) {
                kor.d(TAG, "postMessageByDx", e2);
            }
        }
    }

    @Override // tb.wqb
    public void n(String str) {
        com.alibaba.android.ultron.vfw.instance.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53b4ce8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (aVar = this.f19842a) != null && aVar.w() != null) {
            IDMComponent componentByName = this.f19842a.w().getComponentByName(str);
            if (this.f19842a.z() != null && this.f19842a.z().c() != null && componentByName != null) {
                int indexOf = this.f19842a.z().c().indexOf(componentByName);
                ViewGroup viewGroup = this.c.b().get(OrderConfigs.RECYCLERVIEW);
                if (indexOf != -1) {
                    viewGroup.post(new e(viewGroup, indexOf));
                }
            }
        }
    }

    @Override // tb.wqb
    public c48 o(p18 p18Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c48) ipChange.ipc$dispatch("4068f9aa", new Object[]{this, p18Var});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar == null || aVar.A() == null || this.f19842a.A().b() == null || this.f19842a.A().b().k() == null) {
            return null;
        }
        return new c48(this.b, p18Var, this.c.c().getBizName(), null, this.f19842a.A().b().k());
    }

    @Override // tb.wqb
    public void p(Long l, nb5 nb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e224d3e5", new Object[]{this, l, nb5Var});
        } else if (this.f19842a != null) {
            kor.a(TAG, "registerDXParser", l.toString(), "", null);
            this.f19842a.B0(l.longValue(), nb5Var);
            ((HashMap) this.w).put(l, nb5Var);
        }
    }

    @Override // tb.wqb
    public JSONObject q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2efeb7e5", new Object[]{this, str});
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f19842a;
        if (aVar == null) {
            return null;
        }
        return Util.j(str, aVar.w());
    }

    public final void B(Pair<JSONObject, org.json.JSONObject> pair) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9095756d", new Object[]{this, pair});
        } else if (pair == null || (obj = pair.first) == null || pair.second == null) {
            UnifyLog.e("UltronProxy.appendIsFromRefund", "pair is invalid");
        } else {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("container").getJSONArray("data").getJSONObject(2);
                String string = jSONObject.getString("url");
                if (TextUtils.isEmpty(string)) {
                    UnifyLog.e("UltronProxy.appendIsFromRefund", "url isEmpty");
                    return;
                }
                Uri.Builder buildUpon = Uri.parse(string).buildUpon();
                buildUpon.appendQueryParameter("isFromWoTaoRefund", String.valueOf(this.c.e()));
                jSONObject.put("url", (Object) buildUpon.build().toString());
            } catch (Exception e2) {
                UnifyLog.e("UltronProxy.appendIsFromRefund", e2.toString());
            }
        }
    }

    public final JSONObject E(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18f85838", new Object[]{this, b8vVar});
        }
        JSONObject d2 = c2u.d(b8vVar);
        if (uel.l("reportSubmitButtonTopic", true) && (this instanceof UltronListProxy) && b8vVar != null && b8vVar.d() != null && TextUtils.equals("submitButton", b8vVar.d().getTag())) {
            if (d2 == null) {
                d2 = new JSONObject();
            }
            d2.put("refreshFromCancelBtn", (Object) "true");
        }
        return d2;
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22677c16", new Object[]{this});
        } else if (!this.m) {
            this.m = true;
            M(this.f19842a);
            boolean p = wbl.p(this.c);
            this.i = p;
            if (p) {
                this.k = new eji("ultronAsyncExposure", 3);
            }
        }
    }

    public final void W(com.alibaba.android.ultron.vfw.instance.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3a55af", new Object[]{this, aVar});
            return;
        }
        DinamicXEngine k = aVar.A().b().k();
        k.M0("ultronAlertV2", new k6v.a(aVar, "alertV2"));
        k.M0("ultronOpenURLV2", new k6v.a(aVar, "openUrlV2"));
        k.M0("ultronRefreshPageV2", new k6v.a(aVar, "refreshPageV2"));
        k.M0("ultronRefreshOrderDetailAndListV2", new k6v.a(aVar, "refreshPageV2"));
        k.M0("ultronRefreshOrderListV2", new k6v.a(aVar, "refreshPageV2"));
        k.M0("ultronRemoveComponentV2", new k6v.a(aVar, "removeComponentV2"));
        k.M0("ultronUpdateComponentV2", new k6v.a(aVar, "updateComponentV2"));
        k.M0("refreshAllComponents", new k6v.a(aVar, "refreshComponentV2"));
        k.M0("ultronClosePageV2", new k6v.a(aVar, "closePageV2"));
        k.M0("ultronCloseWindowV2", new k6v.a(aVar, "closePageV2"));
        k.M0("ultronDoBatchPayCheckV2", new k6v.a(aVar, "doBatchPayCheckV2"));
        k.M0("ultronPopV2", new k6v.a(aVar, "ultronPopV2"));
        k.M0("ultronPopupSelect", new k6v.a(aVar, "popupSelect"));
        k.M0("ultronDismissUltronPopV2", new k6v.a(aVar, "dismissPopV2"));
        k.M0("ultronUnionOrderConverterV2", new k6v.a(aVar, uhv.SUBSCRIBER_ID));
        k.M0("ultronOrderRequestV2", new w9v.a(this));
        k.M0("ultronUpdateUTPageProperties", new k6v.a(aVar, "ultronUpdateUTPageProperties"));
        k.M0("ultronScrollComponentV2", new k6v.a(aVar, "scrollComponentV2"));
        k.M0("ultronToastV2", new k6v.a(aVar, "toastV2"));
        k.M0("ultronUpdateAsyncStatusV2", new k6v.a(aVar, "updateAsyncStatusV2"));
        k.M0("ultronMoreClickV2", new k6v.a(aVar, qvp.SUBSCRIBER_ID));
        k.M0("ultronArrowMoreClick", new k6v.a(aVar, mc1.SUBSCRIBER_ID));
        k.M0("ultronBatchUpdateComponentV2", new k6v.a(aVar, "batchUpdateComponentV2"));
        k.M0("ultronSendMsgV2", new k6v.a(aVar, "sendMsgV2"));
        k.M0("ultronReceiveMsgV2", new k6v.a(aVar, "receiveMsgV2"));
        k.M0("ultronUserTrackV2", new k6v.a(aVar, "userTrackV2"));
        k.M0("ultronAsyncUserTrackV2", new k6v.a(aVar, "asyncUserTrackV2"));
        k.M0("ultronMtopV2", new k6v.a(aVar, "mtopV2"));
        k.M0("ultronCartRefreshV2", new k6v.a(aVar, gd3.TAG));
        k.M0("ultronCopyV2", new k6v.a(aVar, "copyV2"));
        k.M0("ultronLogisticsV2", new k6v.a(aVar, njh.SUBSCRIBER_ID));
        k.M0("ultronFoldComponentV2", new k6v.a(aVar, "foldComponentV2"));
        k.M0("ultronWeexPopV2", new k6v.a(aVar, "weexPopV2"));
        k.M0("ultronInSimpleConditionV2", new k6v.a(aVar, "inSimpleConditionV2"));
        k.M0("ultronTabChangeV2", new k6v.a(aVar, "tabChangeV2"));
        k.M0("TradeOnStage", new vcu.a());
        k.M0(jdl.SUBSCRIBER_ID, new k6v.a(aVar, jdl.SUBSCRIBER_ID));
        if (v9v.i("babelorder", "tbTradeJSTrackerReportRegister", true)) {
            k.M0("tbTradeJSTrackerReport", new lht.a());
        }
    }

    public final void c0(Pair<JSONObject, org.json.JSONObject> pair) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c8e6d9", new Object[]{this, pair});
        } else if (pair == null || pair.first == null || pair.second == null) {
            UnifyLog.e("UltronProxy.setupRefundUrl", "pair is invalid");
        } else {
            try {
                if (!TextUtils.isEmpty(this.c.m())) {
                    str = this.c.m();
                } else if (EnvironmentSwitcher.a() == 0) {
                    str = "https://meta.m.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom";
                } else {
                    str = "https://meta.wapa.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom";
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                long j = this.p;
                if (j > 0) {
                    buildUpon.appendQueryParameter("jt_pt_navStartTime", String.valueOf(j));
                }
                ((JSONObject) pair.first).getJSONObject("container").getJSONArray("data").getJSONObject(2).put("url", (Object) buildUpon.build().toString());
            } catch (Exception e2) {
                UnifyLog.e("UltronProxy.setupRefundUrl", e2.toString());
            }
        }
    }

    @Override // tb.wqb
    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d772fc4e", new Object[]{this, context});
            return;
        }
        kor.a(TAG, "buildContainer", "----");
        this.b = context;
        if (this.f19842a == null) {
            F(context);
            N();
        } else {
            OrderUltronInstanceFactory.clearInstance();
            this.f19842a.k0(context);
        }
        this.n.g(this.c);
        P();
        if (this.c.h() instanceof fcl) {
            ((fcl) this.c.h()).f(this.f19842a.G());
        }
        if (!uel.l("olExposureEventDelay", true) || !this.c.f()) {
            Q();
        }
        this.f19842a.A().b().k().M0("ultronImageLoadComplete", new gdl.a(this.c.k()));
        this.j = wbl.v(this.c);
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd331d5d", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.c.n().d());
        ((HashMap) this.s).put("mtopV2", new MtopV2Subscriber().O("UNIT_TRADE").P(hashMap));
        ((HashMap) this.s).put("openUrl", new sel(this.c));
        String[] strArr = {"mtopV2", "openUrl"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            this.f19842a.getEventHandler().q(str, (rtd) ((HashMap) this.s).get(str));
            if (((HashMap) this.s).get(str) instanceof n6v) {
                this.f19842a.A().b().k().v().i(((n6v) ((HashMap) this.s).get(str)).B(), new k6v.a(this.f19842a, str));
                g8v.INSTANCE.d(str, "NAME_SPACE_BABEL_ORDER", (n6v) ((HashMap) this.s).get(str));
            }
        }
    }

    public final boolean R(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d083136", new Object[]{this, mtopResponse})).booleanValue();
        }
        return mtopResponse.getDataJsonObject() != null && ncl.CODE_REDIRECT_302.equals(mtopResponse.getDataJsonObject().optString("code")) && !TextUtils.isEmpty(mtopResponse.getDataJsonObject().optString(Constants.WEIBO_REDIRECTURL_KEY));
    }

    public void Z(k4d k4dVar, Object obj, ojd ojdVar, a.h hVar, j10.a aVar, boolean z) {
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3284f9", new Object[]{this, k4dVar, obj, ojdVar, hVar, aVar, new Boolean(z)});
            return;
        }
        f fVar = new f(H(this.c.c()), ojdVar, aVar, k4dVar, hVar, System.currentTimeMillis());
        aVar.d(Long.valueOf(System.currentTimeMillis()));
        if (z) {
            u55 w = this.f19842a.w();
            ParseResponseHelper parseResponseHelper = new ParseResponseHelper(w);
            Pair<JSONObject, org.json.JSONObject> S = S(this.c.v());
            c0(S);
            B(S);
            if (S == null || (obj2 = S.first) == null || S.second == null) {
                UnifyLog.e("UltronProxy.renderRequestData", "loadLocalRefundResponse failed");
                return;
            }
            parseResponseHelper.p(((JSONObject) obj2).getJSONObject("data"));
            parseResponseHelper.q((JSONObject) S.first);
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setDataJsonObject((org.json.JSONObject) S.second);
            fVar.b(0, mtopResponse, null, w, null);
        } else if (k4dVar != null) {
            if (uel.l("loadOLCacheDelay", true) && this.c.f()) {
                this.f19842a.w().n0(true);
            }
            k4dVar.b(k4dVar.a(this.b, this.f19842a.w(), this.g), obj, fVar);
        } else {
            throw new IllegalArgumentException("requesterclient can not be null");
        }
    }

    public final Pair<JSONObject, org.json.JSONObject> S(boolean z) {
        InputStream inputStream;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d8bb2519", new Object[]{this, new Boolean(z)});
        }
        Context context = this.b;
        if (context == null) {
            UnifyLog.e("UltronProxy.loadLocalRefundResponse", "mContext is null");
            return null;
        }
        AssetManager assets = context.getAssets();
        if (assets == null) {
            UnifyLog.e("UltronProxy.loadLocalRefundResponse", "assetManager is null");
            return null;
        }
        try {
            if (z) {
                inputStream = AssetsDelegate.proxy_open(assets, "folded_order_refund_response.json");
            } else {
                inputStream = AssetsDelegate.proxy_open(assets, "order_refund_response.json");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            inputStream.close();
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            String str3 = "actionTitle";
            if (uel.l("removePackageList", true)) {
                str3 = "removeActionTitle";
            }
            if (Localization.o()) {
                if (EnvironmentSwitcher.a() == 0) {
                    str2 = hn2.EN_REFUND_SEARCH_URL_ONLINE;
                } else {
                    str2 = hn2.EN_REFUND_SEARCH_URL_WAPA;
                }
                String[] strArr = hn2.EN_titleConfig;
                String str4 = strArr[0];
                String str5 = strArr[1];
                String str6 = strArr[2];
                String[] strArr2 = hn2.EN_tabConfig;
                str = String.format(byteArrayOutputStream2, str4, str5, str6, strArr2[0], strArr2[1], strArr2[2], str2, str3);
            } else {
                String[] strArr3 = hn2.CN_titleConfigV4;
                String str7 = strArr3[0];
                String str8 = strArr3[1];
                String str9 = strArr3[2];
                String[] strArr4 = hn2.CN_tabConfigV4;
                str = String.format(byteArrayOutputStream2, str7, str8, str9, strArr4[0], strArr4[1], strArr4[2], hn2.CN_REFUND_SEARCH_URL, str3);
            }
            Pair<JSONObject, JSONObject> l = this.c.l();
            if (l != null) {
                JSONObject parseObject = JSON.parseObject(str);
                parseObject.getJSONObject("data").put("query3", l.first);
                JSONArray jSONArray = parseObject.getJSONObject("container").getJSONArray("data");
                jSONArray.remove(0);
                jSONArray.add(0, l.second);
                str = parseObject.toString();
            }
            return new Pair<>(JSON.parseObject(str), new org.json.JSONObject(str));
        } catch (Exception e2) {
            UnifyLog.e("UltronProxy.loadLocalRefundResponse", e2.toString());
            return null;
        }
    }
}

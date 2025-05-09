package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.taobao.R;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wo2 implements sgc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30807a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30808a;
        public final /* synthetic */ View b;
        public final /* synthetic */ BaseSectionModel c;

        public a(int i, View view, BaseSectionModel baseSectionModel) {
            this.f30808a = i;
            this.b = view;
            this.c = baseSectionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wo2.b(wo2.this, this.f30808a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30809a;
        public final /* synthetic */ View b;
        public final /* synthetic */ BaseSectionModel c;

        public b(int i, View view, BaseSectionModel baseSectionModel) {
            this.f30809a = i;
            this.b = view;
            this.c = baseSectionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wo2.c(wo2.this, this.f30809a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30810a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public c(JSONObject jSONObject, View view, int i) {
            this.f30810a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hue.n(this.f30810a, this.b, this.c, wo2.d(wo2.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30811a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public d(JSONObject jSONObject, View view, int i) {
            this.f30811a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hue.m(this.f30811a, this.b, this.c, wo2.d(wo2.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30812a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public e(JSONObject jSONObject, View view, int i) {
            this.f30812a = jSONObject;
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hue.l(this.f30812a, this.b, this.c, wo2.d(wo2.this));
            }
        }
    }

    static {
        t2o.a(486539630);
        t2o.a(488636482);
    }

    public wo2(cfc cfcVar) {
        this.f30807a = cfcVar;
    }

    public static /* synthetic */ void b(wo2 wo2Var, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272bf6c", new Object[]{wo2Var, new Integer(i), view, baseSectionModel});
        } else {
            wo2Var.k(i, view, baseSectionModel);
        }
    }

    public static /* synthetic */ void c(wo2 wo2Var, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3641ead", new Object[]{wo2Var, new Integer(i), view, baseSectionModel});
        } else {
            wo2Var.l(i, view, baseSectionModel);
        }
    }

    public static /* synthetic */ int d(wo2 wo2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c664542a", new Object[]{wo2Var})).intValue();
        }
        return wo2Var.f();
    }

    @Override // tb.sgc.b
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
        }
    }

    public final String e(BaseSectionModel baseSectionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2e02b43", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || baseSectionModel.getJSONObject("args") == null || (jSONObject = baseSectionModel.getJSONObject("ext")) == null || jSONObject.getBooleanValue("hidden")) {
            return "";
        }
        JSONObject jSONObject2 = baseSectionModel.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
        if (jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("arg1"))) {
            return "expose_guess_list_0";
        }
        return jSONObject2.getString("arg1");
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed7563fa", new Object[]{this})).intValue();
        }
        return Math.max(lnn.b(this.f30807a), 0);
    }

    public final String g(BaseSectionModel baseSectionModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b87b9d01", new Object[]{this, baseSectionModel});
        }
        String a2 = this.f30807a.getContainerType().a();
        if (baseSectionModel == null) {
            return a2;
        }
        BaseUtModel exposureParam = baseSectionModel.getExposureParam();
        if (exposureParam != null) {
            str = exposureParam.getPage();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return a2;
    }

    @Override // tb.sgc.b
    public void h(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            get.a().e(new b(i, view, baseSectionModel));
        }
    }

    @Override // tb.sgc.b
    public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    public final void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f14f41", new Object[]{this, runnable});
        } else {
            get.a().e(runnable);
        }
    }

    public final void k(int i, View view, BaseSectionModel<?> baseSectionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77380415", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel != null && (jSONObject = baseSectionModel.getJSONObject("ext")) != null && !jSONObject.getBooleanValue("hidden")) {
            JSONObject jSONObject2 = baseSectionModel.getJSONObject("args");
            if (jSONObject2 != null) {
                jSONObject2.put("realExposeIndex", (Object) Integer.valueOf(i));
            }
            if (baseSectionModel.getBooleanValue(zjn.IS_USER_ACTION_TRACKED)) {
                baseSectionModel.put("isFirstAppear", (Object) Boolean.FALSE);
            } else {
                baseSectionModel.put("isFirstAppear", (Object) Boolean.TRUE);
            }
            baseSectionModel.put(zjn.IS_USER_ACTION_TRACKED, (Object) Boolean.TRUE);
            fve.f("real_time_rec", "fast expose sectionBizCode = " + baseSectionModel.getString("sectionBizCode") + " position=" + i);
            if (jSONObject2 != null) {
                if (jSONObject2.getJSONObject("utLogMapEdge") != null) {
                    p(baseSectionModel, view, i);
                } else if (jSONObject2.getString("utLogMap") != null) {
                    n(baseSectionModel, view, i);
                } else {
                    m(baseSectionModel, view, i);
                }
            }
        }
    }

    public final void l(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48033e7f", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (((RecyclerView) view.getParent()) != null) {
            String g = g(baseSectionModel);
            String e2 = e(baseSectionModel);
            if (TextUtils.isEmpty(e2)) {
                e2 = "expose_guess_list_0";
            }
            j(new gk9(view, view.getTag(R.id.tag_guess_item_id), g, e2));
        }
    }

    public final void m(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2265dc6a", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            j(new e(jSONObject, view, i));
        }
    }

    public final void n(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcd3d2", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            j(new d(jSONObject, view, i));
        }
    }

    @Override // tb.sgc.b
    public void o(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            get.a().e(new a(i, view, baseSectionModel));
        }
    }

    public final void p(JSONObject jSONObject, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589cfc95", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            j(new c(jSONObject, view, i));
        }
    }
}

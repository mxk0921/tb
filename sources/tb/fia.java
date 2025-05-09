package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsViewPresenter;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.Iterator;
import java.util.List;
import tb.jg3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fia extends tfa<GoodsViewPresenter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public jg3 c;
    public f0h d;
    public c4u e;
    public final boolean f = yga.I();
    public final boolean g = yga.s();
    public JSONObject h;
    public float i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netResponse != null && netResponse.getDataJsonObject() != null && fia.j(fia.this) != null) {
                fia.l(fia.this, fkx.d(netResponse.getDataJsonObject().toString()));
                nha.b(fia.k(fia.this), null);
                ((GoodsViewPresenter) fia.m(fia.this)).h0(null);
                if (((GoodsViewPresenter) fia.n(fia.this)).g) {
                    ((GoodsViewPresenter) fia.o(fia.this)).b0(fia.this.u());
                    fia fiaVar = fia.this;
                    fiaVar.s(fia.k(fiaVar));
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (netResponse != null) {
                hha.b("GoodViewModel", "requestTopOperate error|msg =" + netResponse.getRetMsg());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f19311a;

        public b(List list) {
            this.f19311a = list;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getLiveItemCategories", -1);
            fia.p(fia.this, this.f19311a);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            LiveItemCategoriesResponseData data = ((LiveItemCategoriesResponse) netBaseOutDo).getData();
            if (data != null && data.useCdn) {
                fia.p(fia.this, this.f19311a);
            } else if (data != null) {
                nha.o("mtop.tblive.live.item.getLiveItemCategories", 1);
                ((GoodsViewPresenter) fia.q(fia.this)).T(data, fkx.d(netResponse.getDataJsonObject().toString()), data.defaultCategoryId, this.f19311a);
            } else {
                nha.o("mtop.tblive.live.item.getLiveItemCategories", -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements jg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f19312a;
        public final /* synthetic */ String b;

        public c(List list, String str) {
            this.f19312a = list;
            this.b = str;
        }

        @Override // tb.jg3.b
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f229973", new Object[]{this, new Integer(i), str, str2});
                return;
            }
            String str3 = this.b;
            nha.k("https://live-spare.alicdn.com/liveitem4category", i + "_" + str + "_" + str2 + "_" + str3);
        }

        @Override // tb.jg3.b
        public void b(Object obj, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60aa40dd", new Object[]{this, obj, new Long(j)});
            } else if (obj instanceof LiveItemCategoriesResponseData) {
                LiveItemCategoriesResponseData liveItemCategoriesResponseData = (LiveItemCategoriesResponseData) obj;
                ((GoodsViewPresenter) fia.r(fia.this)).T(liveItemCategoriesResponseData, (JSONObject) JSON.toJSON(obj), liveItemCategoriesResponseData.defaultCategoryId, this.f19312a);
                nha.o("https://live-spare.alicdn.com/liveitem4category", 1);
            } else {
                nha.o("https://live-spare.alicdn.com/liveitem4category", -1);
            }
        }
    }

    static {
        t2o.a(295699025);
    }

    public fia(xea xeaVar) {
        super(xeaVar);
    }

    public static /* synthetic */ Object ipc$super(fia fiaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/goodviewnew/GoodsViewModel");
    }

    public static /* synthetic */ bdd j(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("ad330a87", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    public static /* synthetic */ JSONObject k(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a716c704", new Object[]{fiaVar});
        }
        return fiaVar.h;
    }

    public static /* synthetic */ JSONObject l(fia fiaVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b620292e", new Object[]{fiaVar, jSONObject});
        }
        fiaVar.h = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ bdd m(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("caea6a09", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    public static /* synthetic */ bdd n(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("d9c619ca", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    public static /* synthetic */ bdd o(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("e8a1c98b", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    public static /* synthetic */ void p(fia fiaVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f40d451", new Object[]{fiaVar, list});
        } else {
            fiaVar.t(list);
        }
    }

    public static /* synthetic */ bdd q(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("659290d", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    public static /* synthetic */ bdd r(fia fiaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("1534d8ce", new Object[]{fiaVar});
        }
        return fiaVar.b;
    }

    @Override // tb.fvc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce866d5d", new Object[]{this});
            return;
        }
        f0h f0hVar = this.d;
        if (f0hVar != null) {
            f0hVar.destroy();
        }
        jg3 jg3Var = this.c;
        if (jg3Var != null) {
            jg3Var.j();
            this.c = null;
        }
        this.h = null;
        this.i = 0.0f;
    }

    public void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cb592a", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONArray("carouselListV3") == null) {
            o3s.b("GoodViewModel", " getCurrentPrivilegeTotalAmount | data or carouselListV3 is null");
        } else {
            Iterator<Object> it = jSONObject.getJSONArray("carouselListV3").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    if (TextUtils.equals(jSONObject2.getString("type"), "rightsUrgeUse")) {
                        this.i = zqq.e(jSONObject2.getString("totalAmount"));
                        return;
                    }
                }
            }
        }
    }

    public final void t(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c03f85", new Object[]{this, list});
            return;
        }
        String str = "https://live-spare.alicdn.com/liveitem4category/" + this.f28683a.u() + "/categoryInfos";
        nha.o("https://live-spare.alicdn.com/liveitem4category", 0);
        jg3 jg3Var = new jg3(str, LiveItemCategoriesResponseData.class, new c(list, str));
        this.c = jg3Var;
        jg3Var.k();
    }

    public JSONObject u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f878352d", new Object[]{this});
        }
        return this.h;
    }

    public void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd49fbb8", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONArray("carouselListV3") == null) {
            hha.b("GoodViewModel", " preprocessPrivilegeUrgeUseData | privilegeData or carouselListV3 is null");
        } else {
            Iterator<Object> it = jSONObject.getJSONArray("carouselListV3").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                boolean z = next instanceof JSONObject;
                if (z) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    if (!TextUtils.isEmpty(jSONObject2.getString("amountDegradeText"))) {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(jSONObject2.getString("amountDegradeText"));
                        jSONObject2.put("amountArray", (Object) jSONArray);
                    }
                }
                if (z) {
                    JSONObject jSONObject3 = (JSONObject) next;
                    if (TextUtils.equals(jSONObject3.getString("type"), "rightsUrgeUse")) {
                        float f = this.i;
                        float e = zqq.e(jSONObject3.getString("totalAmount"));
                        JSONArray jSONArray2 = new JSONArray();
                        if (f != 0.0f && e > f) {
                            jSONArray2.add(String.valueOf(f));
                        }
                        jSONArray2.add(String.valueOf(e));
                        jSONObject3.put("amountArray", (Object) jSONArray2);
                    }
                }
                if (z) {
                    JSONObject jSONObject4 = (JSONObject) next;
                    if (TextUtils.equals(jSONObject4.getString("type"), "rightsUrgeIssue")) {
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.add(jSONObject4.getString("totalAmount"));
                        jSONObject4.put("amountArray", (Object) jSONArray3);
                    }
                }
            }
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6122b8e7", new Object[]{this});
        } else if (this.f28683a == null) {
            hha.b("GoodViewModel", "requestTopOperate mGoodLiveContext is null.");
        } else {
            if (this.e == null) {
                this.e = new c4u(new a());
            }
            JSONObject jSONObject = new JSONObject();
            P p = this.b;
            if (p != 0 && ((GoodsViewPresenter) p).g) {
                jSONObject.put("liveSource", (Object) this.f28683a.v());
                jSONObject.put("entryLiveSource", (Object) this.f28683a.m());
                jSONObject.put("spm", (Object) this.f28683a.z());
                jSONObject.put("interactTypes", (Object) fkx.i(this.f28683a.n.g()));
            }
            this.e.K(this.f28683a.u(), this.f28683a.g(), fkx.i(jSONObject));
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ea8ea0", new Object[]{this, new Boolean(z)});
        } else if (ijr.j()) {
            w(z);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccebf3e5", new Object[]{this});
            return;
        }
        xea xeaVar = this.f28683a;
        if (xeaVar == null || xeaVar.Q()) {
            hha.b("GoodViewModel", "requestTopOperate isMoveHighlight.");
        } else if (!this.f) {
            hha.b("GoodViewModel", "mEnableShowGoodTopOperateView is false.");
        } else if (!this.f28683a.O() || this.g) {
            x();
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61163b40", new Object[]{this, new Boolean(z)});
        } else if (this.f28683a != null) {
            List<String> b2 = vha.b();
            nha.o("mtop.tblive.live.item.getLiveItemCategories", 0);
            f0h f0hVar = new f0h(new b(b2));
            this.d = f0hVar;
            f0hVar.K(this.f28683a, b2, z);
        }
    }
}

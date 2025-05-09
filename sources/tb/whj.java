package tb;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class whj implements pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f30696a;
    public final ViewGroup b;
    public final vfw c = new a();
    public final Map<String, kae> d = new HashMap();
    public kae e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                whj.a(whj.this).addView(view, new ViewGroup.LayoutParams(-1, -1));
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                whj.a(whj.this).removeView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m8j f30698a;
        public final /* synthetic */ int b;

        public b(m8j m8jVar, int i) {
            this.f30698a = m8jVar;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f30698a.w(this.b);
            this.f30698a.u2("contentHeight", String.valueOf(p1p.c(whj.b(whj.this))));
        }
    }

    static {
        t2o.a(815793424);
        t2o.a(993001961);
    }

    public whj(Activity activity) {
        this.f30696a = activity;
        this.b = e(activity);
        ScreenType g = ScreenType.g(activity);
        if (g != null) {
            g.i(this);
        }
    }

    public static /* synthetic */ ViewGroup a(whj whjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("94fc1572", new Object[]{whjVar});
        }
        return whjVar.b;
    }

    public static /* synthetic */ int b(whj whjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2c31495", new Object[]{whjVar})).intValue();
        }
        return whjVar.f();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            ((kae) entry.getValue()).destroyAndRemoveFromParent();
        }
        ((HashMap) this.d).clear();
    }

    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            kae kaeVar = (kae) entry.getValue();
            if (kaeVar instanceof m8j) {
                ((m8j) kaeVar).y2(str, jSONObject);
            }
        }
    }

    public final ViewGroup e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e28cef1", new Object[]{this, activity});
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        if (viewGroup == null || o4p.K0()) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return viewGroup;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) this.f30696a.findViewById(16908290);
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.f30696a.getWindow().getDecorView();
        }
        return viewGroup.getMeasuredHeight();
    }

    public final x02 g(ree reeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("844e3c9f", new Object[]{this, reeVar});
        }
        x02 x02Var = new x02(reeVar.getActivity(), reeVar.getParent(), reeVar.B());
        x02Var.b(this.c);
        return x02Var;
    }

    public kae h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("e0718991", new Object[]{this});
        }
        return this.e;
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5586f4ff", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("tag");
        if (!TextUtils.isEmpty(string)) {
            kae kaeVar = (kae) ((HashMap) this.d).remove(string);
            if (kaeVar != null) {
                kaeVar.destroyAndRemoveFromParent();
            }
            if (this.e == kaeVar) {
                this.e = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View] */
    public final kae k(String str, JSONObject jSONObject, ree reeVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("c85a3610", new Object[]{this, str, jSONObject, reeVar, obj});
        }
        TemplateBean template = reeVar.B().e().getTemplate(str);
        if (template == null) {
            b4p.c("NSPopContainer", "tItemType 对应的模板为空");
            return null;
        }
        ay4<gu1, ? extends pwc> ay4Var = reeVar.getCore().j().c.f28608a;
        if (ay4Var == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("tItemType", (Object) str);
        MuiseBean muiseBean = (MuiseBean) reeVar.getCore().n().d(jSONObject2, (BaseSearchResult) reeVar.B().e().getTotalSearchResult(), null);
        if (muiseBean == null) {
            b4p.c("NSPopContainer", "info parse 失败");
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("status");
        if (jSONObject3 != null) {
            muiseBean.extraStatus.putAll(jSONObject3);
        }
        m8j m8jVar = (m8j) ay4Var.a(new gu1(g(reeVar), template));
        m8jVar.attachToContainer();
        m8jVar.bindWithData(muiseBean);
        hgw.a(m8jVar.getView());
        if (obj != null) {
            m8jVar.N2((cnx) obj);
        }
        m8jVar.u2("contentHeight", String.valueOf(p1p.c(f())));
        ScreenType g = ScreenType.g(this.f30696a);
        if (g != null) {
            g.j(m8jVar);
        }
        this.e = m8jVar;
        m8jVar.postEvent(new jvp());
        if (!m8jVar.getModel().e().isSubscribed(this)) {
            m8jVar.getModel().e().subscribe(this);
        }
        return m8jVar;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View] */
    public final kae m(String str, JSONObject jSONObject, ude udeVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("5694bfa5", new Object[]{this, str, jSONObject, udeVar, obj});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("url", (Object) str);
        vhj vhjVar = new vhj(this.f30696a, udeVar, null, this.b, this.c);
        vhjVar.t2(obj);
        vhjVar.attachToContainer();
        vhjVar.bindWithData(jSONObject);
        this.e = vhjVar;
        vhjVar.postEvent(new jvp());
        hgw.a(vhjVar.getView());
        return vhjVar;
    }

    public void onEventMainThread(y2p y2pVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
        } else if (o4p.s1()) {
            kae h = h();
            if (h instanceof m8j) {
                m8j m8jVar = (m8j) h;
                if (m8jVar.getModel().e() instanceof CommonBaseDatasource) {
                    CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) m8jVar.getModel().e();
                    if (commonBaseDatasource.getTotalSearchResult() != 0) {
                        if (((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).noResultMod == null) {
                            i = ((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).getTotalResult();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("totalResults", (Object) String.valueOf(i));
                        d("searchFinish", jSONObject);
                    }
                }
            }
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
            return;
        }
        kae kaeVar = this.e;
        if (kaeVar instanceof m8j) {
            new Handler().post(new b((m8j) kaeVar, i));
        }
    }

    public final void j(t2p t2pVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4279213d", new Object[]{this, t2pVar});
        } else if (t2pVar.b().getTotalSearchResult() instanceof CommonSearchResult) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) t2pVar.b().getTotalSearchResult();
            if (commonSearchResult.noResultMod == null) {
                i = commonSearchResult.getTotalResult();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("totalResults", (Object) String.valueOf(i));
            d("searchFinish", jSONObject);
        }
    }

    public void l(JSONObject jSONObject, JSONObject jSONObject2, ude udeVar, ree reeVar, Object obj) {
        kae k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9a3a4d", new Object[]{this, jSONObject, jSONObject2, udeVar, reeVar, obj});
        } else if (jSONObject != null) {
            int intValue = jSONObject.getIntValue("type");
            String string = jSONObject.getString("tag");
            String string2 = jSONObject.getString("url");
            if (TextUtils.isEmpty(string) || ((HashMap) this.d).containsKey(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            if (intValue == 1) {
                ((HashMap) this.d).put(string, m(string2, jSONObject2, udeVar, obj));
            } else if (intValue == 2 && (k = k(string2, jSONObject2, reeVar, obj)) != null) {
                ((HashMap) this.d).put(string, k);
            }
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else {
            j(t2pVar);
        }
    }
}

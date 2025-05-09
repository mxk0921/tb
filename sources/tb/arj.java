package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_uikit.ui.MUSView;
import java.util.Map;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class arj extends j4p implements dxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer v;
    public final Object w;
    public final a x;
    public final b y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a();

        void b(JSONObject jSONObject);

        void cancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(BaseCellBean baseCellBean, int i);

        brj b();

        ListStyle getLayoutStyle();
    }

    static {
        t2o.a(815793687);
        t2o.a(993002140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar, Integer num, Object obj, a aVar, b bVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        ckf.g(templateBean, "bean");
        ckf.g(bVar, "negativeFeedbackProvider");
        this.v = num;
        this.w = obj;
        this.x = aVar;
        this.y = bVar;
    }

    public static /* synthetic */ Object ipc$super(arj arjVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1698538053:
                return new Boolean(super.m2((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case -871580117:
                super.onRenderFailed((com.taobao.android.weex_framework.a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 226438661:
                super.I2((fw) objArr[0]);
                return null;
            case 302831676:
                super.destroyAndRemoveFromParent();
                return null;
            case 523666796:
                return new Boolean(super.K((String) objArr[0], (JSONObject) objArr[1], (f64.a) objArr[2], (f64.a) objArr[3]));
            case 724233032:
                super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                return null;
            case 761104299:
                super.K2((Map) objArr[0]);
                return null;
            case 1618343666:
                return super.onCreateView();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/negfeedback/NegativeFeedbackMusModWidget");
        }
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: G2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout G2 = super.onCreateView();
        subscribeEvent(this);
        ViewGroup container = getContainer();
        if (container != null) {
            G2.getLayoutParams().height = container.getHeight();
        }
        ckf.d(G2);
        return G2;
    }

    @Override // tb.j4p, tb.m8j
    public void I2(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f2e05", new Object[]{this, fwVar});
            return;
        }
        super.I2(fwVar);
        if (fwVar != null) {
            fwVar.Z(this);
        }
    }

    @Override // tb.j4p, tb.m8j, tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (ckf.b(str, "requestLostFocus") && (aVar3 = this.x) != null) {
            aVar3.cancel();
        }
        return super.K(str, jSONObject, aVar, aVar2);
    }

    @Override // tb.j4p, tb.m8j
    public void K2(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5d87ab", new Object[]{this, map});
            return;
        }
        super.K2(map);
        if (map != null) {
            map.put(ls7.INFO_PAGE_NUMBER, Integer.valueOf(getModel().a().getCurrentPage()));
            map.put("index", String.valueOf(this.v));
            map.put("layoutStyle", Integer.valueOf(ListStyle.toNum(this.y.getLayoutStyle())));
            ViewGroup container = getContainer();
            if (container != null) {
                map.put("containerWidth", Float.valueOf(p1p.d(container.getWidth())));
            }
            Object obj = this.w;
            if (obj != null) {
                map.put("negFeedbackActions", obj);
            }
        }
    }

    @Override // tb.m8j
    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7de514", new Object[]{this});
        }
    }

    @Override // tb.phw, tb.abx, tb.nde
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        super.destroyAndRemoveFromParent();
        if (getContainer() != null) {
            ycw.b(getContainer());
        }
    }

    public final void onEventMainThread(yqj yqjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584a5ba8", new Object[]{this, yqjVar});
            return;
        }
        a aVar = this.x;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        super.onRenderFailed(aVar, i, str, z);
        a aVar2 = this.x;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    @Override // tb.j4p, tb.m8j, tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        super.onRenderSuccess(aVar);
        if (!(getContainer() == null || getView() == 0)) {
            ycw.c(getContainer(), getView());
            ROOT_VIEW view = getView();
            ckf.d(view);
            int childCount = ((FrameLayout) view).getChildCount();
            for (int i = 0; i < childCount; i++) {
                ROOT_VIEW view2 = getView();
                ckf.d(view2);
                View childAt = ((FrameLayout) view2).getChildAt(i);
                if (childAt instanceof MUSView) {
                    ((MUSView) childAt).sendAccessibilityEvent(8);
                    return;
                }
            }
        }
    }

    public final a s3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("67f685f", new Object[]{this});
        }
        return this.x;
    }

    public final void u3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d398bfdb", new Object[]{this, jSONObject});
        } else {
            drj.d(getActivity(), this.y.b(), jSONObject, getModel().f().getBooleanParam(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        }
    }

    @Override // tb.j4p, tb.m8j, tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        Object obj;
        a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        if (!ckf.b(str, "negativeFeedbackOptionClick")) {
            return super.m2(str, jSONObject, aVar, aVar2);
        }
        if (jSONObject == null || (obj = jSONObject.get("isSub")) == null) {
            obj = "";
        }
        boolean b2 = ckf.b(obj, "true");
        u3(jSONObject);
        if (!b2 && (aVar3 = this.x) != null) {
            aVar3.b(jSONObject);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((tb.vyd) r2).Q() != false) goto L_0x0031;
     */
    @Override // tb.dxc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(com.taobao.android.weex_framework.a r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.arj.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "1f30030f"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            android.app.Activity r2 = r5.getActivity()
            boolean r2 = r2 instanceof tb.vyd
            if (r2 == 0) goto L_0x0030
            android.app.Activity r2 = r5.getActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.taobao.search.sf.widgets.ITaobao2021SwitchProvider"
            tb.ckf.e(r2, r3)
            tb.vyd r2 = (tb.vyd) r2
            boolean r2 = r2.Q()
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r6 == 0) goto L_0x003d
            java.lang.String r1 = "tb2021"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.addInstanceEnv(r1, r0)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.arj.P(com.taobao.android.weex_framework.a):void");
    }
}

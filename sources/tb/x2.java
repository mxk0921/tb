package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class x2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final bsh f31086a;
    public boolean b;
    public final dii c;
    public final b d = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792144);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("4d9c7a1", new Object[]{this, new Integer(i), str});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "index", String.valueOf(i));
            jSONObject.put((JSONObject) "id", str);
            return jSONObject;
        }

        public final void b(String str, Activity activity, CommonSearchResult commonSearchResult, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78728156", new Object[]{this, str, activity, commonSearchResult, new Integer(i)});
                return;
            }
            ckf.g(str, "itemId");
            ckf.g(activity, "activity");
            if (commonSearchResult != null && commonSearchResult.enableAiSrpEntrance) {
                wnl wnlVar = wnl.INSTANCE;
                String json = a(i, str).toString();
                ckf.f(json, "toString(...)");
                wnlVar.b(activity, "SrpInteraction", "lastClickItem", json);
            }
        }

        public final void c(String str, Activity activity, CommonSearchResult commonSearchResult, jrh jrhVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc3c04ab", new Object[]{this, str, activity, commonSearchResult, jrhVar, new Integer(i)});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(jrhVar, c4o.KEY_DATA_SOURCE);
            if (!TextUtils.isEmpty(str) && commonSearchResult != null && commonSearchResult.enableAiSrpEntrance) {
                wnl wnlVar = wnl.INSTANCE;
                ckf.d(str);
                String json = a(i, str).toString();
                ckf.f(json, "toString(...)");
                wnlVar.b(activity, "SrpInteraction", "lastExposeItem", json);
                jrhVar.u0(str);
                HashSet<String> N0 = jrhVar.N0();
                StringBuilder sb = new StringBuilder();
                for (String str2 : N0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
                wnl wnlVar2 = wnl.INSTANCE;
                String sb2 = sb.toString();
                ckf.f(sb2, "toString(...)");
                wnlVar2.b(activity, "SrpInteraction", "exposedItemIds", sb2);
            }
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                ckf.g(errorResult, "result");
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            } else {
                ckf.g(broadcastAddListenerEventResult, "result");
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            ckf.g(broadcastEventResult, "result");
            Map<String, ? extends Object> map = broadcastEventResult.detail;
            if (map != null) {
                Object obj = map.get("params");
                JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                if (jSONObject != null) {
                    x2.a(x2.this, jSONObject);
                }
            }
        }
    }

    static {
        t2o.a(815792143);
    }

    public x2(bsh bshVar) {
        ckf.g(bshVar, "widget");
        this.f31086a = bshVar;
        dii c = dii.c();
        ckf.f(c, "createInstance(...)");
        this.c = c;
        d();
    }

    public static final /* synthetic */ void a(x2 x2Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3d5e64", new Object[]{x2Var, jSONObject});
        } else {
            x2Var.b(jSONObject);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.b) {
            this.c.e("TaoWise.open", null);
            this.b = false;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.b) {
            this.c.a("TaoWise.open", this.d);
            this.b = true;
        }
    }

    public final void b(JSONObject jSONObject) {
        ArrayList arrayList;
        TemplateBean templateBean;
        ListStyle listStyle;
        CommonSearchResult commonSearchResult;
        List<BaseCellBean> cells;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc30b8b8", new Object[]{this, jSONObject});
            return;
        }
        acx acxVar = (acx) this.f31086a.getModel();
        if (((jrh) acxVar.a()).getTotalSearchResult() != 0) {
            FrameLayout frameLayout = null;
            if (!jSONObject.getBooleanValue("needItems") || (commonSearchResult = (CommonSearchResult) ((jrh) acxVar.a()).getTotalSearchResult()) == null || (cells = commonSearchResult.getCells()) == null) {
                templateBean = null;
                arrayList = null;
            } else if (cells.isEmpty()) {
                templateBean = null;
                arrayList = null;
            } else {
                String str = cells.get(0).type;
                ckf.f(str, "type");
                Iterator<BaseCellBean> it = cells.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BaseCellBean next = it.next();
                    if (TextUtils.equals(next.type, "item")) {
                        str = next.type;
                        break;
                    }
                }
                arrayList = new ArrayList(cells.size());
                for (BaseCellBean baseCellBean : cells) {
                    if (baseCellBean.isExposed && TextUtils.equals(baseCellBean.type, str)) {
                        arrayList.add(baseCellBean);
                    }
                }
                templateBean = ((jrh) acxVar.a()).getTemplate(str);
            }
            RESULT totalSearchResult = ((jrh) acxVar.a()).getTotalSearchResult();
            ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            frh combo = ((CommonSearchResult) totalSearchResult).getCombo(0);
            String string = jSONObject.getString("q");
            if (TextUtils.isEmpty(string)) {
                string = ((jrh) acxVar.a()).getKeyword();
            }
            if (combo == null || (listStyle = combo.p()) == null) {
                listStyle = ListStyle.LIST;
            }
            JSONObject jSONObject2 = new JSONObject(((jrh) acxVar.a()).getParamsSnapShot());
            jSONObject2.putAll(jSONObject);
            if (templateBean == null) {
                t3 t3Var = t3.INSTANCE;
                Activity activity = this.f31086a.getActivity();
                ckf.f(activity, "getActivity(...)");
                ckf.d(string);
                MetaChildPageWidget H2 = this.f31086a.H2();
                if (H2 != null) {
                    frameLayout = (FrameLayout) H2.getView();
                }
                t3Var.a(activity, string, jSONObject2, arrayList, null, null, listStyle, frameLayout);
                return;
            }
            t3 t3Var2 = t3.INSTANCE;
            Activity activity2 = this.f31086a.getActivity();
            ckf.f(activity2, "getActivity(...)");
            ckf.d(string);
            rpc.c templateFile = ((jrh) acxVar.a()).getTemplateFile(templateBean.url);
            MetaChildPageWidget H22 = this.f31086a.H2();
            if (H22 != null) {
                frameLayout = (FrameLayout) H22.getView();
            }
            t3Var2.a(activity2, string, jSONObject2, arrayList, templateFile, templateBean, listStyle, frameLayout);
        }
    }
}

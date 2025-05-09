package com.taobao.tao.flexbox.layoutmanager.module;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.h;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a1v;
import tb.a5k;
import tb.akt;
import tb.anl;
import tb.bod;
import tb.h2e;
import tb.ir2;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.wu3;
import tb.wua;
import tb.xe;
import tb.ye;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TrackerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TNodeTracker";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f12334a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ d.j d;

        public a(JSONObject jSONObject, boolean z, JSONObject jSONObject2, d.j jVar) {
            this.f12334a = jSONObject;
            this.b = z;
            this.c = jSONObject2;
            this.d = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = this.f12334a;
            if (jSONObject != null) {
                try {
                    String string = jSONObject.getString("pageName");
                    int intValue = this.f12334a.getIntValue(PopConst.POP_EVENT_ID_KEY);
                    String string2 = this.f12334a.getString("arg1");
                    boolean z2 = this.b;
                    if (intValue != 2201 || !"Page_videointeract".equals(string)) {
                        z = z2;
                    }
                    String str = (!z || string == null || string2 == null || string2.startsWith(string)) ? string2 : string + "_" + string2;
                    String string3 = this.f12334a.getString("arg2");
                    String string4 = this.f12334a.getString("arg3");
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject2 = this.c;
                    if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                        for (Map.Entry<String, Object> entry : this.c.entrySet()) {
                            arrayList.add(entry.getKey() + "=" + entry.getValue());
                        }
                    }
                    TrackerModule.addDSLInfo(arrayList, this.d);
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    d.j jVar = this.d;
                    od0.D().d().f(jVar != null ? jVar.f11976a : null, string, intValue, str, string3, string4, strArr);
                    tfs.g(TrackerModule.TAG, this.f12334a.toJSONString() + JSON.toJSONString(arrayList));
                } catch (Throwable th) {
                    tfs.g(TrackerModule.TAG, "track commitInternal" + th.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f12335a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ HashMap c;

        public b(d.j jVar, Object obj, HashMap hashMap) {
            this.f12335a = jVar;
            this.b = obj;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (akt.V0() && this.f12335a.f11976a.L() != null) {
                z = this.f12335a.f11976a.L().isContainerResumed();
            }
            if (z) {
                tfs.g("TrackerModule", a1v.UPDATE_PAGE_PROPERTIES);
                od0.D().d().updatePageProperties(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(503317317);
        t2o.a(503316559);
    }

    public static void addDSLInfo(Map<String, String> map, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9ac61e", new Object[]{map, nVar});
        } else if (map != null && nVar != null) {
            map.put("_TNode", "TNode");
            map.put("tnode_dsl_md5", q.k(nVar));
            map.put("tnode_dsl_time", q.m(nVar));
        }
    }

    private static void cacheTabPageName(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb485688", new Object[]{nVar, str});
        } else if (nVar != null) {
            nVar.w1(1, str);
        }
    }

    private static void cacheTabPageProperty(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("162aa4d1", new Object[]{nVar, map});
        } else if (nVar != null) {
            nVar.w1(4, map);
        }
    }

    @Priority(name = "low")
    public static void click(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01fb404", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("controlName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            try {
                arrayList.add("_TNode=TNode");
                arrayList.add("tnode_dsl_md5=" + jVar.f11976a.N());
                arrayList.add("tnode_dsl_time=" + jVar.f11976a.O());
            } catch (Exception unused) {
            }
            od0.D().d().b(string, string2, (String[]) arrayList.toArray(new String[arrayList.size()]));
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    @Priority(name = "low")
    public static void commit(d.j jVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f097b35", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONArray = ((JSONObject) json).getJSONArray("args")) != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                commitInternal(jVar, false, jSONArray.getJSONObject(i), true);
            }
        }
    }

    private static void commitInternal(d.j jVar, boolean z, JSONObject jSONObject, boolean z2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b0cec0", new Object[]{jVar, new Boolean(z), jSONObject, new Boolean(z2)});
        } else if (!TextUtils.isEmpty(wu3.c().a())) {
            if (jSONObject == null || !jSONObject.containsKey("args")) {
                jSONObject2 = null;
            } else {
                jSONObject2 = jSONObject.getJSONObject("args");
            }
            if (z2 && (jSONObject2 == null || !jSONObject2.containsKey(yj4.PARAM_ENTRY_UT_PARAM) || !jSONObject2.containsKey("entryUtparamPre"))) {
                String e = od0.D().d().e(getUTObjectWithContext(jVar));
                String k = od0.D().d().k(getUTObjectWithContext(jVar));
                if (!TextUtils.isEmpty(e) || !TextUtils.isEmpty(k)) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!jSONObject2.containsKey(yj4.PARAM_ENTRY_UT_PARAM)) {
                        jSONObject2.put(yj4.PARAM_ENTRY_UT_PARAM, (Object) e);
                    }
                    if (!jSONObject2.containsKey("entryUtparamPre")) {
                        jSONObject2.put("entryUtparamPre", (Object) k);
                    }
                }
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(jSONObject, z, jSONObject2, jVar));
        }
    }

    public static void enter(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358a0cb4", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(wua.KEY_PROPERTIES);
            if (jSONObject2 == null || jSONObject2.get("enterFromTabChild") == null) {
                enterFromCommonPage(jVar, jSONObject);
            } else {
                enterFromTabChild(jVar, jSONObject);
            }
        }
    }

    private static void enterFromCommonPage(d.j jVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799f440", new Object[]{jVar, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(jVar);
            h2e d = od0.D().d();
            if (TextUtils.isEmpty(string)) {
                d.d(uTObjectWithContext, null);
            } else {
                d.updatePageName(uTObjectWithContext, string);
                d.d(uTObjectWithContext, string);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(wua.KEY_PROPERTIES);
            if (jSONObject2 != null) {
                HashMap hashMap = new HashMap();
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                addDSLInfo(hashMap, jVar);
                d.updatePageProperties(uTObjectWithContext, hashMap);
            }
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    private static void enterFromTabChild(d.j jVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105ba9ed", new Object[]{jVar, jSONObject});
        }
    }

    public static void exit(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d5852e", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(jVar);
            h2e d = od0.D().d();
            if (!TextUtils.isEmpty(string)) {
                d.updatePageName(uTObjectWithContext, string);
            }
            d.pageDisAppear(uTObjectWithContext);
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    private static n findTabbarControllerRootNode(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("787c42d7", new Object[]{jVar});
        }
        if (!((JSONObject) jVar.b).containsKey("target")) {
            return null;
        }
        n a0 = jVar.f11976a.a0(((JSONObject) jVar.b).getInteger("target").intValue());
        n u = q.u(a0);
        if (u != null) {
            return u;
        }
        n g0 = a0.g0();
        return g0.l0() instanceof a5k ? q.u(((a5k) g0.l0()).getNode()) : u;
    }

    public static Object getUTObjectWithContext(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2cac533b", new Object[]{jVar});
        }
        Object obj = null;
        if (jVar == null) {
            return null;
        }
        o oVar = jVar.f11976a;
        if (oVar != null && (obj = oVar.g0(R.id.layout_manager_engine_utobject_tag)) == null && (jVar.f11976a.W() instanceof anl)) {
            obj = ((anl) jVar.f11976a.W()).getUTObject();
        }
        if (obj == null) {
            return jVar.c();
        }
        return obj;
    }

    private static void updateFirstPageNameIfNeeded(d.j jVar, String str) {
        xe c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8c20e3", new Object[]{jVar, str});
            return;
        }
        bod e = ye.e(jVar);
        if (e != null) {
            ye<?> findSecPageWrapper = e.findSecPageWrapper();
            if (findSecPageWrapper == null || (c = findSecPageWrapper.c()) == null || !(c.b() instanceof TNodeView) || ((TNodeView) c.b()).getEngine() != jVar.f11976a) {
                e.setFirstPageName(str);
            }
        }
    }

    private static void updateFirstPagePropertyIfNeeded(d.j jVar, HashMap hashMap) {
        xe c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71421504", new Object[]{jVar, hashMap});
            return;
        }
        bod e = ye.e(jVar);
        if (e != null) {
            ye<?> findSecPageWrapper = e.findSecPageWrapper();
            if (findSecPageWrapper == null || (c = findSecPageWrapper.c()) == null || !(c.b() instanceof TNodeView) || ((TNodeView) c.b()).getEngine() != jVar.f11976a) {
                e.setFirstPageProperty(hashMap);
            }
        }
    }

    public static void updateNextPageProperties(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fe82ae", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            od0.D().d().updateNextPageProperties(hashMap);
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void updateNextPageUtparams(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d02707c", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            od0.D().d().j(hashMap);
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageUrl(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60418115", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            od0.D().d().updatePageUrl(getUTObjectWithContext(jVar), jSONObject.getString("url"));
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageUtparams(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75d9b2f", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            od0.D().d().g(getUTObjectWithContext(jVar), hashMap);
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void updateProperties(d.j jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2610530", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (jSONObject = (JSONObject) json) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(wua.KEY_PROPERTIES);
            if (jSONObject2 != null) {
                HashMap hashMap = new HashMap();
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                addDSLInfo(hashMap, jVar);
                Object uTObjectWithContext = getUTObjectWithContext(jVar);
                n findTabbarControllerRootNode = findTabbarControllerRootNode(jVar);
                if (isUpdateCurrentPage(findTabbarControllerRootNode)) {
                    AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(jVar, uTObjectWithContext, hashMap));
                }
                cacheTabPageProperty(findTabbarControllerRootNode, hashMap);
                updateFirstPagePropertyIfNeeded(jVar, hashMap);
            }
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void updatePageName(d.j jVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d56049", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            Object uTObjectWithContext = getUTObjectWithContext(jVar);
            n findTabbarControllerRootNode = findTabbarControllerRootNode(jVar);
            if (isUpdateCurrentPage(findTabbarControllerRootNode)) {
                if (akt.V0() && jVar.f11976a.L() != null) {
                    z = jVar.f11976a.L().isContainerResumed();
                }
                if (z) {
                    tfs.g("TrackerModule", "updatePageName:" + string);
                    od0.D().d().updatePageName(uTObjectWithContext, string);
                }
            }
            cacheTabPageName(findTabbarControllerRootNode, string);
            updateFirstPageNameIfNeeded(jVar, string);
            tfs.g(TAG, jSONObject.toJSONString());
        }
    }

    public static void getSpmUrlAndSpmPre(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe52bb7", new Object[]{jVar});
        } else if (jVar.c != null) {
            HashMap hashMap = new HashMap();
            String[] i = od0.D().d().i(getUTObjectWithContext(jVar));
            if (i != null && i.length == 2) {
                hashMap.put("spmUrl", i[0]);
                hashMap.put("spmPre", i[1]);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("spms", (Object) hashMap);
            jVar.c.a(jVar, jSONObject);
        }
    }

    private static boolean isUpdateCurrentPage(n nVar) {
        n Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("977085ba", new Object[]{nVar})).booleanValue();
        }
        if (!(nVar == null || !akt.b2() || (Y = nVar.Y()) == null)) {
            TabBarControllerComponent tabBarControllerComponent = (TabBarControllerComponent) Y.K();
            if (tabBarControllerComponent != null && tabBarControllerComponent.getView() != null) {
                return tabBarControllerComponent.S(tabBarControllerComponent.getView().getCurrentItem()) == nVar;
            }
            if (akt.v0()) {
                int t = nwv.t(Y.H("selected-index"), 0);
                n e = h.e(Y, ir2.s(Y.H("group")));
                if (e != null) {
                    t = Math.max(t, nwv.t(e.H("init-index"), 0));
                }
                return Y.i0(t) == nVar;
            }
        }
        return true;
    }

    public static void addDSLInfo(Map<String, String> map, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b4937f", new Object[]{map, jVar});
        } else if (map != null && jVar != null && jVar.f11976a != null) {
            map.put("_TNode", "TNode");
            map.put("tnode_dsl_md5", jVar.f11976a.N());
            map.put("tnode_dsl_time", jVar.f11976a.O());
        }
    }

    @Priority(name = "low")
    public static void commit(d.j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52269e3f", new Object[]{jVar, new Boolean(z)});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            commitInternal(jVar, z, (JSONObject) json, false);
        }
    }

    public static void addDSLInfo(List<String> list, d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e694551", new Object[]{list, jVar});
        } else if (list != null) {
            list.add("_TNode=TNode");
            if (jVar != null && jVar.f11976a != null) {
                list.add("tnode_dsl_md5=" + jVar.f11976a.N());
                list.add("tnode_dsl_time=" + jVar.f11976a.O());
            }
        }
    }
}

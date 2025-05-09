package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.component.EditTextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.component.e;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import tb.akt;
import tb.bqe;
import tb.c0n;
import tb.fj8;
import tb.nwv;
import tb.pg1;
import tb.s6o;
import tb.sxo;
import tb.t2o;
import tb.tfs;
import tb.ut2;

/* compiled from: Taobao */
@CleanAnnotation(name = "clean")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ElementModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<o, SparseArray> componentObservers = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements n.e<n> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12324a;

        public a(String str) {
            this.f12324a = str;
        }

        /* renamed from: c */
        public boolean a(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e13bdd0a", new Object[]{this, nVar})).booleanValue();
            }
            if (((e) nVar.K()) == null) {
                return false;
            }
            if (TextUtils.isEmpty(this.f12324a)) {
                return TextUtils.isEmpty(nwv.I(nVar.H("id"), null));
            }
            return TextUtils.equals(nwv.I(nVar.H("id"), null), this.f12324a);
        }

        /* renamed from: d */
        public boolean b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("429eb190", new Object[]{this, nVar})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12325a;

        public b(n nVar) {
            this.f12325a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12325a.w0() != null) {
                nwv.D0(this.f12325a.w0());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements ScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f12326a;
        public final /* synthetic */ d.j b;
        public final /* synthetic */ String c;
        public final /* synthetic */ TNodeRecyclerView d;
        public final /* synthetic */ ScrollChangeListener[] e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                cVar.d.removeScrollChangeListener(cVar.e[0]);
            }
        }

        public c(n nVar, d.j jVar, String str, TNodeRecyclerView tNodeRecyclerView, ScrollChangeListener[] scrollChangeListenerArr) {
            this.f12326a = nVar;
            this.b = jVar;
            this.c = str;
            this.d = tNodeRecyclerView;
            this.e = scrollChangeListenerArr;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onNestScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScroll(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
        public void onScrollStateChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == 0) {
                ElementModule.access$000(this.f12326a, this.b, this.c);
                nwv.y0(new a());
            }
        }
    }

    static {
        t2o.a(503317294);
        t2o.a(503316559);
    }

    public static /* synthetic */ void access$000(n nVar, d.j jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db780a2", new Object[]{nVar, jVar, str});
        } else {
            getSnapshotInternal(nVar, jVar, str);
        }
    }

    public static void addAttributeListener(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d3aa9d", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("targetId");
            String string2 = jSONObject.getString("name");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null) {
                n findTargetNode = findTargetNode(a0, jSONObject.getString("id"));
                n findTargetNode2 = findTargetNode(a0, string);
                if (findTargetNode != null && findTargetNode2 != null) {
                    findTargetNode2.b(new fj8(findTargetNode2, string2, findTargetNode, jVar));
                }
            }
        }
    }

    public static void addEventListener(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36f32df", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("targetId");
            String string2 = jSONObject.getString("name");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null) {
                n findTargetNode = findTargetNode(a0, jSONObject.getString("id"));
                n findTargetNode2 = findTargetNode(a0, string);
                if (findTargetNode != null && findTargetNode2 != null) {
                    findTargetNode2.b(new fj8(findTargetNode2, string2, findTargetNode, jVar));
                }
            }
        }
    }

    public static void bindAttributeListener(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc473339", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            JSONObject jSONObject2 = jSONObject.getJSONObject("attrs");
            JSONObject jSONObject3 = jSONObject.getJSONObject("bindattrs");
            JSONObject jSONObject4 = jSONObject.getJSONObject("defaultattrs");
            JSONObject jSONObject5 = jSONObject.getJSONObject(pg1.ATOM_EXT_bind);
            JSONObject jSONObject6 = jSONObject.getJSONObject("options");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null) {
                n findTargetNode = findTargetNode(a0, jSONObject.getString("id"));
                n findTargetNode2 = findTargetNode(a0, jSONObject5.getString("id"));
                if (findTargetNode != null && findTargetNode2 != null) {
                    findTargetNode2.b(new fj8(jVar, findTargetNode2, jSONObject5, findTargetNode, jSONObject2, jSONObject3, jSONObject4, jSONObject6));
                }
            }
        }
    }

    public static void bindEventListener(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7157697b", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            JSONObject jSONObject2 = jSONObject.getJSONObject("attrs");
            JSONObject jSONObject3 = jSONObject.getJSONObject("bindattrs");
            JSONObject jSONObject4 = jSONObject.getJSONObject("defaultattrs");
            JSONObject jSONObject5 = jSONObject.getJSONObject("event");
            JSONObject jSONObject6 = jSONObject.getJSONObject("options");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null) {
                n findTargetNode = findTargetNode(a0, jSONObject.getString("id"));
                n findTargetNode2 = findTargetNode(a0, jSONObject5.getString("id"));
                if (findTargetNode != null && findTargetNode2 != null) {
                    findTargetNode2.b(new fj8(jVar, findTargetNode2, jSONObject5, findTargetNode, jSONObject2, jSONObject3, jSONObject4, jSONObject6));
                }
            }
        }
    }

    public static void call(d.j jVar) {
        n a0;
        n findTargetNode;
        Component K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c00abee", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("name");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (!TextUtils.isEmpty(string) && (a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"))) != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null && (K = findTargetNode.K()) != null) {
                try {
                    K.invoke(jVar, string, jSONObject2, jVar.c);
                } catch (Exception e) {
                    tfs.d(e.getMessage());
                }
            }
        }
    }

    public static void clean(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557c1de0", new Object[]{oVar});
        } else {
            componentObservers.remove(oVar);
        }
    }

    public static n findTargetNode(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("ac89fb6b", new Object[]{nVar, str});
        }
        return q.j(nVar, str);
    }

    public static void setFocus(d.j jVar) {
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4e5fb6", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            boolean booleanValue = jSONObject.getBoolean(Constants.Event.FOCUS).booleanValue();
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null && findTargetNode.w0() != null && (findTargetNode.K() instanceof EditTextComponent)) {
                if (booleanValue) {
                    findTargetNode.w0().requestFocus();
                    nwv.A0(new b(findTargetNode), 100L);
                    return;
                }
                findTargetNode.w0().clearFocus();
                nwv.O(findTargetNode.N());
            }
        }
    }

    public static void setOpacity(d.j jVar) {
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb48b63", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            float floatValue = jSONObject.getFloatValue("opacity");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null) {
                try {
                    findTargetNode.g1("opacity", Float.valueOf(floatValue));
                    findTargetNode.K().getViewParams().T = floatValue;
                    if (findTargetNode.w0() != null) {
                        findTargetNode.w0().setAlpha(floatValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void setProgress(d.j jVar) {
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285bdabd", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            int intValue = jSONObject.getIntValue("progress");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null && (findTargetNode.K() instanceof c0n)) {
                ((c0n) findTargetNode.K()).r(intValue);
            }
        }
    }

    public static void setText(d.j jVar) {
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3146bd", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("text");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null) {
                Component K = findTargetNode.K();
                if (K instanceof TextComponent) {
                    ((TextComponent) K).elementSetText(string);
                }
            }
        }
    }

    public static void setToFront(d.j jVar) {
        n findTargetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f00c60", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null && findTargetNode.K() != null) {
                findTargetNode.K().invoke(jVar, "setToFront", null, jVar.c);
            }
        }
    }

    private static void unFolderTab(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf423cbd", new Object[]{nVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("foldTab", Boolean.FALSE);
        nVar.K().sendMessage(nVar, "foldtab", null, hashMap, null);
    }

    public static void findComponents(d.j jVar) {
        n w;
        n w2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158d19bd", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            String string = jSONObject.getString("id");
            boolean booleanValue = jSONObject.getBooleanValue("root");
            boolean o = nwv.o(jSONObject.get("depth"), true);
            if (booleanValue) {
                if (a0 != null) {
                    a0 = a0.g0();
                } else {
                    a0 = jVar.f11976a.d0();
                }
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (a0 != null) {
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        String I = nwv.I(it.next(), null);
                        if (!TextUtils.isEmpty(I) && (w2 = a0.w(I, !o)) != null) {
                            arrayList.add(w2);
                        }
                    }
                } else if (!TextUtils.isEmpty(string) && (w = a0.w(string, true ^ o)) != null) {
                    arrayList.add(w);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                n nVar = (n) it2.next();
                hashMap.put(nVar.H("id"), Integer.valueOf(nVar.U()));
            }
            d.k kVar = jVar.c;
            if (kVar != null) {
                kVar.a(jVar, hashMap);
            }
        }
    }

    public static void scrollToBottom(d.j jVar) {
        sxo sxoVar;
        int scrollCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b836579", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n findTargetNode = findTargetNode(jVar.f11976a.a0(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            boolean o = nwv.o(jSONObject.get("animated"), true);
            if (findTargetNode != null) {
                Component K = findTargetNode.K();
                if ((K instanceof sxo) && (scrollCount = (sxoVar = (sxo) K).getScrollCount()) > 0) {
                    sxoVar.scrollToPosition(scrollCount - 1, o, 2);
                }
            }
        }
    }

    public static void selectTab(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638271b3", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            int intValue = jSONObject.getIntValue("index");
            n z = jVar.f11976a.a0(jSONObject.getIntValue("target")).g0().z(e.class, new a(jSONObject.getString("id")), false);
            if (z != null) {
                ((e) z.K()).N(intValue);
            }
        }
    }

    public static void getSnapshot(d.j jVar) {
        n findTargetNode;
        TNodeRecyclerView tNodeRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab316292", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            String string = jSONObject.getString("key");
            if (!(a0 == null || (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) == null)) {
                if (TextUtils.isEmpty(string)) {
                    string = "snapshot_node_" + findTargetNode.U();
                }
                try {
                    n z = findTargetNode.z(ListViewComponent.class, null, true);
                    if (z == null || (tNodeRecyclerView = (TNodeRecyclerView) z.w0()) == null || tNodeRecyclerView.getScrollState() == 0) {
                        getSnapshotInternal(findTargetNode, jVar, string);
                        return;
                    }
                    c cVar = new c(findTargetNode, jVar, string, tNodeRecyclerView, r1);
                    tNodeRecyclerView.addScrollChangeListener(cVar);
                    ScrollChangeListener[] scrollChangeListenerArr = {cVar};
                    return;
                } catch (Exception unused) {
                }
            }
            d.k kVar = jVar.c;
            if (kVar != null) {
                kVar.b(jVar, new d.h("AC_ERR_FAILED", "AC_ERR_PARAM", null));
            }
        }
    }

    private static void getSnapshotInternal(n nVar, d.j jVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82004949", new Object[]{nVar, jVar, str});
            return;
        }
        Component.k snapshot = nVar.K().getSnapshot();
        if (snapshot != null) {
            ut2.q(str, snapshot);
            if (snapshot.d == null) {
                Context c2 = jVar.c();
                if (c2 instanceof Activity) {
                    try {
                        View decorView = ((Activity) c2).getWindow().getDecorView();
                        decorView.setDrawingCacheEnabled(true);
                        decorView.buildDrawingCache();
                        Bitmap drawingCache = decorView.getDrawingCache();
                        if (drawingCache != null) {
                            snapshot.e = Bitmap.createBitmap(drawingCache);
                        }
                        decorView.setDrawingCacheEnabled(false);
                    } catch (Throwable th) {
                        tfs.e("failed to get drawcache", th.getMessage());
                    }
                }
            }
        }
        if (jVar.c != null) {
            HashMap hashMap = new HashMap();
            if (snapshot != null) {
                hashMap.put("imageUrl", snapshot.f12192a);
                hashMap.put("location", snapshot.b.left + "," + snapshot.b.top + "," + snapshot.b.right + "," + snapshot.b.bottom);
                hashMap.put("view_x", Integer.valueOf(snapshot.b.left));
                hashMap.put("view_y", Integer.valueOf(snapshot.b.top));
                Rect rect = snapshot.b;
                hashMap.put("view_w", Integer.valueOf(rect.right - rect.left));
                Rect rect2 = snapshot.b;
                hashMap.put("view_h", Integer.valueOf(rect2.bottom - rect2.top));
            }
            if (!(nVar.K().getViewParams() instanceof bqe) || (str2 = ((bqe) nVar.K().getViewParams()).E0) == null) {
                str2 = "cover";
            }
            hashMap.put("contentMode", str2);
            hashMap.put("borderRadius", Integer.valueOf(nVar.K().getViewParams().J));
            hashMap.put("key", str);
            jVar.c.a(jVar, hashMap);
        }
    }

    public static void scroll(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6409c25f", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("offset");
            n nVar = null;
            String[] split = string != null ? string.split(",") : null;
            if (split != null && split.length == 2) {
                boolean o = nwv.o(jSONObject.get("animated"), true);
                n findTargetNode = findTargetNode(jVar.f11976a.a0(jSONObject.getIntValue("target")), jSONObject.getString("id"));
                boolean o2 = nwv.o(jSONObject.get("scrollby"), false);
                if (findTargetNode != null) {
                    o oVar = jVar.f11976a;
                    if (oVar != null) {
                        nVar = oVar.d0();
                    }
                    Component K = findTargetNode.K();
                    int U = s6o.U(nVar, jVar.c(), nwv.r(split[0].trim(), 0));
                    int U2 = s6o.U(nVar, jVar.c(), nwv.r(split[1].trim(), 0));
                    if (!(K instanceof sxo)) {
                        return;
                    }
                    if (o2) {
                        ((sxo) K).scrollBy(U, U2, o);
                    } else {
                        ((sxo) K).scrollTo(U, U2, o);
                    }
                }
            }
        }
    }

    public static void scrollToIndex(d.j jVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171e9042", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n findTargetNode = findTargetNode(jVar.f11976a.a0(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            int t = nwv.t(jSONObject.get("index"), -1);
            int t2 = nwv.t(jSONObject.get("jumpNumber"), 0);
            boolean o = nwv.o(jSONObject.get("animated"), true);
            String I = nwv.I(jSONObject.get("position"), "none");
            if ("middle".equals(I)) {
                i = 1;
            } else if ("bottom".equals(I)) {
                i = 2;
            }
            if (findTargetNode != null || t >= 0) {
                Component K = findTargetNode.K();
                if (K instanceof sxo) {
                    ((sxo) K).scrollToPositionWithNumber(t, o, i, t2);
                }
            }
        }
    }

    public static void scrollToTop(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99888b1f", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            n findTargetNode = findTargetNode(jVar.f11976a.a0(jSONObject.getIntValue("target")), jSONObject.getString("id"));
            boolean o = nwv.o(jSONObject.get("animated"), true);
            if (findTargetNode != null) {
                if (akt.p2("enableNewScrollToTop", true)) {
                    Component K = findTargetNode.K();
                    if (K instanceof sxo) {
                        ((sxo) K).scrollToPosition(0, o, 0);
                        unFolderTab(findTargetNode);
                    }
                } else if (findTargetNode.w0() instanceof AbsListView) {
                    ((AbsListView) findTargetNode.w0()).setSelection(0);
                    unFolderTab(findTargetNode);
                } else if (findTargetNode.w0() instanceof RecyclerView) {
                    ((RecyclerView) findTargetNode.w0()).scrollToPosition(0);
                    unFolderTab(findTargetNode);
                } else if (findTargetNode.w0() instanceof ScrollView) {
                    ((ScrollView) findTargetNode.w0()).fullScroll(33);
                }
            }
        }
    }

    public static void scrollby(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45c8528", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("offset");
            String[] split = string != null ? string.split(",") : null;
            if (split != null && split.length == 2) {
                boolean o = nwv.o(jSONObject.get("animated"), true);
                n findTargetNode = findTargetNode(jVar.f11976a.a0(jSONObject.getIntValue("target")), jSONObject.getString("id"));
                if (findTargetNode != null) {
                    Component K = findTargetNode.K();
                    int S = s6o.S(jVar.c(), (int) nwv.r(split[0].trim(), 0));
                    int S2 = s6o.S(jVar.c(), (int) nwv.r(split[1].trim(), 0));
                    if (K instanceof sxo) {
                        ((sxo) K).scrollBy(S, S2, o);
                    }
                }
            }
        }
    }

    public static void setAttributes(d.j jVar) {
        n l1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c5cf53", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            JSONObject jSONObject2 = jSONObject.getJSONObject("options");
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            HashSet hashSet = new HashSet();
            n.f fVar = new n.f(jVar, jSONObject2);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                jSONArray.add(jSONObject);
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string = jSONObject3.getString("id");
                n findTargetNode = !TextUtils.isEmpty(string) ? findTargetNode(a0, string) : a0;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("attrs");
                if (!(findTargetNode == null || (l1 = findTargetNode.l1(jSONObject4, fVar, akt.L0())) == null)) {
                    hashSet.add(new Pair(l1, fVar));
                }
            }
            n.e(hashSet, fVar);
        }
    }

    public static void setHidden(d.j jVar) {
        n findTargetNode;
        AlphaAnimation alphaAnimation;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c43560", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            boolean o = nwv.o(jSONObject.get("hidden"), false);
            boolean o2 = nwv.o(jSONObject.get("animated"), true);
            n a0 = jVar.f11976a.a0(jSONObject.getIntValue("target"));
            if (a0 != null && (findTargetNode = findTargetNode(a0, jSONObject.getString("id"))) != null) {
                try {
                    findTargetNode.K().getViewParams().U = !o;
                    View w0 = findTargetNode.w0();
                    if (w0 != null) {
                        if (o2) {
                            if (o) {
                                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            } else {
                                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            }
                            alphaAnimation.setDuration(nwv.y(jSONObject.get("duration"), 300L));
                        } else {
                            alphaAnimation = null;
                        }
                        if (alphaAnimation != null) {
                            w0.startAnimation(alphaAnimation);
                        }
                        findTargetNode.K().getViewParams().V = Boolean.valueOf(!o);
                        findTargetNode.K().getViewParams().U = true ^ o;
                        if (o) {
                            i = 8;
                        }
                        w0.setVisibility(i);
                        if (!o) {
                            findTargetNode.b1(w0.getContext());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}

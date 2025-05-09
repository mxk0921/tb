package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.sex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sex {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_CLICK = "click";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.sex.i
        public void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e593d3c", new Object[]{this, hVar});
            }
        }

        @Override // tb.sex.i
        public void b(h hVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4c10537", new Object[]{this, hVar, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionModel f27999a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ j d;
        public final /* synthetic */ oe8 e;
        public final /* synthetic */ shx f;
        public final /* synthetic */ ComponentBaseModel g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Map i;

        public b(ActionModel actionModel, JSONArray jSONArray, AtomicInteger atomicInteger, j jVar, oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, Map map) {
            this.f27999a = actionModel;
            this.b = jSONArray;
            this.c = atomicInteger;
            this.d = jVar;
            this.e = oe8Var;
            this.f = shxVar;
            this.g = componentBaseModel;
            this.h = str;
            this.i = map;
        }

        public static /* synthetic */ void e(AtomicInteger atomicInteger, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e5c710", new Object[]{atomicInteger, jVar});
            } else {
                sex.e(atomicInteger, jVar);
            }
        }

        public static /* synthetic */ void f(AtomicInteger atomicInteger, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fdf0693", new Object[]{atomicInteger, jVar});
            } else {
                sex.e(atomicInteger, jVar);
            }
        }

        @Override // tb.sex.i
        public void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e593d3c", new Object[]{this, hVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f27999a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) "");
                this.b.add(jSONObject);
                List<String> list = this.f27999a.nextActions;
                if (list != null && !list.isEmpty()) {
                    oe8 oe8Var = this.e;
                    shx shxVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str = this.h;
                    List<String> list2 = this.f27999a.nextActions;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    final AtomicInteger atomicInteger = this.c;
                    final j jVar = this.d;
                    sex.f(oe8Var, shxVar, componentBaseModel, str, list2, map, jSONArray, new j() { // from class: tb.tex
                        @Override // tb.sex.j
                        public final void a() {
                            sex.b.f(atomicInteger, jVar);
                        }
                    });
                    return;
                }
                sex.e(this.c, this.d);
            } catch (Throwable th) {
                yv8.b("PopAction.iterateActionTree.onSuccess.error.", th);
            }
        }

        @Override // tb.sex.i
        public void b(h hVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4c10537", new Object[]{this, hVar, str, str2});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f27999a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) str);
                this.b.add(jSONObject);
                List<String> list = this.f27999a.fallbackNextActions;
                if (list != null && !list.isEmpty()) {
                    oe8 oe8Var = this.e;
                    shx shxVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str3 = this.h;
                    List<String> list2 = this.f27999a.fallbackNextActions;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    final AtomicInteger atomicInteger = this.c;
                    final j jVar = this.d;
                    sex.f(oe8Var, shxVar, componentBaseModel, str3, list2, map, jSONArray, new j() { // from class: tb.uex
                        @Override // tb.sex.j
                        public final void a() {
                            sex.b.e(atomicInteger, jVar);
                        }
                    });
                    return;
                }
                sex.e(this.c, this.d);
            } catch (Throwable th) {
                yv8.b("PopAction.iterateActionTree.onFail.error.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final oe8 f28000a;
        public final shx b;
        public final ActionModel c;
        public final i d;

        static {
            t2o.a(435159080);
        }

        public h(oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, i iVar) {
            this.f28000a = oe8Var;
            this.b = shxVar;
            this.c = actionModel;
            this.d = iVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface i {
        void a(h hVar);

        void b(h hVar, String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface j {
        void a();
    }

    static {
        t2o.a(435159072);
    }

    public static /* synthetic */ void e(AtomicInteger atomicInteger, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296a97a7", new Object[]{atomicInteger, jVar});
        } else {
            v(atomicInteger, jVar);
        }
    }

    public static /* synthetic */ void f(oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, Collection collection, Map map, JSONArray jSONArray, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b995a3", new Object[]{oe8Var, shxVar, componentBaseModel, str, collection, map, jSONArray, jVar});
        } else {
            o(oe8Var, shxVar, componentBaseModel, str, collection, map, jSONArray, jVar);
        }
    }

    public static boolean h(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f0e2cc6", new Object[]{hVar})).booleanValue();
        }
        ActionModel actionModel = hVar.c;
        oe8 oe8Var = hVar.f28000a;
        String g2 = a1n.g(oe8Var, actionModel.content);
        if (TextUtils.isEmpty(g2)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(g2));
        intent.setFlags(805339136);
        oe8Var.j().e().startActivity(intent);
        agu aguVar = hVar.b.f28064a;
        abu.c(aguVar.f15730a, aguVar.c, aguVar.d, "call", g2);
        i iVar = hVar.d;
        if (iVar != null) {
            iVar.a(hVar);
        }
        return true;
    }

    public static boolean j(h hVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2114a5ec", new Object[]{hVar})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(hVar.c.content);
        boolean equals = "cancel".equals(hVar.c.userResult);
        if (parseObject != null) {
            z = parseObject.getBooleanValue("interruptable");
        }
        oe8 oe8Var = hVar.f28000a;
        String str = hVar.c.type;
        oe8Var.b("handleClose." + str, "", z, null);
        if (equals) {
            agu aguVar = hVar.b.f28064a;
            abu.c(aguVar.f15730a, aguVar.c, aguVar.d, "close", "");
        }
        i iVar = hVar.d;
        if (iVar != null) {
            iVar.a(hVar);
        }
        return true;
    }

    public static void l(oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, List<ActionsItemModel> list) {
        ActionsItemModel actionsItemModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82db3bcc", new Object[]{oe8Var, shxVar, componentBaseModel, str, list});
            return;
        }
        try {
            Iterator<ActionsItemModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    actionsItemModel = null;
                    break;
                }
                actionsItemModel = it.next();
                if (actionsItemModel != null && actionsItemModel.isValid() && actionsItemModel.type.equals(str)) {
                    break;
                }
            }
            if (actionsItemModel != null) {
                HashMap hashMap = new HashMap();
                List<String> list2 = actionsItemModel.startActions;
                for (ActionModel actionModel : actionsItemModel.content) {
                    if (actionModel != null && actionModel.isValid() && !TextUtils.isEmpty(actionModel.id)) {
                        hashMap.put(actionModel.id, actionModel);
                    }
                }
                yv8.a("PopAction.doMultiActions.componentModel=%s.actionModelMap=%s.", componentBaseModel.id, hashMap);
                o(oe8Var, shxVar, componentBaseModel, actionsItemModel.type, list2, hashMap, new JSONArray(), null);
            }
        } catch (Throwable th) {
            yv8.b("PopAction.doMultiActions.error.", th);
        }
    }

    public static void m(oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5410ebb7", new Object[]{oe8Var, shxVar, componentBaseModel, str, actionModel});
            return;
        }
        try {
            if (str.equals(actionModel.type)) {
                yv8.a("PopAction.doSingleAction.actionType=%s.componentModel=%s.actionBehavior=%s", str, componentBaseModel.id, actionModel.behavior);
                if (k(new h(oe8Var, shxVar, componentBaseModel, str, actionModel, new a())) && actionModel.autoClose) {
                    oe8Var.b("AutoCloseAfterAction", "", false, new ell(oe8Var, componentBaseModel.id, str, actionModel.behavior, ""));
                }
            }
        } catch (Throwable th) {
            yv8.b("PopAction.doSingleAction.error.", th);
        }
    }

    public static void n(final oe8 oe8Var, final shx shxVar, final ComponentBaseModel componentBaseModel, final String str, final ActionModel actionModel, final List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da72c61d", new Object[]{oe8Var, shxVar, componentBaseModel, str, actionModel, list});
        } else if (oe8Var != null && componentBaseModel != null && !TextUtils.isEmpty(str)) {
            oe8Var.w(new Runnable() { // from class: tb.oex
                @Override // java.lang.Runnable
                public final void run() {
                    sex.q(ActionModel.this, oe8Var, shxVar, componentBaseModel, str, list);
                }
            });
        }
    }

    public static void o(oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, Collection<String> collection, Map<String, ActionModel> map, JSONArray jSONArray, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec7ba6", new Object[]{oe8Var, shxVar, componentBaseModel, str, collection, map, jSONArray, jVar});
        } else if (collection != null && !collection.isEmpty()) {
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            for (String str2 : collection) {
                ActionModel actionModel = map.get(str2);
                b bVar = new b(actionModel, jSONArray, atomicInteger, jVar, oe8Var, shxVar, componentBaseModel, str, map);
                if (actionModel == null) {
                    v(atomicInteger, jVar);
                } else {
                    boolean a2 = af4.a(actionModel.preCondition, oe8Var, false);
                    yv8.a("PopAction.doMultiActions.iterateActionTree.action=%s.shouldDoAction=%s.", actionModel.id, Boolean.valueOf(a2));
                    if (!a2) {
                        v(atomicInteger, jVar);
                    } else if (!k(new h(oe8Var, shxVar, componentBaseModel, str, actionModel, bVar))) {
                        v(atomicInteger, jVar);
                    }
                }
                atomicInteger = atomicInteger;
            }
        } else if (jVar != null) {
            jVar.a();
        }
    }

    public static /* synthetic */ void q(ActionModel actionModel, oe8 oe8Var, shx shxVar, ComponentBaseModel componentBaseModel, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd410dae", new Object[]{actionModel, oe8Var, shxVar, componentBaseModel, str, list});
            return;
        }
        if (actionModel != null) {
            try {
                if (actionModel.isValid()) {
                    m(oe8Var, shxVar, componentBaseModel, str, actionModel);
                }
            } catch (Throwable th) {
                yv8.b("PopAction.handleAction.error", th);
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            l(oe8Var, shxVar, componentBaseModel, str, list);
        }
    }

    public static /* synthetic */ void r(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160416b2", new Object[]{hVar, new Boolean(z)});
            return;
        }
        i iVar = hVar.d;
        if (iVar != null) {
            iVar.a(hVar);
        }
    }

    public static void v(AtomicInteger atomicInteger, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a0bd48", new Object[]{atomicInteger, jVar});
        } else if (atomicInteger.decrementAndGet() == 0 && jVar != null) {
            jVar.a();
        }
    }

    public static boolean i(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("556f19d9", new Object[]{hVar})).booleanValue();
        }
        oe8 oe8Var = hVar.f28000a;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.taobao.taobao", "com.etao.feimagesearch.quicksearch.ScreenRecordActivity"));
        intent.putExtra("pssource", "floatbar");
        intent.putExtra(wxi.KEY_PHOTO_FROM, "floatbar");
        intent.addFlags(268435456);
        oe8Var.j().e().startActivity(intent);
        agu aguVar = hVar.b.f28064a;
        abu.c(aguVar.f15730a, aguVar.c, aguVar.d, "callPaiLiTao", "");
        return true;
    }

    public static boolean u(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16501046", new Object[]{hVar})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(hVar.c.content);
        final String string = parseObject.getString("translateMode");
        final boolean booleanValue = parseObject.getBooleanValue("translateX");
        final boolean booleanValue2 = parseObject.getBooleanValue("translateY");
        final long longValue = parseObject.getLongValue("x");
        final long longValue2 = parseObject.getLongValue("y");
        final long longValue3 = parseObject.getLongValue("duration");
        Boolean bool = parseObject.getBoolean("canBreak");
        final boolean booleanValue3 = bool != null ? bool.booleanValue() : true;
        hVar.f28000a.x(new Runnable() { // from class: tb.qex
            @Override // java.lang.Runnable
            public final void run() {
                sex.s(sex.h.this, string, booleanValue3, booleanValue, longValue, booleanValue2, longValue2, longValue3);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    public static boolean t(h hVar) {
        String str;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3faf587", new Object[]{hVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ActionModel actionModel = hVar.c;
        try {
            arrayList2 = (List) JSON.parseObject(actionModel.target, new c(), new Feature[0]);
        } catch (Throwable unused) {
            arrayList2.add(actionModel.target);
        }
        JSONObject parseObject = JSON.parseObject(actionModel.content);
        if (parseObject != null) {
            String string = parseObject.getString("targetGroupStates");
            if (!TextUtils.isEmpty(string)) {
                try {
                    arrayList = (List) JSON.parseObject(string, new d(), new Feature[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                String string2 = parseObject.getString("targetStates");
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        arrayList2 = (List) JSON.parseObject(string2, new e(), new Feature[0]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (parseObject == null || !parseObject.containsKey(c4o.KEY_SWITCH_MODE)) {
            str = "";
        } else {
            str = parseObject.getString(c4o.KEY_SWITCH_MODE);
        }
        if (parseObject == null || !parseObject.containsKey("excludeSelf")) {
            bool = Boolean.FALSE;
        } else {
            bool = parseObject.getBoolean("excludeSelf");
        }
        if (hVar.f28000a.D(arrayList, arrayList2, pg1.ATOM_EXT_random.equals(str), Boolean.TRUE.equals(bool))) {
            i iVar = hVar.d;
            if (iVar != null) {
                iVar.a(hVar);
            }
        } else {
            i iVar2 = hVar.d;
            if (iVar2 != null) {
                iVar2.b(hVar, "SwitchStateFailed", "");
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r3.equals("call") == false) goto L_0x0040;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(tb.sex.h r6) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.sex.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.String r0 = "62315423"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r0, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001a:
            if (r6 == 0) goto L_0x00a4
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r3 = r6.c
            if (r3 != 0) goto L_0x0022
            goto L_0x00a4
        L_0x0022:
            java.lang.String r4 = r3.id
            java.lang.String r3 = r3.behavior
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r2] = r4
            r5[r1] = r3
            java.lang.String r3 = "PopAction.doAction.id=%s.behavior=%s"
            tb.yv8.a(r3, r5)
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r3 = r6.c
            java.lang.String r3 = r3.behavior
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -889473228: goto L_0x0078;
                case -182923669: goto L_0x006d;
                case 3045982: goto L_0x0064;
                case 94756344: goto L_0x0059;
                case 962366379: goto L_0x004e;
                case 1052832078: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r0 = -1
            goto L_0x0083
        L_0x0042:
            java.lang.String r0 = "translate"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x0040
        L_0x004c:
            r0 = 5
            goto L_0x0083
        L_0x004e:
            java.lang.String r0 = "callPaiLiTao"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x0040
        L_0x0057:
            r0 = 4
            goto L_0x0083
        L_0x0059:
            java.lang.String r0 = "close"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x0040
        L_0x0062:
            r0 = 3
            goto L_0x0083
        L_0x0064:
            java.lang.String r1 = "call"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0083
            goto L_0x0040
        L_0x006d:
            java.lang.String r0 = "addAttendWindow"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x0040
        L_0x0076:
            r0 = 1
            goto L_0x0083
        L_0x0078:
            java.lang.String r0 = "switch"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0082
            goto L_0x0040
        L_0x0082:
            r0 = 0
        L_0x0083:
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x009b;
                case 2: goto L_0x0096;
                case 3: goto L_0x0091;
                case 4: goto L_0x008c;
                case 5: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x00a4
        L_0x0087:
            boolean r2 = u(r6)
            goto L_0x00a4
        L_0x008c:
            boolean r2 = i(r6)
            goto L_0x00a4
        L_0x0091:
            boolean r2 = j(r6)
            goto L_0x00a4
        L_0x0096:
            boolean r2 = h(r6)
            goto L_0x00a4
        L_0x009b:
            boolean r2 = g(r6)
            goto L_0x00a4
        L_0x00a0:
            boolean r2 = t(r6)
        L_0x00a4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sex.k(tb.sex$h):boolean");
    }

    public static boolean g(final h hVar) {
        String str;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9107f19", new Object[]{hVar})).booleanValue();
        }
        final oe8 oe8Var = hVar.f28000a;
        final Context e2 = oe8Var.j().e();
        JSONObject parseObject = JSON.parseObject(hVar.c.content);
        if (parseObject == null || e2 == null) {
            return false;
        }
        final float d2 = zd7.d(e2, parseObject.getFloatValue("width"));
        final float d3 = zd7.d(e2, parseObject.getFloatValue("height"));
        final float d4 = zd7.d(e2, parseObject.getFloatValue("startX"));
        final float d5 = zd7.d(e2, parseObject.getFloatValue("startY"));
        final int intValue = parseObject.getIntValue("directionX");
        final int intValue2 = parseObject.getIntValue("directionY");
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        String string = parseObject.getString("targetGroupStates");
        if (!TextUtils.isEmpty(string)) {
            try {
                arrayList = (List) JSON.parseObject(string, new f(), new Feature[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String string2 = parseObject.getString("targetStates");
        if (!TextUtils.isEmpty(string2)) {
            try {
                arrayList2 = (List) JSON.parseObject(string2, new g(), new Feature[0]);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (d2 <= 0.0f || d3 <= 0.0f) {
            return true;
        }
        if (parseObject.containsKey(c4o.KEY_SWITCH_MODE)) {
            str = parseObject.getString(c4o.KEY_SWITCH_MODE);
        } else {
            str = "";
        }
        if (parseObject.containsKey("excludeSelf")) {
            bool = parseObject.getBoolean("excludeSelf");
        } else {
            bool = Boolean.FALSE;
        }
        final Pair<StateModel, StateVersionModel> e3 = oe8Var.e(arrayList, arrayList2, pg1.ATOM_EXT_random.equals(str), Boolean.TRUE.equals(bool));
        oe8Var.x(new Runnable() { // from class: tb.pex
            @Override // java.lang.Runnable
            public final void run() {
                sex.p(oe8.this, e3, hVar, e2, d2, d3, d4, d5, intValue, intValue2);
            }
        });
        return true;
    }

    public static /* synthetic */ void s(final h hVar, String str, boolean z, boolean z2, long j2, boolean z3, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fd6898", new Object[]{hVar, str, new Boolean(z), new Boolean(z2), new Long(j2), new Boolean(z3), new Long(j3), new Long(j4)});
            return;
        }
        FloatWindow floatWindow = hVar.b.b;
        boolean equals = "target".equals(str);
        floatWindow.M(equals ? 1 : 0, true, z, z2, (float) j2, z3, (float) j3, j4, new FloatWindow.c() { // from class: tb.rex
            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.c
            public final void a(boolean z4) {
                sex.r(sex.h.this, z4);
            }
        });
    }

    public static /* synthetic */ void p(oe8 oe8Var, Pair pair, h hVar, Context context, float f2, float f3, float f4, float f5, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f38ed2c", new Object[]{oe8Var, pair, hVar, context, new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Integer(i2), new Integer(i3)});
            return;
        }
        View v = oe8Var.v((StateModel) pair.first, (StateVersionModel) pair.second);
        if (v == null) {
            i iVar = hVar.d;
            if (iVar != null) {
                iVar.b(hVar, "renderStateFailed", "");
                return;
            }
            return;
        }
        hVar.b.b.B(context, v, (int) f2, (int) f3, (int) f4, (int) f5, i2, i3);
        i iVar2 = hVar.d;
        if (iVar2 != null) {
            iVar2.a(hVar);
        }
    }
}

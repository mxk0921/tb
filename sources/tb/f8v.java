package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.event.AdjustStateSubscriber;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.y6v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f8v implements mqk, kqk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_PARAMS = "bizParams";
    public static final String KEY_DXEVENT = "DXEvent";
    public static final String KEY_EXTRA_PARAMS = "extraParams";
    public static final String KEY_TARGET_VIEW = "targetView";
    public static final String KEY_TRIGGER_VIEW = "triggerView";
    public static final String KEY_TRIGGER_VIEW_HOLDER = "triggerViewHolder";
    public static final String KEY_VIEW_PARAMS = "viewParams";
    public static final String TAG_CLICK_VIEW = "ultron_dx_click_tag";

    /* renamed from: a  reason: collision with root package name */
    public Context f19108a;
    public final o5e b;
    public rtd c;
    public final List<o3c> d = new ArrayList();
    public final Map<String, List<rtd>> e = new HashMap();

    static {
        t2o.a(157286537);
        t2o.a(157286636);
        t2o.a(157286635);
    }

    public f8v(o5e o5eVar) {
        if (o5eVar != null) {
            this.b = o5eVar;
            this.f19108a = o5eVar.getContext();
            return;
        }
        throw new IllegalArgumentException("instance can not be null");
    }

    @Override // tb.mqk
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87be477", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(mcu.KEY_INDEX_MODE, Boolean.FALSE);
        b(view, str, obj, obj2, obj3, arrayList, hashMap);
    }

    public void c(o3c o3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7112ab2f", new Object[]{this, o3cVar});
        } else if (o3cVar != null) {
            ((ArrayList) this.d).add(o3cVar);
        }
    }

    public void d(String str, rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece1c1c5", new Object[]{this, str, rtdVar});
        } else if (str != null && rtdVar != null) {
            List<rtd> m = m(str);
            if (!m.contains(rtdVar)) {
                m.add(rtdVar);
            }
        }
    }

    public b8v e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("30f8cc39", new Object[]{this});
        }
        return new b8v().q(this.f19108a).B(this.b);
    }

    public final void f(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0d2eb1", new Object[]{this, b8vVar});
            return;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            try {
                ((o3c) it.next()).b(b8vVar);
            } catch (Throwable th) {
                lbq.c(this.b.getBizName(), "UltronEventHandler.callPostEventFire", th);
            }
        }
    }

    public final void g(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80e89f8", new Object[]{this, b8vVar});
            return;
        }
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            try {
                ((o3c) it.next()).a(b8vVar);
            } catch (Throwable th) {
                lbq.c(this.b.getBizName(), "UltronEventHandler.callPreEventFire", th);
            }
        }
    }

    public void h(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e1afb", new Object[]{this, list, obj});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.e).entrySet()) {
            List<rtd> list2 = (List) entry.getValue();
            if (list2 != null) {
                for (rtd rtdVar : list2) {
                    if (rtdVar instanceof l6v) {
                        ((l6v) rtdVar).s(list, obj);
                    }
                }
            }
        }
    }

    public final void i(String str, List<rtd> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546c2335", new Object[]{this, str, list});
            return;
        }
        String bizName = this.b.getBizName();
        UnifyLog.EventType eventType = UnifyLog.EventType.CLICK;
        if (eventType.equals(str)) {
            if (list == null || list.isEmpty()) {
                UnifyLog.k(bizName, "UltronEventHandler", "dispatchEvent", "", "点击异常", eventType, "subscribers is null or empty");
            }
        }
    }

    public gsb j(gsb gsbVar, JSONObject jSONObject, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("b3f74958", new Object[]{this, gsbVar, jSONObject, str});
        }
        if (gsbVar == null || gsbVar.getFields() == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) vuq.a(jSONObject, JSON.parseObject(gsbVar.getFields().toString()), str);
        String type = gsbVar.getType();
        List<IDMComponent> components = gsbVar.getComponents();
        if (gsbVar instanceof DMEvent) {
            i = ((DMEvent) gsbVar).getOption();
        }
        return new DMEvent(type, jSONObject2, components, i);
    }

    public void k(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa671e23", new Object[]{this, b8vVar});
            return;
        }
        String h = b8vVar.h();
        if (h != null) {
            b8vVar.u(AdjustStateSubscriber.SKIP_SIMPLE_ADJUST, Boolean.TRUE);
            List<rtd> list = (List) ((HashMap) this.e).get(h);
            i(h, list);
            if (list == null) {
                rtd rtdVar = this.c;
                if (rtdVar != null) {
                    rtdVar.c(b8vVar);
                } else {
                    hav.g(this.b.getBizName(), "UltronEventHandler", "事件未找到", h);
                }
            } else {
                g(b8vVar);
                b8v b8vVar2 = b8vVar;
                for (rtd rtdVar2 : list) {
                    if (rtdVar2 != null) {
                        if (y6v.e(l(), y6v.b.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                            b8vVar2 = o(b8vVar);
                        }
                        rtdVar2.c(b8vVar2);
                    }
                }
                f(b8vVar2);
            }
        }
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.b.getBizName();
    }

    public final List<rtd> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16621afa", new Object[]{this, str});
        }
        List<rtd> list = (List) ((HashMap) this.e).get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ((HashMap) this.e).put(str, arrayList);
        return arrayList;
    }

    public void n(List<gsb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91cc0ed", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            gsb gsbVar = list.get(i);
            if (gsbVar != null) {
                String type = gsbVar.getType();
                if (!TextUtils.isEmpty(type)) {
                    b8v t = e().t(type);
                    t.r(gsbVar);
                    k(t);
                }
            }
        }
    }

    public void p(o3c o3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a2adec", new Object[]{this, o3cVar});
        } else if (o3cVar != null) {
            ((ArrayList) this.d).remove(o3cVar);
        }
    }

    public void q(String str, rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c48d2", new Object[]{this, str, rtdVar});
        } else if (str != null && rtdVar != null) {
            List<rtd> m = m(str);
            m.clear();
            m.add(rtdVar);
        }
    }

    public void r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
        } else {
            this.f19108a = context;
        }
    }

    public void s(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa05ee0", new Object[]{this, b8vVar});
        }
    }

    public void t(rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9df04b1", new Object[]{this, rtdVar});
        } else {
            this.c = rtdVar;
        }
    }

    public final b8v o(b8v b8vVar) {
        a B;
        a.C0075a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8v) ipChange.ipc$dispatch("aa5efe1d", new Object[]{this, b8vVar});
        }
        if (!(this.b instanceof com.alibaba.android.ultron.vfw.instance.a)) {
            return b8vVar;
        }
        Object f = b8vVar.f();
        if (!(f instanceof DMEvent) || !t9v.a(1, ((DMEvent) f).getOption()) || (B = ((com.alibaba.android.ultron.vfw.instance.a) this.b).B()) == null || (d = B.d()) == null) {
            return b8vVar;
        }
        b8v b8vVar2 = new b8v();
        b8vVar2.b(b8vVar);
        b8vVar2.y("storeState", d.c);
        e8v e8vVar = new e8v();
        JSONObject fields = ((DMEvent) b8vVar2.f()).getFields();
        Object remove = fields.remove("next");
        e8vVar.a(fields, b8vVar2.l());
        if (remove != null) {
            fields.put("next", remove);
        }
        return b8vVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:103|(3:146|105|(1:107)(5:108|131|(3:133|(1:135)(1:136)|137)(1:139)|138|153))|113|(1:115)(1:116)|117|(2:119|120)(1:121)|148|122|123|144|124|125|142|126|131|(0)(0)|138|153) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0368, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x036a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x036c, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    @Override // tb.kqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.view.View r33, java.lang.String r34, java.lang.Object r35, java.lang.Object r36, java.lang.Object r37, java.util.ArrayList r38, java.util.Map r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f8v.b(android.view.View, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.util.ArrayList, java.util.Map):void");
    }
}

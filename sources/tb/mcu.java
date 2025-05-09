package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mcu implements mqk, kqk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENT = "component";
    public static final String KEY_EXTRA_PARAMS = "extraParams";
    public static final String KEY_INDEX_MODE = "indexMode";
    public static final String KEY_TRIGGER_VIEW = "triggerView";
    public static final String KEY_VIEW = "view";
    public static final String KEY_VIEW_PARAMS = "viewParams";

    /* renamed from: a  reason: collision with root package name */
    public Context f23946a;
    public final fdd b;
    public lcu c;
    public boolean d = false;
    public final Map<String, List<qtd>> e = new HashMap();
    public IDMComponent f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(155189332);
        t2o.a(157286636);
        t2o.a(157286635);
    }

    public mcu(fdd fddVar) {
        if (fddVar != null) {
            this.b = fddVar;
            this.f23946a = fddVar.getContext();
            return;
        }
        throw new IllegalArgumentException("presenter can not be null");
    }

    @Override // tb.mqk
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87be477", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_INDEX_MODE, Boolean.FALSE);
        b(view, str, obj, obj2, obj3, arrayList, hashMap);
    }

    public void c(String str, qtd qtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8a511a", new Object[]{this, str, qtdVar});
        } else if (str != null && qtdVar != null) {
            List<qtd> k = k(str);
            if (!k.contains(qtdVar)) {
                k.add(qtdVar);
            }
        }
    }

    public lcu d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("1095c580", new Object[]{this});
        }
        return new lcu().j(this.f23946a).o(this.b);
    }

    public final gsb e(gsb gsbVar, JSONObject jSONObject, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("b3f74958", new Object[]{this, gsbVar, jSONObject, str});
        }
        if (gsbVar == null) {
            return null;
        }
        try {
            if (!(gsbVar.getFields() == null || jSONObject == null)) {
                JSONObject jSONObject2 = (JSONObject) vuq.a(jSONObject, JSON.parseObject(gsbVar.getFields().toString()), str);
                String type = gsbVar.getType();
                List<IDMComponent> components = gsbVar.getComponents();
                if (gsbVar instanceof DMEvent) {
                    i = ((DMEvent) gsbVar).getOption();
                }
                return new DMEvent(type, jSONObject2, components, i);
            }
            return null;
        } catch (Exception e) {
            UnifyLog.e("TradeEventHandler", "deepCloneAndParseNewEvent error=" + e.getMessage());
            return gsbVar;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d = true;
        this.f23946a = null;
        Map<String, List<qtd>> map = this.e;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b44c2", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void h(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febbe37c", new Object[]{this, lcuVar});
            return;
        }
        String d = lcuVar.d();
        if (d == null || this.d) {
            hav.g("DX事件", "TradeEventHandler", "eventType is null or has been destroyed,eventType=", d);
            return;
        }
        List<qtd> list = (List) ((HashMap) this.e).get(d);
        if (list == null) {
            hav.g("DX事件", "TradeEventHandler", "未找到事件处理器,eventType=", d, ",fields=", j(lcuVar));
            return;
        }
        for (qtd qtdVar : list) {
            if (qtdVar == null) {
                hav.g("DX事件", "TradeEventHandler", "subscriber is null,eventType=", d);
            } else {
                qtdVar.a(lcuVar);
            }
        }
    }

    public lcu i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("8cd0c72d", new Object[]{this});
        }
        return this.c;
    }

    public final String j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33173c3", new Object[]{this, lcuVar});
        }
        if (lcuVar == null || lcuVar.a() == null) {
            return "";
        }
        return String.valueOf(lcuVar.a().getFields());
    }

    public final List<qtd> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16621afa", new Object[]{this, str});
        }
        List<qtd> list = (List) ((HashMap) this.e).get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ((HashMap) this.e).put(str, arrayList);
        return arrayList;
    }

    public void l(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c10b38", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        lcu lcuVar = this.c;
        if (lcuVar != null && "openUrl".equalsIgnoreCase(lcuVar.d())) {
            h(d().l("openUrlResult").i(lcuVar.a()).m("activityRequestCode", Integer.valueOf(i)).m("activityResultCode", Integer.valueOf(i2)).m("activityResultData", intent).m("openUrlEvent", lcuVar));
        } else if (lcuVar != null && "autoJumpOpenUrl".equalsIgnoreCase(lcuVar.d())) {
            h(d().l("autoJumpOpenUrlResult").i(lcuVar.a()).m("activityRequestCode", Integer.valueOf(i)).m("activityResultCode", Integer.valueOf(i2)).m("activityResultData", intent).m("openUrlEvent", lcuVar));
        }
        if (lcuVar == null || !"openPopupWindow".equalsIgnoreCase(lcuVar.d())) {
            g();
        }
    }

    public void m(String str, qtd qtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa7fe97", new Object[]{this, str, qtdVar});
        } else if (str != null && qtdVar != null) {
            k(str).remove(qtdVar);
        }
    }

    public void n(String str, qtd qtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7349a67", new Object[]{this, str, qtdVar});
        } else if (str != null && qtdVar != null) {
            List<qtd> k = k(str);
            k.clear();
            k.add(qtdVar);
        }
    }

    public void o(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c086e3", new Object[]{this, iDMComponent, str});
        } else {
            this.f = iDMComponent;
        }
    }

    public void p(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dce90df", new Object[]{this, lcuVar});
        } else {
            this.c = lcuVar;
        }
    }

    @Deprecated
    public void q(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a554a6e", new Object[]{this, str, aVar});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    @Override // tb.kqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.view.View r19, java.lang.String r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.util.ArrayList r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mcu.b(android.view.View, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.util.ArrayList, java.util.Map):void");
    }
}

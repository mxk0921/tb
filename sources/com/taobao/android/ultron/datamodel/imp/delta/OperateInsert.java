package com.taobao.android.ultron.datamodel.imp.delta;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.f6l;
import tb.fbf;
import tb.jq;
import tb.rb4;
import tb.t2o;
import tb.t55;
import tb.u55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OperateInsert extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "insert";
    public static final String TAG = "OperateInsert";

    static {
        t2o.a(83886218);
    }

    public static /* synthetic */ Object ipc$super(OperateInsert operateInsert, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateInsert");
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
        } else {
            b(u55Var, jSONObject.getString("target"), jSONObject.getString(a.MSG_SOURCE_PARENT), jSONObject.getString("position"), list, false);
        }
    }

    public final void b(u55 u55Var, String str, String str2, String str3, List<rb4> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556520d0", new Object[]{this, u55Var, str, str2, str3, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> components = u55Var.getComponents();
        Map<String, DMComponent> p = u55Var.p();
        DMComponent dMComponent = str3 != null ? p.get(str3) : null;
        JSONObject jSONObject = u55Var.r().getJSONObject(str);
        if (jSONObject != null) {
            DMComponent a2 = t55.a(u55Var, jSONObject, str);
            DMComponent dMComponent2 = p.get(str2);
            if (dMComponent2 != null) {
                dMComponent2.getChildren().add((dMComponent != null ? dMComponent2.getChildren().indexOf(dMComponent) : -1) + 1, a2);
                a2.setParent(dMComponent2);
                String a3 = f6l.a(a2, dMComponent2);
                String f = f6l.f(a2, dMComponent2);
                a2.setComponentCardGroupTag(a3);
                a2.setComponentPosition(f);
                if (!z) {
                    fbf fbfVar = new fbf();
                    fbfVar.c(new ArrayList<IDMComponent>(a2) { // from class: com.taobao.android.ultron.datamodel.imp.delta.OperateInsert.1
                        public final /* synthetic */ DMComponent val$insertComponent;

                        {
                            this.val$insertComponent = a2;
                            add(a2);
                        }
                    });
                    fbfVar.e(dMComponent);
                    fbfVar.d(dMComponent2);
                    list.add(fbfVar);
                }
                String str4 = "null";
                if (dMComponent != null) {
                    IDMComponent d = f6l.d(dMComponent, components);
                    if (d == null || !components.contains(d)) {
                        String bizName = u55Var.getBizName();
                        StringBuilder sb = new StringBuilder("lastRender is not in renderComponent, lastRender : ");
                        if (d != null) {
                            str4 = d.getKey();
                        }
                        sb.append(str4);
                        UnifyLog.m(bizName, TAG, "insertPosition isnot null", sb.toString());
                    } else {
                        components.add(components.indexOf(d) + 1, a2);
                    }
                } else {
                    IDMComponent c = f6l.c(dMComponent2, components);
                    if (c == null || !components.contains(c)) {
                        String bizName2 = u55Var.getBizName();
                        StringBuilder sb2 = new StringBuilder("firstRender : ");
                        if (c != null) {
                            str4 = c.getKey();
                        }
                        sb2.append(str4);
                        UnifyLog.m(bizName2, TAG, "firstRender is not in renderComponent", sb2.toString());
                    } else {
                        components.add(components.indexOf(c), a2);
                    }
                }
                if (z && components.contains(dMComponent2)) {
                    components.remove(dMComponent2);
                }
                p.put(str, a2);
                if (u55Var.M() != null && u55Var.M().containsKey(str)) {
                    Iterator<Object> it = u55Var.M().getJSONArray(str).iterator();
                    String str5 = null;
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            String str6 = (String) next;
                            b(u55Var, str6, str, str5, list, true);
                            str5 = str6;
                        }
                    }
                }
            }
        }
    }
}

package com.alibaba.android.ultron.trade.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.trade.event.model.SimplePopupModel;
import com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.c57;
import tb.et6;
import tb.l12;
import tb.lcu;
import tb.t2o;
import tb.u55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OpenSimplePopupSubscriber extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BODY_TEMPLATE_NAME = "buy_popup_check_box_simple";
    public static final String DEFAULT_FOOTER_TEMPLATE_NAME = "buy_dialog_bottom_simple";
    public static final String DEFAULT_HEADER_TEMPLATE_NAME = "buy_dialog_title_simple";
    public static final String KEY_COMPONENT_TYPE = "componentType";
    public static final String KEY_FOOTER_TYPE = "footerType";
    public static final String KEY_HEADER_TYPE = "headerType";
    public static final String KEY_ID = "id";
    public static final String KEY_SIMPLE_POPUP_FIELDS = "simplePopupFields";
    public static final String KEY_SIMPLE_POPUP_MODEL = "simplePopupModel";
    public final String j = DEFAULT_FOOTER_TEMPLATE_NAME;
    public final String k = DEFAULT_HEADER_TEMPLATE_NAME;
    public final String l = DEFAULT_BODY_TEMPLATE_NAME;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements PopupWindowManager.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f2302a;

        public a(OpenSimplePopupSubscriber openSimplePopupSubscriber, lcu lcuVar) {
            this.f2302a = lcuVar;
        }

        @Override // com.alibaba.android.ultron.vfw.popupwindow.PopupWindowManager.e
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                this.f2302a.h();
            }
        }
    }

    static {
        t2o.a(155189319);
    }

    public static /* synthetic */ Object ipc$super(OpenSimplePopupSubscriber openSimplePopupSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/OpenSimplePopupSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject fields = this.e.getFields();
        if (fields != null) {
            lcuVar.p(new c57(this.e, this.c));
            String string = fields.getString(KEY_COMPONENT_TYPE);
            List<IDMComponent> u = u(fields);
            List<IDMComponent> s = s(fields, string);
            List<IDMComponent> t = t(fields);
            et6 et6Var = new et6();
            et6Var.q(u);
            et6Var.l(s);
            et6Var.o(t);
            this.c.e().V(et6Var, null, new a(this, lcuVar));
            this.c.g().p(lcuVar);
        }
    }

    public DMComponent r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("317bf680", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "block$null$emptyBlock");
        return q(jSONObject, (u55) this.d, "block$null$emptyBlock");
    }

    public List<IDMComponent> s(JSONObject jSONObject, String str) {
        SimplePopupModel simplePopupModel;
        DMComponent dMComponent;
        List<String> selectedIds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ebe1eb19", new Object[]{this, jSONObject, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            simplePopupModel = (SimplePopupModel) JSON.toJavaObject(jSONObject, SimplePopupModel.class);
        } catch (Exception e) {
            UnifyLog.m(this.c.c(), "OpenSimplePopupSubscriber", "getBodyComponent exception", e.getMessage());
            simplePopupModel = null;
        }
        if (simplePopupModel == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!(simplePopupModel.getAsSelect() == null || (selectedIds = simplePopupModel.getAsSelect().getSelectedIds()) == null)) {
            arrayList2.addAll(selectedIds);
        }
        JSONArray components = simplePopupModel.getComponents();
        if (components == null) {
            return arrayList;
        }
        if (jSONObject.containsKey(KEY_COMPONENT_TYPE)) {
            str = jSONObject.getString(KEY_COMPONENT_TYPE);
        }
        DMComponent r = r();
        r.getExtMap().put(KEY_SIMPLE_POPUP_MODEL, simplePopupModel);
        r.getExtMap().put(KEY_SIMPLE_POPUP_FIELDS, jSONObject);
        Iterator<Object> it = components.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                String string = jSONObject2.getString("id");
                if (arrayList2.contains(string)) {
                    jSONObject2.put("isChecked", (Object) "true");
                } else {
                    jSONObject2.put("isChecked", (Object) "false");
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("fields", next);
                if (jSONObject2.containsKey("type")) {
                    str = jSONObject2.getString("type");
                }
                jSONObject3.put("type", (Object) str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject3.put("id", (Object) string);
                }
                if (TextUtils.isEmpty(str)) {
                    dMComponent = p(jSONObject3, (u55) this.d, this.l);
                } else {
                    dMComponent = q(jSONObject3, (u55) this.d, str);
                }
                dMComponent.setParent(r);
                r.addChild(dMComponent);
                arrayList.add(dMComponent);
            }
        }
        return arrayList;
    }

    public List<IDMComponent> t(JSONObject jSONObject) {
        DMComponent dMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f26ed4a", new Object[]{this, jSONObject});
        }
        String string = jSONObject.containsKey(KEY_FOOTER_TYPE) ? jSONObject.getString(KEY_FOOTER_TYPE) : null;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fields", (Object) jSONObject);
        jSONObject2.put("type", (Object) string);
        if (TextUtils.isEmpty(string)) {
            dMComponent = p(jSONObject2, (u55) this.d, this.j);
        } else {
            dMComponent = q(jSONObject2, (u55) this.d, string);
        }
        return new ArrayList<IDMComponent>(dMComponent) { // from class: com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber.3
            public final /* synthetic */ DMComponent val$footerComponent;

            {
                this.val$footerComponent = dMComponent;
                add(dMComponent);
            }
        };
    }

    public List<IDMComponent> u(JSONObject jSONObject) {
        DMComponent dMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("da45c598", new Object[]{this, jSONObject});
        }
        String string = jSONObject.containsKey(KEY_HEADER_TYPE) ? jSONObject.getString(KEY_HEADER_TYPE) : null;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fields", (Object) jSONObject);
        jSONObject2.put("type", (Object) string);
        if (TextUtils.isEmpty(string)) {
            dMComponent = p(jSONObject2, (u55) this.d, this.k);
        } else {
            dMComponent = q(jSONObject2, (u55) this.d, string);
        }
        return new ArrayList<IDMComponent>(dMComponent) { // from class: com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber.2
            public final /* synthetic */ DMComponent val$headerComponent;

            {
                this.val$headerComponent = dMComponent;
                add(dMComponent);
            }
        };
    }

    public DMComponent p(JSONObject jSONObject, u55 u55Var, String str) {
        JSONObject jSONObject2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("7ecd5ab2", new Object[]{this, jSONObject, u55Var, str});
        }
        if (u55Var == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<JSONObject> it = u55Var.N().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                jSONObject2 = null;
                break;
            }
            jSONObject2 = it.next();
            if (jSONObject2 != null && str.equals(jSONObject2.getString("name"))) {
                break;
            }
        }
        if (jSONObject2 == null) {
            UnifyLog.m(this.c.c(), "OpenSimplePopupSubscriber", "通过type，component container信息未匹配到： " + str, new String[0]);
        }
        String str3 = "";
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("containerType");
            JSONArray jSONArray = jSONObject2.getJSONArray("type");
            if (jSONArray != null && jSONArray.size() > 0) {
                str3 = (String) jSONArray.get(0);
            }
        } else {
            str2 = "native";
        }
        jSONObject.put("type", (Object) str3);
        return new DMComponent(jSONObject, str2, jSONObject2, null);
    }

    public DMComponent q(JSONObject jSONObject, u55 u55Var, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("8aa06321", new Object[]{this, jSONObject, u55Var, str});
        }
        if (u55Var == null) {
            return null;
        }
        JSONObject jSONObject2 = u55Var.N().get(str);
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("containerType");
        } else {
            String c = this.c.c();
            UnifyLog.m(c, "OpenSimplePopupSubscriber", "通过type，component container信息未匹配到： " + str, new String[0]);
            str2 = "native";
        }
        return new DMComponent(jSONObject, str2, jSONObject2, null);
    }
}

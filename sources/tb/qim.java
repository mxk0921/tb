package tb;

import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.android.ultron.trade.event.model.SimplePopupModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qim extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AS_SELECT = "asSelect";
    public static final String KEY_DISABLED = "disabled";
    public static final String KEY_IS_CHECKED = "isChecked";

    static {
        t2o.a(155189325);
    }

    public static /* synthetic */ Object ipc$super(qim qimVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/PopupSelectSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IDMComponent iDMComponent;
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (this.c.g().i() != null && (iDMComponent = this.e) != null && !"true".equals(iDMComponent.getFields().getString("disabled")) && (parent = this.e.getParent()) != null) {
            Object obj = parent.getExtMap().get(OpenSimplePopupSubscriber.KEY_SIMPLE_POPUP_MODEL);
            Object obj2 = parent.getExtMap().get(OpenSimplePopupSubscriber.KEY_SIMPLE_POPUP_FIELDS);
            if ((obj instanceof SimplePopupModel) && (obj2 instanceof JSONObject)) {
                p((SimplePopupModel) obj, parent, (JSONObject) obj2);
            }
        }
    }

    public final void q(JSONObject jSONObject, SimplePopupModel simplePopupModel) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940d7dd", new Object[]{this, jSONObject, simplePopupModel});
            return;
        }
        try {
            jSONObject2 = (JSONObject) JSON.toJSON(simplePopupModel);
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        jSONObject.putAll(jSONObject2);
    }

    public final void p(SimplePopupModel simplePopupModel, IDMComponent iDMComponent, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c24da3", new Object[]{this, simplePopupModel, iDMComponent, jSONObject});
            return;
        }
        SimplePopupModel.AsSelect asSelect = simplePopupModel.getAsSelect();
        if (asSelect != null) {
            boolean equals = Boolean.TRUE.toString().equals(asSelect.getOptional());
            try {
                i = Integer.parseInt(asSelect.getMax());
            } catch (Exception unused) {
                i = 1;
            }
            List<String> selectedIds = asSelect.getSelectedIds();
            if (selectedIds == null) {
                selectedIds = new ArrayList<>();
            }
            String string = this.e.getFields().getString("id");
            int size = selectedIds.size();
            List<IDMComponent> children = iDMComponent.getChildren();
            if (children != null) {
                if (selectedIds.contains(string)) {
                    if (equals || (size > 0 && i > 1)) {
                        selectedIds.remove(string);
                        this.e.getFields().put("isChecked", (Object) Boolean.FALSE.toString());
                        for (IDMComponent iDMComponent2 : children) {
                            if (iDMComponent2 != null && !iDMComponent2.equals(this.e)) {
                                iDMComponent2.getFields().put("disabled", (Object) "false");
                            }
                        }
                        q(jSONObject, simplePopupModel);
                    }
                    this.c.e().G();
                    return;
                }
                if (i == 1) {
                    selectedIds.clear();
                    selectedIds.add(string);
                    this.e.getFields().put("isChecked", (Object) "true");
                    for (IDMComponent iDMComponent3 : children) {
                        if (iDMComponent3 != null && !iDMComponent3.equals(this.e)) {
                            iDMComponent3.getFields().put("isChecked", (Object) "false");
                        }
                    }
                } else if (size < i) {
                    selectedIds.add(string);
                    this.e.getFields().put("isChecked", (Object) "true");
                    if (selectedIds.size() == i) {
                        for (IDMComponent iDMComponent4 : children) {
                            if (iDMComponent4 != null && !"true".equals(iDMComponent4.getFields().getString("isChecked"))) {
                                iDMComponent4.getFields().put("disabled", (Object) "true");
                            }
                        }
                    }
                } else {
                    return;
                }
                q(jSONObject, simplePopupModel);
                this.c.e().G();
            }
        }
    }
}

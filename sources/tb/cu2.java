package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cu2 extends iw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Object> e;
    public boolean f;
    public IDMComponent g;

    static {
        t2o.a(479199489);
    }

    public cu2(kmb kmbVar, int i) {
        super(kmbVar, i);
    }

    public static /* synthetic */ Object ipc$super(cu2 cu2Var, String str, Object... objArr) {
        if (str.hashCode() == 2112491294) {
            return super.b((List) objArr[0], (IDMComponent) objArr[1], (JSONArray) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/multiplecolumn/CalculateMultipleColumn");
    }

    @Override // tb.iw
    public IDMComponent b(List<IDMComponent> list, IDMComponent iDMComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("7dea0f1e", new Object[]{this, list, iDMComponent, jSONArray});
        }
        IDMComponent b = super.b(list, iDMComponent, jSONArray);
        if (this.f) {
            b.getFields().put("isExpanded", (Object) Boolean.TRUE);
        }
        return b;
    }

    @Override // tb.iw
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f417a32b", new Object[]{this});
        }
        return "icartCalculate4Column";
    }

    @Override // tb.iw
    public void h(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0615be", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (TextUtils.equals(iDMComponent.getTag(), "checkedItemList")) {
                JSONObject fields = iDMComponent.getFields();
                if (fields == null) {
                    fields = new JSONObject();
                }
                JSONArray jSONArray = fields.getJSONArray("items");
                if (jSONArray != null) {
                    this.e = new ArrayList(jSONArray);
                }
                this.g = iDMComponent;
                this.f = iDMComponent.getFields().getBooleanValue("isExpanded");
                return;
            }
        }
    }

    @Override // tb.iw
    public List<Object> d(List<IDMComponent> list) {
        List<Object> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b6e07992", new Object[]{this, list});
        }
        List<Object> list3 = this.e;
        if (list3 == null) {
            return null;
        }
        int size = ((ArrayList) list3).size();
        int i = this.c;
        if (size > i) {
            if (this.f) {
                list2 = this.e;
            } else {
                list2 = ((ArrayList) this.e).subList(0, i - 1);
            }
            list2.add("EXPAND_BUTTON");
        } else {
            list2 = this.e;
        }
        IDMComponent iDMComponent = this.g;
        if (iDMComponent != null) {
            iDMComponent.getData().put("status", (Object) "hidden");
        }
        return list2;
    }
}

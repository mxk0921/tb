package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.icart.core.multiplecolumn.ColumnHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class iw implements zwc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21606a = getClass().getSimpleName();
    public IDMComponent b;
    public final int c;
    public final kmb d;

    static {
        t2o.a(479199488);
        t2o.a(479199493);
    }

    public iw(kmb kmbVar, int i) {
        this.d = kmbVar;
        this.c = i;
    }

    @Override // tb.zwc
    public final Pair<Integer, List<IDMComponent>> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9caf4a88", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            UnifyLog.e(this.f21606a, "addColumnComponents popComponents is empty");
            return null;
        }
        i(list);
        Pair<IDMComponent, Integer> f = f(list);
        if (f == null) {
            UnifyLog.e(this.f21606a, "addColumnComponents clone pair null");
            return null;
        }
        h(list);
        this.b = (IDMComponent) f.first;
        Integer num = (Integer) f.second;
        if (num == null || num.intValue() < 0 || num.intValue() >= list.size()) {
            String str = this.f21606a;
            UnifyLog.e(str, "addColumnComponents getToIndex error index=" + num);
            return null;
        }
        List<Object> d = d(list);
        if (d == null || d.isEmpty()) {
            UnifyLog.e(this.f21606a, "addColumnComponents itemKeys is empty");
            return null;
        }
        List<IDMComponent> c = c(list, d);
        String str2 = this.f21606a;
        UnifyLog.d(str2, "componentsInColumnByKeys=" + c);
        return new Pair<>(num, c);
    }

    public IDMComponent b(List<IDMComponent> list, IDMComponent iDMComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("7dea0f1e", new Object[]{this, list, iDMComponent, jSONArray});
        }
        JSONObject parseObject = JSON.parseObject(iDMComponent.getData().toJSONString());
        parseObject.put("status", (Object) "normal");
        parseObject.put("tag", (Object) (iDMComponent.getTag() + "_multiple_local"));
        DMComponent a2 = t55.a((u55) this.d.b(), parseObject, iDMComponent.getTag() + "_multiple_local" + parseObject.hashCode());
        JSONObject fields = a2.getFields();
        if (jSONArray != null) {
            fields.put("items", (Object) jSONArray);
            JSONObject b = ColumnHelper.b(this.d, this.c, e());
            if (b != null) {
                fields.putAll(b);
            }
        }
        return a2;
    }

    public List<IDMComponent> c(List<IDMComponent> list, List<Object> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a073d0fc", new Object[]{this, list, list2});
        }
        ArrayList arrayList = new ArrayList();
        if (!(list2 == null || this.c == 0)) {
            int ceil = (int) Math.ceil(list2.size() / this.c);
            JSONArray jSONArray = null;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Object obj = list2.get(i3);
                if (i == 0) {
                    jSONArray = new JSONArray();
                    IDMComponent b = b(list, this.b, jSONArray);
                    if (b != null) {
                        arrayList.add(b);
                        b.getFields().put(enx.INDEX_KEY, (Object) Integer.valueOf(i2));
                        b.getFields().put("_length", (Object) Integer.valueOf(ceil));
                    }
                    i2++;
                }
                jSONArray.add(obj);
                i++;
                if (i >= this.c) {
                    i = 0;
                }
            }
        }
        return arrayList;
    }

    public abstract List<Object> d(List<IDMComponent> list);

    public int e() {
        imb h0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f97c6c95", new Object[]{this})).intValue();
        }
        kmb kmbVar = this.d;
        if (kmbVar == null || (h0 = kmbVar.e().h0()) == null) {
            return 0;
        }
        return h0.m();
    }

    public Pair<IDMComponent, Integer> f(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d97251f3", new Object[]{this, list});
        }
        Pair<IDMComponent, Integer> pair = null;
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (TextUtils.equals(iDMComponent.getTag(), g())) {
                pair = new Pair<>(iDMComponent, Integer.valueOf(i));
            }
        }
        return pair;
    }

    public abstract String g();

    public void h(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0615be", new Object[]{this, list});
        }
    }

    public void i(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26649f28", new Object[]{this, list});
        } else if (list != null) {
            Iterator<IDMComponent> it = list.iterator();
            while (it.hasNext()) {
                IDMComponent next = it.next();
                if (!(next == null || next.getTag() == null || !next.getTag().contains("_multiple_local"))) {
                    it.remove();
                }
            }
        }
    }
}

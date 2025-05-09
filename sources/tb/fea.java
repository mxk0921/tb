package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19237a;
    public String b;
    public List<th5> c;
    public List<ItemIdentifier> d;
    public JSONObject e;
    public boolean f;

    static {
        t2o.a(295699274);
    }

    public static fea a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fea) ipChange.ipc$dispatch("ec1a289f", new Object[]{str, str2});
        }
        fea feaVar = new fea();
        feaVar.f19237a = str;
        feaVar.b = str2;
        return feaVar;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eda70491", new Object[]{this});
        }
        return this.e;
    }

    public List<th5> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cd036d2f", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.f19237a;
    }

    public List<ItemIdentifier> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("26377d15", new Object[]{this});
        }
        return this.d;
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16e2513", new Object[]{this, jSONObject});
            return;
        }
        this.e = new JSONObject();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry != null && TextUtils.equals(entry.getKey(), "customRulesSortDTOList")) {
                    this.e.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void h(List<th5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804d4c15", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.addAll(list);
    }

    public void i(List<ItemIdentifier> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618f0bef", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.addAll(list);
    }

    public String toString() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("mLiveId=");
        sb.append(this.f19237a);
        sb.append(" mItemId=");
        sb.append(this.b);
        sb.append(" mItemDataList.size()=");
        List<th5> list = this.c;
        if (list != null) {
            i = ((ArrayList) list).size();
        }
        sb.append(i);
        return sb.toString();
    }
}

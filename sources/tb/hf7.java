package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.DescModel;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public gf7 f20597a;
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zf8<ActionModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(hf7 hf7Var) {
        }

        /* renamed from: b */
        public ActionModel a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionModel) ipChange.ipc$dispatch("d2fafdfa", new Object[]{this, obj});
            }
            return new ActionModel(new ActionModel((JSONObject) obj));
        }
    }

    static {
        t2o.a(912262480);
    }

    public hf7(Context context) {
        this.b = context;
    }

    public ArrayList<md7> b(DescModel descModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("615f2e9d", new Object[]{this, descModel});
        }
        if (descModel == null || descModel.components == null) {
            return null;
        }
        ArrayList<md7> arrayList = new ArrayList<>();
        int size = descModel.components.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            md7 a2 = nd7.a(descModel.components.get(i2));
            if (a2 != null && !a2.g()) {
                es7 i3 = a2.i();
                if (i3 != null) {
                    i3.f23968a = i;
                    i3.b = i;
                    arrayList.add(i3);
                    i++;
                }
                a2.f23968a = i;
                a2.b = i;
                arrayList.add(a2);
                i++;
            }
        }
        return arrayList;
    }

    public final DescModel c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("3fe6f5f4", new Object[]{this, jSONObject});
        }
        xc7 xc7Var = new xc7(this.b);
        JSONArray jSONArray = jSONObject.getJSONArray("layout");
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("componentActions");
        if (jSONArray == null || jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        xc7Var.f(jSONObject2);
        xc7Var.d(jSONObject3);
        return xc7Var.e(jSONArray);
    }

    public gf7 d(String str) {
        gf7 gf7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("9a582626", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f20597a;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return this.f20597a;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            return this.f20597a;
        }
        synchronized (this.f20597a) {
            try {
                HashMap<String, DescModel> hashMap = new HashMap<>();
                for (String str2 : jSONObject.keySet()) {
                    hashMap.put(str2, c(jSONObject.getJSONObject(str2)));
                }
                pc7 pc7Var = new pc7();
                pc7Var.f26009a = hashMap;
                gf7Var = new gf7(e(this.f20597a.f30000a, pc7Var));
                gf7Var.b = this.f20597a.b;
                this.f20597a = gf7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gf7Var;
    }

    public ArrayList<md7> e(List<md7> list, pc7 pc7Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("b4b8c2a4", new Object[]{this, list, pc7Var});
        }
        int size = list.size();
        ArrayList<md7> arrayList = new ArrayList<>();
        int i2 = size;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            md7 md7Var = list.get(i4);
            if (pc7Var.a(md7Var.c)) {
                ArrayList<md7> b = b(pc7Var.f26009a.get(md7Var.c));
                if (b != null) {
                    Iterator<md7> it = b.iterator();
                    while (it.hasNext()) {
                        md7 next = it.next();
                        if (next != null && !md7Var.g()) {
                            next.b = i2;
                            next.f23968a = i3;
                            arrayList.add(next);
                            i3++;
                            i2++;
                        }
                    }
                } else {
                    i = i3 + 1;
                    md7Var.f23968a = i3;
                    arrayList.add(md7Var);
                }
            } else {
                i = i3 + 1;
                md7Var.f23968a = i3;
                arrayList.add(md7Var);
            }
            i3 = i;
        }
        return arrayList;
    }

    public gf7 a(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gf7) ipChange.ipc$dispatch("d655c2b3", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("weexData");
        pd7 pd7Var = jSONObject2 != null ? new pd7(jSONObject2) : null;
        JSONObject jSONObject3 = jSONObject.getJSONObject("components");
        if (jSONObject3 == null) {
            return null;
        }
        DescModel c = c(jSONObject3);
        if (c == null && pd7Var == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(XslMUSComponent.KEY_REQUEST_API);
        gf7 gf7Var = new gf7(b(c));
        if (c != null) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    c.requestApis.add(new zc7(jSONArray.getString(i)));
                }
                gf7Var.c(c.requestApis);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("page");
            if (jSONObject4 != null) {
                c.actionModels = uf7.a(jSONObject4.getJSONArray("pageActions"), new a(this));
            }
            gf7Var.b(this.b, c.actionModels);
        }
        jSONObject.getString("abtestParam");
        this.f20597a = gf7Var;
        return gf7Var;
    }
}

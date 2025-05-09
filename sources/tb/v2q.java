package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v2q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29749a;
    public JSONObject b = new JSONObject();
    public List c = new ArrayList();
    public List d;
    public JSONObject e;

    static {
        t2o.a(442499195);
    }

    public v2q(b8v b8vVar, qr0 qr0Var) {
        new ArrayList();
        if (cjz.a()) {
            SkuLogUtils.x("SkuEvent_init");
        }
        this.f29749a = b8vVar.e();
        e(b8vVar);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afa295b8", new Object[]{this});
        }
        return this.e;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f29749a;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a727f55", new Object[]{this});
        }
        return this.b;
    }

    public List d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("91e00a60", new Object[]{this});
        }
        return this.c;
    }

    public final void e(b8v b8vVar) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993ca8d3", new Object[]{this, b8vVar});
            return;
        }
        gsb gsbVar = (gsb) b8vVar.f();
        if (!(gsbVar == null || TextUtils.isEmpty(gsbVar.getType()))) {
            IDMComponent d = b8vVar.d();
            if (d != null) {
                this.e = d.getData();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) gsbVar.getType());
            JSONObject fields = gsbVar.getFields();
            if (fields != null) {
                fields = JSON.parseObject(fields.toJSONString());
            }
            jSONObject.put("fields", (Object) fields);
            Object[] objArr = (Object[]) b8vVar.i("extraParams");
            if (objArr == null || objArr.length <= 1) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int length = objArr.length;
                for (int i = 1; i < length; i++) {
                    arrayList.add(objArr[i]);
                }
            }
            List list = (List) b8vVar.i("viewParams");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (list == null) {
                list = new ArrayList();
            }
            this.b = jSONObject;
            this.c = arrayList;
            this.d = list;
        }
    }
}

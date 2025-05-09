package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ol7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_TYPE_DELETE = "delete";
    public static final String OP_TYPE_INSERT = "insert";
    public static final String OP_TYPE_RELOAD = "reload";
    public static final String OP_TYPE_REPLACE = "replace";

    /* renamed from: a  reason: collision with root package name */
    public String f25456a;
    public String b;
    public String c;
    public String d;

    static {
        t2o.a(157286472);
    }

    public static ol7 a(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ol7) ipChange.ipc$dispatch("17b523a8", new Object[]{knmVar});
        }
        ol7 ol7Var = new ol7();
        ol7Var.f25456a = "delete";
        ol7Var.b = knmVar.e();
        return ol7Var;
    }

    public static ol7 b(knm knmVar) {
        knm knmVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ol7) ipChange.ipc$dispatch("903dfe36", new Object[]{knmVar});
        }
        ol7 ol7Var = new ol7();
        ol7Var.f25456a = "insert";
        ol7Var.b = knmVar.e();
        knm h = knmVar.h();
        if (h != null) {
            ol7Var.c = h.e();
            int indexOf = h.d().indexOf(knmVar);
            if (indexOf > 0 && (knmVar2 = h.d().get(indexOf - 1)) != null) {
                ol7Var.d = knmVar2.e();
            }
        } else {
            UnifyLog.e("DiffInfo", "createInsertDiff parent is null: " + ol7Var.b);
        }
        return ol7Var;
    }

    public static ol7 c(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ol7) ipChange.ipc$dispatch("c1771516", new Object[]{knmVar});
        }
        ol7 ol7Var = new ol7();
        ol7Var.f25456a = "reload";
        ol7Var.b = knmVar.e();
        return ol7Var;
    }

    public static ol7 d(knm knmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ol7) ipChange.ipc$dispatch("abb84339", new Object[]{knmVar});
        }
        ol7 ol7Var = new ol7();
        ol7Var.f25456a = "replace";
        ol7Var.b = knmVar.e();
        knm h = knmVar.h();
        if (h != null) {
            ol7Var.c = h.e();
        }
        return ol7Var;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fb40b7e2", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) this.f25456a);
        String str = this.b;
        if (str != null) {
            jSONObject.put("target", (Object) str);
        }
        String str2 = this.c;
        if (str2 != null) {
            jSONObject.put(a.MSG_SOURCE_PARENT, (Object) str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            jSONObject.put("position", (Object) str3);
        }
        return jSONObject;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DiffInfo: opType:" + this.f25456a + ", target:" + this.b + ", parent:" + this.c + ", position:" + this.d;
    }
}

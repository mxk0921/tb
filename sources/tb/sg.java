package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.AutoUt;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final nbb f28026a;
        public final AURARenderComponent b;
        public final String c;
        public final String d;

        static {
            t2o.a(81788990);
        }

        public a(nbb nbbVar, AURARenderComponent aURARenderComponent, String str, String str2) {
            this.f28026a = nbbVar;
            this.b = aURARenderComponent;
            this.c = str;
            this.d = str2;
        }
    }

    static {
        t2o.a(81788989);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906c27c1", new Object[]{aVar});
        } else {
            c(aVar.b, aVar.f28026a, 2101, aVar.c, aVar.d);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17ecee18", new Object[]{aVar});
        } else {
            c(aVar.b, aVar.f28026a, 2201, aVar.c, aVar.d);
        }
    }

    public static void c(AURARenderComponent aURARenderComponent, nbb nbbVar, int i, String str, String str2) {
        TreeNode<RenderComponent> treeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ca23f4", new Object[]{aURARenderComponent, nbbVar, new Integer(i), str, str2});
            return;
        }
        try {
            if (f(aURARenderComponent) && (treeNode = aURARenderComponent.mirror) != null) {
                AutoUt autoUt = treeNode.data().getAutoUt();
                JSONObject jSONObject = new JSONObject();
                String arg1 = autoUt.getArg1();
                if (TextUtils.isEmpty(arg1)) {
                    arg1 = d(aURARenderComponent, i, autoUt.getPageName(), str, str2);
                }
                jSONObject.put("arg1", (Object) arg1);
                jSONObject.put("arg2", (Object) autoUt.getArg2());
                jSONObject.put("arg3", (Object) autoUt.getArg3());
                jSONObject.put("page", (Object) autoUt.getPageName());
                jSONObject.put("eventId", (Object) Integer.valueOf(i));
                jSONObject.put("args", (Object) autoUt.getArgs());
                g(jSONObject, treeNode);
                e(jSONObject, str2, nbbVar, aURARenderComponent);
            }
        } catch (Throwable th) {
            rj.d("AUTO_TRACK_EXCEPTION", th.getMessage());
        }
    }

    public static String d(AURARenderComponent aURARenderComponent, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f66a24ed", new Object[]{aURARenderComponent, new Integer(i), str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(aURARenderComponent.key);
        if (i == 2101) {
            sb.append("-");
            sb.append(str3);
        } else if (i == 2201) {
            if (TextUtils.isEmpty(str2)) {
                sb.append("-Exposure");
            } else {
                sb.append("-");
                sb.append(str2);
                sb.append("Exposure");
            }
        }
        return sb.toString();
    }

    public static void e(JSONObject jSONObject, String str, nbb nbbVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e581a57", new Object[]{jSONObject, str, nbbVar, aURARenderComponent});
            return;
        }
        qi qiVar = new qi();
        qiVar.n(jSONObject);
        qiVar.o(str);
        qiVar.t(aURARenderComponent);
        qiVar.s(aURARenderComponent.key);
        pi.b(nbbVar, "userTrack", qiVar);
    }

    public static boolean f(AURARenderComponent aURARenderComponent) {
        RenderComponent data;
        AutoUt autoUt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("492e6660", new Object[]{aURARenderComponent})).booleanValue();
        }
        TreeNode<RenderComponent> treeNode = aURARenderComponent.mirror;
        if (treeNode == null || (data = treeNode.data()) == null || (autoUt = data.getAutoUt()) == null || !autoUt.isAutoUt()) {
            return false;
        }
        return true;
    }

    public static void g(JSONObject jSONObject, TreeNode<RenderComponent> treeNode) {
        RenderComponent data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63966318", new Object[]{jSONObject, treeNode});
        } else if (treeNode != null && (data = treeNode.data()) != null) {
            AutoUt autoUt = data.getAutoUt();
            if (autoUt != null) {
                if (TextUtils.isEmpty(jSONObject.getString("arg2"))) {
                    jSONObject.put("arg2", (Object) autoUt.getArg2());
                }
                if (TextUtils.isEmpty(jSONObject.getString("arg3"))) {
                    jSONObject.put("arg3", (Object) autoUt.getArg3());
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (!(jSONObject2 == null || autoUt.getArgs() == null)) {
                    for (Map.Entry<String, Object> entry : autoUt.getArgs().entrySet()) {
                        String key = entry.getKey();
                        if (key instanceof String) {
                            String str = key;
                            if (TextUtils.isEmpty(jSONObject2.getString(str))) {
                                jSONObject2.put(str, entry.getValue());
                            }
                        }
                    }
                }
            }
            g(jSONObject, treeNode.parent());
        }
    }
}

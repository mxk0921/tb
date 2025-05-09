package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionActionType;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class isv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789231);
    }

    public static void a(nbb nbbVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384f7418", new Object[]{nbbVar, userMotionConfig, aURARenderComponent, jSONObject, new Integer(i)});
        } else if (nbbVar == null) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentAppear", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentAppear", "invalid userMotionConfig");
        } else if (!g(aURARenderComponent)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentAppear", "invalid component");
        } else {
            String str = userMotionConfig.page + "_Appear-" + f(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put(hxj.UNIQID, (Object) userMotionConfig.uid);
            jSONObject2.put("from", (Object) String.valueOf(i));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            e(nbbVar, aURARenderComponent, userMotionConfig.page, str, UserMotionActionType.COMPONENT_APPEAR, "", jSONObject2);
        }
    }

    public static void b(nbb nbbVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07487ec", new Object[]{nbbVar, userMotionConfig, aURARenderComponent, jSONObject, str});
        } else if (nbbVar == null) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentClick", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentClick", "invalid userMotionConfig");
        } else if (!g(aURARenderComponent)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentClick", "invalid component");
        } else {
            String str2 = userMotionConfig.page + "_Click-" + f(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put(hxj.UNIQID, (Object) userMotionConfig.uid);
            jSONObject2.put("eventId", (Object) (str == null ? "" : str));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            e(nbbVar, aURARenderComponent, userMotionConfig.page, str2, UserMotionActionType.COMPONENT_CLICK, str == null ? "" : str, jSONObject2);
        }
    }

    public static void d(nbb nbbVar, UserMotionConfig userMotionConfig, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61c38de", new Object[]{nbbVar, userMotionConfig, jSONObject, new Integer(i)});
        } else if (nbbVar == null) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionScroll", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionScroll", "invalid userMotionConfig");
        } else {
            String str = userMotionConfig.page + "_Scroll";
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put(hxj.UNIQID, (Object) userMotionConfig.uid);
            jSONObject2.put("direction", (Object) Integer.valueOf(i));
            e(nbbVar, null, userMotionConfig.page, str, UserMotionActionType.COMPONENT_SCROLL, String.valueOf(i), jSONObject2);
        }
    }

    public static void e(nbb nbbVar, AURARenderComponent aURARenderComponent, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3619a9c4", new Object[]{nbbVar, aURARenderComponent, str, str2, str3, str4, jSONObject});
        } else if (nbbVar == null) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionUT", "instance is null");
        } else {
            qi qiVar = new qi();
            qiVar.t(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("eventId", (Object) "19997");
            jSONObject2.put("page", (Object) str);
            jSONObject2.put("arg1", (Object) str2);
            jSONObject2.put("arg2", (Object) str3);
            jSONObject2.put("arg3", (Object) str4);
            jSONObject2.put("args", (Object) jSONObject);
            qiVar.n(jSONObject2);
            pi.b(nbbVar, "userTrack", qiVar);
        }
    }

    public static String f(AURARenderComponent aURARenderComponent) {
        TreeNode<RenderComponent> treeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f30139f", new Object[]{aURARenderComponent});
        }
        if (aURARenderComponent == null || (treeNode = aURARenderComponent.mirror) == null || treeNode.data() == null || aURARenderComponent.mirror.data().getComponent() == null || aURARenderComponent.mirror.data().getComponent().getTag() == null) {
            return "";
        }
        return aURARenderComponent.mirror.data().getComponent().getTag();
    }

    public static boolean g(AURARenderComponent aURARenderComponent) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94e1918e", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || TextUtils.isEmpty(aURARenderComponent.key) || TextUtils.isEmpty(f(aURARenderComponent))) {
            return false;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (map = aURARenderComponentData.fields) == null || !map.containsKey("asyncStatus")) {
            return true;
        }
        return "success".equals(map.get("asyncStatus"));
    }

    public static void c(nbb nbbVar, UserMotionConfig userMotionConfig, AURARenderComponent aURARenderComponent, JSONObject jSONObject, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da3ef9d", new Object[]{nbbVar, userMotionConfig, aURARenderComponent, jSONObject, new Integer(i), new Integer(i2), new Long(j)});
        } else if (nbbVar == null) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentDisappear", "instance is null");
        } else if (!UserMotionConfig.isValid(userMotionConfig)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentDisappear", "invalid userMotionConfig");
        } else if (!g(aURARenderComponent)) {
            ck.g().b("UserMotionUTUtils", "commitUserMotionComponentDisappear", "invalid component");
        } else {
            String str = userMotionConfig.page + "_DisAppear-" + f(aURARenderComponent);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && !jSONObject.isEmpty()) {
                jSONObject2.putAll(jSONObject);
            }
            jSONObject2.put(hxj.UNIQID, (Object) userMotionConfig.uid);
            jSONObject2.put("from", (Object) String.valueOf(i));
            jSONObject2.put("to", (Object) String.valueOf(i2));
            jSONObject2.put("stayTime", (Object) String.valueOf(j));
            jSONObject2.put("componentKey", (Object) aURARenderComponent.key);
            e(nbbVar, aURARenderComponent, userMotionConfig.page, str, UserMotionActionType.COMPONENT_DISAPPEAR, String.valueOf(j), jSONObject2);
        }
    }
}

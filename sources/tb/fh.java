package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.extend.AURAExtendModuleNodeModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Iterator;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691840);
    }

    public static void c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ae2ec7", new Object[]{str, new Boolean(z)});
            return;
        }
        ck.g().f(str, ck.b.b().l("AURAConfigCombineUtil").i("AURA/core").a());
        if (z) {
            throw new IllegalStateException(str);
        }
    }

    public static String d(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1dfb30", new Object[]{jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("code")) == null) {
            return "";
        }
        return string;
    }

    public static JSONObject e(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("67b4cbfa", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject f(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("10927b7d", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject g(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c908b07f", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static boolean h(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("984bfb49", new Object[]{jSONArray, str})).booleanValue();
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && str.equals(((JSONObject) next).getString("code"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static AURAExtendModuleNodeModel b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAExtendModuleNodeModel) ipChange.ipc$dispatch("bcb79d4b", new Object[]{jSONObject});
        }
        if ("true".equalsIgnoreCase(jSONObject.getString("debug")) && !th.c()) {
            return null;
        }
        String string = jSONObject.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String string2 = jSONObject.getString("configPath");
        String str = string2 + "#extendedModules扩展配置必须设置：";
        if (yn.a(string)) {
            c(str + AliFestivalWVPlugin.PARAMS_MODULE_NAME, true);
            return null;
        }
        String string3 = jSONObject.getString("bizCode");
        if (yn.a(string3)) {
            c(str + "bizCode", true);
            return null;
        }
        String string4 = jSONObject.getString("name");
        if (yn.a(string4)) {
            c(str + "name", true);
            return null;
        } else if (!th.c() || !TextUtils.isEmpty(string2)) {
            return new AURAExtendModuleNodeModel(string, string4, string3, string2);
        } else {
            c(str + "configPath", true);
            return null;
        }
    }

    public static JSONObject i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63ee6703", new Object[]{context, str});
        }
        if (yn.a(str)) {
            c("AURA配置路径不能为空", true);
            return null;
        }
        String b = cxu.b(context, str);
        if (TextUtils.isEmpty(b)) {
            c("读取配置文件【" + str + "】失败", true);
            return null;
        }
        JSONObject parseObject = JSON.parseObject(b);
        if (parseObject == null) {
            c("序列化配置文件【" + str + "】失败", true);
            return null;
        }
        JSONObject jSONObject = parseObject.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject == null) {
            c("配置文件【" + str + "】没有plugin节点，不合法", true);
            return null;
        } else if (!TextUtils.isEmpty(jSONObject.getString("bizCode"))) {
            return parseObject;
        } else {
            c("配置文件【" + str + "】没有bizCode节点，不合法", true);
            return null;
        }
    }

    public static boolean a(AURAExtendModuleNodeModel aURAExtendModuleNodeModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3781d3f6", new Object[]{aURAExtendModuleNodeModel, jSONObject})).booleanValue();
        }
        String str = aURAExtendModuleNodeModel.configPath;
        if (jSONObject == null || jSONObject.isEmpty()) {
            c(str + "#不是合法的AURA配置", true);
            return true;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject2 == null) {
            c(str + "#不是合法的AURA配置#没有plugin节点", true);
            return true;
        } else if (!TextUtils.equals(jSONObject2.getString("bizCode"), aURAExtendModuleNodeModel.bizCode)) {
            c(str + "和扩展配置中的信息不一致：bizCode", true);
            return true;
        } else if (TextUtils.equals(jSONObject2.getString("name"), aURAExtendModuleNodeModel.name)) {
            return false;
        } else {
            c(str + "#和平台层扩展信息不一致：name", true);
            return true;
        }
    }
}

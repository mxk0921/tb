package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.CompatibilityFlags;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.JsonPatchApplicationException;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.Operation;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import tb.hqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nse implements hwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSON f24922a;
    public final EnumSet<CompatibilityFlags> b;

    static {
        t2o.a(503317259);
        t2o.a(503317264);
    }

    public nse(JSON json, EnumSet<CompatibilityFlags> enumSet) {
        this.f24922a = json;
        this.b = enumSet;
    }

    public static String g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("590255f6", new Object[]{list});
        }
        hqq.b a2 = hqq.a();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            a2.b(it.next() + "/");
        }
        return a2.toString();
    }

    public final void b(List<String> list, Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5411a579", new Object[]{this, list, obj, jSONArray});
            return;
        }
        String str = list.get(list.size() - 1);
        if ("-".equals(str)) {
            jSONArray.add(obj);
        } else {
            jSONArray.add(d(str.replaceAll("\"", ""), jSONArray.size(), false), obj);
        }
    }

    public final boolean c(List<String> list, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c752929d", new Object[]{this, list, jSONObject, obj})).booleanValue();
        }
        return !m(jSONObject.put(list.get(list.size() - 1).replaceAll("\"", ""), obj), obj);
    }

    public final int d(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa13b56e", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                throw new JsonPatchApplicationException("index Out of bound, index is negative");
            } else if (parseInt <= i || z) {
                return parseInt;
            } else {
                throw new JsonPatchApplicationException("index Out of bound, index is greater than " + i);
            }
        } catch (NumberFormatException unused) {
            throw new JsonPatchApplicationException("Object operation on array target");
        }
    }

    public boolean e(List<String> list, List<String> list2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b6f9962", new Object[]{this, list, list2})).booleanValue();
        }
        JSON i = i(list, Operation.COPY);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if (i instanceof JSONArray) {
            obj = ((JSONArray) i).get(Integer.parseInt(replaceAll));
        } else {
            obj = ((JSONObject) i).get(replaceAll);
        }
        return a(list2, obj);
    }

    public final void f(Operation operation, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae808f9", new Object[]{this, operation, str});
            return;
        }
        throw new JsonPatchApplicationException("[" + operation + " Operation] " + str);
    }

    public final Object h(Object obj, List<String> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1e93a39b", new Object[]{this, obj, list, new Integer(i)});
        }
        if (i >= list.size()) {
            return obj;
        }
        String str = list.get(i);
        if (obj instanceof JSONArray) {
            Object obj2 = ((JSONArray) obj).get(Integer.parseInt(str.replaceAll("\"", "")));
            if (obj2 == null) {
                return null;
            }
            return h(obj2, list, i + 1);
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.containsKey(str)) {
                return h(jSONObject.get(str), list, i + 1);
            }
            return null;
        }
    }

    public final JSON i(List<String> list, Operation operation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSON) ipChange.ipc$dispatch("dfc8e7f9", new Object[]{this, list, operation});
        }
        JSON json = (JSON) h(this.f24922a, list.subList(0, list.size() - 1), 1);
        if (json == null) {
            f(operation, "noSuchPath in source, path provided: " + g(list));
        }
        return json;
    }

    public boolean j(List<String> list, List<String> list2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("716e27be", new Object[]{this, list, list2})).booleanValue();
        }
        JSON i = i(list, Operation.MOVE);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if (i instanceof JSONArray) {
            obj = ((JSONArray) i).get(Integer.parseInt(replaceAll));
        } else {
            obj = ((JSONObject) i).get(replaceAll);
        }
        return k(list) | a(list2, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561a0044", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if ((obj instanceof CharSequence) && obj2 == null) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        if (!(obj2 instanceof CharSequence) || obj != null) {
            return false;
        }
        return TextUtils.isEmpty((CharSequence) obj2);
    }

    public boolean a(List<String> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a521d39", new Object[]{this, list, obj})).booleanValue();
        }
        if (list.isEmpty()) {
            f(Operation.ADD, "path is empty , path : ");
            return false;
        }
        JSON i = i(list, Operation.ADD);
        if (list.get(list.size() - 1).replaceAll("\"", "").equals("") && list.size() == 1) {
            this.f24922a = (JSON) obj;
            return true;
        } else if (!(i instanceof JSONArray)) {
            return c(list, (JSONObject) i, obj);
        } else {
            b(list, obj, (JSONArray) i);
            return true;
        }
    }

    public boolean k(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d0db200", new Object[]{this, list})).booleanValue();
        }
        if (list.isEmpty()) {
            f(Operation.REMOVE, "path is empty");
            return false;
        }
        Operation operation = Operation.REMOVE;
        JSON i = i(list, operation);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if (i instanceof JSONObject) {
            Object remove = ((JSONObject) i).remove(replaceAll);
            return remove != null && (!(remove instanceof CharSequence) || !TextUtils.isEmpty((CharSequence) remove));
        } else if (i instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) i;
            jSONArray.remove(d(replaceAll, jSONArray.size() - 1, this.b.contains(CompatibilityFlags.REMOVE_NONE_EXISTING_ARRAY_ELEMENT)));
            return true;
        } else {
            f(operation, "noSuchPath in source, path provided : " + g(list));
            return false;
        }
    }

    public boolean l(List<String> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a64310c", new Object[]{this, list, obj})).booleanValue();
        }
        if (list.isEmpty()) {
            f(Operation.REPLACE, "path is empty");
            return false;
        }
        Operation operation = Operation.REPLACE;
        JSON i = i(list, operation);
        String replaceAll = list.get(list.size() - 1).replaceAll("\"", "");
        if ((replaceAll == null || replaceAll.length() == 0) && list.size() == 1) {
            this.f24922a = (JSON) obj;
            return true;
        } else if (i instanceof JSONObject) {
            return !m(((JSONObject) i).put(replaceAll, obj), obj);
        } else {
            if (i instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) i;
                return !m(jSONArray.set(d(replaceAll, jSONArray.size() - 1, false), obj), obj);
            }
            f(operation, "noSuchPath in source, path provided : " + g(list));
            return false;
        }
    }
}

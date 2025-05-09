package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.StringTokenizer;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o4r<T extends k8> extends m8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PATH_ACTIONS = "actions";

    static {
        t2o.a(786432068);
    }

    public static /* synthetic */ Object ipc$super(o4r o4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/TAKAbsUpdateItem");
    }

    public b8 i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("52a08036", new Object[]{this, str, new Boolean(z)});
        }
        return new b8(new a8(20000, str), z);
    }

    public final void k(String str, Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20013ae5", new Object[]{this, str, queue});
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        while (stringTokenizer.hasMoreTokens()) {
            queue.offer(stringTokenizer.nextToken());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public c8 j(JSONObject jSONObject, JSONArray jSONArray) {
        char c;
        char c2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("49b05671", new Object[]{this, jSONObject, jSONArray});
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                return i("action is not JSONObject", z);
            }
            JSONObject jSONObject2 = (JSONObject) next;
            String string = jSONObject2.getString(x96.PATH_OPERATOR);
            if (TextUtils.isEmpty(string)) {
                return i("operator is empty", z);
            }
            String string2 = jSONObject2.getString("key");
            if (TextUtils.isEmpty(string2)) {
                return i("key is empty", z);
            }
            Object obj = jSONObject2.get("value");
            ArrayDeque arrayDeque = new ArrayDeque();
            k(string2, arrayDeque);
            Object obj2 = jSONObject;
            while (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                if (arrayDeque.isEmpty()) {
                    if (obj2 instanceof JSONObject) {
                        string.hashCode();
                        switch (string.hashCode()) {
                            case -1068795718:
                                if (string.equals("modify")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -934610812:
                                if (string.equals("remove")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 103785528:
                                if (string.equals("merge")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                ((JSONObject) obj2).put(str, obj);
                                break;
                            case 1:
                                ((JSONObject) obj2).remove(str);
                                break;
                            case 2:
                                Object obj3 = ((JSONObject) obj2).get(str);
                                if ((obj3 instanceof JSONObject) && (obj instanceof JSONObject)) {
                                    ((JSONObject) obj3).putAll((JSONObject) obj);
                                    break;
                                } else {
                                    return i("operator=" + string + ", value is not JSONObject", true);
                                }
                                break;
                            default:
                                return i("unSupportOperator = ".concat(string), true);
                        }
                    } else if (obj2 instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj2;
                        if (TextUtils.isDigitsOnly(str)) {
                            int parseInt = Integer.parseInt(str);
                            string.hashCode();
                            switch (string.hashCode()) {
                                case -1068795718:
                                    if (string.equals("modify")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -934610812:
                                    if (string.equals("remove")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 103785528:
                                    if (string.equals("merge")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    jSONArray2.remove(parseInt);
                                    jSONArray2.add(parseInt, obj);
                                    break;
                                case 1:
                                    jSONArray2.remove(parseInt);
                                    break;
                                case 2:
                                    Object obj4 = jSONArray2.get(parseInt);
                                    if ((obj4 instanceof JSONObject) && (obj instanceof JSONObject)) {
                                        ((JSONObject) obj4).putAll((JSONObject) obj);
                                        break;
                                    } else {
                                        return i("operator=" + string + ", value is not JSONObject", true);
                                    }
                                    break;
                                default:
                                    return i("unSupportOperator = ".concat(string), true);
                            }
                        } else {
                            return i("index is not number index=" + str, true);
                        }
                    } else {
                        continue;
                    }
                } else if (obj2 instanceof JSONObject) {
                    obj2 = ((JSONObject) obj2).get(str);
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) obj2;
                    if (TextUtils.isDigitsOnly(str)) {
                        obj2 = jSONArray3.get(Integer.parseInt(str));
                    } else {
                        return i("fieldsNamePath=" + string2 + ", index is not number index=" + str, true);
                    }
                } else {
                    return i("fieldsNamePath=" + string2 + ", field=" + str + ", is not JSONObject or JSONArray", true);
                }
                z = true;
                obj2 = obj2;
            }
        }
        return new f8(jSONObject);
    }
}

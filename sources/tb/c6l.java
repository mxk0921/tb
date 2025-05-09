package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c6l extends jq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_KEY = "modify";

    static {
        t2o.a(83886221);
    }

    public static /* synthetic */ Object ipc$super(c6l c6lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/delta/OperateModify");
    }

    public final DMComponent b(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("ffbc0ee", new Object[]{this, dMComponent});
        }
        try {
            return new DMComponent(JSON.parseObject(dMComponent.getData().toJSONString()), dMComponent.getContainerType(), JSON.parseObject(dMComponent.getContainerInfo().toJSONString()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Object c(JSONObject jSONObject, String[] strArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f31978f5", new Object[]{this, jSONObject, strArr});
        }
        while (strArr.length > 1) {
            String str = strArr[0];
            if (str.endsWith("]")) {
                int indexOf = str.indexOf("[");
                JSONArray jSONArray = jSONObject.getJSONArray(str.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str.substring(indexOf + 1, str.length() - 1));
                } catch (Throwable unused) {
                    i = 0;
                }
                if (i < jSONArray.size()) {
                    jSONObject = jSONArray.getJSONObject(i);
                    strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
                }
            } else {
                jSONObject = jSONObject.getJSONObject(str);
                strArr = (String[]) Arrays.copyOfRange(strArr, 1, strArr.length);
            }
        }
        return jSONObject.get(strArr[0]);
    }

    public final void d(JSONObject jSONObject, String[] strArr, Object obj, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335fb4f7", new Object[]{this, jSONObject, strArr, obj, str});
        } else if (strArr.length != 1) {
            String str2 = strArr[0];
            if (str2.endsWith("]")) {
                int indexOf = str2.indexOf("[");
                JSONArray jSONArray = jSONObject.getJSONArray(str2.substring(0, indexOf));
                try {
                    i = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                } catch (Throwable unused) {
                }
                if (jSONArray != null && i < jSONArray.size()) {
                    d(jSONArray.getJSONObject(i), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
                    return;
                }
                return;
            }
            d(jSONObject.getJSONObject(str2), (String[]) Arrays.copyOfRange(strArr, 1, strArr.length), obj, str);
        } else if ("remove".equals(str)) {
            jSONObject.remove(str);
        } else if ("add".equals(str) || "update".equals(str)) {
            jSONObject.put(strArr[0], obj);
        }
    }

    @Override // tb.jq
    public void a(u55 u55Var, JSONObject jSONObject, List<rb4> list) {
        ArrayMap<String, Object> extMap;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1d5e0", new Object[]{this, u55Var, jSONObject, list});
        } else if (jSONObject != null && jSONObject.containsKey("operations")) {
            JSONArray jSONArray = jSONObject.getJSONArray("operations");
            String str = "target";
            String string = jSONObject.getString(str);
            if (jSONArray == null || jSONArray.isEmpty()) {
                UnifyLog.m(u55Var.getBizName(), "OperateModify", "modify operations is null", new String[0]);
                return;
            }
            Map<String, DMComponent> p = u55Var.p();
            DMComponent dMComponent = p.get(string);
            if (dMComponent == null) {
                UnifyLog.m(u55Var.getBizName(), "OperateModify", "local target component is null", new String[0]);
                return;
            }
            DMComponent b = b(dMComponent);
            if (b == null) {
                UnifyLog.m(u55Var.getBizName(), "OperateModify", "modify target component is null", new String[0]);
                return;
            }
            JSONObject jSONObject2 = u55Var.r().getJSONObject(string);
            if (jSONObject2 == null) {
                UnifyLog.m(u55Var.getBizName(), "OperateModify", "modify source component is null", new String[0]);
                return;
            }
            JSONObject data = b.getData();
            Pattern compile = Pattern.compile("[`${}]");
            int size = jSONArray.size();
            int i2 = 0;
            while (i2 < size) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String string2 = jSONObject3.getString("type");
                String string3 = jSONObject3.getString(str);
                String string4 = jSONObject3.getString("source");
                if (!TextUtils.isEmpty(string2)) {
                    if (TextUtils.isEmpty(string3)) {
                        compile = compile;
                    } else if (!TextUtils.isEmpty(string4)) {
                        Matcher matcher = compile.matcher(string3);
                        Matcher matcher2 = compile.matcher(string4);
                        String trim = matcher.replaceAll("").trim();
                        String trim2 = matcher2.replaceAll("").trim();
                        compile = compile;
                        boolean z = trim.startsWith("fields") || trim.startsWith("events");
                        boolean z2 = trim2.startsWith("fields") || trim2.startsWith("events");
                        if (!z || !z2) {
                            UnifyLog.m(u55Var.getBizName(), "OperateModify", "modify operations node path format is invalid ", new String[0]);
                        } else {
                            d(data, trim.split("\\."), c(jSONObject2, trim2.split("\\.")), string2);
                            i = 1;
                            i2 += i;
                            jSONArray = jSONArray;
                            str = str;
                        }
                    }
                    i = 1;
                    i2 += i;
                    jSONArray = jSONArray;
                    str = str;
                }
                compile = compile;
                i = 1;
                i2 += i;
                jSONArray = jSONArray;
                str = str;
            }
            b.writeBackDataAndReloadEvent(data, false);
            u55Var.r().put(string, (Object) b.getData());
            DMComponent dMComponent2 = (DMComponent) dMComponent.getParent();
            if (dMComponent2 != null) {
                int indexOf = dMComponent2.getChildren().indexOf(dMComponent);
                if (indexOf == -1) {
                    UnifyLog.m(u55Var.getBizName(), "OperateModify", "target component index is -1", new String[0]);
                }
                dMComponent2.getChildren().remove(indexOf);
                dMComponent2.getChildren().add(indexOf, b);
                b.setParent(dMComponent2);
                ArrayMap<String, Object> extMap2 = dMComponent.getExtMap();
                if (!(extMap2 == null || (extMap = b.getExtMap()) == null)) {
                    for (Map.Entry<String, Object> entry : extMap2.entrySet()) {
                        extMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String a2 = f6l.a(b, dMComponent2);
                String f = f6l.f(b, dMComponent2);
                b.setComponentCardGroupTag(a2);
                b.setComponentPosition(f);
                o1o o1oVar = new o1o();
                o1oVar.c(b);
                o1oVar.e(dMComponent);
                o1oVar.d(indexOf);
                list.add(o1oVar);
                List<IDMComponent> components = u55Var.getComponents();
                int indexOf2 = components.indexOf(dMComponent);
                components.remove(indexOf2);
                components.add(indexOf2, b);
                p.put(string, b);
            }
        }
    }
}

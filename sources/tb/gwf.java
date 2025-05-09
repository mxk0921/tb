package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.CompatibilityFlags;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.InvalidJsonPatchException;
import com.taobao.tao.flexbox.layoutmanager.jsonpatch.Operation;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation;

        static {
            int[] iArr = new int[Operation.values().length];
            $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation = iArr;
            try {
                iArr[Operation.REMOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation[Operation.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation[Operation.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation[Operation.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation[Operation.COPY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(503317261);
    }

    public static boolean a(JSONArray jSONArray, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be2fb2d0", new Object[]{jSONArray, json})).booleanValue();
        }
        return b(jSONArray, json, CompatibilityFlags.defaults());
    }

    public static boolean b(JSONArray jSONArray, JSON json, EnumSet<CompatibilityFlags> enumSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f48858", new Object[]{jSONArray, json, enumSet})).booleanValue();
        }
        return f(jSONArray, new nse(json, enumSet), enumSet);
    }

    public static Object c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("97349b62", new Object[]{jSONObject, str});
        }
        return jSONObject.get(str);
    }

    public static Object d(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("27626a1b", new Object[]{jSONObject, str, obj});
        }
        Object obj2 = jSONObject.get(str);
        if (obj2 == null) {
            return obj;
        }
        return obj2;
    }

    public static List<String> e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3fc9f89", new Object[]{obj});
        }
        return nwv.H(obj.toString(), wh6.DIR);
    }

    public static boolean f(JSONArray jSONArray, hwf hwfVar, EnumSet<CompatibilityFlags> enumSet) throws InvalidJsonPatchException {
        boolean k;
        Object obj;
        Object obj2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cd81e4b", new Object[]{jSONArray, hwfVar, enumSet})).booleanValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            Operation fromRfcName = Operation.fromRfcName(c(jSONObject, xj4.f31420a).toString().replaceAll("\"", ""));
            List<String> e = e(c(jSONObject, xj4.c));
            int i = a.$SwitchMap$com$taobao$tao$flexbox$layoutmanager$jsonpatch$Operation[fromRfcName.ordinal()];
            if (i == 1) {
                k = ((nse) hwfVar).k(e);
            } else if (i == 2) {
                if (!enumSet.contains(CompatibilityFlags.MISSING_VALUES_AS_NULLS)) {
                    obj = c(jSONObject, xj4.b);
                } else {
                    obj = d(jSONObject, xj4.b, null);
                }
                k = ((nse) hwfVar).a(e, obj);
            } else if (i == 3) {
                if (!enumSet.contains(CompatibilityFlags.MISSING_VALUES_AS_NULLS)) {
                    obj2 = c(jSONObject, xj4.b);
                } else {
                    obj2 = d(jSONObject, xj4.b, null);
                }
                k = ((nse) hwfVar).l(e, obj2);
            } else if (i == 4) {
                k = ((nse) hwfVar).j(e(c(jSONObject, xj4.d)), e);
            } else if (i == 5) {
                k = ((nse) hwfVar).e(e(c(jSONObject, xj4.d)), e);
            }
            z |= k;
        }
        return z;
    }
}

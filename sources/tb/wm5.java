package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wm5 extends um5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596747);
    }

    public static /* synthetic */ Object ipc$super(wm5 wm5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/ExepressionEvaluation/DXDataParserIndexOfValues");
    }

    @Override // tb.um5
    public int a(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74761947", new Object[]{this, jSONArray, obj})).intValue();
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            if (jSONArray.get(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // tb.um5, tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "index_of_value";
    }
}

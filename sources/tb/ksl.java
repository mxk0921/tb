package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ksl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_KEY_COMP = "comp";
    public static final String PARSER_KEY_DATA = "data";
    public static final String PARSER_KEY_DX_DATA = "dxData";
    public static final String PARSER_KEY_DX_PARENT_DATA = "parentDxData";
    public static final String PARSER_KEY_DX_SUBDATA = "dxSubdata";
    public static final String PARSER_KEY_LOCAL = "local";
    public static final String PARSER_KEY_PARENT_KEY = "parentKey";
    public static final String PARSER_KEY_ULTRON_GLOBAL = "ultronGlobal";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, fsl> f22892a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{str})).booleanValue();
        }
        return ((HashMap) f22892a).containsKey(str);
    }

    public static fsl b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsl) ipChange.ipc$dispatch("28f09ed0", new Object[]{str});
        }
        return (fsl) ((HashMap) f22892a).get(str);
    }

    static {
        t2o.a(614465600);
        HashMap hashMap = new HashMap();
        f22892a = hashMap;
        sr6 sr6Var = new sr6();
        hashMap.put("data", sr6Var);
        hashMap.put(PARSER_KEY_COMP, sr6Var);
        hashMap.put(PARSER_KEY_DX_SUBDATA, sr6Var);
        hashMap.put(PARSER_KEY_DX_DATA, sr6Var);
        hashMap.put(PARSER_KEY_ULTRON_GLOBAL, sr6Var);
        hashMap.put("local", new o8h());
        hashMap.put(PARSER_KEY_DX_PARENT_DATA, new sql());
        hashMap.put(PARSER_KEY_PARENT_KEY, new wql());
    }
}

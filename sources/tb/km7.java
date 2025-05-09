package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class km7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, av> f22756a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{str})).booleanValue();
        }
        return ((HashMap) f22756a).containsKey(str);
    }

    public static im7 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (im7) ipChange.ipc$dispatch("e9a71933", new Object[]{str});
        }
        return (im7) ((HashMap) f22756a).get(str);
    }

    public static void c(String str, av avVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5462117c", new Object[]{str, avVar});
        } else if (TextUtils.isEmpty(str) || avVar == null) {
            throw new DinamicException("prefix or parser is null");
        } else {
            Map<String, av> map = f22756a;
            if (((HashMap) map).get(str) == null) {
                ((HashMap) map).put(str, avVar);
                return;
            }
            throw new DinamicException("registerParser failed, parser already register by current identify:" + str);
        }
    }

    static {
        t2o.a(444596289);
        HashMap hashMap = new HashMap();
        f22756a = hashMap;
        hashMap.put("data", new sm7());
        hashMap.put("const", new gm7());
        hashMap.put("subdata", new in7());
        hashMap.put("appstyle", new e91());
        hashMap.put("and", new nv0());
        hashMap.put("eq", new hh8());
        hashMap.put("len", new rmg());
        hashMap.put("not", new w7k());
        hashMap.put("else", new fb8());
        hashMap.put("if", new a6i());
        hashMap.put("lc", new rqq());
        hashMap.put("uc", new xqq());
        hashMap.put("concat", new lqq());
        hashMap.put("triple", new rgu());
        hashMap.put("substr", new tqq());
        hashMap.put("afnd", new xi9());
        hashMap.put("aget", new z6a());
        hashMap.put("dget", new z6a());
        hashMap.put("or", new d8l());
        hashMap.put("trim", new ogu());
        hashMap.put("flt", new lt7());
        hashMap.put("flte", new nt7());
        hashMap.put("fgte", new jt7());
        hashMap.put("fgt", new ht7());
        hashMap.put("feq", new ft7());
        hashMap.put("igte", new rdf());
        hashMap.put("igt", new pdf());
        hashMap.put("ilte", new xdf());
        hashMap.put("ilt", new vdf());
        hashMap.put("ieq", new kdf());
        hashMap.put(em7.SIZE_BY_FACTOR, new hn7());
        hashMap.put(em7.IS_ELDER, new wm7());
    }
}

package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j1i extends lyp<jn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, Class<? extends g6l>> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    public static j1i e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j1i) ipChange.ipc$dispatch("f9f7b408", new Object[0]);
        }
        j1i j1iVar = new j1i();
        j1iVar.d(jn.a());
        return j1iVar;
    }

    public static /* synthetic */ Object ipc$super(j1i j1iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/state/MainStore");
    }

    public void f(String str, mu1 mu1Var, a aVar) throws Throwable {
        Class cls = (Class) ((HashMap) c).get(str);
        if (cls != null) {
            d(((g6l) cls.newInstance()).b(mu1Var, b(), aVar));
        } else {
            ck.g().a("MainStore", "dispatch", "不识别的操作类型");
        }
    }

    static {
        t2o.a(80740715);
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("insert", hbf.class);
        hashMap.put("merge", yli.class);
        hashMap.put("replace", p1o.class);
    }
}

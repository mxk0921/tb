package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cb3 extends ku<Map<String, Map<String, qtd>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sKeyCart = "cart";
    public static final String sKeyUltron = "ultron";
    public final Map<String, qtd> b = new HashMap();
    public final Map<String, qtd> c = new HashMap();
    public boolean d = false;

    static {
        t2o.a(479199524);
    }

    public static /* synthetic */ Object ipc$super(cb3 cb3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartEventSubscriberPreloader");
    }

    @Override // tb.ku
    public void c(Context context) {
        Map<String, Class<? extends qtd>> a2 = ql8.a();
        if (a2 != null) {
            for (Map.Entry<String, Class<? extends qtd>> entry : a2.entrySet()) {
                try {
                    ((HashMap) this.b).put(entry.getKey(), entry.getValue().newInstance());
                } catch (Exception unused) {
                    this.d = false;
                    return;
                }
            }
        }
        Map<String, Class<? extends qtd>> a3 = bb3.a();
        if (a3 != null) {
            for (Map.Entry<String, Class<? extends qtd>> entry2 : a3.entrySet()) {
                try {
                    ((HashMap) this.c).put(entry2.getKey(), entry2.getValue().newInstance());
                } catch (Exception unused2) {
                    this.d = false;
                    return;
                }
            }
        }
        this.d = true;
    }

    /* renamed from: f */
    public Map<String, Map<String, qtd>> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a50a5f2", new Object[]{this, new Boolean(z)});
        }
        if (!this.d) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ultron", this.b);
        hashMap.put("cart", this.c);
        return hashMap;
    }
}

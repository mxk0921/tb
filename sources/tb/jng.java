package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22090a = jng.class.getSimpleName();

    static {
        t2o.a(779093462);
    }

    public void a(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974bd98b", new Object[]{this, cbaVar});
            return;
        }
        x5t.h(f22090a, "LifeCycle checkUnclosed");
        if (cbaVar != null) {
            HashMap<String, String> Z = cbaVar.Z();
            if (!Z.isEmpty()) {
                for (String str : Z.keySet()) {
                    if (Z.get(str) != null) {
                        b(vx9.d(), str, Z.get(str));
                    }
                }
            }
        }
    }

    public final void b(ux9 ux9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91aa8adc", new Object[]{this, ux9Var, str, str2});
            return;
        }
        String str3 = f22090a;
        x5t.h(str3, "reportUnclosed opportunity" + str2 + " liveContextKey = " + str);
        HashMap hashMap = new HashMap();
        hashMap.put("opportunity", str2);
        hashMap.put("isNewTrigger", "true");
        if (v2s.o().s() != null) {
            v2s.o().s().a("UpDownLifeCycleUnclosed", "Page_TaobaoLiveWatch", hashMap);
        }
    }
}

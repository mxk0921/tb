package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740531);
    }

    public static void a(AURARenderComponent aURARenderComponent, List<AURARenderComponent> list, List<AURARenderComponent> list2, mbb<AURARenderComponent, Boolean> mbbVar, mbb<AURARenderComponent, Boolean> mbbVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86f991a", new Object[]{aURARenderComponent, list, list2, mbbVar, mbbVar2});
            return;
        }
        Boolean a2 = mbbVar.a(aURARenderComponent);
        if (a2 == null || !a2.booleanValue()) {
            if (!(mbbVar2 == null || list2 == null || !mbbVar2.a(aURARenderComponent).booleanValue())) {
                list2.add(aURARenderComponent);
            }
            List<AURARenderComponent> list3 = aURARenderComponent.children;
            if (list3 != null) {
                for (AURARenderComponent aURARenderComponent2 : list3) {
                    if (aURARenderComponent2 == null) {
                        rj.d("DO_FLAT_EXCEPTION", "childComponent is null");
                    } else {
                        a(aURARenderComponent2, list, list2, mbbVar, mbbVar2);
                    }
                }
                return;
            }
            return;
        }
        list.add(aURARenderComponent);
    }

    public static void b(AURARenderComponent aURARenderComponent, List<AURARenderComponent> list, mbb<AURARenderComponent, Boolean> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fdf3565", new Object[]{aURARenderComponent, list, mbbVar});
        } else if (aURARenderComponent == null) {
            rj.d("WARNING_DO_FLAT", "rootRenderComponent is null");
        } else {
            a(aURARenderComponent, list, null, mbbVar, null);
        }
    }
}

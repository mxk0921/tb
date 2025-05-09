package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z48 extends uv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements mtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.mtd
        public List<ISubService> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
            }
            List<ISubService> c = z48.c(z48.this);
            c.add(new DynamicSceneService());
            c.add(z48.d(z48.this));
            return c;
        }
    }

    public z48(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ List c(z48 z48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c5764c07", new Object[]{z48Var});
        }
        return z48Var.b();
    }

    public static /* synthetic */ DosaContainerDataService d(z48 z48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("821a80f5", new Object[]{z48Var});
        }
        return z48Var.e();
    }

    public static /* synthetic */ Object ipc$super(z48 z48Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dynamictab/config/DynamicInfoFlowRegistry");
    }

    @Override // tb.qve
    public mtd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8ac61e48", new Object[]{this});
        }
        return new a();
    }

    public final DosaContainerDataService e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("21fd22ee", new Object[]{this});
        }
        return new DosaContainerDataService.c(new q58()).g();
    }
}

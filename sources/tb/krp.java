package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class krp extends hh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements mtd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22869a;

        public a(krp krpVar, List list) {
            this.f22869a = list;
        }

        @Override // tb.mtd
        public List<ISubService> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("19850b7", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList(this.f22869a);
            if (!f4b.b("disableAfterBuyAI", false) && !cve.b()) {
                arrayList.add(new AiServiceImpl());
            }
            return arrayList;
        }
    }

    static {
        t2o.a(729809243);
    }

    public krp(arb arbVar) {
        super(arbVar);
    }

    public static /* synthetic */ Object ipc$super(krp krpVar, String str, Object... objArr) {
        if (str.hashCode() == -1966727608) {
            return super.a();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/afterbuy/register/ShoppingCartInfoFlowServiceRegistry");
    }

    @Override // tb.hh0, tb.qve
    public mtd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8ac61e48", new Object[]{this});
        }
        return new a(this, super.a().a());
    }
}

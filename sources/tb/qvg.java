package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.editionservice.TbEditionServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.DosaContainerDataService;
import com.taobao.oversea.homepage.litetao.service.biz.sceneservice.LiteTaoSceneService;
import com.taobao.oversea.homepage.litetao.service.biz.search.TaoTeSearchServiceImpl;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qvg extends uv1 {
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
            List<ISubService> c = qvg.c(qvg.this);
            c.add(new LiteTaoSceneService());
            c.add(qvg.d(qvg.this));
            c.add(new TaoTeSearchServiceImpl());
            c.add(new TbEditionServiceImpl());
            return c;
        }
    }

    public qvg(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ List c(qvg qvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("498ad696", new Object[]{qvgVar});
        }
        return qvgVar.b();
    }

    public static /* synthetic */ DosaContainerDataService d(qvg qvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DosaContainerDataService) ipChange.ipc$dispatch("54f04c62", new Object[]{qvgVar});
        }
        return qvgVar.e();
    }

    public static /* synthetic */ Object ipc$super(qvg qvgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/litetao/config/LiteTaoInfoFlowRegistry");
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
        return new DosaContainerDataService.c(new svg()).h().g();
    }
}

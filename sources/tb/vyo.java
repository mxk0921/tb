package tb;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model.OutLinkModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vyo implements o4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f30347a;
    public JSONObject c;
    public IContainerDataService.a d;
    public IMainFeedsViewService<?> h;
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean e = false;
    public OutLinkModel f = null;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
                return;
            }
            vyo.this.g = f4b.b("enableOutLinkBugfix", true);
            vyo vyoVar = vyo.this;
            if (vyoVar.g) {
                vyo.a(vyoVar, iContainerDataModel);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30349a;
        public final /* synthetic */ JSONObject b;

        public b(String str, JSONObject jSONObject) {
            this.f30349a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String json;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f30349a;
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                json = "";
            } else {
                json = jSONObject.toString();
            }
            uve.a("Page_Home", 19999, "RecmdScrollItem", str, "", json);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30350a;

        public c(String str) {
            this.f30350a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vyo vyoVar = vyo.this;
            vyo.c(vyoVar, vyo.b(vyoVar), this.f30350a);
        }
    }

    static {
        t2o.a(486539563);
        t2o.a(486539561);
    }

    public vyo(cfc cfcVar) {
        this.f30347a = cfcVar;
        i();
    }

    public static /* synthetic */ void a(vyo vyoVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31f6e68", new Object[]{vyoVar, iContainerDataModel});
        } else {
            vyoVar.j(iContainerDataModel);
        }
    }

    public static /* synthetic */ OutLinkModel b(vyo vyoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutLinkModel) ipChange.ipc$dispatch("d542c2f9", new Object[]{vyoVar});
        }
        return vyoVar.f;
    }

    public static /* synthetic */ void c(vyo vyoVar, OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb908370", new Object[]{vyoVar, outLinkModel, str});
        } else {
            vyoVar.k(outLinkModel, str);
        }
    }

    public final IContainerDataService.a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.o4d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            l();
        }
    }

    public final int e(OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26ab61a7", new Object[]{this, outLinkModel, str})).intValue();
        }
        if (!TextUtils.equals("infoFlow", outLinkModel.getArea())) {
            fve.e("!TextUtils.equals(INFOFLOW, area),area is :" + outLinkModel.getArea(), new String[0]);
            return -1;
        }
        int offset = outLinkModel.getOffset();
        int h = h(str);
        if (str == null) {
            return offset + 4;
        }
        if (h < 0) {
            return offset;
        }
        return h + offset;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69c81a3", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("feedsStartSectionBizCode");
    }

    public final OutLinkModel g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutLinkModel) ipChange.ipc$dispatch("f90b77e3", new Object[]{this, str});
        }
        try {
            return (OutLinkModel) JSON.parseObject(str, OutLinkModel.class);
        } catch (Exception e) {
            fve.e("ScrollToItemOperator", "解析成外链数据模型出错: " + e);
            return null;
        }
    }

    @Override // tb.o4d
    public w1e getScrolledToItemTraceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1e) ipChange.ipc$dispatch("80d15e7a", new Object[]{this});
        }
        return null;
    }

    public final int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a1e8bb5", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("ScrollToItemOperator", "infoFlowCardStartBizCode为空");
            return -1;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30347a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getPositionBySectionBizCode(str);
        }
        fve.e("ScrollToItemOperator", "feeds服务为空");
        return -1;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        cfc cfcVar = this.f30347a;
        if (cfcVar != null) {
            this.h = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
            IContainerDataService iContainerDataService = (IContainerDataService) this.f30347a.a(IContainerDataService.class);
            if (iContainerDataService != null) {
                IContainerDataService.a d = d();
                this.d = d;
                iContainerDataService.addDataProcessListener(d);
            }
        }
    }

    public final void j(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753952cf", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && iContainerDataModel.getBase() != null && iContainerDataModel.getBase().getExt() != null) {
            this.c = iContainerDataModel.getBase().getExt();
            String f = f();
            if (this.e && this.f != null) {
                IMainFeedsViewService<?> iMainFeedsViewService = this.h;
                if (iMainFeedsViewService == null || iMainFeedsViewService.isRecyclerViewCreated()) {
                    this.e = false;
                    get.a().h(new c(f));
                }
            }
        }
    }

    public final void k(OutLinkModel outLinkModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458c7261", new Object[]{this, outLinkModel, str});
            return;
        }
        String biz = outLinkModel.getBiz();
        JSONObject args = outLinkModel.getArgs();
        int e = e(outLinkModel, str);
        if (e < 0) {
            tfl.a(tfl.SCROLL_TO_RECOMMEND, tfl.SCROLL_TO_RECOMMEND_ERROR_CODE);
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30347a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.scrollToPosition(e);
            tfl.b(tfl.OUT_LINK_PROCESS_END, tfl.SCROLL_TO_RECOMMEND);
            this.b.post(new b(biz, args));
        }
    }

    public final void l() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30347a.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.d) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    @Override // tb.o4d
    public void onOutLinkTrigger(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
            return;
        }
        tfl.b(tfl.OUT_LINK_PROCESS_START, tfl.SCROLL_TO_RECOMMEND);
        OutLinkModel g = g(str);
        if (g != null) {
            String a2 = lnn.a(this.f30347a);
            boolean b2 = f4b.b("enableOutLinkBugfix", true);
            this.g = b2;
            if (a2 == null && b2) {
                a2 = f();
            }
            if (a2 == null) {
                this.e = true;
                this.f = g;
                return;
            }
            IMainFeedsViewService<?> iMainFeedsViewService = this.h;
            if (iMainFeedsViewService == null || iMainFeedsViewService.isRecyclerViewCreated()) {
                this.e = false;
                k(g, a2);
                return;
            }
            this.e = true;
            this.f = g;
        }
    }
}

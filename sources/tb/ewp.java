package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ewp implements hqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hqd f18852a;
    public final xea b;
    public final deb<EnterGoodsData> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements deb<EnterGoodsData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18853a;
        public final /* synthetic */ hmc b;
        public final /* synthetic */ TBLiveDataModel c;
        public final /* synthetic */ xea d;

        public a(ViewGroup viewGroup, hmc hmcVar, TBLiveDataModel tBLiveDataModel, xea xeaVar) {
            this.f18853a = viewGroup;
            this.b = hmcVar;
            this.c = tBLiveDataModel;
            this.d = xeaVar;
        }

        /* renamed from: a */
        public void onResult(EnterGoodsData enterGoodsData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94422f21", new Object[]{this, enterGoodsData});
            } else {
                ewp.b(ewp.this, this.f18853a, this.b, this.c, this.d, enterGoodsData);
            }
        }

        @Override // tb.deb
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
            } else {
                ewp.b(ewp.this, this.f18853a, this.b, this.c, this.d, new EnterGoodsData());
            }
        }
    }

    static {
        t2o.a(295699110);
        t2o.a(295699051);
    }

    public ewp(ViewGroup viewGroup, hmc hmcVar, TBLiveDataModel tBLiveDataModel, xea xeaVar) {
        this.b = xeaVar;
        hha.c("ShowcaseControllerWrapper", "ShowcaseControllerWrapper() | use remote rec.");
        if (xeaVar == null || xeaVar.j() == null) {
            hha.b("ShowcaseControllerWrapper", "ShowcaseControllerWrapper() | datacenter empty.");
            c(viewGroup, hmcVar, tBLiveDataModel, xeaVar, new EnterGoodsData());
            return;
        }
        a aVar = new a(viewGroup, hmcVar, tBLiveDataModel, xeaVar);
        this.c = aVar;
        xeaVar.j().q(aVar);
    }

    public static /* synthetic */ void b(ewp ewpVar, ViewGroup viewGroup, hmc hmcVar, TBLiveDataModel tBLiveDataModel, xea xeaVar, EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a06b76", new Object[]{ewpVar, viewGroup, hmcVar, tBLiveDataModel, xeaVar, enterGoodsData});
        } else {
            ewpVar.c(viewGroup, hmcVar, tBLiveDataModel, xeaVar, enterGoodsData);
        }
    }

    @Override // tb.hqd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ce8f54", new Object[]{this});
            return;
        }
        hqd hqdVar = this.f18852a;
        if (hqdVar != null) {
            ((cwp) hqdVar).a();
        }
    }

    public final void c(ViewGroup viewGroup, hmc hmcVar, TBLiveDataModel tBLiveDataModel, xea xeaVar, EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac4b8f4", new Object[]{this, viewGroup, hmcVar, tBLiveDataModel, xeaVar, enterGoodsData});
        } else {
            this.f18852a = new cwp(viewGroup, hmcVar, tBLiveDataModel.mVideoInfo, xeaVar, enterGoodsData);
        }
    }

    @Override // tb.hqd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hqd hqdVar = this.f18852a;
        if (hqdVar != null) {
            ((cwp) hqdVar).destroy();
        }
        xea xeaVar = this.b;
        if (xeaVar != null && xeaVar.j() != null && this.c != null) {
            this.b.j().S(this.c);
        }
    }
}

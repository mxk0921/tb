package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kkr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String k = kkr.class.getSimpleName();
    public static kkr l;

    /* renamed from: a  reason: collision with root package name */
    public beb f22733a;
    public b2e b;
    public qyc c;
    public wbc d;
    public nac e;
    public String f;
    public final String g = "预约成功，宝贝开始讲解时会在\n手机淘宝-消息收到提醒";
    public final String h = "预约失败，请稍后再试";
    public final String i = "取消预约成功";
    public final String j = "取消预约失败，请稍后再试";

    static {
        t2o.a(295698844);
    }

    public static kkr i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkr) ipChange.ipc$dispatch("f5e44aac", new Object[0]);
        }
        if (l == null) {
            l = new kkr();
        }
        return l;
    }

    public void A(b2e b2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287a5252", new Object[]{this, b2eVar});
        } else {
            this.b = b2eVar;
        }
    }

    public void a(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbb22a5", new Object[]{this, xeaVar});
        } else if (xeaVar != null) {
            xeaVar.b();
        }
    }

    public void b(xea xeaVar, stk stkVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb13cf0", new Object[]{this, xeaVar, stkVar, str});
        } else if (xeaVar == null) {
            zha.k("follow");
        } else {
            pfa.i(xeaVar, stkVar, str);
        }
    }

    public String c(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7678e23", new Object[]{this, xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.g();
        }
        zha.k("getAccountId");
        return "";
    }

    public beb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (beb) ipChange.ipc$dispatch("1b0598e0", new Object[]{this});
        }
        return this.f22733a;
    }

    public String e(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6d46578", new Object[]{this, xeaVar});
        }
        if (xeaVar != null) {
            return xeaVar.K;
        }
        zha.k("getCurrentTabName");
        return "全部";
    }

    public boolean f(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87490d9", new Object[]{this, xeaVar})).booleanValue();
        }
        if (xeaVar != null) {
            return xeaVar.n.d();
        }
        zha.k("getFollowState");
        return false;
    }

    public nac g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nac) ipChange.ipc$dispatch("ed4cf710", new Object[]{this});
        }
        return this.e;
    }

    public wbc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbc) ipChange.ipc$dispatch("e44bc8be", new Object[]{this});
        }
        return this.d;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac7db491", new Object[]{this});
        }
        return this.f;
    }

    public fea k(xea xeaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fea) ipChange.ipc$dispatch("81b13d42", new Object[]{this, xeaVar, str});
        }
        if (xeaVar == null) {
            zha.k("getListCacheData");
            return null;
        }
        fea h = xeaVar.h(str);
        if (h != null) {
            xeaVar.V = h.f;
        }
        return xeaVar.h(str);
    }

    public qyc l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qyc) ipChange.ipc$dispatch("1eb54630", new Object[]{this});
        }
        return this.c;
    }

    public int m(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f7c7792", new Object[]{this, xeaVar})).intValue();
        }
        if (xeaVar != null) {
            return xeaVar.l.f30632a;
        }
        zha.k("getShopVipEnable");
        return 1;
    }

    public long n(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("831379ac", new Object[]{this, xeaVar})).longValue();
        }
        if (xeaVar != null) {
            return xeaVar.m.b;
        }
        zha.k("getTopItemId");
        return -1L;
    }

    public b2e o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b2e) ipChange.ipc$dispatch("cd84b170", new Object[]{this});
        }
        return this.b;
    }

    public int p(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ee2f935", new Object[]{this, xeaVar})).intValue();
        }
        if (xeaVar != null && xeaVar.H() != null) {
            return xeaVar.H().status;
        }
        zha.k("getVideoStatus");
        return 0;
    }

    public void q(Context context, TBLiveDataModel tBLiveDataModel, xea xeaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f89e14c", new Object[]{this, context, tBLiveDataModel, xeaVar, new Boolean(z)});
            return;
        }
        a(null);
        wda.P(context);
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            hha.b(k, "initParams | videoinfo is null.");
            return;
        }
        uda.b((Activity) context, xeaVar);
        hha.c(k, "updateTBLiveGoodsSourceData.");
    }

    public boolean r(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03afde0", new Object[]{this, xeaVar})).booleanValue();
        }
        if (xeaVar != null) {
            return xeaVar.O();
        }
        zha.k("isLandscape");
        return false;
    }

    public boolean s(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c08e2cb", new Object[]{this, xeaVar})).booleanValue();
        }
        if (xeaVar != null) {
            return xeaVar.l.b;
        }
        zha.k("isShowVipEnableServer");
        return true;
    }

    public boolean t(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1304406", new Object[]{this, xeaVar})).booleanValue();
        }
        if (xeaVar != null) {
            return xeaVar.l.c;
        }
        zha.k("isShowVipUserAction");
        return true;
    }

    public void u(beb bebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5ebf92", new Object[]{this, bebVar});
        } else {
            this.f22733a = bebVar;
        }
    }

    public void v(nac nacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949daa1c", new Object[]{this, nacVar});
        } else {
            this.e = nacVar;
        }
    }

    public void w(wbc wbcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ed2a72", new Object[]{this, wbcVar});
        } else {
            this.d = wbcVar;
        }
    }

    public void x(xea xeaVar, fea feaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f21e150", new Object[]{this, xeaVar, feaVar});
        } else if (xeaVar == null) {
            zha.k("setListCacheData");
        } else {
            if (feaVar != null) {
                feaVar.f = xeaVar.V;
            }
            xeaVar.Y(feaVar);
        }
    }

    public void y(qyc qycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b10f02", new Object[]{this, qycVar});
        } else {
            this.c = qycVar;
        }
    }

    public void z(xea xeaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588fb44a", new Object[]{this, xeaVar, new Boolean(z)});
        } else if (xeaVar != null) {
            xeaVar.l.c = z;
        }
    }
}

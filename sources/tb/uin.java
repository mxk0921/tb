package tb;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.jarvis.rcmd.cell.XslDegradeCellBean;
import com.taobao.search.musie.RcmdMuiseViewHolder;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;
import tb.l4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static yko f29403a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements l4p.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.l4p.a
        public void a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c95e3928", new Object[]{this, context, str});
            } else {
                Nav.from(context).toUri(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ay4<Void, HandlerThread> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public HandlerThread a(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HandlerThread) ipChange.ipc$dispatch("960e2132", new Object[]{this, r5});
            }
            return wsa.a("tb-search-thread");
        }
    }

    static {
        t2o.a(815792294);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cd8321", new Object[]{application});
            return;
        }
        k8j.a(application);
        yko d = j3p.h().f(application).e(Constants.screen_density, Constants.screen_height, Constants.screen_width, SystemBarDecorator.getStatusBarHeight(application), TaoApplication.getVersion()).h("tbsearch_preference").g(new a()).i(new xvr()).d();
        d.f().c().a("XSearchList");
        d.f().h().a("Xsl.");
        d.f().h().e(i6p.class);
        d.f().c().c("https://market.wapa.taobao.com/app/etaowireless/m-search-chitu/chitupanel/index.html");
        d.f().c().b("http://admin.search.taobao.com/chitu/ChituApiLog/requestUpload");
        d.f().h().c(l3p.INSTANCE.i());
        d.f().h().b(true);
        d.f().b().c(RcmdMuiseViewHolder.CREATOR);
        d.f().i().a(vin.CREATOR);
        etf etfVar = new etf();
        etfVar.m(true);
        etfVar.n(true);
        etfVar.l(true);
        etfVar.k(new r82());
        etfVar.o(new v3p());
        d.f().l(etfVar);
        bhv.b(d, zvr.u(d));
        bhv.a(d, new nlo());
        f29403a = d;
        d.b().d(new xnx());
        d.a().e(ListStyle.WATERFALL, XslDegradeCellBean.class, ah3.XSL_AUCTION_CREATOR);
        d.f().b().b(new sx6(), ah3.DEFAULT_AUCTION_CELL_LIST_CREATOR, ah3.DEFAULT_AUCTION_CELL_WF_CREATOR);
        d.f().n(new b());
        d.f().h().d(w5p.c());
    }
}

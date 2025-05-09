package tb;

import android.app.Application;
import anet.channel.session.dns.DnsNavProcessor;
import anet.channel.session.dns.DnsNavProcessorNode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.UltronTradeHybridNavProcessor;
import com.alibaba.triver.bundle.nav.TriverNavProcessor;
import com.alibaba.triver.triver_shop.adapter.ShopNavAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.allspark.GuangGuangNavProcessor;
import com.taobao.android.litecreator.sdk.LiteCreatorNavProcessor;
import com.taobao.android.purchase.TBBuyNavProcessor;
import com.taobao.android.tb3dspaceprocessor.XRNativeProcessor;
import com.taobao.browser.nav.BrowserActivityProcessor;
import com.taobao.fscrmid.nav.FullPageNavProcessor;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.message.util.MessageNavProcessorV2Node;
import com.taobao.mytaobao.newsetting.MTbSettingsNavProcessor;
import com.taobao.pha.tb.H5NavProcess;
import com.taobao.pha.tb.PrefetchProcessor;
import com.taobao.schedule.ElasticScheduleProcessor;
import com.taobao.search.filter.SearchDoorNavProcessor;
import com.taobao.search.filter.SearchResultNavProcessor;
import com.taobao.weex.adapter.TBWXNavProcessor;
import com.taobao.weex.adapter.TBWXNavProcessorNode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hzm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODIFY_AFTER = 4;
    public static final int MODIFY_BEFORE = 2;
    public static final int READ_ONLY_AFTER = 5;
    public static final int READ_ONLY_BEFORE = 0;
    public static final int ROOT_MODIFY_BEFORE = 1;
    public static final int WINDVANE = 3;

    /* renamed from: a  reason: collision with root package name */
    public static gzm f20987a = null;
    public static gzm b = null;
    public static gzm c = null;
    public static gzm d = null;
    public static gzm e = null;
    public static gzm f = null;

    static {
        t2o.a(578814059);
    }

    public static gzm a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("ec644b4a", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            if (f20987a == null) {
                f20987a = e();
            }
            return f20987a;
        } else if (i == 1) {
            if (f == null) {
                f = f();
            }
            return f;
        } else if (i == 2) {
            if (d == null) {
                d = c();
            }
            return d;
        } else if (i == 3) {
            if (c == null) {
                c = g();
            }
            return c;
        } else if (i == 4) {
            if (e == null) {
                e = b();
            }
            return e;
        } else if (i != 5) {
            return null;
        } else {
            if (b == null) {
                b = d();
            }
            return b;
        }
    }

    public static gzm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("449f2d17", new Object[0]);
        }
        return gzm.a(new c0k(new b0k())).c(new fc3(new ec3())).c(new z6u(new y6u())).c(new nws(new mws())).c(new ukl(new tkl())).c(new qzr(new pzr())).c(new jvh(new MTbSettingsNavProcessor())).c(new hg7(new gg7())).c(new t8w(new s8w())).c(new dax(new cax())).c(new r3h(new q3h())).c(new x6t(new w6t())).c(new d2p(new SearchDoorNavProcessor())).c(new c5p(new SearchResultNavProcessor())).c(new v8r(new TBBuyNavProcessor())).c(new lpa(new H5NavProcess())).c(new bm2(new BrowserActivityProcessor())).c(new j7r(new i7r())).c(new v2b(new u2b()));
    }

    public static gzm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("8ae72e38", new Object[0]);
        }
        return gzm.a(new ht8(new gt8())).c(new duq(new cuq())).c(new ydr(new xdr())).c(new bes(new aes())).c(new tpp(new ShopNavAdapter())).c(new thu(new TriverNavProcessor())).c(new wbj(new vbj())).c(new z0k(new y0k())).c(new MessageNavProcessorV2Node(new MessageNavProcessorV2())).c(new mki(new lki())).c(new eoj(new doj())).c(new jyj(new iyj())).c(new p8w(new o8w())).c(new rbv(new UltronTradeHybridNavProcessor())).c(new TBWXNavProcessorNode(new TBWXNavProcessor())).c(new ail(new zhl())).c(new ucl(new tcl())).c(new pdl(new odl())).c(new o1k(new n1k())).c(new ywl(new xwl())).c(new h0a(new FullPageNavProcessor())).c(new bma(new GuangGuangNavProcessor())).c(new g34(new f34())).c(new k34(new j34())).c(new d44(new c44())).c(new hyt(new gyt())).c(new tht(new sht())).c(new kms(new jms())).c(new mm2(new lm2())).c(new lxj(new kxj())).c(new kv4(new jv4())).c(new wc1(new vc1())).c(new ljh(new kjh())).c(new hts(new gts())).c(new xf7(new wf7())).c(new hxr(new gxr())).c(new gvg(new LiteCreatorNavProcessor())).c(new lje(new kje())).c(new bdr(new adr())).c(new l1i(new k1i())).c(new uxf(new txf())).c(new w7s(new v7s()));
    }

    public static gzm d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("f68f57af", new Object[0]);
        }
        return gzm.a(new gv6(new fv6())).c(new qnj(new pnj())).c(new rfq(new qfq()));
    }

    public static gzm e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("16fc56a0", new Object[0]);
        }
        return gzm.a(new ty3(new sy3())).c(new ma8(new ElasticScheduleProcessor())).c(new eem(new dem())).c(new mms(new lms())).c(new gnj(new fnj())).c(new moj(new loj())).c(new p96(new o96())).c(new uwh(new twh())).c(new ykx(new XRNativeProcessor())).c(new wqm(new PrefetchProcessor())).c(new DnsNavProcessorNode(new DnsNavProcessor()));
    }

    public static gzm f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("ff25b71b", new Object[0]);
        }
        return gzm.a(new c1k(new b1k())).c(new n0(new m0())).c(new ago(new zfo()));
    }

    public static gzm g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzm) ipChange.ipc$dispatch("f3cba449", new Object[0]);
        }
        return gzm.a(new wbj(new vbj()));
    }

    public static void h(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            i();
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b1c610", new Object[0]);
            return;
        }
        a(0);
        a(5);
        a(3);
        a(2);
        a(4);
        a(1);
    }
}

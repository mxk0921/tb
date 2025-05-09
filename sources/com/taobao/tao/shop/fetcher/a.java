package com.taobao.tao.shop.fetcher;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher;
import com.taobao.tao.shop.fetcher.adapter.TBSRDownloadAdapter;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import tb.cop;
import tb.fqp;
import tb.ivr;
import tb.jvr;
import tb.lvr;
import tb.mvr;
import tb.pvr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ivr f12774a;
    public final jvr b;
    public final TBSRDownloadAdapter c;
    public final Handler d = new Handler(lvr.b.getMainLooper());
    public final Context e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.shop.fetcher.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0725a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0725a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this).d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String n = a.b(a.this).n();
            String m = a.b(a.this).m();
            if (pvr.a(m) || pvr.a(n)) {
                mvr.d("[cache not update] : remote cdnUrl or remoteMd5 is empty");
            } else if (n.equals(a.a(a.this).b())) {
                mvr.c("[cache not update] : localMd5 equal to remoteMd5  , cache is up to date");
            } else {
                TBSRCacheData tBSRCacheData = (TBSRCacheData) a.c(a.this).a(m, n, TBSRCacheData.class);
                if (tBSRCacheData == null) {
                    mvr.b(new IllegalStateException("cache download error,  cdnUrl=" + m + "  md5=" + n), "[cache not update] : download new data error");
                } else if (!a.a(a.this).f(tBSRCacheData, n)) {
                    mvr.d("[cache not update] :  update cache failure ");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f12777a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(e eVar, String str, String str2) {
            this.f12777a = eVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!a.b(a.this).a()) {
                mvr.c("[cache consume] readCacheEnabled] : readCacheEnabled not open");
                a.d(a.this, this.f12777a, null);
            } else {
                String b = a.a(a.this).b();
                String n = a.b(a.this).n();
                if (b == null || !b.equals(n)) {
                    mvr.c("[cache consume] md5 not matched] : localMd5 is " + b);
                    z = false;
                } else {
                    z = true;
                }
                MtopTaobaoWirelessShopRouteProcessResponseData a2 = a.a(a.this).a(this.b, this.c, z, a.b(a.this).r());
                mvr.c("[cache consume] data] : data=" + a2);
                a.d(a.this, this.f12777a, a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f12778a;
        public final /* synthetic */ MtopTaobaoWirelessShopRouteProcessResponseData b;

        public d(e eVar, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
            this.f12778a = eVar;
            this.b = mtopTaobaoWirelessShopRouteProcessResponseData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((TBSRUrlProcessFetcher.b) this.f12778a).b(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e<DATA> {
    }

    static {
        t2o.a(668991525);
    }

    public a(Context context, ivr ivrVar, jvr jvrVar, TBSRDownloadAdapter tBSRDownloadAdapter) {
        this.e = context;
        this.f12774a = ivrVar;
        this.b = jvrVar;
        this.c = tBSRDownloadAdapter;
    }

    public static /* synthetic */ ivr a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivr) ipChange.ipc$dispatch("f08c33c1", new Object[]{aVar});
        }
        return aVar.f12774a;
    }

    public static /* synthetic */ jvr b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvr) ipChange.ipc$dispatch("43c8dfda", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ TBSRDownloadAdapter c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSRDownloadAdapter) ipChange.ipc$dispatch("9596bcff", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ void d(a aVar, e eVar, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94f84c", new Object[]{aVar, eVar, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else {
            aVar.h(eVar, mtopTaobaoWirelessShopRouteProcessResponseData);
        }
    }

    public void e(String str, String str2, e<MtopTaobaoWirelessShopRouteProcessResponseData> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b466fc0", new Object[]{this, str, str2, eVar});
        } else {
            fqp.a(new c(eVar, str, str2), "consumeCache");
        }
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("fa909829", new Object[]{this, str});
        }
        if (!this.b.C()) {
            return null;
        }
        return this.f12774a.c(str, this.b.r());
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4b7a8c", new Object[]{this});
        } else {
            fqp.a(new RunnableC0725a(), "loadMemoryCacheData");
        }
    }

    public final void h(e<MtopTaobaoWirelessShopRouteProcessResponseData> eVar, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b367db3", new Object[]{this, eVar, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else {
            this.d.post(new d(eVar, mtopTaobaoWirelessShopRouteProcessResponseData));
        }
    }

    public void i(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ef3a7", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            long r = this.b.r();
            if (mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
                r = this.b.s();
            }
            if (this.b.a()) {
                cop.Z(this.e).D0(str, str2, mtopTaobaoWirelessShopRouteProcessResponseData, r);
            }
            if (this.b.C()) {
                cop.Z(this.e).w(str, str2, mtopTaobaoWirelessShopRouteProcessResponseData);
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c95c40", new Object[]{this});
        } else {
            AsyncTask.execute(new b());
        }
    }
}

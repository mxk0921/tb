package com.taobao.search.jarvis.rcmd;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import com.taobao.android.searchbaseframe.xsl.refact.XslPageWidget;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.xsearchplugin.weex.weex.XSearchUtilModule;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.tao.Globals;
import tb.ay4;
import tb.cox;
import tb.f1p;
import tb.k4k;
import tb.o6p;
import tb.p6p;
import tb.t2o;
import tb.uee;
import tb.uin;
import tb.xvr;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchXslSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean INITED = false;
    private static final String LOG_TAG = "SearchXslSdk";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements XslModule.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public yko a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
            }
            if (uin.f29403a == null) {
                uin.a(Globals.getApplication());
            }
            return uin.f29403a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements XslModule.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(XslModule xslModule, XslDatasource xslDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("467a72e8", new Object[]{this, xslModule, xslDatasource});
            }
        }

        public void b(XslModule xslModule, uee ueeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d87936e", new Object[]{this, xslModule, ueeVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements XslModule.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements ay4<Context, PartnerRecyclerView> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            /* renamed from: b */
            public PartnerRecyclerView a(Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (PartnerRecyclerView) ipChange.ipc$dispatch("e5e41db3", new Object[]{this, context});
                }
                return new SearchChildRecyclerView(context);
            }
        }

        public XslDatasource a(XslModule xslModule, yko ykoVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (XslDatasource) ipChange.ipc$dispatch("cb423b67", new Object[]{this, xslModule, ykoVar, new Boolean(z)});
            }
            f1p.f();
            SearchXslDatasource searchXslDatasource = new SearchXslDatasource(ykoVar);
            if (z && xslModule != null) {
                cox coxVar = new cox();
                searchXslDatasource.setMetaMode();
                searchXslDatasource.setController(coxVar);
                coxVar.f8936a = searchXslDatasource;
            }
            return searchXslDatasource;
        }

        public uee b(XslModule xslModule, Activity activity, XslDatasource xslDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uee) ipChange.ipc$dispatch("2aad99c", new Object[]{this, xslModule, activity, xslDatasource});
            }
            if (xslDatasource != null) {
                XslDataSource xslDataSource = (XslDataSource) xslDatasource;
                cox controller = xslDataSource.getController();
                controller.f8936a = xslDataSource;
                controller.g0(xslModule);
                o6p o6pVar = new o6p(xslModule.getCore());
                o6pVar.r0(xslModule.m());
                if (xslModule.q()) {
                    o6pVar.R0(new a(this));
                }
                XslPageWidget xslPageWidget = new XslPageWidget(o6pVar, activity, xslModule, controller.t(), null, new k4k());
                xslPageWidget.attachToContainer();
                xslPageWidget.x2(controller);
                return xslPageWidget;
            }
            throw new IllegalStateException("Datasource is null in onCreatePageWidget");
        }
    }

    static {
        t2o.a(815792303);
    }

    public static synchronized void install() {
        synchronized (SearchXslSdk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb164a2", new Object[0]);
            } else if (!INITED) {
                MUSEngine.registerUINode(XslMUSComponent.COMPONENT_NAME, XslMUSComponent.class);
                MUSEngine.registerUINode("mus-xsearchlist", XslMUSComponent.class);
                XSearchUtilModule.install(new xvr());
                com.taobao.android.weex_ability.mtop.a.a().c(new p6p());
                XslModule.E(new a());
                XslModule.C(new b());
                XslModule.D(new c());
                INITED = true;
            }
        }
    }
}

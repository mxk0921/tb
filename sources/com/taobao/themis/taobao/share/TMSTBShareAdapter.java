package com.taobao.themis.taobao.share;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.jr;
import tb.k8s;
import tb.p8s;
import tb.r8s;
import tb.t2o;
import tb.uq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/taobao/share/TMSTBShareAdapter;", "Lcom/taobao/themis/kernel/adapter/IShareAdapter;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$b;", "shareConfig", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$a;", "shareListener", "Ltb/xhv;", "share", "(Landroid/content/Context;Lcom/taobao/themis/kernel/page/ITMSPage;Lcom/taobao/themis/kernel/adapter/IShareAdapter$b;Lcom/taobao/themis/kernel/adapter/IShareAdapter$a;)V", "Companion", "a", "themis_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBShareAdapter implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(847249540);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13774a;
        public final /* synthetic */ IShareAdapter.b b;
        public final /* synthetic */ TMSTBShareAdapter c;
        public final /* synthetic */ IShareAdapter.a d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements uq {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IShareAdapter.a f13775a;

            public a(IShareAdapter.a aVar) {
                this.f13775a = aVar;
            }

            @Override // tb.uq
            public void a(jr jrVar, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                    return;
                }
                String str = null;
                JSONObject a2 = jrVar == null ? null : jrVar.a();
                if (a2 != null) {
                    String str2 = "";
                    if (ckf.b(a2.get("type"), "onSuccess")) {
                        this.f13775a.onSuccess(str2);
                    } else if (ckf.b(a2.get("type"), "onFail")) {
                        IShareAdapter.a aVar = this.f13775a;
                        Object obj = a2.get("msg");
                        if (obj instanceof String) {
                            str = (String) obj;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                        aVar.onFail(str2);
                    } else if (ckf.b(a2.get("type"), "onCancel")) {
                        IShareAdapter.a aVar2 = this.f13775a;
                        Object obj2 = a2.get("msg");
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                        aVar2.onCancel(str2);
                    }
                    TMSLogger.f("TMS:DefaultShareAdapter", ckf.p("onCallback: ", a2));
                }
            }
        }

        public b(ITMSPage iTMSPage, IShareAdapter.b bVar, TMSTBShareAdapter tMSTBShareAdapter, IShareAdapter.a aVar) {
            this.f13774a = iTMSPage;
            this.b = bVar;
            this.c = tMSTBShareAdapter;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k8s j = k8s.j();
            bbs instance = this.f13774a.getInstance();
            JSONObject jSONObject = new JSONObject();
            IShareAdapter.b bVar = this.b;
            TMSTBShareAdapter tMSTBShareAdapter = this.c;
            ITMSPage iTMSPage = this.f13774a;
            jSONObject.put((JSONObject) PopConst.BRIDGE_KEY_BUSINESS_ID, bVar.a());
            String L = iTMSPage.getInstance().L();
            ckf.f(L, "page.getInstance().appId");
            jSONObject.put((JSONObject) "url", TMSTBShareAdapter.access$getShareUrl(tMSTBShareAdapter, bVar, L));
            String g = bVar.g();
            if (g == null) {
                g = r8s.f(iTMSPage.getInstance());
            }
            jSONObject.put((JSONObject) "title", g);
            String b = bVar.b();
            if (b == null) {
                b = r8s.b(iTMSPage.getInstance());
            }
            jSONObject.put((JSONObject) "desc", b);
            String d = bVar.d();
            if (d == null || d.length() == 0) {
                str = r8s.e(iTMSPage.getInstance());
            } else {
                str = bVar.d();
            }
            jSONObject.put((JSONObject) "imageURL", str);
            jSONObject.put((JSONObject) "templateParams", (String) bVar.f());
            jSONObject.put((JSONObject) "extendParams", (String) bVar.c());
            ArrayList<String> e = bVar.e();
            if (e != null) {
                jSONObject.put((JSONObject) "targets", (String) e);
            }
            xhv xhvVar = xhv.INSTANCE;
            j.d(instance, TMSCalendarBridge.namespace, null, null, "SharePannel", "open", jSONObject, new a(this.d));
        }
    }

    static {
        t2o.a(847249539);
        t2o.a(839909480);
    }

    public static final /* synthetic */ String access$getShareUrl(TMSTBShareAdapter tMSTBShareAdapter, IShareAdapter.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8642b4e2", new Object[]{tMSTBShareAdapter, bVar, str});
        }
        return tMSTBShareAdapter.a(bVar, str);
    }

    public final String a(IShareAdapter.b bVar, String str) {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c8ac74", new Object[]{this, bVar, str});
        }
        String h = bVar.h();
        if (TextUtils.isEmpty(h)) {
            return h;
        }
        Uri parse = Uri.parse(h);
        ckf.d(parse);
        Uri build = parse.buildUpon().appendQueryParameter("x_object_type", "miniapp").appendQueryParameter("x_miniapp_id", str).build();
        return (build == null || (uri = build.toString()) == null) ? "" : uri;
    }

    @Override // com.taobao.themis.kernel.adapter.IShareAdapter
    public void share(Context context, ITMSPage iTMSPage, IShareAdapter.b bVar, IShareAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52937f6e", new Object[]{this, context, iTMSPage, bVar, aVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(iTMSPage, "page");
        ckf.g(bVar, "shareConfig");
        ckf.g(aVar, "shareListener");
        if (!(context instanceof Activity)) {
            aVar.onFail("invalid context");
        } else {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new b(iTMSPage, bVar, this, aVar));
        }
    }
}

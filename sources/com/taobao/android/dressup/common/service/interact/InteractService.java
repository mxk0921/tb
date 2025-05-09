package com.taobao.android.dressup.common.service.interact;

import android.content.DialogInterface;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.PageModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.bgc;
import tb.bwc;
import tb.byb;
import tb.ckf;
import tb.d2e;
import tb.foc;
import tb.g1u;
import tb.j5o;
import tb.j7j;
import tb.jjx;
import tb.jl7;
import tb.jpu;
import tb.oj8;
import tb.qff;
import tb.qpu;
import tb.t2o;
import tb.tep;
import tb.tpd;
import tb.tpu;
import tb.u1a;
import tb.ud0;
import tb.v3i;
import tb.w1a;
import tb.wmc;
import tb.xhv;
import tb.xmo;
import tb.xz3;
import tb.yj4;
import tb.ysq;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class InteractService implements bgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f7567a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552755);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements foc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ foc f7568a;
        public final /* synthetic */ Runnable b;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                bVar.f7568a.a(bVar);
            }
        }

        public b(foc focVar, Runnable runnable) {
            this.f7568a = focVar;
            this.b = runnable;
        }

        @Override // tb.foc.a
        public void a(foc.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20fbe8ae", new Object[]{this, bVar});
                return;
            }
            ckf.g(bVar, "user");
            if (this.f7568a.isLogin()) {
                this.b.run();
            }
            zrt.Companion.b(new a());
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ u1a d;
        public final /* synthetic */ w1a e;

        public c(String str, String str2, u1a u1aVar, w1a w1aVar) {
            this.b = str;
            this.c = str2;
            this.d = u1aVar;
            this.e = w1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InteractService.x(InteractService.this, true, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ u1a d;
        public final /* synthetic */ w1a e;

        public d(String str, String str2, u1a u1aVar, w1a w1aVar) {
            this.b = str;
            this.c = str2;
            this.d = u1aVar;
            this.e = w1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                InteractService.x(InteractService.this, false, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(918552754);
        t2o.a(918552752);
    }

    public static final /* synthetic */ void B(InteractService interactService, String str, String str2, u1a u1aVar, w1a w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc8ba83", new Object[]{interactService, str, str2, u1aVar, w1aVar});
        } else {
            interactService.W0(str, str2, u1aVar, w1aVar);
        }
    }

    public static final /* synthetic */ qpu r(InteractService interactService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qpu) ipChange.ipc$dispatch("66260443", new Object[]{interactService});
        }
        qpu qpuVar = interactService.f7567a;
        if (qpuVar != null) {
            return qpuVar;
        }
        ckf.y("context");
        throw null;
    }

    public static final /* synthetic */ void x(InteractService interactService, boolean z, String str, String str2, u1a u1aVar, w1a w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17303187", new Object[]{interactService, new Boolean(z), str, str2, u1aVar, w1aVar});
        } else {
            interactService.U0(z, str, str2, u1aVar, w1aVar);
        }
    }

    @Override // tb.bgc
    public void K0(String str, qff qffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d1e180", new Object[]{this, str, qffVar});
            return;
        }
        ckf.g(str, "contentId");
        tpu.a.b(tpu.Companion, "InteractService", "collect contentId:".concat(str), null, 4, null);
        z0(true, str, qffVar);
    }

    public final void L(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8aef14", new Object[]{this, runnable});
            return;
        }
        tpu.a.b(tpu.Companion, "InteractService", "ensueLogin", null, 4, null);
        foc d2 = ud0.Companion.d();
        if (!d2.isLogin()) {
            d2.b(new b(d2, runnable));
            d2.login(false);
            return;
        }
        runnable.run();
    }

    public final Map<String, Object> M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b97ab1a0", new Object[]{this, str});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("contentId", str);
        qpu qpuVar = this.f7567a;
        if (qpuVar != null) {
            String o = qpuVar.a().o("itemIds");
            String str2 = "";
            if (o == null) {
                o = str2;
            }
            linkedHashMap.put("itemIds", o);
            qpu qpuVar2 = this.f7567a;
            if (qpuVar2 != null) {
                String o2 = qpuVar2.a().o("landingType");
                if (o2 != null) {
                    str2 = o2;
                }
                linkedHashMap.put("feedsType", str2);
                return kotlin.collections.a.j(jpu.a("features", JSON.toJSONString(linkedHashMap)), jpu.a("contentId", str));
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final void T0(String str, String str2, u1a<? super Map<String, ? extends Object>, ? super j7j, xhv> u1aVar, w1a<? super String, ? super String, ? super j7j, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7821e4", new Object[]{this, str, str2, u1aVar, w1aVar});
        } else {
            L(new c(str, str2, u1aVar, w1aVar));
        }
    }

    public final void U0(boolean z, String str, String str2, u1a<? super Map<String, ? extends Object>, ? super j7j, xhv> u1aVar, w1a<? super String, ? super String, ? super j7j, xhv> w1aVar) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dee262", new Object[]{this, new Boolean(z), str, str2, u1aVar, w1aVar});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "InteractService", "requestFollowMtop follow:" + z + " targetUserIdStr:" + str + " keyName:" + str2, null, 4, null);
        bwc e = ud0.Companion.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("originBiz", "guangguang");
        linkedHashMap.put("originPage", m0());
        linkedHashMap.put("originFlag", c0());
        linkedHashMap.put("targetUserIdStr", str);
        linkedHashMap.put("keyName", str2);
        if (z) {
            str3 = "mtop.taobao.social.follow.guang.add";
        } else {
            str3 = "mtop.taobao.social.follow.guang.remove";
        }
        e.a(new j5o.a(str3).b(linkedHashMap).a(), u1aVar, w1aVar);
    }

    public final void W0(String str, String str2, u1a<? super Map<String, ? extends Object>, ? super j7j, xhv> u1aVar, w1a<? super String, ? super String, ? super j7j, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344b048", new Object[]{this, str, str2, u1aVar, w1aVar});
        } else {
            L(new d(str, str2, u1aVar, w1aVar));
        }
    }

    public final String c0() {
        JSONObject originData;
        JSONObject jSONObject;
        JSONObject originData2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("966c4893", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qpu qpuVar = this.f7567a;
        String str = null;
        if (qpuVar != null) {
            linkedHashMap.put("spm-cnt", ((d2e) qpuVar.getService(d2e.class)).b());
            qpu qpuVar2 = this.f7567a;
            if (qpuVar2 != null) {
                linkedHashMap.put("spm-url", qpuVar2.a().o("spm"));
                qpu qpuVar3 = this.f7567a;
                if (qpuVar3 != null) {
                    linkedHashMap.put("pvid-url", qpuVar3.a().o(yj4.PARAM_PVID));
                    linkedHashMap.put(MspGlobalDefine.APP_KEY, "21646297");
                    qpu qpuVar4 = this.f7567a;
                    if (qpuVar4 != null) {
                        byb bybVar = (byb) qpuVar4.getService(byb.class);
                        Object s = bybVar.s();
                        if (!(s instanceof PageModel)) {
                            s = null;
                        }
                        PageModel pageModel = (PageModel) s;
                        linkedHashMap.put("content_id", (pageModel == null || (originData2 = pageModel.getOriginData()) == null || (jSONObject2 = originData2.getJSONObject("content")) == null) ? null : jSONObject2.getString("id"));
                        Object s2 = bybVar.s();
                        if (!(s2 instanceof PageModel)) {
                            s2 = null;
                        }
                        PageModel pageModel2 = (PageModel) s2;
                        if (!(pageModel2 == null || (originData = pageModel2.getOriginData()) == null || (jSONObject = originData.getJSONObject("utParams")) == null)) {
                            str = jSONObject.getString(yj4.PARAM_PVID);
                        }
                        linkedHashMap.put(yj4.PARAM_PVID, str);
                        String jSONString = JSON.toJSONString(linkedHashMap);
                        ckf.f(jSONString, "JSON.toJSONString(interactParam)");
                        return jSONString;
                    }
                    ckf.y("context");
                    throw null;
                }
                ckf.y("context");
                throw null;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final String m0() {
        JSONObject originData;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93fc133", new Object[]{this});
        }
        qpu qpuVar = this.f7567a;
        String str = null;
        if (qpuVar != null) {
            Object s = ((byb) qpuVar.getService(byb.class)).s();
            if (!(s instanceof PageModel)) {
                s = null;
            }
            PageModel pageModel = (PageModel) s;
            if (!(pageModel == null || (originData = pageModel.getOriginData()) == null || (jSONObject = originData.getJSONObject("interact")) == null)) {
                str = jSONObject.getString("interactPageName");
            }
            if (str == null || str.length() <= 0) {
                return "guangguang";
            }
            return str;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "InteractService", "onCreateService", null, 4, null);
        this.f7567a = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "InteractService", "onDestroyService", null, 4, null);
    }

    @Override // tb.bgc
    public void v1(String str, String str2, qff qffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e67638f", new Object[]{this, str, str2, qffVar});
            return;
        }
        ckf.g(str, "targetUserIdStr");
        ckf.g(str2, "keyName");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "InteractService", "follow targetUserIdStr:" + str + " keyName:" + str2, null, 4, null);
        T0(str, str2, new InteractService$follow$1(this, qffVar), new InteractService$follow$2(qffVar));
    }

    public final void z0(boolean z, String str, qff qffVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d62107", new Object[]{this, new Boolean(z), str, qffVar});
            return;
        }
        bwc e = ud0.Companion.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String jSONString = JSON.toJSONString(M(str));
        ckf.f(jSONString, "JSON.toJSONString(getCollectParams(contentId))");
        linkedHashMap.put("request", jSONString);
        if (z) {
            str2 = "mtop.taobao.lightapp.daydress.wish.add";
        } else {
            str2 = "mtop.taobao.lightapp.daydress.wish.remove";
        }
        e.a(new j5o.a(str2).b(linkedHashMap).a(), new InteractService$requestCollectMtop$1(qffVar), new InteractService$requestCollectMtop$2(qffVar));
    }

    @Override // tb.bgc
    public void j1(String str, qff qffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5529c1d9", new Object[]{this, str, qffVar});
            return;
        }
        ckf.g(str, "contentId");
        tpu.a.b(tpu.Companion, "InteractService", "uncollect contentId:".concat(str), null, 4, null);
        z0(false, str, qffVar);
    }

    @Override // tb.bgc
    public void U() {
        String str;
        String str2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a1cce6", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "InteractService", "share", null, 4, null);
        qpu qpuVar = this.f7567a;
        if (qpuVar != null) {
            Object s = ((byb) qpuVar.getService(byb.class)).s();
            if (!(s instanceof PageModel)) {
                s = null;
            }
            PageModel pageModel = (PageModel) s;
            JSONObject originData = pageModel != null ? pageModel.getOriginData() : null;
            JSONObject jSONObject2 = originData != null ? originData.getJSONObject("content") : null;
            JSONObject jSONObject3 = originData != null ? originData.getJSONObject("interact") : null;
            JSONObject jSONObject4 = originData != null ? originData.getJSONObject(LoginConstant.ACCOUNT) : null;
            if ((jSONObject2 != null ? jSONObject2.getString("title") : null) == null) {
                str = "快速来手淘逛逛哦～";
            } else if (jSONObject2.getString("title").length() > 15) {
                String string = jSONObject2.getString("title");
                ckf.f(string, "content.getString(\"title\")");
                str = ysq.X0(string, 15).concat("...");
            } else {
                str = jSONObject2.getString("title");
            }
            if (jSONObject3 == null || (str2 = jSONObject3.getString("shareNamespace")) == null) {
                str2 = "guangguang";
            }
            String string2 = (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray(tep.KEY_UNIFORM_RESULT)) == null || (jSONObject = jSONArray.getJSONObject(0)) == null) ? null : jSONObject.getString(xmo.SP_KEY_MAIN_PIC_URL);
            Map j = kotlin.collections.a.j(jpu.a("businessId", str2), jpu.a("shareScene", ""), jpu.a("title", str), jpu.a("text", str), jpu.a("image", string2), jpu.a("url", jSONObject2 != null ? jSONObject2.getString("rawDetailUrl") : null), jpu.a("desc", str), jpu.a("templateParams", kotlin.collections.a.j(jpu.a("images", xz3.e(string2)), jpu.a("headImg", jSONObject4 != null ? jSONObject4.getString("avatarUrl") : null), jpu.a("title", jSONObject2 != null ? jSONObject2.getString("title") : null), jpu.a("userNick", jSONObject4 != null ? jSONObject4.getString("accountNick") : null))));
            Map f = v3i.f(jpu.a(jjx.ZZB_BUNDLE_KEY, kotlin.collections.a.j(jpu.a("from", "postPage"), jpu.a("subjectId", jSONObject2 != null ? jSONObject2.getString("id") : null), jpu.a("subjectType", "POST_ID"))));
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put((JSONObject) oj8.SHARE_CONTENT_KEY, (String) j);
            jSONObject5.put((JSONObject) "reportArgs", (String) f);
            qpu qpuVar2 = this.f7567a;
            if (qpuVar2 != null) {
                tpd.a.a((tpd) qpuVar2.getService(tpd.class), jSONObject5, null, 2, null);
            } else {
                ckf.y("context");
                throw null;
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }

    @Override // tb.bgc
    public void f0(final String str, final String str2, final qff qffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7832056", new Object[]{this, str, str2, qffVar});
            return;
        }
        ckf.g(str, "targetUserIdStr");
        ckf.g(str2, "keyName");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "InteractService", "unfollow targetUserIdStr:" + str + " keyName:" + str2, null, 4, null);
        jl7.a aVar2 = jl7.Companion;
        qpu qpuVar = this.f7567a;
        if (qpuVar != null) {
            jl7.a.b(aVar2, qpuVar.getContext(), null, "确认不再关注?", "确认", wmc.CANCEL, true, new DialogInterface.OnClickListener() { // from class: com.taobao.android.dressup.common.service.interact.InteractService$unfollow$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "<anonymous parameter 0>", "Ltb/j7j;", "<anonymous parameter 1>", "Ltb/xhv;", "invoke", "(Ljava/util/Map;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
                /* renamed from: com.taobao.android.dressup.common.service.interact.InteractService$unfollow$1$1  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                public static final class AnonymousClass1 extends Lambda implements u1a<Map<String, ? extends Object>, j7j, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public AnonymousClass1() {
                        super(2);
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/interact/InteractService$unfollow$1$1");
                    }

                    @Override // tb.u1a
                    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, j7j j7jVar) {
                        invoke2(map, j7jVar);
                        return xhv.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map, j7j j7jVar) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("245731b4", new Object[]{this, map, j7jVar});
                            return;
                        }
                        ckf.g(map, "<anonymous parameter 0>");
                        ckf.g(j7jVar, "<anonymous parameter 1>");
                        qff qffVar = qffVar;
                        if (qffVar != null) {
                            qffVar.onSuccess();
                        }
                        g1u.Companion.a(InteractService.r(InteractService.this).getContext(), "取消关注成功");
                    }
                }

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "errorCode", "<anonymous parameter 1>", "Ltb/j7j;", "<anonymous parameter 2>", "Ltb/xhv;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
                /* renamed from: com.taobao.android.dressup.common.service.interact.InteractService$unfollow$1$2  reason: invalid class name */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
                public static final class AnonymousClass2 extends Lambda implements w1a<String, String, j7j, xhv> {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public AnonymousClass2() {
                        super(3);
                    }

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/interact/InteractService$unfollow$1$2");
                    }

                    @Override // tb.w1a
                    public /* bridge */ /* synthetic */ xhv invoke(String str, String str2, j7j j7jVar) {
                        invoke2(str, str2, j7jVar);
                        return xhv.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(String str, String str2, j7j j7jVar) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("a4b63ba7", new Object[]{this, str, str2, j7jVar});
                            return;
                        }
                        ckf.g(str, "errorCode");
                        ckf.g(str2, "<anonymous parameter 1>");
                        ckf.g(j7jVar, "<anonymous parameter 2>");
                        qff qffVar = qffVar;
                        if (qffVar != null) {
                            qffVar.onFail(str);
                        }
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        InteractService.B(InteractService.this, str, str2, new AnonymousClass1(), new AnonymousClass2());
                    }
                }
            }, null, null, 256, null);
        } else {
            ckf.y("context");
            throw null;
        }
    }
}

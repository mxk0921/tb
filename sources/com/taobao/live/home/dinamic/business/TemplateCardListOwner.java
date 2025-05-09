package com.taobao.live.home.dinamic.business;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.j5h;
import tb.moh;
import tb.nwg;
import tb.ot1;
import tb.qyg;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FULL = 1;
    public static final int REQUEST = 2;

    /* renamed from: a  reason: collision with root package name */
    public static List<TemplateObject> f10951a = new ArrayList();
    public static List<TemplateObject> b = new ArrayList();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface LoadTemplateMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateRequest f10952a;
        public final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, TemplateRequest templateRequest, e eVar) {
            super(str);
            this.f10952a = templateRequest;
            this.b = eVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/business/TemplateCardListOwner$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            List<TemplateObject> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r0h.b("TemplateCardListOwner", "loadTemplateFromFile 1");
            Object b = nwg.b(TemplateCardListOwner.b(TemplateCardListOwner.this, this.f10952a));
            if (b instanceof String) {
                try {
                    list = TemplateCardListOwner.this.u((String) b);
                } catch (Exception unused) {
                    list = null;
                }
                if (!j5h.b(list)) {
                    TemplateCardListOwner.c(list);
                    r0h.b("TemplateCardListOwner", "loadTemplateFromFile 1");
                    qyg.c().h("com.taobao.live.home.template_list_ready");
                    e eVar = this.b;
                    if (eVar != null) {
                        ((d) eVar).b(list);
                        return;
                    }
                    return;
                }
            }
            r0h.b("TemplateCardListOwner", "dxTemplate localCache fail");
            e eVar2 = this.b;
            if (eVar2 != null) {
                ((d) eVar2).a("No file cache");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateRequest f10953a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, TemplateRequest templateRequest, String str2) {
            super(str);
            this.f10953a = templateRequest;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/business/TemplateCardListOwner$3");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nwg.d(TemplateCardListOwner.b(TemplateCardListOwner.this, this.f10953a), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/business/TemplateCardListOwner$4");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TemplateCardListOwner templateCardListOwner = TemplateCardListOwner.this;
                TemplateCardListOwner.f(templateCardListOwner.t(templateCardListOwner.m()));
            } catch (Exception e) {
                r0h.c("TemplateCardListOwner", "loadBailoutTemplateInternal parse template list exp.", e);
            }
            r0h.b("TemplateCardListOwner", "loadBailoutTemplateInternal 2");
            if (j5h.b(TemplateCardListOwner.e())) {
                r0h.b("TemplateCardListOwner", "load bailout template list error.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final e f10955a;
        public final TemplateRequest b;
        public final int c;

        static {
            t2o.a(806355406);
            t2o.a(806355408);
        }

        public d(TemplateRequest templateRequest, int i, e eVar) {
            this.b = templateRequest;
            this.f10955a = eVar;
            this.c = i;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            e eVar = this.f10955a;
            if (eVar != null) {
                ((d) eVar).a(str);
            }
            TemplateCardListOwner.a(TemplateCardListOwner.this, this.b, this.f10955a);
        }

        public void b(List<TemplateObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1c36a9c", new Object[]{this, list});
                return;
            }
            e eVar = this.f10955a;
            if (eVar != null) {
                ((d) eVar).b(list);
            }
            if (this.c != 2) {
                TemplateCardListOwner.a(TemplateCardListOwner.this, this.b, this.f10955a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
    }

    static {
        t2o.a(806355401);
    }

    public static /* synthetic */ void a(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4433d41", new Object[]{templateCardListOwner, templateRequest, eVar});
        } else {
            templateCardListOwner.s(templateRequest, eVar);
        }
    }

    public static /* synthetic */ String b(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("581ef712", new Object[]{templateCardListOwner, templateRequest});
        }
        return templateCardListOwner.i(templateRequest);
    }

    public static /* synthetic */ List c(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2f3a18db", new Object[]{list});
        }
        f10951a = list;
        return list;
    }

    public static /* synthetic */ void d(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4734629a", new Object[]{templateCardListOwner, templateRequest, str});
        } else {
            templateCardListOwner.g(templateRequest, str);
        }
    }

    public static /* synthetic */ List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ List f(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1df5219", new Object[]{list});
        }
        b = list;
        return list;
    }

    public final void g(TemplateRequest templateRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bac242", new Object[]{this, templateRequest, str});
        } else {
            Coordinator.postTask(new b("cacheTemplate", templateRequest, str));
        }
    }

    public abstract TemplateRequest h();

    public final String i(TemplateRequest templateRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c1fa21e", new Object[]{this, templateRequest});
        }
        if (templateRequest != null) {
            return moh.a(templateRequest.toString());
        }
        return "";
    }

    public TemplateObject j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("edc3a633", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TemplateObject l = l(f10951a, str);
        if (l == null) {
            return l(b, str);
        }
        return l;
    }

    public List<TemplateObject> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa890d72", new Object[]{this});
        }
        return f10951a;
    }

    public final TemplateObject l(List<TemplateObject> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("7280f303", new Object[]{this, list, str});
        }
        if (j5h.b(list)) {
            return null;
        }
        for (TemplateObject templateObject : list) {
            if (j5h.a(str, templateObject.name)) {
                return templateObject;
            }
        }
        return null;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b3f9b9", new Object[]{this});
        }
        return null;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3391624", new Object[]{this});
            return;
        }
        r0h.b("TemplateCardListOwner", "loadBailoutTemplateInternal 0");
        if (!j5h.b(b)) {
            r0h.b("TemplateCardListOwner", "loadBailoutTemplateInternal 1");
        } else {
            Coordinator.postTask(new c("loadBailoutTemplate"));
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af717407", new Object[]{this});
        } else {
            q(1, null);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebd7fdc", new Object[]{this, new Integer(i)});
        } else {
            q(i, null);
        }
    }

    public final void r(TemplateRequest templateRequest, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3892aa2", new Object[]{this, templateRequest, eVar});
            return;
        }
        r0h.b("TemplateCardListOwner", "loadTemplateFromFile 0");
        Coordinator.postTask(new a("loadTemplate", templateRequest, eVar));
    }

    public final void s(final TemplateRequest templateRequest, final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbbddd18", new Object[]{this, templateRequest, eVar});
            return;
        }
        r0h.b("TemplateCardListOwner", "loadTemplateFromRemote 0");
        ot1 ot1Var = new ot1(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.business.TemplateCardListOwner.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str;
                e eVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder("dxTemplate Mtop response fail, onSystemError MtopResponse:");
                if (mtopResponse != null) {
                    str = mtopResponse.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                r0h.b("TemplateCardListOwner", sb.toString());
                if (mtopResponse != null && (eVar2 = eVar) != null) {
                    ((d) eVar2).a(mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                List<TemplateObject> list;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (!(mtopResponse == null || mtopResponse.getBytedata() == null)) {
                    String str = new String(mtopResponse.getBytedata());
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            list = TemplateCardListOwner.this.u(str);
                        } catch (Exception e2) {
                            r0h.c("TemplateCardListOwner", "dxTemplate Mtop response success, parse template list exp", e2);
                            list = null;
                        }
                        if (!j5h.b(list)) {
                            r0h.b("TemplateCardListOwner", "loadTemplateFromRemote 1");
                            TemplateCardListOwner.c(list);
                            r0h.d("TemplateCardListOwner", "dxTemplate Mtop response success: onSuccess " + mtopResponse.getApi());
                            qyg.c().h("com.taobao.live.home.template_list_ready");
                            e eVar2 = eVar;
                            if (eVar2 != null) {
                                ((d) eVar2).b(list);
                            }
                            TemplateCardListOwner.d(TemplateCardListOwner.this, templateRequest, str);
                            return;
                        }
                    }
                }
                e eVar3 = eVar;
                if (eVar3 != null) {
                    ((d) eVar3).a("Remote template load error");
                }
                r0h.b("TemplateCardListOwner", "dxTemplate Mtop response success: onSuccess errorMsg: Remote template load error");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str;
                e eVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder("dxTemplate Mtop response fail, onSystemError MtopResponse:");
                if (mtopResponse != null) {
                    str = mtopResponse.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                r0h.b("TemplateCardListOwner", sb.toString());
                if (mtopResponse != null && (eVar2 = eVar) != null) {
                    ((d) eVar2).a(mtopResponse.getRetMsg());
                }
            }
        });
        r0h.d("TemplateCardListOwner", "dxTemplate Mtop request start, requestInfo:" + templateRequest.toString());
        ot1Var.a(100, templateRequest, null);
    }

    public List<TemplateObject> t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc661325", new Object[]{this, str});
        }
        return u(str);
    }

    public abstract List<TemplateObject> u(String str);

    public void q(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6970910", new Object[]{this, new Integer(i), eVar});
            return;
        }
        n();
        TemplateRequest h = h();
        if (h == null) {
            r0h.b("TemplateCardListOwner", "TemplateRequest is Null");
            if (eVar != null) {
                ((d) eVar).a("TemplateRequest is Null");
            }
        } else if (!j5h.b(f10951a)) {
            r0h.d("TemplateCardListOwner", "loadTemplateFromMemory success");
            if (eVar != null) {
                ((d) eVar).b(f10951a);
            }
            if (i != 2) {
                s(h, eVar);
            }
        } else {
            r(h, new d(h, i, eVar));
        }
    }
}

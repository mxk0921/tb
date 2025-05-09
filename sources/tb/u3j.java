package tb;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.mytaobao.pagev2.architecture.MtbDxViewHolder;
import com.taobao.mytaobao.pagev2.architecture.MtbWeexViewHolder;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u3j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29112a;
    public static final a Companion = new a(null);
    public static final String b = b;
    public static final String b = b;
    public static final String c = c;
    public static final String c = c;
    public static final String d = d;
    public static final String d = d;
    public static final String e = e;
    public static final String e = e;
    public static final String f = f;
    public static final String f = f;
    public static final String g = g;
    public static final String g = g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: tb.u3j$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class RunnableC1065a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ dbo f29113a;

            public RunnableC1065a(dbo dboVar) {
                this.f29113a = dboVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f29113a.c()) {
                    AppMonitor.Alarm.commitSuccess(u3j.b(), u3j.e(), null);
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "nullItem", this.f29113a.a());
                    TLog.loge("mtbMainLink", "【error】数据合法性监测不通过, errorCode=" + this.f29113a.a());
                    AppMonitor.Alarm.commitFail(u3j.b(), u3j.e(), jSONObject.toJSONString(), null, null);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f29114a;
            public final /* synthetic */ long b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;

            public b(String str, long j, String str2, String str3) {
                this.f29114a = str;
                this.b = j;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "mtop", this.f29114a);
                jSONObject.put((JSONObject) "time", (String) Long.valueOf(this.b));
                AppMonitor.Alarm.commitFail(u3j.b(), u3j.f(), jSONObject.toJSONString(), this.c, this.d);
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f29115a;
            public final /* synthetic */ long b;

            public c(String str, long j) {
                this.f29115a = str;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "mtop", this.f29115a);
                jSONObject.put((JSONObject) "time", (String) Long.valueOf(this.b));
                AppMonitor.Alarm.commitSuccess(u3j.b(), u3j.f(), jSONObject.toJSONString());
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f29116a;

            public d(String str) {
                this.f29116a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Uri parse = Uri.parse(this.f29116a);
                    ckf.c(parse, "Uri.parse(url)");
                    String path = parse.getPath();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "path", path);
                    AppMonitor.Counter.commit(u3j.b(), u3j.g(), jSONObject.toJSONString(), 1.0d);
                } catch (Throwable unused) {
                }
            }
        }

        static {
            t2o.a(745537963);
        }

        public a() {
        }

        public final void a(dbo dboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baabbcf", new Object[]{this, dboVar});
                return;
            }
            ckf.h(dboVar, "isDataComplete");
            p3j.e(new RunnableC1065a(dboVar));
        }

        public final void b(String str, long j, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8faf3346", new Object[]{this, str, new Long(j), str2, str3});
                return;
            }
            ckf.h(str, "api");
            ckf.h(str2, "errorCode");
            ckf.h(str3, "errorMsg");
            p3j.e(new b(str, j, str2, str3));
        }

        public final void c(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfcd917", new Object[]{this, str, new Long(j)});
                return;
            }
            ckf.h(str, "api");
            p3j.e(new c(str, j));
        }

        public final void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce86a8d5", new Object[]{this, str});
                return;
            }
            ckf.h(str, "url");
            p3j.e(new d(str));
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f29117a;

        public b(List list) {
            this.f29117a = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : this.f29117a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "module", str);
                TLog.loge("mtbMainLink", "【error】模块cell高度为零上报 moduleName=" + str);
                AppMonitor.Counter.commit(u3j.b(), u3j.d(), jSONObject.toJSONString(), 1.0d);
            }
        }
    }

    public static final /* synthetic */ boolean a(u3j u3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df9d521", new Object[]{u3jVar})).booleanValue();
        }
        return u3jVar.f29112a;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adadd2b0", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e238ded7", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84d42b92", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f0f4911", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ed78f6", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("584b5a76", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ dbo h(u3j u3jVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbo) ipChange.ipc$dispatch("7ecdaee4", new Object[]{u3jVar, recyclerView});
        }
        return u3jVar.j(recyclerView);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f29112a = true;
        }
    }

    public final void k(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8144d0", new Object[]{this, list});
        } else {
            p3j.e(new b(list));
        }
    }

    public final void l(MtbBizProxyV2 mtbBizProxyV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4942110", new Object[]{this, mtbBizProxyV2});
            return;
        }
        ckf.h(mtbBizProxyV2, "mtbBizProxyV2");
        c cVar = new c(mtbBizProxyV2);
        View rootView = mtbBizProxyV2.getRootView();
        if (rootView != null) {
            rootView.postDelayed(cVar, 3000L);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MtbBizProxyV2 b;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ dbo f29119a;

            public a(dbo dboVar) {
                this.f29119a = dboVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f29119a.c()) {
                    AppMonitor.Alarm.commitSuccess(u3j.b(), u3j.c(), null);
                } else {
                    String a2 = this.f29119a.a();
                    String str = "null";
                    if (a2 == null) {
                        a2 = str;
                    }
                    String b = this.f29119a.b();
                    if (b != null) {
                        str = b;
                    }
                    AppMonitor.Alarm.commitFail(u3j.b(), u3j.c(), null, a2, str);
                    TLog.loge("mtbMainLink", "【error】上报白屏 errorCode=" + a2 + " errorMsg=" + str);
                }
            }
        }

        public c(MtbBizProxyV2 mtbBizProxyV2) {
            this.b = mtbBizProxyV2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!u3j.a(u3j.this) && this.b.m().isVisible()) {
                    MTPtrRecyclerView l = this.b.l();
                    if (l == null || l.isShown()) {
                        View rootView = this.b.getRootView();
                        if (rootView != null && rootView.isAttachedToWindow()) {
                            z = true;
                        }
                        TLog.loge("mtbMainLink", "白屏监测开始, isAttachedToWindow=" + z);
                        if (z) {
                            p3j.e(new a(u3j.h(u3j.this, this.b.l())));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final dbo j(RecyclerView recyclerView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbo) ipChange.ipc$dispatch("6e23e81d", new Object[]{this, recyclerView});
        }
        if (recyclerView == null) {
            return new dbo(false, "rv未创建", "rv未创建");
        }
        if (!recyclerView.isShown()) {
            return new dbo(false, "rv不可见", "rv不可见");
        }
        if (recyclerView.getChildCount() <= 0) {
            return new dbo(false, "rv内容空", "rv内容空");
        }
        ArrayList arrayList = new ArrayList();
        List<RecyclerView.ViewHolder> findVisibleViewHolderList = ExtentionFunctionKt.findVisibleViewHolderList(recyclerView);
        if (findVisibleViewHolderList.isEmpty()) {
            return new dbo(false, "rv可见VH空", "rv可见VH空");
        }
        boolean z = false;
        for (RecyclerView.ViewHolder viewHolder : findVisibleViewHolderList) {
            if (viewHolder instanceof MtbDxViewHolder) {
                h3j e0 = ((MtbDxViewHolder) viewHolder).e0();
                if (e0 == null || (str = e0.f()) == null) {
                    str = "unknownDx";
                }
            } else if (viewHolder instanceof MtbWeexViewHolder) {
                str = ((MtbWeexViewHolder) viewHolder).g0();
                if (str == null) {
                    str = "unknownWeex";
                }
            } else {
                str = "unknown";
            }
            View view = viewHolder.itemView;
            ckf.c(view, "itemVH.itemView");
            if (view.getHeight() > 0) {
                z = true;
            } else {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            k(arrayList);
        }
        if (z) {
            return new dbo(true, null, null);
        }
        return new dbo(false, "rvCell均零高", "rvCell均零高,visibleVHListSize=" + findVisibleViewHolderList.size());
    }

    static {
        t2o.a(745537962);
    }
}

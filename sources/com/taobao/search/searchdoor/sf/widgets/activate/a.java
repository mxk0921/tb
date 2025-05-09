package com.taobao.search.searchdoor.sf.widgets.activate;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.b3p;
import tb.b4p;
import tb.eb7;
import tb.hk4;
import tb.i5p;
import tb.m4p;
import tb.mt3;
import tb.o4p;
import tb.sen;
import tb.t0p;
import tb.t2o;
import tb.u0p;
import tb.vzo;
import tb.xpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY = "historycache";
    public static final String HISTORY_GROUP = "nt_history";
    public static final int MAX_HISTORY_SIZE = 10;
    public static String e;

    /* renamed from: a  reason: collision with root package name */
    public volatile List<ActivateBean> f11657a;
    public volatile boolean b;
    public final g c;
    public final String d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.searchdoor.sf.widgets.activate.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0656a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String c;

        public C0656a(String str) {
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(C0656a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/SearchHistoryManager$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                a.a(a.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/SearchHistoryManager$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                b3p.a(a.b(a.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements hk4<m4p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void accept(m4p m4pVar) throws Exception {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d045bb", new Object[]{this, m4pVar});
                return;
            }
            if (m4pVar.f23773a) {
                str = "DeleteHistorySuccess";
            } else {
                str = "DeleteHistoryFail";
            }
            sen.e(str);
            a.c(a.this).onHistoryDeleted(a.this.o());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.searchdoor.sf.widgets.activate.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0657a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ List c;

            public C0657a(List list) {
                this.c = list;
            }

            public static /* synthetic */ Object ipc$super(C0657a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/SearchHistoryManager$4$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                a.f(a.this, this.c);
                a.c(a.this).onHistoryUpdated(a.this.o());
                a.g(a.this, false);
            }
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/SearchHistoryManager$4");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            List d = a.d(a.this);
            if (d == null) {
                d = new ArrayList();
            }
            new Handler(Looper.getMainLooper()).post(new C0657a(d));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/SearchHistoryManager$5");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (a.e(a.this) != null) {
                boolean d = t0p.d(a.b(a.this), a.e(a.this));
                b4p.g("SearchHistoryManager", "删除本地单条历史：" + d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements hk4<m4p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(a aVar) {
        }

        /* renamed from: a */
        public void accept(m4p m4pVar) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d045bb", new Object[]{this, m4pVar});
                return;
            }
            b4p.g("SearchHistoryManager", "删除云端单条历史：" + m4pVar.f23773a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface g {
        void onHistoryDeleted(HistoryCellBean historyCellBean);

        void onHistoryUpdated(HistoryCellBean historyCellBean);
    }

    static {
        t2o.a(815793164);
    }

    public a(g gVar) {
        this(gVar, null);
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76f10ae", new Object[]{aVar, str});
        } else {
            aVar.h(str);
        }
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b64be17d", new Object[]{aVar});
        }
        return aVar.n();
    }

    public static /* synthetic */ g c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c00cab06", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ List d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f4e0b66", new Object[]{aVar});
        }
        return aVar.s();
    }

    public static /* synthetic */ List e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74f967e7", new Object[]{aVar});
        }
        return aVar.f11657a;
    }

    public static /* synthetic */ List f(a aVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72a9c858", new Object[]{aVar, list});
        }
        aVar.f11657a = list;
        return list;
    }

    public static /* synthetic */ boolean g(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa7fbb", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[0]);
        }
        String nick = Login.getNick();
        if (nick == null) {
            return "";
        }
        return nick;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb176bb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Coordinator.execute(new C0656a(str));
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0101d8", new Object[]{this});
            return;
        }
        this.f11657a = new ArrayList();
        Coordinator.execute(new b());
        new i5p.c().c(new mt3()).a().d().j().n(new c(), new u0p("clear_history"));
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66b68fb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            new i5p.c().c(new eb7(str)).a().d().n(new f(this), new u0p("delete_cloud_history"));
        }
    }

    public void l(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a8ff5e", new Object[]{this, activateBean});
            return;
        }
        if (this.f11657a != null) {
            this.f11657a.remove(activateBean);
            u();
        }
        if (!TextUtils.isEmpty(activateBean.keyword)) {
            k(activateBean.keyword);
        }
        this.c.onHistoryDeleted(o());
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0695adc", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (this.f11657a != null) {
                int size = this.f11657a.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (TextUtils.equals(this.f11657a.get(size).keyword, str)) {
                        this.f11657a.remove(size);
                        break;
                    } else {
                        size--;
                    }
                }
                u();
            }
            k(str);
            this.c.onHistoryDeleted(o());
        }
    }

    public final String n() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        String q = q();
        if (!TextUtils.isEmpty(this.d)) {
            str = "historycache_" + this.d;
        } else {
            str = CACHE_KEY;
        }
        if (TextUtils.isEmpty(q)) {
            return str;
        }
        return str + "_" + vzo.o(q);
    }

    public HistoryCellBean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryCellBean) ipChange.ipc$dispatch("76717876", new Object[]{this});
        }
        HistoryCellBean historyCellBean = new HistoryCellBean();
        historyCellBean.name = Localization.q(R.string.taobao_app_1005_1_16659);
        historyCellBean.type = "nt_history";
        historyCellBean.activateItems = p();
        return historyCellBean;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea850fe0", new Object[]{this});
        } else if (this.b) {
            b4p.a("SearchHistoryManager", "local history is loading");
        } else {
            this.b = true;
            Coordinator.execute(new d());
        }
    }

    public final List<ActivateBean> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b173f72", new Object[]{this});
        }
        try {
            String c2 = t0p.c(n());
            if (!TextUtils.isEmpty(c2)) {
                return JSON.parseArray(c2, ActivateBean.class);
            }
            return null;
        } catch (Exception e2) {
            b4p.p("SearchHistoryManager", "解析持久化历史数据失败", e2);
            return null;
        }
    }

    public List<ActivateBean> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e49a2ccd", new Object[]{this});
        }
        this.f11657a = s();
        if (this.f11657a == null) {
            this.f11657a = new ArrayList();
        }
        return this.f11657a;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dceef550", new Object[]{this});
        } else {
            Coordinator.execute(new e());
        }
    }

    public a(g gVar, String str) {
        this.b = false;
        this.c = gVar;
        this.d = str;
    }

    public final void h(String str) {
        List<ActivateBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74bdfa99", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            if (this.f11657a == null) {
                list = s();
            } else {
                list = this.f11657a;
            }
            HashSet hashSet = new HashSet();
            ActivateBean activateBean = new ActivateBean();
            activateBean.keyword = str;
            activateBean.groupType = "nt_history";
            arrayList.add(activateBean);
            hashSet.add(str);
            int G = o4p.G(10);
            if (list != null) {
                int i = 1;
                for (ActivateBean activateBean2 : list) {
                    if (i >= G) {
                        break;
                    } else if (activateBean2 != null && !hashSet.contains(activateBean2.keyword)) {
                        arrayList.add(activateBean2);
                        hashSet.add(activateBean2.keyword);
                        i++;
                    }
                }
            }
            this.f11657a = arrayList;
            boolean d2 = t0p.d(n(), arrayList);
            b4p.g("SearchHistoryManager", "新增搜索词，持久化：" + d2);
        }
    }

    public final List<ActivateBean> p() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("56839b44", new Object[]{this});
        }
        String q = q();
        if (!q.equals(e)) {
            this.f11657a = null;
            e = q;
        }
        if (this.f11657a == null) {
            r();
        }
        StringBuilder sb = new StringBuilder("获取已有历史数据：");
        if (this.f11657a != null) {
            z = true;
        }
        sb.append(z);
        b4p.g("SearchHistoryManager", sb.toString());
        return this.f11657a;
    }
}

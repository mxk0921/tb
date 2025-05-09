package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.roman.model.RomanPage;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.c8x;
import tb.d8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dal implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile String b;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, List<RomanPage>> f17680a = new HashMap();
    public String c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends TypeReference<Map<String, List<RomanPage>>> {
        public a(dal dalVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f17681a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ List c;
        public final /* synthetic */ double d;

        public b(Map map, Map map2, List list, double d) {
            this.f17681a = map;
            this.b = map2;
            this.c = list;
            this.d = d;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (Map.Entry entry : this.f17681a.entrySet()) {
                Map map = this.b;
                if (map != null) {
                    list = (List) map.get(entry.getKey());
                } else {
                    list = null;
                }
                if (this.c.contains(entry.getKey())) {
                    for (RomanPage romanPage : (List) entry.getValue()) {
                        if (romanPage != null && (list == null || !list.contains(romanPage))) {
                            if (this.d >= romanPage.getSversion() && !gxh.o().d(romanPage.getPageUrl())) {
                                dal.a(dal.this, (String) entry.getKey(), romanPage.getPageUrl(), romanPage.getVersion());
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f17682a;
        public final /* synthetic */ String b;

        public c(List list, String str) {
            this.f17682a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : this.f17682a) {
                try {
                    c4p.n("RomanOrangeMatcher", "preload: " + str);
                    bpl<String, Integer> e = dal.this.e(str, this.b);
                    if (e != null) {
                        String str2 = e.f16534a;
                        int intValue = e.b.intValue();
                        if (!gxh.o().d(str2)) {
                            dal.a(dal.this, str, str2, intValue);
                        }
                    }
                } catch (Exception e2) {
                    c4p.n("RomanOrangeMatcher", "preload exception: " + e2.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements c8x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17683a;
        public final /* synthetic */ int b;

        public d(dal dalVar, String str, int i) {
            this.f17683a = str;
            this.b = i;
        }

        @Override // tb.c8x.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            c4p.n("RomanOrangeMatcher", "onFailed: subCode=" + str + ", errorMsg=" + str2);
            sfo.a(this.f17683a, this.b, str, str2);
        }

        @Override // tb.c8x.a
        public void b(c8x.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("300d70d8", new Object[]{this, cVar});
            } else if (cVar != null) {
                c4p.n("RomanOrangeMatcher", "onSuccess: path=" + ((d8x.c) cVar).a());
                sfo.b(this.f17683a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends TypeReference<Map<String, List<RomanPage>>> {
        public e(dal dalVar) {
        }
    }

    static {
        t2o.a(993001931);
        t2o.a(613416995);
    }

    public dal() {
        OrangeConfig.getInstance().registerListener(new String[]{"search_roman_page"}, this, true);
    }

    public static /* synthetic */ void a(dal dalVar, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e259d0cd", new Object[]{dalVar, str, str2, new Integer(i)});
        } else {
            dalVar.b(str, str2, i);
        }
    }

    public final void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d2b166", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        c4p.n("RomanOrangeMatcher", "downloadTemplate: pageKey=" + str + ", pageUrl=" + str2 + ", templateVersion=" + i);
        com.taobao.android.weex.b.c().a(new c8x.b(str2), new d(this, str, i));
    }

    public bpl<String, Integer> e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpl) ipChange.ipc$dispatch("8ff4b28c", new Object[]{this, str, str2});
        }
        if (this.f17680a.isEmpty()) {
            c4p.D("RomanOrangeMatcher", "config is empty, try to load config from cache", new Object[0]);
            d();
        }
        List<RomanPage> list = this.f17680a.get(str);
        if (list != null && !list.isEmpty()) {
            double parseDouble = Double.parseDouble(str2);
            for (RomanPage romanPage : list) {
                if (romanPage.getSversion() <= parseDouble) {
                    return bpl.a(romanPage.getPageUrl(), Integer.valueOf(romanPage.getVersion()));
                }
            }
        }
        return null;
    }

    public final void f(Map<String, List<RomanPage>> map, Map<String, List<RomanPage>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a466d7", new Object[]{this, map, map2});
            return;
        }
        List<String> c2 = p4p.c();
        if (c2.isEmpty()) {
            c4p.n("RomanOrangeMatcher", "preloadBizList is empty");
            return;
        }
        yko g = j3p.g();
        if (g != null && g.g() != null) {
            VExecutors.defaultSharedThreadPool().submit(new b(map, map2, c2, Double.parseDouble(g.g().a())));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1fec53", new Object[]{this});
            return;
        }
        List<String> c2 = p4p.c();
        if (c2.isEmpty()) {
            c4p.n("RomanOrangeMatcher", "preloadBizList is empty");
            return;
        }
        yko g = j3p.g();
        if (g != null && g.g() != null) {
            VExecutors.defaultSharedThreadPool().submit(new c(c2, g.g().a()));
        }
    }

    public final SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        return Globals.getApplication().getSharedPreferences("roman_orange_cache", 0);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        String str2 = map.get("configVersion");
        if (!TextUtils.equals(str2, this.b)) {
            String customConfig = OrangeConfig.getInstance().getCustomConfig("search_roman_page", "");
            c4p.n("RomanOrangeMatcher", "onConfigUpdate: config=" + customConfig);
            if (!TextUtils.isEmpty(customConfig)) {
                Map<String, List<RomanPage>> map2 = this.f17680a;
                try {
                    this.f17680a = (Map) JSON.parseObject(customConfig, new a(this), new Feature[0]);
                    this.b = str2;
                } catch (Throwable unused) {
                }
                SharedPreferences c2 = c();
                if (this.c == null) {
                    this.c = c2.getString("cacheVersion", "");
                }
                if (!TextUtils.equals(this.b, this.c)) {
                    c2.edit().putString("cacheVersion", this.b).putString("cacheContent", customConfig).apply();
                    this.c = this.b;
                }
                try {
                    if (p4p.a()) {
                        g();
                    } else {
                        f(this.f17680a, map2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1f6309", new Object[]{this});
            return;
        }
        SharedPreferences c2 = c();
        String string = c2.getString("cacheVersion", "");
        this.c = string;
        if (!TextUtils.isEmpty(string)) {
            String string2 = c2.getString("cacheContent", "");
            if (!TextUtils.isEmpty(string2)) {
                try {
                    this.f17680a = (Map) JSON.parseObject(string2, new e(this), new Feature[0]);
                } catch (Throwable th) {
                    c4p.C("RomanOrangeMatcher", "load orange cache failed, error msg is %s", th.getMessage());
                }
            }
        }
    }
}

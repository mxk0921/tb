package tb;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.a;
import com.taobao.android.tracker.util.TrackerType;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o65 extends k65 implements k4c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "pageName";
    public static final String PAGE_URL = "url";
    public static final String SPM_A = "spmA";
    public static final String SPM_B = "spmB";
    public static final int TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY = -1091012;
    public final Map<String, a.c> b = new HashMap();
    public final Set<String> d = new HashSet();
    public final Map<String, bll> e = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final pob f25158a = new p65();
    public final n65 c = new n65(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25159a;

        public a(String str) {
            this.f25159a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o65.c(o65.this, this.f25159a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25160a;

        public b(String str) {
            this.f25160a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                o65.c(o65.this, this.f25160a);
            }
        }
    }

    static {
        t2o.a(455082020);
        t2o.a(962593296);
    }

    public static /* synthetic */ void c(o65 o65Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52628fa0", new Object[]{o65Var, str});
        } else {
            o65Var.m(str);
        }
    }

    public static /* synthetic */ Object ipc$super(o65 o65Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tracker/manager/DTWeexManager");
    }

    @Override // tb.k65
    public void a(gpb gpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0faac", new Object[]{this, gpbVar});
            return;
        }
        pob pobVar = this.f25158a;
        if (pobVar != null) {
            ((p65) pobVar).e();
            ((p65) this.f25158a).l(gpbVar);
        }
    }

    @Override // tb.k65
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57043f57", new Object[]{this})).booleanValue();
        }
        pob pobVar = this.f25158a;
        if (pobVar != null) {
            return ((p65) pobVar).i();
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df1ead2a", new Object[]{this})).booleanValue();
        }
        pob pobVar = this.f25158a;
        if (pobVar == null || !((p65) pobVar).f()) {
            return false;
        }
        return true;
    }

    public final boolean e(String str) {
        bll i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ff891a", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (i = i(str)) != null && i.w()) {
            return true;
        }
        return false;
    }

    public final boolean f(String str) {
        bll i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b853fd2", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && d() && (i = i(str)) != null && i.d()) {
            return true;
        }
        return false;
    }

    public final Map<String, String> g(String str, View view, String str2) {
        bll i;
        acu j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ec6cf90", new Object[]{this, str, view, str2});
        }
        if (TextUtils.isEmpty(str)) {
            str = e9x.a(view);
        }
        String c = x22.c(str);
        if (!TextUtils.isEmpty(c) && (i = i(c)) != null && i.v() && (j = j(i, str, view, TrackerType.TrackerType_Exposure)) != null) {
            return x22.d(j.g, j.j);
        }
        return null;
    }

    @Override // tb.k65
    public Map<String, String> getExposureViewProperties(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
        }
        x22.a();
        Map<String, String> g = g(str, view, "spm");
        if (!(g == null || view == null)) {
            view.setTag(-1091011, Boolean.TRUE);
        }
        return g;
    }

    @Override // tb.k65
    public vp8 getExposureViewTag(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vp8) ipChange.ipc$dispatch("77c81b6a", new Object[]{this, str, view});
        }
        if (TextUtils.isEmpty(str)) {
            str = e9x.a(view);
        }
        String c = x22.c(str);
        vp8 vp8Var = null;
        if (!TextUtils.isEmpty(c)) {
            bll i = i(c);
            if (i == null) {
                return null;
            }
            if (!(i.y() || view == null || view.getTag(-1091011) == null)) {
                Object tag = view.getTag(-1091011);
                if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                    return null;
                }
            }
            acu j = j(i, c, view, TrackerType.TrackerType_Exposure);
            if (j == null) {
                return null;
            }
            vp8Var = ecu.e(j);
            if (e(c)) {
                String str2 = vp8Var.block;
                if (!((HashSet) this.d).contains(str2)) {
                    UTAnalytics.getInstance().getDefaultTracker().setCommitImmediatelyExposureBlock(str2);
                    ((HashSet) this.d).add(str2);
                }
            }
        }
        return vp8Var;
    }

    public final a.c h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("c4de3d81", new Object[]{this, str});
        }
        Map<String, a.c> map = this.b;
        if (map == null || !((HashMap) map).containsKey(str)) {
            return null;
        }
        return (a.c) ((HashMap) this.b).get(str);
    }

    public bll i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bll) ipChange.ipc$dispatch("824b7ac9", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return (bll) ((LinkedHashMap) this.e).get(str);
        }
        return null;
    }

    @Override // tb.k65
    public boolean isExposureView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str = e9x.a(view);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String c = x22.c(str);
        if (!l(c)) {
            return false;
        }
        boolean f = f(c);
        view.setTag(TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY, Boolean.valueOf(f));
        return e9x.k(str, view, f);
    }

    public acu j(bll bllVar, String str, View view, TrackerType trackerType) {
        acu n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (acu) ipChange.ipc$dispatch("f97af51a", new Object[]{this, bllVar, str, view, trackerType});
        }
        if ((bllVar == null || view == null || bllVar.v()) && (n = bllVar.n(view, str, trackerType)) != null && ecu.a(trackerType, n.k)) {
            return n;
        }
        return null;
    }

    public final void k() {
        Map.Entry entry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c344fe9f", new Object[]{this});
            return;
        }
        Map<String, bll> map = this.e;
        if (map != null && map.size() >= 5 && (entry = (Map.Entry) ((LinkedHashMap) this.e).entrySet().iterator().next()) != null && entry.getKey() != null) {
            this.e.remove(entry.getKey());
        }
    }

    public final boolean l(String str) {
        bll i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb4e0f51", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (i = i(str)) != null && i.x()) {
            return true;
        }
        return false;
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a31a3a2", new Object[]{this, str});
            return;
        }
        a.c h = h(str);
        if (h != null) {
            h.a(str);
            n(str);
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825863dd", new Object[]{this, str});
            return;
        }
        Map<String, a.c> map = this.b;
        if (map != null && ((HashMap) map).containsKey(str)) {
            ((HashMap) this.b).remove(str);
        }
    }

    public void o(String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b73d77", new Object[]{this, str, cVar});
        } else if (!TextUtils.isEmpty(str) && cVar != null) {
            String c = x22.c(str);
            if (!TextUtils.isEmpty(c)) {
                ((HashMap) this.b).put(c, cVar);
            }
        }
    }

    @Override // tb.k4c
    public void onExposureDataCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c8a743", new Object[]{this});
        } else {
            ((HashSet) this.d).clear();
        }
    }

    public void p(String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa14d1c", new Object[]{this, str, cVar});
        } else if (!TextUtils.isEmpty(str) && cVar != null) {
            String c = x22.c(str);
            if (!TextUtils.isEmpty(c)) {
                bll i = i(c);
                if (i == null || !i.v() || !i.x()) {
                    ((HashMap) this.b).put(c, cVar);
                    return;
                }
                ((HashMap) this.b).put(c, cVar);
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    m(c);
                } else {
                    this.c.post(new a(c));
                }
            }
        }
    }

    public void q(Message message) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1329f58", new Object[]{this, message});
        } else if (message != null && (obj = message.obj) != null) {
            String c = x22.c(obj.toString());
            if (!TextUtils.isEmpty(c)) {
                n(c);
            }
        }
    }

    public void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c861b96", new Object[]{this, map});
        } else if (map != null && map.containsKey("url")) {
            String c = x22.c(map.get("url"));
            if (!TextUtils.isEmpty(c)) {
                bll i = i(c);
                if (i != null) {
                    i.S(map);
                } else {
                    new bll().S(map);
                }
            }
        }
    }

    public final boolean s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de16d17", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (i(str) != null) {
                this.e.remove(str);
            }
            bll bllVar = new bll();
            bllVar.r();
            bllVar.R(str2);
            if (bllVar.x()) {
                k();
                this.e.put(str, bllVar);
                return true;
            }
        }
        return false;
    }

    public void t(Message message) {
        boolean s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb19b11c", new Object[]{this, message});
        } else if (b() && message != null && message.getData() != null) {
            String string = message.getData().getString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID);
            String string2 = message.getData().getString("page_config");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                String c = x22.c(string);
                if (!TextUtils.isEmpty(c) && (s = s(c, string2))) {
                    if (Looper.getMainLooper().getThread() != Thread.currentThread() || !s) {
                        this.c.post(new b(c));
                    } else {
                        m(c);
                    }
                }
            }
        }
    }
}

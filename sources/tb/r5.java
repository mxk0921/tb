package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.searchdoor.ai.AIHistoryBean;
import com.taobao.search.searchdoor.sf.widgets.activate.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class r5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r5 INSTANCE = new r5();

    /* renamed from: a  reason: collision with root package name */
    public static final int f27107a = o4p.F();
    public static final ArrayList<AIHistoryBean> b = new ArrayList<>();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final ExecutorService d;
    public static boolean e;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        t2o.a(815793043);
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new qqt() { // from class: tb.b96
            @Override // tb.qqt
            public final String newThreadName() {
                String r;
                r = r5.r();
                return r;
            }
        });
        ckf.f(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        d = newSingleThreadExecutor;
        if (newSingleThreadExecutor instanceof ThreadPoolExecutor) {
            threadPoolExecutor = (ThreadPoolExecutor) newSingleThreadExecutor;
        } else {
            threadPoolExecutor = null;
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    public static final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5084daa2", new Object[0]);
        }
        return "AISearchHistoryManager";
    }

    public static final void s(Observable observable, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65711bf9", new Object[]{observable, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
            if (jSONObject != null) {
                str = jSONObject.getString("delete");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                cca.INSTANCE.a("AISearchHistory", "delete", "");
                try {
                    final JSONArray parseArray = JSON.parseArray(str);
                    c.post(new Runnable() { // from class: tb.ga7
                        @Override // java.lang.Runnable
                        public final void run() {
                            r5.t(JSONArray.this);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        }
    }

    public static final void t(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6f87e", new Object[]{jSONArray});
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            r5 r5Var = INSTANCE;
            String string = jSONArray.getString(i);
            ckf.f(string, "getString(...)");
            r5Var.n(string);
        }
        r5 r5Var2 = INSTANCE;
        r5Var2.q();
        r5Var2.p();
    }

    public static final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289cf939", new Object[0]);
            return;
        }
        final List<AIHistoryBean> l = INSTANCE.l();
        if (l != null) {
            c.post(new Runnable() { // from class: tb.gh7
                @Override // java.lang.Runnable
                public final void run() {
                    r5.v(l);
                }
            });
        } else {
            c.post(new Runnable() { // from class: tb.tm7
                @Override // java.lang.Runnable
                public final void run() {
                    r5.w();
                }
            });
        }
    }

    public static final void v(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4464be9", new Object[]{list});
            return;
        }
        ckf.g(list, "$list");
        b.addAll(list);
        r5 r5Var = INSTANCE;
        r5Var.q();
        r5Var.p();
    }

    public static final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af4df54", new Object[0]);
            return;
        }
        r5 r5Var = INSTANCE;
        r5Var.q();
        r5Var.p();
    }

    public static final void x(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770d257d", new Object[]{arrayList});
            return;
        }
        ckf.g(arrayList, "$copy");
        String jSONString = JSON.toJSONString(arrayList);
        boolean e2 = t0p.e(INSTANCE.i(), jSONString);
        b4p.a("ai_history_tag", "saveHistoryToFile content " + jSONString + " result " + e2);
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        String q = a.q();
        if (TextUtils.isEmpty(q)) {
            return "ai_historycacheV1";
        }
        return "ai_historycacheV1_" + vzo.o(q);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!e) {
            e = true;
            k();
            cca.INSTANCE.d("AISearchHistory", new Observer() { // from class: tb.fa7
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    r5.s(observable, obj);
                }
            });
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b117f655", new Object[]{this});
        } else {
            d.execute(new Runnable() { // from class: tb.fh7
                @Override // java.lang.Runnable
                public final void run() {
                    r5.u();
                }
            });
        }
    }

    public final List<AIHistoryBean> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a6f675d6", new Object[]{this});
        }
        try {
            String c2 = t0p.c(i());
            b4p.a("ai_history_tag", "loadHistoryFromCache jsonStr " + c2);
            if (!TextUtils.isEmpty(c2)) {
                return JSON.parseArray(c2, AIHistoryBean.class);
            }
        } catch (Exception e2) {
            b4p.p("ai_history_tag", "解析持久化历史数据失败", e2);
        }
        return null;
    }

    public final void m(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b1077", new Object[]{this, str});
            return;
        }
        int i2 = -1;
        for (Object obj : b) {
            int i3 = i + 1;
            if (i >= 0) {
                if (ckf.b(((AIHistoryBean) obj).chatId, str)) {
                    i2 = i;
                }
                i = i3;
            } else {
                yz3.p();
                throw null;
            }
        }
        if (i2 >= 0) {
            b.remove(i2);
        }
    }

    public final void n(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df48ae01", new Object[]{this, str});
            return;
        }
        int i2 = -1;
        for (Object obj : b) {
            int i3 = i + 1;
            if (i >= 0) {
                if (ckf.b(((AIHistoryBean) obj).chatId, str)) {
                    i2 = i;
                }
                i = i3;
            } else {
                yz3.p();
                throw null;
            }
        }
        if (i2 >= 0) {
            b.remove(i2);
        }
    }

    public final void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5114b695", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "searchKeyword");
        ckf.g(str2, "chatId");
        ckf.g(str3, "sessionId");
        m(str2);
        q();
        p();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33844355", new Object[]{this});
            return;
        }
        final ArrayList arrayList = new ArrayList(b);
        d.execute(new Runnable() { // from class: tb.to6
            @Override // java.lang.Runnable
            public final void run() {
                r5.x(arrayList);
            }
        });
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249b841d", new Object[]{this});
            return;
        }
        cca ccaVar = cca.INSTANCE;
        String jSONString = JSON.toJSONString(b);
        ckf.f(jSONString, "toJSONString(...)");
        ccaVar.a("AISearchHistory", "queries", jSONString);
    }

    public final void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b90a218", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "searchKeyword");
        ckf.g(str2, "chatId");
        ckf.g(str3, "sessionId");
        m(str2);
        ArrayList<AIHistoryBean> arrayList = b;
        arrayList.add(0, new AIHistoryBean(str, str3, str2));
        int size = arrayList.size();
        int i = f27107a;
        if (size > i) {
            List v0 = i04.v0(arrayList, i);
            arrayList.clear();
            arrayList.addAll(v0);
        }
        q();
        p();
    }
}

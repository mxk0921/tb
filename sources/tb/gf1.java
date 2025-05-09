package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;
import tb.ef1;
import tb.je1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gf1 implements je1.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final je1 b;
    public Context d;
    public ArrayList<Integer> c = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, View> f19939a = new ConcurrentHashMap<>();

    static {
        t2o.a(301989905);
        t2o.a(301989902);
    }

    public gf1(Context context) {
        this.b = new je1(context);
        this.d = context;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TLog.logi("AsyncViewPreLoader", "destroy " + this.d + "; enableAsyncViewPreLoaderDestroyContext: " + i0r.b());
        f(this.f19939a.values());
        if (i0r.b() && (this.d instanceof Activity)) {
            this.d = null;
            this.b.c(null);
        }
    }

    public View c(Context context, int i, ef1.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e7ac686e", new Object[]{this, context, new Integer(i), aVar});
        }
        View view = null;
        try {
            if (this.f19939a.containsKey(Integer.valueOf(i))) {
                view = this.f19939a.remove(Integer.valueOf(i));
            }
            if (aVar != null && !this.f19939a.containsKey(Integer.valueOf(i)) && this.c.contains(Integer.valueOf(i))) {
                aVar.a(i);
            }
            if (view != null && (view.getContext() instanceof dew)) {
                ((dew) view.getContext()).a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            vm0.e("getAsyncCacheView", th.getMessage());
        }
        return view;
    }

    public final String d(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcc74d26", new Object[]{this, list});
        }
        if (this.d == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (Integer num : list) {
                sb.append(this.d.getResources().getResourceEntryName(num.intValue()));
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public void e(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9736c260", new Object[]{this, view, new Boolean(z), new Integer(i)});
        } else if (view != null) {
            try {
                if (this.d != null) {
                    rbb g = ck.g();
                    g.e("异步加载" + this.d.getResources().getResourceEntryName(i) + ResultCode.MSG_SUCCESS, ck.b.b().i("AURA/performance").a());
                }
                this.f19939a.put(Integer.valueOf(i), view);
            } catch (Throwable th) {
                th.printStackTrace();
                vm0.e("onInflateFinished", th.getMessage());
            }
        }
    }

    public final void f(Collection<View> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa67f93", new Object[]{this, collection});
            return;
        }
        for (View view : collection) {
            try {
                if (view.getContext() instanceof dew) {
                    ((dew) view.getContext()).a(this.d);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                vm0.e("asyncViewException", th.getMessage());
            }
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
            return;
        }
        TLog.logi("AsyncViewPreLoader", "updateContext " + context + "; enableAsyncViewPreLoaderDestroyContext: " + i0r.b());
        if (i0r.b() && this.d == null) {
            this.d = context;
            this.b.c(context);
        }
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a366816b", new Object[]{this, arrayList});
            return;
        }
        this.c = arrayList;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Iterator<Integer> it = this.c.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (!this.f19939a.containsKey(next)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            rbb g = ck.g();
            g.e("需要加载" + d(arrayList2), ck.b.b().i("AURA/performance").a());
            this.b.a(arrayList2, true, this);
        }
    }
}

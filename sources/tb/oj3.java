package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oj3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<TpChargeBean> f25420a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f25421a;

        public a(List list) {
            this.f25421a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                oj3.a(oj3.this, this.f25421a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                oj3.b(oj3.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(782237707);
        t2o.a(782237710);
    }

    public oj3() {
        f();
    }

    public static /* synthetic */ void a(oj3 oj3Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e55aa", new Object[]{oj3Var, list});
        } else {
            oj3Var.j(list);
        }
    }

    public static /* synthetic */ void b(oj3 oj3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e041d2ba", new Object[]{oj3Var});
        } else {
            oj3Var.g();
        }
    }

    public void c(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ba62d7", new Object[]{this, list});
        } else {
            ((CopyOnWriteArrayList) this.f25420a).addAll(list);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((CopyOnWriteArrayList) this.f25420a).clear();
        h();
    }

    public List<TpChargeBean> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b722a16", new Object[]{this});
        }
        return this.f25420a;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230620c3", new Object[]{this});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(new b());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3054b314", new Object[]{this});
            return;
        }
        String a2 = aul.a();
        if (!TextUtils.isEmpty(a2)) {
            String a3 = pc9.a(a2);
            if (!TextUtils.isEmpty(a3)) {
                ((CopyOnWriteArrayList) this.f25420a).addAll(JSON.parseArray(a3, TpChargeBean.class));
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f05e0c", new Object[]{this});
        } else {
            i(this.f25420a);
        }
    }

    public void i(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5952fd", new Object[]{this, list});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(new a(list));
        }
    }

    public final void j(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6171ac", new Object[]{this, list});
            return;
        }
        String a2 = aul.a();
        if (!TextUtils.isEmpty(a2)) {
            pc9.b(a2, JSON.toJSONString(list));
        }
    }
}

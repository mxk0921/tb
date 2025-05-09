package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h3q extends o5l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "dismissAndOpenUrl";
    public final pr0 k;
    public final Handler l = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f20398a;

        public a(b8v b8vVar) {
            this.f20398a = b8vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                h3q.C(h3q.this, this.f20398a);
            }
        }
    }

    static {
        t2o.a(442499138);
    }

    public h3q(pr0 pr0Var) {
        this.k = pr0Var;
    }

    public static /* synthetic */ void C(h3q h3qVar, b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b9d002", new Object[]{h3qVar, b8vVar});
        } else {
            h3qVar.D(b8vVar);
        }
    }

    public static /* synthetic */ Object ipc$super(h3q h3qVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/bizevent/SkuOpenUrlAndDismiss");
    }

    public final void D(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3782a6d", new Object[]{this, b8vVar});
        } else {
            super.t(b8vVar);
        }
    }

    public final String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fc3e7ca", new Object[]{this});
        }
        if (j() == null || j().getFields() == null) {
            return null;
        }
        return j().getFields().getString("url");
    }

    @Override // tb.o5l, tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("SkuOpenUrlAndDismiss.handleEvent");
        }
        String E = E();
        if (E == null || !E.startsWith(PageTriggerService.PAGE_SCHEME)) {
            D(b8vVar);
        } else {
            this.l.postDelayed(new a(b8vVar), 20L);
        }
        if (this.k != null && !TextUtils.isEmpty(E)) {
            this.k.a();
        }
    }
}

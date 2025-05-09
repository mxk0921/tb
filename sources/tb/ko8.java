package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABMethod;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ko8 implements mk8<oo8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oo8 f22796a;

        public a(oo8 oo8Var) {
            this.f22796a = oo8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ko8.a(ko8.this, this.f22796a);
            }
        }
    }

    static {
        t2o.a(961544237);
        t2o.a(961544297);
    }

    public static /* synthetic */ void a(ko8 ko8Var, oo8 oo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97866b59", new Object[]{ko8Var, oo8Var});
        } else {
            ko8Var.b(oo8Var);
        }
    }

    public final void b(oo8 oo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683340e", new Object[]{this, oo8Var});
            return;
        }
        long b = yu7.f().b(oo8Var.file, oo8Var.fileMd5, oo8Var.version);
        if (b <= 0) {
            ogh.i("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务添加失败，任务ID：" + b);
        }
    }

    @Override // tb.mk8
    public void onEvent(bj8<oo8> bj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148a3e67", new Object[]{this, bj8Var});
            return;
        }
        ogh.e("ExperimentDataV5EventListener", "onEvent, eventContext=" + bj8Var.a());
        if (bj8Var.c() == null) {
            ogh.g("ExperimentDataV5EventListener", "【实验数据V5】数据内容为空，停止处理！");
            return;
        }
        oo8 c = bj8Var.c();
        if (c.version == n.j().e().n()) {
            ogh.i("ExperimentDataV5EventListener", "【实验数据V5】数据文件未发现新版本, 本地版本=" + n.j().e().n());
            return;
        }
        ogh.i("ExperimentDataV5EventListener", "【实验数据V5】数据文件发现新版本。最新版本=" + c.version + ", 本地版本=" + n.j().e().n());
        StringBuilder sb = new StringBuilder("");
        sb.append(bj8Var.a());
        ku0.b(ku0.EXPERIMENT_DATA_REACH_TYPE, sb.toString());
        try {
            if (n.j().c() != null && n.j().c() == UTABMethod.Push) {
                if (TextUtils.equals("accs_sync_grey", "" + bj8Var.a())) {
                    b(c);
                    return;
                }
                long O = n.j().a().O();
                if (!(O == 0 || n.j().e().n() == 0)) {
                    if (ydt.f(1002)) {
                        ogh.i("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务已等待执行，取消本次下载。");
                        return;
                    }
                    int k = wyv.k((int) O);
                    ogh.i("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务" + k + "毫秒后开始执行。");
                    ydt.c(1002, new a(c), (long) k);
                    return;
                }
                b(c);
                return;
            }
            b(c);
        } catch (Throwable th) {
            ku0.j("ExperimentDataV5EventListener.onEvent", th);
            b(c);
        }
    }
}

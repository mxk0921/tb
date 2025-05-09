package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nxj implements ubf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oxj f25017a;
    public dh7 b;
    public boolean c;

    static {
        t2o.a(352321867);
        t2o.a(438304807);
    }

    public nxj(oxj oxjVar, dh7 dh7Var) {
        this.f25017a = oxjVar;
        this.b = dh7Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver destroy " + b());
        this.f25017a = null;
        this.b = null;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b3925aa", new Object[]{this});
        }
        oxj oxjVar = this.f25017a;
        if (oxjVar != null) {
            return oxjVar.q();
        }
        return "NoWeexInstanceId";
    }

    public final boolean c(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb29fdd3", new Object[]{this, new Float(f)})).booleanValue();
        }
        dh7 dh7Var = this.b;
        if (dh7Var == null || dh7Var.P() == null) {
            f2 = 0.95f;
        } else {
            f2 = this.b.P().j().N().E();
        }
        if (f > f2) {
            return true;
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a578dc9e", new Object[]{this});
            return;
        }
        dh7 dh7Var = this.b;
        if (!(dh7Var == null || dh7Var.P() == null)) {
            this.b.P().x();
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideCreate " + b());
    }

    public void e() {
        ryj T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a8a5c6", new Object[]{this});
            return;
        }
        dh7 dh7Var = this.b;
        if (!(dh7Var == null || dh7Var.P() == null)) {
            this.b.P().t();
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideDestroy " + b());
        dh7 dh7Var2 = this.b;
        if (dh7Var2 != null && (T = dh7Var2.T()) != null) {
            T.l();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130a9b02", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsidePause " + b());
        k();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a8034f", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideResume " + b());
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b0236e", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStart " + b());
        dh7 dh7Var = this.b;
        if (dh7Var != null && dh7Var.P() != null && !TextUtils.isEmpty(this.b.P().j().N().C())) {
            txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStart " + b() + " >> resumeMedia");
            l();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5adb64", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_INSIDE_DETAIL, "NewDetailInsideLifecycleObserver onInsideStop " + b());
    }

    public final void k() {
        ListViewManager M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef88b115", new Object[]{this});
            return;
        }
        dh7 dh7Var = this.b;
        if (dh7Var != null && (M = dh7Var.M()) != null) {
            M.f0(false);
            this.c = true;
        }
    }

    public final void l() {
        ListViewManager M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86909cbe", new Object[]{this});
        } else if (this.c) {
            this.c = false;
            dh7 dh7Var = this.b;
            if (dh7Var != null && (M = dh7Var.M()) != null) {
                M.n0();
            }
        }
    }

    public void f(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f77c0", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        oxj oxjVar = this.f25017a;
        dh7 dh7Var = this.b;
        if (oxjVar == null || dh7Var == null) {
            txj.e(txj.TAG_INSIDE_DETAIL, "未知异常。当前 detailInstance 为空。是否界面已销毁？" + f + " curHeight = " + i + " id:" + b());
            return;
        }
        ryj T = dh7Var.T();
        ListViewManager M = dh7Var.M();
        if (T == null || M == null) {
            q0j.u(q0j.SCENE_INSIDE_DETAIL, q0j.ERROR_CODE_INSIDE_DETAIL_NO_FLOAT_ERROR, "onInsidePageScrolled ,floatManager or listViewManager is null.", null);
            txj.e(txj.TAG_INSIDE_DETAIL, "onInsidePageScrolled 小窗未创建。 floatManager 或 listViewManager 为 null . ");
            return;
        }
        try {
            if (c(f)) {
                if (!T.j()) {
                    T.r(false);
                    txj.e(txj.TAG_INSIDE_DETAIL, "小窗 展示 scrollPercent = " + f + " curHeight = " + i + " id:" + b());
                }
            } else if (T.j()) {
                T.p();
                txj.e(txj.TAG_INSIDE_DETAIL, "小窗 收起 scrollPercent = " + f + " curHeight = " + i + " id:" + b());
                M.o0();
            }
        } catch (Throwable th) {
            q0j.u(q0j.SCENE_INSIDE_DETAIL, q0j.ERROR_CODE_INSIDE_DETAIL_FLOAT_UNKNOWN_ERROR, "onInsidePageScrolled ,unknown error.", null);
            txj.f(txj.TAG_INSIDE_DETAIL, "未知异常。onInsidePageScrolled 半屏详情滚动出错。" + f + " curHeight = " + i + " id:" + b(), th);
        }
    }
}

package tb;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.HomepageFragment;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IHomeSubTabController f27235a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(IHomeSubTabController iHomeSubTabController, int i, int i2) {
            this.f27235a = iHomeSubTabController;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f27235a.scrollToPositionWithOffset(this.b, this.c);
            uqa.b("【Homepage_PageLifeCycle】", "onResume", "偏移量为 ：" + this.c + "当前位置为：" + this.b);
        }
    }

    static {
        t2o.a(729809281);
    }

    public static IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7c3a56ec", new Object[0]);
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            return null;
        }
        return iHomeControllerService.getCurrentSubTabController();
    }

    public static dqc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqc) ipChange.ipc$dispatch("39bcb153", new Object[0]);
        }
        IHomeSubTabController a2 = a();
        if (a2 == null) {
            uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，subTabController == null");
            return null;
        }
        ntd subTabParams = a2.getSubTabParams();
        if (subTabParams != null) {
            return subTabParams.a();
        }
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，subTabController == null");
        return null;
    }

    public static boolean c(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e89b5ca", new Object[]{fragment})).booleanValue();
        }
        return !(fragment instanceof HomepageFragment);
    }

    public static void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b304a048", new Object[]{new Integer(i), new Integer(i2)});
        } else if (i < 0) {
            uqa.b("【Homepage_PageLifeCycle】", "onResume", "出现异常，mCurrentFirstVisibleItemPosition < 0");
        } else {
            IHomeSubTabController a2 = a();
            if (a2 == null) {
                uqa.b("【Homepage_PageLifeCycle】", "onResume", "出现异常，subTabController == null");
            } else {
                new Handler(Looper.getMainLooper()).post(new a(a2, i, i2));
            }
        }
    }
}

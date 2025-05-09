package tb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ts9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f28930a = -2;
    public static int b;
    public static boolean c;

    static {
        t2o.a(729809256);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b5a164", new Object[0]);
        } else {
            d();
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df7e568", new Object[0]);
            return;
        }
        dqc b2 = rao.b();
        if (b2 == null) {
            uqa.b("【Homepage_PageLifeCycle】", "saveFoldDeviceCurrentCardInfo_fold", "出现异常，mainFeedsParams == null");
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "saveFoldDeviceCurrentCardInfoOnPause_fold", "foldDevice local save local ");
        f28930a = b2.a();
        b = b2.b();
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState_fold", "销毁时当前第一张卡片偏移量为：" + b + "销毁时当前第一张卡片位置为：" + f28930a);
    }

    public static void a(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a1a62b", new Object[]{fragment, bundle});
        } else if (!rao.c(fragment)) {
            if (bundle == null) {
                uqa.b("【Homepage_PageLifeCycle】", "onViewStateRestored_fold", "savedInstanceState == null");
            } else {
                c = true;
            }
        }
    }

    public static void c(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8bb07", new Object[]{fragment});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentResumed_fold", "onFragmentResumed");
        if (!rao.c(fragment)) {
            if (!c) {
                uqa.b("【Homepage_PageLifeCycle】", "onFragmentResumed_fold", "不需要恢复");
                return;
            }
            rao.d(f28930a, b);
            c = false;
        }
    }
}

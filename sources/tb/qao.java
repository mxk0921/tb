package tb;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qao {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer DEFAULT_POSITION;

    /* renamed from: a  reason: collision with root package name */
    public static int f26635a;
    public static int b;
    public static boolean c;

    static {
        t2o.a(729809280);
        Integer num = -2;
        DEFAULT_POSITION = num;
        f26635a = num.intValue();
    }

    public static void b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8bb07", new Object[]{fragment});
        } else if (!rao.c(fragment) && c) {
            rao.d(f26635a, b);
        }
    }

    public static void c(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca678205", new Object[]{fragment, bundle});
        } else if (!rao.c(fragment)) {
            c = false;
            e(bundle);
        }
    }

    public static void d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16d63df", new Object[]{bundle});
            return;
        }
        f26635a = bundle.getInt("currentFirstVisibleItemPosition");
        b = bundle.getInt("currentFirstVisibleItemOffset");
        uqa.b("【Homepage_PageLifeCycle】", "onViewStateRestored", "mCurrentFirstVisibleItemPosition: " + f26635a + "mCurrentFirstVisibleItemOffset: " + b);
    }

    public static void e(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74e766c", new Object[]{bundle});
            return;
        }
        dqc b2 = rao.b();
        if (b2 == null) {
            uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "出现异常，mainFeedsParams == null");
            return;
        }
        int a2 = b2.a();
        bundle.putInt("currentFirstVisibleItemPosition", a2);
        int b3 = b2.b();
        bundle.putInt("currentFirstVisibleItemOffset", b3);
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "销毁时当前第一张卡片偏移量为：" + b3 + "销毁时当前第一张卡片位置为：" + a2);
    }

    public static void a(Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a1a62b", new Object[]{fragment, bundle});
        } else if (!rao.c(fragment)) {
            if (bundle == null) {
                uqa.b("【Homepage_PageLifeCycle】", "onViewStateRestored", "savedInstanceState == null");
                return;
            }
            c = true;
            d(bundle);
        }
    }
}

package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.speed.TBSpeed;
import com.taobao.tao.tbmaincontroller.ATBMainController;
import com.taobao.tao.tbmaincontroller.BTBMainController;
import com.taobao.tao.tbmaincontroller.TBMainController;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f29538a = -1;

    static {
        t2o.a(775946356);
    }

    public static TBMainController b(FragmentActivity fragmentActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainController) ipChange.ipc$dispatch("608492e", new Object[]{fragmentActivity, bundle});
        }
        nx9.j(fragmentActivity);
        if (!TBDeviceUtils.p(fragmentActivity) && TBSpeed.isSpeedEdition(fragmentActivity, "use_bcontroller_without_downgrade")) {
            TBMainLog.tlog("TBMainController", "create BTBMainController without downgrade");
            return new BTBMainController(fragmentActivity);
        } else if (a(fragmentActivity, bundle)) {
            TBMainLog.tlog("TBMainController", "into close FragmentModel and create ATBMainController");
            return new ATBMainController(fragmentActivity);
        } else if (nx9.q(fragmentActivity)) {
            TBMainLog.tlog("TBMainController", "create BTBMainController");
            return new BTBMainController(fragmentActivity);
        } else if (nx9.r(fragmentActivity)) {
            TBMainLog.tlog("TBMainController", "create BTBMainController open by homepage");
            return new BTBMainController(fragmentActivity);
        } else {
            TBMainLog.tlog("TBMainController", "create ATBMainController");
            return new ATBMainController(fragmentActivity);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean a(FragmentActivity fragmentActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4337f2", new Object[]{fragmentActivity, bundle})).booleanValue();
        }
        SharedPreferences sharedPreferences = fragmentActivity.getSharedPreferences("tbmain_fragment_model", 0);
        if (sharedPreferences.getBoolean("lastSaveInstanceFragmentModelOpen", false)) {
            TBMainLog.tlog("TBMainController", "lastSaveInstanceFragmentModelOpen is true");
            if (!nx9.q(fragmentActivity) && bundle != null) {
                TBMainLog.tlog("TBMainController", "lastSaveInstanceFragmentModelOpen is true and this time fragment is close and saveInstanceState is not null");
            } else if (!nx9.q(fragmentActivity) && bundle == null) {
                TBMainLog.tlog("TBMainController", "FragmentSwitch isFragmentModelOpen is false");
                sharedPreferences.edit().putBoolean("lastSaveInstanceFragmentModelOpen", false).commit();
            }
            return false;
        } else if (bundle != null) {
            TBMainLog.tlog("TBMainController", "savedInstanceState is not null and lastSaveInstanceFragmentModelOpen is false, close Fragment Switch");
            nx9.e();
            nx9.d();
            return true;
        } else {
            boolean q = nx9.q(fragmentActivity);
            TBMainLog.tlog("TBMainController", "isFragmentModelOpen is " + q);
            sharedPreferences.edit().putBoolean("lastSaveInstanceFragmentModelOpen", q).commit();
            return false;
        }
    }

    public static boolean d(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffd0bfa7", new Object[]{activity, new Boolean(z)})).booleanValue();
        }
        View findViewById = activity.findViewById(R.id.tbTabFragment);
        if (findViewById == null) {
            TBMainLog.tlog("TBMainController", "showFullScreen failed, tab fragment is null");
            return false;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            TBMainLog.tlog("TBMainController", "showFullScreen failed, layoutParams is not instanceof FrameLayout LayoutParams");
            return false;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            int i = layoutParams2.bottomMargin;
            if (i == 0) {
                TBMainLog.tlog("TBMainController", "frameLayoutParam.bottomMargin is already 0");
                return true;
            }
            f29538a = i;
            layoutParams2.bottomMargin = 0;
        } else {
            int i2 = f29538a;
            if (i2 == -1) {
                TBMainLog.tlog("TBMainController", "showFullScreen failed, tbMainContentFragmentBottomMargin is invalid");
                return false;
            } else if (layoutParams2.bottomMargin == i2) {
                TBMainLog.tlog("TBMainController", "frameLayoutParam.bottomMargin is already eq tbMainContentFragmentBottomMargin");
                return true;
            } else {
                layoutParams2.bottomMargin = i2;
            }
        }
        findViewById.setLayoutParams(layoutParams2);
        TBMainLog.tlog("TBMainController", "setLayoutParams: " + layoutParams2.bottomMargin);
        return true;
    }
}

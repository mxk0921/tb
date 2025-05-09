package tb;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.uikit.animation.surface.TranslateSurfaceView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FRAGMENT_INTENT = "originActivityIntent";
    public static final String KEY_FRAGMENT_IS_FRAGMENT_MODEL = "isFragmentModel";
    public static final String KEY_FRAGMENT_NAV_START_TIME = "NAV_TO_URL_START_TIME";
    public static final String KEY_FRAGMENT_START_TIME = "NAV_START_FRAGMENT_TIME";
    public static final String KEY_FRAGMENT_URL = "originActivityUrl";

    static {
        t2o.a(775946361);
    }

    public static void a(SupportActivity supportActivity, SupportSecondaryBaseFragment supportSecondaryBaseFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942b8697", new Object[]{supportActivity, supportSecondaryBaseFragment});
        } else if (supportSecondaryBaseFragment.getAsyncAnimSwitchCache(supportActivity)) {
            TLog.loge("FragmentNavDelegate", "addAsyncAnimationView start");
            int i = R.id.tb_main_fragment_anim_view;
            if (((TranslateSurfaceView) supportActivity.findViewById(i)) == null) {
                TranslateSurfaceView translateSurfaceView = new TranslateSurfaceView(supportActivity);
                translateSurfaceView.setId(i);
                translateSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                translateSurfaceView.setIsKeyEventBlockerOpened(false);
                FrameLayout frameLayout = (FrameLayout) supportActivity.findViewById(R.id.tbFragment);
                if (frameLayout == null) {
                    TLog.loge("FragmentNavDelegate", "addAsyncAnimationView", "frameLayout is null");
                    return;
                } else {
                    translateSurfaceView.setAnimationRect(new Rect(frameLayout.getLeft(), frameLayout.getTop(), frameLayout.getRight(), frameLayout.getBottom()));
                    frameLayout.addView(translateSurfaceView);
                }
            }
            TLog.loge("FragmentNavDelegate", "addAsyncAnimationView end");
        }
    }

    public static boolean b(SupportActivity supportActivity, Intent intent, String str, Bundle bundle) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed00c6cb", new Object[]{supportActivity, intent, str, bundle})).booleanValue();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("originActivityIntent", intent);
        Uri data = intent.getData();
        if (data != null) {
            bundle2.putParcelable(KEY_FRAGMENT_URL, data);
        }
        bundle2.putLong("NAV_TO_URL_START_TIME", intent.getLongExtra("NAV_TO_URL_START_TIME", 0L));
        bundle2.putLong(KEY_FRAGMENT_START_TIME, System.currentTimeMillis());
        bundle2.putBoolean(KEY_FRAGMENT_IS_FRAGMENT_MODEL, true);
        if (bundle != null) {
            bundle2.putBundle(qxq.KEY_FRAGMENT_ARGS, bundle);
        }
        try {
            fragment = Fragment.instantiate(supportActivity, str, bundle2);
        } catch (Throwable unused) {
            TBMainLog.tlog("FragmentNavDelegate", "fragment instantiate failed , fragment name is " + str);
            har.a("fragment_nav_error", "fragment_instantiate_error_" + str);
            fragment = null;
        }
        if (fragment == null) {
            return false;
        }
        Intent intent2 = supportActivity.getIntent();
        if (intent2 != null) {
            TBMainLog.tlog("FragmentNavDelegate", "activity intent setData to " + data);
            intent2.setData(data);
        }
        if (fragment instanceof SupportSecondaryBaseFragment) {
            a(supportActivity, (SupportSecondaryBaseFragment) fragment);
        }
        supportActivity.start((ISupportFragment) fragment);
        TBMainLog.tlog("FragmentNavDelegate", "intercept by fragment processor and nav successed, fragment name is " + str);
        return true;
    }
}

package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.infoflow.core.utils.transition.BKTransitionPageSnapShotBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class peu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int A_TYPE_AFTER_BUY_DEFAULT = 5001;
    public static final int A_TYPE_IS_DEFAULT = -1;
    public static final int A_TYPE_LITE_DETAIL_IS_GUIDE_VIDEO = 4001;
    public static final int A_TYPE_LITE_DETAIL_IS_TU_WEN = 4002;
    public static final int A_TYPE_LIVE_TYPE_IS_ZHI_BO = 3001;
    public static final int A_TYPE_NEW_DETAIL = 1001;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26051a;
    public View b;
    public Drawable c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public BKTransitionPageSnapShotBinder o;
    public Bitmap.Config p;
    public int i = -1;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    static {
        t2o.a(486539761);
    }

    public static peu b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (peu) ipChange.ipc$dispatch("8fecf1e", new Object[]{new Integer(i)});
        }
        peu peuVar = new peu();
        peuVar.i = i;
        return peuVar;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2911d491", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public static Bundle a(peu peuVar, Nav nav, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("59ffd279", new Object[]{peuVar, nav, bundle});
        }
        if (!(peuVar == null || nav == null || !peuVar.f26051a)) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("extraEnableTransition", true);
            if (peuVar.g) {
                bundle.putBoolean("extraEnableTraNoData", true);
            }
            if (peuVar.h) {
                bundle.putBoolean("extraEnableTraStyleData", true);
            }
            View view = peuVar.b;
            if (view != null) {
                if (!peuVar.f) {
                    nav.withSharedElement(view);
                    bundle.putString("extraFrameAnimReason", "animSuccess-withSharedElement");
                } else if (mve.a("orange_key_enable_only_source_location", true)) {
                    nav.withSourceViewLocation(peuVar.b);
                    bundle.putString("extraFrameAnimReason", "animSuccess-withSourceViewLocation-running");
                } else {
                    fve.e("buildNavFromAnimParams", "withSharedElement . screenshotAsync false.");
                    nav.withSharedElement(peuVar.b, false);
                    bundle.putString("extraFrameAnimReason", "animSuccess-withSharedElement-running");
                }
            }
            if (peuVar.d) {
                nav.disableTransition();
            }
            Drawable drawable = peuVar.c;
            if (drawable != null) {
                nav.withSourceViewDrawable(drawable);
            }
            int i = peuVar.e;
            if (i > 0) {
                bundle.putFloat(bx0.PARAMS_KEY_ANIM_MAIN_IMAGE_VIEW_HEIGHT, i);
            }
            if (peuVar.k) {
                bundle.putBoolean("extraEnableDragBackAnim", true);
                if (peuVar.l) {
                    bundle.putBoolean("extraEnablePageSnapshot", true);
                }
                if (peuVar.n) {
                    bundle.putBoolean("extraPageForDecorView", true);
                }
                BKTransitionPageSnapShotBinder bKTransitionPageSnapShotBinder = peuVar.o;
                if (bKTransitionPageSnapShotBinder != null) {
                    bundle.putBinder("extraPageSnapshotBinder", bKTransitionPageSnapShotBinder);
                }
            }
            fve.e("buildNavFromAnimParams", "命中无极缩放跳转动画，默认导航动画已禁用。");
        }
        return bundle;
    }
}

package tb;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.common.view.WeexConsumeLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dtn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean g = null;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f18059a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        t2o.a(468714484);
    }

    public dtn(RecyclerView recyclerView) {
        this.f18059a = recyclerView;
        this.b = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a044fe0", new Object[0])).booleanValue();
        }
        if (g == null) {
            g = Boolean.valueOf(nwv.o(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableH5InterceptScroll", "true"), false));
        }
        tfs.e("TestConfig", "AB_fullscreen.web优化---enableH5InterceptScroll : " + g);
        return g.booleanValue();
    }

    public final boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfddb49c", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        for (int i = 0; i < this.f18059a.getChildCount(); i++) {
            View childAt = this.f18059a.getChildAt(i);
            if (childAt instanceof FscrmidFavorFrameLayout) {
                return ((FscrmidFavorFrameLayout) childAt).isTouchOnWebViewValidArea(motionEvent);
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c6bbdcf", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            if (i >= this.f18059a.getChildCount()) {
                z = true;
                break;
            }
            View childAt = this.f18059a.getChildAt(i);
            if (childAt instanceof WeexConsumeLayout) {
                WeexConsumeLayout weexConsumeLayout = (WeexConsumeLayout) childAt;
                if (!sj4.WEEX_STATE_CONSUME.equals(weexConsumeLayout.getWeexConsume())) {
                    z = false;
                    z3 = true;
                    break;
                }
                if (!weexConsumeLayout.isLockList()) {
                    z2 = false;
                }
                z3 = true;
            }
            i++;
        }
        if (!z3) {
            z = false;
        }
        return z && z2;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca458148", new Object[]{this, str});
            return;
        }
        for (int i = 0; i < this.f18059a.getChildCount(); i++) {
            View childAt = this.f18059a.getChildAt(i);
            if (childAt instanceof WeexConsumeLayout) {
                WeexConsumeLayout weexConsumeLayout = (WeexConsumeLayout) childAt;
                if (!sj4.WEEX_STATE_NOT_EXIST.equals(weexConsumeLayout.getWeexConsume())) {
                    weexConsumeLayout.setWeexConsume(str);
                    weexConsumeLayout.setAcceptGestureType(ied.PULL_INIT);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r5 != 5) goto L_0x00db;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dtn.d(android.view.MotionEvent):boolean");
    }
}

package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.bouncy.BouncyEdgeEffect;
import com.taobao.tao.flexbox.layoutmanager.component.bouncy.MyEdgeEffect;
import com.taobao.tao.flexbox.layoutmanager.component.bouncy.viewpager.ViewPagerOverScrollDecorAdapter;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bk2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316893);
    }

    public static void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358bf7da", new Object[]{view, new Boolean(z)});
        } else {
            b(view, z, false);
        }
    }

    public static void b(View view, boolean z, boolean z2) {
        DynamicAnimation.ViewProperty viewProperty;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf3b63a", new Object[]{view, new Boolean(z), new Boolean(z2)});
        } else if (Build.VERSION.SDK_INT > 29) {
        } else {
            if (view instanceof ViewPager) {
                new v5b(new ViewPagerOverScrollDecorAdapter((ViewPager) view));
                return;
            }
            SpringForce stiffness = new SpringForce().setFinalPosition(0.0f).setDampingRatio(1.0f).setStiffness(200.0f);
            if (z) {
                viewProperty = DynamicAnimation.TRANSLATION_Y;
            } else {
                viewProperty = DynamicAnimation.TRANSLATION_X;
            }
            SpringAnimation springAnimation = new SpringAnimation(view, viewProperty);
            springAnimation.setSpring(stiffness);
            BouncyEdgeEffect bouncyEdgeEffect = new BouncyEdgeEffect(view.getContext(), springAnimation, view, z ? 1 : 0, 0.5f, 0.5f);
            Context context = view.getContext();
            if (z) {
                i = 3;
            } else {
                i = 2;
            }
            BouncyEdgeEffect bouncyEdgeEffect2 = new BouncyEdgeEffect(context, springAnimation, view, i, 0.5f, 0.5f);
            if (view instanceof HorizontalScrollView) {
                ytn.f(HorizontalScrollView.class, "mEdgeGlowLeft", view, bouncyEdgeEffect);
                ytn.f(HorizontalScrollView.class, "mEdgeGlowRight", view, bouncyEdgeEffect2);
            } else if (view instanceof ScrollView) {
                ytn.f(ScrollView.class, "mEdgeGlowTop", view, bouncyEdgeEffect);
                ytn.f(ScrollView.class, "mEdgeGlowBottom", view, bouncyEdgeEffect2);
            } else if (view instanceof NestedScrollView) {
                ytn.f(NestedScrollView.class, "mEdgeGlowTop", view, bouncyEdgeEffect);
                ytn.f(NestedScrollView.class, "mEdgeGlowBottom", view, new MyEdgeEffect(view, view.getContext(), z2));
            } else if (!(view instanceof TNodeRecyclerView)) {
            } else {
                if (z) {
                    ytn.f(RecyclerView.class, "mTopGlow", view, bouncyEdgeEffect);
                    ytn.f(RecyclerView.class, "mBottomGlow", view, bouncyEdgeEffect2);
                    return;
                }
                ytn.f(RecyclerView.class, "mLeftGlow", view, bouncyEdgeEffect);
                ytn.f(RecyclerView.class, "mRightGlow", view, bouncyEdgeEffect2);
            }
        }
    }
}

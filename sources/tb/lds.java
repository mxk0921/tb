package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TabBarItem f23281a;
    public final Context b;
    public final boolean c;
    public View d;
    public ImageView e;
    public TextView f;

    static {
        t2o.a(839909703);
    }

    public lds(TabBarItem tabBarItem, Context context, boolean z) {
        ckf.g(tabBarItem, "tabItemModel");
        ckf.g(context, "context");
        this.f23281a = tabBarItem;
        this.b = context;
        this.c = z;
    }

    public final void a() {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b975b88", new Object[]{this});
            return;
        }
        this.e = new ImageView(this.b);
        String iconNormal = this.f23281a.getIconNormal();
        if (!(iconNormal == null || (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) == null)) {
            ImageView imageView = this.e;
            ckf.d(imageView);
            iImageAdapter.setImageUrl(imageView, iconNormal, null);
        }
        if (this.c) {
            this.d = this.e;
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.b);
        frameLayout.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
        this.d = frameLayout;
        String badgeText = this.f23281a.getBadgeText();
        if (badgeText != null) {
            e(badgeText);
        }
    }

    public final TabBarItem b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("d0d1081e", new Object[]{this});
        }
        return this.f23281a;
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.d == null) {
            a();
        }
        View view = this.d;
        ckf.d(view);
        return view;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f39345d7", new Object[]{this})).booleanValue();
        }
        this.f23281a.setBadgeText(null);
        TextView textView = this.f;
        if (textView != null) {
            ViewParent parent = textView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(textView);
            }
        }
        this.f = null;
        return true;
    }

    public final void f(boolean z) {
        String str;
        ImageView imageView;
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = this.f23281a.getIconSelected();
        } else {
            str = this.f23281a.getIconNormal();
        }
        if (str != null && (imageView = this.e) != null && (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
            iImageAdapter.setImageUrl(imageView, str, null);
        }
    }

    public final void g(TabBarItem tabBarItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e95436", new Object[]{this, tabBarItem});
            return;
        }
        ckf.g(tabBarItem, "tabBarItem");
        this.f23281a = tabBarItem;
    }

    public final boolean e(String str) {
        int i;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73680143", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "originalText");
        if (this.c || !(this.d instanceof FrameLayout)) {
            return false;
        }
        Object systemService = this.b.getSystemService("layout_inflater");
        FrameLayout frameLayout = null;
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater == null) {
            return false;
        }
        if (str.length() > 3) {
            str = "···";
        }
        Pair a2 = jpu.a(0, Integer.valueOf(R.layout.tms_tabbar_dot_badge));
        Pair a3 = jpu.a(1, Integer.valueOf(R.layout.tms_tabbar_single_word_badge));
        int i3 = R.layout.tms_tabbar_rounded_corner_badge;
        Integer num = (Integer) a.j(a2, a3, jpu.a(2, Integer.valueOf(i3)), jpu.a(3, Integer.valueOf(i3))).get(Integer.valueOf(str.length()));
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        d();
        this.f23281a.setBadgeText(str);
        View view = this.d;
        if (view != null) {
            TextView textView = (TextView) layoutInflater.inflate(intValue, (ViewGroup) view, false);
            this.f = textView;
            if (textView != null) {
                textView.setText(str);
            }
            int i4 = str.length() == 0 ? 38 : 29;
            if (str.length() != 0) {
                i2 = 0;
            }
            int i5 = str.length() == 0 ? 9 : 20;
            TextView textView2 = this.f;
            if (textView2 == null) {
                return false;
            }
            int length = str.length();
            if (length == 0) {
                i = xcs.a(this.b, 9.0f);
            } else if (length != 1) {
                textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                i = textView2.getMeasuredWidth();
            } else {
                i = xcs.a(this.b, 20.0f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, xcs.a(this.b, i5));
            layoutParams.leftMargin = xcs.a(this.b, i4);
            layoutParams.topMargin = xcs.a(this.b, i2);
            layoutParams.gravity = 48;
            View view2 = this.d;
            if (view2 instanceof FrameLayout) {
                frameLayout = (FrameLayout) view2;
            }
            if (frameLayout != null) {
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.addView(this.f, layoutParams);
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}

package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trade.uikit.feature.features.pullrefresh.CustomProgressBar;
import com.taobao.trade.uikit.feature.features.pullrefresh.RefreshHeadView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class oun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;

    /* renamed from: a  reason: collision with root package name */
    public final RefreshHeadView f25665a;
    public final TextView b;
    public final TextView c;
    public final CustomProgressBar d;
    public final int e;
    public final int f;
    public final int g;
    public final AnimationSet h;
    public String[] i;
    public boolean j = false;
    public int k = 0;

    static {
        t2o.a(724566093);
    }

    public oun(Context context, int i, View view, boolean z, int i2) {
        RefreshHeadView refreshHeadView = new RefreshHeadView(context, i, view, z);
        this.f25665a = refreshHeadView;
        this.c = refreshHeadView.getArrow();
        this.d = refreshHeadView.getProgressbar();
        this.b = refreshHeadView.getRefreshStateText();
        l(refreshHeadView);
        int measuredHeight = refreshHeadView.getMeasuredHeight();
        this.f = measuredHeight;
        int measuredWidth = refreshHeadView.getMeasuredWidth();
        this.e = measuredWidth;
        if (i2 == 1 || i2 == 2) {
            refreshHeadView.setPullDownDistance(measuredHeight);
        } else {
            refreshHeadView.setPullDownDistance(measuredWidth);
        }
        this.g = i2;
        if (i2 == 1) {
            refreshHeadView.setPadding(0, measuredHeight * (-1), 0, 0);
        } else if (i2 == 2) {
            refreshHeadView.setPadding(0, 0, 0, measuredHeight * (-1));
        } else if (i2 == 3) {
            refreshHeadView.setPadding(measuredWidth * (-1), 0, 0, 0);
        } else {
            refreshHeadView.setPadding(0, 0, measuredWidth * (-1), 0);
        }
        refreshHeadView.invalidate();
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        this.h = animationSet;
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(200L);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8212e1", new Object[]{this, new Integer(i)});
        } else {
            this.d.changeProgressBarState(i);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0bdcba6", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.f25665a.getPaddingBottom();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.f25665a.getPaddingLeft();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.f25665a.getPaddingRight();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.f25665a.getPaddingTop();
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f25665a;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5a750", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            View childAt = this.f25665a.getChildAt(1);
            if (childAt != null) {
                this.k = childAt.getMeasuredHeight();
            }
            this.f25665a.setPullDownDistance(this.k);
        }
    }

    public void l(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca053468", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        if (i2 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
    }

    public void n(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.f25665a.setPadding(i, i2, i3, i4);
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f25665a;
        if (refreshHeadView != null) {
            refreshHeadView.setProgressBarInitState(z);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fd95", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f25665a;
        if (refreshHeadView != null) {
            refreshHeadView.setBackgroundColor(i);
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f25665a;
        if (refreshHeadView != null) {
            refreshHeadView.setRefreshViewColor(i);
        }
    }

    public void r(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fa438", new Object[]{this, strArr});
        } else {
            this.i = strArr;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244f4adc", new Object[]{this, str});
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db72183", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.g;
        if ((i == 2 || i == 4) && z) {
            this.f25665a.setPadding(0, 0, 0, 0);
        }
    }

    public void m(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbdd0b8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = z;
        if (z) {
            this.c.setVisibility(0);
            this.b.setVisibility(0);
            this.d.setVisibility(0);
            this.d.stopLoadingAnimation();
            this.c.clearAnimation();
            TextView textView = this.b;
            String[] strArr = this.i;
            if (strArr == null) {
                str = b.LOAD_FINISH;
            } else {
                str = strArr[3];
            }
            textView.setText(str);
            return;
        }
        this.c.setVisibility(4);
        this.d.setVisibility(4);
        this.b.setVisibility(4);
    }

    public void a(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d19ce4", new Object[]{this, new Integer(i)});
        } else if (!this.j) {
            if (i == 0) {
                this.c.setVisibility(4);
                this.d.setVisibility(0);
                this.b.setVisibility(0);
                this.c.clearAnimation();
                this.c.startAnimation(this.h);
                TextView textView = this.b;
                String[] strArr = this.i;
                if (strArr == null || strArr.length < 2) {
                    str = "松开刷新";
                } else {
                    str = strArr[1];
                }
                textView.setText(str);
            } else if (i == 1) {
                this.b.setVisibility(0);
                this.c.setVisibility(0);
                TextView textView2 = this.b;
                String[] strArr2 = this.i;
                if (strArr2 == null || strArr2.length < 1) {
                    str2 = "下拉刷新";
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
            } else if (i == 2) {
                this.b.setVisibility(0);
                this.d.setVisibility(0);
                this.d.startLoadingAnimaton();
                this.c.clearAnimation();
                this.c.setVisibility(4);
                TextView textView3 = this.b;
                String[] strArr3 = this.i;
                if (strArr3 == null || strArr3.length < 3) {
                    str3 = "正在刷新...";
                } else {
                    str3 = strArr3[2];
                }
                textView3.setText(str3);
            } else if (i == 3) {
                this.d.stopLoadingAnimation();
                TextView textView4 = this.b;
                String[] strArr4 = this.i;
                if (strArr4 == null || strArr4.length < 3) {
                    str4 = "数据加载完毕";
                } else {
                    str4 = strArr4[3];
                }
                textView4.setText(str4);
            }
        }
    }
}

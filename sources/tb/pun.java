package tb;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.alibaba.android.ultron.common.page.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.CustomProgressBar;
import com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.RefreshHeadView;
import com.taobao.taobao.R;
import com.taobao.uikit.utils.UIKITLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pun {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FOOTER = 2;
    public static final int TYPE_FOOTER_HORIZONTAL = 4;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_HEADER_HORIZONTAL = 3;

    /* renamed from: a  reason: collision with root package name */
    public final RefreshHeadView f26330a;
    public final TextView b;
    public final TextView c;
    public final CustomProgressBar d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public ObjectAnimator i;
    public String[] j;
    public boolean k = false;
    public int l = 0;
    public final float m;
    public final int n;

    static {
        t2o.a(503317377);
    }

    public pun(Context context, int i, View view, boolean z, int i2, float f) {
        this.m = 0.0f;
        RefreshHeadView refreshHeadView = new RefreshHeadView(context, i, view, z);
        this.f26330a = refreshHeadView;
        this.c = refreshHeadView.getArrow();
        this.d = refreshHeadView.getProgressbar();
        this.b = refreshHeadView.getRefreshStateText();
        this.m = f;
        l(refreshHeadView);
        int measuredHeight = refreshHeadView.getMeasuredHeight();
        this.f = measuredHeight;
        int measuredWidth = refreshHeadView.getMeasuredWidth();
        this.e = measuredWidth;
        if (i2 == 1 || i2 == 2) {
            this.n = measuredHeight;
        } else {
            this.n = measuredWidth;
        }
        refreshHeadView.setPullDownDistance(this.n);
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
    }

    public void b(int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8212e1", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.n;
        float f2 = 0.0f;
        if (i2 != 0) {
            f = (i * 1.0f) / i2;
        } else {
            f = 0.0f;
        }
        float f3 = this.m;
        if (f3 > 0.0f) {
            if (f > f3) {
                f2 = (f - f3) * 2.0f;
            }
            i = (int) (i2 * f2);
            f = f2;
        }
        this.f26330a.setAlpha(f * 255.0f);
        this.d.changeProgressBarState(i);
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
        return this.l;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.f26330a.getPaddingBottom();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.f26330a.getPaddingLeft();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.f26330a.getPaddingRight();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.f26330a.getPaddingTop();
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f26330a;
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
            View childAt = this.f26330a.getChildAt(1);
            if (childAt != null) {
                this.l = childAt.getMeasuredHeight();
            }
            this.f26330a.setPullDownDistance(this.l);
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

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643538c0", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void o(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.f;
        int i6 = i2 + i5;
        int i7 = this.h;
        if (i6 > i7 && i7 > 0) {
            i2 = i7 - i5;
        }
        this.f26330a.setPadding(i, i2, i3, i4);
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8f870", new Object[]{this, new Boolean(z)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f26330a;
        if (refreshHeadView != null) {
            refreshHeadView.setProgressBarInitState(z);
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fd95", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f26330a;
        if (refreshHeadView != null) {
            refreshHeadView.setBackgroundColor(i);
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd8ad7", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.f26330a;
        if (refreshHeadView != null) {
            refreshHeadView.setRefreshViewColor(i);
        }
    }

    public void s(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7fa438", new Object[]{this, strArr});
        } else {
            this.j = strArr;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244f4adc", new Object[]{this, str});
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db72183", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = this.g;
        if ((i == 2 || i == 4) && z) {
            this.f26330a.setPadding(0, 0, 0, 0);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8d1d93", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.c.setScaleX(1.0f);
        this.c.setScaleY(1.0f);
        this.c.setAlpha(1.0f);
        this.c.setVisibility(0);
    }

    public void m(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdbdd0b8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        if (z) {
            this.c.setVisibility(0);
            this.b.setVisibility(0);
            this.d.setVisibility(0);
            this.d.stopLoadingAnimation();
            TextView textView = this.b;
            String[] strArr = this.j;
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
        } else if (!this.k) {
            if (i == 0) {
                this.d.setVisibility(0);
                this.b.setVisibility(0);
                TextView textView = this.b;
                String[] strArr = this.j;
                if (strArr == null || strArr.length < 2) {
                    str = "释放刷新";
                } else {
                    str = strArr[1];
                }
                textView.setText(str);
                w();
                UIKITLog.v("RefreshHeadViewManager", "当前状态，松开刷新", new Object[0]);
            } else if (i == 1) {
                this.b.setVisibility(0);
                TextView textView2 = this.b;
                String[] strArr2 = this.j;
                if (strArr2 == null || strArr2.length < 1) {
                    str2 = "下拉刷新";
                } else {
                    str2 = strArr2[0];
                }
                textView2.setText(str2);
                v();
                UIKITLog.v("RefreshHeadViewManager", "当前状态，下拉刷新", new Object[0]);
            } else if (i == 2) {
                this.b.setVisibility(0);
                TextView textView3 = this.b;
                String[] strArr3 = this.j;
                if (strArr3 == null || strArr3.length < 3) {
                    str3 = "正在刷新";
                } else {
                    str3 = strArr3[2];
                }
                textView3.setText(str3);
                this.d.setVisibility(0);
                this.d.startLoadingAnimaton();
                this.c.setVisibility(4);
                UIKITLog.v("RefreshHeadViewManager", "当前状态,正在刷新...", new Object[0]);
                View findViewById = this.f26330a.findViewById(R.id.tnode_refresh_header_view);
                if (findViewById != null) {
                    findViewById.setAlpha(1.0f);
                }
            } else if (i == 3) {
                this.d.stopLoadingAnimation();
                TextView textView4 = this.b;
                String[] strArr4 = this.j;
                if (strArr4 == null || strArr4.length < 3) {
                    str4 = "刷新完成";
                } else {
                    str4 = strArr4[3];
                }
                textView4.setText(str4);
                UIKITLog.v("RefreshHeadViewManager", "当前状态，done", new Object[0]);
                View findViewById2 = this.f26330a.findViewById(R.id.tnode_refresh_header_view);
                if (findViewById2 != null) {
                    findViewById2.setAlpha(1.0f);
                }
            }
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536afff", new Object[]{this});
            return;
        }
        if (this.i == null) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.c, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
            this.i = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            this.i.setDuration(200L);
        }
        this.i.start();
    }
}

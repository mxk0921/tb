package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z1b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f32458a;
    public final ImageView b;
    public boolean c;
    public final Context d;
    public final TUrlImageView e;
    public final View f;
    public final View g;
    public int h;
    public boolean i;

    static {
        t2o.a(310378740);
    }

    public z1b(View view, Context context, b0h b0hVar) {
        this.d = context;
        this.f32458a = (ImageView) view.findViewById(R.id.live_home_main_back);
        this.b = (ImageView) view.findViewById(R.id.live_home_main_live_icon);
        this.f = view.findViewById(R.id.live_home_main_top_atmosphere_layout);
        this.g = view.findViewById(R.id.live_home_main_top_background);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_home_main_top_nav_back);
        this.e = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01BdNaMb1g5jEp4wlAl_!!6000000004091-0-tps-750-192.jpg");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152f6d8", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c365b8", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b17ee4d", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852d7fe", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                xkq.d((Activity) this.d, z, R.color.homepage_transparent);
                ImageView imageView = this.f32458a;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.live_back_b_flexalocal);
                }
                ImageView imageView2 = this.b;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.livehome_live_icon_black_flexlocal);
                    return;
                }
                return;
            }
            ImageView imageView3 = this.f32458a;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.live_back_flexalocal);
            }
            ImageView imageView4 = this.b;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.livehome_live_icon_white_flexlocal);
            }
            xkq.e((Activity) this.d);
        } catch (Throwable th) {
            r0h.c("SelectedTopColorCtrl", "switch color exp.", th);
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8eccf9", new Object[]{this, new Boolean(z)});
        } else {
            d(z);
        }
    }

    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8c31aa", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f != null && this.g != null) {
            int i3 = (int) (i2 * 1.0d);
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) >= i) {
                return;
            }
            if (this.f.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i3;
                }
                this.f.setLayoutParams(marginLayoutParams);
                this.f.requestLayout();
            } else if (this.g.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = i3;
                }
                this.g.setLayoutParams(marginLayoutParams2);
                this.g.requestLayout();
            }
        }
    }

    public void g(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff5d22b", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.e != null && this.g != null && this.f != null) {
            int i3 = (int) (i2 * 1.0d);
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) <= i) {
                if (this.f.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = -i3;
                    }
                    this.f.setLayoutParams(marginLayoutParams);
                    this.f.requestLayout();
                } else if (this.g.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = -i3;
                    }
                    this.g.setLayoutParams(marginLayoutParams2);
                    this.g.requestLayout();
                }
                if (z && this.h != i3) {
                    this.h = i3;
                    float f = i3 / 100.0f;
                    if (f <= 0.0f && this.e.getAlpha() != 0.0f) {
                        this.e.setAlpha(0.0f);
                        if (this.c) {
                            e(false);
                        }
                    }
                    if (f >= 1.0f && this.e.getAlpha() != 1.0f) {
                        this.e.setAlpha(1.0f);
                        e(true);
                    }
                    if (f > 0.0f && f < 1.0f) {
                        this.e.setAlpha(f);
                    }
                    this.e.invalidate();
                }
            }
        }
    }
}

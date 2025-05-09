package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBActionView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cbr extends a90 implements btc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBActionView c;
    public Window.Theme d;

    static {
        t2o.a(847249416);
        t2o.a(839909522);
    }

    public static /* synthetic */ Object ipc$super(cbr cbrVar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.i((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/container/TBDefaultMoreAction");
    }

    @Override // tb.btc
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("319f3ab9", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.btc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470eead7", new Object[]{this});
        } else if (Window.Theme.LIGHT == this.d) {
            TBActionView tBActionView = this.c;
            if (tBActionView != null) {
                tBActionView.setIconColor(-16777216);
            }
        } else {
            TBActionView tBActionView2 = this.c;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(-1);
            }
        }
    }

    @Override // tb.btc
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        TBActionView tBActionView = this.c;
        if (tBActionView != null) {
            tBActionView.setVisibility(8);
        }
    }

    @Override // tb.a90
    public void i(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.i(iTMSPage);
        g();
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (this.c == null) {
            View inflate = View.inflate(context, R.layout.tms_tb_more_view, null);
            if (inflate != null) {
                TBActionView tBActionView = (TBActionView) inflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xcs.a(context, 44.0f), xcs.a(context, 44.0f));
                layoutParams.gravity = 8388627;
                tBActionView.setLayoutParams(layoutParams);
                View iconView = tBActionView.getIconView();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xcs.a(context, 24.0f), xcs.a(context, 24.0f));
                layoutParams2.gravity = 8388627;
                layoutParams2.setMarginStart(xcs.a(context, 6.0f));
                iconView.setLayoutParams(layoutParams2);
                tBActionView.setContentDescription(sqj.MORE_BUTTON);
                this.c = tBActionView;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
            }
        }
        return this.c;
    }

    @Override // tb.a90
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        if (Window.Theme.LIGHT == this.d) {
            TBActionView tBActionView = this.c;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            TBActionView tBActionView2 = this.c;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(-16777216);
            }
        }
        g();
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        this.d = theme;
        if (Window.Theme.DARK == theme) {
            TBActionView tBActionView = this.c;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            int parseColor = Color.parseColor("#333333");
            TBActionView tBActionView2 = this.c;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(parseColor);
            }
        }
        g();
    }

    @Override // tb.btc
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        TBActionView tBActionView = this.c;
        if (tBActionView != null) {
            tBActionView.setVisibility(0);
        }
    }
}

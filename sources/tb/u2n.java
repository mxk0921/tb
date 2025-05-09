package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBActionView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class u2n extends a90 implements btc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context c;
    public TBActionView d;
    public Window.Theme e;

    static {
        t2o.a(844103760);
        t2o.a(839909522);
    }

    public static /* synthetic */ Object ipc$super(u2n u2nVar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.i((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubBaseMoreAction");
    }

    @Override // tb.btc
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("319f3ab9", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.btc
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
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
    }

    @Override // tb.a90
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        if (Window.Theme.LIGHT == this.e) {
            TBActionView tBActionView = this.d;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            TBActionView tBActionView2 = this.d;
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
        this.e = theme;
        if (Window.Theme.LIGHT == theme) {
            TBActionView tBActionView = this.d;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            int parseColor = Color.parseColor("#333333");
            TBActionView tBActionView2 = this.d;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(parseColor);
            }
        }
        g();
    }

    public final Context r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6f648077", new Object[]{this});
        }
        return this.c;
    }

    public final TBActionView s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBActionView) ipChange.ipc$dispatch("ab92d98e", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.btc
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        }
    }

    public final Window.Theme t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Theme) ipChange.ipc$dispatch("7cc8d833", new Object[]{this});
        }
        return this.e;
    }

    public final void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c1e49d", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public final void v(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e365aa2", new Object[]{this, tBActionView});
        } else {
            this.d = tBActionView;
        }
    }
}

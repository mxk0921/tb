package com.taobao.themis.container.title.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.title.titleView.TMSTitleView;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Map;
import kotlin.Metadata;
import tb.a1e;
import tb.a90;
import tb.ahb;
import tb.btc;
import tb.ccs;
import tb.ckf;
import tb.co2;
import tb.iec;
import tb.iud;
import tb.kkb;
import tb.lae;
import tb.p8s;
import tb.qml;
import tb.t2o;
import tb.tll;
import tb.x5d;
import tb.xhb;
import tb.y0e;
import tb.zk4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J#\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J-\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000f2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000f2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b8\u00107J#\u0010-\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b-\u00109J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u001dH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010\"J\u000f\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010\"J\u000f\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010*J\u0011\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010\"J\u000f\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010\"J\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\"J%\u0010K\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010H2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\b2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\nJ\u000f\u0010R\u001a\u00020\bH\u0016¢\u0006\u0004\bR\u0010\"J\u0011\u0010T\u001a\u0004\u0018\u00010SH\u0004¢\u0006\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020V8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010`\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010f\u001a\u0004\u0018\u00010\u00068D@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010\nR\"\u0010m\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010:\u001a\u0004\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\b:\u0010p\"\u0004\b;\u0010q¨\u0006r"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "Ltb/y0e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/kernel/page/ITMSPage;", "page", "Ltb/xhv;", "attachPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "", "icon", "Landroid/view/View$OnClickListener;", DataReceiveMonitor.CB_LISTENER, "", "addLeftButton", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)Z", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)Z", "addRightButton", "lightIcon", "darkIcon", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Z", "url", "setTitleBarBgDrawable", "(Ljava/lang/String;)V", zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, "(Landroid/graphics/drawable/Drawable;)V", "", "color", "setTitleBarBgColor", "(I)V", "resetBackground", "()V", "getBarHeight", "()I", "Lcom/taobao/themis/kernel/container/Window$Theme;", "style", "setStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)Z", "isDarkTheme", "()Z", "title", "image", "setTitle", "(Ljava/lang/String;Ljava/lang/String;)Z", "setTitleColor", "(Ljava/lang/Integer;)Z", "", "getTitleColor", "()J", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "type", "showTitleBar", "(Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;)Z", "hideTitleBar", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)Z", "isTranslucent", "setTranslucent", "(Z)Z", "alpha", "setAlpha", "(I)Z", "onShow", "onHide", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "clearLeftButtons", "clearRightButtons", "clearCenterButtons", "T", "Ljava/lang/Class;", "cls", "getAction", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ltb/a90;", "action", "removeAction", "(Ltb/a90;)V", "resetTitle", "onDestroy", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Ltb/a1e;", "a", "Ltb/a1e;", "getMTitleView", "()Ltb/a1e;", "mTitleView", TplMsg.VALUE_T_NATIVE_RETURN, "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "c", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getMPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "setMPage", "mPage", "d", "Lcom/taobao/themis/kernel/container/Window$Theme;", "getMStyle", "()Lcom/taobao/themis/kernel/container/Window$Theme;", "setMStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)V", "mStyle", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBaseTitleBar implements y0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a1e f13506a;
    public final Context b;
    public ITMSPage c;
    public Boolean e;
    public Window.Theme d = Window.Theme.LIGHT;
    public int f = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void onImageFinish(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782fcf9a", new Object[]{this, drawable});
            } else if (drawable != null) {
                TMSBaseTitleBar.this.getMTitleView().setTitleBarBackgroundDrawable(drawable);
            }
        }
    }

    static {
        t2o.a(835715210);
        t2o.a(839909526);
    }

    public TMSBaseTitleBar(Context context) {
        ckf.g(context, "context");
        this.b = context;
        this.f13506a = new TMSTitleView(context);
    }

    public boolean addLeftButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a0a2bb2", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        co2 co2Var = new co2();
        co2Var.t(str, onClickListener);
        this.f13506a.addLeftAction(co2Var);
        return true;
    }

    @Override // tb.y0e
    public boolean addRightButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad477f9f", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        co2 co2Var = new co2();
        co2Var.t(str, onClickListener);
        this.f13506a.addRightAction(co2Var);
        return true;
    }

    @Override // tb.y0e
    public void attachPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.c = iTMSPage;
        this.f13506a.attachPage(iTMSPage);
        this.f = qml.h(iTMSPage);
        if (!qml.d(iTMSPage)) {
            setTitle(qml.l(iTMSPage), qml.n(iTMSPage));
        }
        Integer m = qml.m(iTMSPage);
        if (m != null) {
            setTitleColor(Integer.valueOf(m.intValue()));
        }
        setTitleBarBgColor(qml.h(iTMSPage));
        if (qml.c(iTMSPage)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        }
        setStyle(qml.k(iTMSPage));
    }

    public void clearCenterButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b82d26", new Object[]{this});
        } else {
            this.f13506a.clearCenterActions();
        }
    }

    public void clearLeftButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323326f4", new Object[]{this});
        } else {
            this.f13506a.clearLeftActions();
        }
    }

    public void clearRightButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc31839", new Object[]{this});
        } else {
            this.f13506a.clearRightActions();
        }
    }

    @Override // tb.y0e
    public <T> T getAction(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b5e78488", new Object[]{this, cls});
        }
        ckf.g(cls, "cls");
        return (T) this.f13506a.getAction(cls);
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        Context context = this.b;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public int getBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("134482de", new Object[]{this})).intValue();
        }
        return this.f13506a.getTitleViewHeight();
    }

    @Override // tb.y0e
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f13506a.getContentView();
    }

    public final Context getMContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6f648077", new Object[]{this});
        }
        return this.b;
    }

    public final ITMSPage getMPage() {
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("26554f74", new Object[]{this});
        }
        ITMSPage iTMSPage2 = this.c;
        if (iTMSPage2 == null) {
            iTMSPage = null;
        } else {
            iTMSPage = lae.Companion.a(iTMSPage2);
        }
        if (iTMSPage == null) {
            return this.c;
        }
        return iTMSPage;
    }

    public final Window.Theme getMStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Theme) ipChange.ipc$dispatch("7cc8d833", new Object[]{this});
        }
        return this.d;
    }

    public final a1e getMTitleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a1e) ipChange.ipc$dispatch("d792ff97", new Object[]{this});
        }
        return this.f13506a;
    }

    public long getTitleColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63b37dc", new Object[]{this})).longValue();
        }
        if (!(this.f13506a.getBackgroundDrawable() instanceof ColorDrawable)) {
            return 0L;
        }
        Drawable backgroundDrawable = this.f13506a.getBackgroundDrawable();
        if (backgroundDrawable != null) {
            return ((ColorDrawable) backgroundDrawable).getColor();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
    }

    public boolean isDarkTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77b079f4", new Object[]{this})).booleanValue();
        }
        if (this.d == Window.Theme.DARK) {
            return true;
        }
        return false;
    }

    @Override // tb.y0e
    /* renamed from: isTranslucent */
    public final Boolean mo332isTranslucent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("27e468d3", new Object[]{this}) : this.e;
    }

    @Override // tb.y0e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (a90 a90Var : this.f13506a.getActions()) {
            a90Var.m();
        }
    }

    @Override // tb.y0e
    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        for (a90 a90Var : this.f13506a.getActions()) {
            a90Var.n();
        }
    }

    @Override // tb.y0e
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        for (a90 a90Var : this.f13506a.getActions()) {
            a90Var.o();
        }
        this.f13506a.setStyle(this.d);
    }

    @Override // tb.y0e
    public void removeAction(a90 a90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2270727", new Object[]{this, a90Var});
            return;
        }
        ckf.g(a90Var, "action");
        a90Var.m();
        this.f13506a.removeAction(a90Var);
    }

    @Override // tb.y0e
    public void resetBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff85e4", new Object[]{this});
            return;
        }
        setStyle(this.d);
        Boolean bool = this.e;
        if (bool != null) {
            setTranslucent(bool.booleanValue());
        }
    }

    public boolean setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d144fec4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.f13506a.setTitleBarAlpha(i);
        return true;
    }

    public final void setMPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ff598c", new Object[]{this, iTMSPage});
        } else {
            this.c = iTMSPage;
        }
    }

    public final void setMStyle(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c186d95", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "<set-?>");
        this.d = theme;
    }

    @Override // tb.y0e
    public boolean setTitle(String str, String str2) {
        ahb ahbVar;
        iec iecVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152bd735", new Object[]{this, str, str2})).booleanValue();
        }
        if (str2 != null && str2.length() != 0 && (iecVar = (iec) getAction(iec.class)) != null) {
            iecVar.c(str2);
            return true;
        } else if (str == null || str.length() == 0 || (ahbVar = (ahb) getAction(ahb.class)) == null) {
            return false;
        } else {
            ahbVar.setName(str);
            return true;
        }
    }

    @Override // tb.y0e
    public void setTitleBarBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b465dbb", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        this.f13506a.setTitleBarBackgroundColor(i);
        this.f13506a.setTitleBarAlpha(255);
    }

    @Override // tb.y0e
    public void setTitleBarBgDrawable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a07391", new Object[]{this, str});
            return;
        }
        IImageAdapter.b bVar = new IImageAdapter.b();
        bVar.e(1);
        IImageAdapter iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class);
        if (iImageAdapter != null) {
            iImageAdapter.loadImage(str, bVar, new a());
        }
    }

    @Override // tb.y0e
    public boolean setTitleColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d62fee07", new Object[]{this, num})).booleanValue();
        }
        ahb ahbVar = (ahb) getAction(ahb.class);
        if (ahbVar != null) {
            ahbVar.d(num);
        }
        return true;
    }

    public final void setTranslucent(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57f43ef", new Object[]{this, bool});
        } else {
            this.e = bool;
        }
    }

    @Override // tb.y0e
    public boolean hideTitleBar(NavigatorBarAnimType navigatorBarAnimType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3b5c0f7", new Object[]{this, navigatorBarAnimType})).booleanValue();
        }
        ckf.g(navigatorBarAnimType, "type");
        if (this.f13506a.getContentView().getVisibility() == 0) {
            onHide();
        }
        this.f13506a.hideTitleBar(navigatorBarAnimType);
        return true;
    }

    @Override // tb.y0e
    /* renamed from: isTranslucent  reason: collision with other method in class */
    public boolean mo332isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.e;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // tb.y0e
    public boolean setTranslucent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579b6bfa", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.f13506a.setTitleBarAlpha(0);
            this.f13506a.setTitleBarBackgroundColor(0);
        } else {
            this.f13506a.setTitleBarAlpha(255);
            this.f13506a.setTitleBarBackgroundColor(this.f);
        }
        this.e = Boolean.valueOf(z);
        return true;
    }

    @Override // tb.y0e
    public boolean showTitleBar(NavigatorBarAnimType navigatorBarAnimType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdaae89c", new Object[]{this, navigatorBarAnimType})).booleanValue();
        }
        ckf.g(navigatorBarAnimType, "type");
        if (this.f13506a.getContentView().getVisibility() != 0) {
            onShow();
        }
        this.f13506a.showTitleBar(navigatorBarAnimType);
        return true;
    }

    @Override // tb.y0e
    public void resetTitle(ITMSPage iTMSPage) {
        x5d pageContainer;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845963fb", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        setTitle(qml.l(iTMSPage), qml.n(iTMSPage));
        setTitleColor(qml.m(iTMSPage));
        setTitleBarBgColor(qml.h(iTMSPage));
        xhb xhbVar = (xhb) getAction(xhb.class);
        if (xhbVar != null) {
            Window m = iTMSPage.getPageParams().e().m();
            if (m == null ? false : ckf.b(m.l(), Boolean.FALSE)) {
                xhbVar.hideBackButton();
            } else {
                xhbVar.showBackButton();
            }
        }
        kkb kkbVar = (kkb) getAction(kkb.class);
        if (kkbVar != null) {
            if (iTMSPage.getPageParams().h() != null) {
                Object h = iTMSPage.getPageParams().h();
                if (h != null) {
                    Map map = (Map) h;
                    Object obj = map.get(ccs.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL);
                    if (obj != null) {
                        String str = (String) obj;
                        Object obj2 = map.get(ccs.KEY_RIGHT_ITEM_DARK_IMAGE_URL);
                        if (obj2 != null) {
                            kkbVar.h(str, (String) obj2, (View.OnClickListener) map.get("onClick"));
                            kkbVar.a();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                }
            } else {
                kkbVar.f();
            }
        }
        setStyle(qml.k(iTMSPage));
        tll pageContext = iTMSPage.getPageContext();
        if (!(pageContext == null || (pageContainer = pageContext.getPageContainer()) == null)) {
            pageContainer.c(qml.j(iTMSPage));
        }
        if (qml.c(iTMSPage)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        } else {
            showTitleBar(NavigatorBarAnimType.NULL);
        }
        btc btcVar = (btc) getAction(btc.class);
        if (btcVar != null) {
            Window.c g = qml.g(iTMSPage);
            if (g == null || !g.b()) {
                z = false;
            }
            if (z) {
                btcVar.hide();
            } else {
                btcVar.show();
            }
        }
    }

    @Override // tb.y0e
    public boolean setStyle(Window.Theme theme) {
        iud iudVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f45710", new Object[]{this, theme})).booleanValue();
        }
        ckf.g(theme, "style");
        ITMSPage mPage = getMPage();
        if (!(mPage == null || (iudVar = (iud) mPage.getExtension(iud.class)) == null)) {
            if (theme == Window.Theme.LIGHT) {
                z = true;
            }
            iudVar.R(z);
        }
        this.f13506a.setStyle(theme);
        this.d = theme;
        return true;
    }

    public boolean addLeftButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b9a258", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (drawable == null) {
            return false;
        }
        co2 co2Var = new co2();
        co2Var.s(drawable, onClickListener);
        this.f13506a.addLeftAction(co2Var);
        return true;
    }

    @Override // tb.y0e
    public boolean addRightButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324b505", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (drawable == null) {
            return false;
        }
        co2 co2Var = new co2();
        co2Var.s(drawable, onClickListener);
        this.f13506a.addRightAction(co2Var);
        return true;
    }

    @Override // tb.y0e
    public void setTitleBarBgDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9c292b", new Object[]{this, drawable});
        } else if (drawable != null) {
            this.f13506a.setTitleBarBackgroundDrawable(drawable);
            this.f13506a.setTitleBarAlpha(255);
        }
    }

    @Override // tb.y0e
    public boolean addRightButton(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1873dd15", new Object[]{this, str, str2, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        co2 co2Var = (co2) this.f13506a.getAction(co2.class);
        if (co2Var == null) {
            co2 co2Var2 = new co2();
            this.f13506a.addRightAction(co2Var2);
            ITMSPage mPage = getMPage();
            ckf.d(mPage);
            co2Var2.i(mPage);
            co2Var2.h(str, str2, onClickListener);
        } else {
            co2Var.h(str, str2, onClickListener);
        }
        return true;
    }

    @Override // tb.y0e
    public boolean setTitle(String str, Drawable drawable) {
        ahb ahbVar;
        iec iecVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cb1e4cf", new Object[]{this, str, drawable})).booleanValue();
        }
        if (drawable != null && (iecVar = (iec) getAction(iec.class)) != null) {
            iecVar.b(drawable);
            return true;
        } else if (str == null || (ahbVar = (ahb) getAction(ahb.class)) == null) {
            return false;
        } else {
            ahbVar.setName(str);
            return true;
        }
    }
}

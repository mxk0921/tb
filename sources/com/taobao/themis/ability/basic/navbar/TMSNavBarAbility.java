package com.taobao.themis.ability.basic.navbar;

import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsNavBarAbility;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Locale;
import kotlin.Metadata;
import tb.a07;
import tb.ccs;
import tb.ckf;
import tb.iud;
import tb.jdb;
import tb.jpu;
import tb.kdb;
import tb.kkb;
import tb.npd;
import tb.o9s;
import tb.pmj;
import tb.rmj;
import tb.smj;
import tb.t2o;
import tb.tck;
import tb.tll;
import tb.tmj;
import tb.uyc;
import tb.vmj;
import tb.vyc;
import tb.wmj;
import tb.x5d;
import tb.xhb;
import tb.xmj;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0016J'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010 J'\u0010$\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010 J\u001f\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010 J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010 J'\u0010*\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020)2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/taobao/themis/ability/basic/navbar/TMSNavBarAbility;", "Lcom/taobao/android/abilityidl/ability/AbsNavBarAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/tmj;", "params", "Ltb/vyc;", "callback", "Ltb/xhv;", "setShareConfig", "(Ltb/kdb;Ltb/tmj;Ltb/vyc;)V", "Ltb/umj;", "Ltb/jdb;", "setTheme", "(Ltb/kdb;Ltb/umj;Ltb/jdb;)V", "Ltb/vmj;", "setTitle", "(Ltb/kdb;Ltb/vmj;Ltb/jdb;)V", "Ltb/pmj;", "setTitleColor", "(Ltb/kdb;Ltb/pmj;Ltb/jdb;)V", "Ltb/wmj;", "setTitleImage", "(Ltb/kdb;Ltb/wmj;Ltb/jdb;)V", "setBgColor", "Ltb/xmj;", "hide", "(Ltb/kdb;Ltb/xmj;Ltb/jdb;)V", "show", DxContainerActivity.PARAMS_SHOW_STATUS_BAR, "(Ltb/kdb;Ltb/jdb;)V", "hideStatusBar", "Ltb/smj;", "Ltb/uyc;", "setRightItem", "(Ltb/kdb;Ltb/smj;Ltb/uyc;)V", "hideRightItem", "showBackButton", "hideBackButton", "Ltb/rmj;", "setImmersive", "(Ltb/kdb;Ltb/rmj;Ltb/jdb;)V", "Companion", "a", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSNavBarAbility extends AbsNavBarAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(830472214);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final NavigatorBarAnimType a(boolean z, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NavigatorBarAnimType) ipChange.ipc$dispatch("1fa62ea0", new Object[]{this, new Boolean(z), str});
            }
            if (!z) {
                return NavigatorBarAnimType.NULL;
            }
            if (str == null) {
                str2 = null;
            } else {
                Locale locale = Locale.ROOT;
                ckf.f(locale, "ROOT");
                str2 = str.toLowerCase(locale);
                ckf.f(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            if (ckf.b(str2, "alpha")) {
                return NavigatorBarAnimType.ALPHA;
            }
            if (ckf.b(str2, "translate")) {
                return NavigatorBarAnimType.TRANS;
            }
            return NavigatorBarAnimType.OTHER;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uyc f13445a;

        public b(uyc uycVar) {
            this.f13445a = uycVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f13445a.onClick();
            }
        }
    }

    static {
        t2o.a(830472213);
    }

    public static /* synthetic */ Object ipc$super(TMSNavBarAbility tMSNavBarAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/navbar/TMSNavBarAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideBackButton(kdb kdbVar, jdb jdbVar) {
        y0e titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3461960d", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        xhb xhbVar = null;
        if (!(pageContext == null || (titleBar = pageContext.getTitleBar()) == null)) {
            xhbVar = (xhb) titleBar.getAction(xhb.class);
        }
        if (xhbVar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.x(Boolean.FALSE);
        }
        if (!xhbVar.hideBackButton()) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideRightItem(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eeadf", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        kkb kkbVar = (kkb) titleBar.getAction(kkb.class);
        if (kkbVar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        } else if (!kkbVar.f()) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setBgColor(kdb kdbVar, pmj pmjVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f12be76", new Object[]{this, kdbVar, pmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(pmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Integer m = o9s.m(pmjVar.f26186a);
        if (m == null) {
            jdbVar.O(ErrorResult.a.g("color is invalid"));
            return;
        }
        Window m2 = h.getPageParams().e().m();
        if (m2 != null) {
            m2.s(m);
        }
        titleBar.setTitleBarBgColor(m.intValue());
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setImmersive(kdb kdbVar, rmj rmjVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8a25b7", new Object[]{this, kdbVar, rmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(rmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        if (pageContext == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        boolean z = rmjVar.f27467a;
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.u(Boolean.valueOf(z));
        }
        y0e titleBar = pageContext.getTitleBar();
        if (titleBar != null) {
            titleBar.setTranslucent(z);
        }
        x5d pageContainer = pageContext.getPageContainer();
        if (pageContainer != null) {
            pageContainer.c(z);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitle(kdb kdbVar, vmj vmjVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cfd6d71", new Object[]{this, kdbVar, vmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(vmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        h.getPageParams().b().put((JSONObject) ccs.KEY_CUSTOM_SET_TITLE, (String) Boolean.TRUE);
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.z(vmjVar.f30104a);
        }
        Window m2 = h.getPageParams().e().m();
        if (m2 != null) {
            m2.B(null);
        }
        if (!titleBar.setTitle(vmjVar.f30104a, (String) null)) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitleColor(kdb kdbVar, pmj pmjVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6be905", new Object[]{this, kdbVar, pmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(pmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Integer m = o9s.m(pmjVar.f26186a);
        if (m == null) {
            jdbVar.O(ErrorResult.a.g("color is invalid"));
            return;
        }
        Window m2 = h.getPageParams().e().m();
        if (m2 != null) {
            m2.A(m);
        }
        if (!titleBar.setTitleColor(m)) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitleImage(kdb kdbVar, wmj wmjVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e11b5", new Object[]{this, kdbVar, wmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(wmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        h.getPageParams().b().put((JSONObject) ccs.KEY_CUSTOM_SET_TITLE, (String) Boolean.TRUE);
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.B(wmjVar.f30778a);
        }
        Window m2 = h.getPageParams().e().m();
        if (m2 != null) {
            m2.z(null);
        }
        if (!titleBar.setTitle((String) null, wmjVar.f30778a)) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void showBackButton(kdb kdbVar, jdb jdbVar) {
        y0e titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca0b9c8", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        xhb xhbVar = null;
        if (!(pageContext == null || (titleBar = pageContext.getTitleBar()) == null)) {
            xhbVar = (xhb) titleBar.getAction(xhb.class);
        }
        if (xhbVar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.x(Boolean.TRUE);
        }
        if (!xhbVar.showBackButton()) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideStatusBar(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c134c8d1", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        iud iudVar = (iud) h.getExtension(iud.class);
        if (iudVar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.y(Boolean.TRUE);
        }
        iudVar.s0(true);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void showStatusBar(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f4c1b6", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        iud iudVar = (iud) h.getExtension(iud.class);
        if (iudVar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.y(Boolean.FALSE);
        }
        iudVar.s0(false);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hide(kdb kdbVar, xmj xmjVar, jdb jdbVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa4ba6b", new Object[]{this, kdbVar, xmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(xmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        a aVar = Companion;
        if (!xmjVar.f31472a) {
            z = false;
        }
        NavigatorBarAnimType a2 = aVar.a(z, xmjVar.b);
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.t(Boolean.TRUE);
        }
        if (!titleBar.hideTitleBar(a2)) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTheme(tb.kdb r6, tb.umj r7, tb.jdb r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.navbar.TMSNavBarAbility.setTheme(tb.kdb, tb.umj, tb.jdb):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void show(kdb kdbVar, xmj xmjVar, jdb jdbVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8288626", new Object[]{this, kdbVar, xmjVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(xmjVar, "params");
        ckf.g(jdbVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            jdbVar.O(ErrorResult.a.c("容器实例未找到"));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
            return;
        }
        a aVar = Companion;
        if (!xmjVar.f31472a) {
            z = false;
        }
        NavigatorBarAnimType a2 = aVar.a(z, xmjVar.b);
        Window m = h.getPageParams().e().m();
        if (m != null) {
            m.t(Boolean.FALSE);
        }
        if (!titleBar.showTitleBar(a2)) {
            jdbVar.O(ErrorResult.a.b("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setRightItem(kdb kdbVar, smj smjVar, uyc uycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b62cde3", new Object[]{this, kdbVar, smjVar, uycVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(smjVar, "params");
        ckf.g(uycVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            uycVar.O(ErrorResult.a.c(null));
            return;
        }
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            uycVar.O(ErrorResult.a.d(null));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            uycVar.O(ErrorResult.a.b(null));
            return;
        }
        b bVar = new b(uycVar);
        h.getPageParams().b().put((JSONObject) "rightItem", (String) kotlin.collections.a.j(jpu.a(ccs.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL, smjVar.f28147a), jpu.a(ccs.KEY_RIGHT_ITEM_DARK_IMAGE_URL, smjVar.b), jpu.a("onClick", bVar)));
        titleBar.addRightButton(smjVar.f28147a, smjVar.b, bVar);
        kkb kkbVar = (kkb) titleBar.getAction(kkb.class);
        if (kkbVar != null) {
            kkbVar.a();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setShareConfig(kdb kdbVar, tmj tmjVar, vyc vycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f777c219", new Object[]{this, kdbVar, tmjVar, vycVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(tmjVar, "params");
        ckf.g(vycVar, "callback");
        if (CommonExtKt.g(kdbVar) == null) {
            vycVar.onResult(false);
            return;
        }
        IShareAdapter.b bVar = new IShareAdapter.b(tmjVar.f28804a, tmjVar.e, tmjVar.b, tmjVar.c, tmjVar.d, tmjVar.f, null, null, tck.DETECT_WIDTH, null);
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            vycVar.O(ErrorResult.a.d(null));
            return;
        }
        npd npdVar = (npd) h.getExtension(npd.class);
        if (npdVar == null) {
            vycVar.O(ErrorResult.a.b(null));
            return;
        }
        npdVar.l1(bVar);
        vycVar.onResult(true);
    }
}

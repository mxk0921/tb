package com.taobao.themis.ability_taobao.tiny_app;

import android.app.Activity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsTinyAppAbility;
import com.taobao.android.abilityidl.ability.TinyAppCheckAddIconButtonResult;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub.titlebar.action.PubAddIconAction;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.fbs;
import tb.jdb;
import tb.kdb;
import tb.qbs;
import tb.t2o;
import tb.t3n;
import tb.tll;
import tb.u0e;
import tb.w0e;
import tb.y0e;
import tb.y2n;
import tb.ywt;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/ability_taobao/tiny_app/TMSTinyAppAbility;", "Lcom/taobao/android/abilityidl/ability/AbsTinyAppAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/w0e;", "callback", "Ltb/xhv;", "addUserActiveAddIconListener", "(Ltb/kdb;Ltb/w0e;)V", "Ltb/jdb;", "removeUserActiveAddIconListener", "(Ltb/kdb;Ltb/jdb;)V", "showActiveReplacePopup", "Ltb/ywt;", "params", "showICONChangeGuide", "(Ltb/kdb;Ltb/ywt;Ltb/jdb;)V", "Ltb/u0e;", "checkAddIconButton", "(Ltb/kdb;Ltb/u0e;)V", "themis_ability_taobao_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTinyAppAbility extends AbsTinyAppAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements qbs.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w0e f13465a;

        public a(w0e w0eVar) {
            this.f13465a = w0eVar;
        }

        @Override // tb.qbs.a
        public void a(String str, JSON json) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f786e023", new Object[]{this, str, json});
                return;
            }
            ckf.g(str, "event");
            this.f13465a.Z();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jdb f13466a;
        public final /* synthetic */ ITMSPage b;

        public b(jdb jdbVar, ITMSPage iTMSPage) {
            this.f13466a = jdbVar;
            this.b = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
                this.f13466a.O(new ErrorResult("FORBID_ADD_TO_HOME_PAGE", "不允许添加当前轻应用至首页", (Map) null, 4, (a07) null));
            } else {
                Activity I = this.b.getInstance().I();
                ckf.f(I, "page.getInstance().activity");
                new t3n(I, pubUserGuideModule, null, 4, null).a();
            }
        }
    }

    static {
        t2o.a(832569384);
    }

    public static /* synthetic */ Object ipc$super(TMSTinyAppAbility tMSTinyAppAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/tiny_app/TMSTinyAppAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void addUserActiveAddIconListener(kdb kdbVar, w0e w0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eee1799", new Object[]{this, kdbVar, w0eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(w0eVar, "callback");
        qbs.c("userActiveAddIcon", new a(w0eVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void removeUserActiveAddIconListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37722b", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        qbs.d("userActiveAddIcon");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void showActiveReplacePopup(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d764a28d", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.Companion.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        PubAddIconAction pubAddIconAction = null;
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (titleBar == null) {
            jdbVar.O(ErrorResult.a.Companion.b("容器能力未实现"));
        }
        if (titleBar != null) {
            pubAddIconAction = (PubAddIconAction) titleBar.getAction(PubAddIconAction.class);
        }
        if (pubAddIconAction == null) {
            jdbVar.O(new ErrorResult("FORBID_ADD_TO_HOME_PAGE", "不允许添加当前轻应用至首页", (Map) null, 4, (a07) null));
        } else {
            fbs.c(h.getInstance(), new b(jdbVar, h));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void showICONChangeGuide(kdb kdbVar, ywt ywtVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92eab6b", new Object[]{this, kdbVar, ywtVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ywtVar, "params");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.Companion.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        if (!((pageContext == null ? null : pageContext.getTitleBar()) instanceof PubTitleBar)) {
            jdbVar.O(ErrorResult.a.Companion.b("容器能力未实现"));
        } else {
            jdbVar.O(new ErrorResult("TINY_APP_SERVER_FORBID_SHOW", "轻应用服务端不允许展示", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsTinyAppAbility
    public void checkAddIconButton(kdb kdbVar, u0e u0eVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c951b0", new Object[]{this, kdbVar, u0eVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(u0eVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            u0eVar.O(ErrorResult.a.Companion.d("容器页面未找到"));
            return;
        }
        tll pageContext = h.getPageContext();
        y0e titleBar = pageContext == null ? null : pageContext.getTitleBar();
        if (!(titleBar instanceof PubTitleBar)) {
            u0eVar.O(ErrorResult.a.Companion.b("容器能力未实现"));
            return;
        }
        TinyAppCheckAddIconButtonResult tinyAppCheckAddIconButtonResult = new TinyAppCheckAddIconButtonResult();
        if (((PubTitleBar) titleBar).getAction(PubAddIconAction.class) == null) {
            z = false;
        }
        tinyAppCheckAddIconButtonResult.isShowing = Boolean.valueOf(z);
        u0eVar.x0(tinyAppCheckAddIconButtonResult);
    }
}

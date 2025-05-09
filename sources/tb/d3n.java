package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
@Deprecated(message = "use TMSCommonInjectJS")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d3n INSTANCE = new d3n();

    static {
        t2o.a(845152375);
    }

    @JvmStatic
    public static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e28a319f", new Object[]{context});
        }
        ckf.g(context, "context");
        int b = b(context);
        return "\n            document.documentElement.style.setProperty('--safe-area-inset-top', '" + b + "px');\n        ";
    }

    @JvmStatic
    public static final int b(Context context) {
        ccs pageParams;
        swd W;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56e12f2f", new Object[]{context})).intValue();
        }
        if (!q9s.P1()) {
            return xcs.f(context, xcs.d(context));
        }
        bbs i = TMSInstanceExtKt.i(context);
        ITMSPage iTMSPage = null;
        if (!(i == null || (W = i.W()) == null)) {
            iTMSPage = W.getTopPage();
        }
        if (!(iTMSPage == null || (pageParams = iTMSPage.getPageParams()) == null)) {
            z = pageParams.i();
        }
        if (z) {
            return xcs.f(context, xcs.d(context));
        }
        return 0;
    }

    @JvmStatic
    public static final String c(Context context) {
        Boolean bool;
        swd W;
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feb531c", new Object[]{context});
        }
        ckf.g(context, "context");
        int b = b(context);
        if (context instanceof cbs) {
            bbs m1 = ((cbs) context).m1();
            bool = null;
            if (!(m1 == null || (W = m1.W()) == null || (topPage = W.getTopPage()) == null)) {
                bool = Boolean.valueOf(qml.j(topPage));
            }
        } else {
            bool = context instanceof v2n ? Boolean.valueOf(((v2n) context).W()) : Boolean.FALSE;
        }
        return "\n!(function(sbh,ims){var t=class{constructor(){this.height=0,this.width=0,this.left=0,this.top=0,this.items=[]}};var e=class extends EventTarget{constructor(){super(),this._titleBarHeight=44,this._safeAreaInsets=[sbh,0,0,0],this._immersive=ims,this._leftPanel=new t,this._centerPanel=new t,this._rightPanel=new t,this.addEventListener(\"updateNavbarPosition\",this._updateValues)}get titleBarHeight(){return this._titleBarHeight}get safeAreaInsetTop(){return this._safeAreaInsets[0]}get immersive(){return this._immersive}get leftPanel(){return this._leftPanel}get centerPanel(){return this._centerPanel}get rightPanel(){return this._rightPanel}_updateValues(_){let{titleBarHeight:i,safeAreaInsets:s,immersive:n,leftPanel:h,centerPanel:r,rightPanel:a}=_.detail;i&&(this._titleBarHeight=i),s&&(this._safeAreaInsets=s),n&&(this._immersive=n),h&&(this._leftPanel=h),r&&(this._centerPanel=r),a&&(this._rightPanel=a)}};navigator.navBarPosition=new e;})(" + b + ',' + bool + ");\n    ";
    }
}

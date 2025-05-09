package tb;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.ut.share.business.ShareBusiness;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vsg implements psg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f30222a;
    public String b = "coldStart";

    static {
        t2o.a(573571154);
        t2o.a(736100448);
    }

    public vsg(nwi nwiVar) {
        this.f30222a = nwiVar;
    }

    @Override // tb.psg
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6a55f9", new Object[]{this});
        } else {
            jgh.a("LinkedSplashPopImpl", "onShown");
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c5a33b", new Object[]{this, str, str2});
        } else {
            usg.d().e().d(nwi.BIZ_CODE, this.b, "PopError", str, str2, null);
        }
    }

    @Override // tb.psg
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daf1e05e", new Object[]{this});
        }
        return rr6.TYPE_POPVIEW;
    }

    @Override // tb.psg
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        String c = u5v.b().c();
        if (ShareBusiness.getInstance().hasTaoPassword()) {
            jgh.a("LinkedSplashPopImpl", "onTerminate，return, isTaoPasswordShown = true");
            b("PopOnTerminate", "POP_HAS_TAO_PASSWORD_FAIL");
            return;
        }
        if (i(c)) {
            jgh.a("LinkedSplashPopImpl", "onTerminate return. hasOtherLevelRequestingPop = true");
        }
        if (TextUtils.isEmpty(c)) {
            jgh.a("LinkedSplashPopImpl", "onTerminate, return, TextUtils.isEmpty(popIndexId), popIndexId = " + c);
            b("PopOnTerminate", "POP_INDEX_ID_FAIL");
            return;
        }
        String j = n4q.j(c);
        b("PopOnTerminate", "POP_NOTIFY_DISPLAY" + j);
        jgh.a("LinkedSplashPopImpl", "onTerminate, finish, PopNativeApi.notifyPopToDisplay = " + c);
    }

    @Override // tb.psg
    public void f(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae02dd", new Object[]{this, linkedSplashData});
        }
    }

    @Override // tb.psg
    public boolean g(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bc039b", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.b = "coldStart";
        return j(linkedSplashData, true);
    }

    @Override // tb.psg
    public boolean h(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34c8cb58", new Object[]{this, linkedSplashData})).booleanValue();
        }
        this.b = o78.REFRESH_SOURCE_HOT_START;
        return j(linkedSplashData, false);
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc49cb05", new Object[]{this, str})).booleanValue();
        }
        String f = n4q.f(str);
        if (TextUtils.equals("NO_OTHER_LAYER_POP", f)) {
            jgh.a("LinkedSplashPopImpl", "hasOtherLevelRequestingPop true, reason:NO_OTHER_LAYER_POP");
            return false;
        }
        if (TextUtils.equals("", f)) {
            f = "has other level requesting pop.";
        }
        jgh.a("LinkedSplashPopImpl", "hasOtherLevelRequestingPop true, reason:" + f);
        return true;
    }

    public final void k(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac5927d", new Object[]{this, aVar});
            return;
        }
        DisplayMetrics displayMetrics = uy3.a().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        double d = i / 750.0d;
        int i2 = (int) (aVar.f26271a * d);
        aVar.f26271a = i2;
        int i3 = (int) (aVar.b * d);
        aVar.b = i3;
        aVar.c = (i - i2) - ((int) (aVar.c * d));
        aVar.d = (displayMetrics.heightPixels - i3) - ((int) (aVar.d * d));
    }

    @Override // tb.psg
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
        } else {
            jgh.a("LinkedSplashPopImpl", "onAnimationEnd");
        }
    }

    @Override // tb.psg
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
        } else {
            jgh.a("LinkedSplashPopImpl", "onAnimationStart");
        }
    }

    @Override // tb.psg
    public boolean e(psg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        String c = u5v.b().c();
        if (ShareBusiness.getInstance().hasTaoPassword()) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate false，hasTaoPassword = true");
            b("PopShouldAnimate", "POP_HAS_TAO_PASSWORD_FAIL");
            return false;
        }
        if (i(c)) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate false. hasOtherLevelRequestingPop = true");
        }
        aVar.getClass();
        if (psg.a.FROM_CLOSE.equals(null)) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate, false, fromAction =  user skip");
            b("PopShouldAnimate", "POP_FROM_CLOSE_FAIL");
            return false;
        }
        String h = n4q.h(c);
        if (!"".equals(h)) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate, false, isPopReadyToDisplay = " + h + ", popIndexId = " + c);
        }
        nwi nwiVar = this.f30222a;
        if (nwiVar == null) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate, false, adContext = null");
            b("PopShouldAnimate", "POP_DATA_FAIL");
            return false;
        }
        JSONObject a2 = ywf.a(nwiVar.d().l(), "item", "render", vaj.KEY_SMART_CONTENT, "position");
        if (a2 == null) {
            jgh.a("LinkedSplashPopImpl", "shouldAnimate, false, positionObj = null");
            b("PopShouldAnimate", "POP_POSITION_FAIL");
            return false;
        }
        aVar.b = a2.getIntValue("height");
        aVar.f26271a = a2.getIntValue("width");
        aVar.c = a2.getIntValue("right");
        aVar.d = a2.getIntValue("tabBarBottom");
        k(aVar);
        jgh.a("LinkedSplashPopImpl", "shouldAnimate, options = " + aVar);
        return true;
    }

    public final boolean j(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b3b32d9", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        b("PopShouldShow", "POP_START");
        if (TextUtils.isEmpty(u5v.b().c())) {
            jgh.a("LinkedSplashPopImpl", "shouldShow popIndexId is null");
            b("PopShouldShow", "POP_INDEX_ID_FAIL");
            return false;
        } else if (ShareBusiness.getInstance().hasTaoPassword()) {
            jgh.a("LinkedSplashPopImpl", "shouldShow,false，hasTaoPassword = true");
            b("PopShouldShow", "POP_HAS_TAO_PASSWORD_FAIL");
            return false;
        } else {
            tsg g = usg.d().b().g();
            if ((g == null || !g.a()) && !z) {
                jgh.a("LinkedSplashPopImpl", "shouldShow,false, isAtHomepage = false");
                b("PopShouldShow", "POP_NOT_HOMEPAGE_FAIL");
                return false;
            }
            String a2 = n4q.a();
            if ("".equals(a2)) {
                return true;
            }
            jgh.a("LinkedSplashPopImpl", "shouldShow,false, checkMamaCommercialSplashCanStart = " + a2);
            b("PopShouldShow", "POP_SDK_INIT_FAIL");
            return false;
        }
    }
}

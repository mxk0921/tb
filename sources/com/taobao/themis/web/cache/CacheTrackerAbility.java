package com.taobao.themis.web.cache;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsCacheTrackerAbility;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.lang.ref.WeakReference;
import tb.ckf;
import tb.ct2;
import tb.jdb;
import tb.kdb;
import tb.mt2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CacheTrackerAbility extends AbsCacheTrackerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(850395148);
    }

    public static /* synthetic */ Object ipc$super(CacheTrackerAbility cacheTrackerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/cache/CacheTrackerAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsCacheTrackerAbility
    public void report(kdb kdbVar, mt2 mt2Var, jdb jdbVar) {
        String url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888e8fb1", new Object[]{this, kdbVar, mt2Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(mt2Var, "params");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        WVUCWebView wVUCWebView = null;
        ct2 ct2Var = h == null ? null : (ct2) h.getExtension(ct2.class);
        WeakReference<View> h2 = kdbVar.h();
        View view = h2 == null ? null : h2.get();
        if (view instanceof WVUCWebView) {
            wVUCWebView = (WVUCWebView) view;
        }
        String str = "";
        if (!(wVUCWebView == null || (url = wVUCWebView.getUrl()) == null)) {
            str = url;
        }
        if (str.length() != 0 && ct2Var != null) {
            ct2Var.a(mt2Var.f24287a, str);
        }
    }
}

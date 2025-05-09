package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class z9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final z9 INSTANCE = new z9();

    /* renamed from: a  reason: collision with root package name */
    public static no8 f32610a;

    static {
        t2o.a(850395162);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9109504", new Object[0]);
        }
        return "\n// Build Time: 12/9/2024, 3:59:23 PM\n!function(){\"use strict\";!function(){var e=window.open;function t(e){e&&__megability_bridge__.asyncCall(\"navigator\",\"openURL\",{url:e})}addEventListener(\"click\",(function(e){var n,r=function(e,t){for(t=String(t).toLowerCase();e&&e.tagName.toLowerCase()!==t;)e=e.parentElement;return e}(e.target,\"a\");if(!r||\"_blank\"!==r.getAttribute(\"target\")||!r.getAttribute(\"href\"))return!1;e.preventDefault(),Object.defineProperty(e,\"preventDefault\",{get:function(){return o}}),Object.defineProperty(e,\"defaultPrevented\",{get:function(){return!!n}});var i=r.getAttribute(\"href\");function o(){n=1}setTimeout((function(){n||t(i)}),16)}),!0),Object.defineProperty(window,\"open\",{enumerable:!0,get:function(){return function(n,r){r&&\"_blank\"!==r?e.call(window,n):t(n)}}})}()}();\n    ";
    }

    @JvmStatic
    public static final no8 b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (no8) ipChange.ipc$dispatch("d7f29158", new Object[]{context});
        }
        ckf.g(context, "context");
        no8 no8Var = f32610a;
        if (no8Var != null) {
            return no8Var;
        }
        no8 k = h8s.k(context, "getHookALabelABV1", "[-1,-1]", "[-1,-1]", null, null, null, 112, null);
        f32610a = k;
        return k;
    }
}

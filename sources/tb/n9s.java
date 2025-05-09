package tb;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n9s INSTANCE = new n9s();

    static {
        t2o.a(839909964);
    }

    @Deprecated(message = "仅存量轻应用事件使用", replaceWith = @ReplaceWith(expression = "generateFireEventJs(event, params)", imports = {}))
    @JvmStatic
    public static final String a(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b1d2f31", new Object[]{str, json});
        }
        ckf.g(str, "event");
        ckf.g(json, "params");
        return "\n                (function() {\n                   var customEvent = new CustomEvent('message', { detail: " + ((Object) json.toJSONString()) + " });\n                   customEvent.origin = 'Triver';\n                   customEvent.data = {\"event\": \"" + str + "\"};\n                   dispatchEvent(customEvent);\n                })()\n            ";
    }

    @JvmStatic
    public static final String b(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f38e03d3", new Object[]{str, str2, json});
        }
        ckf.g(str, "target");
        ckf.g(str2, "event");
        ckf.g(json, "params");
        return "\n            (function() {\n                if (typeof " + str + " === 'undefined') {\n                    return;\n                }\n                " + str + ".dispatchEvent(new CustomEvent('" + str2 + "', { detail: " + ((Object) json.toJSONString()) + " }));\n            })()\n        ";
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50863f14", new Object[0]);
        }
        return ";window.__openWindowHook__=function(){var n=window.__windvane__.call,i=void 0;return function(o,_){_?i=o:i&&(o=i),window.__windvane__.call=function(i){for(var _=arguments.length,a=Array(_>1?_-1:0),d=1;d<_;d++)a[d-1]=arguments[d];[\"WVNative.openWindow\",\"Base.openWindow\"].indexOf(i)>-1&&o&&\"jump\"!==o.apply(void 0,a)||n.apply(this,arguments)}}}();\nwindow.__openWindowHook__(function(_,n,o){__windvane__.call('Triver.push',{url:_.url,type:'h5'},n,o)},1);";
    }

    @JvmStatic
    public static final String d(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6b7cbae", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        int e = INSTANCE.e(iTMSPage);
        return "document.documentElement.style.setProperty('--safe-area-inset-top', '" + e + "px');";
    }

    @JvmStatic
    public static final String f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd09e091", new Object[]{iTMSPage});
        }
        ckf.g(iTMSPage, "page");
        int e = INSTANCE.e(iTMSPage);
        boolean j = qml.j(iTMSPage);
        return "\n!(function(sbh,ims){var t=class{constructor(){this.height=0,this.width=0,this.left=0,this.top=0,this.items=[]}};var e=class extends EventTarget{constructor(){super(),this._titleBarHeight=44,this._safeAreaInsets=[sbh,0,0,0],this._immersive=ims,this._leftPanel=new t,this._centerPanel=new t,this._rightPanel=new t,this.addEventListener(\"updateNavbarPosition\",this._updateValues)}get titleBarHeight(){return this._titleBarHeight}get safeAreaInsetTop(){return this._safeAreaInsets[0]}get immersive(){return this._immersive}get leftPanel(){return this._leftPanel}get centerPanel(){return this._centerPanel}get rightPanel(){return this._rightPanel}_updateValues(_){let{titleBarHeight:i,safeAreaInsets:s,immersive:n,leftPanel:h,centerPanel:r,rightPanel:a}=_.detail;i&&(this._titleBarHeight=i),s&&(this._safeAreaInsets=s),n&&(this._immersive=n),h&&(this._leftPanel=h),r&&(this._centerPanel=r),a&&(this._rightPanel=a)}};navigator.navBarPosition=new e;})(" + e + ',' + j + ");\n    ";
    }

    public final int e(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("369e33aa", new Object[]{this, iTMSPage})).intValue();
        }
        Application M = iTMSPage.getInstance().M();
        if (!q9s.P1()) {
            return xcs.f(M, xcs.d(M));
        }
        if (iTMSPage.getPageParams().i()) {
            return xcs.f(M, xcs.d(M));
        }
        return 0;
    }
}

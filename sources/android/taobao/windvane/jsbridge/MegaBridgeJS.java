package android.taobao.windvane.jsbridge;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import kotlin.jvm.JvmStatic;
import tb.njg;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MegaBridgeJS {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MegaBridgeJS INSTANCE = new MegaBridgeJS();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f1775a = a.b(MegaBridgeJS$LAZY_BRIDGE_JS$2.INSTANCE);

    static {
        t2o.a(989856206);
    }

    public static final /* synthetic */ String a(MegaBridgeJS megaBridgeJS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4939d5a", new Object[]{megaBridgeJS});
        }
        return megaBridgeJS.d();
    }

    @JvmStatic
    public static final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd366b9f", new Object[0]);
        }
        return INSTANCE.b();
    }

    public final String b() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("b99e25af", new Object[]{this});
        } else {
            value = f1775a.getValue();
        }
        return (String) value;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d91096e2", new Object[]{this});
        }
        boolean z = vpw.commonConfig.D2;
        v7t.i("WindVane/Bridge", "enableNewMegaJSBridge: " + z);
        if (z) {
            return "\n    // Build Time: 2/7/2025, 4:35:26 PM\n    !function(){function n(t){return n=\"function\"==typeof Symbol&&\"symbol\"==typeof Symbol.iterator?function(n){return typeof n}:function(n){return n&&\"function\"==typeof Symbol&&n.constructor===Symbol&&n!==Symbol.prototype?\"symbol\":typeof n},n(t)}!function(t,o,i){var a=new Map,e=0,_=\"object\"===n(t.ucweb)&&\"object\"===n(t.__windvane_async__)&&\"function\"==typeof t.__windvane_async__.invokeNativeMethod&&void 0===t.__windvane_async__.onmessage,c=null!==(o=null==t||null===(i=t.performance)||void 0===i||null===(i=i.timing)||void 0===i?void 0:i.navigationStart)&&void 0!==o?o:Math.floor(65536*Math.random());function r(n,o,i,_){var r=\"cb_\".concat(c,\"_\").concat(e++);a.set(r,_);var l={ability:n,action:o,options:i,token:r};t.__windvane_async__.invokeNativeMethod(\"WVMega\",\"call\",JSON.stringify(l),r)}_&&(t.__windvane_async__.onmessage=function(n,t,o,i){var e=a.get(o);\"function\"==typeof e&&(\"string\"==typeof t&&(t=JSON.parse(t)),e(t.data),i||a.delete(o))}),t.__megability_bridge__={asyncCall:function(n,o,i,a){if(_)return r(n,o,i,a);\"string\"!=typeof i&&(i=JSON.stringify(i)),t.__windvane__.call(\"WVMega.call\",{ability:n,action:o,options:i},(function(n){var t=n.data;\"function\"==typeof a&&a(t)}),(function(n){var t=n.data;\"function\"==typeof a&&a(t)}))},syncCall:function(n,t,o){\"string\"!=typeof o&&(o=JSON.stringify(o));var i=__sync_mega__.nativeCall(n,t,o);try{i=JSON.parse(i)}catch(n){console.log(\"syncCall parse data error: \"+i)}return i}},t.__megability_bridge__.shouldUseNewAsyncCall=_,t.__megability_bridge__.sessionId=c}(window)}();\n    ";
        }
        return "\n        (function(win){win.__megability_bridge__={asyncCall:function asyncCall(a,b,c,d){if(typeof c!==\"string\"){c=JSON.stringify(c)}win.__windvane__.call(\"WVMega.call\",{ability:a,action:b,options:c},function(res){var data=res[\"data\"];if(typeof d===\"function\"){d(data)}},function(res){var data=res[\"data\"];if(typeof d===\"function\"){d(data)}})},syncCall:function syncCall(a,b,c){if(typeof c!==\"string\"){c=JSON.stringify(c)}var res=__sync_mega__.nativeCall(a,b,c);try{res=JSON.parse(res)}catch(e){console.log(\"syncCall parse data error: \"+res)}return res}}})(window);\n    ";
    }
}

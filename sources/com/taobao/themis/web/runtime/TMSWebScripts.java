package com.taobao.themis.web.runtime;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ckf;
import tb.i04;
import tb.msq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWebScripts {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_STATISTICS_JS = "!function(){\"use strict\";function t(e){return t=\"function\"==typeof Symbol&&\"symbol\"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&\"function\"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?\"symbol\":typeof t},t(e)}var e=\"complete\"===document.readyState,o=!1,n=function(){if(!o&&(o=!0,\"object\"===t(window.__sync_mega__))){var e,n,a,c,i={totalRequests:0,cacheHits:0,typeStats:{}},r=performance.getEntriesByType(\"navigation\").concat(performance.getEntriesByType(\"resource\")).reduce((function(t,e){var o=e.initiatorType,n=e.transferSize;return t.totalRequests+=1,0===n&&(t.cacheHits+=1),t.typeStats[o]||(t.typeStats[o]={totalRequests:0,cacheHits:0}),t.typeStats[o].totalRequests+=1,0===n&&(t.typeStats[o].cacheHits+=1),t}),i),s=Object.keys(r.typeStats).reduce((function(t,e){var o=r.typeStats[e],n=o.totalRequests,a=o.cacheHits;return t[e]=a/n,t}),{});e=\"Themis\",n=\"CacheHitRate\",a={cacheHitRate:r.cacheHits/r.totalRequests,typedCacheHitRate:s,webAppUrl:location.href},null===(c=window.__megability_bridge__)||void 0===c||c.asyncCall(\"appMonitor\",\"alarmSuccess\",{module:e,monitorPoint:n,args:a},(function(t){return console.log(t)}))}};e?n():window.addEventListener(\"load\",(function(){n()}))}();\n";
    public static final TMSWebScripts INSTANCE = new TMSWebScripts();
    public static final String OUTER_HTML_LENGTH_JS = "document.documentElement.outerHTML.length";

    static {
        t2o.a(850395174);
    }

    public final String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a4fddc3", new Object[]{this, list});
        }
        ckf.g(list, "requiredElements");
        return msq.i("\n    function checkRequiredElements(selectors) {\n      for (let i = 0; i < selectors.length; i++) {\n        const selector = selectors[i];\n        const element = document.querySelector(selector);\n        if (!element) {\n          return selector; // 只要找到一个不存在的元素就立即返回 false\n        }\n      }\n      return true; // 如果循环完成且没有返回 false，则表示所有元素都存在\n    }\n    checkRequiredElements([" + i04.j0(list, ",", null, null, 0, null, TMSWebScripts$getRequiredElementsCheckJS$1.INSTANCE, 30, null) + "]);\n            ");
    }
}

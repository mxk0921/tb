package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356587);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c608e9", new Object[0]);
        }
        if (!b()) {
            return "";
        }
        String d = d();
        String c = c();
        return "; window.domloadstart_taolivejscriptarray = " + d + ";; window.domloadend_taolivejscriptarray = " + c + ";;\n(function () {\n    function onDOMReady(callback) {\n        var list = window.domloadend_taolivejscriptarray\n        var readyRE = /complete|loaded|interactive/;\n        if (readyRE.test(document.readyState)) {\n            setTimeout(function () {\n                callback(list);\n            }, 1);\n        } else {\n            document.defaultView.addEventListener('DOMContentLoaded', function () {\n                callback(list);\n            }, false);\n        }\n    }\n    function loadScript(list) {\n        var jsArray = list;\n        for (var i in jsArray) {\n            var jsSrc = jsArray[i];\n            if (jsSrc && /^([\\w.+-]+:)(?:\\/\\/(?:[^\\/?#]*@|)([^\\/?#:]*)(?::(\\d+)|)|)/.test(jsSrc)) {\n                var script, head = document.head || document.documentElement;\n                script = document.createElement(\"script\");\n                script.async = true;\n                script.charset = \"UTF-8\";\n                script.src = jsSrc;\n                head.insertBefore(script, head.firstChild);\n            };\n        }\n    }\n\n    onDOMReady(loadScript);\n    async function downloadAndExecuteJS(urls) {\n        for (const url of urls) {\n            const response = await fetch(url);\n            const scriptText = await response.text();\n            eval(scriptText);\n        }\n    }\n    downloadAndExecuteJS(window.domloadstart_taolivejscriptarray);\n})();";
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929bfee8", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "taoliveWebLayerInjectJSEnable", "false"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a1b836f", new Object[0]);
        }
        return v2s.o().p().b("tblive", "taoliveWebLayerInjectJSArray", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8db74e63", new Object[0]);
        }
        return v2s.o().p().b("tblive", "taoliveWebLayerOnStartInjectJSArray", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
    }
}

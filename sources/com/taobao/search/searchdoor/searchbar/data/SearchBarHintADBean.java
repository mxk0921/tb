package com.taobao.search.searchdoor.searchbar.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.h19;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchBarHintADBean {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String KEY_CLICK_MODULE = "activationPageSearchButton";
    private static final String KEY_CLICK_PARAMS = "advClickTracking";
    private static final String KEY_CLICK_URL_PARAMS = "targetUrlParam";
    private static final String KEY_EXPOSURE_MODULE = "activationPageSearchbox";
    private static final String KEY_EXPOSURE_PARAMS = "advEventTracking";
    private static final String KEY_REQUEST_PARAMS = "requestParams";
    private String clickParams;
    private Map<String, String> clickUrlParams;
    private String exposureParams;
    private Map<String, String> requestParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793074);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ String a(a aVar, String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97ac13a0", new Object[]{aVar, str, str2, jSONObject});
            }
            return aVar.b(str, str2, jSONObject);
        }

        @JvmStatic
        public final String b(String str, String str2, JSONObject jSONObject) {
            JSONObject d;
            JSONObject d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d2781f98", new Object[]{this, str, str2, jSONObject});
            }
            JSONObject d3 = h19.d(jSONObject, str);
            if (d3 == null || d3.isEmpty() || (d = h19.d(d3, "clickParam")) == null || d.isEmpty() || (d2 = h19.d(d, "args")) == null || d2.isEmpty()) {
                return "";
            }
            return h19.i(d2, str2, "");
        }

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
            if (r8.isEmpty() == false) goto L_0x00ad;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean c(com.alibaba.fastjson.JSONObject r8) {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean.a.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0018
                java.lang.String r3 = "f2e377cd"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r1] = r7
                r4[r0] = r8
                java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
                com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean r8 = (com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean) r8
                return r8
            L_0x0018:
                r2 = 0
                if (r8 == 0) goto L_0x00b0
                boolean r3 = r8.isEmpty()
                if (r3 == 0) goto L_0x0023
                goto L_0x00b0
            L_0x0023:
                com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean r3 = new com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean
                r3.<init>()
                java.lang.String r4 = "activationPageSearchbox"
                java.lang.String r5 = "advEventTracking"
                java.lang.String r4 = r7.b(r4, r5, r8)
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x003a
                r3.setExposureParams(r4)
                r1 = 1
            L_0x003a:
                java.lang.String r4 = "advClickTracking"
                java.lang.String r5 = "activationPageSearchButton"
                java.lang.String r4 = r7.b(r5, r4, r8)
                boolean r6 = android.text.TextUtils.isEmpty(r4)
                if (r6 != 0) goto L_0x004c
                r3.setClickParams(r4)
                r1 = 1
            L_0x004c:
                com.alibaba.fastjson.JSONObject r8 = tb.h19.d(r8, r5)
                if (r8 == 0) goto L_0x00ac
                boolean r4 = r8.isEmpty()
                if (r4 != 0) goto L_0x00ac
                java.lang.String r4 = "targetUrlParam"
                com.alibaba.fastjson.JSONObject r4 = tb.h19.d(r8, r4)
                if (r4 == 0) goto L_0x0082
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L_0x0082
                java.util.Map r4 = tb.h19.b(r4)
                r3.setClickUrlParams(r4)
                java.util.Map r4 = r3.getClickUrlParams()
                if (r4 == 0) goto L_0x0082
                java.util.Map r4 = r3.getClickUrlParams()
                tb.ckf.d(r4)
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x0082
                r1 = 1
            L_0x0082:
                java.lang.String r4 = "requestParams"
                com.alibaba.fastjson.JSONObject r8 = tb.h19.d(r8, r4)
                if (r8 == 0) goto L_0x00ac
                boolean r4 = r8.isEmpty()
                if (r4 != 0) goto L_0x00ac
                java.util.Map r8 = tb.h19.b(r8)
                r3.setRequestParams(r8)
                java.util.Map r8 = r3.getRequestParams()
                if (r8 == 0) goto L_0x00ac
                java.util.Map r8 = r3.getRequestParams()
                tb.ckf.d(r8)
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x00ac
                goto L_0x00ad
            L_0x00ac:
                r0 = r1
            L_0x00ad:
                if (r0 == 0) goto L_0x00b0
                r2 = r3
            L_0x00b0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean.a.c(com.alibaba.fastjson.JSONObject):com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean");
        }
    }

    static {
        t2o.a(815793073);
    }

    @JvmStatic
    private static final String getAssignParamFromAssignModule(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2781f98", new Object[]{str, str2, jSONObject});
        }
        return a.a(Companion, str, str2, jSONObject);
    }

    @JvmStatic
    public static final SearchBarHintADBean parseADInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintADBean) ipChange.ipc$dispatch("f2e377cd", new Object[]{jSONObject});
        }
        return Companion.c(jSONObject);
    }

    public final String getClickParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96ad2e01", new Object[]{this});
        }
        return this.clickParams;
    }

    public final Map<String, String> getClickUrlParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c33d77df", new Object[]{this});
        }
        return this.clickUrlParams;
    }

    public final String getExposureParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df820c76", new Object[]{this});
        }
        return this.exposureParams;
    }

    public final Map<String, String> getRequestParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce7e99fb", new Object[]{this});
        }
        return this.requestParams;
    }

    public final void setClickParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56afc0fd", new Object[]{this, str});
        } else {
            this.clickParams = str;
        }
    }

    public final void setClickUrlParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29cf8f", new Object[]{this, map});
        } else {
            this.clickUrlParams = map;
        }
    }

    public final void setExposureParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218ba3c0", new Object[]{this, str});
        } else {
            this.exposureParams = str;
        }
    }

    public final void setRequestParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3f498b", new Object[]{this, map});
        } else {
            this.requestParams = map;
        }
    }
}

package android.taobao.windvane.jsbridge.api;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.iqm;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;
import tb.w7a;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPrefetch extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements w7a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1813a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(WVPrefetch wVPrefetch, WVCallBackContext wVCallBackContext, String str, String str2, String str3) {
            this.f1813a = wVCallBackContext;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // tb.w7a
        public void a(iqm iqmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ec50af4", new Object[]{this, iqmVar});
                return;
            }
            try {
                iqmVar.getClass();
                if (!TextUtils.isEmpty(null)) {
                    this.f1813a.success((String) null);
                    return;
                }
            } catch (Throwable unused) {
            }
            Map<String, Object> map = iqmVar.e;
            if (map instanceof JSONObject) {
                this.f1813a.success(((JSONObject) map).toJSONString());
            } else {
                this.f1813a.success(new JSONObject(iqmVar.e).toJSONString());
            }
            y71.commitWVPrefetchInfo(this.b, this.c, this.d, "getData", null, null, true);
        }

        @Override // tb.w7a
        public void b(iqm iqmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fecad463", new Object[]{this, iqmVar});
                return;
            }
            nsw nswVar = new nsw();
            nswVar.b("msg", iqmVar.d.a().getMsg());
            nswVar.b("code", iqmVar.d.a().getCode());
            this.f1813a.error(nswVar);
            y71.commitWVPrefetchInfo(this.b, this.c, this.d, "getData", iqmVar.d.a().getCode(), iqmVar.d.a().getMsg(), false);
        }
    }

    static {
        t2o.a(989856296);
    }

    private String getMatchingUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e8dfb3", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public static /* synthetic */ Object ipc$super(WVPrefetch wVPrefetch, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVPrefetch");
    }

    public void getData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d435db6e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                nsw nswVar = new nsw();
                nswVar.b("msg", "NO_WEBVIEW");
                wVCallBackContext.error(nswVar);
                return;
            }
            String url = webview.getUrl();
            String string = parseObject.getString("externalKey");
            String string2 = parseObject.getString("url");
            if (TextUtils.isEmpty(string2)) {
                string2 = webview.getUrl();
            }
            String matchingUrl = getMatchingUrl(string2);
            if (!TextUtils.isEmpty(string)) {
                matchingUrl = matchingUrl + "#" + string;
            }
            v7t.a(y71.MONITOR_POINT_WV_PREFETCH, "getData: " + matchingUrl);
            com.taobao.weaver.prefetch.a.d().c(matchingUrl, new a(this, wVCallBackContext, url, string2, string));
        } catch (Throwable th) {
            th.printStackTrace();
            nsw nswVar2 = new nsw();
            nswVar2.b("msg", "exception");
            nswVar2.b("code", "-1");
            wVCallBackContext.error(nswVar2);
        }
    }

    public void requestData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5c5ee7", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                return;
            }
            parseObject.put("userAgent", (Object) this.mWebView.getUserAgentString());
            v7t.a(y71.MONITOR_POINT_WV_PREFETCH, "requestData: " + string + " with params: " + parseObject.toJSONString());
            com.taobao.weaver.prefetch.a.d().f(string, parseObject);
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview != null) {
                y71.commitWVPrefetchInfo(webview.getUrl(), string, "", MtopAbility.API_REQUEST_DATA, null, null, true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            nsw nswVar = new nsw();
            nswVar.b("msg", "exception");
            nswVar.b("code", "-1");
            wVCallBackContext.error(nswVar);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getData".equals(str)) {
            getData(str2, wVCallBackContext);
        } else if (!MtopAbility.API_REQUEST_DATA.equals(str)) {
            return false;
        } else {
            requestData(str2, wVCallBackContext);
        }
        return true;
    }
}

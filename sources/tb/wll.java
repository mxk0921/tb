package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wll {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_TRACK_ID = "ali_trackid";
    public static final String SCROLL_TO_CAMPAIGN = "campaign";
    public static final String SCROLL_TO_HOME = "home";
    public static final String SCROLL_TO_RECMD = "recmd";

    /* renamed from: a  reason: collision with root package name */
    public final String f30767a;
    public String b;
    public final boolean c;
    public final Intent d;
    public final String e;

    static {
        t2o.a(729808976);
    }

    public wll(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            this.d = intent;
            this.c = Boolean.parseBoolean(data.getQueryParameter("forceRefresh"));
            String queryParameter = data.getQueryParameter("scrollto");
            this.f30767a = queryParameter;
            this.b = data.getQueryParameter("recmdparams");
            String queryParameter2 = data.getQueryParameter(ALI_TRACK_ID);
            this.e = queryParameter2;
            data.getQueryParameter("categoryTabId");
            a(data);
            hrg.e("intentProcess", "PageControlParams", "scrollTo : " + queryParameter + ", recmdParams : " + this.b + "， aLiTrackId ： " + queryParameter2);
        }
    }

    public final void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7654368d", new Object[]{this, uri});
        } else if (TextUtils.isEmpty(this.b)) {
            hrg.e("intentProcess", "PageControlParams", "recmdParams is empty");
        } else {
            try {
                String queryParameter = uri.getQueryParameter("_afc_params_json");
                hrg.e("intentProcess", "PageControlParams", "afcParams : " + queryParameter);
                JSONObject parseObject = JSON.parseObject(this.b);
                if (!parseObject.isEmpty()) {
                    JSONObject jSONObject = parseObject.getJSONObject("bizparams");
                    if (!jSONObject.isEmpty()) {
                        JSONObject parseObject2 = JSON.parseObject(queryParameter);
                        if (!parseObject2.isEmpty()) {
                            jSONObject.put("_afc_params_json", (Object) parseObject2);
                            parseObject.put("bizparams", (Object) jSONObject);
                            this.b = parseObject.toJSONString();
                        }
                    }
                }
            } catch (Throwable th) {
                bqa.d("PageControlParams", th.getMessage());
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "scrollTo : " + this.f30767a + ", recmdParams : " + this.b + ", forceRefresh : " + this.c;
    }
}

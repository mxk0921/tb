package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f25748a;
        public final /* synthetic */ JSONObject b;

        public a(Uri uri, JSONObject jSONObject) {
            this.f25748a = uri;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                k4v.d(this.f25748a, this.b);
            }
        }
    }

    static {
        t2o.a(473956356);
    }

    public static boolean b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbf02b6", new Object[]{context, uri})).booleanValue();
        }
        ym7.e("HomePage-MainActivityPub", " openUriWithinWebview uri = " + uri);
        try {
            if (Nav.from(context).toUri(uri)) {
                return true;
            }
            ym7.e("MainActivity3", " openUriWithinWebview jump failed !");
            return Nav.from(context).skipPreprocess().withCategory("com.taobao.intent.category.HYBRID_UI").toUri(uri);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, R.string.homepage_parse_data_error, 0).show();
            return false;
        }
    }

    public static void c(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2bd030", new Object[]{uri, jSONObject});
        } else if (f4b.b("enableHomePageJumpToNextPageCostOpt2", true)) {
            Coordinator.execute(new a(uri, jSONObject));
        } else {
            k4v.d(uri, jSONObject);
        }
    }

    public static boolean a(Context context, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a766e89", new Object[]{context, jSONObject})).booleanValue();
        }
        if (jSONObject == null || TextUtils.isEmpty(jSONObject.getString("targetUrl"))) {
            StringBuilder sb = new StringBuilder("item == null || TextUtils.isEmpty(item.getString(S_I_TARGET_URL))");
            if (jSONObject != null) {
                z = false;
            }
            sb.append(z);
            bqa.d("onItemClick", sb.toString());
            return false;
        }
        ym7.e("HomePage-MainActivityPub", "onCardItemClick item = " + jSONObject);
        try {
            String c = mqq.c(jSONObject.getString("targetUrl"));
            bqa.d("onItemClick", "onCardItemClick unescapeUrl = " + c);
            Uri parse = Uri.parse(c);
            c(parse, jSONObject);
            bqa.d("onItemClick", "MainActivityPub common click", "" + parse);
            return b(context, parse);
        } catch (Throwable th) {
            bqa.d("onItemClick", "出现异常" + th);
            Toast.makeText(context, R.string.homepage_parse_data_error, 0).show();
            return false;
        }
    }
}

package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jv4 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792930);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "CouponSRPNavPreProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || (data = intent.getData()) == null)) {
            String dataString = intent.getDataString();
            String str2 = "";
            if (dataString == null) {
                str = str2;
            } else {
                str = dataString;
            }
            String path = data.getPath();
            if (path != null) {
                str2 = path;
            }
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !ckf.b(str2, "/coudan/search_product.htm") || wsq.z0(str, new String[]{"?"}, false, 0, 6, null).size() < 2) {
                return true;
            }
            String m = o4p.m();
            if (TextUtils.isEmpty(m)) {
                return true;
            }
            Uri.Builder buildUpon = Uri.parse(m).buildUpon();
            Set<String> queryParameterNames = data.getQueryParameterNames();
            ckf.d(queryParameterNames);
            if (!queryParameterNames.isEmpty()) {
                for (String str3 : queryParameterNames) {
                    if (!TextUtils.isEmpty(str3)) {
                        String queryParameter = data.getQueryParameter(str3);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            buildUpon.appendQueryParameter(str3, queryParameter);
                        }
                    }
                }
            }
            intent.setData(buildUpon.build());
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}

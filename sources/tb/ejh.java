package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ejh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18616a;

    static {
        t2o.a(619708480);
    }

    public String a() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bb18822", new Object[]{this});
        }
        String str = this.f18616a;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String queryParameter = parse.getQueryParameter("wvLoginCallback");
        return TextUtils.isEmpty(queryParameter) ? parse.getQueryParameter("wvlogoutcallback") : queryParameter;
    }

    public String c(String str) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37e4e4d2", new Object[]{this, str});
        }
        String str2 = this.f18616a;
        if (str2 == null || (b = b(str2)) == -1 || 1 + b >= this.f18616a.length()) {
            return "";
        }
        String substring = this.f18616a.substring(b);
        int indexOf = substring.indexOf("&");
        if (indexOf != -1) {
            substring = substring.substring(0, indexOf);
        }
        try {
            return URLDecoder.decode(substring, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return substring;
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e74a974a", new Object[]{this, str})).intValue();
        }
        String[] strArr = {"TPL_redirect_url=", "tpl_redirect_url=", "redirectURL=", "redirect_url="};
        if (str != null && str.length() > 0) {
            for (int i = 0; i < 4; i++) {
                int indexOf = str.indexOf(strArr[i]);
                if (indexOf != -1) {
                    return indexOf + strArr[i].length();
                }
            }
        }
        return -1;
    }
}

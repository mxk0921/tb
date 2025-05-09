package android.taobao.windvane.extra.uc.prefetch;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import java.net.URLEncoder;
import tb.f7l;
import tb.t2o;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCDefaultUserAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String sUcImplVersion = null;
    public static final String VALUE = getDefaultUserAgent(getUcVersion());

    static {
        t2o.a(989856179);
    }

    private static String getDefaultUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dce0f20", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = Build.VERSION.RELEASE;
        if (str2.length() <= 0) {
            stringBuffer.append("1.0");
        } else if (Character.isDigit(str2.charAt(0))) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append("4.3");
        }
        stringBuffer.append("; zh-CN");
        String str3 = Build.MODEL;
        if (str3.length() > 0) {
            stringBuffer.append("; ");
            stringBuffer.append(str3);
        }
        String str4 = Build.ID;
        if (str4 != null && str4.length() > 0) {
            String encode = URLEncoder.encode(str4);
            stringBuffer.append(" Build/");
            stringBuffer.append(encode);
        }
        String str5 = "Mozilla/5.0 (Linux; U; Android " + ((Object) stringBuffer) + ") AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/100.0.4896.58 UWS/" + str + " Mobile Safari/537.36";
        try {
            String a2 = yaa.f().a();
            String b = yaa.f().b();
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b)) {
                str5 = str5 + " AliApp(" + a2 + "/" + b + f7l.BRACKET_END_STR;
            }
            String str6 = str5 + " UCBS/2.11.1.1";
            if (str6.contains("TTID/") || TextUtils.isEmpty(yaa.f().g())) {
                return str6;
            }
            return str6 + " TTID/" + yaa.f().g();
        } catch (Exception unused) {
            return str5;
        }
    }

    public static String getUcDetailVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("898ff9b6", new Object[0]);
        }
        if (!TextUtils.isEmpty(sUcImplVersion)) {
            return sUcImplVersion;
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            sUcImplVersion = iCoreVersion.version() + "." + iCoreVersion.buildTimestamp();
        }
        return sUcImplVersion;
    }

    private static String getUcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce1f0bc5", new Object[0]);
        }
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            return iCoreVersion.version();
        }
        return Build.Version.NAME;
    }
}

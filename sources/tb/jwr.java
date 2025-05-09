package tb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.UriUtil;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jwr implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894429);
        t2o.a(666894439);
    }

    public static String b(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9202817", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        if (str.indexOf("?") >= 0) {
            str4 = "&";
        } else {
            str4 = "?";
        }
        StringBuilder sb = new StringBuilder();
        if (!str2.endsWith("=")) {
            str2 = str2.concat("=");
        }
        int indexOf = str.indexOf(str2);
        if (indexOf > 0) {
            int i = indexOf - 1;
            if (str.startsWith("&", i) || str.startsWith("?", i)) {
                sb.append(str.substring(0, indexOf));
                sb.append(str2);
                sb.append(str3);
                int indexOf2 = str.indexOf("&", indexOf);
                if (indexOf2 > indexOf) {
                    sb.append(str.substring(indexOf2));
                }
                return sb.toString();
            }
        }
        sb.append(str);
        sb.append(str4);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    @Override // tb.xhp
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{this, str, map});
            return;
        }
        akp.h(str);
        if (ShareTargetType.Share2IShopping.getValue().equals(str)) {
            d();
        } else if (ShareTargetType.Share2IPresent.getValue().equals(str)) {
            TBS.Ext.commitEvent("Page_Extend", 19999, "ClickGiftFromShare");
            c();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4232a399", new Object[]{this});
            return;
        }
        TBShareContent e = bwr.h().e();
        Uri build = new Uri.Builder().scheme(Uri.parse(yaa.e()).getHost()).path("tbshare/gifts/index.html").appendQueryParameter(MspFlybirdDefine.FLYBIRD_MINIWIN, "share").appendQueryParameter("itemId", bwr.h().j()).build();
        Bundle bundle = new Bundle();
        bundle.putString(MspFlybirdDefine.FLYBIRD_MINIWIN, "share");
        Map<String, String> queryUrlParams = UriUtil.queryUrlParams(e.url);
        if (queryUrlParams != null) {
            for (Map.Entry<String, String> entry : queryUrlParams.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        if (e.extraParams != null) {
            for (Map.Entry<String, String> entry2 : queryUrlParams.entrySet()) {
                bundle.putString(entry2.getKey(), entry2.getValue());
            }
        }
        bundle.putString("itemId", bwr.h().j());
        Nav.from(hjp.a()).withExtras(bundle).toUri(build);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b0ef5", new Object[]{this});
            return;
        }
        Map<String, String> map = bwr.h().e().extraParams;
        String str = map != null ? map.get("guangShareUrl") : null;
        if (TextUtils.isEmpty(str)) {
            Nav.from(hjp.a()).toUri(new Uri.Builder().scheme(Uri.parse(yaa.e()).getHost()).path("guang/publish.html").appendQueryParameter(MspFlybirdDefine.FLYBIRD_MINIWIN, "share").appendQueryParameter("itemId", bwr.h().j()).build());
        } else {
            Nav.from(hjp.a()).toUri(b(b(str, MspFlybirdDefine.FLYBIRD_MINIWIN, "share"), "itemId", bwr.h().j()));
        }
    }
}

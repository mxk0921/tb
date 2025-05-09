package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import com.taobao.search.sf.widgets.onesearch.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gmo implements g1x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f20092a;
    public final a b;

    static {
        t2o.a(815793712);
        t2o.a(815792552);
    }

    public gmo(Activity activity, a aVar) {
        this.f20092a = activity;
        this.b = aVar;
    }

    public final String a(String str) {
        OneSearchBean J2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8738b9e6", new Object[]{this, str});
        }
        a aVar = this.b;
        if (aVar == null || (J2 = aVar.J2()) == null) {
            return str;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(h1p.LIST_PARAM_KEY, J2.keyword + "_" + J2.abtest + "_" + J2.rn);
        arrayMap.put(h1p.LIST_TYPE_KEY, "starshop");
        return f6p.a(str, arrayMap);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61c875c", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.T2();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d359d1fb", new Object[]{this});
        } else {
            this.b.show();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a440c0", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.U2();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c42789", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.V2();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8515761a", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.W2();
        }
    }

    public final Bundle b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("9a4ac065", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && "true".equals(f6p.f(str, "closeNavAnimation")) && Build.VERSION.SDK_INT >= 23) {
            return ActivityOptions.makeCustomAnimation(this.f20092a, 0, 0).toBundle();
        }
        return null;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78156ae6", new Object[]{this, str});
            return;
        }
        if (!(str == null || str.trim().length() == 0)) {
            int indexOf = str.indexOf("eurl=");
            int indexOf2 = str.indexOf("etype=");
            if (indexOf > 0 && indexOf < str.length() && indexOf2 > 0 && indexOf2 < str.length()) {
                str = MunionUrlBuilder.appendEparamsToTargetUrl(str, "", "", "mm_12852562_1778064_24868134");
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("ad_cid", vzo.o(Uri.parse(str).getQueryParameter(js0.E_URL)));
                arrayMap.put("url", str.substring(0, indexOf));
                sen.f("TopSale", arrayMap);
            }
        }
        String a2 = a(str);
        Bundle b = b(a2);
        Nav from = Nav.from(this.f20092a);
        if (b != null) {
            from.withOptions(b);
        }
        from.toUri(a2);
        b4p.a("lx", "tempUrl=" + a2);
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a5a9da1", new Object[]{this, str});
            return;
        }
        String b = yvr.b(str);
        b4p.a("lx", "tempUrl=" + str);
        Bundle bundle = new Bundle();
        bundle.putString("shop_id", b);
        if (!str.contains("shop.m.taobao.com")) {
            str = "http://shop" + str.substring(str.indexOf(".m.taobao.com"));
        }
        String queryParameter = Uri.parse(str).getQueryParameter(js0.E_URL);
        String appendEparamsToTargetUrl = MunionUrlBuilder.appendEparamsToTargetUrl(str, queryParameter, "1", "mm_12852562_1778064_24868134");
        ArrayMap arrayMap = new ArrayMap();
        int indexOf = appendEparamsToTargetUrl.indexOf("&eurl=");
        if (indexOf > 0 && indexOf < appendEparamsToTargetUrl.length()) {
            arrayMap.put("ad_cid", vzo.o(queryParameter));
            arrayMap.put("url", appendEparamsToTargetUrl.substring(0, indexOf));
        }
        sen.f("TopSale", arrayMap);
        String a2 = a(appendEparamsToTargetUrl);
        Bundle b2 = b(a2);
        Nav withExtras = Nav.from(this.f20092a).withExtras(bundle);
        if (b2 != null) {
            withExtras.withOptions(b2);
        }
        withExtras.toUri(a2);
    }
}

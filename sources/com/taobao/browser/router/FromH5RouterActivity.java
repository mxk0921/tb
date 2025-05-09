package com.taobao.browser.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.NavRouterActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import java.net.URISyntaxException;
import java.util.regex.Pattern;
import tb.acq;
import tb.ae2;
import tb.t2o;
import tb.v7t;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FromH5RouterActivity extends NavRouterActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_PARAM_ORDER_ITEM_DATA_OBJECT = "orderItemDataObject";

    /* renamed from: a  reason: collision with root package name */
    public static final String f10258a = "taobaointent";
    public static final String b = "/my/index.htm";
    public static final String c = "/cart/index.htm";
    public static final String d = "cart";
    public static final String e = "myTaobao";
    public static final String f = "orderList-5/-Z1";
    public static final String g = ae2.BizKeyOrderDetail;
    public static final String h = "h5.m.taobao.com";
    public static final String i = "tm.m.taobao.com";
    public static final String j = "/list.htm";
    public static final String k = "m.taobao.com";
    public static final String l = "5";

    public static /* synthetic */ Object ipc$super(FromH5RouterActivity fromH5RouterActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/router/FromH5RouterActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.android.nav.NavRouterActivity
    public Uri l3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3d306e7a", new Object[]{this, uri});
        }
        return t3(uri);
    }

    public final Intent m3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("ced87e19", new Object[]{this, uri});
        }
        Intent intent = new Intent();
        intent.setData(uri);
        return intent;
    }

    public final boolean n3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c905ef", new Object[]{this, uri})).booleanValue();
        }
        if (TextUtils.isEmpty("")) {
            return false;
        }
        if (Pattern.compile("").matcher(uri.toString()).matches()) {
            return true;
        }
        return false;
    }

    public final Uri o3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("1bf7747e", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        m3(uri);
        if (!TextUtils.isEmpty(fragment) && fragment.indexOf(d) < 0) {
            return null;
        }
        Nav.from(this).disallowLoopback().toUri(uri);
        return null;
    }

    @Override // com.taobao.android.nav.NavRouterActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.loading_mask_layout);
        BrowserUtil.b("FromH5RouterActivity", BrowserUtil.b, BrowserUtil.c, null, null);
    }

    public final Uri r3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e8863fd8", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        if (!TextUtils.isEmpty(fragment) && fragment.indexOf(e) >= 0) {
            Nav.from(this).toUri(uri);
            return null;
        } else if (!TextUtils.isEmpty(fragment) && fragment.indexOf(f) >= 0) {
            Nav.from(this).disallowLoopback().toUri(uri);
            return null;
        } else if (TextUtils.isEmpty(fragment) || fragment.indexOf(g) < 0) {
            Nav.from(this).disallowLoopback().toUri(uri);
            return null;
        } else {
            String[] split = fragment.split("-");
            if (split.length <= 2) {
                return null;
            }
            String str = split[1];
            Bundle bundle = new Bundle();
            bundle.putString("bizOrderId", str);
            Nav.from(this).withExtras(bundle).toUri(NavUrls.NAV_URL_ORDER_DETAIL);
            return null;
        }
    }

    public final Uri s3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("56ddc509", new Object[]{this, uri});
        }
        String path = uri.getPath();
        if (path == null || path.indexOf(j) < 0 || !l.equals(uri.getQueryParameter("statusId"))) {
            return null;
        }
        Nav.from(this).toUri(uri);
        return null;
    }

    public final Uri t3(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5628d6b8", new Object[]{this, uri});
        }
        String host = uri.getHost();
        Intent intent = getIntent();
        TBS.Ext.commitEvent(15311, "UseStat", "FromH5RouterActivity", uri.toString());
        try {
            str = intent.getStringExtra("share_trace_method");
        } catch (Exception unused) {
            str = "";
        }
        if ("client_direct".equals(str)) {
            TBS.Ext.commitEvent(5004, uri.toString());
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase(f10258a)) {
            if (host.equals(h)) {
                String path = uri.getPath();
                if (b.equals(path)) {
                    return r3(uri);
                }
                if (c.equals(path)) {
                    return o3(uri);
                }
            } else if (host.equals(i)) {
                return s3(uri);
            } else {
                if (host.equals(k)) {
                    return q3(uri);
                }
            }
            Nav.from(this).toUri(uri.toString());
            return null;
        }
        p3(uri);
        return null;
    }

    public final Uri q3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("89208d4b", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("weburl");
        if (!TextUtils.isEmpty(queryParameter)) {
            Nav.from(this).toUri(queryParameter);
        } else {
            String uri2 = uri.toString();
            if (TextUtils.isEmpty(uri2) || !uri2.contains("/?")) {
                v7t.a("parseMain", null);
                Nav.from(this).toUri("http://m.taobao.com/index.htm");
            } else {
                String substring = uri2.substring(uri2.indexOf("/?") + 1);
                Nav from = Nav.from(this);
                from.toUri("http://m.taobao.com/index.htm" + substring);
                v7t.a("parseMain", "http://m.taobao.com/index.htm" + substring);
            }
        }
        return null;
    }

    public void p3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ed9ba", new Object[]{this, uri});
        } else if (n3(uri)) {
            try {
                Intent parseUri = Intent.parseUri(uri.toString().trim().substring(15), 0);
                y71.commitFail("parseUri", 2, "parseUri", uri.toString().trim());
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                if (parseUri.resolveActivityInfo(getPackageManager(), 65536) != null) {
                    startActivity(parseUri);
                } else {
                    Bundle extras = parseUri.getExtras();
                    if (extras != null) {
                        String string = extras.getString("outUrl");
                        if (!TextUtils.isEmpty(string)) {
                            Intent m3 = m3(uri);
                            m3.putExtra(Constants.MYBROWSERURL, string);
                            m3.addCategory("com.taobao.intent.category.HYBRID_UI");
                            startActivity(m3);
                        }
                    }
                }
            } catch (URISyntaxException e2) {
                e2.printStackTrace();
            }
        }
    }

    static {
        t2o.a(619708624);
    }
}

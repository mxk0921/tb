package com.taobao.taobao.scancode.barcode.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.util.Scancode;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import tb.acq;
import tb.ey3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScancodeBrowserActivity extends ScancodeBaseBrowserActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String h = Globals.getApplication().getString(R.string.scancode_base_h5_url);

    static {
        t2o.a(760217640);
    }

    public static /* synthetic */ Object ipc$super(ScancodeBrowserActivity scancodeBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -773666671:
                return super.o3();
            case -307919876:
                super.w3();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/barcode/util/ScancodeBrowserActivity");
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

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public int n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4de83d6b", new Object[]{this})).intValue();
        }
        return R.layout.scancode_barcode_browser;
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public String o3() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this});
        }
        try {
            Uri data = getIntent().getData();
            if (data == null || !data.getPath().contains("/barcode/info")) {
                return super.o3();
            }
            String queryParameter = data.getQueryParameter("barcode");
            if (data.getQueryParameter("type") != null) {
                String str3 = data.getQueryParameter("linkUrl") + "&token=" + data.getQueryParameter("token");
                try {
                    if (TextUtils.isEmpty(data.getQueryParameter("setActionBarHide"))) {
                        return str3;
                    }
                    return str3 + "&setActionBarHide=true";
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                if (Scancode.e(queryParameter)) {
                    str = "2";
                } else {
                    str = "1";
                }
                return x3(h + "/app/smg/index.html?barcode=" + queryParameter + "&type=" + str + "&saveHistory=" + data.getQueryParameter("saveHistory") + "&utdid=" + UTDevice.getUtdid(getApplicationContext()), data.getQuery());
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        super.onCreateOptionsMenu(menu);
        return false;
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928d2679", new Object[]{this});
        }
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d36500", new Object[]{this});
            return;
        }
        this.b = (ImageView) findViewById(R.id.scancode_browser_bg);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_BarCodeDetail");
        ey3.g().h("Scan_Code_BrowserActivity");
    }

    @Override // com.taobao.taobao.scancode.barcode.util.ScancodeBaseBrowserActivity
    public void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda583fc", new Object[]{this});
        } else {
            super.w3();
        }
    }

    public final String x3(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b00e4b8", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str3 : str2.split("&", -1)) {
            String[] split2 = str3.split("=", -1);
            if (split2.length == 2 && str.indexOf(split2[0]) <= 0) {
                sb.append("&");
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}

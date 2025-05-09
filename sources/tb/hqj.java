package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hqj implements heb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20822a;

    static {
        t2o.a(967835676);
        t2o.a(985661532);
    }

    public hqj(Context context) {
        this.f20822a = context;
    }

    @Override // tb.heb
    public boolean clearNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd47acc", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean clearNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean clearNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b81447", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean pop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665cea26", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean setNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean setNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1d02f", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean setNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4ea752", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean setNavBarTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832309b", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean push(String str) {
        String optString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            optString = new JSONObject(str).optString("url", "");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        Uri parse = Uri.parse(optString);
        String scheme = parse.getScheme();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https")) {
            buildUpon.scheme("http");
        }
        return Nav.from(this.f20822a).toUri(buildUpon.toString());
    }
}

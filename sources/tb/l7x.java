package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l7x implements heb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f23164a;

    static {
        t2o.a(815793812);
        t2o.a(985661532);
    }

    public l7x(Activity activity) {
        this.f23164a = new WeakReference<>(activity);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            Activity activity = this.f23164a.get();
            if (activity != null) {
                Nav.from(activity).toUri(optString);
            } else {
                Nav.from(Globals.getApplication()).toUri(optString);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

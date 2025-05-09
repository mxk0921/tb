package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class cvw extends fzc implements heb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WXNavBarAdapter";
    private FragmentActivity mActivity;

    static {
        t2o.a(85983281);
        t2o.a(985661532);
    }

    public cvw(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public static /* synthetic */ Object ipc$super(cvw cvwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/bundle/WXNavBarAdapter");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mActivity = null;
        }
    }

    public FragmentActivity getFragmentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("69a6b743", new Object[]{this});
        }
        return this.mActivity;
    }

    @Override // tb.heb
    public boolean pop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665cea26", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public abstract void push(Activity activity, String str, JSONObject jSONObject);

    @Override // tb.heb
    public boolean push(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dc3a2f", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url", "");
                if (!TextUtils.isEmpty(optString)) {
                    Uri parse = Uri.parse(optString);
                    String scheme = parse.getScheme();
                    Uri.Builder buildUpon = parse.buildUpon();
                    if (!TextUtils.equals(scheme, "http") && !TextUtils.equals(scheme, "https")) {
                        buildUpon.scheme("http");
                    }
                    push(getFragmentActivity(), optString, jSONObject);
                }
            } catch (Exception e) {
                WXLogUtils.e(TAG, WXLogUtils.getStackTrace(e));
            }
        }
        return true;
    }
}

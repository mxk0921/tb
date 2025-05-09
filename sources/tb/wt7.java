package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wt7 extends uy<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String b;

    static {
        t2o.a(713031839);
    }

    public static /* synthetic */ Object ipc$super(wt7 wt7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/nav/list/DowngradeToListH5Task");
    }

    /* renamed from: f */
    public boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67bd026b", new Object[]{this, intent})).booleanValue();
        }
        String h = dbl.h();
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        this.b = h;
        return e(h);
    }

    /* renamed from: g */
    public boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82ca31ec", new Object[]{this, intent})).booleanValue();
        }
        String h = jql.h(intent);
        Uri parse = Uri.parse(this.b + "&tabCode=" + h);
        intent.setData(parse);
        if (parse != null) {
            str = parse.toString();
        } else {
            str = "";
        }
        lor.c(CoreConstants.NAV_TAG, "DowngradeToListH5Task", str);
        return true;
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8c8c1c9", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return "true".equals(Uri.parse(str).getQueryParameter("hybrid"));
        }
        return false;
    }
}

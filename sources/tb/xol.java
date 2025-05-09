package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c517892d", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName();
    }

    public static String b(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a538cccf", new Object[]{activity});
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return "";
        }
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            return dataString;
        }
        return "";
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e15777aa", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getSimpleName();
    }
}

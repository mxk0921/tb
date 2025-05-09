package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fy3 INSTANCE = new fy3();

    static {
        t2o.a(815793476);
    }

    @JvmStatic
    public static final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c5ca60", new Object[]{str, str2});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("class", str2);
        if (TextUtils.isEmpty(str)) {
            str = "TBSearch_Default";
        }
        sen.i(str, "Code_Offline", arrayMap, null);
    }
}

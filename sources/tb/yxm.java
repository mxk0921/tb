package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(mdd mddVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8207eab", new Object[]{mddVar, str, obj});
        } else if (mddVar != null && !TextUtils.isEmpty(str) && obj != null) {
            mddVar.a(str, obj);
        }
    }

    public static void b(mdd mddVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abccca8", new Object[]{mddVar, str, obj});
        } else if (mddVar != null && !TextUtils.isEmpty(str) && obj != null && !TextUtils.isEmpty(obj.toString())) {
            mddVar.a(str, obj);
        }
    }

    public static void c(mdd mddVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6f3a76", new Object[]{mddVar, str, new Long(j)});
        } else if (mddVar != null && !TextUtils.isEmpty(str) && j > 0) {
            mddVar.j(str, j);
        }
    }
}

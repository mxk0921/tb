package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a96c271", new Object[]{str, mtopResponse});
        } else if (!TextUtils.isEmpty(str) && mtopResponse != null) {
            r7j.e(str, mtopResponse);
        }
    }

    public static void b(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7464baac", new Object[]{str, mtopResponse});
        } else if (!TextUtils.isEmpty(str) && mtopResponse != null) {
            r7j.f(str, mtopResponse);
        }
    }
}

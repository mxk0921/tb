package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(438304811);
    }

    public static String a(String str, BTags... bTagsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aab0d1fe", new Object[]{str, bTagsArr});
        }
        StringBuilder sb = new StringBuilder();
        for (BTags bTags : bTagsArr) {
            sb.append(bTags.tagName);
        }
        sb.append(str);
        return sb.toString();
    }
}

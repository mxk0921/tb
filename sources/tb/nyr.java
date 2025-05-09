package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nyr implements y8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f25037a;

    static {
        t2o.a(668991556);
        t2o.a(613417023);
    }

    public nyr(String... strArr) {
        this.f25037a = strArr;
    }

    @Override // tb.y8l
    public void onConfigUpdate(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (strArr = this.f25037a) != null) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    myr.e().d(str);
                }
            }
        }
    }
}

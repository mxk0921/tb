package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21021a;

    static {
        t2o.a(815793257);
    }

    public i0p(String str) {
        this.f21021a = str;
    }

    public static i0p a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0p) ipChange.ipc$dispatch("f544bdbd", new Object[]{str});
        }
        return new i0p(str);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f21021a) || this.f21021a.length() == 0) {
            return true;
        }
        return false;
    }
}

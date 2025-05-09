package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u3x implements bgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.bgb
    public abe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abe) ipChange.ipc$dispatch("32a4839d", new Object[]{this});
        }
        return b("weex_page");
    }

    public abe b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (abe) ipChange.ipc$dispatch("af404ee2", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return new f97();
        }
        str.hashCode();
        if (!str.equals("WindVane.H5")) {
            if (!str.equals("WindVane.UCT2")) {
                if (o48.e) {
                    return new w7x(str);
                }
                return new f97();
            } else if (o48.g) {
                return new w7x(str);
            } else {
                return new f97();
            }
        } else if (o48.f) {
            return new w7x(str);
        } else {
            return new f97();
        }
    }
}

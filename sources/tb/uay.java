package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uay implements ead {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705318);
        t2o.a(511705484);
    }

    @Override // tb.ead
    public r9g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r9g) ipChange.ipc$dispatch("1a912e8b", new Object[]{this, str});
        }
        str.hashCode();
        if (!str.equals("EmptyPlugin")) {
            return null;
        }
        return new xc8();
    }
}

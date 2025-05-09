package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793741);
    }

    public gml(int i) {
    }

    public static gml a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gml) ipChange.ipc$dispatch("179a8f8", new Object[]{new Integer(i)});
        }
        return new gml(i);
    }
}

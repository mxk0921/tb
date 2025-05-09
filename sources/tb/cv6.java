package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17345a;

    static {
        t2o.a(961544358);
    }

    public cv6(String str) {
        this.f17345a = str;
        String[] split = str.split("_");
        if (split != null && split.length >= 6) {
            wyv.o(split[1]);
            wyv.o(split[2]);
            wyv.o(split[3]);
            wyv.o(split[4]);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.f17345a;
    }
}

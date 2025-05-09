package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class drs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18031a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;

    static {
        t2o.a(1032847422);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabPageInfo{pageUrl='" + this.f18031a + "', pageType='" + this.b + "', preRequestAPI='" + this.c + "', apiVersion='" + this.d + "', apiParams='" + this.e + "', zacheSourceName='" + this.f + "', utParams='null', extParams='" + this.g + "', vsersion=" + this.h + '}';
    }
}

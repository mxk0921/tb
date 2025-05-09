package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class upl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_DM = 1;
    public static final int TYPE_HUC = 2;
    public static final int TYPE_TNET = 3;

    /* renamed from: a  reason: collision with root package name */
    public String f29547a;
    public String g;
    public int b = 10;
    public int c = 7;
    public int d = 1;
    public final int e = 1;
    public boolean f = false;
    public boolean h = true;
    public final String i = "";
    public int j = 3;
    public boolean k = true;
    public String l = "";

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Param{priority=" + this.b + ", network=" + this.c + ", callbackCondition=" + this.d + ", callbackType=" + this.e + ", fileStorePath='" + this.g + "'}";
    }
}

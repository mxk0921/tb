package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BLUR_HEIGHT_DP = 20;
    public static final int DEFAULT_COVER_BLUR_HEIGHT_DP = 30;
    public static final int TYPE_ACTION_BAR = 1;
    public static final int TYPE_HEADER = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f28850a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    static {
        t2o.a(464519255);
    }

    public tot(String str, int i) {
        this.f28850a = str;
        this.c = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ThemeConfig{biz='" + this.f28850a + "', viewType=" + this.b + ", height=" + this.c + ", skinHeight=" + this.d + ", minHeight=" + this.e + ", useConvert=" + this.f + ", coverColor=" + this.g + ", coverHeight=" + this.h + ", useBlur=" + this.j + ", blurHeight=" + this.k + '}';
    }

    public tot(String str, int i, int i2) {
        this.f28850a = str;
        this.b = i;
        this.c = i2;
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26579a;
    public boolean b;
    public boolean d;
    public int e;
    public boolean c = true;
    public int f = 88;
    public int g = 71;

    static {
        t2o.a(468714095);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IVideoCommentSizeConfig{, isGuangguangTab3=" + this.f26579a + ", isImmersiveVideo=" + this.b + ", isHeightActionBar=" + this.c + ", isNeedSettingMarginTop=" + this.d + ", weexActionBarHeight=" + this.e + ", topbarHeight=" + this.f + ", topbarTopY=" + this.g + '}';
    }
}

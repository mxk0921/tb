package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x4m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int g = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f31144a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        t2o.a(352321799);
    }

    public x4m() {
        int i = g;
        this.e = i;
        this.f = i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.f31144a < 0 || TextUtils.isEmpty(this.b) || this.c < 0) {
            return false;
        }
        return true;
    }
}

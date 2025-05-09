package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class p9j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25964a;
    public final RectF b;
    public Bitmap c;
    public boolean d;
    public final String e;
    public boolean f;
    public Map<String, String> g;
    public final boolean h;
    public String i;
    public final boolean j;

    static {
        t2o.a(481297424);
    }

    public p9j(RectF rectF, boolean z, int i, String str) {
        this(rectF, z, i, str, false);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ea803a6", new Object[]{this})).booleanValue();
        }
        return pv8.REGION_SCAN.equals(this.e);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee685194", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public p9j(RectF rectF, boolean z, int i, String str, boolean z2) {
        this.i = "";
        this.e = pv8.REGION_SEARCH;
        this.f = false;
        this.g = null;
        this.j = false;
        this.b = rectF;
        this.h = z;
        this.f25964a = i;
        if (!TextUtils.isEmpty(str)) {
            this.e = str;
        }
        this.j = z2;
    }
}

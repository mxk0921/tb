package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m7k implements y7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23821a;
    public final boolean b;
    public final String c;

    static {
        t2o.a(404750497);
        t2o.a(404750496);
    }

    public m7k(String str) {
        this.c = str;
        if (TextUtils.isEmpty(str)) {
            this.f23821a = false;
            this.b = false;
            return;
        }
        if (str.startsWith(f7l.MOD)) {
            this.c = str.substring(1);
            this.f23821a = true;
        }
        if (this.c.endsWith(f7l.MOD)) {
            String str2 = this.c;
            this.c = str2.substring(0, str2.length() - 1);
            this.b = true;
        }
    }

    @Override // tb.y7d
    public boolean match(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("705b429a", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.c;
        if (str2 == null || str == null) {
            return false;
        }
        boolean z = this.f23821a;
        if (z && this.b) {
            return str.contains(str2);
        }
        if (z) {
            return str.endsWith(str2);
        }
        if (this.b) {
            return str.startsWith(str2);
        }
        return str.equals(str2);
    }
}

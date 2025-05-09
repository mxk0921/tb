package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31405a;
    public final String b;
    public final String c;
    public final String d;
    public final Intent e;
    public final String f;
    public final boolean g;
    public String h;

    public xhq(String str, String str2, boolean z, String str3, Intent intent, boolean z2, String str4) {
        this.f31405a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = intent;
        this.f = str4;
        this.g = z2;
    }

    public static xhq a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("986e4ac8", new Object[]{str});
        }
        return new xhq(str);
    }

    public static xhq b(String str, String str2, boolean z, String str3, Intent intent, boolean z2, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhq) ipChange.ipc$dispatch("6488e97b", new Object[]{str, str2, new Boolean(z), str3, intent, new Boolean(z2), str4});
        }
        return new xhq(str, str2, z, str3, intent, z2, str4);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "StartupContext{packageName='" + this.b + "', processName='" + this.c + "', referrer='" + this.d + "', intent=" + this.e + ", launchSource='" + this.f + "', fromActivity='" + this.f31405a + "', deathRecovery='" + this.g + "'}";
    }

    public xhq(String str, String str2, String str3, Intent intent, boolean z) {
        this(str, str2, true, str3, intent, z, null);
    }

    public xhq(String str) {
        this(null, null, false, null, null, false, str);
    }
}

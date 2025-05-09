package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xh8 extends dy1<xh8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31397a;

    static {
        t2o.a(83886304);
    }

    public xh8(String str, String str2, String str3) {
        super(str, str2, str3);
        sampling(1.0f);
    }

    public static xh8 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh8) ipChange.ipc$dispatch("2318e652", new Object[]{str});
        }
        return new xh8(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static xh8 b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh8) ipChange.ipc$dispatch("4499333e", new Object[]{str, str2, str3});
        }
        return new xh8(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(xh8 xh8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/tracker/model/ErrorModel");
    }

    public xh8 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh8) ipChange.ipc$dispatch("f8630b59", new Object[]{this, str});
        }
        this.f31397a = str;
        return this;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        String str = this.f31397a;
        if (str == null) {
            return "defaultErrorCode";
        }
        return str;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        return "";
    }

    /* renamed from: f */
    public xh8 message(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh8) ipChange.ipc$dispatch("36811ba7", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    /* renamed from: g */
    public xh8 sampling(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xh8) ipChange.ipc$dispatch("2942642d", new Object[]{this, new Float(f)});
        }
        this.sampling = f;
        return this;
    }
}

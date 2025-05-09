package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wh8 extends cy1<wh8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String g;
    public String h;

    static {
        t2o.a(794820627);
    }

    public wh8(String str, String str2, String str3) {
        super(str, str2, str3);
        q(1.0f);
    }

    public static /* synthetic */ Object ipc$super(wh8 wh8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/tracker/model/ErrorModel");
    }

    public static wh8 j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("488b13bb", new Object[]{str});
        }
        return new wh8(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static wh8 k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("b2bd5a7", new Object[]{str, str2, str3});
        }
        return new wh8(str, str2, str3);
    }

    public wh8 l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("f3e01302", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }

    public wh8 m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("1f3e6db0", new Object[]{this, str});
        }
        this.h = str;
        return this;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        String str = this.g;
        if (str == null) {
            return "defaultErrorCode";
        }
        return str;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        String str = this.h;
        if (str == null) {
            return "";
        }
        return str;
    }

    public wh8 p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("22bb47d0", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public wh8 q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wh8) ipChange.ipc$dispatch("6a4c86d6", new Object[]{this, new Float(f)});
        }
        this.b = f;
        return this;
    }
}

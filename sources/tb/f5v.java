package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f19033a = new StringBuilder();

    static {
        t2o.a(668991614);
    }

    public f5v a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5v) ipChange.ipc$dispatch("65327001", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        StringBuilder sb = this.f19033a;
        sb.append("#");
        sb.append(str);
        return this;
    }

    public f5v b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5v) ipChange.ipc$dispatch("c75f3459", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        this.f19033a.append(str);
        return this;
    }

    public f5v c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5v) ipChange.ipc$dispatch("9d04e56", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        this.f19033a.append(str);
        return this;
    }

    public f5v d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5v) ipChange.ipc$dispatch("aaef445", new Object[]{this, str});
        }
        if (f(str)) {
            return this;
        }
        StringBuilder sb = this.f19033a;
        sb.append("?");
        sb.append(str);
        return this;
    }

    public f5v e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f5v) ipChange.ipc$dispatch("6c9cf956", new Object[]{this, str});
        }
        if (f(str)) {
            this.f19033a.append(itw.URL_SEPARATOR);
            return this;
        }
        StringBuilder sb = this.f19033a;
        sb.append(str);
        sb.append(HttpConstant.SCHEME_SPLIT);
        return this;
    }

    public final boolean f(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf455f", new Object[]{this, str})).booleanValue();
        }
        if (!(str == null || (length = str.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f19033a.toString();
    }
}

package tb;

import android.util.Printer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x5s implements Printer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f31168a = new StringBuilder();
    private final String b;

    public x5s(String str) {
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("610e5d44", new Object[]{this});
        }
        return this.f31168a.toString();
    }

    @Override // android.util.Printer
    public void println(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c611640", new Object[]{this, str});
            return;
        }
        whh.a(this.b, str);
        this.f31168a.append(str);
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class g19 implements cw9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMMON_TOTAL_LENGTH = 250;

    /* renamed from: a  reason: collision with root package name */
    public final Object f19677a = new Object();
    public StringBuilder b;
    public Formatter c;

    public String d(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb8d953", new Object[]{this, str, objArr});
        }
        synchronized (this.f19677a) {
            try {
                StringBuilder sb = this.b;
                if (sb == null) {
                    this.b = new StringBuilder(250);
                } else {
                    sb.setLength(0);
                }
                if (this.c == null) {
                    this.c = new Formatter(this.b, Locale.getDefault());
                }
                this.c.format(str, objArr);
                substring = this.b.substring(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return substring;
    }
}

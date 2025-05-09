package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pcq implements ocq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f26016a;
    public final String b;
    public Object c;

    static {
        t2o.a(676331555);
        t2o.a(676331554);
    }

    public pcq(File file, String str) {
        if (file != null) {
            this.f26016a = file;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    @Override // tb.ocq
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abab189", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    @Override // tb.ocq
    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2918b6ba", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ocq
    public final File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a6465ae6", new Object[]{this});
        }
        return this.f26016a;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return ((this.f26016a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String valueOf = String.valueOf(this.f26016a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + String.valueOf(str).length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

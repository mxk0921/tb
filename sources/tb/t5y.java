package tb;

import com.alibaba.jsi.standard.JNIBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class t5y extends OutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f28507a = "";
    public final Object[] b = new Object[1];

    static {
        t2o.a(921698324);
    }

    public static /* synthetic */ Object ipc$super(t5y t5yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/e");
    }

    public final void b(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!"\n".equals(str)) {
            String str2 = this.f28507a + str;
            this.f28507a = str2;
            z = str2.endsWith("\n");
        }
        if (z) {
            Object[] objArr = this.b;
            objArr[0] = this.f28507a;
            if (0 == JNIBridge.nativeCommand(12L, 6L, objArr)) {
                a0y.o(this.f28507a);
            }
            this.f28507a = "";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            b(String.format(Locale.US, "%c", Integer.valueOf(i)));
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            b(new String(bArr));
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else {
            b(new String(bArr, i, i2));
        }
    }
}

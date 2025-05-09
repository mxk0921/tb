package tb;

import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t9o implements swn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BYTE_ARRAY = 1;
    public static final int TYPE_INPUT_STREAM = 3;

    /* renamed from: a  reason: collision with root package name */
    public final int f28582a;
    public final int b;
    public final byte[] c;
    public final int d;
    public final InputStream e;
    public final TypedValue f;

    static {
        t2o.a(620757089);
    }

    public t9o(byte[] bArr, int i, int i2) {
        this(1, bArr, i, null, i2, null);
    }

    @Override // tb.swn
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public t9o(InputStream inputStream, int i) {
        this(3, null, 0, inputStream, i, null);
    }

    public t9o(InputStream inputStream, int i, TypedValue typedValue) {
        this(3, null, 0, inputStream, i, typedValue);
    }

    public t9o(int i, byte[] bArr, int i2, InputStream inputStream, int i3, TypedValue typedValue) {
        this.f28582a = i;
        this.c = bArr;
        this.d = i2;
        this.e = inputStream;
        this.b = i3;
        this.f = typedValue;
    }
}

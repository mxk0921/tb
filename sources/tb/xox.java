package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.jni.PailitaoCUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xox {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_NOT_STAND_YET = 0;
    public static final int RESULT_RESET = -1;
    public static final int RESULT_STAND = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f31502a;
    public final int b;
    public final boolean[] c;
    public final byte[] d;
    public final int[] e;

    static {
        t2o.a(482345013);
    }

    public xox(int i, int i2, int i3, long j) {
        this.f31502a = i;
        this.b = i2;
        this.c = new boolean[i * i];
        this.d = new byte[((i * i) * 3) / 2];
        this.e = new int[i * i];
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                int i = this.f31502a;
                int i2 = i * i;
                for (int i3 = 0; i3 < i2; i3++) {
                    this.c[i3] = false;
                    this.e[i3] = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(byte[] bArr, int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd536c11", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).booleanValue();
        }
        try {
            byte[] bArr2 = this.d;
            int i3 = this.f31502a;
            PailitaoCUtil.h(bArr, i, i2, 0, 0, i, i2, 0, bArr2, i3, i3);
            synchronized (this) {
                try {
                    int i4 = this.f31502a;
                    int i5 = i4 * i4;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        byte b = this.d[i7];
                        i6 += b;
                        this.e[i7] = b;
                    }
                    int i8 = i6 / i5;
                    int i9 = 0;
                    for (int i10 = 0; i10 < i5; i10++) {
                        if (this.c[i10] != (this.e[i10] >= i8)) {
                            i9++;
                        }
                    }
                    if (i9 > this.b) {
                        for (int i11 = 0; i11 < i5; i11++) {
                            this.c[i11] = this.e[i11] >= i8;
                        }
                    }
                    if (i9 < this.b) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        } catch (Exception e) {
            agh.d("YuvDiffChecker", "sameWithLast", e);
            return false;
        }
    }
}

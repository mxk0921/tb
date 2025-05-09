package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.performance.cpu.ParseException;
import java.nio.CharBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cd9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f16990a;
    public final int c;
    public char d;
    public char e;
    public int b = -1;
    public boolean f = true;
    public boolean g = false;

    public cd9(byte[] bArr, int i) {
        this.f16990a = bArr;
        this.c = i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
        }
        if (!this.f) {
            return false;
        }
        int i = this.b;
        int i2 = this.c;
        if (i <= i2 - 1 && i < i2 - 1) {
            return true;
        }
        return false;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
            return;
        }
        int i = this.b + 1;
        this.b = i;
        this.e = this.d;
        this.d = (char) this.f16990a[i];
        this.g = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r2 != false) goto L_0x0053;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        return r3 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        throw new java.lang.RuntimeException("Couldn't read number because the file ended!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c() {
        /*
            r10 = this;
            r0 = 48
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.cd9.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r0 = "217a457a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            java.lang.Object r0 = r3.ipc$dispatch(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L_0x001b:
            r3 = 1
            r5 = 0
        L_0x001f:
            boolean r7 = r10.a()
            if (r7 == 0) goto L_0x004e
            r10.b()
            char r7 = r10.d
            if (r7 < r0) goto L_0x0038
            r8 = 57
            if (r7 > r8) goto L_0x0038
            r8 = 10
            long r5 = r5 * r8
            int r7 = r7 - r0
            long r7 = (long) r7
            long r5 = r5 + r7
            goto L_0x0041
        L_0x0038:
            if (r2 == 0) goto L_0x004b
            r2 = 45
            if (r7 != r2) goto L_0x0043
            r2 = -1
            r3 = r2
        L_0x0041:
            r2 = 0
            goto L_0x001f
        L_0x0043:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't read number!"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            r10.g()
        L_0x004e:
            if (r2 != 0) goto L_0x0053
            long r3 = r3 * r5
            return r3
        L_0x0053:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't read number because the file ended!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cd9.c():long");
    }

    public CharBuffer d(char c, CharBuffer charBuffer) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharBuffer) ipChange.ipc$dispatch("4477c249", new Object[]{this, new Character(c), charBuffer});
        }
        charBuffer.clear();
        while (true) {
            if (!a()) {
                break;
            }
            b();
            if (c != this.d) {
                if (!charBuffer.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.d);
                z = false;
            } else if (z) {
                return charBuffer;
            } else {
                g();
            }
        }
        if (!z) {
            charBuffer.flip();
            return charBuffer;
        }
        throw new RuntimeException("Couldn't read string because file ended!");
    }

    public CharBuffer e(CharBuffer charBuffer) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharBuffer) ipChange.ipc$dispatch("86d9900f", new Object[]{this, charBuffer});
        }
        charBuffer.clear();
        while (true) {
            if (!a()) {
                break;
            }
            b();
            if (!Character.isWhitespace(this.d)) {
                if (!charBuffer.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.d);
                z = false;
            } else if (!z) {
                g();
            } else {
                throw new RuntimeException("Couldn't read string!");
            }
        }
        if (!z) {
            charBuffer.flip();
            return charBuffer;
        }
        throw new RuntimeException("Couldn't read string because file ended!");
    }

    public cd9 f() throws ParseException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cd9) ipChange.ipc$dispatch("6af90ffe", new Object[]{this});
        }
        if (this.f16990a == null || this.c <= 0) {
            throw new RuntimeException("can not parse null buffer.");
        }
        this.f = true;
        this.b = -1;
        this.d = (char) 0;
        this.e = (char) 0;
        this.g = false;
        return this;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
        } else if (!this.g) {
            this.b--;
            this.d = this.e;
            this.g = true;
        } else {
            throw new RuntimeException("Can only rewind one step!");
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426b85b4", new Object[]{this});
        } else {
            i('(');
        }
    }

    public void i(char c) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9b945", new Object[]{this, new Character(c)});
            return;
        }
        while (a()) {
            b();
            if (this.d == c) {
                z = true;
            } else if (z) {
                g();
                return;
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0513", new Object[]{this});
        } else {
            i(' ');
        }
    }
}

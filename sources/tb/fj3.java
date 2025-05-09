package tb;

import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fj3 extends dj3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f19336a;
    public final int b;
    public boolean c;
    public int d;

    public fj3(char c, char c2, int i) {
        this.f19336a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? ckf.i(c, c2) >= 0 : ckf.i(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = !z ? c2 : c;
    }

    @Override // tb.dj3
    public char a() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.f19336a + i;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }
}

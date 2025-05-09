package tb;

import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zdf extends tdf {

    /* renamed from: a  reason: collision with root package name */
    public final int f32694a;
    public final int b;
    public boolean c;
    public int d;

    public zdf(int i, int i2, int i3) {
        this.f32694a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = !z ? i2 : i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    @Override // tb.tdf
    public int nextInt() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.f32694a + i;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}

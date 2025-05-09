package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class tpg implements Iterator<String>, rzf {
    @Deprecated
    public static final int EXHAUSTED = 2;
    @Deprecated
    public static final int HAS_NEXT = 1;
    @Deprecated
    public static final int UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f28857a;
    public int b;
    public int c;
    public int d;
    public int e;

    public tpg(CharSequence charSequence) {
        ckf.g(charSequence, "string");
        this.f28857a = charSequence;
    }

    /* renamed from: a */
    public String next() {
        if (hasNext()) {
            this.b = 0;
            int i = this.d;
            int i2 = this.c;
            this.c = this.e + i;
            return this.f28857a.subSequence(i2, i).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            int i3 = 2;
            if (this.e < 0) {
                this.b = 2;
                return false;
            }
            CharSequence charSequence = this.f28857a;
            int length = charSequence.length();
            int length2 = charSequence.length();
            for (int i4 = this.c; i4 < length2; i4++) {
                char charAt = charSequence.charAt(i4);
                if (charAt == '\n' || charAt == '\r') {
                    if (!(charAt == '\r' && (i = i4 + 1) < charSequence.length() && charSequence.charAt(i) == '\n')) {
                        i3 = 1;
                    }
                    length = i4;
                    this.b = 1;
                    this.e = i3;
                    this.d = length;
                    return true;
                }
            }
            i3 = -1;
            this.b = 1;
            this.e = i3;
            this.d = length;
            return true;
        } else if (i2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

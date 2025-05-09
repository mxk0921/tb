package tb;

import java.util.Arrays;
import java.util.Comparator;
import tb.k1n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class eg8<E extends k1n> {
    public static final Comparator<k1n> e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f18556a;
    public final int[] b;
    public final E[] c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparator<k1n> {
        /* renamed from: a */
        public int compare(k1n k1nVar, k1n k1nVar2) {
            return k1nVar.getValue() - k1nVar2.getValue();
        }
    }

    public eg8(Class<E> cls) {
        this.f18556a = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.c = enumConstants;
        Arrays.sort(enumConstants, e);
        int length = enumConstants.length;
        if (enumConstants[0].getValue() == 1 && enumConstants[length - 1].getValue() == length) {
            this.d = true;
            this.b = null;
            return;
        }
        this.d = false;
        this.b = new int[length];
        for (int i = 0; i < length; i++) {
            this.b[i] = this.c[i].getValue();
        }
    }

    public E a(int i) {
        int i2;
        if (this.d) {
            i2 = i - 1;
        } else {
            i2 = Arrays.binarySearch(this.b, i);
        }
        try {
            return this.c[i2];
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Unknown enum tag " + i + " for " + this.f18556a.getCanonicalName());
        }
    }

    public int b(E e2) {
        return e2.getValue();
    }
}

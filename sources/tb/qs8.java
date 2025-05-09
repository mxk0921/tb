package tb;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class qs8<T extends ExtendableMessage<?>> {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f26902a;
    public int b;

    public <E> qs8(b<T, E> bVar, E e) {
        this.f26902a = r0;
        Object[] objArr = {bVar, e};
        this.b = 1;
    }

    public <E> E a(b<T, E> bVar) {
        int binarySearch = Arrays.binarySearch(this.f26902a, 0, this.b, bVar);
        if (binarySearch < 0) {
            return null;
        }
        return (E) this.f26902a[this.b + binarySearch];
    }

    public b<T, ?> b(int i) {
        if (i >= 0 && i < this.b) {
            return (b) this.f26902a[i];
        }
        throw new IndexOutOfBoundsException("" + i);
    }

    public Object c(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            return this.f26902a[i2 + i];
        }
        throw new IndexOutOfBoundsException("" + i);
    }

    public List<b<T, ?>> d() {
        ArrayList arrayList = new ArrayList(this.b);
        for (int i = 0; i < this.b; i++) {
            arrayList.add((b) this.f26902a[i]);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final <E> void e(b<T, E> bVar, E e, int i) {
        Object[] objArr = this.f26902a;
        if (objArr.length < (this.b + 1) * 2) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        int i2 = this.b;
        if (i < i2) {
            System.arraycopy(this.f26902a, i2 + i, objArr, i2 + i + 2, i2 - i);
            System.arraycopy(this.f26902a, i, objArr, i + 1, this.b);
        } else {
            System.arraycopy(this.f26902a, i2, objArr, i2 + 1, i2);
        }
        int i3 = this.b + 1;
        this.b = i3;
        this.f26902a = objArr;
        objArr[i] = bVar;
        objArr[i3 + i] = e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qs8)) {
            return false;
        }
        qs8 qs8Var = (qs8) obj;
        if (this.b != qs8Var.b) {
            return false;
        }
        for (int i = 0; i < this.b * 2; i++) {
            if (!this.f26902a[i].equals(qs8Var.f26902a[i])) {
                return false;
            }
        }
        return true;
    }

    public <E> void f(b<T, E> bVar, E e) {
        int binarySearch = Arrays.binarySearch(this.f26902a, 0, this.b, bVar);
        if (binarySearch >= 0) {
            this.f26902a[this.b + binarySearch] = e;
        } else {
            e(bVar, e, -(binarySearch + 1));
        }
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.b * 2; i2++) {
            i = (i * 37) + this.f26902a[i2].hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String str = "";
        int i = 0;
        while (i < this.b) {
            sb.append(str);
            sb.append(((b) this.f26902a[i]).p());
            sb.append("=");
            sb.append(this.f26902a[this.b + i]);
            i++;
            str = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    public qs8(qs8<T> qs8Var) {
        this.f26902a = (Object[]) qs8Var.f26902a.clone();
        this.b = qs8Var.b;
    }
}

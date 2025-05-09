package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ExtendableMessage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ExtensionMap<T extends ExtendableMessage<?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object[] f3686a;
    public int b;

    public <E> ExtensionMap(Extension<T, E> extension, E e) {
        this.f3686a = r0;
        Object[] objArr = {extension, e};
        this.b = 1;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof ExtensionMap)) {
            return false;
        }
        ExtensionMap extensionMap = (ExtensionMap) obj;
        if (this.b != extensionMap.b) {
            return false;
        }
        for (int i = 0; i < this.b * 2; i++) {
            if (!this.f3686a[i].equals(extensionMap.f3686a[i])) {
                return false;
            }
        }
        return true;
    }

    public final <E> E get(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("50379710", new Object[]{this, extension});
        }
        int binarySearch = Arrays.binarySearch(this.f3686a, 0, this.b, extension);
        if (binarySearch < 0) {
            return null;
        }
        return (E) this.f3686a[this.b + binarySearch];
    }

    public final Extension<T, ?> getExtension(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("c4620302", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b) {
            return (Extension) this.f3686a[i];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public final Object getExtensionValue(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4fd55ebe", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < (i2 = this.b)) {
            return this.f3686a[i2 + i];
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public final List<Extension<T, ?>> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.b);
        for (int i = 0; i < this.b; i++) {
            arrayList.add((Extension) this.f3686a[i]);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b * 2; i2++) {
            i = (i * 37) + this.f3686a[i2].hashCode();
        }
        return i;
    }

    public final <E> void put(Extension<T, E> extension, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24a9de5", new Object[]{this, extension, e});
            return;
        }
        int binarySearch = Arrays.binarySearch(this.f3686a, 0, this.b, extension);
        if (binarySearch >= 0) {
            this.f3686a[this.b + binarySearch] = e;
            return;
        }
        int i = -(binarySearch + 1);
        Object[] objArr = this.f3686a;
        if (objArr.length < (this.b + 1) * 2) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        int i2 = this.b;
        if (i < i2) {
            System.arraycopy(this.f3686a, i2 + i, objArr, i2 + i + 2, i2 - i);
            System.arraycopy(this.f3686a, i, objArr, i + 1, this.b);
        } else {
            System.arraycopy(this.f3686a, i2, objArr, i2 + 1, i2);
        }
        int i3 = this.b + 1;
        this.b = i3;
        this.f3686a = objArr;
        objArr[i] = extension;
        objArr[i3 + i] = e;
    }

    public final int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String toString() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{");
        String str = "";
        while (i < this.b) {
            sb.append(str);
            sb.append(((Extension) this.f3686a[i]).getTag());
            sb.append("=");
            sb.append(this.f3686a[this.b + i]);
            i++;
            str = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    public ExtensionMap(ExtensionMap<T> extensionMap) {
        this.f3686a = (Object[]) extensionMap.f3686a.clone();
        this.b = extensionMap.b;
    }
}

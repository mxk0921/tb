package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.pg1;
import tb.vzf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00028\u00018VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", "V", "", "keys", "", "", pg1.ATOM_values, "index", "", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "getIndex", "()I", "key", "getKey$annotations", "()V", "getKey", "()Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "value", "getValue$annotations", "getValue", "getValues", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableMapEntry<K, V> implements Map.Entry<K, V>, vzf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] objArr, Object[] objArr2, int i) {
        ckf.g(objArr, "keys");
        ckf.g(objArr2, pg1.ATOM_values);
        this.keys = objArr;
        this.values = objArr2;
        this.index = i;
    }

    public static /* synthetic */ void getKey$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244ade30", new Object[0]);
        }
    }

    public static /* synthetic */ void getValue$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341d62c2", new Object[0]);
        }
    }

    public final int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ipChange.ipc$dispatch("24024602", new Object[]{this});
        }
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("74f99212", new Object[]{this});
        }
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("ae762540", new Object[]{this});
        }
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b40eb7e0", new Object[]{this, v});
        }
        Object[] objArr = this.values;
        int i = this.index;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }
}

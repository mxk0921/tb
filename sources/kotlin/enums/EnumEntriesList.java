package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import tb.c20;
import tb.ckf;
import tb.fg8;
import tb.ic1;
import tb.pg1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "", "T", "Ltb/fg8;", "Ltb/c20;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", pg1.ATOM_EXT_entries, "<init>", "([Ljava/lang/Enum;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "index", "get", "(I)Ljava/lang/Enum;", "element", "", "contains", "(Ljava/lang/Enum;)Z", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Enum;)I", pg1.ATOM_EXT_lastIndexOf, "[Ljava/lang/Enum;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class EnumEntriesList<T extends Enum<T>> extends c20<T> implements fg8<T>, Serializable {
    private final T[] entries;

    public EnumEntriesList(T[] tArr) {
        ckf.g(tArr, pg1.ATOM_EXT_entries);
        this.entries = tArr;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.n00, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return contains((EnumEntriesList<T>) ((Enum) obj));
    }

    @Override // tb.c20, tb.n00
    public int getSize() {
        return this.entries.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.c20, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((EnumEntriesList<T>) ((Enum) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.c20, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return lastIndexOf((EnumEntriesList<T>) ((Enum) obj));
    }

    public boolean contains(T t) {
        ckf.g(t, "element");
        return ((Enum) ic1.L(this.entries, t.ordinal())) == t;
    }

    @Override // tb.c20, java.util.List
    public T get(int i) {
        c20.Companion.b(i, this.entries.length);
        return this.entries[i];
    }

    public int indexOf(T t) {
        ckf.g(t, "element");
        int ordinal = t.ordinal();
        if (((Enum) ic1.L(this.entries, ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(T t) {
        ckf.g(t, "element");
        return indexOf((Object) t);
    }
}

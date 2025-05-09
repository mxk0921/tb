package kotlin.enums;

import tb.ckf;
import tb.fg8;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a {
    public static final <E extends Enum<E>> fg8<E> a(E[] eArr) {
        ckf.g(eArr, pg1.ATOM_EXT_entries);
        return new EnumEntriesList(eArr);
    }
}

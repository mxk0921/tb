package com.alipay.bifrost;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Universal extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<StrStrItem> DEFAULT_ALICE = Collections.emptyList();
    public static final List<StrBinItem> DEFAULT_BOB = Collections.emptyList();
    public static final List<Universal> DEFAULT_SUBUNIVERSAL = Collections.emptyList();
    public static final int TAG_ALICE = 1;
    public static final int TAG_BOB = 2;
    public static final int TAG_SUBUNIVERSAL = 3;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<StrStrItem> alice;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<StrBinItem> bob;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public List<Universal> subUniversal;

    public Universal(Universal universal) {
        super(universal);
        if (universal != null) {
            this.alice = Message.copyOf(universal.alice);
            this.bob = Message.copyOf(universal.bob);
            this.subUniversal = Message.copyOf(universal.subUniversal);
        }
    }

    public static /* synthetic */ Object ipc$super(Universal universal, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/bifrost/Universal");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Universal)) {
            return false;
        }
        Universal universal = (Universal) obj;
        if (!equals((List<?>) this.alice, (List<?>) universal.alice) || !equals((List<?>) this.bob, (List<?>) universal.bob) || !equals((List<?>) this.subUniversal, (List<?>) universal.subUniversal)) {
            return false;
        }
        return true;
    }

    public Universal fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Universal) ipChange.ipc$dispatch("bcafd0e5", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.alice = Message.immutableCopyOf((List) obj);
        } else if (i == 2) {
            this.bob = Message.immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.subUniversal = Message.immutableCopyOf((List) obj);
        }
        return this;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        List<StrStrItem> list = this.alice;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 1;
        }
        int i5 = i * 37;
        List<StrBinItem> list2 = this.bob;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 1;
        }
        int i6 = (i5 + i2) * 37;
        List<Universal> list3 = this.subUniversal;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        int i7 = i6 + i3;
        this.hashCode = i7;
        return i7;
    }

    public Universal() {
    }
}

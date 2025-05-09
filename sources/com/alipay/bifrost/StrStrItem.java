package com.alipay.bifrost;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class StrStrItem extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VAL = "";
    public static final int TAG_KEY = 1;
    public static final int TAG_VAL = 2;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.STRING)
    public String key;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String val;

    public StrStrItem(StrStrItem strStrItem) {
        super(strStrItem);
        if (strStrItem != null) {
            this.key = strStrItem.key;
            this.val = strStrItem.val;
        }
    }

    public static /* synthetic */ Object ipc$super(StrStrItem strStrItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/bifrost/StrStrItem");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StrStrItem)) {
            return false;
        }
        StrStrItem strStrItem = (StrStrItem) obj;
        if (!equals(this.key, strStrItem.key) || !equals(this.val, strStrItem.val)) {
            return false;
        }
        return true;
    }

    public StrStrItem fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrStrItem) ipChange.ipc$dispatch("830e7e33", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.key = (String) obj;
        } else if (i == 2) {
            this.val = (String) obj;
        }
        return this;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        String str = this.key;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 37;
        String str2 = this.val;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i5 = i4 + i2;
        this.hashCode = i5;
        return i5;
    }

    public StrStrItem() {
    }
}

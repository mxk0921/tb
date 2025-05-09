package com.alipay.mobile.framework.service.ext.commpb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MapStringString extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final List<EntryStringString> DEFAULT_ENTRIES = Collections.emptyList();
    public static final int TAG_ENTRIES = 1;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public List<EntryStringString> entries;

    public MapStringString(MapStringString mapStringString) {
        super(mapStringString);
        if (mapStringString != null) {
            this.entries = Message.copyOf(mapStringString.entries);
        }
    }

    public static /* synthetic */ Object ipc$super(MapStringString mapStringString, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/framework/service/ext/commpb/MapStringString");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapStringString)) {
            return false;
        }
        return equals((List<?>) this.entries, (List<?>) ((MapStringString) obj).entries);
    }

    public MapStringString fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MapStringString) ipChange.ipc$dispatch("77e152cb", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.entries = Message.immutableCopyOf((List) obj);
        }
        return this;
    }

    public int hashCode() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        List<EntryStringString> list = this.entries;
        if (list != null) {
            i = list.hashCode();
        }
        this.hashCode = i;
        return i;
    }

    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        List<EntryStringString> list = this.entries;
        if (list != null) {
            for (EntryStringString entryStringString : list) {
                hashMap.put(entryStringString.key, entryStringString.value);
            }
        }
        return hashMap;
    }

    public MapStringString() {
    }

    public MapStringString(Map<String, String> map) {
        if (map != null) {
            this.entries = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                EntryStringString entryStringString = new EntryStringString();
                entryStringString.key = entry.getKey();
                entryStringString.value = entry.getValue();
                this.entries.add(entryStringString);
            }
        }
    }
}

package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchMessageSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", pg1.ATOM_EXT_Undefined, "CDN", "PM", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageSource extends Enum<OpenArchMessageSource> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchMessageSource[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final OpenArchMessageSource Undefined = new OpenArchMessageSource(pg1.ATOM_EXT_Undefined, 0, pg1.ATOM_EXT_Undefined);
    public static final OpenArchMessageSource CDN = new OpenArchMessageSource("CDN", 1, "CDN");
    public static final OpenArchMessageSource PM = new OpenArchMessageSource("PM", 2, "PM");

    private static final /* synthetic */ OpenArchMessageSource[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchMessageSource[]) ipChange.ipc$dispatch("ef9fc1a1", new Object[0]) : new OpenArchMessageSource[]{Undefined, CDN, PM};
    }

    static {
        OpenArchMessageSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchMessageSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<OpenArchMessageSource> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchMessageSource openArchMessageSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchMessageSource");
    }

    public static OpenArchMessageSource valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageSource) ipChange.ipc$dispatch("51efe80c", new Object[]{str});
        }
        return (OpenArchMessageSource) Enum.valueOf(OpenArchMessageSource.class, str);
    }

    public static OpenArchMessageSource[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageSource[]) ipChange.ipc$dispatch("11a4867d", new Object[0]);
        }
        return (OpenArchMessageSource[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}

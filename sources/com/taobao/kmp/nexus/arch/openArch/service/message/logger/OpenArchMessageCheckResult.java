package com.taobao.kmp.nexus.arch.openArch.service.message.logger;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/logger/OpenArchMessageCheckResult;", "", "code", "", "<init>", "(Ljava/lang/String;IS)V", "getCode", "()S", "MessageCheckResultPassed", "MessageCheckResultTopicNotMatch", "MessageCheckResultMsgIDDuplicated", "MessageCheckResultMsgDataEmpty", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchMessageCheckResult extends Enum<OpenArchMessageCheckResult> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchMessageCheckResult[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final short code;
    public static final OpenArchMessageCheckResult MessageCheckResultPassed = new OpenArchMessageCheckResult("MessageCheckResultPassed", 0, 0);
    public static final OpenArchMessageCheckResult MessageCheckResultTopicNotMatch = new OpenArchMessageCheckResult("MessageCheckResultTopicNotMatch", 1, -1);
    public static final OpenArchMessageCheckResult MessageCheckResultMsgIDDuplicated = new OpenArchMessageCheckResult("MessageCheckResultMsgIDDuplicated", 2, -2);
    public static final OpenArchMessageCheckResult MessageCheckResultMsgDataEmpty = new OpenArchMessageCheckResult("MessageCheckResultMsgDataEmpty", 3, -3);

    private static final /* synthetic */ OpenArchMessageCheckResult[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchMessageCheckResult[]) ipChange.ipc$dispatch("9a21d440", new Object[0]) : new OpenArchMessageCheckResult[]{MessageCheckResultPassed, MessageCheckResultTopicNotMatch, MessageCheckResultMsgIDDuplicated, MessageCheckResultMsgDataEmpty};
    }

    static {
        OpenArchMessageCheckResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchMessageCheckResult(String str, int i, short s) {
        this.code = s;
    }

    public static fg8<OpenArchMessageCheckResult> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchMessageCheckResult openArchMessageCheckResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/logger/OpenArchMessageCheckResult");
    }

    public static OpenArchMessageCheckResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageCheckResult) ipChange.ipc$dispatch("49783e6b", new Object[]{str});
        }
        return (OpenArchMessageCheckResult) Enum.valueOf(OpenArchMessageCheckResult.class, str);
    }

    public static OpenArchMessageCheckResult[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageCheckResult[]) ipChange.ipc$dispatch("e45e841c", new Object[0]);
        }
        return (OpenArchMessageCheckResult[]) $VALUES.clone();
    }

    public final short getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb167", new Object[]{this})).shortValue();
        }
        return this.code;
    }
}

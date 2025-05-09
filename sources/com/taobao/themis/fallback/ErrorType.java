package com.taobao.themis.fallback;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ErrorType extends Enum<ErrorType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String description;
    public static final ErrorType STATUS_CODE = new ErrorType("STATUS_CODE", 0, "statusCode");
    public static final ErrorType DOCUMENT_SIZE_TOO_SMALL = new ErrorType("DOCUMENT_SIZE_TOO_SMALL", 1, "documentSizeTooSmall");
    public static final ErrorType REQUIRED_ELEMENTS_NOT_FOUND = new ErrorType("REQUIRED_ELEMENTS_NOT_FOUND", 2, "requiredElementsNotFound");
    private static final /* synthetic */ ErrorType[] $VALUES = $values();

    private static final /* synthetic */ ErrorType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ErrorType[]) ipChange.ipc$dispatch("30ee3f36", new Object[0]) : new ErrorType[]{STATUS_CODE, DOCUMENT_SIZE_TOO_SMALL, REQUIRED_ELEMENTS_NOT_FOUND};
    }

    private ErrorType(String str, int i, String str2) {
        this.description = str2;
    }

    public static /* synthetic */ Object ipc$super(ErrorType errorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/fallback/ErrorType");
    }

    public static ErrorType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("19efcb61", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(ErrorType.class, str);
        }
        return (ErrorType) valueOf;
    }

    public static ErrorType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("41949712", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (ErrorType[]) clone;
    }

    public final String getDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
        }
        return this.description;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.description;
    }
}

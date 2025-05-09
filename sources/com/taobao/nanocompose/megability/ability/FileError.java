package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/FileError;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "FILE_NOT_EXIST", "DIR_NOT_EXIST", "ILLEGAL_PATH", "NOT_DIR", "NOT_FILE", "ALREADY_EXIST", "DIR_NOT_EMPTY", "DIGEST_COMPUTER_ERROR", "OUT_OF_SPACE", "SINGLE_FILE_OUT_OF_SPACE", "NOT_ZIP_FILE", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class FileError extends Enum<FileError> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ FileError[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final FileError FILE_NOT_EXIST = new FileError("FILE_NOT_EXIST", 0, "FILE_NOT_EXIST");
    public static final FileError DIR_NOT_EXIST = new FileError("DIR_NOT_EXIST", 1, "DIR_NOT_EXIST");
    public static final FileError ILLEGAL_PATH = new FileError("ILLEGAL_PATH", 2, "ILLEGAL_PATH");
    public static final FileError NOT_DIR = new FileError("NOT_DIR", 3, "NOT_DIR");
    public static final FileError NOT_FILE = new FileError("NOT_FILE", 4, "NOT_FILE");
    public static final FileError ALREADY_EXIST = new FileError("ALREADY_EXIST", 5, "ALREADY_EXIST");
    public static final FileError DIR_NOT_EMPTY = new FileError("DIR_NOT_EMPTY", 6, "DIR_NOT_EMPTY");
    public static final FileError DIGEST_COMPUTER_ERROR = new FileError("DIGEST_COMPUTER_ERROR", 7, "DIGEST_COMPUTER_ERROR");
    public static final FileError OUT_OF_SPACE = new FileError("OUT_OF_SPACE", 8, "OUT_OF_SPACE");
    public static final FileError SINGLE_FILE_OUT_OF_SPACE = new FileError("SINGLE_FILE_OUT_OF_SPACE", 9, "SINGLE_FILE_OUT_OF_SPACE");
    public static final FileError NOT_ZIP_FILE = new FileError("NOT_ZIP_FILE", 10, "NOT_ZIP_FILE");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361688);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ FileError[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileError[]) ipChange.ipc$dispatch("b7b656fe", new Object[0]) : new FileError[]{FILE_NOT_EXIST, DIR_NOT_EXIST, ILLEGAL_PATH, NOT_DIR, NOT_FILE, ALREADY_EXIST, DIR_NOT_EMPTY, DIGEST_COMPUTER_ERROR, OUT_OF_SPACE, SINGLE_FILE_OUT_OF_SPACE, NOT_ZIP_FILE};
    }

    static {
        FileError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FileError(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<FileError> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(FileError fileError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/FileError");
    }

    public static FileError valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileError) ipChange.ipc$dispatch("356b8f73", new Object[]{str});
        }
        return (FileError) Enum.valueOf(FileError.class, str);
    }

    public static FileError[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileError[]) ipChange.ipc$dispatch("f211cba2", new Object[0]);
        }
        return (FileError[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

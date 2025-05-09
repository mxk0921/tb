package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/FileEncodingType;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "ASCII", "BASE64", "HEX", "UCS2", "UTF16", "UTF8", "LATIN1", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class FileEncodingType extends Enum<FileEncodingType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ FileEncodingType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final FileEncodingType ASCII = new FileEncodingType("ASCII", 0, "ASCII");
    public static final FileEncodingType BASE64 = new FileEncodingType("BASE64", 1, "BASE64");
    public static final FileEncodingType HEX = new FileEncodingType("HEX", 2, "HEX");
    public static final FileEncodingType UCS2 = new FileEncodingType("UCS2", 3, "UCS2");
    public static final FileEncodingType UTF16 = new FileEncodingType("UTF16", 4, "UTF16");
    public static final FileEncodingType UTF8 = new FileEncodingType("UTF8", 5, "UTF8");
    public static final FileEncodingType LATIN1 = new FileEncodingType("LATIN1", 6, "LATIN1");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361686);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ FileEncodingType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileEncodingType[]) ipChange.ipc$dispatch("2c1b6483", new Object[0]) : new FileEncodingType[]{ASCII, BASE64, HEX, UCS2, UTF16, UTF8, LATIN1};
    }

    static {
        FileEncodingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FileEncodingType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<FileEncodingType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(FileEncodingType fileEncodingType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/FileEncodingType");
    }

    public static FileEncodingType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileEncodingType) ipChange.ipc$dispatch("8480ae6e", new Object[]{str});
        }
        return (FileEncodingType) Enum.valueOf(FileEncodingType.class, str);
    }

    public static FileEncodingType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileEncodingType[]) ipChange.ipc$dispatch("39f62f5f", new Object[0]);
        }
        return (FileEncodingType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

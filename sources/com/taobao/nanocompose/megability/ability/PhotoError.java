package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/PhotoError;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "NO_PERMISSION", "SELECT_ERROR", "TAKE_PHOTO_ERROR", "USER_CANCELED", "NO_FINDVIEW", "GENERATEIMAGE_FAIL", "LOAD_IMAGE_ERROR", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PhotoError extends Enum<PhotoError> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PhotoError[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final PhotoError NO_PERMISSION = new PhotoError("NO_PERMISSION", 0, "NO_PERMISSION");
    public static final PhotoError SELECT_ERROR = new PhotoError("SELECT_ERROR", 1, "SELECT_ERROR");
    public static final PhotoError TAKE_PHOTO_ERROR = new PhotoError("TAKE_PHOTO_ERROR", 2, "TAKE_PHOTO_ERROR");
    public static final PhotoError USER_CANCELED = new PhotoError("USER_CANCELED", 3, "USER_CANCELED");
    public static final PhotoError NO_FINDVIEW = new PhotoError("NO_FINDVIEW", 4, "NO_FINDVIEW");
    public static final PhotoError GENERATEIMAGE_FAIL = new PhotoError("GENERATEIMAGE_FAIL", 5, "GENERATEIMAGE_FAIL");
    public static final PhotoError LOAD_IMAGE_ERROR = new PhotoError("LOAD_IMAGE_ERROR", 6, "LOAD_IMAGE_ERROR");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361839);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ PhotoError[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoError[]) ipChange.ipc$dispatch("4fb5feb6", new Object[0]) : new PhotoError[]{NO_PERMISSION, SELECT_ERROR, TAKE_PHOTO_ERROR, USER_CANCELED, NO_FINDVIEW, GENERATEIMAGE_FAIL, LOAD_IMAGE_ERROR};
    }

    static {
        PhotoError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PhotoError(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<PhotoError> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PhotoError photoError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/PhotoError");
    }

    public static PhotoError valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoError) ipChange.ipc$dispatch("88a7d4e1", new Object[]{str});
        }
        return (PhotoError) Enum.valueOf(PhotoError.class, str);
    }

    public static PhotoError[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoError[]) ipChange.ipc$dispatch("60c91e92", new Object[0]);
        }
        return (PhotoError[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

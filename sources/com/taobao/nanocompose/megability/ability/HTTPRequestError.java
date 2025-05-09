package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/HTTPRequestError;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "REQUEST_TIMEOUT", "DECODE_ERROR", "REQUEST_ERROR", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class HTTPRequestError extends Enum<HTTPRequestError> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ HTTPRequestError[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final HTTPRequestError REQUEST_TIMEOUT = new HTTPRequestError("REQUEST_TIMEOUT", 0, "REQUEST_TIMEOUT");
    public static final HTTPRequestError DECODE_ERROR = new HTTPRequestError("DECODE_ERROR", 1, "DECODE_ERROR");
    public static final HTTPRequestError REQUEST_ERROR = new HTTPRequestError("REQUEST_ERROR", 2, "REQUEST_ERROR");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361720);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final HTTPRequestError a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HTTPRequestError) ipChange.ipc$dispatch("12bfd223", new Object[]{this, str});
            }
            ckf.g(str, "rawValue");
            int hashCode = str.hashCode();
            if (hashCode != 326311793) {
                if (hashCode != 1470557208) {
                    if (hashCode == 1561860183 && str.equals("DECODE_ERROR")) {
                        return HTTPRequestError.DECODE_ERROR;
                    }
                } else if (str.equals("REQUEST_ERROR")) {
                    return HTTPRequestError.REQUEST_ERROR;
                }
            } else if (str.equals("REQUEST_TIMEOUT")) {
                return HTTPRequestError.REQUEST_TIMEOUT;
            }
            return null;
        }

        public a() {
        }
    }

    private static final /* synthetic */ HTTPRequestError[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HTTPRequestError[]) ipChange.ipc$dispatch("b66bbd0b", new Object[0]) : new HTTPRequestError[]{REQUEST_TIMEOUT, DECODE_ERROR, REQUEST_ERROR};
    }

    static {
        HTTPRequestError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HTTPRequestError(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<HTTPRequestError> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(HTTPRequestError hTTPRequestError, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/HTTPRequestError");
    }

    public static HTTPRequestError valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPRequestError) ipChange.ipc$dispatch("ed106f6", new Object[]{str});
        }
        return (HTTPRequestError) Enum.valueOf(HTTPRequestError.class, str);
    }

    public static HTTPRequestError[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HTTPRequestError[]) ipChange.ipc$dispatch("c44687e7", new Object[0]);
        }
        return (HTTPRequestError[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

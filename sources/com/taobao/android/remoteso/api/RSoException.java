package com.taobao.android.remoteso.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RSoException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_DOWNLOAD_FAILED = 3001;
    public static final int ERROR_EMPTY_IMPL = 1001;
    public static final int ERROR_FETCH_ASYNC_CALLBACK_FAILED = 5012;
    public static final int ERROR_FETCH_ASYNC_FAILED = 5011;
    public static final int ERROR_FETCH_ASYNC_FAILED_EMPTY_IMPL = 5002;
    public static final int ERROR_FETCH_EXTRACT_EMPTY_PATH_WITHOUT_EXCEPTION = 5004;
    public static final int ERROR_FETCH_FAILED = 5000;
    public static final int ERROR_FETCH_FAILED_CONFIG_ON_DEMAND_NOT_ENABLED = 5003;
    public static final int ERROR_FETCH_IN_APK_RESOLVE_FAILED = 5006;
    public static final int ERROR_FETCH_SYNC_FAILED = 5020;
    public static final int ERROR_INDEX_ABI_IS_EMPTY = 2002;
    public static final int ERROR_INDEX_DATA_NOT_FOUND = 2000;
    public static final int ERROR_INDEX_ENTRY_NOT_FOUND = 2001;
    public static final int ERROR_INDEX_FILE_MD5_IS_EMPTY = 2003;
    public static final int ERROR_INDEX_FILE_URL_IS_EMPTY = 2004;
    public static final int ERROR_INDEX_ILLEGAL_COMPRESSED_FILE_URL = 2005;
    public static final int ERROR_INDEX_ILLEGAL_FROM = 2006;
    public static final int ERROR_INDEX_INFO_NOT_FOUND = 2010;
    public static final int ERROR_LOAD_ASYNC_CALLBACK_FAILED = 4010;
    public static final int ERROR_LOAD_ASYNC_FAILED = 4011;
    public static final int ERROR_LOAD_DO_LOAD_FAILED = 4021;
    public static final int ERROR_LOAD_FAILED = 4001;
    public static final int ERROR_LOAD_FAILED_CONFIG_LIB_DISABLED = 4003;
    public static final int ERROR_LOAD_FAILED_EMPTY_IMPL = 4002;
    public static final int ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED = 4032;
    public static final int ERROR_LOAD_PREFER_SYSTEM_LOAD_FAILED = 4031;
    public static final int ERROR_LOAD_SYNC_FAILED = 4012;
    public static final int ERROR_OBTAIN_FAILED = 6001;
    public static final int ERROR_OBTAIN_FAILED_CONFIG_LIB_DISABLED = 6003;
    public static final int ERROR_OBTAIN_FAILED_EMPTY_IMPL = 6002;
    public static final int ERROR_OBTAIN_FAILED_IS_FETCHING = 6004;
    public static final int ERROR_OBTAIN_FAILED_NOT_FOUND = 6005;
    public static final int ERROR_STORAGE_ILLEGAL_ARGS = 7001;
    public static final int ERROR_UNKNOWN = -1;
    private final int errorCode;
    private final String errorMsg;

    public RSoException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.errorMsg = str2;
    }

    public static RSoException error(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("2e02f034", new Object[]{new Integer(i), th});
        }
        if (th == null) {
            return new RSoException(parseString(i, null), i, null);
        }
        if (th instanceof RSoException) {
            return (RSoException) th;
        }
        String message = th.getMessage();
        return new RSoException(parseString(i, message), th, i, message);
    }

    public static /* synthetic */ Object ipc$super(RSoException rSoException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/api/RSoException");
    }

    private static String parseString(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86e69bde", new Object[]{new Integer(i), str});
        }
        return "RSoException{errorCode=" + i + ", errorMsg='" + str + "'}";
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return this.errorCode;
    }

    public String getErrorMsg() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.errorMsg);
        sb.append("cause:");
        if (getCause() == null) {
            str = "";
        } else {
            str = getCause().toString();
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return parseString(this.errorCode, this.errorMsg);
    }

    public RSoException(String str, Throwable th, int i, String str2) {
        super(str, th);
        this.errorCode = i;
        this.errorMsg = str2;
    }

    public static RSoException error(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("b3e3657", new Object[]{new Integer(i), str}) : new RSoException(parseString(i, str), i, str);
    }

    public static RSoException error(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("170bb2e1", new Object[]{new Integer(i)}) : new RSoException(parseString(i, null), i, null);
    }
}

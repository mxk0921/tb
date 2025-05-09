package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DownloadErrorCode extends Enum<DownloadErrorCode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    public static final DownloadErrorCode SUCCESS = new DownloadErrorCode("SUCCESS", 0, Integer.MAX_VALUE);
    public static final DownloadErrorCode DOWNLOAD_ERROR = new DownloadErrorCode("DOWNLOAD_ERROR", 1, -1);
    public static final DownloadErrorCode TARGET_FILE_PATH_INVALID = new DownloadErrorCode("TARGET_FILE_PATH_INVALID", 2, -2);
    public static final DownloadErrorCode DOWNLOAD_DATA_INVALID = new DownloadErrorCode("DOWNLOAD_DATA_INVALID", 3, 3);
    public static final DownloadErrorCode UNZIP_FILE_INVALID = new DownloadErrorCode("UNZIP_FILE_INVALID", 4, -4);
    public static final DownloadErrorCode URL_INVALID = new DownloadErrorCode("URL_INVALID", 5, -5);
    private static final /* synthetic */ DownloadErrorCode[] $VALUES = $values();

    private static final /* synthetic */ DownloadErrorCode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DownloadErrorCode[]) ipChange.ipc$dispatch("9d6a6620", new Object[0]) : new DownloadErrorCode[]{SUCCESS, DOWNLOAD_ERROR, TARGET_FILE_PATH_INVALID, DOWNLOAD_DATA_INVALID, UNZIP_FILE_INVALID, URL_INVALID};
    }

    private DownloadErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static /* synthetic */ Object ipc$super(DownloadErrorCode downloadErrorCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/resource_loader/download/DownloadErrorCode");
    }

    public static DownloadErrorCode valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("7790a8d5", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(DownloadErrorCode.class, str);
        }
        return (DownloadErrorCode) valueOf;
    }

    public static DownloadErrorCode[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("d2bd07c4", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (DownloadErrorCode[]) clone;
    }

    public final int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }
}

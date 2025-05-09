package com.taobao.tao.log.statistics;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum UploadFileType {
    UNKNOWN(0, "UNKNOWN", "application/x-unknown"),
    LOG(1, "TLOG", "application/x-tlog"),
    UDF(2, "USER_UPLOAD", "application/x-udf"),
    METHOD_TRACE(3, "METHOD_TRACE", "application/x-perf-methodtrace"),
    HEAP_DUMP(4, "HEAP_DUMP", "application/x-perf-heapdump");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String contentType;
    private final String name;
    private final int value;

    UploadFileType(int i, String str, String str2) {
        this.value = i;
        this.name = str;
        this.contentType = str2;
    }

    public static /* synthetic */ Object ipc$super(UploadFileType uploadFileType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/statistics/UploadFileType");
    }

    public static UploadFileType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadFileType) ipChange.ipc$dispatch("e3aa1df4", new Object[]{str});
        }
        return (UploadFileType) Enum.valueOf(UploadFileType.class, str);
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        return this.contentType;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return String.valueOf(this.value);
    }
}

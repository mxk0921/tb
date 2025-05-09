package com.alibaba.fastjson2.time;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DateTimeException extends RuntimeException {
    private final int errorIndex;

    public DateTimeException(String str) {
        super(str);
        this.errorIndex = 0;
    }

    public DateTimeException(String str, String str2, int i) {
        super(str);
        this.errorIndex = i;
    }
}

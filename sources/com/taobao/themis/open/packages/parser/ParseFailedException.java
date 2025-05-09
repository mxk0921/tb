package com.taobao.themis.open.packages.parser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ParseFailedException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CERT_PATH_NOT_EXIST = 4;
    public static final int EMPTY_RES = 8;
    public static final int INVALID_PARAM = 1;
    public static final int OFFLINE_PATH_NOT_EXIST = 2;
    public static final int TAR_PATH_NOT_EXIST = 3;
    public static final int TAR_SIGNATURE_IS_EMPTY = 5;
    public static final int UN_KNOW_EXCEPTION = 7;
    public static final int VERIFY_FAIL = 6;
    private int code;
    private ParseContext parseContext;

    static {
        t2o.a(843055301);
    }

    public ParseFailedException(int i, String str) {
        super(str);
        this.code = i;
    }

    public static /* synthetic */ Object ipc$super(ParseFailedException parseFailedException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/packages/parser/ParseFailedException");
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public ParseContext getParseContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParseContext) ipChange.ipc$dispatch("d5cee91", new Object[]{this});
        }
        return this.parseContext;
    }

    public void setParseContext(ParseContext parseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a92c83", new Object[]{this, parseContext});
        } else {
            this.parseContext = parseContext;
        }
    }
}

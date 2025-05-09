package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class InvalidJsonPatchException extends JsonPatchApplicationException {
    static {
        t2o.a(503317260);
    }

    public InvalidJsonPatchException(String str) {
        super(str);
    }

    public InvalidJsonPatchException(String str, Throwable th) {
        super(str, th);
    }

    public InvalidJsonPatchException(Throwable th) {
        super(th);
    }
}

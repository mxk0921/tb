package com.taobao.taobao.scancode.v2.result;

import android.text.TextUtils;
import tb.eyh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MaTBAntiFakeResult extends MaResult {
    private String hiddenData;

    static {
        t2o.a(760217791);
    }

    public MaTBAntiFakeResult(eyh eyhVar) {
        super(eyhVar);
        this.hiddenData = eyhVar.e;
    }

    public boolean exist() {
        return !TextUtils.isEmpty(this.hiddenData);
    }

    public String getHiddenData() {
        return this.hiddenData;
    }
}

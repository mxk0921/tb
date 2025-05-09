package com.taobao.android.a11y.ability.ocr;

import com.taobao.android.a11y.ability.common.mtop.A11yMtopRequest;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TableOCRRequest extends A11yMtopRequest<OCRRequestParams> {
    private static final String API_NAME = "mtop.taobao.a11y.ocr";
    private static final String API_VERSION = "1.0";

    static {
        t2o.a(335544352);
    }

    public TableOCRRequest(OCRRequestParams oCRRequestParams) {
        super(oCRRequestParams);
        setApiName(API_NAME);
        setVersion("1.0");
    }
}

package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import com.taobao.android.litecreator.service.ServiceImpl;

/* compiled from: Taobao */
@ServiceImpl("com.taobao.android.litecreator.service.impl.ExitBenefitDialogChecker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IExitBenefitDialogChecker {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnClickResult {
        void a();
    }

    boolean checkIsLCRecordPage(Context context);

    boolean checkNeedShow(Context context, String str, OnClickResult onClickResult);

    void stateUtTabQuit(String str);
}

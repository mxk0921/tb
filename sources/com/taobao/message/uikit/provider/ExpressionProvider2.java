package com.taobao.message.uikit.provider;

import android.util.SparseArray;
import com.taobao.message.uikit.media.expression.Expression;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ExpressionProvider2 extends ExpressionProvider {
    SparseArray<Expression> getExpressionTableByBiz(String[] strArr);

    void registerEmotionWithBiz(String str, List<Expression> list);
}

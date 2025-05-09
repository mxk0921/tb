package com.taobao.message.expression;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.uikit.media.expression.Expression;
import com.taobao.message.uikit.media.expression.TaoExpressionProviderV2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageExpressionService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(529530927);
    }

    public static SparseArray<Expression> getExpressionTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("85ffd0f2", new Object[0]);
        }
        return TaoExpressionProviderV2.getInstance().getExpressionTable();
    }

    public static boolean hasMsgSDKInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("666de638", new Object[]{str})).booleanValue();
        }
        return BundleSplitUtil.INSTANCE.isMsgBundleReady();
    }
}

package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OuterBinderAdapter extends BinderAdapter {
    private static final Object j = new Object();
    private static BinderAdapter k;
    private static String l;
    private static String m;

    private OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (j) {
            try {
                if (k == null) {
                    l = str;
                    m = str2;
                    k = new OuterBinderAdapter(context, str, str2);
                } else if (!Objects.equal(l, str) || !Objects.equal(m, str2)) {
                    HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    l = str;
                    m = str2;
                    k.unBind();
                    k = new OuterBinderAdapter(context, str, str2);
                }
                binderAdapter = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 1002;
    }
}

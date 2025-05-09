package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FingerInfo implements Serializable, Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String key;
    public long loginTime;
    public String value;

    static {
        t2o.a(68157533);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        try {
            long j = ((FingerInfo) obj).loginTime;
            long j2 = ((FingerInfo) obj2).loginTime;
            if (j > j2) {
                return -1;
            }
            if (j == j2) {
                return 0;
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }
}

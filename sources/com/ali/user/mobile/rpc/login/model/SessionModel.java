package com.ali.user.mobile.rpc.login.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SessionModel extends AliUserResponseData implements Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String expTags;
    public String mobile;
    public String showLoginId;
    public int site;

    static {
        t2o.a(68157587);
    }

    public static /* synthetic */ Object ipc$super(SessionModel sessionModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/rpc/login/model/SessionModel");
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        long j = ((SessionModel) obj).loginTime;
        long j2 = ((SessionModel) obj2).loginTime;
        if (j > j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }
}

package com.alibaba.appmonitor.sample;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.fa;
import tb.t2o;

/* compiled from: Taobao */
@TableName("ap_stat")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StatConfig extends fa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("detail")
    public int detail;

    static {
        t2o.a(962593070);
    }

    public static /* synthetic */ Object ipc$super(StatConfig statConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/sample/StatConfig");
    }

    public boolean isDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43940926", new Object[]{this})).booleanValue() : this.detail == 1;
    }

    private boolean detail(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcbb3456", new Object[]{this, arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return isDetail();
        }
        String remove = arrayList.remove(0);
        if (isContains(remove)) {
            return ((StatConfig) getNext(remove)).detail(arrayList);
        }
        return isDetail();
    }

    public boolean isDetail(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb0d53a", new Object[]{this, str, str2})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return detail(arrayList);
    }
}

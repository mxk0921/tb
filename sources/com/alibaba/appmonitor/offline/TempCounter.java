package com.alibaba.appmonitor.offline;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zht;

/* compiled from: Taobao */
@TableName("counter_temp")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TempCounter extends zht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("arg")
    public String arg;
    @Column("value")
    public double value;

    static {
        t2o.a(962593049);
    }

    public TempCounter(String str, String str2, String str3, double d, String str4, String str5) {
        super(str, str2, str4, str5);
        this.arg = str3;
        this.value = d;
    }

    public static /* synthetic */ Object ipc$super(TempCounter tempCounter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/offline/TempCounter");
    }

    @Override // tb.zht
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempCounter{arg='" + this.arg + "', value=" + this.value + '}';
    }

    public TempCounter() {
    }
}

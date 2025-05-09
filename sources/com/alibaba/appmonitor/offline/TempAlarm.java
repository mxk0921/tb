package com.alibaba.appmonitor.offline;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.zht;

/* compiled from: Taobao */
@TableName("alarm_temp")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TempAlarm extends zht {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("arg")
    public String arg;
    @Column("err_code")
    public String errCode;
    @Column("err_msg")
    public String errMsg;
    @Column("success")
    public String success;

    static {
        t2o.a(962593048);
    }

    public TempAlarm() {
    }

    public static /* synthetic */ Object ipc$super(TempAlarm tempAlarm, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/offline/TempAlarm");
    }

    public boolean isSuccessEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7370aac", new Object[]{this})).booleanValue();
        }
        return "1".equalsIgnoreCase(this.success);
    }

    @Override // tb.zht
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempAlarm{ module='" + this.module + "', monitorPoint='" + this.monitorPoint + "', commitTime=" + this.commitTime + ", access='" + this.access + "', accessSubType='" + this.accessSubType + "', arg='" + this.arg + "', errCode='" + this.errCode + "', errMsg='" + this.errMsg + "', success='" + this.success + "'}";
    }

    public TempAlarm(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        super(str, str2, str6, str7);
        this.arg = str3;
        this.errCode = str4;
        this.errMsg = str5;
        this.success = z ? "1" : "0";
    }
}

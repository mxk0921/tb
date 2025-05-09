package com.taobao.orange.model;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = OConstant.MONITOR_PRIVATE_MODULE, monitorPoint = OConstant.POINT_INDEX_ACK)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class IndexAckDO extends StatObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String indexId;
    @Dimension
    public String md5;
    @Dimension
    public String updateTime;

    static {
        t2o.a(613417087);
    }

    public IndexAckDO() {
    }

    public static /* synthetic */ Object ipc$super(IndexAckDO indexAckDO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/model/IndexAckDO");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IndexAckDO{indexId='" + this.indexId + "', updateTime='" + this.updateTime + "', md5='" + this.md5 + "'}";
    }

    public IndexAckDO(String str, String str2, String str3) {
        this.indexId = str;
        this.updateTime = str2;
        this.md5 = str3;
    }
}

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
@Monitor(module = OConstant.MONITOR_PRIVATE_MODULE, monitorPoint = OConstant.POINT_CONFIG_ACK)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ConfigAckDO extends StatObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String name;
    @Dimension
    public String namespaceId;
    @Dimension
    public String updateTime;
    @Dimension
    public String version;

    static {
        t2o.a(613417082);
    }

    public ConfigAckDO() {
    }

    public static /* synthetic */ Object ipc$super(ConfigAckDO configAckDO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/model/ConfigAckDO");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigAckDO configAckDO = (ConfigAckDO) obj;
        if (this.name.equals(configAckDO.name) && this.namespaceId.equals(configAckDO.namespaceId) && this.updateTime.equals(configAckDO.updateTime)) {
            return this.version.equals(configAckDO.version);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.name.hashCode() * 31) + this.namespaceId.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.version.hashCode();
    }

    public ConfigAckDO(String str, String str2, String str3, String str4) {
        this.name = str;
        this.namespaceId = str2;
        this.updateTime = str3;
        this.version = str4;
    }
}

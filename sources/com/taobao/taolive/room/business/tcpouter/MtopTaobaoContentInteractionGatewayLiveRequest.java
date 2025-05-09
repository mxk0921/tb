package com.taobao.taolive.room.business.tcpouter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopTaobaoContentInteractionGatewayLiveRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.taobao.content.interaction.gateway.live";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String models = null;
    private String bizType = null;
    private String asac = null;
    private String exParams = null;

    static {
        t2o.a(779092833);
        t2o.a(806355930);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this});
        }
        return this.API_NAME;
    }

    public String getAsac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f65364ef", new Object[]{this});
        }
        return this.asac;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    public String getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1145f0ca", new Object[]{this});
        }
        return this.exParams;
    }

    public String getModels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d18bd99", new Object[]{this});
        }
        return this.models;
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this});
        }
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35834a7e", new Object[]{this})).booleanValue();
        }
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64348f02", new Object[]{this})).booleanValue();
        }
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191523", new Object[]{this, str});
        } else {
            this.API_NAME = str;
        }
    }

    public void setAsac(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68987967", new Object[]{this, str});
        } else {
            this.asac = str;
        }
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public void setExParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25582ec", new Object[]{this, str});
        } else {
            this.exParams = str;
        }
    }

    public void setModels(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8e2fd", new Object[]{this, str});
        } else {
            this.models = str;
        }
    }

    public void setNEED_ECODE(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6759b162", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_ECODE = z;
        }
    }

    public void setNEED_SESSION(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf9ab5e", new Object[]{this, new Boolean(z)});
        } else {
            this.NEED_SESSION = z;
        }
    }

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }
}

package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MQPBehaviorExperienceModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String uid = "";
    private String utdid = "";
    private String app_name = "";
    private String app_ver = "";
    private String sdk_ver = "";
    private String trade_no = "";
    private String out_trade_no = "";
    private String biz_type = "";
    private String end_code = "";
    private String ext1 = "";
    private String ext2 = "";
    private String ext3 = "";
    private String date = "";

    public String getApp_name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fdc2cfa", new Object[]{this});
        }
        return this.app_name;
    }

    public String getApp_ver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88a8920a", new Object[]{this});
        }
        return this.app_ver;
    }

    public String getBiz_type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87b841d", new Object[]{this});
        }
        return this.biz_type;
    }

    public String getDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59821555", new Object[]{this});
        }
        return this.date;
    }

    public String getEnd_code() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31f10512", new Object[]{this});
        }
        return this.end_code;
    }

    public String getExt1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eac5013", new Object[]{this});
        }
        return this.ext1;
    }

    public String getExt2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5320ab2", new Object[]{this});
        }
        return this.ext2;
    }

    public String getExt3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bb7c551", new Object[]{this});
        }
        return this.ext3;
    }

    public String getOut_trade_no() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6a4d416", new Object[]{this});
        }
        return this.out_trade_no;
    }

    public String getSdk_ver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be4fae11", new Object[]{this});
        }
        return this.sdk_ver;
    }

    public String getTrade_no() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d9fe647", new Object[]{this});
        }
        return this.trade_no;
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this});
        }
        return this.uid;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.utdid;
    }

    public void setApp_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e686ccbc", new Object[]{this, str});
        } else {
            this.app_name = str;
        }
    }

    public void setApp_ver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936d3814", new Object[]{this, str});
        } else {
            this.app_ver = str;
        }
    }

    public void setBiz_type(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d259f9", new Object[]{this, str});
        } else {
            this.biz_type = str;
        }
    }

    public void setDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3fd5c1", new Object[]{this, str});
        } else {
            this.date = str;
        }
    }

    public void setEnd_code(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970cf7a4", new Object[]{this, str});
        } else {
            this.end_code = str;
        }
    }

    public void setExt1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5cf2c3", new Object[]{this, str});
        } else {
            this.ext1 = str;
        }
    }

    public void setExt2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858e8c04", new Object[]{this, str});
        } else {
            this.ext2 = str;
        }
    }

    public void setExt3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc02545", new Object[]{this, str});
        } else {
            this.ext3 = str;
        }
    }

    public void setOut_trade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e942320", new Object[]{this, str});
        } else {
            this.out_trade_no = str;
        }
    }

    public void setSdk_ver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a99ced", new Object[]{this, str});
        } else {
            this.sdk_ver = str;
        }
    }

    public void setTrade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113a3d0f", new Object[]{this, str});
        } else {
            this.trade_no = str;
        }
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.uid = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MQPBehaviorExperienceModel{uid='" + this.uid + "', utdid='" + this.utdid + "', app_name='" + this.app_name + "', app_ver='" + this.app_ver + "', sdk_ver='" + this.sdk_ver + "', trade_no='" + this.trade_no + "', out_trade_no='" + this.out_trade_no + "', biz_type='" + this.biz_type + "', end_code='" + this.end_code + "', ext1='" + this.ext1 + "', ext2='" + this.ext2 + "', ext3='" + this.ext3 + "', date='" + this.date + "'}";
    }
}

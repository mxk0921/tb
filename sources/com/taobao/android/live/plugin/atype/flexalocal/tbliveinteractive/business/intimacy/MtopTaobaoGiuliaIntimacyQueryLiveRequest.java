package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.intimacy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.k75;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopTaobaoGiuliaIntimacyQueryLiveRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean hasMember;
    public boolean member;
    private String API_NAME = "mtop.taobao.giulia.intimacy.query.live";
    private String VERSION = k75.VIDEOCONFIG_API_VERSION_3;
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String invokeType = null;
    private String spm = null;
    private String bizCode = null;
    private String showCodes = null;
    private String source = null;
    private String targetUid = null;
    private boolean follow = false;
    private String liveId = null;
    private long roomType = 0;

    static {
        t2o.a(295699841);
        t2o.a(806355930);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this});
        }
        return this.API_NAME;
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    public String getInvokeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c0d831", new Object[]{this});
        }
        return this.invokeType;
    }

    public String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.liveId;
    }

    public long getRoomType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45ab5326", new Object[]{this})).longValue();
        }
        return this.roomType;
    }

    public String getShowCodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6f7866", new Object[]{this});
        }
        return this.showCodes;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.source;
    }

    public String getSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.spm;
    }

    public String getTargetUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f69050", new Object[]{this});
        }
        return this.targetUid;
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this});
        }
        return this.VERSION;
    }

    public boolean isFollow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8867c86", new Object[]{this})).booleanValue();
        }
        return this.follow;
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

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public void setFollow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc90e45a", new Object[]{this, new Boolean(z)});
        } else {
            this.follow = z;
        }
    }

    public void setInvokeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1943b565", new Object[]{this, str});
        } else {
            this.invokeType = str;
        }
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.liveId = str;
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

    public void setRoomType(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295f046", new Object[]{this, new Long(j)});
        } else {
            this.roomType = j;
        }
    }

    public void setShowCodes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1bd5038", new Object[]{this, str});
        } else {
            this.showCodes = str;
        }
    }

    public void setSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad15ee", new Object[]{this, str});
        } else {
            this.source = str;
        }
    }

    public void setSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
        } else {
            this.spm = str;
        }
    }

    public void setTargetUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf19358e", new Object[]{this, str});
        } else {
            this.targetUid = str;
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

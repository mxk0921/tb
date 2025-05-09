package com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopTbliveRecommendPopviewQueryRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.tblive.recommend.popview.query";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String accountId = null;
    private String spm = null;
    private String liveSource = null;
    private String entryLiveSource = null;
    private String itemIds = null;
    private String entrySpm = null;
    private String liveId = "";
    private String shareType = null;
    private String query = null;
    private String switchIndex = null;
    private String recExtParams = null;
    private String s = "1";
    private String n = "10";
    private String expInfoList = null;
    private String smartDx = "false";

    static {
        t2o.a(295699691);
        t2o.a(806355930);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this});
        }
        return this.API_NAME;
    }

    public String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return this.accountId;
    }

    public String getEntryLiveSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return this.entryLiveSource;
    }

    public String getEntrySpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this});
        }
        return this.entrySpm;
    }

    public String getExpInfoList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d26ffa66", new Object[]{this});
        }
        return this.expInfoList;
    }

    public String getItemIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad0b7ea", new Object[]{this});
        }
        return this.itemIds;
    }

    public String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.liveId;
    }

    public String getLiveSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return this.liveSource;
    }

    public String getN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee8fd641", new Object[]{this});
        }
        return this.n;
    }

    public String getQuery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d62ef27", new Object[]{this});
        }
        return this.query;
    }

    public String getRecExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8979324c", new Object[]{this});
        }
        return this.recExtParams;
    }

    public String getS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f2c7b5c", new Object[]{this});
        }
        return this.s;
    }

    public String getShareType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1322c1d6", new Object[]{this});
        }
        return this.shareType;
    }

    public String getSmartDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1dfc3d52", new Object[]{this});
        }
        return this.smartDx;
    }

    public String getSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.spm;
    }

    public String getSwitchIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d04d331", new Object[]{this});
        }
        return this.switchIndex;
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

    public void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId = str;
        }
    }

    public void setEntryLiveSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8af44c8", new Object[]{this, str});
        } else {
            this.entryLiveSource = str;
        }
    }

    public void setEntrySpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba25e0f1", new Object[]{this, str});
        } else {
            this.entrySpm = str;
        }
    }

    public void setExpInfoList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93468138", new Object[]{this, str});
        } else {
            this.expInfoList = str;
        }
    }

    public void setItemIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5649ce34", new Object[]{this, str});
        } else {
            this.itemIds = str;
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

    public void setLiveSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2958effa", new Object[]{this, str});
        } else {
            this.liveSource = str;
        }
    }

    public void setN(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5b61bd", new Object[]{this, str});
        } else {
            this.n = str;
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

    public void setQuery(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd38b97", new Object[]{this, str});
        } else {
            this.query = str;
        }
    }

    public void setRecExtParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364b8baa", new Object[]{this, str});
        } else {
            this.recExtParams = str;
        }
    }

    public void setS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11536002", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public void setShareType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37334c8", new Object[]{this, str});
        } else {
            this.shareType = str;
        }
    }

    public void setSmartDx(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88ef5cc", new Object[]{this, str});
        } else {
            this.smartDx = str;
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

    public void setSwitchIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4cc1cd", new Object[]{this, str});
        } else {
            this.switchIndex = str;
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

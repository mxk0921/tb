package com.taobao.taolive.room.business.recommendLives;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopMediaplatformAliveRecommendLivesRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mockUserId;
    public String tppParam;
    public String API_NAME = "mtop.mediaplatform.alive.recommend.lives";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String devId = null;
    private String newRoomTypes = null;
    private long s = 0;
    private String roomTypes = null;
    private String columnIds = null;
    private String lastBroadCastId = null;
    private String accountStays = null;
    private String source = null;
    private String channelIds = null;
    private long liveId = 0;
    private long n = 0;
    private String smartRecommend = "true";

    static {
        t2o.a(779092827);
        t2o.a(806355930);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this});
        }
        return this.API_NAME;
    }

    public String getAccountStays() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("917b1d56", new Object[]{this});
        }
        return this.accountStays;
    }

    public String getChannelIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f10e012e", new Object[]{this});
        }
        return this.channelIds;
    }

    public String getColumnIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ada71ad", new Object[]{this});
        }
        return this.columnIds;
    }

    public String getDevId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d38588df", new Object[]{this});
        }
        return this.devId;
    }

    public String getLastBroadCastId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("447b4dc9", new Object[]{this});
        }
        return this.lastBroadCastId;
    }

    public long getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10168018", new Object[]{this})).longValue();
        }
        return this.liveId;
    }

    public long getN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74c14433", new Object[]{this})).longValue();
        }
        return this.n;
    }

    public String getNewRoomTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b2cce65", new Object[]{this});
        }
        return this.newRoomTypes;
    }

    public String getRoomTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b2b9e51", new Object[]{this});
        }
        return this.roomTypes;
    }

    public long getS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7507b9b8", new Object[]{this})).longValue();
        }
        return this.s;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.source;
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

    public void setAccountStays(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8701e0", new Object[]{this, str});
        } else {
            this.accountStays = str;
        }
    }

    public void setChannelIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a79bac08", new Object[]{this, str});
        } else {
            this.channelIds = str;
        }
    }

    public void setColumnIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b17fd1", new Object[]{this, str});
        } else {
            this.columnIds = str;
        }
    }

    public void setDevId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0428df", new Object[]{this, str});
        } else {
            this.devId = str;
        }
    }

    public void setLastBroadCastId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5164035", new Object[]{this, str});
        } else {
            this.lastBroadCastId = str;
        }
    }

    public void setLiveId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891f6e94", new Object[]{this, new Long(j)});
        } else {
            this.liveId = j;
        }
    }

    public void setN(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169cee71", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
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

    public void setNewRoomTypes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0b72b1", new Object[]{this, str});
        } else {
            this.newRoomTypes = str;
        }
    }

    public void setRoomTypes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c85e7ad", new Object[]{this, str});
        } else {
            this.roomTypes = str;
        }
    }

    public void setS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f25298c", new Object[]{this, new Long(j)});
        } else {
            this.s = j;
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

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }
}

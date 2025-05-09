package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightRowRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String entryLiveSource;
    public boolean isTimeMovingV2;
    public String keyPointId;
    public String liveSource;
    public String transParams;
    public String API_NAME = "mtop.tblive.timemoving.query.list";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public int s = 0;
    public int n = 0;
    private long wswgItemId = 0;
    private long liveId = 0;
    public boolean isQueryMounting = true;

    static {
        t2o.a(779092610);
        t2o.a(806355930);
    }

    public String getAPI_NAME() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad3bbbb3", new Object[]{this});
        }
        return this.API_NAME;
    }

    public long getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10168018", new Object[]{this})).longValue();
        }
        return this.liveId;
    }

    public String getVERSION() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a81d7b97", new Object[]{this});
        }
        return this.VERSION;
    }

    public long getWswgItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("691e31cb", new Object[]{this})).longValue();
        }
        return this.wswgItemId;
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

    public void setLiveId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891f6e94", new Object[]{this, new Long(j)});
        } else {
            this.liveId = j;
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

    public void setWswgItemId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17f1941", new Object[]{this, new Long(j)});
        } else {
            this.wswgItemId = j;
        }
    }
}

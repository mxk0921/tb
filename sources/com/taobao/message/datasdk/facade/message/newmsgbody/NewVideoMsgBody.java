package com.taobao.message.datasdk.facade.message.newmsgbody;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewVideoMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOCAL_DATA_COVER_LOCAL_PATH = "cover_local_path";
    private static final String LOCAL_DATA_VIDEO_LOCAL_PATH = "video_local_path";
    private Map<String, Object> localData;

    static {
        t2o.a(529530914);
    }

    public NewVideoMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        super(map);
        this.localData = map2;
    }

    public static /* synthetic */ Object ipc$super(NewVideoMsgBody newVideoMsgBody, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/datasdk/facade/message/newmsgbody/NewVideoMsgBody");
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
        }
        return ValueUtil.getInteger(this.originData, "duration");
    }

    public List<GoodsInfo> getGoodsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b6c3e5b2", new Object[]{this});
        }
        return BaseMsgBody.getGoodsInfo(this.originData);
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return ValueUtil.getInteger(this.originData, "height");
    }

    public Map<String, Object> getLocalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("811783bb", new Object[]{this});
        }
        return this.localData;
    }

    public String getLocalPicPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bdb89df", new Object[]{this});
        }
        return ValueUtil.getString(this.localData, LOCAL_DATA_COVER_LOCAL_PATH);
    }

    public String getLocalVideoPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("258de6ce", new Object[]{this});
        }
        return ValueUtil.getString(this.localData, LOCAL_DATA_VIDEO_LOCAL_PATH);
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "path");
    }

    public String getPic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c154925", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "pic");
    }

    public long getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
        }
        return ValueUtil.getLong(this.originData, "size");
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "url");
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "videoId");
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return ValueUtil.getInteger(this.originData, "width");
    }

    public boolean hasGoodsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("475f4f35", new Object[]{this})).booleanValue();
        }
        return BaseMsgBody.hasGoodsInfo(this.originData);
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("duration", Integer.valueOf(i));
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("height", Integer.valueOf(i));
    }

    public void setLocalPicPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90342677", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_DATA_COVER_LOCAL_PATH, str);
    }

    public void setLocalVideoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfb1468", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_DATA_VIDEO_LOCAL_PATH, str);
    }

    public void setPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("path", str);
    }

    public void setPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d520be59", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("pic", str);
    }

    public void setSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("size", Long.valueOf(j));
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("url", str);
    }

    public void setVideoId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acfc5", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("videoId", str);
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("width", Integer.valueOf(i));
    }
}

package com.taobao.message.datasdk.facade.message.newmsgbody;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewImageMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HIDE_MESSAGE_BUBBLE = "hide_message_bubble";
    private static final String LOCAL_THUMBNAIL_PATH = "local_thumbnail_path";
    private static final String LOCAL_URL = "local_url";
    private Map<String, Object> localData;

    static {
        t2o.a(529530913);
    }

    public NewImageMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        super(map);
        this.localData = map2;
    }

    public static /* synthetic */ Object ipc$super(NewImageMsgBody newImageMsgBody, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/datasdk/facade/message/newmsgbody/NewImageMsgBody");
    }

    public String getFileId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbadda6c", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, tep.KEY_TP_RETURN_VIDEO_FILE_ID);
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

    public String getLocalThumbnailPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d7548fd", new Object[]{this});
        }
        return ValueUtil.getString(this.localData, LOCAL_THUMBNAIL_PATH);
    }

    public String getLocalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83b8fbf", new Object[]{this});
        }
        return ValueUtil.getString(this.localData, "local_url");
    }

    public long getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue();
        }
        return ValueUtil.getLong(this.originData, "size");
    }

    public String getSuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66811712", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, Constants.Name.SUFFIX);
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

    public boolean isHideMessageBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19992252", new Object[]{this})).booleanValue();
        }
        return ValueUtil.getBoolean(this.localData, HIDE_MESSAGE_BUBBLE, false);
    }

    public boolean isOriginal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51fbb026", new Object[]{this})).booleanValue();
        }
        if (ValueUtil.getInteger(this.originData, "isOriginal") == 1) {
            return true;
        }
        return false;
    }

    public void setFileId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b7608a", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put(tep.KEY_TP_RETURN_VIDEO_FILE_ID, str);
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

    public void setHideMessageBubble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d569cf7e", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(HIDE_MESSAGE_BUBBLE, Boolean.valueOf(z));
    }

    public void setLocalThumbnailPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95059219", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_THUMBNAIL_PATH, str);
    }

    public void setLocalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba13c297", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put("local_url", str);
    }

    public void setOriginal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc71d2ba", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("isOriginal", Integer.valueOf(z ? 1 : 0));
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

    public void setSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bb8a4", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put(Constants.Name.SUFFIX, str);
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

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        String string = ValueUtil.getString(this.originData, "url");
        if (TextUtils.isEmpty(string) || !string.contains("&")) {
            return string;
        }
        try {
            String[] split = string.split("&");
            return split.length == 2 ? split[0] : string;
        } catch (Exception unused) {
            return string;
        }
    }
}

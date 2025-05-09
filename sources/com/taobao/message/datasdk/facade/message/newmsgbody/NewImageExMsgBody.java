package com.taobao.message.datasdk.facade.message.newmsgbody;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.tep;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewImageExMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HIDE_MESSAGE_BUBBLE = "hide_message_bubble";
    public static final String LOCAL_DATA_GIF_LOCAL_PATH = "gif_local_path";
    public static final String LOCAL_DATA_URL_LOCAL_PATH = "url_local_path";
    private Map<String, Object> localData;

    static {
        t2o.a(529530912);
    }

    public NewImageExMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        super(map);
        this.localData = map2;
        setHideMessageBubble(true);
    }

    public static /* synthetic */ Object ipc$super(NewImageExMsgBody newImageExMsgBody, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/datasdk/facade/message/newmsgbody/NewImageExMsgBody");
    }

    public String getGifUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e38f98", new Object[]{this});
        }
        String string = ValueUtil.getString(this.originData, "gifUrl");
        if (TextUtils.isEmpty(string)) {
            return getUrl();
        }
        return string;
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

    public String getLocalGifUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72995d9", new Object[]{this});
        }
        String string = ValueUtil.getString(this.localData, LOCAL_DATA_GIF_LOCAL_PATH);
        if (TextUtils.isEmpty(string)) {
            return getLocalUrl();
        }
        return string;
    }

    public String getLocalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83b8fbf", new Object[]{this});
        }
        return ValueUtil.getString(this.localData, LOCAL_DATA_URL_LOCAL_PATH);
    }

    public String getMimeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6adace75", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "mimeType");
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "name");
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return ValueUtil.getString(this.originData, "url");
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return ValueUtil.getInteger(this.originData, "width");
    }

    public boolean isHideMessageBubble() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19992252", new Object[]{this})).booleanValue();
        }
        return ValueUtil.getBoolean(this.localData, HIDE_MESSAGE_BUBBLE, false);
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

    public void setGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3850de", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("gifUrl", str);
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

    public void setLocalGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c05425", new Object[]{this, str});
            return;
        }
        if (this.localData == null) {
            this.localData = new HashMap();
        }
        this.localData.put(LOCAL_DATA_GIF_LOCAL_PATH, str);
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
        this.localData.put(LOCAL_DATA_URL_LOCAL_PATH, str);
    }

    public void setMimeType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5c5aa1", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("mimeType", str);
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
            return;
        }
        if (this.originData == null) {
            this.originData = new HashMap();
        }
        this.originData.put("name", str);
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
}

package com.taobao.desktop.ditto.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetContentData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean anim;
    private List<AnimMeta> animMetas;
    private String appId;
    private String dataContent;
    private List<String> dataFrames;
    private String dslContent;
    private boolean dynamic;
    private String id;
    private String jsonContent;
    private String msgCode;
    private String msgInfo;
    private long nextRefreshTime;
    private boolean success;
    private String title;

    static {
        t2o.a(436207623);
    }

    public List<AnimMeta> getAnimMetas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af05e6b9", new Object[]{this});
        }
        return this.animMetas;
    }

    public String getAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        return this.appId;
    }

    public String getDataContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ef7ac60", new Object[]{this});
        }
        return this.dataContent;
    }

    public List<String> getDataFrames() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a3d1383a", new Object[]{this});
        }
        return this.dataFrames;
    }

    public String getDslContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cd7a47", new Object[]{this});
        }
        return this.dslContent;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public String getJsonContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de26809e", new Object[]{this});
        }
        return this.jsonContent;
    }

    public String getMsgCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f574c921", new Object[]{this});
        }
        return this.msgCode;
    }

    public String getMsgInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8318500", new Object[]{this});
        }
        return this.msgInfo;
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue();
        }
        return this.nextRefreshTime;
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public boolean isAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1397d66", new Object[]{this})).booleanValue();
        }
        return this.anim;
    }

    public boolean isDynamic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c7749c0", new Object[]{this})).booleanValue();
        }
        return this.dynamic;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public void setAnim(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7ad17a", new Object[]{this, new Boolean(z)});
        } else {
            this.anim = z;
        }
    }

    public void setAnimMetas(List<AnimMeta> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb40533", new Object[]{this, list});
        } else {
            this.animMetas = list;
        }
    }

    public void setAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
        } else {
            this.appId = str;
        }
    }

    public void setDataContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b50e7e", new Object[]{this, str});
        } else {
            this.dataContent = str;
        }
    }

    public void setDataFrames(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972cb56a", new Object[]{this, list});
        } else {
            this.dataFrames = list;
        }
    }

    public void setDslContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cb560f", new Object[]{this, str});
        } else {
            this.dslContent = str;
        }
    }

    public void setDynamic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70f3bd0", new Object[]{this, new Boolean(z)});
        } else {
            this.dynamic = z;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setJsonContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe60c200", new Object[]{this, str});
        } else {
            this.jsonContent = str;
        }
    }

    public void setMsgCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c027e3dd", new Object[]{this, str});
        } else {
            this.msgCode = str;
        }
    }

    public void setMsgInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2502a3de", new Object[]{this, str});
        } else {
            this.msgInfo = str;
        }
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.success = z;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }
}

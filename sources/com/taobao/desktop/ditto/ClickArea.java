package com.taobao.desktop.ditto;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ClickArea implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String action;
    private String areaId;
    private String deepUrl;
    private int positionEndX;
    private int positionEndY;
    private int positionStartX;
    private int positionStartY;

    static {
        t2o.a(436207618);
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this});
        }
        return this.action;
    }

    public String getAreaId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20641c3b", new Object[]{this});
        }
        return this.areaId;
    }

    public String getDeepUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ad786c", new Object[]{this});
        }
        return this.deepUrl;
    }

    public int getPositionEndX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31e88c96", new Object[]{this})).intValue();
        }
        return this.positionEndX;
    }

    public int getPositionEndY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31f6a417", new Object[]{this})).intValue();
        }
        return this.positionEndY;
    }

    public int getPositionStartX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d16e79af", new Object[]{this})).intValue();
        }
        return this.positionStartX;
    }

    public int getPositionStartY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d17c9130", new Object[]{this})).intValue();
        }
        return this.positionStartY;
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.action = str;
        }
    }

    public void setAreaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc9589b", new Object[]{this, str});
        } else {
            this.areaId = str;
        }
    }

    public void setDeepUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64051df2", new Object[]{this, str});
        } else {
            this.deepUrl = str;
        }
    }

    public void setPositionEndX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bf8734", new Object[]{this, new Integer(i)});
        } else {
            this.positionEndX = i;
        }
    }

    public void setPositionEndY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8745fd3", new Object[]{this, new Integer(i)});
        } else {
            this.positionEndY = i;
        }
    }

    public void setPositionStartX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa5f03b", new Object[]{this, new Integer(i)});
        } else {
            this.positionStartX = i;
        }
    }

    public void setPositionStartY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5ac8da", new Object[]{this, new Integer(i)});
        } else {
            this.positionStartY = i;
        }
    }
}

package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Intercepts implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean enabled;
    private String logkey;
    private String pageName;
    private List<Point> points;
    private String spmA;
    private String spmB;
    private boolean needExposureBackView = true;
    private boolean enableMatchKey = false;
    private boolean enableImmediateCommit = false;

    static {
        t2o.a(455082027);
    }

    public boolean getEnableMatchKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b448b0fe", new Object[]{this})).booleanValue();
        }
        return this.enableMatchKey;
    }

    public boolean getEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84d1ce16", new Object[]{this})).booleanValue();
        }
        return this.enabled;
    }

    public String getLogkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98291c08", new Object[]{this});
        }
        return this.logkey;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.pageName;
    }

    public List<Point> getPoints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8848a667", new Object[]{this});
        }
        return this.points;
    }

    public String getSpmA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea448852", new Object[]{this});
        }
        return this.spmA;
    }

    public String getSpmB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70ca42f1", new Object[]{this});
        }
        return this.spmB;
    }

    public boolean isEnableImmediateCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49fe7046", new Object[]{this})).booleanValue();
        }
        return this.enableImmediateCommit;
    }

    public boolean isNeedExposureBackView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37225e5e", new Object[]{this})).booleanValue();
        }
        return this.needExposureBackView;
    }

    public void setEnableImmediateCommit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac0e40a", new Object[]{this, new Boolean(z)});
        } else {
            this.enableImmediateCommit = z;
        }
    }

    public void setEnableMatchKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2312e08e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMatchKey = z;
        }
    }

    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
        } else {
            this.enabled = z;
        }
    }

    public void setLogkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4526e", new Object[]{this, str});
        } else {
            this.logkey = str;
        }
    }

    public void setNeedExposureBackView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a57f82", new Object[]{this, new Boolean(z)});
        } else {
            this.needExposureBackView = z;
        }
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.pageName = str;
        }
    }

    public void setPoints(List<Point> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b44f2dd", new Object[]{this, list});
        } else {
            this.points = list;
        }
    }

    public void setSpmA(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cbc264", new Object[]{this, str});
        } else {
            this.spmA = str;
        }
    }

    public void setSpmB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfd5ba5", new Object[]{this, str});
        } else {
            this.spmB = str;
        }
    }
}

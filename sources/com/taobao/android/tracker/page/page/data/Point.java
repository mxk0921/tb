package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;
import tb.x22;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Point implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String aliasName;
    private String arg1;
    private List<AttrArg> attrArgs;
    private String classMatch;
    private List<AttrArg> clickAttrArgs;
    private String clickRule;
    private String clickType;
    private String controlName;
    private String customArgs;
    private String exposeRule;
    private List<AttrArg> expourseAttrArgs;
    private String idMatch;
    private List<AttrArg> jumpAttrArgs;
    private String jumpSpmKey;
    private String logkey;
    private String pageName;
    private String selector;
    private String spmB;
    private String spmC;
    private String spmD;
    private String trackerType;

    static {
        t2o.a(455082028);
    }

    public String getAliasName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e66aedd4", new Object[]{this});
        }
        return this.aliasName;
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return this.arg1;
    }

    public List<AttrArg> getAttrArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aedfe07c", new Object[]{this});
        }
        return this.attrArgs;
    }

    public String getClassMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e4a6fb6", new Object[]{this});
        }
        return this.classMatch;
    }

    public String getClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
        }
        x22.b e = x22.e(this.selector, ":");
        if (e == null || !e.f31088a) {
            return null;
        }
        return e.b;
    }

    public List<AttrArg> getClickAttrArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1941680", new Object[]{this});
        }
        return this.clickAttrArgs;
    }

    public String getClickRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c24a91cb", new Object[]{this});
        }
        return this.clickRule;
    }

    public String getClickType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e377cc4d", new Object[]{this});
        }
        return this.clickType;
    }

    public String getControlName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fd8d1e7", new Object[]{this});
        }
        return this.controlName;
    }

    public String getCustomArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d52a5d95", new Object[]{this});
        }
        return this.customArgs;
    }

    public String getExposeRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a585be3", new Object[]{this});
        }
        return this.exposeRule;
    }

    public List<AttrArg> getExpourseAttrArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b84671b", new Object[]{this});
        }
        return this.expourseAttrArgs;
    }

    public String getIdMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("596ea645", new Object[]{this});
        }
        return this.idMatch;
    }

    public List<AttrArg> getJumpAttrArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e98326e", new Object[]{this});
        }
        return this.jumpAttrArgs;
    }

    public String getJumpSpmKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53e22886", new Object[]{this});
        }
        return this.jumpSpmKey;
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

    public String getSelector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c38a94c4", new Object[]{this});
        }
        return this.selector;
    }

    public String getSpmB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70ca42f1", new Object[]{this});
        }
        return this.spmB;
    }

    public String getSpmC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f74ffd90", new Object[]{this});
        }
        return this.spmC;
    }

    public String getSpmD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd5b82f", new Object[]{this});
        }
        return this.spmD;
    }

    public String getTrackerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92c69b1d", new Object[]{this});
        }
        return this.trackerType;
    }

    public void setAliasName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6930888a", new Object[]{this, str});
        } else {
            this.aliasName = str;
        }
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.arg1 = str;
        }
    }

    public void setAttrArgs(List<AttrArg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfa868", new Object[]{this, list});
        } else {
            this.attrArgs = list;
        }
    }

    public void setClassMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ed0e80", new Object[]{this, str});
        } else {
            this.classMatch = str;
        }
    }

    public void setClickAttrArgs(List<AttrArg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9f744c", new Object[]{this, list});
        } else {
            this.clickAttrArgs = list;
        }
    }

    public void setClickRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9456373", new Object[]{this, str});
        } else {
            this.clickRule = str;
        }
    }

    public void setClickType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf7931", new Object[]{this, str});
        } else {
            this.clickType = str;
        }
    }

    public void setControlName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f899d7", new Object[]{this, str});
        } else {
            this.controlName = str;
        }
    }

    public void setCustomArgs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470adc81", new Object[]{this, str});
        } else {
            this.customArgs = str;
        }
    }

    public void setExposeRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479ca7f3", new Object[]{this, str});
        } else {
            this.exposeRule = str;
        }
    }

    public void setExpourseAttrArgs(List<AttrArg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bce29a9", new Object[]{this, list});
        } else {
            this.expourseAttrArgs = list;
        }
    }

    public void setIdMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db69ab39", new Object[]{this, str});
        } else {
            this.idMatch = str;
        }
    }

    public void setJumpAttrArgs(List<AttrArg> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41512eb6", new Object[]{this, list});
        } else {
            this.jumpAttrArgs = list;
        }
    }

    public void setJumpSpmKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4c6fb0", new Object[]{this, str});
        } else {
            this.jumpSpmKey = str;
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

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.pageName = str;
        }
    }

    public void setSelector(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a55e32", new Object[]{this, str});
        } else {
            this.selector = str;
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

    public void setSpmC(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872ef4e6", new Object[]{this, str});
        } else {
            this.spmC = str;
        }
    }

    public void setSpmD(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1608e27", new Object[]{this, str});
        } else {
            this.spmD = str;
        }
    }

    public void setTrackerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc3f761", new Object[]{this, str});
        } else {
            this.trackerType = str;
        }
    }
}

package com.taobao.android.searchbaseframe.datasource.impl.cell;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.HashMap;
import java.util.Map;
import tb.asi;
import tb.t2o;
import tb.w7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseCellBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public asi combo;
    public int comboIndex;
    public int comboRealIndex;
    public String comboType;
    public String[] curItemIds;
    public String[] curP4pIds;
    public String exposeInfo;
    public boolean exposeRecord;
    public Map<String, Object> extraStatus;
    public boolean forceUpdate;
    public boolean isDynamicLandP4p;
    public boolean isP4p;
    public String itemId;
    public w7p ownedSectionStyle;
    public int pageNo = 0;
    public int pagePos = 0;
    public int pageSize = 0;
    public int originPageNo = -1;
    public int originPagePos = -1;
    public int originPageSize = -1;
    public int sectionPos = -1;
    public int nextSectionPos = -1;
    public boolean isSection = false;
    public int clipHeight = 0;
    public boolean barrier = false;
    public boolean isFullspan = false;
    public boolean comboFullSpan = false;
    public boolean isExposed = false;

    static {
        t2o.a(993001783);
    }

    public static /* synthetic */ Object ipc$super(BaseCellBean baseCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/impl/cell/BaseCellBean");
    }

    public <T extends BaseCellBean> T copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((BaseCellBean) ipChange.ipc$dispatch("cd22362c", new Object[]{this}));
        }
        T t = (T) copyCellBean();
        t.pageNo = this.pageNo;
        t.pagePos = this.pagePos;
        t.pageSize = this.pageSize;
        t.originPageNo = this.originPageNo;
        t.originPagePos = this.originPagePos;
        t.originPageSize = this.originPageSize;
        t.isP4p = this.isP4p;
        t.isDynamicLandP4p = this.isDynamicLandP4p;
        t.itemId = this.itemId;
        t.curItemIds = this.curItemIds;
        t.curP4pIds = this.curP4pIds;
        t.isSection = this.isSection;
        t.isFullspan = this.isFullspan;
        t.comboFullSpan = this.comboFullSpan;
        t.isExposed = this.isExposed;
        t.type = this.type;
        t.rn = this.rn;
        t.abtest = this.abtest;
        t.pageType = this.pageType;
        t.clickTrace = this.clickTrace;
        t.cardType = this.cardType;
        w7p w7pVar = this.ownedSectionStyle;
        if (w7pVar != null) {
            t.ownedSectionStyle = w7pVar.a();
        }
        if (this.extraStatus != null) {
            t.extraStatus = new HashMap(this.extraStatus);
        }
        t.combo = this.combo;
        return t;
    }

    public <T extends BaseCellBean> T copyCellBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((BaseCellBean) ipChange.ipc$dispatch("8656331a", new Object[]{this}));
        }
        return (T) new BaseCellBean();
    }

    public void copyCellData(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
        }
    }

    public int getOriginPageNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1396c66", new Object[]{this})).intValue();
        }
        return this.originPageNo;
    }

    public int getOriginPagePos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a38f9f83", new Object[]{this})).intValue();
        }
        return this.originPagePos;
    }

    public int getOriginPageSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79e1fe6", new Object[]{this})).intValue();
        }
        return this.originPageSize;
    }

    public boolean isForceShowClipOverlay() {
        w7p w7pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d5710d", new Object[]{this})).booleanValue();
        }
        if (!this.isSection || (w7pVar = this.ownedSectionStyle) == null || !w7pVar.g()) {
            return false;
        }
        return true;
    }

    public boolean isSectionClip() {
        w7p w7pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8a9f56", new Object[]{this})).booleanValue();
        }
        if (!this.isSection || (w7pVar = this.ownedSectionStyle) == null || !w7pVar.h()) {
            return false;
        }
        return true;
    }

    public void setOriginPageNo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118aa164", new Object[]{this, new Integer(i)});
        } else if (this.originPageNo < 0) {
            this.originPageNo = i;
        }
    }

    public void setOriginPagePos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6590477f", new Object[]{this, new Integer(i)});
        } else if (this.originPagePos < 0) {
            this.originPagePos = i;
        }
    }

    public void setOriginPageSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6b10e4", new Object[]{this, new Integer(i)});
        } else if (this.originPageSize < 0) {
            this.originPageSize = i;
        }
    }
}

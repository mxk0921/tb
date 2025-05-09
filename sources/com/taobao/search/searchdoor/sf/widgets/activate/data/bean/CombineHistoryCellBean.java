package com.taobao.search.searchdoor.sf.widgets.activate.data.bean;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CombineHistoryCellBean extends HistoryCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String guideUrl;
    private boolean showFoldButton;
    private boolean showGuide;
    private String titleTextSize;
    private String picModName = Localization.q(R.string.taobao_app_1005_1_16662);
    private boolean showPicMod = false;

    static {
        t2o.a(815793193);
    }

    public static /* synthetic */ Object ipc$super(CombineHistoryCellBean combineHistoryCellBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/data/bean/CombineHistoryCellBean");
    }

    public String getGuideUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eb28850", new Object[]{this});
        }
        return this.guideUrl;
    }

    public String getPicModName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e39cf8e0", new Object[]{this});
        }
        return this.picModName;
    }

    public String getTitleTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7aeda369", new Object[]{this});
        }
        return this.titleTextSize;
    }

    public boolean isShowFoldButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a5218c5", new Object[]{this})).booleanValue();
        }
        return this.showFoldButton;
    }

    public boolean isShowGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df2f8a00", new Object[]{this})).booleanValue();
        }
        return this.showGuide;
    }

    public boolean isShowPicMod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e37384a", new Object[]{this})).booleanValue();
        }
        return this.showPicMod;
    }

    public void setGuideUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27bdc26", new Object[]{this, str});
        } else {
            this.guideUrl = str;
        }
    }

    public void setPicModName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebaa96", new Object[]{this, str});
        } else {
            this.picModName = str;
        }
    }

    public void setShowFoldButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34287fb", new Object[]{this, new Boolean(z)});
        } else {
            this.showFoldButton = z;
        }
    }

    public void setShowGuide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a51590", new Object[]{this, new Boolean(z)});
        } else {
            this.showGuide = z;
        }
    }

    public void setShowPicMod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25237d16", new Object[]{this, new Boolean(z)});
        } else {
            this.showPicMod = z;
        }
    }

    public void setTitleTextSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1766ab95", new Object[]{this, str});
        } else {
            this.titleTextSize = str;
        }
    }
}

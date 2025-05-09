package com.alibaba.ariver.app.api.ui.tabbar.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TabBarColorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_BACKGROUND_COLOR = -460551;
    @JSONField
    private long backgroundColor = DEFAULT_BACKGROUND_COLOR;
    @JSONField
    private Integer selectedColor;
    @JSONField
    private Integer textColor;

    public long getBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe59a", new Object[]{this})).longValue();
        }
        return this.backgroundColor;
    }

    public Integer getSelectedColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6a111840", new Object[]{this});
        }
        return this.selectedColor;
    }

    public Integer getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.textColor;
    }

    public void setBackgroundColor(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0474ea", new Object[]{this, new Long(j)});
        } else {
            this.backgroundColor = j;
        }
    }

    public void setSelectedColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa86db8a", new Object[]{this, num});
        } else {
            this.selectedColor = num;
        }
    }

    public void setTextColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ec901c", new Object[]{this, num});
        } else {
            this.textColor = num;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabBarColorModel{textColor=" + this.textColor + ", selectedColor=" + this.selectedColor + ", backgroundColor=" + this.backgroundColor + '}';
    }
}

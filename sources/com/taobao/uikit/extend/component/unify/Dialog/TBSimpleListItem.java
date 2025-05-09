package com.taobao.uikit.extend.component.unify.Dialog;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBSimpleListItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mText;
    public TBSimpleListItemType mType;

    static {
        t2o.a(932184166);
    }

    public TBSimpleListItem() {
        this.mType = TBSimpleListItemType.NORMAL;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.mText;
    }

    public TBSimpleListItemType getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSimpleListItemType) ipChange.ipc$dispatch("53b093a9", new Object[]{this});
        }
        return this.mType;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.mText = str;
        }
    }

    public void setType(TBSimpleListItemType tBSimpleListItemType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d39d5f", new Object[]{this, tBSimpleListItemType});
        } else {
            this.mType = tBSimpleListItemType;
        }
    }

    public TBSimpleListItem(String str, TBSimpleListItemType tBSimpleListItemType) {
        IpChange ipChange = TBSimpleListItemType.$ipChange;
        this.mText = str;
        this.mType = tBSimpleListItemType;
    }
}

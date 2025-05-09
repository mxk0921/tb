package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APListView extends ListView implements APViewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public APListView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(APListView aPListView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 1315126159) {
            super.setOnItemClickListener((AdapterView.OnItemClickListener) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/ui/APListView");
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e633b8f", new Object[]{this, onItemClickListener});
        } else {
            super.setOnItemClickListener(APViewEventHelper.wrapItemClickListener(onItemClickListener));
        }
    }

    public APListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public APListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

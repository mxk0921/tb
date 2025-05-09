package com.alibaba.poplayer.factory.view.base;

import android.text.TextUtils;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ClickableAreaParam implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bottom;
    public int height;
    public String layoutX;
    public String layoutY;
    public int left;
    public int right;
    public int top;
    public int width;

    static {
        t2o.a(625999909);
        t2o.a(625999896);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.left < 0 || this.top < 0 || this.right < 0 || this.bottom < 0 || this.width <= 0 || this.height <= 0 || TextUtils.isEmpty(this.layoutX) || TextUtils.isEmpty(this.layoutY)) {
            return false;
        }
        return true;
    }
}

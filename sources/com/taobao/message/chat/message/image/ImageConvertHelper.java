package com.taobao.message.chat.message.image;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageConvertHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int EXPRESSION_WIDTH_LIMIT = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 150.0f);

    static {
        t2o.a(551550983);
    }

    public void adjustImageSize(Image image) {
        int i;
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65e12a", new Object[]{this, image});
            return;
        }
        int i2 = image.width;
        if (i2 != 0 && (i = image.height) != 0) {
            if (i2 > i) {
                f = i;
                f2 = i2;
            } else {
                f = i2;
                f2 = i;
            }
            float f3 = f / f2;
            if (i2 > i) {
                int i3 = this.EXPRESSION_WIDTH_LIMIT;
                if (i2 * 1.5d <= i3) {
                    i3 = (int) (i2 * 1.5d);
                }
                image.width = i3;
                image.height = (int) (i3 * f3);
                return;
            }
            int i4 = this.EXPRESSION_WIDTH_LIMIT;
            if (i * 1.5d <= i4) {
                i4 = (int) (i * 1.5d);
            }
            image.height = i4;
            image.width = (int) (i4 * f3);
        }
    }
}

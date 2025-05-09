package com.taobao.bootimage.arch.flow.view;

import android.graphics.Color;
import com.alibaba.ability.localization.Localization;
import com.taobao.taobao.R;
import java.io.Serializable;
import tb.t2o;
import tb.why;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkipStyle implements Serializable {
    public boolean isHide = false;
    public int background = -1;
    public String skipText = Localization.q(R.string.taobao_app_1000_1_17005);
    public int skipTextSize = 15;
    public int skipTextColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
    public int countTimeTextSize = 15;
    public int countTimeTextColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
    public boolean skipTextIsBold = false;
    public boolean countTimeTextIsBold = false;

    static {
        t2o.a(736100438);
    }
}

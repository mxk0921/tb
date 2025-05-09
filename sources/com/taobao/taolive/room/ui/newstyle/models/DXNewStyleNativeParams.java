package com.taobao.taolive.room.ui.newstyle.models;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.hw0;
import tb.o3s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXNewStyleNativeParams implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DXNewStyleNativeParams";
    public String backgroundColor;
    public String cornerRadius;
    public boolean enableLiveNewStyle;

    static {
        t2o.a(806355812);
        t2o.a(806355930);
    }

    public DXNewStyleNativeParams(Context context, NewStyleUtils.NewStyleType newStyleType) {
        this(context, getPxFromSizeType(context, newStyleType));
    }

    public static int getPxFromSizeType(Context context, NewStyleUtils.NewStyleType newStyleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("242fa8f0", new Object[]{context, newStyleType})).intValue();
        }
        if (newStyleType == NewStyleUtils.NewStyleType.SMALL) {
            return context.getResources().getDimensionPixelSize(R.dimen.taolive_room_new_style_corner_radius_small);
        }
        return context.getResources().getDimensionPixelSize(R.dimen.taolive_room_new_style_corner_radius_large);
    }

    public DXNewStyleNativeParams(Context context, int i) {
        this.enableLiveNewStyle = true;
        try {
            this.cornerRadius = String.valueOf(hw0.s(i));
            this.backgroundColor = String.format("#%08X", Integer.valueOf(context.getResources().getColor(R.color.taolive_room_new_style_bg_color)));
        } catch (Exception e) {
            o3s.b(TAG, e.toString());
        }
    }
}

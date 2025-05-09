package com.taobao.taolive.room.ui.newstyle.utils;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.newstyle.models.DXNewStyleNativeParams;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.fkx;
import tb.qtq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NewStyleUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum NewStyleType {
        SMALL,
        LARGE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NewStyleType newStyleType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/newstyle/utils/NewStyleUtils$NewStyleType");
        }

        public static NewStyleType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NewStyleType) ipChange.ipc$dispatch("7445a3bc", new Object[]{str});
            }
            return (NewStyleType) Enum.valueOf(NewStyleType.class, str);
        }
    }

    static {
        t2o.a(806355813);
    }

    public static Object a(Context context, NewStyleType newStyleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d4afe116", new Object[]{context, newStyleType});
        }
        if (context == null || newStyleType == null) {
            return null;
        }
        return fkx.h(new DXNewStyleNativeParams(context, newStyleType));
    }

    public static void b(Context context, View view, NewStyleType newStyleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fbf76c3", new Object[]{context, view, newStyleType});
            return;
        }
        d(context, view, newStyleType);
        c(context, view);
    }

    public static void c(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d9ac3c", new Object[]{context, view});
        } else {
            qtq.a(context, view, R.color.taolive_room_new_style_bg_color);
        }
    }

    public static void d(Context context, View view, NewStyleType newStyleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4a626a", new Object[]{context, view, newStyleType});
        } else if (newStyleType == NewStyleType.SMALL) {
            qtq.b(context, view, R.dimen.taolive_room_new_style_corner_radius_small);
        } else if (newStyleType == NewStyleType.LARGE) {
            qtq.b(context, view, R.dimen.taolive_room_new_style_corner_radius_large);
        }
    }

    public static void e(Context context, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11bb439", new Object[]{context, tUrlImageView});
        } else {
            qtq.c(context, tUrlImageView, R.dimen.taolive_room_new_style_bottom_icon_size);
        }
    }
}

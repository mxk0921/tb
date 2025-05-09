package com.taobao.family.globalbubble;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.ch0;
import tb.dac;
import tb.zhp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GlobalWindowFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AMP_CONVERSATION = "event_amp_conversation";
    public static final String EVENT_LOCATION_RESET = "event_location_reset";
    public static final String EVENT_SHARE_BACK_POP = "event_share_back_pop";
    public static final int TYPE_PAGE = 1;
    public static final String WINDOW_AFFECTION = "window_affection";
    public static final String WINDOW_SHAREBACK = "window_shareback";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface GlobalEvent {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface GlobalWindow {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface WindowType {
    }

    public static dac a(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dac) ipChange.ipc$dispatch("771c8815", new Object[]{str, new Boolean(z), new Integer(i)});
        }
        str.hashCode();
        if (str.equals(WINDOW_SHAREBACK)) {
            return new zhp(Globals.getApplication(), z, i);
        }
        if (!str.equals(WINDOW_AFFECTION)) {
            return null;
        }
        return new ch0(Globals.getApplication(), z, i);
    }
}

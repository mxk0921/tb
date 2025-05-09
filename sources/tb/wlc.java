package tb;

import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface wlc {
    public static final int TYPE_CANCEL_PRELOAD = 0;
    public static final int TYPE_ICON_STREAM_PRELOAD = 3;
    public static final int TYPE_NORMAL_PRELOAD = 1;

    LivePreloadData a();

    void cancel();

    void execute();
}

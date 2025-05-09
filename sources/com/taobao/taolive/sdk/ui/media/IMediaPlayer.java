package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.v4q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IMediaPlayer extends v4q {
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_NETWORK_TRAFFIC = 714;
    public static final int MEDIA_INFO_SEI_USERDEFINED_STRUCT = 715;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_OUT_OF_BUFFERING = 300;
    public static final int MEDIA_RESUME_BUFFERING = 301;
    public static final int PLAYER_TYPE_FF = 1;
    public static final int PLAYER_TYPE_MEDIA = 2;
    public static final int PLAYER_TYPE_TAOBAO = 3;
    public static final int RENDER_TYPE_SURFACE_VIEW = 1;
    public static final int RENDER_TYPE_TEXTURE_VIEW = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 1;
    public static final int SCALE_TYPE_FIT_CENTER = 0;
    public static final int SCALE_TYPE_FIT_XY = 3;
    public static final int SCENARIO_TYPE_LINKLIVE = 1;
    public static final int SCENARIO_TYPE_LIVE = 0;
    public static final int SCENARIO_TYPE_PLAYBACK = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum AspectRatio {
        FIT_CENTER,
        CENTER_CROP,
        FIT_X_Y,
        DW_FIT_ADAPT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AspectRatio aspectRatio, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/media/IMediaPlayer$AspectRatio");
        }

        public static AspectRatio valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio) ipChange.ipc$dispatch("49733dc4", new Object[]{str});
            }
            return (AspectRatio) Enum.valueOf(AspectRatio.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum UpdataUrlListMode {
        INIT(0),
        REPLACE_BY_URL_ID_OF_NEW_DEFINITION(1),
        REPLACE_FORCE_OF_NEW_DEFINITION(2);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        UpdataUrlListMode(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(UpdataUrlListMode updataUrlListMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/media/IMediaPlayer$UpdataUrlListMode");
        }

        public static UpdataUrlListMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UpdataUrlListMode) ipChange.ipc$dispatch("b86d926c", new Object[]{str});
            }
            return (UpdataUrlListMode) Enum.valueOf(UpdataUrlListMode.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum WarmState {
        NORMAL,
        WARMING,
        WARMED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(WarmState warmState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/media/IMediaPlayer$WarmState");
        }

        public static WarmState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WarmState) ipChange.ipc$dispatch("815e016b", new Object[]{str});
            }
            return (WarmState) Enum.valueOf(WarmState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onCompletion(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void onHighLightLoopCompletion(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
        void onPause(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface g {
        void onPlay(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface h {
        void onPrepared(IMediaPlayer iMediaPlayer);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface i {
        void onStart(IMediaPlayer iMediaPlayer);
    }

    String a();

    String b();

    void d(c cVar);

    void destroy();

    MediaData getDataSource();

    void release();
}

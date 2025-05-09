package com.taobao.kmp.nexus.arch.openArch.service.playcontrol.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/listener/MediaEventType;", "", "<init>", "(Ljava/lang/String;I)V", "MEDIA_NOP", "MEDIA_PREPARED", "MEDIA_PLAYBACK_COMPLETE", "MEDIA_BUFFERING_UPDATE", "MEDIA_SEEK_COMPLETE", "MEDIA_SET_VIDEO_SIZE", "MEDIA_TIMED_TEXT", "MEDIA_ERROR", "MEDIA_INFO", "MEDIA_SEEK_START", "MEDIA_SET_VIDEO_SAR", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MediaEventType extends Enum<MediaEventType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ MediaEventType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MediaEventType MEDIA_NOP = new MediaEventType("MEDIA_NOP", 0);
    public static final MediaEventType MEDIA_PREPARED = new MediaEventType("MEDIA_PREPARED", 1);
    public static final MediaEventType MEDIA_PLAYBACK_COMPLETE = new MediaEventType("MEDIA_PLAYBACK_COMPLETE", 2);
    public static final MediaEventType MEDIA_BUFFERING_UPDATE = new MediaEventType("MEDIA_BUFFERING_UPDATE", 3);
    public static final MediaEventType MEDIA_SEEK_COMPLETE = new MediaEventType("MEDIA_SEEK_COMPLETE", 4);
    public static final MediaEventType MEDIA_SET_VIDEO_SIZE = new MediaEventType("MEDIA_SET_VIDEO_SIZE", 5);
    public static final MediaEventType MEDIA_TIMED_TEXT = new MediaEventType("MEDIA_TIMED_TEXT", 6);
    public static final MediaEventType MEDIA_ERROR = new MediaEventType("MEDIA_ERROR", 7);
    public static final MediaEventType MEDIA_INFO = new MediaEventType("MEDIA_INFO", 8);
    public static final MediaEventType MEDIA_SEEK_START = new MediaEventType("MEDIA_SEEK_START", 9);
    public static final MediaEventType MEDIA_SET_VIDEO_SAR = new MediaEventType("MEDIA_SET_VIDEO_SAR", 10);

    private static final /* synthetic */ MediaEventType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaEventType[]) ipChange.ipc$dispatch("d57b4870", new Object[0]) : new MediaEventType[]{MEDIA_NOP, MEDIA_PREPARED, MEDIA_PLAYBACK_COMPLETE, MEDIA_BUFFERING_UPDATE, MEDIA_SEEK_COMPLETE, MEDIA_SET_VIDEO_SIZE, MEDIA_TIMED_TEXT, MEDIA_ERROR, MEDIA_INFO, MEDIA_SEEK_START, MEDIA_SET_VIDEO_SAR};
    }

    static {
        MediaEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MediaEventType(String str, int i) {
    }

    public static fg8<MediaEventType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(MediaEventType mediaEventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/listener/MediaEventType");
    }

    public static MediaEventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaEventType) ipChange.ipc$dispatch("37cb6edb", new Object[]{str});
        }
        return (MediaEventType) Enum.valueOf(MediaEventType.class, str);
    }

    public static MediaEventType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaEventType[]) ipChange.ipc$dispatch("f7800d4c", new Object[0]);
        }
        return (MediaEventType[]) $VALUES.clone();
    }
}

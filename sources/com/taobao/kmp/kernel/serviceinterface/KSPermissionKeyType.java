package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPermissionKeyType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "COARSE_LOCATION", "FINE_LOCATION", "READ_CALENDAR", "WRITE_CALENDAR", "READ_CONTACTS", "WRITE_CONTACTS", "READ_IMAGES", "WRITE_IMAGES", "READ_VIDEO", "WRITE_VIDEO", "READ_AUDIO", "WRITE_AUDIO", "RECORD_AUDIO", "TAKE_CAMERA", "READ_PASTEBOARD", "ACTIVITY_MOTION", "DAILY_ACTIVITIES", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPermissionKeyType extends Enum<KSPermissionKeyType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSPermissionKeyType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSPermissionKeyType COARSE_LOCATION = new KSPermissionKeyType("COARSE_LOCATION", 0, "COARSE_LOCATION");
    public static final KSPermissionKeyType FINE_LOCATION = new KSPermissionKeyType("FINE_LOCATION", 1, "FINE_LOCATION");
    public static final KSPermissionKeyType READ_CALENDAR = new KSPermissionKeyType("READ_CALENDAR", 2, "READ_CALENDAR");
    public static final KSPermissionKeyType WRITE_CALENDAR = new KSPermissionKeyType("WRITE_CALENDAR", 3, "WRITE_CALENDAR");
    public static final KSPermissionKeyType READ_CONTACTS = new KSPermissionKeyType("READ_CONTACTS", 4, "READ_CONTACTS");
    public static final KSPermissionKeyType WRITE_CONTACTS = new KSPermissionKeyType("WRITE_CONTACTS", 5, "WRITE_CONTACTS");
    public static final KSPermissionKeyType READ_IMAGES = new KSPermissionKeyType("READ_IMAGES", 6, "READ_IMAGES");
    public static final KSPermissionKeyType WRITE_IMAGES = new KSPermissionKeyType("WRITE_IMAGES", 7, "WRITE_IMAGES");
    public static final KSPermissionKeyType READ_VIDEO = new KSPermissionKeyType("READ_VIDEO", 8, "READ_VIDEO");
    public static final KSPermissionKeyType WRITE_VIDEO = new KSPermissionKeyType("WRITE_VIDEO", 9, "WRITE_VIDEO");
    public static final KSPermissionKeyType READ_AUDIO = new KSPermissionKeyType("READ_AUDIO", 10, "READ_AUDIO");
    public static final KSPermissionKeyType WRITE_AUDIO = new KSPermissionKeyType("WRITE_AUDIO", 11, "WRITE_AUDIO");
    public static final KSPermissionKeyType RECORD_AUDIO = new KSPermissionKeyType("RECORD_AUDIO", 12, "RECORD_AUDIO");
    public static final KSPermissionKeyType TAKE_CAMERA = new KSPermissionKeyType("TAKE_CAMERA", 13, "TAKE_CAMERA");
    public static final KSPermissionKeyType READ_PASTEBOARD = new KSPermissionKeyType("READ_PASTEBOARD", 14, "READ_PASTEBOARD");
    public static final KSPermissionKeyType ACTIVITY_MOTION = new KSPermissionKeyType("ACTIVITY_MOTION", 15, "ACTIVITY_MOTION");
    public static final KSPermissionKeyType DAILY_ACTIVITIES = new KSPermissionKeyType("DAILY_ACTIVITIES", 16, "DAILY_ACTIVITIES");

    private static final /* synthetic */ KSPermissionKeyType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSPermissionKeyType[]) ipChange.ipc$dispatch("e057c4ac", new Object[0]) : new KSPermissionKeyType[]{COARSE_LOCATION, FINE_LOCATION, READ_CALENDAR, WRITE_CALENDAR, READ_CONTACTS, WRITE_CONTACTS, READ_IMAGES, WRITE_IMAGES, READ_VIDEO, WRITE_VIDEO, READ_AUDIO, WRITE_AUDIO, RECORD_AUDIO, TAKE_CAMERA, READ_PASTEBOARD, ACTIVITY_MOTION, DAILY_ACTIVITIES};
    }

    static {
        KSPermissionKeyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSPermissionKeyType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSPermissionKeyType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSPermissionKeyType kSPermissionKeyType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPermissionKeyType");
    }

    public static KSPermissionKeyType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionKeyType) ipChange.ipc$dispatch("38bd0e97", new Object[]{str});
        }
        return (KSPermissionKeyType) Enum.valueOf(KSPermissionKeyType.class, str);
    }

    public static KSPermissionKeyType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSPermissionKeyType[]) ipChange.ipc$dispatch("ee328f88", new Object[0]);
        }
        return (KSPermissionKeyType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/PermissionKeyType;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "COARSE_LOCATION", "FINE_LOCATION", "READ_CALENDAR", "WRITE_CALENDAR", "READ_CONTACTS", "WRITE_CONTACTS", "READ_IMAGES", "WRITE_IMAGES", "READ_VIDEO", "WRITE_VIDEO", "READ_AUDIO", "WRITE_AUDIO", "RECORD_AUDIO", "TAKE_CAMERA", "READ_PASTEBOARD", "ACTIVITY_MOTION", "DAILY_ACTIVITIES", "APP_TRACKING", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PermissionKeyType extends Enum<PermissionKeyType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ PermissionKeyType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final PermissionKeyType COARSE_LOCATION = new PermissionKeyType("COARSE_LOCATION", 0, "COARSE_LOCATION");
    public static final PermissionKeyType FINE_LOCATION = new PermissionKeyType("FINE_LOCATION", 1, "FINE_LOCATION");
    public static final PermissionKeyType READ_CALENDAR = new PermissionKeyType("READ_CALENDAR", 2, "READ_CALENDAR");
    public static final PermissionKeyType WRITE_CALENDAR = new PermissionKeyType("WRITE_CALENDAR", 3, "WRITE_CALENDAR");
    public static final PermissionKeyType READ_CONTACTS = new PermissionKeyType("READ_CONTACTS", 4, "READ_CONTACTS");
    public static final PermissionKeyType WRITE_CONTACTS = new PermissionKeyType("WRITE_CONTACTS", 5, "WRITE_CONTACTS");
    public static final PermissionKeyType READ_IMAGES = new PermissionKeyType("READ_IMAGES", 6, "READ_IMAGES");
    public static final PermissionKeyType WRITE_IMAGES = new PermissionKeyType("WRITE_IMAGES", 7, "WRITE_IMAGES");
    public static final PermissionKeyType READ_VIDEO = new PermissionKeyType("READ_VIDEO", 8, "READ_VIDEO");
    public static final PermissionKeyType WRITE_VIDEO = new PermissionKeyType("WRITE_VIDEO", 9, "WRITE_VIDEO");
    public static final PermissionKeyType READ_AUDIO = new PermissionKeyType("READ_AUDIO", 10, "READ_AUDIO");
    public static final PermissionKeyType WRITE_AUDIO = new PermissionKeyType("WRITE_AUDIO", 11, "WRITE_AUDIO");
    public static final PermissionKeyType RECORD_AUDIO = new PermissionKeyType("RECORD_AUDIO", 12, "RECORD_AUDIO");
    public static final PermissionKeyType TAKE_CAMERA = new PermissionKeyType("TAKE_CAMERA", 13, "TAKE_CAMERA");
    public static final PermissionKeyType READ_PASTEBOARD = new PermissionKeyType("READ_PASTEBOARD", 14, "READ_PASTEBOARD");
    public static final PermissionKeyType ACTIVITY_MOTION = new PermissionKeyType("ACTIVITY_MOTION", 15, "ACTIVITY_MOTION");
    public static final PermissionKeyType DAILY_ACTIVITIES = new PermissionKeyType("DAILY_ACTIVITIES", 16, "DAILY_ACTIVITIES");
    public static final PermissionKeyType APP_TRACKING = new PermissionKeyType("APP_TRACKING", 17, "APP_TRACKING");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361825);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ PermissionKeyType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PermissionKeyType[]) ipChange.ipc$dispatch("48274c40", new Object[0]) : new PermissionKeyType[]{COARSE_LOCATION, FINE_LOCATION, READ_CALENDAR, WRITE_CALENDAR, READ_CONTACTS, WRITE_CONTACTS, READ_IMAGES, WRITE_IMAGES, READ_VIDEO, WRITE_VIDEO, READ_AUDIO, WRITE_AUDIO, RECORD_AUDIO, TAKE_CAMERA, READ_PASTEBOARD, ACTIVITY_MOTION, DAILY_ACTIVITIES, APP_TRACKING};
    }

    static {
        PermissionKeyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PermissionKeyType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<PermissionKeyType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(PermissionKeyType permissionKeyType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/PermissionKeyType");
    }

    public static PermissionKeyType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionKeyType) ipChange.ipc$dispatch("fc6b3fb5", new Object[]{str});
        }
        return (PermissionKeyType) Enum.valueOf(PermissionKeyType.class, str);
    }

    public static PermissionKeyType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionKeyType[]) ipChange.ipc$dispatch("f5a5dce4", new Object[0]);
        }
        return (PermissionKeyType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}

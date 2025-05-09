package com.taobao.kmp.nexus.arch.openArch.service.playcontrol;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.ckf;
import tb.fg8;
import tb.t2o;
import tb.z5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PlayControlService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PlayControlService INSTANCE = new PlayControlService();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, z5m> f10888a = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/playcontrol/PlayControlService$PlayControlLogType;", "", "<init>", "(Ljava/lang/String;I)V", "Info", "Warn", "Error", "Debug", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class PlayControlLogType extends Enum<PlayControlLogType> {
        private static final /* synthetic */ fg8 $ENTRIES;
        private static final /* synthetic */ PlayControlLogType[] $VALUES;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final PlayControlLogType Info = new PlayControlLogType("Info", 0);
        public static final PlayControlLogType Warn = new PlayControlLogType("Warn", 1);
        public static final PlayControlLogType Error = new PlayControlLogType("Error", 2);
        public static final PlayControlLogType Debug = new PlayControlLogType("Debug", 3);

        private static final /* synthetic */ PlayControlLogType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PlayControlLogType[]) ipChange.ipc$dispatch("5ab9e36e", new Object[0]) : new PlayControlLogType[]{Info, Warn, Error, Debug};
        }

        static {
            PlayControlLogType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PlayControlLogType(String str, int i) {
        }

        public static fg8<PlayControlLogType> getEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
            }
            return $ENTRIES;
        }

        public static /* synthetic */ Object ipc$super(PlayControlLogType playControlLogType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/playcontrol/PlayControlService$PlayControlLogType");
        }

        public static PlayControlLogType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PlayControlLogType) ipChange.ipc$dispatch("9184f299", new Object[]{str});
            }
            return (PlayControlLogType) Enum.valueOf(PlayControlLogType.class, str);
        }

        public static PlayControlLogType[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PlayControlLogType[]) ipChange.ipc$dispatch("dba6f74a", new Object[0]);
            }
            return (PlayControlLogType[]) $VALUES.clone();
        }
    }

    static {
        t2o.a(1004536611);
        new LinkedHashMap();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c33e4f", new Object[]{this, str});
            return;
        }
        ckf.g(str, "msg");
        b(str, PlayControlLogType.Info);
    }

    public final void b(String str, PlayControlLogType playControlLogType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6a4147", new Object[]{this, str, playControlLogType});
        }
    }
}

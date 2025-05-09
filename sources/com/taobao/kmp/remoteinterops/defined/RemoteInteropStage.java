package com.taobao.kmp.remoteinterops.defined;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.ied;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/kmp/remoteinterops/defined/RemoteInteropStage;", "", "<init>", "(Ljava/lang/String;I)V", ied.PULL_INIT, "ModuleLoading", "ModuleLoaded", "InvokePerforming", "InvokePerformed", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropStage extends Enum<RemoteInteropStage> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropStage[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RemoteInteropStage Init = new RemoteInteropStage(ied.PULL_INIT, 0);
    public static final RemoteInteropStage ModuleLoading = new RemoteInteropStage("ModuleLoading", 1);
    public static final RemoteInteropStage ModuleLoaded = new RemoteInteropStage("ModuleLoaded", 2);
    public static final RemoteInteropStage InvokePerforming = new RemoteInteropStage("InvokePerforming", 3);
    public static final RemoteInteropStage InvokePerformed = new RemoteInteropStage("InvokePerformed", 4);

    private static final /* synthetic */ RemoteInteropStage[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropStage[]) ipChange.ipc$dispatch("fea23f35", new Object[0]) : new RemoteInteropStage[]{Init, ModuleLoading, ModuleLoaded, InvokePerforming, InvokePerformed};
    }

    static {
        RemoteInteropStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteInteropStage(String str, int i) {
    }

    public static fg8<RemoteInteropStage> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropStage remoteInteropStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/defined/RemoteInteropStage");
    }

    public static RemoteInteropStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropStage) ipChange.ipc$dispatch("211707e0", new Object[]{str});
        }
        return (RemoteInteropStage) Enum.valueOf(RemoteInteropStage.class, str);
    }

    public static RemoteInteropStage[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropStage[]) ipChange.ipc$dispatch("f2a1111", new Object[0]);
        }
        return (RemoteInteropStage[]) $VALUES.clone();
    }
}

package com.taobao.kmp.remoteinterops.defined;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/kmp/remoteinterops/defined/RemoteInteropModuleCategory;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "TaoLiveRoomRemoteAType", "TaoLiveChannelRemote", "TaoLiveRoomRemoteBType", "KTBiz", "KTCrossPlatform", "KTNexus", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropModuleCategory extends Enum<RemoteInteropModuleCategory> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropModuleCategory[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String code;
    public static final RemoteInteropModuleCategory TaoLiveRoomRemoteAType = new RemoteInteropModuleCategory("TaoLiveRoomRemoteAType", 0, "TaoLiveRoomBizSDKRemote");
    public static final RemoteInteropModuleCategory TaoLiveChannelRemote = new RemoteInteropModuleCategory("TaoLiveChannelRemote", 1, "TaoLiveChannelRemote");
    public static final RemoteInteropModuleCategory TaoLiveRoomRemoteBType = new RemoteInteropModuleCategory("TaoLiveRoomRemoteBType", 2, "TaoLiveRoomBizSDKRemote");
    public static final RemoteInteropModuleCategory KTBiz = new RemoteInteropModuleCategory("KTBiz", 3, "KTBiz");
    public static final RemoteInteropModuleCategory KTCrossPlatform = new RemoteInteropModuleCategory("KTCrossPlatform", 4, FlexaLiveX.TAOLIVE_CROSSPLATFORM);
    public static final RemoteInteropModuleCategory KTNexus = new RemoteInteropModuleCategory("KTNexus", 5, FlexaLiveX.TAOLIVE_NEXUS);

    private static final /* synthetic */ RemoteInteropModuleCategory[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropModuleCategory[]) ipChange.ipc$dispatch("ab8432b9", new Object[0]) : new RemoteInteropModuleCategory[]{TaoLiveRoomRemoteAType, TaoLiveChannelRemote, TaoLiveRoomRemoteBType, KTBiz, KTCrossPlatform, KTNexus};
    }

    static {
        RemoteInteropModuleCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RemoteInteropModuleCategory(String str, int i, String str2) {
        this.code = str2;
    }

    public static fg8<RemoteInteropModuleCategory> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropModuleCategory remoteInteropModuleCategory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/defined/RemoteInteropModuleCategory");
    }

    public static RemoteInteropModuleCategory valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropModuleCategory) ipChange.ipc$dispatch("98fefa6e", new Object[]{str});
        }
        return (RemoteInteropModuleCategory) Enum.valueOf(RemoteInteropModuleCategory.class, str);
    }

    public static RemoteInteropModuleCategory[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropModuleCategory[]) ipChange.ipc$dispatch("2754b85d", new Object[0]);
        }
        return (RemoteInteropModuleCategory[]) $VALUES.clone();
    }

    public final String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }
}

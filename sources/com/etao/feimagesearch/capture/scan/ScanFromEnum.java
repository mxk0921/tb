package com.etao.feimagesearch.capture.scan;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ScanFromEnum extends Enum<ScanFromEnum> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String scanFrom;
    public static final ScanFromEnum SYS_CAMERA = new ScanFromEnum("SYS_CAMERA", 0, "sys_camera");
    public static final ScanFromEnum SYS_ALBUM = new ScanFromEnum("SYS_ALBUM", 1, "sys_album");
    public static final ScanFromEnum SYS_HISTORY = new ScanFromEnum("SYS_HISTORY", 2, "sys_history");
    public static final ScanFromEnum PLT_CAMERA = new ScanFromEnum("PLT_CAMERA", 3, "plt_camera");
    public static final ScanFromEnum PLT_ALBUM = new ScanFromEnum("PLT_ALBUM", 4, "plt_album");
    public static final ScanFromEnum PLT_HISTORY = new ScanFromEnum("PLT_HISTORY", 5, "plt_history");
    public static final ScanFromEnum PLT_OUTER_ALBUM = new ScanFromEnum("PLT_OUTER_ALBUM", 6, "plt_outer_album");
    public static final ScanFromEnum SMART_LENS = new ScanFromEnum("SMART_LENS", 7, "smart_lens");
    private static final /* synthetic */ ScanFromEnum[] $VALUES = $values();

    private static final /* synthetic */ ScanFromEnum[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScanFromEnum[]) ipChange.ipc$dispatch("cd19b67f", new Object[0]) : new ScanFromEnum[]{SYS_CAMERA, SYS_ALBUM, SYS_HISTORY, PLT_CAMERA, PLT_ALBUM, PLT_HISTORY, PLT_OUTER_ALBUM, SMART_LENS};
    }

    private ScanFromEnum(String str, int i, String str2) {
        this.scanFrom = str2;
    }

    public static /* synthetic */ Object ipc$super(ScanFromEnum scanFromEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/ScanFromEnum");
    }

    public static ScanFromEnum valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("f42b5a2a", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(ScanFromEnum.class, str);
        }
        return (ScanFromEnum) valueOf;
    }

    public static ScanFromEnum[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("948f245b", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (ScanFromEnum[]) clone;
    }

    public final String getScanFrom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9f83ddc", new Object[]{this});
        }
        return this.scanFrom;
    }
}

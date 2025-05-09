package tb;

import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final /* synthetic */ class tv7 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        t2o.a(104857604);
        int[] iArr = new int[DownloadCenter.DownloadError.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[DownloadCenter.DownloadError.OUT_OF_SPACE.ordinal()] = 1;
        iArr[DownloadCenter.DownloadError.NETWORK_ERROR.ordinal()] = 2;
        iArr[DownloadCenter.DownloadError.FILE_MD5_ERROR.ordinal()] = 3;
        iArr[DownloadCenter.DownloadError.FILE_SIZE_ERROR.ordinal()] = 4;
    }
}

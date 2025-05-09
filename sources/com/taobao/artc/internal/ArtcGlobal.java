package com.taobao.artc.internal;

import android.app.Application;
import android.content.Context;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.internal.ADefines;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcGlobal {
    public static Context context;
    public static int isAccsInit = ADefines.AccsStatus.ARTC_ACCS_UNINIT.ordinal();
    public static boolean isAccsConnectd = false;
    public static Application appInstance = null;
    public static AConstants.ArtcUtType utType = AConstants.ArtcUtType.ARTC_UT_UNKNOWN;
    public static String alinnAuthCode = "";
    @Deprecated
    public static boolean bypassVideoPreprocess = false;
    @Deprecated
    public static boolean bypassBeauty = false;

    static {
        t2o.a(395313285);
    }
}

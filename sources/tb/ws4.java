package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.open.utils.LocalPathType;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ws4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ws4 INSTANCE = new ws4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(843055401);
            int[] iArr = new int[ApPathType.values().length];
            iArr[ApPathType.AP_PATH_TYPE_USR.ordinal()] = 1;
            iArr[ApPathType.AP_PATH_TYPE_TEMP.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(843055400);
    }

    @JvmStatic
    public static final String a(String str, String str2, ApPathType apPathType) {
        Context context;
        int i;
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("525b9956", new Object[]{str, str2, apPathType});
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "apPath");
        TMSLogger.a("ConversionPathTool", "apPathToLocalPath:bizId = " + str + ", apPath = " + str2 + ", apPathType = " + apPathType);
        if (str2.length() == 0 || str.length() == 0) {
            return null;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            context = null;
        } else {
            context = applicationContext.getApplicationContext();
        }
        if (context == null) {
            return null;
        }
        if (apPathType == null) {
            apPathType = c(str2);
        }
        if (apPathType == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[apPathType.ordinal()];
        }
        if (i == 1) {
            return bvv.b(context, str2, str);
        }
        if (i != 2) {
            return null;
        }
        return bit.Companion.a(str, context).f(str2);
    }

    public static /* synthetic */ String b(String str, String str2, ApPathType apPathType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2162d6e", new Object[]{str, str2, apPathType, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            apPathType = null;
        }
        return a(str, str2, apPathType);
    }

    @JvmStatic
    public static final ApPathType c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApPathType) ipChange.ipc$dispatch("d227180b", new Object[]{str});
        }
        if (tsq.I(str, bvv.PATH_PREFIX, false, 2, null)) {
            return ApPathType.AP_PATH_TYPE_USR;
        }
        if (tsq.I(str, bit.PATH_PREFIX, false, 2, null)) {
            return ApPathType.AP_PATH_TYPE_TEMP;
        }
        return null;
    }

    @JvmStatic
    public static final ApPathType d(String str, bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApPathType) ipChange.ipc$dispatch("73dbaa67", new Object[]{str, bbsVar});
        }
        ckf.g(str, "apPath");
        ckf.g(bbsVar, "instance");
        if (tsq.I(str, bvv.PATH_PREFIX, false, 2, null)) {
            return ApPathType.AP_PATH_TYPE_USR;
        }
        if (tsq.I(str, bit.PATH_PREFIX, false, 2, null)) {
            return ApPathType.AP_PATH_TYPE_TEMP;
        }
        if (tsq.I(str, h1p.HTTP_PREFIX, false, 2, null) || tsq.I(str, h1p.HTTPS_PREFIX, false, 2, null)) {
            return ApPathType.AP_PATH_TYPE_NETWORK;
        }
        if (gcs.a(str, bbsVar)) {
            return ApPathType.AP_PATH_TYPE_PKG;
        }
        return ApPathType.AP_PATH_TYPE_UNKNOWN;
    }

    @JvmStatic
    public static final LocalPathType e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalPathType) ipChange.ipc$dispatch("e020a143", new Object[]{str});
        }
        ckf.g(str, gl4.CONFIG_LOCAL_PATH);
        if (tsq.I(str, bvv.LOCAL_PATH_FLAG, false, 2, null)) {
            return LocalPathType.LOCAL_PATH_TYPE_USR;
        }
        if (tsq.I(str, bit.LOCAL_PATH_FLAG, false, 2, null)) {
            return LocalPathType.LOCAL_PATH_TYPE_TEMP;
        }
        return LocalPathType.LOCAL_PATH_TYPE_UNKNOWN;
    }

    @JvmStatic
    public static final String f(String str, String str2, ApPathType apPathType) {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b1a7714", new Object[]{str, str2, apPathType});
        }
        ckf.g(str, "bizId");
        ckf.g(str2, gl4.CONFIG_LOCAL_PATH);
        ckf.g(apPathType, "apPathType");
        if (str.length() == 0) {
            TMSLogger.b("ConversionPathTool", "apPathToLocalPath:bizId is null");
            return null;
        }
        TMSLogger.a("ConversionPathTool", "apPathToLocalPath:bizId = " + str + ", localPath = " + str2 + ", apPathType = " + apPathType);
        if (str2.length() == 0 || str.length() == 0) {
            return null;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
        Context applicationContext2 = (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) ? null : applicationContext.getApplicationContext();
        if (applicationContext2 == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[apPathType.ordinal()];
        if (i == 1) {
            return bvv.a(applicationContext2, str2, str);
        }
        if (i != 2) {
            return null;
        }
        return bit.Companion.a(str, applicationContext2).e(str2);
    }
}

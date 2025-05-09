package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;
import com.taobao.android.remoteso.log.RSoLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class axn extends la7<lid> implements lid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RSoLog.a b = RSoLog.e("remo-assets-tracker");

    public axn(lid lidVar) {
        super(lidVar);
    }

    public static /* synthetic */ Object ipc$super(axn axnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/assets/RemoAssetsTracker");
    }

    @Override // tb.lid
    public CheckAssetsResult b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckAssetsResult) ipChange.ipc$dispatch("bc930abe", new Object[]{this, str});
        }
        try {
            RSoLog.a aVar = b;
            aVar.a("checkAssets, enter = " + str);
            if (str.startsWith("/")) {
                str2 = str.substring(1);
            } else {
                str2 = str;
            }
            CheckAssetsResult b2 = c().b(str2);
            aVar.a("checkAssets, result = " + b2);
            return b2;
        } catch (Throwable th) {
            rbn.g("checkAssetsSync error", th);
            CheckAssetsResult checkAssetsResult = new CheckAssetsResult(str, 2);
            RSoLog.a aVar2 = b;
            aVar2.a("checkAssets, failed result = " + checkAssetsResult);
            return checkAssetsResult;
        }
    }

    @Override // tb.lid
    public w2l a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2l) ipChange.ipc$dispatch("7df8ac43", new Object[]{this, str});
        }
        try {
            RSoLog.a aVar = b;
            aVar.a("openAssetsSync, enter = " + str);
            w2l a2 = c().a(str.startsWith("/") ? str.substring(1) : str);
            aVar.a("openAssetsSync, result = " + a2);
            return a2;
        } catch (Throwable th) {
            rbn.g("openAssetsSync error", th);
            w2l w2lVar = new w2l(str, null, RSoException.error((int) JosStatusCodes.RNT_CODE_NO_JOS_INFO, th));
            RSoLog.a aVar2 = b;
            aVar2.a("openAssetsSync, failed result = " + w2lVar);
            return w2lVar;
        }
    }
}

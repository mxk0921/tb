package com.taobao.unit.center.sync.tool;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.sync.constant.SyncConstant;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000426\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/taobao/unit/center/sync/tool/EnvTool;", "", "<init>", "()V", "", "key", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "curEnv", "lastEnv", "Ltb/xhv;", "actFunc", "", "isSwitchEnv", "(Ljava/lang/String;Ltb/u1a;)Z", EnvTool.KEY_LAST_ENV1, "Ljava/lang/String;", EnvTool.KEY_LAST_ENV2, "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class EnvTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final EnvTool INSTANCE = new EnvTool();
    public static final String KEY_LAST_ENV1 = "KEY_LAST_ENV1";
    public static final String KEY_LAST_ENV2 = "KEY_LAST_ENV2";

    static {
        t2o.a(552599827);
    }

    private EnvTool() {
    }

    public final boolean isSwitchEnv(String str, u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        int intSharedPreference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42899689", new Object[]{this, str, u1aVar})).booleanValue();
        }
        ckf.h(str, "key");
        ckf.h(u1aVar, "actFunc");
        try {
            if (ApplicationUtil.isDebug() && ApplicationUtil.getEnvType() != (intSharedPreference = SharedPreferencesUtil.getIntSharedPreference(str, 0))) {
                SharedPreferencesUtil.addIntSharedPreference(str, ApplicationUtil.getEnvType());
                u1aVar.invoke(Integer.valueOf(ApplicationUtil.getEnvType()), Integer.valueOf(intSharedPreference));
                return true;
            }
        } catch (Throwable th) {
            TLog.loge(SyncConstant.TAG, Log.getStackTraceString(th));
        }
        return false;
    }
}

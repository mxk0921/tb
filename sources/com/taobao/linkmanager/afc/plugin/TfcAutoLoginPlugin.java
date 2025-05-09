package com.taobao.linkmanager.afc.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.dad;
import tb.pg0;
import tb.qg0;
import tb.t2o;
import tb.vp9;
import tb.wg0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TfcAutoLoginPlugin implements wg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(744489004);
        t2o.a(467664946);
    }

    @Override // tb.wg0
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final String e(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d52d298d", new Object[]{this, qg0Var});
        }
        String c = pg0.i().c("autoLoginEmptyParamStrategy", "none");
        String c2 = pg0.i().c("autoLoginEmptyParamStrategyABModule", "");
        if (!TextUtils.isEmpty(c2)) {
            VariationSet activate = UTABTest.activate("AFC", c2);
            qg0Var.B.put("autoLoginAbBucketId", (Object) Long.valueOf(activate.getExperimentBucketId()));
            Variation variation = activate.getVariation("autoLoginEmptyParamStrategy");
            if (variation != null) {
                return variation.getValueAsString("none");
            }
        }
        return c;
    }

    @Override // tb.wg0
    public void a(qg0 qg0Var, String str, dad dadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
            return;
        }
        try {
            qg0Var.B.put("startLoginStatus", (Object) TFCCommonUtils.j());
            if (!Boolean.parseBoolean(pg0.i().c("useAutoLoginPlugin", "false"))) {
                if (dadVar != null) {
                    qg0Var.B.put("autoLoginExecuteStatus", (Object) "false_orangeSwitch");
                    dadVar.a(true, str);
                }
                vp9.a("linkx", "TfcAutoLoginPlugin === executePluginWithContext === useAutoLogin开关关闭");
            } else if (TextUtils.isEmpty(qg0Var.r)) {
                String e = e(qg0Var);
                if (!"sync".equals(e) && !"async".equals(e)) {
                    if (dadVar != null) {
                        qg0Var.B.put("autoLoginExecuteStatus", (Object) "false_orangeEmptyParamStrategy");
                        dadVar.a(true, str);
                    }
                    vp9.a("linkx", "TfcAutoLoginPlugin === executePluginWithContext === autoLoginEmptyParamStrategy=" + e);
                }
                d(qg0Var, dadVar, str);
                vp9.a("linkx", "TfcAutoLoginPlugin === executePluginWithContext === autoLoginEmptyParamStrategy=" + e);
            } else {
                if (!"sync".equals(qg0Var.r) && !"async".equals(qg0Var.r)) {
                    if (dadVar != null) {
                        qg0Var.B.put("autoLoginExecuteStatus", (Object) "false_paramInValid");
                        dadVar.a(true, str);
                    }
                    vp9.a("linkx", "TfcAutoLoginPlugin === autologin.Invalid. === autologin参数不合法.不执行.");
                    return;
                }
                d(qg0Var, dadVar, str);
            }
        } catch (Throwable unused) {
            vp9.b("linkx", "TfcAutoLoginPlugin.executePluginWithContext.error.");
            if (dadVar != null) {
                qg0Var.B.put("autoLoginExecuteStatus", (Object) "false_catchError");
                dadVar.a(true, str);
            }
        }
    }

    public final void f(final dad dadVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4be891", new Object[]{this, dadVar, str});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(TbFcLinkInit.instance().mApplication, new BroadcastReceiver(this) { // from class: com.taobao.linkmanager.afc.plugin.TfcAutoLoginPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/plugin/TfcAutoLoginPlugin$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent != null) {
                        try {
                            if (a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()] != 1) {
                                vp9.a("linkx", "TfcAutoLoginPlugin === registerLoginCallBack === 登录失败 ");
                                dad dadVar2 = dadVar;
                                if (dadVar2 != null) {
                                    dadVar2.a(false, str);
                                }
                            } else {
                                vp9.a("linkx", "TfcAutoLoginPlugin === registerLoginCallBack === 登录成功 ");
                                dad dadVar3 = dadVar;
                                if (dadVar3 != null) {
                                    dadVar3.a(true, str);
                                }
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                        } catch (Throwable unused) {
                            vp9.b("linkx", "TfcAutoLoginPlugin.registerLoginListener.onReceive.error.");
                            dad dadVar4 = dadVar;
                            if (dadVar4 != null) {
                                dadVar4.a(false, str);
                            }
                        }
                    }
                }
            });
        } catch (Throwable unused) {
            vp9.b("linkx", "TfcAutoLoginPlugin.registerLoginListener.error.");
            if (dadVar != null) {
                dadVar.a(false, str);
            }
        }
    }

    @Override // tb.wg0
    public int b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
        }
        try {
            qg0Var.B.put("autoLoginParam", (Object) qg0Var.r);
        } catch (Throwable unused) {
            vp9.b("linkx", "TfcAutoLoginPlugin.getPluginMode.error.");
        }
        if (!Boolean.parseBoolean(pg0.i().c("useAutoLoginPlugin", "true"))) {
            return 0;
        }
        if (TextUtils.isEmpty(qg0Var.r)) {
            String e = e(qg0Var);
            if ("sync".equals(e)) {
                return 1;
            }
            if ("async".equals(e)) {
                return 0;
            }
        }
        return "sync".equals(qg0Var.r) ? 1 : 0;
    }

    public final void d(qg0 qg0Var, dad dadVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642cb440", new Object[]{this, qg0Var, dadVar, str});
        } else if (Login.checkSessionValid() || TextUtils.isEmpty(Login.getLoginToken())) {
            if (dadVar != null) {
                qg0Var.B.put("autoLoginExecuteStatus", (Object) "false_cannotAutoLogin");
                dadVar.a(true, str);
            }
            vp9.a("linkx", "TfcAutoLoginPlugin === autologin.session有效或token为空.无须免登.不执行.");
        } else {
            qg0Var.B.put("autoLoginExecuteStatus", (Object) "true");
            Login.login(false);
            f(dadVar, str);
            vp9.a("linkx", "TfcAutoLoginPlugin === autologin === autologin执行.");
        }
    }
}

package com.taobao.linkmanager.afc.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import tb.ah0;
import tb.dad;
import tb.qg0;
import tb.t2o;
import tb.vp9;
import tb.wg0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TfcLoginPlugin implements wg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10904a;
    public String b;
    public boolean c = false;

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
        t2o.a(744489007);
        t2o.a(467664946);
    }

    public static /* synthetic */ boolean d(TfcLoginPlugin tfcLoginPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b64bdd23", new Object[]{tfcLoginPlugin})).booleanValue();
        }
        return tfcLoginPlugin.c;
    }

    public static /* synthetic */ boolean e(TfcLoginPlugin tfcLoginPlugin, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("159d1f57", new Object[]{tfcLoginPlugin, new Boolean(z)})).booleanValue();
        }
        tfcLoginPlugin.c = z;
        return z;
    }

    public static /* synthetic */ void f(TfcLoginPlugin tfcLoginPlugin, String str, qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc80d47", new Object[]{tfcLoginPlugin, str, qg0Var});
        } else {
            tfcLoginPlugin.h(str, qg0Var);
        }
    }

    @Override // tb.wg0
    public int b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d241b11", new Object[]{this, qg0Var})).intValue();
        }
        return 1;
    }

    @Override // tb.wg0
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1aa3fd", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final void h(String str, qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283adfbe", new Object[]{this, str, qg0Var});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userId", Login.getUserId());
        hashMap.put(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, Login.getLoginToken());
        hashMap.put("useLoginTokenOptimize", String.valueOf(qg0Var.B.getBoolean("useLoginTokenOptimize")));
        String str2 = this.b;
        ah0.c(1013, str, str2, this.f10904a + "", hashMap);
    }

    public final void i(Context context, final String str, final dad dadVar, final qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8d044b", new Object[]{this, context, str, dadVar, qg0Var});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.plugin.TfcLoginPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/plugin/TfcLoginPlugin$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (intent != null) {
                        if (a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()] == 1) {
                            vp9.a("linkx", "TfcLoginPlugin === registerLoginCallBack === 登录成功 isAutoLogin = " + TfcLoginPlugin.d(TfcLoginPlugin.this));
                            if (TfcLoginPlugin.d(TfcLoginPlugin.this)) {
                                dad dadVar2 = dadVar;
                                if (dadVar2 != null) {
                                    dadVar2.a(true, str);
                                }
                                TfcLoginPlugin.f(TfcLoginPlugin.this, "flow_in_after_login", qg0Var);
                                TfcLoginPlugin.e(TfcLoginPlugin.this, false);
                            }
                        } else if (dadVar != null && TfcLoginPlugin.d(TfcLoginPlugin.this)) {
                            dadVar.a(true, str);
                            TfcLoginPlugin.e(TfcLoginPlugin.this, false);
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                    }
                }
            });
        }
    }

    public final boolean j(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f43f26d", new Object[]{this, qg0Var})).booleanValue();
        }
        boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "afc_login_token_opt");
        vp9.a("linkx", "TfcLoginPlugin === shouldUseLoginTokenOptimize ===  " + b);
        return b;
    }

    @Override // tb.wg0
    public void a(qg0 qg0Var, String str, dad dadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5725b9", new Object[]{this, qg0Var, str, dadVar});
            return;
        }
        String str2 = qg0Var.p;
        this.b = str2;
        if (TextUtils.isEmpty(str2)) {
            if (dadVar != null) {
                dadVar.a(true, str);
            }
            vp9.a("linkx", "TfcLoginPlugin === executePluginWithContext === loginToken为空,不免登");
            return;
        }
        this.f10904a = System.currentTimeMillis() + "";
        boolean j = j(qg0Var);
        qg0Var.B.put("useLoginTokenOptimize", (Object) Boolean.valueOf(j));
        if (!j) {
            this.c = true;
            i(TbFcLinkInit.instance().mApplication, str, dadVar, qg0Var);
            g(qg0Var);
        } else if (TextUtils.isEmpty(Login.getLoginToken()) || !Login.checkSessionValid()) {
            this.c = true;
            i(TbFcLinkInit.instance().mApplication, str, dadVar, qg0Var);
            g(qg0Var);
        } else if (dadVar != null) {
            dadVar.a(true, str);
        }
        h("flow_in_before_login", qg0Var);
    }

    public final void g(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9e3f26", new Object[]{this, qg0Var});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, this.b);
        bundle.putString("source", qg0Var.h);
        Login.login(false, bundle);
    }
}

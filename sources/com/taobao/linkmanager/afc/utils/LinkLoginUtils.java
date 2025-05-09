package com.taobao.linkmanager.afc.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.reduction.LoginReductionManager;
import com.taobao.linkmanager.afc.reduction.LoginResultBean;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.ajh;
import tb.noc;
import tb.t2o;
import tb.uih;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LinkLoginUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ajh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ noc f10916a;
        public final /* synthetic */ Context b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.linkmanager.afc.utils.LinkLoginUtils$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C0575a implements noc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0575a() {
            }

            @Override // tb.noc
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f0db772e", new Object[]{this});
                    return;
                }
                noc nocVar = a.this.f10916a;
                if (nocVar != null) {
                    nocVar.a();
                }
            }

            @Override // tb.noc
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("39ba37e1", new Object[]{this});
                    return;
                }
                noc nocVar = a.this.f10916a;
                if (nocVar != null) {
                    nocVar.b();
                }
            }
        }

        public a(noc nocVar, Context context) {
            this.f10916a = nocVar;
            this.b = context;
        }

        @Override // tb.ajh
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63008921", new Object[]{this, str});
                return;
            }
            vp9.a("linkx", "LinkLoginUtils === LinkLoginFree === 获取到的免登信息：" + str);
            if (TextUtils.isEmpty(str)) {
                noc nocVar = this.f10916a;
                if (nocVar != null) {
                    nocVar.a();
                    return;
                }
                return;
            }
            LoginResultBean j = LoginReductionManager.l().j(str);
            if (TextUtils.isEmpty(j.loginToken)) {
                noc nocVar2 = this.f10916a;
                if (nocVar2 != null) {
                    nocVar2.a();
                    return;
                }
                return;
            }
            vp9.a("linkx", "LinkLoginUtils === LinkLoginFree === 免登信息不为空，开始免登");
            LinkLoginUtils.b(this.b, new C0575a());
            Bundle bundle = new Bundle();
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, j.loginToken);
            bundle.putString("source", j.source);
            Login.login(false, bundle);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class b {
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
        t2o.a(744489038);
    }

    public static void a(Context context, noc nocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45366ee", new Object[]{context, nocVar});
        } else {
            uih.f().d(context, new a(nocVar, context));
        }
    }

    public static /* synthetic */ void b(Context context, noc nocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26805463", new Object[]{context, nocVar});
        } else {
            c(context, nocVar);
        }
    }

    public static void c(Context context, final noc nocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267e317e", new Object[]{context, nocVar});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.linkmanager.afc.utils.LinkLoginUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/utils/LinkLoginUtils$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    vp9.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录广播回调，intent：" + intent);
                    if (intent != null) {
                        int i = b.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i != 1) {
                            if (i == 2 && noc.this != null) {
                                vp9.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录失败");
                                noc.this.a();
                            }
                        } else if (noc.this != null) {
                            vp9.a("linkx", "LinkLoginUtils === registerLoginCallBack === 登录成功");
                            noc.this.b();
                        }
                        LoginBroadcastHelper.unregisterLoginReceiver(context2, this);
                        vp9.a("linkx", "LinkLoginUtils === registerLoginCallBack === 广播解注册了");
                    }
                }
            });
        }
    }
}

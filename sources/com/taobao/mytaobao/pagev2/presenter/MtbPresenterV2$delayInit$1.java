package com.taobao.mytaobao.pagev2.presenter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.tao.Globals;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbPresenterV2$delayInit$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MtbPresenterV2 f11305a;

    public MtbPresenterV2$delayInit$1(MtbPresenterV2 mtbPresenterV2) {
        this.f11305a = mtbPresenterV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        MtbPresenterV2.b(this.f11305a).c();
        MtbPresenterV2.c(this.f11305a).b();
        BroadcastReceiver mtbPresenterV2$delayInit$1$loginReceiver$1 = new BroadcastReceiver() { // from class: com.taobao.mytaobao.pagev2.presenter.MtbPresenterV2$delayInit$1$loginReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(MtbPresenterV2$delayInit$1$loginReceiver$1 mtbPresenterV2$delayInit$1$loginReceiver$12, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/presenter/MtbPresenterV2$delayInit$1$loginReceiver$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action;
                MtbBizProxyV2 a2;
                MyTaobaoFragment m;
                FragmentActivity activity;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && (action = intent.getAction()) != null && (a2 = MtbPresenterV2.a(MtbPresenterV2$delayInit$1.this.f11305a)) != null && (m = a2.m()) != null && (activity = m.getActivity()) != null) {
                    MtbPresenterV2.d(MtbPresenterV2$delayInit$1.this.f11305a, activity, LoginAction.valueOf(action), true);
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), mtbPresenterV2$delayInit$1$loginReceiver$1);
        MtbPresenterV2.f(this.f11305a, mtbPresenterV2$delayInit$1$loginReceiver$1);
    }
}

package com.taobao.mytaobao.pagev2.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import kotlin.Metadata;
import tb.ckf;
import tb.cpt;
import tb.kgj;
import tb.pg1;
import tb.sgj;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/mytaobao/pagev2/listener/ThemeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ThemeChangeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11296a;
    public final MtbBizProxyV2 b;

    static {
        t2o.a(745537961);
    }

    public ThemeChangeReceiver(MtbBizProxyV2 mtbBizProxyV2) {
        ckf.h(mtbBizProxyV2, pg1.ATOM_proxy);
        this.b = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(ThemeChangeReceiver themeChangeReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/listener/ThemeChangeReceiver");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (this.f11296a) {
            try {
                kgj.c(true, this);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da1acd1", new Object[]{this});
            return;
        }
        this.f11296a = true;
        kgj.a(true, this, FestivalMgr.ACTION_FESTIVAL_CHANGE);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        FragmentActivity activity = this.b.m().getActivity();
        if (activity != null && intent != null) {
            if (intent.getAction() == null) {
                intent = null;
            }
            if (intent != null && !sgj.b(activity)) {
                if (TextUtils.equals(cpt.ACTION_THEME_CHANGE, intent.getAction()) || TextUtils.equals(FestivalMgr.ACTION_FESTIVAL_CHANGE, intent.getAction())) {
                    this.b.R().k();
                    if (System.currentTimeMillis() - this.b.Q() >= 3000) {
                        this.b.S();
                    }
                }
            }
        }
    }
}

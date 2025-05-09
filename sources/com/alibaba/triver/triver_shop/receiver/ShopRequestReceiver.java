package com.alibaba.triver.triver_shop.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopRequestReceiver extends BroadcastReceiver implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_SHOP_REQUEST = "SHOP_ACTION_SHOP_REQUEST";
    public static final a Companion = new a(null);
    private static final String MSG_CANCEL_STAR_SUCCESS = "取消星标成功";
    private static final String MSG_SETTING_SUCCESS = "设置成功";
    private static final String MSG_STAR_SUCCESS = "星标订阅成功";
    private static final String TYPE_STAR = "SHOP_TYPE_STAR";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510164);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(766510163);
    }

    public static /* synthetic */ Object ipc$super(ShopRequestReceiver shopRequestReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/receiver/ShopRequestReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (context != null && intent != null && ckf.b(intent.getAction(), ACTION_SHOP_REQUEST) && (extras = intent.getExtras()) != null && extras.containsKey("star")) {
            boolean z = extras.getBoolean("star", false);
            ShopMoreUtils.INSTANCE.x(context, extras.getString("sellerId"), z, new ShopRequestReceiver$onReceive$1(z, context, extras.getBoolean("changeToFollow", false)));
        }
    }
}

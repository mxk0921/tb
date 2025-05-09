package com.taobao.favorites;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.favorite.FavoriteConstants;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewFavoriteGoodsActivity extends FavoriteBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class GoodsRefreshReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(707788804);
        }

        public static /* synthetic */ Object ipc$super(GoodsRefreshReceiver goodsRefreshReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorites/NewFavoriteGoodsActivity$GoodsRefreshReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.NewFavoriteGoodsActivity", "GoodsRefreshReceiver->public void onReceive(Context context, Intent intent)", "20180112");
            FavoriteConstants.isGoodsFavoriteChange = true;
        }
    }

    static {
        t2o.a(707788803);
    }

    public static /* synthetic */ Object ipc$super(NewFavoriteGoodsActivity newFavoriteGoodsActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/favorites/NewFavoriteGoodsActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.NewFavoriteGoodsActivity", "protected void onCreate(Bundle savedInstanceState)", "20180112");
        super.onCreate(bundle);
        if (!(getIntent() == null || getIntent().getData() == null || getIntent().getData().getQueryParameter("tab") == null)) {
            String queryParameter = getIntent().getData().getQueryParameter("tab");
            if ("good".equals(queryParameter)) {
                str = "&tab=good";
            } else if ("content".equals(queryParameter)) {
                str = "&tab=content";
            }
            finish();
            Nav.from(this).toUri("https://market.m.taobao.com/apps/market/favorite/index.html?wh_weex=true".concat(str));
        }
        str = "";
        finish();
        Nav.from(this).toUri("https://market.m.taobao.com/apps/market/favorite/index.html?wh_weex=true".concat(str));
    }
}

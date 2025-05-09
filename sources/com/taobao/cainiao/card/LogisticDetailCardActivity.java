package com.taobao.cainiao.card;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.acq;
import tb.dbl;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LogisticDetailCardActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<GoodsInfoEntity> f10260a;

    static {
        t2o.a(713032019);
    }

    public static /* synthetic */ Object ipc$super(LogisticDetailCardActivity logisticDetailCardActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/cainiao/card/LogisticDetailCardActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        String l = dbl.l();
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            Bundle extras = getIntent().getExtras();
            try {
                this.f10260a = JSON.parseArray(extras.getString("data"), GoodsInfoEntity.class);
            } catch (Exception e) {
                TLog.loge(o78.CHINA_MAINLAND, "CN_CARD", e.getMessage());
            }
            int i = extras.getInt("currentPage");
            List<GoodsInfoEntity> list = this.f10260a;
            if (list != null && !list.isEmpty() && i >= 0 && i < this.f10260a.size()) {
                l = (l + "&trace=" + this.f10260a.get(i).tradeId) + "&statusCode=" + this.f10260a.get(i).status;
            }
            Nav.from(this).toUri(l);
        }
        finish();
    }
}

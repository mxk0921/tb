package com.taobao.taobao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.PayResultInfo;
import java.util.HashMap;
import java.util.Map;
import tb.a8d;
import tb.acq;
import tb.bf3;
import tb.df3;
import tb.kql;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CashDeskActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f12894a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements a8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.a8d
        public void a(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
            } else if (CashDeskActivity.a(CashDeskActivity.this) != null) {
                CashDeskActivity.a(CashDeskActivity.this).finish();
            }
        }

        @Override // tb.a8d
        public void b(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
            } else if (CashDeskActivity.a(CashDeskActivity.this) != null) {
                CashDeskActivity.a(CashDeskActivity.this).finish();
            }
        }

        @Override // tb.a8d
        public void c(String str, PayResultInfo payResultInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
            } else if (CashDeskActivity.a(CashDeskActivity.this) != null) {
                CashDeskActivity.a(CashDeskActivity.this).setResult(-1);
                CashDeskActivity.a(CashDeskActivity.this).finish();
            }
        }

        @Override // tb.a8d
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
            }
        }
    }

    public static /* synthetic */ Activity a(CashDeskActivity cashDeskActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("574e5f2b", new Object[]{cashDeskActivity});
        }
        return cashDeskActivity.f12894a;
    }

    public static /* synthetic */ Object ipc$super(CashDeskActivity cashDeskActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/CashDeskActivity");
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

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bf4806", new Object[]{this, map});
        } else {
            new df3().e(this, map, new a());
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().addFlags(16);
        this.f12894a = this;
        HashMap<String, String> b = kql.b(getIntent());
        if (b == null) {
            finish();
        } else {
            b(b);
        }
        bf3.i();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            super.onNewIntent(intent);
        }
    }
}

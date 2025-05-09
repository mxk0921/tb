package com.alibaba.ability.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.acq;
import tb.ckf;
import tb.pg1;
import tb.t2o;
import tb.ua0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TransParentActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final HashMap<String, ua0> b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public ua0 f1886a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(140509187);
        }

        public a() {
        }

        @JvmStatic
        public final Intent a(Intent intent, ua0 ua0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("361b956a", new Object[]{this, intent, ua0Var});
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            ckf.g(ua0Var, "activityCallBacks");
            String uuid = UUID.randomUUID().toString();
            ckf.f(uuid, "UUID.randomUUID().toString()");
            TransParentActivity.a().put(uuid, ua0Var);
            intent.putExtra("cb_uuid", uuid);
            return intent;
        }

        @JvmStatic
        public final void b(Intent intent, Context context, ua0 ua0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6531df5b", new Object[]{this, intent, context, ua0Var});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            ckf.g(context, "context");
            ckf.g(ua0Var, "activityCallBacks");
            String uuid = UUID.randomUUID().toString();
            ckf.f(uuid, "UUID.randomUUID().toString()");
            TransParentActivity.a().put(uuid, ua0Var);
            intent.putExtra("cb_uuid", uuid);
            context.startActivity(intent);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(140509186);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2dee34c3", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(TransParentActivity transParentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/TransParentActivity");
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

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ua0 ua0Var = this.f1886a;
        if (ua0Var != null) {
            ua0Var.a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ua0 ua0Var = this.f1886a;
        if (ua0Var != null) {
            ua0Var.onActivityDestroyed(this);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ua0 ua0Var = this.f1886a;
        if (ua0Var != null) {
            ua0Var.onActivityResumed(this);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        ua0 ua0Var = this.f1886a;
        if (ua0Var != null) {
            ua0Var.onActivityStarted(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ua0 ua0Var = this.f1886a;
        if (ua0Var != null) {
            ua0Var.onActivityStopped(this);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getWindow().addFlags(32);
        super.onCreate(bundle);
        getWindow().setGravity(51);
        Window window = getWindow();
        ckf.f(window, pg1.ATOM_EXT_window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        Window window2 = getWindow();
        ckf.f(window2, pg1.ATOM_EXT_window);
        window2.setAttributes(attributes);
        String stringExtra = getIntent().getStringExtra("cb_uuid");
        if (stringExtra == null || stringExtra.length() == 0) {
            finish();
            return;
        }
        ua0 remove = b.remove(stringExtra);
        if (remove != null) {
            this.f1886a = remove;
            remove.onActivityCreated(this, bundle);
            return;
        }
        finish();
    }
}

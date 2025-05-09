package com.taobao.android.dressup.base;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.turbo.TurboEngine;
import com.taobao.android.turbo.TurboEngineConfig;
import com.taobao.android.turbo.utils.DeviceUtil;
import com.taobao.tao.BaseActivity;
import kotlin.Metadata;
import tb.a07;
import tb.bcq;
import tb.ckf;
import tb.f6d;
import tb.g1c;
import tb.jpu;
import tb.jz7;
import tb.nhd;
import tb.q8u;
import tb.rc0;
import tb.spu;
import tb.t2o;
import tb.tpu;
import tb.tqm;
import tb.v3i;
import tb.xod;
import tb.zyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/dressup/base/BaseDressupActivity;", "Lcom/taobao/tao/BaseActivity;", "<init>", "()V", "Landroid/view/View;", "rootView", "Ltb/xhv;", "bizSetRootContentView", "(Landroid/view/View;)V", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseDressupActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_DETAIL = "dressup_detail";
    public static final String BIZ_FEED = "dressup_feed";
    public static final a Companion = new a(null);
    public static final String TAG_LIFE = "DressUpLife";
    public final zyf<String> I0 = new BaseDressupActivity$pageClassName$1(getClass());

    /* renamed from: a  reason: collision with root package name */
    public TurboEngine f7549a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552581);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552580);
    }

    public static /* synthetic */ Object ipc$super(BaseDressupActivity baseDressupActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/base/BaseDressupActivity");
        }
    }

    public boolean b(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f834a4", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public void bizSetRootContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468d41e", new Object[]{this, view});
            return;
        }
        ckf.g(view, "rootView");
        setContentView(view);
    }

    public void l3(Bundle bundle) {
        tqm.b bVar;
        nhd b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d0b3f", new Object[]{this, bundle});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("bizOnCreate");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        rc0.Companion.b(this);
        boolean z = this instanceof DressupFeedFlowActivity;
        if (z) {
            bVar = tqm.Companion.e();
        } else {
            bVar = this instanceof DressupDetailActivity ? tqm.Companion.d() : null;
        }
        TurboEngineConfig.a a2 = TurboEngineConfig.Companion.a();
        a2.d(this);
        Intent intent = getIntent();
        ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        String dataString = intent.getDataString();
        if (dataString != null) {
            a2.i(dataString);
        }
        a2.g(n3(bVar != null ? bVar.a() : null));
        a2.h(this);
        if (this instanceof DressupDetailActivity) {
            a2.b(BIZ_DETAIL);
        } else if (z) {
            a2.b(BIZ_FEED);
        }
        if (!(bVar == null || (b = bVar.b()) == null)) {
            a2.c(v3i.f(jpu.a(tqm.CONFIG_RECOMMEND_MANAGER, b)));
        }
        TurboEngine c = spu.Companion.c(a2.a());
        this.f7549a = c;
        if (c != null) {
            c.onPageCreate();
            TurboEngine turboEngine = this.f7549a;
            if (turboEngine != null) {
                bizSetRootContentView(turboEngine.getView());
                aVar.c();
                return;
            }
            ckf.y("turboEngine");
            throw null;
        }
        ckf.y("turboEngine");
        throw null;
    }

    public void m3(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532a1822", new Object[]{this, bundle});
        }
    }

    public abstract xod n3(g1c g1cVar);

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c08527a", new Object[]{this});
        } else if (!DeviceUtil.Companion.g() && Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG_LIFE, this.I0 + ":onCreate", null, 4, null);
        m3(bundle);
        o3();
        bcq.a().f(this, jz7.BUNDLE_TURBOFLOW_DRESSUP_REMOTE);
        super.onCreate(bundle);
        l3(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG_LIFE, this.I0 + ":onDestroy", null, 4, null);
        super.onDestroy();
        TurboEngine turboEngine = this.f7549a;
        if (turboEngine != null) {
            turboEngine.onPageDestroy();
        } else {
            ckf.y("turboEngine");
            throw null;
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!a(i, keyEvent) && !b(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG_LIFE, this.I0 + ":onPause", null, 4, null);
        super.onPause();
        TurboEngine turboEngine = this.f7549a;
        if (turboEngine != null) {
            turboEngine.onPagePause();
        } else {
            ckf.y("turboEngine");
            throw null;
        }
    }

    @Override // com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("onResume");
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, TAG_LIFE, this.I0 + ":onResume", null, 4, null);
        super.onResume();
        TurboEngine turboEngine = this.f7549a;
        if (turboEngine != null) {
            turboEngine.onPageResume();
            aVar.c();
            return;
        }
        ckf.y("turboEngine");
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        q8u.a aVar = q8u.Companion;
        aVar.a("onStart");
        tpu.a aVar2 = tpu.Companion;
        tpu.a.b(aVar2, TAG_LIFE, this.I0 + ":onStop", null, 4, null);
        super.onStart();
        TurboEngine turboEngine = this.f7549a;
        if (turboEngine != null) {
            turboEngine.onPageStart();
            aVar.c();
            return;
        }
        ckf.y("turboEngine");
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG_LIFE, this.I0 + ":onStop", null, 4, null);
        super.onStop();
        TurboEngine turboEngine = this.f7549a;
        if (turboEngine != null) {
            turboEngine.onPageStop();
        } else {
            ckf.y("turboEngine");
            throw null;
        }
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cd738a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            TurboEngine turboEngine = this.f7549a;
            if (turboEngine != null) {
                f6d f6dVar = (f6d) turboEngine.getInvoker(f6d.class);
                if (f6dVar != null && f6dVar.a(true)) {
                    return true;
                }
            } else {
                ckf.y("turboEngine");
                throw null;
            }
        }
        return false;
    }
}

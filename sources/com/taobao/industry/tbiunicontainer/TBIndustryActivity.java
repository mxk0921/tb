package com.taobao.industry.tbiunicontainer;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStateManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.weex.common.WXModule;
import kotlin.Metadata;
import tb.ckf;
import tb.lfr;
import tb.t2o;
import tb.xfr;
import tb.zfr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/industry/tbiunicontainer/TBIndustryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TBIndustryActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zfr<xfr> f10621a;

    static {
        t2o.a(804257796);
    }

    public static /* synthetic */ Object ipc$super(TBIndustryActivity tBIndustryActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -451962688:
                super.onRestoreInstanceState((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/TBIndustryActivity");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.d(i, i2, intent);
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar == null) {
            ckf.y("pageManager");
            throw null;
        } else if (!zfrVar.e()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        zfr<xfr> zfrVar = new zfr<>(new lfr());
        this.f10621a = zfrVar;
        Intent intent = getIntent();
        ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        zfrVar.f(intent.getExtras());
        zfr<xfr> zfrVar2 = this.f10621a;
        if (zfrVar2 != null) {
            setContentView(zfrVar2.b());
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.g();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.h();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        ckf.g(strArr, "permissions");
        ckf.g(iArr, WXModule.GRANT_RESULTS);
        super.onRequestPermissionsResult(i, strArr, iArr);
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.i(i, strArr, iArr);
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.j();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, FragmentStateManager.SAVED_INSTANCE_STATE_KEY);
        super.onRestoreInstanceState(bundle);
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.k(bundle);
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.l();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.m(bundle);
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.n();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        zfr<xfr> zfrVar = this.f10621a;
        if (zfrVar != null) {
            zfrVar.o();
        } else {
            ckf.y("pageManager");
            throw null;
        }
    }
}

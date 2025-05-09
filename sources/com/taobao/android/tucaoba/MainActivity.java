package com.taobao.android.tucaoba;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.t2o;
import tb.uov;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/tucaoba/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "tucaoba-android_debug"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class MainActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(913309700);
    }

    public static /* synthetic */ Object ipc$super(MainActivity mainActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tucaoba/MainActivity");
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_counter", 1.0d);
        uov uovVar = uov.INSTANCE;
        Intent intent = getIntent();
        ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        if (uovVar.e(intent)) {
            AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_h5_direct_counter", 1.0d);
            Context applicationContext = getApplicationContext();
            ckf.f(applicationContext, "applicationContext");
            Intent intent2 = getIntent();
            ckf.f(intent2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            uovVar.c(applicationContext, intent2);
        } else {
            Context applicationContext2 = getApplicationContext();
            ckf.f(applicationContext2, "applicationContext");
            if (uovVar.g(applicationContext2)) {
                AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_feature_counter", 1.0d);
                Intent intent3 = getIntent();
                ckf.f(intent3, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                uovVar.d(this, intent3);
            } else {
                AppMonitor.Counter.commit("TuCaoBaNativeNav", "enter_tucaoba_h5_counter", 1.0d);
                Context applicationContext3 = getApplicationContext();
                ckf.f(applicationContext3, "applicationContext");
                Intent intent4 = getIntent();
                ckf.f(intent4, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                uovVar.c(applicationContext3, intent4);
            }
        }
        finish();
    }
}

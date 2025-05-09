package com.taobao.tao.welcome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TabHost;
import androidx.core.app.ActivityCompat;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.uikit.immersive.ITBImmersive;
import tb.acq;
import tb.d7r;
import tb.dvd;
import tb.ljb;
import tb.t2o;
import tb.w35;

/* compiled from: Taobao */
@PopLayer.PopupAllowedFromFragment
@PopLayer.PopupOnlyManually
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Welcome extends SupportActivity implements ActivityCompat.OnRequestPermissionsResultCallback, TabHost.OnTabChangeListener, dvd, ITBImmersive, ljb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HostController welController = null;

    static {
        t2o.a(734003246);
        t2o.a(734003250);
        t2o.a(456130629);
    }

    public static /* synthetic */ Object ipc$super(Welcome welcome, String str, Object... objArr) {
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
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1835627922:
                super.onPostCreate((Bundle) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/welcome/Welcome");
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

    @Override // tb.dvd
    public boolean checkLogin() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        w35.a("ITBLoginCallback-checkLogin");
        HostController hostController = this.welController;
        if (hostController != null) {
            z = hostController.checkLogin();
        }
        w35.c();
        return z;
    }

    @Override // tb.dvd
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.doLogin();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onFinished();
        }
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            return hostController.isImmersive();
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onActivityResult(i, i2, intent);
        }
    }

    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
            return;
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onConfirmed(i);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        w35.a("w-onCreate");
        HostController create = HostController.create(this, bundle);
        this.welController = create;
        if (create.onPreCreate(bundle)) {
            super.onCreate(bundle);
            return;
        }
        w35.a("w-super-onCreate");
        super.onCreate(bundle);
        if (TBDeviceUtils.P(this)) {
            d7r.a(this);
        }
        w35.c();
        w35.a("w-c-onCreate");
        this.welController.onCreate(bundle);
        w35.c();
        w35.c();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onDestroy();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!hostController.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // tb.ljb
    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
            return;
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onLocaleSetDone();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        w35.a("w-onResume");
        super.onNewIntent(intent);
        w35.c();
        if (this.welController != null) {
            w35.a("w-c-onResume");
            this.welController.onNewIntent(intent);
            w35.c();
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
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onPause();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d697592", new Object[]{this, bundle});
            return;
        }
        w35.a("w-onPostCreate");
        super.onPostCreate(bundle);
        w35.c();
    }

    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
            return;
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onRejected(i);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        w35.a("w-onResume");
        super.onResume();
        w35.c();
        if (this.welController != null) {
            w35.a("w-c-onResume");
            this.welController.onResume();
            w35.c();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        w35.a("w-onStart");
        super.onStart();
        w35.c();
        if (this.welController != null) {
            w35.a("w-c-onStart");
            this.welController.onStart();
            w35.c();
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
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onStop();
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        w35.a("TabHost-onTabChanged");
        HostController hostController = this.welController;
        if (hostController != null) {
            hostController.onTabChanged(str);
        }
        w35.c();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        HostController hostController = this.welController;
        if (hostController != null) {
            return hostController.isFragmentSupported(str, iSupportFragment);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (isFinishing() || i != 3) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}

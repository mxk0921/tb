package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class xr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity activity;

    static {
        t2o.a(481296613);
    }

    public xr1(Activity activity) {
        ckf.g(activity, "activity");
        this.activity = activity;
    }

    public abstract void cameraSwitch(boolean z, boolean z2, l63 l63Var);

    public abstract void changeScene(zso zsoVar);

    public abstract void clickAlbum();

    public abstract void clickHistory();

    public abstract void continueCameraScene();

    public abstract void dismissPop();

    public abstract void flipCamera();

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.activity;
    }

    public abstract int getCurrentTab();

    public abstract void getPreviewData(DynCaptureImgGotConfig dynCaptureImgGotConfig, i54 i54Var);

    public abstract View getRootView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract boolean isScanMode();

    public abstract void jumpToIrp(JSONObject jSONObject);

    public abstract void onActivityResult(int i, int i2, Intent intent);

    public abstract void onCreate();

    public abstract void onDestroy();

    public abstract void onFinish();

    public abstract boolean onKeyDown(KeyEvent keyEvent);

    public abstract void onNewIntent(Intent intent);

    public abstract void onPause();

    public abstract void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onWindowFocusChanged(boolean z);

    public abstract void operateLight(boolean z);

    public abstract void optionScreenShotSearchFloatingBtn(boolean z, pvh pvhVar);

    public abstract void outerAlbumClick(MusOuterAlbumBean musOuterAlbumBean);

    public abstract void requestFloatingWindowPermission();

    public abstract void selectPhotoFromAlbum(DynCaptureImgGotConfig dynCaptureImgGotConfig);

    public final void setActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
            return;
        }
        ckf.g(activity, "<set-?>");
        this.activity = activity;
    }

    public abstract void stopCameraScene();

    public abstract void switchMetaSightState(boolean z);

    public abstract void takePhoto();

    public abstract boolean updateAllowanceState(r7m r7mVar, boolean z);
}

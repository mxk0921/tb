package com.zoloz.android.phone.zdoc.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import tb.t2o;
import tb.t4p;
import tb.uyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class BaseCameraPermissionFragment extends BaseFragment implements uyl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 1;
    private boolean isFirst = true;
    private CameraSurfaceView mCameraSurfaceView;
    public View mRootView;

    static {
        t2o.a(245366930);
        t2o.a(245366950);
    }

    public static /* synthetic */ Object ipc$super(BaseCameraPermissionFragment baseCameraPermissionFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 602429250) {
            super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/zoloz/android/phone/zdoc/fragment/BaseCameraPermissionFragment");
        }
    }

    public abstract void alertCameraNoPermissionDialog(uyl uylVar);

    public abstract void alertSystemError();

    public void checkCameraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ba83", new Object[]{this});
        } else if (!this.isFirst) {
            alertCameraNoPermissionDialog(this);
        } else {
            this.isFirst = false;
            if (hasCameraPermission()) {
                dealCameraHasPermission();
            } else {
                requestPermissions(new String[]{t4p.CAMERA}, 1);
            }
        }
    }

    public void dealCameraHasPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3dc15f", new Object[]{this});
        } else if (this.mCameraSurfaceView != null) {
            onCameraInit();
            this.mCameraSurfaceView.setVisibility(0);
        }
    }

    @Override // tb.uyl
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + getContext().getPackageName()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        startActivity(intent);
    }

    public View findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        return this.mRootView.findViewById(i);
    }

    public abstract int getLayoutId();

    public boolean hasCameraPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c528eb19", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(getActivity(), t4p.CAMERA) == 0) {
            return true;
        }
        return false;
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mCameraSurfaceView = cameraSurfaceView;
        cameraSurfaceView.setVisibility(4);
        this.mCameraSurfaceView.setFocusable(true);
        onInitView();
        onCameraInit();
    }

    public abstract void onCameraInit();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View view = this.mRootView;
        if (view == null) {
            try {
                this.mRootView = layoutInflater.inflate(getLayoutId(), viewGroup, false);
            } catch (Exception e) {
                BioLog.e("BaseCameraPermissionFragment", e);
                alertSystemError();
            }
            initView();
        } else {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mRootView);
            }
        }
        return this.mRootView;
    }

    public abstract void onInitView();

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mCameraSurfaceView.setVisibility(4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            alertCameraNoPermissionDialog(this);
        } else {
            dealCameraHasPermission();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mCameraSurfaceView.setVisibility(0);
    }
}

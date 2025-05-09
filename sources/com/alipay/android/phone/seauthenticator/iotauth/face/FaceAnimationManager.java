package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView;
import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FaceAnimationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_CODE_BACKGROUND = 3;
    public static final int ACTION_CODE_CANCEL = 1;
    public static final int ACTION_CODE_NOPERMISSION = 4;
    public static final int ACTION_CODE_NULL = -1;
    public static final int ACTION_CODE_PASSWORD = 2;
    public static final int ACTION_CODE_START = 0;
    public static final int ACTION_CODE_SWITCH = 5;
    public static final int STATUS_CHECK_SUCCESS = 3;
    public static final int STATUS_SECONDE_CHECK = 2;
    public static final int STATUS_START = 1;

    /* renamed from: a  reason: collision with root package name */
    public View f3772a;
    public FaceView b;
    public View c;
    public View d;
    public View e;
    public Activity g;
    public int action = 3;
    public int f = 0;
    public int h = 0;
    public boolean i = true;
    public boolean isDialogUI = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class ActionCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onAction(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface AnimationCallback {
        void onAnimationEnd();
    }

    public static /* synthetic */ View access$000(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("952a3aaf", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.c;
    }

    public static /* synthetic */ View access$100(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee358630", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.d;
    }

    public static /* synthetic */ View access$200(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4740d1b1", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.e;
    }

    public static /* synthetic */ View access$300(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a04c1d32", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.f3772a;
    }

    public static /* synthetic */ FaceView access$400(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FaceView) ipChange.ipc$dispatch("3bb062e9", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.b;
    }

    public static /* synthetic */ boolean access$500(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c19476", new Object[]{faceAnimationManager})).booleanValue();
        }
        return faceAnimationManager.i;
    }

    public static /* synthetic */ boolean access$502(FaceAnimationManager faceAnimationManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d480e4", new Object[]{faceAnimationManager, new Boolean(z)})).booleanValue();
        }
        faceAnimationManager.i = z;
        return z;
    }

    public static /* synthetic */ Activity access$600(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("cbf75a55", new Object[]{faceAnimationManager});
        }
        return faceAnimationManager.g;
    }

    public static /* synthetic */ int access$700(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70b947e7", new Object[]{faceAnimationManager})).intValue();
        }
        return faceAnimationManager.f;
    }

    public static /* synthetic */ int access$800(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("183521a8", new Object[]{faceAnimationManager})).intValue();
        }
        return faceAnimationManager.h;
    }

    public static /* synthetic */ int access$802(FaceAnimationManager faceAnimationManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd25c1f", new Object[]{faceAnimationManager, new Integer(i)})).intValue();
        }
        faceAnimationManager.h = i;
        return i;
    }

    public synchronized void captureFail(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236dbc", new Object[]{this, animationCallback});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.access$802(FaceAnimationManager.this, 2);
                    if (FaceAnimationManager.access$400(FaceAnimationManager.this) != null) {
                        FaceAnimationManager.access$400(FaceAnimationManager.this).captureFail(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckFailEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckSuccessEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onNoCaptureEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                                    return;
                                }
                                AnimationCallback animationCallback2 = animationCallback;
                                if (animationCallback2 != null) {
                                    animationCallback2.onAnimationEnd();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void checkFail(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1219fe", new Object[]{this, animationCallback});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.access$400(FaceAnimationManager.this) != null) {
                        if (FaceAnimationManager.access$800(FaceAnimationManager.this) < 1) {
                            FaceAnimationManager.this.startCheck();
                            FaceAnimationManager.access$400(FaceAnimationManager.this).postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    AnonymousClass6 r0 = AnonymousClass6.this;
                                    FaceAnimationManager.this.checkFail(animationCallback);
                                }
                            }, 100L);
                            return;
                        }
                        FaceAnimationManager.access$802(FaceAnimationManager.this, 2);
                        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_FAILURE);
                        FaceView access$400 = FaceAnimationManager.access$400(FaceAnimationManager.this);
                        if (TextUtils.isEmpty(clientText)) {
                            clientText = FaceAnimationManager.access$600(FaceAnimationManager.this).getString(R.string.face_auth_fail);
                        }
                        access$400.setFaceViewTip(clientText);
                        FaceAnimationManager.access$400(FaceAnimationManager.this).checkFail(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckFailEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                                    return;
                                }
                                AnimationCallback animationCallback2 = animationCallback;
                                if (animationCallback2 != null) {
                                    animationCallback2.onAnimationEnd();
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckSuccessEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onNoCaptureEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void checkFinish(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde3a842", new Object[]{this, new Long(j)});
            return;
        }
        FaceView faceView = this.b;
        if (faceView != null) {
            faceView.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.access$600(FaceAnimationManager.this) != null) {
                        FaceAnimationManager faceAnimationManager = FaceAnimationManager.this;
                        faceAnimationManager.action = -1;
                        if (FaceAnimationManager.access$600(faceAnimationManager) instanceof FaceAuthActivity) {
                            FaceAnimationManager.access$600(FaceAnimationManager.this).finish();
                        }
                    }
                }
            }, j);
        }
    }

    public synchronized void checkSuccess(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1959a53", new Object[]{this, animationCallback});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.access$400(FaceAnimationManager.this) != null) {
                        if (FaceAnimationManager.access$800(FaceAnimationManager.this) < 1) {
                            FaceAnimationManager.this.startCheck();
                            FaceAnimationManager.access$400(FaceAnimationManager.this).postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    AnonymousClass7 r0 = AnonymousClass7.this;
                                    FaceAnimationManager.this.checkSuccess(animationCallback);
                                }
                            }, 100L);
                            return;
                        }
                        FaceAnimationManager.access$802(FaceAnimationManager.this, 2);
                        FaceAnimationManager.access$400(FaceAnimationManager.this).checkSuccess(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckFailEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckSuccessEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                                    return;
                                }
                                AnimationCallback animationCallback2 = animationCallback;
                                if (animationCallback2 != null) {
                                    animationCallback2.onAnimationEnd();
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onNoCaptureEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void init(Activity activity, FaceView faceView, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926ebe64", new Object[]{this, activity, faceView, view, view2, new Integer(i)});
            return;
        }
        this.g = activity;
        this.b = faceView;
        this.c = view;
        this.d = view2;
        this.h = 0;
        this.f = i;
    }

    public synchronized void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
    }

    public synchronized void startCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e1eb0b", new Object[]{this});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.access$802(FaceAnimationManager.this, 0);
                    if (FaceAnimationManager.access$400(FaceAnimationManager.this) != null) {
                        FaceAnimationManager.access$400(FaceAnimationManager.this).setFaceViewTip("");
                        FaceAnimationManager.access$400(FaceAnimationManager.this).startCapture();
                    }
                }
            });
        }
    }

    public synchronized void startCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cf4d", new Object[]{this});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.access$802(FaceAnimationManager.this, 1);
                    if (FaceAnimationManager.access$400(FaceAnimationManager.this) != null) {
                        FaceAnimationManager.access$400(FaceAnimationManager.this).startCheck(null);
                    }
                }
            });
        }
    }

    public synchronized void updateUI(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533bf45f", new Object[]{this, new Integer(i)});
            return;
        }
        Activity activity = this.g;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.access$000(FaceAnimationManager.this) != null && FaceAnimationManager.access$100(FaceAnimationManager.this) != null) {
                        int i2 = i;
                        if (i2 == 1) {
                            FaceAnimationManager faceAnimationManager = FaceAnimationManager.this;
                            if (faceAnimationManager.isDialogUI) {
                                FaceAnimationManager.access$000(faceAnimationManager).setVisibility(4);
                                FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(4);
                                if (FaceAnimationManager.access$200(FaceAnimationManager.this) != null) {
                                    FaceAnimationManager.access$200(FaceAnimationManager.this).setVisibility(4);
                                }
                                if (FaceAnimationManager.access$300(FaceAnimationManager.this) != null) {
                                    FaceAnimationManager.access$300(FaceAnimationManager.this).setBackground(null);
                                }
                                FaceAnimationManager.access$400(FaceAnimationManager.this).setColorfulUI(false);
                                return;
                            }
                            FaceAnimationManager.access$000(faceAnimationManager).setVisibility(0);
                            FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(4);
                        } else if (i2 == 2) {
                            FaceAnimationManager.access$502(FaceAnimationManager.this, false);
                            FaceAnimationManager faceAnimationManager2 = FaceAnimationManager.this;
                            if (faceAnimationManager2.isDialogUI) {
                                FaceAnimationManager.access$000(faceAnimationManager2).setVisibility(0);
                                FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(0);
                                if (FaceAnimationManager.access$200(FaceAnimationManager.this) != null) {
                                    FaceAnimationManager.access$200(FaceAnimationManager.this).setVisibility(0);
                                }
                                if (FaceAnimationManager.access$300(FaceAnimationManager.this) != null) {
                                    FaceAnimationManager.access$300(FaceAnimationManager.this).setBackground(FaceAnimationManager.access$600(FaceAnimationManager.this).getResources().getDrawable(R.drawable.fp_radius_corner));
                                }
                                FaceAnimationManager.access$400(FaceAnimationManager.this).setColorfulUI(true);
                                return;
                            }
                            FaceAnimationManager.access$000(faceAnimationManager2).setVisibility(0);
                            if (FaceAnimationManager.access$700(FaceAnimationManager.this) != 2) {
                                FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(0);
                            }
                        } else if (i2 == 3) {
                            if (!FaceAnimationManager.access$500(FaceAnimationManager.this)) {
                                FaceAnimationManager faceAnimationManager3 = FaceAnimationManager.this;
                                if (faceAnimationManager3.isDialogUI) {
                                    FaceAnimationManager.access$000(faceAnimationManager3).setVisibility(0);
                                    FaceAnimationManager.access$000(FaceAnimationManager.this).setEnabled(false);
                                    FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(0);
                                    FaceAnimationManager.access$100(FaceAnimationManager.this).setEnabled(false);
                                    if (FaceAnimationManager.access$200(FaceAnimationManager.this) != null) {
                                        FaceAnimationManager.access$200(FaceAnimationManager.this).setVisibility(0);
                                    }
                                    if (FaceAnimationManager.access$300(FaceAnimationManager.this) != null) {
                                        FaceAnimationManager.access$300(FaceAnimationManager.this).setBackground(FaceAnimationManager.access$600(FaceAnimationManager.this).getResources().getDrawable(R.drawable.fp_radius_corner));
                                    }
                                    FaceAnimationManager.access$400(FaceAnimationManager.this).setColorfulUI(true);
                                    return;
                                }
                            }
                            FaceAnimationManager.access$000(FaceAnimationManager.this).setVisibility(4);
                            FaceAnimationManager.access$100(FaceAnimationManager.this).setVisibility(4);
                        }
                    }
                }
            });
        }
    }

    public synchronized void init(Activity activity, View view, FaceView faceView, View view2, View view3, View view4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434ca8d3", new Object[]{this, activity, view, faceView, view2, view3, view4});
            return;
        }
        this.g = activity;
        this.b = faceView;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f3772a = view;
        this.h = 0;
        this.isDialogUI = true;
        this.i = true;
    }
}

package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.animation.animator.AnimatorParams;
import com.taobao.uikit.animation.api.AnimationStageListener;
import com.taobao.uikit.animation.api.PlaceHolderProvider;
import com.taobao.uikit.animation.model.AnimationErrorInfo;
import com.taobao.uikit.animation.surface.TranslateSurfaceView;
import tb.cw6;
import tb.har;
import tb.nx9;
import tb.qxq;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class SupportSecondaryBaseFragment extends TBMainBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SupportSecondaryBaseFragment";
    private Boolean mAsyncAnimSwitchCache = null;
    private boolean mShouldDoOnPauseOrOnStop = true;
    private boolean mShouldDoOnStart = true;
    private boolean mShouldDoOnResume = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements AnimationStageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TranslateSurfaceView f12791a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.tbmainfragment.SupportSecondaryBaseFragment$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0727a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0727a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Activity activity = ((TBMainBaseFragment) SupportSecondaryBaseFragment.this).mActivity;
                if (activity == null) {
                    TLog.loge(SupportSecondaryBaseFragment.TAG, "addAsyncAnimationView", "activity is null");
                    return;
                }
                TranslateSurfaceView translateSurfaceView = (TranslateSurfaceView) activity.findViewById(R.id.tb_main_fragment_anim_view);
                if (translateSurfaceView == null) {
                    TLog.loge(SupportSecondaryBaseFragment.TAG, "addAsyncAnimationView", "translateSurfaceView is null");
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.tbFragment);
                if (frameLayout == null) {
                    TLog.loge(SupportSecondaryBaseFragment.TAG, "addAsyncAnimationView", "frameLayout is null");
                } else {
                    frameLayout.removeView(translateSurfaceView);
                }
            }
        }

        public a(TranslateSurfaceView translateSurfaceView) {
            this.f12791a = translateSurfaceView;
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onBackgroundDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("463cb58", new Object[]{this});
                return;
            }
            TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onBackgroundDraw");
            vxm.b.j(SupportSecondaryBaseFragment.this).a("async_animation_background_draw", Long.valueOf(SystemClock.uptimeMillis()));
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            } else {
                TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onCreate");
            }
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onDestroy");
            }
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onError(AnimationErrorInfo animationErrorInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caae67ae", new Object[]{this, animationErrorInfo});
            } else if (animationErrorInfo == null) {
                TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onError");
            } else {
                TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onError: code" + animationErrorInfo.errorCode + ", msg" + animationErrorInfo.errorMsg);
                har.a("async_animation_error", animationErrorInfo.errorMsg);
            }
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onFirstFrame() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
                return;
            }
            TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onFirstFrame");
            vxm.b.j(SupportSecondaryBaseFragment.this).a("async_animation_first_frame", Long.valueOf(SystemClock.uptimeMillis()));
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onStart");
            vxm.b.j(SupportSecondaryBaseFragment.this).a("async_animation_start", Long.valueOf(SystemClock.uptimeMillis()));
        }

        @Override // com.taobao.uikit.animation.api.AnimationStageListener
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            TLog.loge(SupportSecondaryBaseFragment.TAG, "AnimationStageListener", "onStop");
            vxm.b.j(SupportSecondaryBaseFragment.this).a("async_animation_finish", Long.valueOf(SystemClock.uptimeMillis()));
            this.f12791a.setAnimationStageListener(null);
            if (nx9.w()) {
                this.f12791a.post(new RunnableC0727a());
            }
        }
    }

    static {
        t2o.a(775946379);
    }

    private boolean checkSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32fb98e7", new Object[]{this})).booleanValue();
        }
        if ((nx9.q(((TBMainBaseFragment) this).mActivity) || nx9.r(((TBMainBaseFragment) this).mActivity)) && nx9.x(((TBMainBaseFragment) this).mActivity)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(SupportSecondaryBaseFragment supportSecondaryBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmainfragment/SupportSecondaryBaseFragment");
        }
    }

    private boolean isForceDoOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130f8e2", new Object[]{this})).booleanValue();
        }
        return qxq.k();
    }

    private boolean isFragmentVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12e2e603", new Object[]{this})).booleanValue();
        }
        if (checkSwitch() && getActivity() != null) {
            return qxq.l(this, getActivity().getSupportFragmentManager());
        }
        return true;
    }

    private void setForceDoOnStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483fab7e", new Object[]{this, new Boolean(z)});
        } else {
            qxq.n(z);
        }
    }

    public AnimatorParams getAnimatorParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorParams) ipChange.ipc$dispatch("844ba8d1", new Object[]{this});
        }
        return null;
    }

    public final boolean getAsyncAnimSwitchCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc4a4542", new Object[]{this})).booleanValue() : getAsyncAnimSwitchCache(null);
    }

    public PlaceHolderProvider getPlaceHolderProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlaceHolderProvider) ipChange.ipc$dispatch("d8f17d0c", new Object[]{this});
        }
        return null;
    }

    public boolean isExitAnimNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("140d3239", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isFragmentAsyncAnimNeeded(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88d0725d", new Object[]{this, context})).booleanValue();
        }
        return nx9.l();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Context context = getContext();
        if (bundle == null && getAsyncAnimSwitchCache() && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            TranslateSurfaceView translateSurfaceView = (TranslateSurfaceView) activity.findViewById(R.id.tb_main_fragment_anim_view);
            if (translateSurfaceView == null) {
                TLog.loge(TAG, "onCreate", "translateSurfaceView is null");
                return;
            }
            translateSurfaceView.setAnimationStageListener(new a(translateSurfaceView));
            translateSurfaceView.setBackgroundView(activity.getWindow());
            translateSurfaceView.setPlaceHolderProvider(getPlaceHolderProvider());
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (shouldDoOnPause()) {
            this.mShouldDoOnResume = true;
        }
        super.onPause();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (shouldDoOnResume()) {
            this.mShouldDoOnPauseOrOnStop = true;
            this.mShouldDoOnStart = true;
            this.mShouldDoOnResume = false;
        }
        super.onResume();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (shouldDoOnStart()) {
            this.mShouldDoOnPauseOrOnStop = true;
            this.mShouldDoOnResume = true;
            this.mShouldDoOnStart = false;
            setForceDoOnStart(false);
        }
        super.onStart();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (shouldDoOnStop()) {
            this.mShouldDoOnResume = true;
            this.mShouldDoOnPauseOrOnStop = false;
        }
        super.onStop();
    }

    public boolean shouldDoOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71917e4", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        return this.mShouldDoOnPauseOrOnStop;
    }

    public boolean shouldDoOnResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10692235", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        if (isFragmentVisible()) {
            return this.mShouldDoOnResume;
        }
        return false;
    }

    public boolean shouldDoOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea050", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch() || isForceDoOnStart()) {
            return true;
        }
        if (isFragmentVisible()) {
            return this.mShouldDoOnStart;
        }
        return false;
    }

    public boolean shouldDoOnStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("833a4aca", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        return this.mShouldDoOnPauseOrOnStop;
    }

    public final boolean getAsyncAnimSwitchCache(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13ae084e", new Object[]{this, context})).booleanValue();
        }
        if (this.mAsyncAnimSwitchCache == null) {
            if (context == null) {
                context = ((TBMainBaseFragment) this).mActivity;
            }
            if (context == null) {
                TLog.loge(TAG, "getAsyncAnimSwitchCache", "mContext is null");
                return false;
            } else if (!nx9.m()) {
                TLog.loge(TAG, "getAsyncAnimSwitchCache", "isAsyncAnimationAbilityOpen is false");
                this.mAsyncAnimSwitchCache = Boolean.FALSE;
                return false;
            } else {
                try {
                    this.mAsyncAnimSwitchCache = Boolean.valueOf(isFragmentAsyncAnimNeeded(context));
                } catch (Exception e) {
                    TLog.loge(TAG, "getAsyncAnimSwitchCache", "isFragmentAsyncAnimNeeded error", e);
                    this.mAsyncAnimSwitchCache = Boolean.FALSE;
                    return false;
                }
            }
        }
        TLog.loge(TAG, "getAsyncAnimSwitchCache", "mAsyncAnimSwitchCache = " + this.mAsyncAnimSwitchCache);
        return this.mAsyncAnimSwitchCache.booleanValue();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (z) {
            if (getAsyncAnimSwitchCache()) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.no_anim);
                TranslateSurfaceView translateSurfaceView = (TranslateSurfaceView) ((Activity) getContext()).findViewById(R.id.tb_main_fragment_anim_view);
                if (translateSurfaceView == null) {
                    TLog.loge(TAG, "onCreateAnimation", "use default animation, for translateSurfaceView is null");
                    return super.onCreateAnimation(i, z, i2);
                }
                translateSurfaceView.setAnimatorParams(getAnimatorParams());
                translateSurfaceView.setCloneView(getView());
                translateSurfaceView.startAnimation();
                TLog.loge(TAG, "onCreateAnimation", "use async animation");
                if (cw6.b()) {
                    Toast.makeText(((TBMainBaseFragment) this).mActivity, "使用异步转场动画", 0).show();
                }
                return loadAnimation;
            } else if (cw6.b()) {
                Toast.makeText(((TBMainBaseFragment) this).mActivity, "使用同步转场动画", 0).show();
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }
}

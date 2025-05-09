package com.taobao.android.fluid.framework.activityresult;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import tb.hmi;
import tb.ir9;
import tb.t2o;
import tb.t3x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ActivityResultService implements IActivityResultService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_TAG = "shortvideo_activity_delegate_fragment_";
    private ActivityResultDelegateFragment mActivityResultDelegateFragment;
    private final FluidContext mFluidContext;
    private final String TAG = "ActivityResultService";
    private t3x mWeexAddCartForResultHelper = new t3x();

    static {
        t2o.a(468713795);
        t2o.a(468713796);
    }

    public ActivityResultService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    private void initActivityResultDelegateFragment(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dba9a70", new Object[]{this, context});
        } else if (context instanceof FragmentActivity) {
            String str = FRAGMENT_TAG + this.mFluidContext.getInstanceId();
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str);
            ir9.b("ActivityResultService", "初始化 ActivityResultDelegateFragment，从 tag 获取的 Fragment：" + findFragmentByTag);
            if (findFragmentByTag instanceof ActivityResultDelegateFragment) {
                ActivityResultDelegateFragment activityResultDelegateFragment = (ActivityResultDelegateFragment) findFragmentByTag;
                this.mActivityResultDelegateFragment = activityResultDelegateFragment;
                activityResultDelegateFragment.p2(this.mFluidContext);
            } else {
                this.mActivityResultDelegateFragment = new ActivityResultDelegateFragment();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.add(this.mActivityResultDelegateFragment, str);
                beginTransaction.commitAllowingStateLoss();
                this.mActivityResultDelegateFragment.p2(this.mFluidContext);
                ir9.b("ActivityResultService", "添加 ActivityResultDelegateFragment");
            }
            ir9.b("ActivityResultService", "初始化 ActivityResultDelegateFragment 完成：" + this.mActivityResultDelegateFragment);
        }
    }

    private void removeActivityResultDelegateFragment(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99814e7c", new Object[]{this, context});
        } else if (context instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG + this.mFluidContext.getInstanceId());
            ir9.b("ActivityResultService", "移除 ActivityResultDelegateFragment，从 tag 获取的 Fragment：" + findFragmentByTag);
            if (findFragmentByTag != null) {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commit();
                ir9.b("ActivityResultService", "移除 ActivityResultDelegateFragment");
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.activityresult.IActivityResultService
    public void navToCartForResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f35c139", new Object[]{this, str});
            return;
        }
        if (this.mWeexAddCartForResultHelper == null) {
            this.mWeexAddCartForResultHelper = new t3x();
        }
        initActivityResultDelegateFragment(this.mFluidContext.getContext());
        this.mWeexAddCartForResultHelper.a(this.mFluidContext, this.mActivityResultDelegateFragment, str);
    }

    @Override // com.taobao.android.fluid.framework.activityresult.IActivityResultService
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (this.mWeexAddCartForResultHelper != null) {
            a currentMediaSetData = ((IDataService) this.mFluidContext.getService(IDataService.class)).getCurrentMediaSetData();
            hmi messageCenter = ((IMessageService) this.mFluidContext.getService(IMessageService.class)).getMessageCenter();
            a.d e = currentMediaSetData.e();
            if (e != null) {
                this.mWeexAddCartForResultHelper.b(messageCenter, e.c, i, i2, intent);
            }
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            removeActivityResultDelegateFragment(this.mFluidContext.getContext());
        }
    }
}

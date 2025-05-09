package com.taobao.android.dressup.common.anim.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.dressup.base.IDressUpAnimHelper;
import kotlin.Metadata;
import tb.ckf;
import tb.kz7;
import tb.qz7;
import tb.sz7;
import tb.t2o;
import tb.xfb;
import tb.xpz;
import tb.zy7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J)\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/taobao/android/dressup/common/anim/impl/DressUpAnimHelperImpl;", "Lcom/taobao/android/dressup/base/IDressUpAnimHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Ltb/xhv;", "tryInitSwitchAndSetTheme", "(Landroid/app/Activity;Landroid/content/Intent;)V", "onDestroy", "", "isEnableMaskFrameAnim", "()Z", "Ltb/xfb;", "animPageContainer", "setContentViewForMaskFrameLayout", "(Landroid/app/Activity;Ltb/xfb;)V", "closeAnimSwitch", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "createRootParentFrameLayout", "(Landroid/content/Context;Landroid/view/View;Ltb/xfb;)Landroid/view/View;", "view", "removeViewParent", "(Landroid/view/View;)Z", "animBizSetRootContentView", "(Landroid/app/Activity;Landroid/view/View;Ltb/xfb;)V", "onFinishContainer", "onBackPressed", "Ltb/xpz;", "mTrnAnimInterface", "Ltb/xpz;", "Ltb/sz7;", "mDressUpMaskFrameAnimHelper", "Ltb/sz7;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpAnimHelperImpl implements IDressUpAnimHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final sz7 mDressUpMaskFrameAnimHelper = new sz7();
    private xpz mTrnAnimInterface;

    static {
        t2o.a(918552612);
        t2o.a(918552595);
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public void closeAnimSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1456c4", new Object[]{this});
        } else {
            this.mDressUpMaskFrameAnimHelper.i();
        }
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public View createRootParentFrameLayout(Context context, View view, xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6cad5f0", new Object[]{this, context, view, xfbVar});
        }
        ckf.g(context, "context");
        ckf.g(view, "rootView");
        View a2 = zy7.a(context, view, xfbVar).a();
        ckf.f(a2, "trnAnimInterface.animRootView");
        return a2;
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public boolean isEnableMaskFrameAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e388fb50", new Object[]{this})).booleanValue();
        }
        return this.mDressUpMaskFrameAnimHelper.j();
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        xpz xpzVar = this.mTrnAnimInterface;
        if (xpzVar != null) {
            ckf.d(xpzVar);
            if (xpzVar.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mDressUpMaskFrameAnimHelper.k();
        }
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public boolean onFinishContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8eea5a", new Object[]{this})).booleanValue();
        }
        xpz xpzVar = this.mTrnAnimInterface;
        if (xpzVar != null) {
            ckf.d(xpzVar);
            if (xpzVar.onFinishContainer()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public boolean removeViewParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6496543c", new Object[]{this, view})).booleanValue();
        }
        ckf.g(view, "view");
        return zy7.b(view);
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public void setContentViewForMaskFrameLayout(Activity activity, xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86d7897", new Object[]{this, activity, xfbVar});
            return;
        }
        ckf.g(activity, "activity");
        this.mDressUpMaskFrameAnimHelper.l(activity, xfbVar);
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public void tryInitSwitchAndSetTheme(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4230ef15", new Object[]{this, activity, intent});
            return;
        }
        ckf.g(activity, "activity");
        this.mDressUpMaskFrameAnimHelper.m(activity, intent);
    }

    @Override // com.taobao.android.dressup.base.IDressUpAnimHelper
    public void animBizSetRootContentView(Activity activity, View view, xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36b2b71", new Object[]{this, activity, view, xfbVar});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(view, "rootView");
        xpz a2 = zy7.a(activity, view, xfbVar);
        this.mTrnAnimInterface = a2;
        if (this.mDressUpMaskFrameAnimHelper.j()) {
            if (xfbVar != null) {
                try {
                    xfbVar.frameAnimSetContentView(a2.a());
                } catch (Throwable th) {
                    this.mDressUpMaskFrameAnimHelper.i();
                    qz7.a(qz7.TAG_FAST_ANIM, "未知异常。setContentViewForMaskFrameLayout 出错。", th);
                    if (zy7.b(view)) {
                        view.setBackgroundColor(-1);
                        if (xfbVar != null) {
                            xfbVar.frameAnimSetContentView(view);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.mDressUpMaskFrameAnimHelper.l(activity, xfbVar);
            if (!this.mDressUpMaskFrameAnimHelper.j()) {
                qz7.a(qz7.TAG_FAST_ANIM, "setContentViewForMaskFrameLayout 检测到不符合无极缩放条件。", null);
                return;
            }
            return;
        }
        if (kz7.a()) {
            Toast.makeText(activity, "Debug:穿搭详情，无极缩放降级。请尽快分析原因。新安装包部分模块未加载？", 1).show();
        }
        qz7.a(qz7.TAG_FAST_ANIM, "无极缩放降级逻辑。请尽快分析降级原因。新安装包部分模块未加载？", null);
        if (zy7.b(view)) {
            view.setBackgroundColor(-1);
            if (xfbVar != null) {
                xfbVar.frameAnimSetContentView(view);
            }
        }
    }
}

package com.taobao.android.dressup.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import tb.xfb;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\nJ+\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015H&¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/taobao/android/dressup/base/IDressUpAnimHelper;", "", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Ltb/xhv;", "tryInitSwitchAndSetTheme", "(Landroid/app/Activity;Landroid/content/Intent;)V", "onDestroy", "()V", "", "isEnableMaskFrameAnim", "()Z", "Ltb/xfb;", "animPageContainer", "setContentViewForMaskFrameLayout", "(Landroid/app/Activity;Ltb/xfb;)V", "closeAnimSwitch", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "createRootParentFrameLayout", "(Landroid/content/Context;Landroid/view/View;Ltb/xfb;)Landroid/view/View;", "view", "removeViewParent", "(Landroid/view/View;)Z", "animBizSetRootContentView", "(Landroid/app/Activity;Landroid/view/View;Ltb/xfb;)V", "onFinishContainer", "onBackPressed", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDressUpAnimHelper {
    void animBizSetRootContentView(Activity activity, View view, xfb xfbVar);

    void closeAnimSwitch();

    View createRootParentFrameLayout(Context context, View view, xfb xfbVar);

    boolean isEnableMaskFrameAnim();

    boolean onBackPressed();

    void onDestroy();

    boolean onFinishContainer();

    boolean removeViewParent(View view);

    void setContentViewForMaskFrameLayout(Activity activity, xfb xfbVar);

    void tryInitSwitchAndSetTheme(Activity activity, Intent intent);
}

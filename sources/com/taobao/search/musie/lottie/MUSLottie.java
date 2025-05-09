package com.taobao.search.musie.lottie;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.lottie.MUSLottie;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.ckf;
import tb.hdz;
import tb.kkh;
import tb.plh;
import tb.t2o;
import tb.ulh;
import tb.wlh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSLottie extends UINode implements Animator.AnimatorListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean start;

    static {
        t2o.a(815792751);
    }

    public MUSLottie(int i) {
        super(i);
    }

    public static /* synthetic */ void a(MUSLottie mUSLottie, Throwable th) {
        onMount$lambda$2(mUSLottie, th);
    }

    private final void applyOptions(LottieAnimationView lottieAnimationView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af311295", new Object[]{this, lottieAnimationView, jSONObject});
            return;
        }
        wlh wlhVar = new wlh(jSONObject);
        lottieAnimationView.setRepeatMode(wlhVar.c());
        lottieAnimationView.setRepeatCount(wlhVar.d());
        lottieAnimationView.setMinFrame(wlhVar.a());
        if (wlhVar.e() >= 0) {
            lottieAnimationView.setMaxFrame(wlhVar.e());
        }
        lottieAnimationView.setMinProgress(wlhVar.b());
        lottieAnimationView.setMaxProgress(wlhVar.f());
    }

    private final void fireEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae880cc", new Object[]{this});
        } else if (hasEvent("end")) {
            fireEvent("end", null);
        }
    }

    private final void fireLoadResult(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adcc41e", new Object[]{this, new Boolean(z), str});
        } else if (hasEvent("load")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isFinished", String.valueOf(z));
            jSONObject.put((JSONObject) "src", str);
            fireEvent("load", jSONObject);
        }
    }

    private final void fireStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7580e53", new Object[]{this});
        } else if (hasEvent("start")) {
            fireEvent("start", null);
        }
    }

    public static /* synthetic */ Object ipc$super(MUSLottie mUSLottie, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode == 1692842255) {
            super.onActivityPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/lottie/MUSLottie");
        }
    }

    public static final void onMount$lambda$2(MUSLottie mUSLottie, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367bd5b6", new Object[]{mUSLottie, th});
            return;
        }
        ckf.g(mUSLottie, "this$0");
        String str = (String) mUSLottie.getAttribute("src");
        if (str != null) {
            TLogTracker.f("tbsearch_lottie", "draw_error", "url ".concat(str));
        }
        String str2 = (String) mUSLottie.getAttribute("json");
        if (str2 != null) {
            TLogTracker.f("tbsearch_lottie", "draw_error", "json ".concat(str2));
        }
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hvu
    public void onActivityPause() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null) {
            lottieView.pauseAnimation();
        }
    }

    @Override // tb.hvu
    public void onActivityResume() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null && lottieView.isAttachedToWindow()) {
            lottieView.resumeAnimation();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            return;
        }
        this.start = false;
        fireEnd();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            return;
        }
        this.start = true;
        fireStart();
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new LottieWrapView(context);
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        LottieWrapView lottieWrapView;
        LottieWrapView lottieWrapView2;
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        boolean z = obj instanceof LottieWrapView;
        if (z) {
            lottieWrapView = (LottieWrapView) obj;
        } else {
            lottieWrapView = null;
        }
        if (!(lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null)) {
            lottieView.setAnimationFromJson("", null);
            lottieView.cancelAnimation();
            lottieView.removeAnimatorListener(this);
        }
        if (z) {
            lottieWrapView2 = (LottieWrapView) obj;
        } else {
            lottieWrapView2 = null;
        }
        if (lottieWrapView2 != null) {
            lottieWrapView2.setOnDrawErrorListener(null);
        }
    }

    @MUSMethod(uiThread = true)
    public final void pause() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null) {
            lottieView.pauseAnimation();
        }
    }

    @MUSMethod(uiThread = true)
    public final void play() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (lottieWrapView != null && (lottieView = lottieWrapView.getLottieView()) != null) {
            if (this.start) {
                lottieView.resumeAnimation();
                fireStart();
                return;
            }
            lottieView.playAnimation();
        }
    }

    @MUSNodeProp(name = "json", refresh = true)
    public final void refreshJsonContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65ea7", new Object[]{this, str});
            return;
        }
        LottieAnimationView lottieView = ((LottieWrapView) getMountContent()).getLottieView();
        ckf.f(lottieView, "getLottieView(...)");
        applyContent(lottieView);
    }

    @MUSNodeProp(name = "options", refresh = true)
    public final void refreshOptions(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede451e6", new Object[]{this, jSONObject});
            return;
        }
        LottieAnimationView lottieView = ((LottieWrapView) getMountContent()).getLottieView();
        ckf.f(lottieView, "getLottieView(...)");
        applyOptions(lottieView, jSONObject);
    }

    @MUSNodeProp(name = "src", refresh = true)
    public final void refreshSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43deda", new Object[]{this, str});
            return;
        }
        LottieAnimationView lottieView = ((LottieWrapView) getMountContent()).getLottieView();
        ckf.f(lottieView, "getLottieView(...)");
        applyContent(lottieView);
    }

    @MUSNodeProp(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f415c1", new Object[]{this, bool});
        } else {
            setAttribute("autoplay", bool);
        }
    }

    @MUSNodeProp(name = "json")
    public final void setJsonContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe60c200", new Object[]{this, str});
        } else {
            setAttribute("json", str);
        }
    }

    @MUSNodeProp(name = "options")
    public final void setOptions(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca08ced", new Object[]{this, jSONObject});
        } else {
            setAttribute("options", jSONObject);
        }
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSMethod(uiThread = true)
    public final void stop() {
        LottieAnimationView lottieView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        LottieWrapView lottieWrapView = (LottieWrapView) getMountContent();
        if (!(lottieWrapView == null || (lottieView = lottieWrapView.getLottieView()) == null)) {
            lottieView.setFrame(0);
            lottieView.pauseAnimation();
        }
        fireEnd();
    }

    public static final void applyContent$lambda$4(MUSLottie mUSLottie, String str, kkh kkhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("911c3057", new Object[]{mUSLottie, str, kkhVar});
            return;
        }
        ckf.g(mUSLottie, "this$0");
        ckf.d(str);
        mUSLottie.fireLoadResult(true, str);
    }

    public static final void applyContent$lambda$5(MUSLottie mUSLottie, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05d13ba", new Object[]{mUSLottie, str, th});
            return;
        }
        ckf.g(mUSLottie, "this$0");
        ckf.d(str);
        mUSLottie.fireLoadResult(false, str);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.start = false;
        LottieAnimationView lottieView = ((LottieWrapView) getMountContent()).getLottieView();
        ckf.d(lottieView);
        applyOptions(lottieView, (JSONObject) getAttribute("options"));
        if (applyContent(lottieView)) {
            if (ckf.b(getAttribute("autoplay"), Boolean.TRUE)) {
                lottieView.playAnimation();
            } else {
                lottieView.pauseAnimation();
            }
            lottieView.addAnimatorListener(this);
            ((LottieWrapView) getMountContent()).setOnDrawErrorListener(new hdz(this));
        }
    }

    private final boolean applyContent(LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3a2304", new Object[]{this, lottieAnimationView})).booleanValue();
        }
        String str = (String) getAttribute("json");
        final String str2 = (String) getAttribute("src");
        lottieAnimationView.removeAllLottieOnCompositionLoadedListener();
        lottieAnimationView.setFailureListener(null);
        if (!TextUtils.isEmpty(str)) {
            lottieAnimationView.setAnimationFromJson(str, null);
        } else if (!TextUtils.isEmpty(str2)) {
            lottieAnimationView.setAnimationFromUrl(str2, str2);
            lottieAnimationView.addLottieOnCompositionLoadedListener(new ulh() { // from class: tb.idz
                @Override // tb.ulh
                public final void onCompositionLoaded(kkh kkhVar) {
                    MUSLottie.applyContent$lambda$4(MUSLottie.this, str2, kkhVar);
                }
            });
            lottieAnimationView.setFailureListener(new plh() { // from class: tb.jdz
                @Override // tb.plh
                public final void onResult(Object obj) {
                    MUSLottie.applyContent$lambda$5(MUSLottie.this, str2, (Throwable) obj);
                }
            });
        } else {
            lottieAnimationView.cancelAnimation();
            return false;
        }
        return true;
    }
}

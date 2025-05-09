package com.taobao.taolive.room.ui.lottie;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import tb.t2o;
import tb.wkh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DynamicLottieView extends MALottieView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wkh mLottieConfig;

    static {
        t2o.a(806355810);
    }

    public DynamicLottieView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DynamicLottieView dynamicLottieView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/lottie/DynamicLottieView");
    }

    public void playAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb12141", new Object[]{this, str});
        } else {
            playAnimation(str, null, null, null, null);
        }
    }

    public DynamicLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void playAnimation(String str, JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf53ab91", new Object[]{this, str, jSONArray, jSONArray2});
        } else {
            playAnimation(str, jSONArray, jSONArray2, null, null);
        }
    }

    public DynamicLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void playAnimation(String str, JSONArray jSONArray, MALottieView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82ae058", new Object[]{this, str, jSONArray, aVar});
        } else {
            playAnimation(str, null, null, jSONArray, null);
        }
    }

    public void playAnimation(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, MALottieView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d840008", new Object[]{this, str, jSONArray, jSONArray2, jSONArray3, aVar});
        } else if (!TextUtils.isEmpty(str)) {
            wkh b = wkh.Builder.e(str).b();
            if (jSONArray != null) {
                b.b0(jSONArray);
            }
            if (jSONArray2 != null) {
                b.a0(jSONArray2);
            }
            if (jSONArray3 != null) {
                b.W(jSONArray3);
            }
            if (aVar != null) {
                setOnAreaClickEventListener(aVar);
            }
            setUpWithConfig(b);
            playAnimation();
        }
    }
}

package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.nj7;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/OpenWeexFloatPageAbility;", "Lcom/taobao/umipublish/extension/windvane/abilities/BaseAbility;", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroid/support/v4/app/Fragment;)V", "Lcom/alibaba/fastjson/JSONObject;", "params", "Ltb/xhv;", "onExecute", "(Lcom/alibaba/fastjson/JSONObject;)V", "Landroidx/fragment/app/Fragment;", "Companion", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class OpenWeexFloatPageAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLASS_NAME = "com.taobao.umipublish.biz.weex.UnifyWeexFloatActivity";
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "OpenWeexFloatPageAbility";
    private static final String UNIFY_WEEX_ACTION = "android.intent.action.UMI";
    private final Fragment fragment;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/umipublish/extension/windvane/abilities/OpenWeexFloatPageAbility$Companion;", "", "()V", "CLASS_NAME", "", RPCDataItems.SWITCH_TAG_LOG, "UNIFY_WEEX_ACTION", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        static {
            t2o.a(944767173);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(944767172);
    }

    public OpenWeexFloatPageAbility(Fragment fragment) {
        ckf.g(fragment, "fragment");
        this.fragment = fragment;
    }

    public static /* synthetic */ Object ipc$super(OpenWeexFloatPageAbility openWeexFloatPageAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/OpenWeexFloatPageAbility");
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            errorCallback("1", "Params is null");
        } else {
            String string = jSONObject.getString("weexUrl");
            if (string == null || string.length() == 0) {
                errorCallback("2", "WeexUrl is null");
                return;
            }
            Uri.Builder buildUpon = Uri.parse(string).buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            buildUpon.appendQueryParameter("is_loading", "0");
            buildUpon.appendQueryParameter("wx_opaque", "0");
            buildUpon.appendQueryParameter("bgContainerColor", "#00000000");
            Bundle bundle = new Bundle();
            try {
                bundle.putSerializable("unify_weex_init_data", jSONObject.getJSONObject("params"));
                bundle.putInt("top_offset", jSONObject.getIntValue("topOffset"));
            } catch (Exception e) {
                odg.c(TAG, e.getMessage());
            }
            Nav withFragment = Nav.from(this.mContext).withExtras(bundle).withAction(UNIFY_WEEX_ACTION).withFragment(this.fragment);
            Context context = this.mContext;
            ckf.f(context, "mContext");
            withFragment.withClassName(context.getPackageName(), CLASS_NAME).forResult(60005).toUri(buildUpon.build());
        }
    }
}

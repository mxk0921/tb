package com.taobao.umipublish.extension.windvane.abilities;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import java.util.UUID;
import tb.dov;
import tb.ixp;
import tb.k0n;
import tb.muu;
import tb.odg;
import tb.qrf;
import tb.t2o;
import tb.trt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class QuickBaseAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "QuickPublishAbility";
    public JSONObject mCardData;
    public AbilityChain mHead;
    private int mLastProgress;
    public final BaseAbility.Listener mMListener = new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onProgress(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            if (i <= QuickBaseAbility.access$000(QuickBaseAbility.this)) {
                i = QuickBaseAbility.access$000(QuickBaseAbility.this);
            }
            trt.h(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    QuickBaseAbility.this.updateDialogProgress(i);
                    AbilityChain activeChain = QuickBaseAbility.this.mHead.getActiveChain();
                    if (activeChain != null) {
                        if (TextUtils.isEmpty(activeChain.getLoadingText())) {
                            str = Localization.q(R.string.gg_pub_loading_1);
                        } else {
                            str = activeChain.getLoadingText();
                        }
                        QuickBaseAbility.this.updateDialogTitle(str);
                    }
                }
            });
            QuickBaseAbility.this.progressCallback(i);
            QuickBaseAbility.access$002(QuickBaseAbility.this, i);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            odg.c(QuickBaseAbility.TAG, "onFailed. errCode=" + str + ", errMsg=" + str2);
            QuickBaseAbility.this.hideProcessingDialog();
            QuickBaseAbility.this.errorCallback(str, str2);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            odg.d(QuickBaseAbility.TAG, "onSuccess");
            QuickBaseAbility.this.hideProcessingDialog();
            QuickBaseAbility.this.successCallback(jSONObject);
        }
    };
    public k0n mProgressDialog;
    public JSONObject mUrlParams;

    static {
        t2o.a(944767176);
    }

    public static /* synthetic */ int access$000(QuickBaseAbility quickBaseAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("155ed333", new Object[]{quickBaseAbility})).intValue();
        }
        return quickBaseAbility.mLastProgress;
    }

    public static /* synthetic */ int access$002(QuickBaseAbility quickBaseAbility, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdd85d38", new Object[]{quickBaseAbility, new Integer(i)})).intValue();
        }
        quickBaseAbility.mLastProgress = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(QuickBaseAbility quickBaseAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickBaseAbility");
    }

    public JSONObject generateUrlParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8a211c89", new Object[]{this, jSONObject});
        }
        JSONObject l = qrf.l(jSONObject, "publishParams");
        if (!muu.w(this.mContext)) {
            return l;
        }
        String j = muu.j(this.mContext);
        if (TextUtils.isEmpty(j)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) JSON.toJSON(dov.b(j).o());
        if (l != null) {
            jSONObject2.putAll(l);
        }
        return jSONObject2;
    }

    public void hideProcessingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fb09a4", new Object[]{this});
            return;
        }
        k0n k0nVar = this.mProgressDialog;
        if (k0nVar != null) {
            k0nVar.dismiss();
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject == null) {
                errorCallback("1", "input params is null ");
                return;
            }
            this.mCardData = jSONObject.getJSONObject("data");
            JSONObject generateUrlParams = generateUrlParams(jSONObject);
            this.mUrlParams = generateUrlParams;
            if (generateUrlParams == null) {
                errorCallback("2", "mUrlParams is null ");
                return;
            }
            if (!generateUrlParams.containsKey("umi_pub_session")) {
                this.mUrlParams.put("umi_pub_session", (Object) UUID.randomUUID().toString());
            }
            JSONObject l = qrf.l(this.mCardData, MspGlobalDefine.EXTENDINFO);
            JSONObject jSONObject2 = this.mUrlParams;
            if (l == null) {
                l = new JSONObject();
            }
            jSONObject2.putAll(l);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    public void showProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88d9b9", new Object[]{this});
            return;
        }
        if (this.mProgressDialog == null) {
            this.mProgressDialog = new k0n(this.mContext, null);
        }
        this.mProgressDialog.i(Localization.q(R.string.gg_pub_loading_1));
        this.mProgressDialog.h(Localization.q(R.string.gg_pub_keep_screen_on_do_not_switch_app));
        this.mProgressDialog.c(true);
        this.mProgressDialog.setCancelable(false);
        this.mProgressDialog.j(true);
        this.mProgressDialog.show();
        this.mProgressDialog.f(new ixp(this.mProgressDialog) { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == 61372776) {
                    super.d();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/abilities/QuickBaseAbility$2");
            }

            @Override // tb.ixp, tb.qob
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a87968", new Object[]{this});
                    return;
                }
                super.d();
                QuickBaseAbility.this.mHead.cancel();
                QuickBaseAbility.this.mMListener.a(PreRequestPresenter.SOURCE_RATE_HISTORY, "USER_CANCELED");
            }
        });
    }

    public void updateDialogProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3acf95e", new Object[]{this, new Integer(i)});
            return;
        }
        k0n k0nVar = this.mProgressDialog;
        if (k0nVar != null) {
            k0nVar.g(i);
        }
    }

    public void updateDialogTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126eacb8", new Object[]{this, str});
            return;
        }
        k0n k0nVar = this.mProgressDialog;
        if (k0nVar != null) {
            k0nVar.i(str);
        }
    }
}

package com.taobao.android.live.plugin.proxy.reward;

import android.app.Activity;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IRewardProxy extends IBTypeProxy {
    public static final String KEY = "IRewardProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(Activity activity, String str, b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        public static final String ERR_CODE_LAST_RECHARGE_NOT_FINISH = "6";
        public static final String ERR_CODE_LINK_ID_INVALID = "5";
        public static final String ERR_CODE_NETWORK = "21005";
        public static final String ERR_CODE_PARAMS_INVALID = "1";
        public static final String ERR_CODE_PRODUCT_ID_INVALID = "2";
        public static final String ERR_CODE_RECHARGE_ID_INVALID = "3";
        public static final String ERR_CODE_TRANSACTION_ID_INVALID = "4";
        public static final String STEP_CREATE_ORDER = "creatOrder";
        public static final String STEP_H5CALL = "h5Call";
        public static final String STEP_RECHARGE = "recharge";
    }

    a createRecharge();

    boolean isRewardEnable(TBLiveDataModel tBLiveDataModel, ux9 ux9Var);
}

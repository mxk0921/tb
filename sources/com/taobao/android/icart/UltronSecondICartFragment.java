package com.taobao.android.icart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import tb.hav;
import tb.na3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UltronSecondICartFragment extends BaseICartFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150667);
    }

    public static /* synthetic */ Object ipc$super(UltronSecondICartFragment ultronSecondICartFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/UltronSecondICartFragment");
    }

    @Override // com.taobao.android.icart.BaseICartFragment
    public BaseICartFragmentProxy p2(Bundle bundle) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseICartFragmentProxy) ipChange.ipc$dispatch("883c1a1d", new Object[]{this, bundle});
        }
        if (bundle != null) {
            intent = (Intent) bundle.getParcelable("activityIntent");
            if (A2(intent)) {
                return BaseICartFragment.b.a(this);
            }
        } else {
            intent = null;
        }
        return BaseICartFragment.b.b(this, intent, false);
    }

    @Override // com.taobao.android.icart.BaseICartFragment
    public boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e360ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final String z2(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5535c560", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter(QueryParamsManager.KEY_CART_FROM_BIZ);
        return TextUtils.isEmpty(queryParameter) ? QueryParamsManager.DEFAULT_CART_FROM : queryParameter;
    }

    public final boolean A2(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365ae5e", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        if (QueryParamsManager.CartFeedFlowType.search.equals(data.getQueryParameter(na3.sKeyFeedFlowType))) {
            hav.g("interceptUriForNative 搜索", new String[0]);
            return true;
        }
        String queryParameter = data.getQueryParameter("cartCustomExParam");
        if (queryParameter != null) {
            try {
                if (JSON.parseObject(queryParameter).getBooleanValue("preheat")) {
                    hav.g("interceptUriForNative 价格抢先看", new String[0]);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        String z2 = z2(data);
        if (QueryParamsManager.DEFAULT_CART_FROM.equals(z2)) {
            return false;
        }
        hav.g("interceptUriForNative 非taobao_client，cartFrom=" + z2, new String[0]);
        return true;
    }
}

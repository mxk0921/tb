package com.alibaba.aliweex.adapter.module;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.cnc;
import tb.t2o;
import tb.uyv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXLocationModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(85983251);
    }

    public static /* synthetic */ Object ipc$super(WXLocationModule wXLocationModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/adapter/module/WXLocationModule");
    }

    public WeexPageFragment findWeexPageFragment() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("2628ad35", new Object[]{this});
        }
        Context context = this.mWXSDKInstance.getContext();
        String str = WeexPageFragment.FRAGMENT_TAG;
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance instanceof AliWXSDKInstance) {
            String D1 = ((AliWXSDKInstance) wXSDKInstance).D1();
            if (!TextUtils.isEmpty(D1)) {
                str = D1;
            }
        }
        if (!(context instanceof FragmentActivity) || (findFragmentByTag = ((FragmentActivity) context).getSupportFragmentManager().findFragmentByTag(str)) == null || !(findFragmentByTag instanceof WeexPageFragment)) {
            return null;
        }
        return (WeexPageFragment) findFragmentByTag;
    }

    @JSMethod
    public void reload(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282e99ad", new Object[]{this, bool});
            return;
        }
        Context context = this.mWXSDKInstance.getContext();
        if (context != null) {
            WeexPageFragment findWeexPageFragment = findWeexPageFragment();
            if (findWeexPageFragment != null) {
                findWeexPageFragment.reload();
            } else if (context instanceof cnc) {
                ((cnc) context).b(bool.booleanValue());
            }
        }
    }

    @JSMethod
    public void replace(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea862e45", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (context = this.mWXSDKInstance.getContext()) != null) {
            WeexPageFragment findWeexPageFragment = findWeexPageFragment();
            if (findWeexPageFragment != null) {
                replace(findWeexPageFragment, str);
            } else if (context instanceof cnc) {
                ((cnc) context).a(str);
            }
        }
    }

    private void replace(WeexPageFragment weexPageFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ffbcb4", new Object[]{this, weexPageFragment, str});
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(uyv.WX_TPL);
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "true".equals(parse.getQueryParameter("wh_weex")) ? str : "";
        }
        if (!TextUtils.isEmpty(queryParameter) && weexPageFragment != null) {
            weexPageFragment.replace(str, queryParameter);
        }
    }
}

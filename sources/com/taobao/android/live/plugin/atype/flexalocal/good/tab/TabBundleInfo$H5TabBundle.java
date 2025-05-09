package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.aqs;
import tb.kkr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TabBundleInfo$H5TabBundle extends aqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String url;

    static {
        t2o.a(295699164);
    }

    public TabBundleInfo$H5TabBundle(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        super(i, extraGoodsTabItem);
    }

    public static /* synthetic */ Object ipc$super(TabBundleInfo$H5TabBundle tabBundleInfo$H5TabBundle, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/tab/TabBundleInfo$H5TabBundle");
    }

    @Override // tb.aqs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (this.baseFrame != null && kkr.i().h() != null) {
            kkr.i().h().destroy(this.baseFrame);
        }
    }
}

package com.taobao.taopai2.material.business.musiclove;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MusicLoveRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String audioId;
    public String id;
    public int vendorType;

    static {
        t2o.a(782237879);
    }

    public static /* synthetic */ Object ipc$super(MusicLoveRequestParams musicLoveRequestParams, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/musiclove/MusicLoveRequestParams");
    }

    @Override // com.taobao.taopai2.material.base.MaterialBaseRequestParams, tb.erc
    public String getAPI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this});
        }
        return "mtop.alibaba.tspeditor.material.music.like";
    }
}

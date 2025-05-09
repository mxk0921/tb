package com.taobao.umipublish.extension.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import tb.juu;
import tb.lee;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoChecker implements lee<IUGCMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767035);
        t2o.a(511705166);
    }

    public boolean check(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4837411", new Object[]{this, iUGCMedia})).booleanValue() : juu.d(iUGCMedia);
    }
}

package com.taobao.android.litecreator.sdk;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.litecreator.sdk.nav.interceptor.PagePublishInterceptor;
import com.taobao.android.litecreator.sdk.nav.interceptor.PageTabsInterceptor;
import java.util.ArrayList;
import java.util.List;
import tb.kdp;
import tb.nj7;
import tb.o0c;
import tb.t2o;
import tb.vic;
import tb.vml;
import tb.wml;
import tb.xnj;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiteCreatorNavProcessor implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NAME = "LiteCreatorNavProcessor";
    private final List<vic> mInterceptors;

    static {
        t2o.a(511705327);
        t2o.a(578814049);
    }

    public LiteCreatorNavProcessor() {
        ArrayList arrayList = new ArrayList();
        this.mInterceptors = arrayList;
        arrayList.add(kdp.a(o0c.class, new Object[0]));
        arrayList.add(new PageTabsInterceptor());
        arrayList.add(new PagePublishInterceptor());
        arrayList.add(new wml());
        arrayList.add(new vml());
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return NAME;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || zmjVar == null || zmjVar.d() == null)) {
            for (vic vicVar : this.mInterceptors) {
                if (vicVar.intercept(intent, zmjVar.d())) {
                    vicVar.nav(intent, zmjVar.d());
                    return false;
                }
            }
            if (!(TBDeviceUtils.p(zmjVar.d()) || TBDeviceUtils.P(zmjVar.d())) || (data = intent.getData()) == null) {
                return true;
            }
            intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}

package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;
import tb.a07;
import tb.ckf;
import tb.f2k;
import tb.ir9;
import tb.r12;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class VideoTabConfig extends r12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "VideoTabConfig";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(468714438);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(468714437);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTabConfig(TabModel tabModel) {
        super(tabModel);
        ckf.g(tabModel, "tabModel");
    }

    public static /* synthetic */ Object ipc$super(VideoTabConfig videoTabConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/VideoTabConfig");
    }

    @Override // tb.r12
    public boolean isEnableShareButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82460ef", new Object[]{this})).booleanValue();
        }
        ir9.b(TAG, "isEnableShareButton url:" + getSubPageModel().getUrl());
        try {
            String url = getSubPageModel().getUrl();
            if (url == null) {
                url = "";
            }
            String queryParameter = Uri.parse(url).getQueryParameter("type");
            ir9.b(TAG, "isEnableShareButton type:" + queryParameter);
            return f2k.Companion.g(queryParameter);
        } catch (Exception e) {
            ir9.c(TAG, "isEnableShareButton error", e);
            return false;
        }
    }
}

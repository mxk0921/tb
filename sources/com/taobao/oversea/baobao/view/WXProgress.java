package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.StringUtil;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.HashMap;
import java.util.Map;
import tb.e0n;
import tb.lsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WXProgress extends WXVContainer<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "tmgbaobaoprogress";
    private BaobaoProgress mRootView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(WXProgress wXProgress) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11423a;

        public b(Map map) {
            this.f11423a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WXProgress.access$000(WXProgress.this).update(this.f11423a);
            }
        }
    }

    public WXProgress(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ BaobaoProgress access$000(WXProgress wXProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoProgress) ipChange.ipc$dispatch("253e54dc", new Object[]{wXProgress});
        }
        return wXProgress.mRootView;
    }

    public static /* synthetic */ Object ipc$super(WXProgress wXProgress, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/WXProgress");
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        e0n.b().f(WXProgress.class.getName());
    }

    @WXComponentProp(name = "data")
    public void setData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else if (this.mRootView != null) {
            lsa.a().b(new b(map));
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FrameLayout initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        this.mRootView = BaobaoProgress.build(context);
        e0n.b().d(WXProgress.class.getName(), this.mRootView);
        try {
            if (this.mRootView != null) {
                String valueOf = String.valueOf(getAttrs().get("data"));
                if (!StringUtil.isEmpty(valueOf)) {
                    this.mRootView.init((Map) JSON.parseObject(valueOf, new a(this), new Feature[0]));
                }
            }
        } catch (Exception e) {
            e.toString();
        }
        return this.mRootView;
    }
}

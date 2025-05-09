package com.taobao.homepage.page.weexv2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.bqa;
import tb.c4b;
import tb.rrd;
import tb.t2o;
import tb.xid;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WeexSecondFloorFragment extends WeexFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int v;
    public String w;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements rrd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rrd
        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62e134d1", new Object[]{this, runnable});
            } else {
                runnable.run();
            }
        }

        @Override // tb.rrd
        public View b(Context context, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("399b915d", new Object[]{this, context, bundle});
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(WeexSecondFloorFragment.X2(WeexSecondFloorFragment.this));
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            tUrlImageView.setBackgroundColor(WeexSecondFloorFragment.X2(WeexSecondFloorFragment.this));
            tUrlImageView.setImageUrl(WeexSecondFloorFragment.a3(WeexSecondFloorFragment.this));
            frameLayout.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    public static /* synthetic */ int X2(WeexSecondFloorFragment weexSecondFloorFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28220d76", new Object[]{weexSecondFloorFragment})).intValue();
        }
        return weexSecondFloorFragment.v;
    }

    public static /* synthetic */ String a3(WeexSecondFloorFragment weexSecondFloorFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f3937e", new Object[]{weexSecondFloorFragment});
        }
        return weexSecondFloorFragment.w;
    }

    public static WeexSecondFloorFragment c3(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexSecondFloorFragment) ipChange.ipc$dispatch("708572d3", new Object[]{str, str2, str3, new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("wlmUrl", str);
        bundle.putString("bundleUrl", str2);
        bundle.putString("defaultBgImgUrl", str3);
        bundle.putInt("backgroundColor", i);
        WeexSecondFloorFragment weexSecondFloorFragment = new WeexSecondFloorFragment();
        weexSecondFloorFragment.setArguments(bundle);
        weexSecondFloorFragment.D2(str, str2, currentTimeMillis);
        return weexSecondFloorFragment;
    }

    public static /* synthetic */ Object ipc$super(WeexSecondFloorFragment weexSecondFloorFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/page/weexv2/WeexSecondFloorFragment");
        }
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment
    public rrd J2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("93eb3996", new Object[]{this, new Boolean(z)});
        }
        return new a();
    }

    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda19b0b", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a v2 = v2();
        if (v2 == null) {
            bqa.d("WeexSecondFloorFragment", "getInstance() == null");
            return;
        }
        xid renderComponent = v2.getRenderComponent();
        if (renderComponent != null) {
            renderComponent.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            bqa.d("WeexSecondFloorFragment", "bundle == null");
            return;
        }
        int i = arguments.getInt("backgroundColor");
        if (i != 0) {
            this.v = i;
        }
        String string = arguments.getString("defaultBgImgUrl");
        if (!TextUtils.isEmpty(string)) {
            this.w = string;
        }
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        IPullDownService iPullDownService = (IPullDownService) c4b.i().h(IPullDownService.class);
        if (iPullDownService != null) {
            iPullDownService.secondBackHome();
            bqa.d("WeexSecondFloorFragment", "onDestroy backHome");
        }
    }

    static {
        t2o.a(729809100);
        MUSEngine.registerModule(WeexSecondModule.NAME, WeexSecondModule.class);
    }
}

package com.taobao.avplayer;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.b75;
import tb.d75;
import tb.h95;
import tb.k95;
import tb.m75;
import tb.r65;
import tb.t2o;
import tb.v85;
import tb.y95;
import tb.z75;
import tb.z95;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q extends DWInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends DWInstance.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(451936294);
        }

        public a(Activity activity) {
            super(activity);
            this.f10095a.k0 = "tbdw";
            if (MediaSystemUtils.sApplication == null) {
                MediaSystemUtils.sApplication = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBDWInstance$TBBuilder");
        }

        public q r0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("bb315666", new Object[]{this});
            }
            c();
            return new q(this.f10095a);
        }
    }

    static {
        t2o.a(451936293);
        h95.a();
        boolean isSupport = WXEnvironment.isSupport();
        MediaSystemUtils.sIsSupportWeex = isSupport;
        if (isSupport) {
            try {
                WXSDKEngine.registerModule("SplayerModule", WXSplayerModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
        }
        r65.f27136a = new m75();
        if (r65.b == null) {
            r65.b = new b75();
        }
    }

    public q(DWInstance.e eVar) {
        super(eVar);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBDWInstance");
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67c80a9", new Object[]{this, view, layoutParams});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_addCoverView);
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fa4313", new Object[]{this, view});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.dw_removeCoverView);
        }
    }

    @Override // com.taobao.avplayer.DWInstance
    public void initAdapter(DWInstance.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c19897", new Object[]{this, eVar});
        } else if (eVar != null) {
            DWContext dWContext = this.mDWContext;
            dWContext.mConfigAdapter = r65.b;
            dWContext.mConfigParamsAdapter = new d75();
            this.mDWContext.mNetworkAdapter = new DWNetworkAdapter();
            this.mDWContext.mUTAdapter = new z95();
            this.mDWContext.mDWAlarmAdapter = new k95();
            this.mDWContext.mNetworkUtilsAdapter = new v85();
            this.mDWContext.mDWImageAdapter = new z75(this.mDWContext.getActivity());
            this.mDWContext.setUserInfoAdapter(new y95());
        }
    }
}

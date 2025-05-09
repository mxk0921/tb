package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWHighPerformanceInstanceNew;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.media.MediaSystemUtils;
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
public class r extends DWHighPerformanceInstanceNew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936295);
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

    public r(DWHighPerformanceInstanceNew.i iVar) {
        super(iVar);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBHighPerformanceDWInstance");
    }

    @Override // com.taobao.avplayer.DWHighPerformanceInstanceNew
    public void E0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.DWHighPerformanceInstanceNew
    public void L(DWHighPerformanceInstanceNew.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852064f2", new Object[]{this, iVar});
        } else if (iVar != null) {
            if (iVar.r == null) {
                this.d.mConfigAdapter = r65.b;
            }
            if (iVar.s == null) {
                this.d.mConfigParamsAdapter = new d75();
            }
            if (iVar.p == null) {
                this.d.mNetworkAdapter = new DWNetworkAdapter();
            }
            if (iVar.q == null) {
                this.d.mUTAdapter = new z95();
            }
            if (iVar.t == null) {
                this.d.mDWAlarmAdapter = new k95();
            }
            this.d.mNetworkUtilsAdapter = new v85();
            this.d.mDWImageAdapter = new z75(this.d.getActivity());
            this.d.setUserInfoAdapter(new y95());
        }
    }

    public void T0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148ee5c2", new Object[]{this, new Long(j)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends DWHighPerformanceInstanceNew.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(451936296);
        }

        public a(Activity activity) {
            super(activity);
            if (MediaSystemUtils.sApplication == null) {
                MediaSystemUtils.sApplication = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
            this.f10091a.R = "tbhp";
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBHighPerformanceDWInstance$TBBuilder");
        }

        /* renamed from: h0 */
        public r a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r) ipChange.ipc$dispatch("f65c5d52", new Object[]{this});
            }
            b();
            return new r(this.f10091a);
        }

        public a(Context context) {
            super(context);
            if (MediaSystemUtils.sApplication == null && (context instanceof Activity)) {
                Activity activity = (Activity) context;
                MediaSystemUtils.sApplication = activity.getApplication();
                MediaSystemUtils.sApplication = activity.getApplication();
            }
            this.f10091a.R = "tbhp";
        }
    }
}

package com.ut.share.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.falco.m;
import com.taobao.falco.s;
import com.taobao.orange.OrangeConfig;
import tb.t2o;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RumManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static m backFlowSpan;
    private static boolean enableEmbedPresentMode;
    private static m shareSpan;

    public static /* synthetic */ m access$002(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c7cf4f9d", new Object[]{mVar});
        }
        shareSpan = mVar;
        return mVar;
    }

    public static /* synthetic */ m access$102(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("f680b9bc", new Object[]{mVar});
        }
        backFlowSpan = mVar;
        return mVar;
    }

    public static void configEnableEmbedPresentMode(WeexInstanceConfig weexInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47017c86", new Object[]{weexInstanceConfig});
        } else if (enableEmbedPresentMode) {
            weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePopup);
        }
    }

    public static void createBackFlowSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bec1c2", new Object[0]);
            return;
        }
        final tz8 tz8Var = FalcoGlobalTracer.get();
        tz8Var.a(new s.b() { // from class: com.ut.share.utils.RumManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.falco.s.b
            public void onTouchActionSpan(s sVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b740c373", new Object[]{this, sVar});
                    return;
                }
                m e = tz8.this.d(m.MODULE, "tap").e();
                e.a0(Long.valueOf(System.currentTimeMillis()));
                e.y("TBShareManager");
                e.t0("tabSelected");
                long currentTimeMillis = System.currentTimeMillis();
                e.L(Long.valueOf(currentTimeMillis));
                e.w(Long.valueOf(currentTimeMillis));
                RumManager.access$102(e);
            }
        });
    }

    public static void createShareSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6783434", new Object[0]);
            return;
        }
        final tz8 tz8Var = FalcoGlobalTracer.get();
        tz8Var.a(new s.b() { // from class: com.ut.share.utils.RumManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.falco.s.b
            public void onTouchActionSpan(s sVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b740c373", new Object[]{this, sVar});
                    return;
                }
                m e = tz8.this.d(m.MODULE, "tap").e();
                e.a0(Long.valueOf(sVar.k()));
                e.y("TBShareManager");
                e.t0("tabSelected");
                long currentTimeMillis = System.currentTimeMillis();
                e.L(Long.valueOf(currentTimeMillis));
                e.w(Long.valueOf(currentTimeMillis));
                RumManager.access$002(e);
            }
        });
    }

    public static void finishBackFlowSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375e9f59", new Object[0]);
            return;
        }
        m mVar = backFlowSpan;
        if (mVar != null) {
            mVar.t("succeed");
            backFlowSpan = null;
        }
    }

    public static void finishShareSpan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849c15fd", new Object[0]);
            return;
        }
        m mVar = shareSpan;
        if (mVar != null) {
            mVar.t("succeed");
            shareSpan = null;
        }
    }

    static {
        t2o.a(662700082);
        enableEmbedPresentMode = true;
        enableEmbedPresentMode = "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "enableEmbedPresentMode", "true"));
    }
}

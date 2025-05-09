package com.alipay.android.app.safepaylog.api;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogItem {
    public final ConcurrentLinkedQueue<TracerInfo> mTraceInfos = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<TemplateInfo> mTemplateInfos = new ConcurrentLinkedQueue<>();

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TemplateDownloadUsage {
        DownloadFromRenderAndRendered("T"),
        DownloadFromRenderButNotRendered(UTConstant.Args.UT_SUCCESS_F),
        DownloadFromExit("N"),
        Unset("");
        
        public final String logValue;

        TemplateDownloadUsage(String str) {
            this.logValue = str;
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TemplateInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TemplateUpdateSource f3493a;
        public TemplateDownloadUsage b;
        public String mNetType;
        public String mUpdateResult;
        public String mUpdateSource;
        public String mUpdateTime;
        public String mUpdateType;
        public String mWinName;

        public TemplateInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            TemplateUpdateSource templateUpdateSource = TemplateUpdateSource.Unset;
            this.f3493a = templateUpdateSource;
            TemplateDownloadUsage templateDownloadUsage = TemplateDownloadUsage.Unset;
            this.b = templateDownloadUsage;
            this.mWinName = str;
            this.mNetType = str2;
            this.mUpdateType = str3;
            this.mUpdateResult = str4;
            this.mUpdateTime = str5;
            this.mUpdateSource = str6;
            setUpdateSource(templateUpdateSource);
            setDownloadUsage(templateDownloadUsage);
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed431154", new Object[]{this});
                return;
            }
            this.mUpdateSource = this.f3493a.logValue + "|" + this.b.logValue;
        }

        public TemplateDownloadUsage getInnerDownloadUsage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateDownloadUsage) ipChange.ipc$dispatch("f0fa40f5", new Object[]{this});
            }
            return this.b;
        }

        public TemplateUpdateSource getInnerUpdateSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateUpdateSource) ipChange.ipc$dispatch("4e9e9859", new Object[]{this});
            }
            return this.f3493a;
        }

        public void setDownloadUsage(TemplateDownloadUsage templateDownloadUsage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a90e89c7", new Object[]{this, templateDownloadUsage});
                return;
            }
            this.b = templateDownloadUsage;
            a();
        }

        public void setUpdateSource(TemplateUpdateSource templateUpdateSource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("206a637b", new Object[]{this, templateUpdateSource});
                return;
            }
            this.f3493a = templateUpdateSource;
            a();
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TemplateUpdateScene {
        FromBoot("1"),
        CashierPreLoad("2"),
        MpassIDEL("3"),
        CashierExit("4"),
        Unset("");
        
        public final String logValue;

        TemplateUpdateScene(String str) {
            this.logValue = str;
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TemplateUpdateSource {
        CDN("C"),
        TMS("T"),
        CDNFailedThenTMS("CT"),
        Unset("");
        
        public final String logValue;

        TemplateUpdateSource(String str) {
            this.logValue = str;
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class TracerInfo {
        public String mCode;
        public String mMsg;
        public TracerType mTracerType;
        public String mType;

        public TracerInfo(TracerType tracerType, String str, String str2, String str3) {
            this.mTracerType = tracerType;
            this.mType = str;
            this.mCode = str2;
            this.mMsg = str3;
        }
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum TracerType {
        COUNT,
        EX,
        PERF
    }
}

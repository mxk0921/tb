package com.alipay.android.app.safepaylogv2.api;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TemplateInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LogItem.TemplateUpdateSource f3495a;
    public LogItem.TemplateDownloadUsage b;
    public LogItem.TemplateUpdateScene c = LogItem.TemplateUpdateScene.Unset;
    public String mNetType;
    public String mUpdateResult;
    public String mUpdateSource;
    public String mUpdateTime;
    public String mUpdateType;
    public String mWinName;

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

    public TemplateInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        LogItem.TemplateUpdateSource templateUpdateSource = LogItem.TemplateUpdateSource.Unset;
        this.f3495a = templateUpdateSource;
        LogItem.TemplateDownloadUsage templateDownloadUsage = LogItem.TemplateDownloadUsage.Unset;
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
        this.mUpdateSource = this.f3495a.logValue + "|" + this.b.logValue + this.c.logValue;
    }

    public LogItem.TemplateDownloadUsage getInnerDownloadUsage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogItem.TemplateDownloadUsage) ipChange.ipc$dispatch("f0fa40f5", new Object[]{this});
        }
        return this.b;
    }

    public LogItem.TemplateUpdateScene getInnerUpdateScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogItem.TemplateUpdateScene) ipChange.ipc$dispatch("d7dfd375", new Object[]{this});
        }
        return this.c;
    }

    public LogItem.TemplateUpdateSource getInnerUpdateSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogItem.TemplateUpdateSource) ipChange.ipc$dispatch("4e9e9859", new Object[]{this});
        }
        return this.f3495a;
    }

    public void setDownloadUsage(LogItem.TemplateDownloadUsage templateDownloadUsage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90e89c7", new Object[]{this, templateDownloadUsage});
            return;
        }
        this.b = templateDownloadUsage;
        a();
    }

    public void setUpdateScene(LogItem.TemplateUpdateScene templateUpdateScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571de33", new Object[]{this, templateUpdateScene});
            return;
        }
        this.c = templateUpdateScene;
        a();
    }

    public void setUpdateSource(LogItem.TemplateUpdateSource templateUpdateSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206a637b", new Object[]{this, templateUpdateSource});
            return;
        }
        this.f3495a = templateUpdateSource;
        a();
    }
}

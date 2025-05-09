package com.alipay.mobile.monitor.track.spm;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alipay.mobile.common.logging.api.LogDAUTracker;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SpmTrackIntegrator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String END_SEPARATOR_CHAR = "_";
    public static final String SEPARATOR_CHAR = "__";
    public static SpmTrackIntegrator e;
    public static final Handler f = new Handler(Looper.getMainLooper());
    public PageInfo c;
    public IAutoTrackIntegrator d;

    /* renamed from: a  reason: collision with root package name */
    public int f4269a = 621215851;
    public final Map<String, PageInfo> b = new ConcurrentHashMap();
    public String lastClickViewSpm = "";

    public static void a(PageInfo pageInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64432556", new Object[]{pageInfo, str});
        } else if (pageInfo == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "updateLastInfoSpm spm or lastInfo is null");
        } else {
            pageInfo.spm = str;
        }
    }

    public static /* synthetic */ Map access$000(SpmTrackIntegrator spmTrackIntegrator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59e5a45b", new Object[]{spmTrackIntegrator});
        }
        return spmTrackIntegrator.b;
    }

    public static /* synthetic */ IAutoTrackIntegrator access$100(SpmTrackIntegrator spmTrackIntegrator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAutoTrackIntegrator) ipChange.ipc$dispatch("ee511a06", new Object[]{spmTrackIntegrator});
        }
        return spmTrackIntegrator.d;
    }

    public static synchronized SpmTrackIntegrator getInstance() {
        synchronized (SpmTrackIntegrator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SpmTrackIntegrator) ipChange.ipc$dispatch("7ab0aeb3", new Object[0]);
            }
            if (e == null) {
                e = new SpmTrackIntegrator();
            }
            return e;
        }
    }

    public String getLastClickViewSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77f6b30a", new Object[]{this});
        }
        Log.e("SpmTrackIntegrator", "getLastClickViewSpm");
        return this.lastClickViewSpm;
    }

    public PageInfo getPageInfoByView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("35369208", new Object[]{this, obj});
        }
        if (obj == null) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "getPageInfoByView is null or spm is null");
            return null;
        }
        String viewKey = SpmUtils.getViewKey(obj);
        if (TextUtils.isEmpty(viewKey)) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "getPageInfoByView() is null");
            return null;
        }
        PageInfo pageInfo = (PageInfo) ((ConcurrentHashMap) this.b).get(viewKey);
        if (pageInfo != null) {
            return pageInfo;
        }
        LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "getPageInfoByView view is null");
        return null;
    }

    public PageInfo getPageMonitorCurrentPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("ac5776d2", new Object[]{this});
        }
        return this.c;
    }

    public boolean isWithAutoTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e921f64", new Object[]{this})).booleanValue();
        }
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public void pageOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914a0eef", new Object[]{this, obj});
            return;
        }
        final String viewKey = SpmUtils.getViewKey(obj);
        if (viewKey != null && ((PageInfo) ((ConcurrentHashMap) this.b).get(viewKey)) != null) {
            f.postDelayed(new Runnable() { // from class: com.alipay.mobile.monitor.track.spm.SpmTrackIntegrator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SpmTrackIntegrator.access$000(SpmTrackIntegrator.this).remove(viewKey);
                    if (SpmTrackIntegrator.access$100(SpmTrackIntegrator.this) != null) {
                        SpmTrackIntegrator.access$100(SpmTrackIntegrator.this).removePageInfo(viewKey);
                    }
                }
            }, 1000L);
        }
    }

    public void setAutoTrackIntegrator(IAutoTrackIntegrator iAutoTrackIntegrator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2c84cf", new Object[]{this, iAutoTrackIntegrator});
        } else {
            this.d = iAutoTrackIntegrator;
        }
    }

    public void setLastClickViewSpm(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5148d988", new Object[]{this, str, obj});
            return;
        }
        this.lastClickViewSpm = str;
        PageInfo pageInfo = this.c;
        if (pageInfo != null) {
            pageInfo.lastClickSpm = str;
        }
    }

    public void setTagId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a6829", new Object[]{this, new Integer(i)});
        } else {
            this.f4269a = i;
        }
    }

    public void tagViewEntityContentId(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7e2c3", new Object[]{this, view, str});
            return;
        }
        IAutoTrackIntegrator iAutoTrackIntegrator = this.d;
        if (iAutoTrackIntegrator != null) {
            iAutoTrackIntegrator.tagViewEntityContentId(view, str);
        }
    }

    public void tagViewSpm(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f185a144", new Object[]{this, view, str});
            return;
        }
        try {
            if (view == null) {
                LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "tagViewSpm..View is null");
            } else if (str == null) {
                LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "tagViewSpm..spm is null");
            } else {
                LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "tagViewSpm..spm = ".concat(str));
                view.setTag(this.f4269a, str);
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("SpmTrackIntegrator", th);
        }
    }

    public void logPageStartWithSpmId(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc84883", new Object[]{this, str, obj});
        } else if (obj == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "Start_view is null or spm is null");
        } else {
            final String viewKey = SpmUtils.getViewKey(obj);
            if (TextUtils.isEmpty(viewKey)) {
                LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "Start_view.toString() is null");
                return;
            }
            PageInfo pageInfo = (PageInfo) ((ConcurrentHashMap) this.b).get(viewKey);
            if (pageInfo == null || pageInfo.isEnd) {
                PageInfo pageInfo2 = (PageInfo) ((ConcurrentHashMap) this.b).get(viewKey);
                if (pageInfo2 == null) {
                    pageInfo2 = new PageInfo();
                }
                pageInfo2.isEnd = false;
                long currentTimeMillis = System.currentTimeMillis();
                pageInfo2.pageStartTime10 = currentTimeMillis;
                pageInfo2.pageStartTime64 = SpmUtils.c10to64(currentTimeMillis);
                pageInfo2.pageId = str + "__" + LoggerFactory.getLogContext().getDeviceId() + "__" + pageInfo2.pageStartTime64 + "_";
                PageInfo pageInfo3 = this.c;
                if (pageInfo3 != null) {
                    pageInfo2.referPageInfo = PageInfo.clonePageInfo(pageInfo3);
                }
                pageInfo2.spm = str;
                pageInfo2.miniPageId = str + "__" + pageInfo2.pageStartTime64 + "_";
                pageInfo2.referClickSpm = getLastClickViewSpm();
                ((ConcurrentHashMap) this.b).put(viewKey, pageInfo2);
                IAutoTrackIntegrator iAutoTrackIntegrator = this.d;
                if (iAutoTrackIntegrator != null) {
                    iAutoTrackIntegrator.addPageInfo(viewKey, pageInfo2);
                }
                this.c = pageInfo2;
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("SpmTrackIntegrator", "page start " + viewKey + " name = " + obj.getClass().getName() + " spm = " + str);
                try {
                    if (obj instanceof View) {
                        ((View) obj).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.alipay.mobile.monitor.track.spm.SpmTrackIntegrator.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                                }
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                                    return;
                                }
                                SpmTrackIntegrator.access$000(SpmTrackIntegrator.this).remove(viewKey);
                                if (SpmTrackIntegrator.access$100(SpmTrackIntegrator.this) != null) {
                                    SpmTrackIntegrator.access$100(SpmTrackIntegrator.this).removePageInfo(viewKey);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error("SpmTrackIntegrator", th);
                }
            } else {
                LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "Start_not call end,and start twice,update spm");
                a(pageInfo, str);
                IAutoTrackIntegrator iAutoTrackIntegrator2 = this.d;
                if (iAutoTrackIntegrator2 != null) {
                    iAutoTrackIntegrator2.updatePageInfo(viewKey, pageInfo);
                }
            }
        }
    }

    public PageInfo logPageEndWithSpmId(String str, Object obj, String str2, HashMap<String, String> hashMap) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("aff0615b", new Object[]{this, str, obj, str2, hashMap});
        }
        if (obj == null || TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "End_View is null or spm is null");
            return null;
        }
        String viewKey = SpmUtils.getViewKey(obj);
        if (TextUtils.isEmpty(viewKey)) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "End_view.toString() is null");
            return null;
        }
        PageInfo pageInfo = (PageInfo) ((ConcurrentHashMap) this.b).get(viewKey);
        if (pageInfo == null) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "End_pageInfo is null");
            return null;
        } else if (pageInfo.isEnd) {
            LoggerFactory.getTraceLogger().info("SpmTrackIntegrator", "is already call pageEnd");
            return pageInfo;
        } else {
            pageInfo.isEnd = true;
            Behavor behavor = new Behavor();
            if (LoggerFactory.getLogContext().getLogDAUTracker() != null && !(z = LoggerFactory.getLogContext().getLogDAUTracker().isUploadedToday(pageInfo.spm))) {
                behavor.setRenderBizType(str2);
                behavor.addExtParam("kDAUTag", "Y");
                str2 = LogDAUTracker.BIZ_TYPE;
            }
            behavor.setParam1(pageInfo.getRefer());
            long currentTimeMillis = System.currentTimeMillis() - pageInfo.pageStartTime10;
            pageInfo.pageStayTime = currentTimeMillis;
            behavor.setParam2(String.valueOf(currentTimeMillis));
            behavor.setParam3(pageInfo.pageStartTime64);
            behavor.setPageId(pageInfo.pageId);
            behavor.setBehaviourPro(str2);
            behavor.setSeedID(pageInfo.spm);
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    try {
                        behavor.addExtParam(entry.getKey(), entry.getValue());
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().error("SpmTrackIntegrator", th);
                    }
                }
            }
            LoggerFactory.getBehavorLogger().event("pageMonitor", behavor);
            if (LoggerFactory.getLogContext().getLogDAUTracker() != null && !z) {
                LoggerFactory.getLogContext().getLogDAUTracker().updateSpmUploadState(pageInfo.spm);
            }
            IAutoTrackIntegrator iAutoTrackIntegrator = this.d;
            if (iAutoTrackIntegrator != null) {
                iAutoTrackIntegrator.updatePageInfo(viewKey, pageInfo);
            }
            return pageInfo;
        }
    }
}
